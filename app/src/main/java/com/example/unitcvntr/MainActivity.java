package com.example.unitcvntr;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView1, textView2;
    private EditText editText;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        editText = findViewById(R.id.editText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//              Toast.makeText(MainActivity.this, "YES! Its worked", Toast.LENGTH_SHORT).show();
                String str = editText.getText().toString();
                double cm = Double.parseDouble(str);
                double inch = 0.393701*cm;
                textView2.setText(inch + " inches");
            }
        });
    }
}