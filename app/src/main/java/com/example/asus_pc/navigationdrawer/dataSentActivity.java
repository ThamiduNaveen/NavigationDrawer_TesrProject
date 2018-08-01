package com.example.asus_pc.navigationdrawer;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class dataSentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_sent);
        TextView tw = (TextView) findViewById(R.id.textView_dataSent_viewData);

        SharedPreferences inPre = getSharedPreferences("myData", Context.MODE_PRIVATE);
        tw.setText(inPre.getString("myValue","Data not found"));
    }
}
