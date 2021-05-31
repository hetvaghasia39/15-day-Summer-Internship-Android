package com.example.mydemoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ArithmeticActivity extends AppCompatActivity {

    EditText num1,num2;
    Button sum,dif,mul,div;
    TextView ans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arithmetic);

        num1 = (EditText)findViewById(R.id.num1);
        num2 = (EditText)findViewById(R.id.num2);

        sum = (Button)findViewById(R.id.sum);
        dif = (Button)findViewById(R.id.dif);
        mul = (Button)findViewById(R.id.mul);
        div = (Button)findViewById(R.id.div);

        ans = (TextView)findViewById(R.id.ans);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a = Float.parseFloat(num1.getText().toString());
                float b = Float.parseFloat(num2.getText().toString());

                float c = a+b;
                ans.setText(Float.toString(c));

                Toast.makeText(ArithmeticActivity.this, "sum is "+c, Toast.LENGTH_SHORT).show();
            }
        });

        dif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a = Float.parseFloat(num1.getText().toString());
                float b = Float.parseFloat(num2.getText().toString());

                float c = a-b;
                ans.setText(Float.toString(c));
                Toast.makeText(ArithmeticActivity.this, "diffrence is "+c, Toast.LENGTH_SHORT).show();

            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a = Float.parseFloat(num1.getText().toString());
                float b = Float.parseFloat(num2.getText().toString());

                float c = a*b;
                ans.setText(Float.toString(c));
                Toast.makeText(ArithmeticActivity.this, "product is "+c, Toast.LENGTH_SHORT).show();
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a = Float.parseFloat(num1.getText().toString());
                float b = Float.parseFloat(num2.getText().toString());

                float c = a/b;
                ans.setText(Float.toString(c));
                Toast.makeText(ArithmeticActivity.this, "division is "+c, Toast.LENGTH_SHORT).show();
            }
        });
    }
}