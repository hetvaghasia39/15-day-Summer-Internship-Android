package com.example.mydemoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SquareActivity extends AppCompatActivity {

    EditText num;
    Button sq;
    TextView ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square);

        num = (EditText)findViewById(R.id.num);

        sq = (Button)findViewById(R.id.sq);

        ans = (TextView)findViewById(R.id.ans);

        sq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float n = (Float.parseFloat(num.getText().toString()));
                float sqr;
                if(n<=10) {
                    sqr = n * n;
                    ans.setText(Float.toString(sqr));
                    Toast.makeText(SquareActivity.this, "Square is " + sqr, Toast.LENGTH_LONG).show();
                }
                else{
                    ans.setText("Number is greater than 10");
                    Toast.makeText(SquareActivity.this, "number is greater than 10", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}