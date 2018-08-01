package com.example.asus_pc.navigationdrawer;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class fragmentOne extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_one,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final Button showToast = (Button) getActivity().findViewById(R.id.button_fragOne_toast);
        final Button chageBG = (Button) getActivity().findViewById(R.id.button_fragOne_background);
        final RelativeLayout rl = (RelativeLayout) getActivity().findViewById(R.id.layout_fragOne);

        Button mediaBT = (Button) getActivity().findViewById(R.id.button_fragOne_mediaPlayer);

        mediaBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fragOne_media = new Intent(getActivity(),mediaPlayerActivity.class);
                startActivity(fragOne_media);
            }
        });

        showToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "You clicked the button", Toast.LENGTH_SHORT).show();
            }
        });
        chageBG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rl.setBackgroundColor(Color.RED);
                chageBG.setTextColor(Color.WHITE);
                showToast.setTextColor(Color.WHITE);
            }
        });
    }
}
