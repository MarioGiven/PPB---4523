package com.example.listviewmenu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.uas.R;

public class Menu_Detail_Makanan extends Activity {
    String HargaPadang, NamaPadang, Deskripsi;
    int Gambar;
    int position;
    TextView tvHargaPadang, tvNamaPadang, tvDeskripsi;
    ImageView ImgGembar;

    @Override
    public void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        tvHargaPadang	    = (TextView)findViewById(R.id.textView1);
        tvNamaPadang		= (TextView)findViewById(R.id.textView2);
        tvDeskripsi		    = (TextView)findViewById(R.id.textView3);
        ImgGembar		    = (ImageView)findViewById(R.id.imageView1);

        Intent i 		= getIntent();
        position 		= i.getExtras().getInt("position");
        HargaPadang		= i.getStringExtra("HargaPadang");
        NamaPadang		= i.getStringExtra("NamaPadang");
        Deskripsi	 	= i.getStringExtra("Deskripsi");
        Gambar			= i.getIntExtra("Gambar");


        tvHargaPadang.setText(HargaPadang);
        tvNamaPadang.setText(NamaPadang);
        tvDeskripsi.setText(Deskripsi);
        ImgGembar.setImageResource(Gambar);


    }

}