package com.example.asus_pc.navigationdrawer;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class fragmentTwo extends Fragment {

    TextView countDownTW ;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_two,container,false);

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        countDownTW = (TextView) getActivity().findViewById(R.id.TextView_fragTwo_countDown);
        timer();
        final Button cardV = (Button) getActivity().findViewById(R.id.button_fragTwo_cardView);
        cardV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fragTwo_cardView =new Intent(getActivity(),cardViewActivity.class);
                startActivity(fragTwo_cardView);
            }
        });
    }
    public void timer(){
        new CountDownTimer(5000, 1000) {
            @Override
            public void onTick(long l) {
                countDownTW.setText("Timer is :"+l/1000+"S");
            }

            @Override
            public void onFinish() {
                countDownTW.setText("Times UP");
            }
        }.start();
    }
}
