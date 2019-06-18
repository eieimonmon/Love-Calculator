package com.example.user.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

private EditText edcrushname, edname;
private Button btncalculate;
private String crushName,name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculate);

        edcrushname=findViewById(R.id.edcrushname);
        edname=findViewById(R.id.edname);
        btncalculate.findViewById(R.id.btnCalculate);
        btncalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doCalculate();
            }
        });
    }
private boolean isCalculate(){
        boolean ok=true;
        this.crushName=edcrushname.getText().toString();
        this.name=edname.getText().toString();
        if(this.crushName.isEmpty()){
            ok=false;
            edcrushname.setError("Enter your crush name");
        }
        if(this.name.isEmpty()){
            ok=false;
            edname.setError("Enter your name");
        }
        return ok;
}
    private void doCalculate() {
        if (isCalculate()) {
            Intent intent = new Intent(this, ResultActivity.class);
            intent.putExtra("crush_name", this.crushName);
            intent.putExtra("name", this.name);
            startActivity(intent);
        }
    }
}
