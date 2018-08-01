package com.example.asus_pc.navigationdrawer;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class dataSentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_sent);
        TextView tw = (TextView) findViewById(R.id.textView_dataSent_viewData);

        SharedPreferences inPre = getSharedPreferences("myData", Context.MODE_PRIVATE);
        tw.setText(inPre.getString("myValue","Data not found"));

        Button loginBT =(Button) findViewById(R.id.button_dataSentActivity_login);
        final EditText emailET =(EditText) findViewById(R.id.editText_activityData_email);
        final EditText passET =(EditText) findViewById(R.id.editText_activityData_password);

        loginBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                logTest(emailET.getText().toString(),passET.getText().toString());
            }
        });

    }
    private void logTest(String email, String passward){
        if(email.equals("admin@gmail.com") && passward.equals("admin")){
            Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Login Unsuccessful", Toast.LENGTH_SHORT).show();
        }

    }
}
