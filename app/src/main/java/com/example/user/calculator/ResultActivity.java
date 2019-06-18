package com.example.user.calculator;

import android.Manifest;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    private static final int LOADING_TIME=3000;
    private TextView txtcurshname,txtname,txtpercent;
    private Button btnagain;
    private String crushName,name;
    @Override
    public void setContentView(View view) {
        super.setContentView(view);
        setContentView(R.layout.calculator_login);

        txtcurshname=findViewById(R.id.txtcrushname);
        txtname=findViewById(R.id.txtname);
        txtpercent=findViewById(R.id.txtpercent);
        btnagain=findViewById(R.id.btnagain);

        txtcurshname.setText(crushName);
        txtname.setText(name);

        this.calculatePercent();

        btnagain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    private void calculatePercent() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                int random= (int)(Math.random()*50+1);
                txtpercent.setText(String.format("%d%%", random));
                txtpercent.setVisibility(View.VISIBLE);
                btnagain.setVisibility(View.VISIBLE);
            }
        },LOADING_TIME);
    }
}
