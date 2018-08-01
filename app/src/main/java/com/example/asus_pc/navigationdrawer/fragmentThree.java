package com.example.asus_pc.navigationdrawer;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class fragmentThree extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_three,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button adBT = (Button) getActivity().findViewById(R.id.button_fragThree_AdBut);
        adBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent frag_adPage = new Intent(getActivity(),adActivity.class);
                startActivity(frag_adPage);
            }
        });
    }
}
