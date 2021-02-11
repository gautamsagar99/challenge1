package com.example.challenge1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void afterClick(View view)
    {
        EditText text1,text2,text3;
        TextView o1,o2,o3;
        text1 = findViewById(R.id.textBox1);
        text2 = findViewById(R.id.textBox2);
        text3 = findViewById(R.id.textBox3);


        o1 = findViewById(R.id.textView1);
        o2 = findViewById(R.id.textView2);
        o3 = findViewById(R.id.textView3);

        o1.setText(text1.getText().toString());
        o2.setText(text2.getText().toString());
        o3.setText(text3.getText().toString());

    }
}