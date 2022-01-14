package com.example.uas;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Database extends AppCompatActivity {

    EditText pembeli,makanan,harga;
    @Override
    protected void onCreate(Bundle savedInstanceState) public class Database extends AppCompatActivity {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_makanan);

        pembeli	    = (TextView)findViewById(R.id.textView1);
        makanan		= (TextView)findViewById(R.id.textView2);
        harga	    = (TextView)findViewById(R.id.textView3);
    }

    public void login8tn(View view) {
        String pembeli = pembeli.getText().toString();
        String makanan = makanan.getText().toString();
        String harga = harga.getText().toString();

        background bg = new background(this);
        bg.execute(pembeli,makanan,harga);
    }

}