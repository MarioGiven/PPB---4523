package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText angka1,angka2;
    TextView hasile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        angka1=(EditText) findViewById(R.id.angka1);
        angka2=(EditText) findViewById(R.id.angka2);
        hasile=(EditText) findViewById(R.id.hitung1);

    }

    public void hitung(View view)
    {
        int a1=Integer.parseInt(angka1.getText().toString());
        int a2=Integer.parseInt(angka2.getText().toString());
        Integer hasil=a1+a2;
        hasile.setText(hasil.toString());
    }
}