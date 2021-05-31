package com.example.mydemoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ZeroPositiveNegativeActivity extends AppCompatActivity {

    EditText num;
    Button check;
    TextView ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zero_positive_negative);

        num = (EditText)findViewById(R.id.num);
        check = (Button)findViewById(R.id.check);
        ans = (TextView)findViewById(R.id.ans);

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n = Integer.parseInt(num.getText().toString());

                if(n==0){
                    ans.setText("zero");
                    Toast.makeText(ZeroPositiveNegativeActivity.this, n+" is zero", Toast.LENGTH_SHORT).show();
                }
                else if(n>0){
                    ans.setText("+ve");
                    Toast.makeText(ZeroPositiveNegativeActivity.this, n+" is +ve", Toast.LENGTH_SHORT).show();
                }
                else{
                    ans.setText("-ve");
                    Toast.makeText(ZeroPositiveNegativeActivity.this, n+" is -ve", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}