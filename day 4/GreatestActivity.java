package com.example.mydemoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class GreatestActivity extends AppCompatActivity {

    EditText num1,num2;
    Button check;
    TextView ans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greatest);

        num1 = (EditText)findViewById(R.id.num1);
        num2 = (EditText)findViewById(R.id.num2);

        check = (Button)findViewById(R.id.check);

        ans = (TextView)findViewById(R.id.ans);

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(num1.getText().toString());
                int b = Integer.parseInt((num2.getText().toString()));

                if(a<b){
                    String g = Integer.toString(b);
                    ans.setText(g+" is greater");
                    Toast.makeText(GreatestActivity.this, g+" is greater", Toast.LENGTH_SHORT).show();
                }
                else if(a==b){
                    ans.setText("both are equal");
                    Toast.makeText(GreatestActivity.this, " both are equal", Toast.LENGTH_SHORT).show();
                }
                else{
                    String g = Integer.toString(a);
                    ans.setText(g+" is greater");
                    Toast.makeText(GreatestActivity.this, g+" is greater", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}