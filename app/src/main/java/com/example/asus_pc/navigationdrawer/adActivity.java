package com.example.asus_pc.navigationdrawer;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class adActivity extends AppCompatActivity {

    SharedPreferences sp ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad);
        AdView bannerAd = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        bannerAd.loadAd(adRequest);

        Button saveBT = (Button) findViewById(R.id.button_activityAd_save);
        Button loadBT = (Button) findViewById(R.id.button_activityAd_load);
        final TextView tw = (TextView) findViewById(R.id.textView_activityAd_showData);
        final EditText et = (EditText) findViewById(R.id.editText);
        Button goBT =(Button) findViewById(R.id.button_adActivity_go);

        sp = getSharedPreferences("myData", Context.MODE_PRIVATE);

        saveBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                SharedPreferences.Editor edit = sp.edit();
                edit.putString("myValue",et.getText().toString());
                edit.apply();

            }
        });

        loadBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tw.setText(sp.getString("myValue","Data not Found"));
            }
        });

        goBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent adActivity_dataSent = new Intent(adActivity.this,dataSentActivity.class);
                startActivity(adActivity_dataSent);
            }
        });
    }
}
