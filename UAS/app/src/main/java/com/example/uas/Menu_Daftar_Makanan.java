package com.example.listviewmenu;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;


import com.example.uas.R;

import java.util.ArrayList;
import java.util.Locale;

public class Menu_Daftar_Makanan extends AppCompatActivity {

    ListView lvItem;
    EditText Editcari;
    com.example.listviewmenu.ListViewAdapterCall adapter;
    ArrayList<com.example.listviewmenu.ListViewAdapterMenu> arraylist = new ArrayList<com.example.listviewmenu.ListViewAdapterMenu>();

    int[] Gambar;
    String[] NamaPadang;
    String[] HargaPadang;
    String[] Deskripsi;


    @Override
    public void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.daftar_makanan);

        lvItem		= (ListView)findViewById(R.id.listView1);
        Editcari     = (EditText)findViewById(R.id.editText1);


        Gambar		= new int[]{
                R.mipmap.rendang,
                R.mipmap.dendeng_1,
                R.mipmap.rendang1,
                R.mipmap.sate,
                R.mipmap.soto};

        NamaPadang 	= new String[]{
                "Ayam Bakar",
                "Dendeng Balado",
                "Rendang",
                "Sate Padang",
                "Soto Padang"};

        HargaPadang 	= new String[]{
                "Rp. 25.000",
                "Rp. 22.000",
                "Rp. 30.000",
                "Rp. 20.000",
                "Rp. 25.000"};

        Deskripsi 	= new String[]{
                "Ayam Bakar adalah ayam Bakar yang dimasak menggunakan bumbu khusus dari padang ",

                "Dendeng Balado adalah masakan khas Sumatra Barat dibuat dari irisan tipis dan lebar daging sapi yang dikeringkan lalu digoreng kering. Daging goreng ini lalu diberi bumbu balado",

                "Rendang adalah masakan daging asli Indonesia yang berasal dari Minangkabau. Masakan ini dihasilkan dari proses memasak suhu rendah dalam waktu lama menggunakan aneka rempah-rempah dan santan",

                "Sate Padang memakai bahan daging sapi, lidah, atau jerohan dengan bumbu kuah kacang kental ditambah cabai yang banyak sehingga rasanya pedas.",

                "Soto Padang adalah hidangan berkuah kaldu sapi dengan bahan irisan daging sapi yang sudah digoreng kering, bihun, ditambah perkedel kentang dan dihidangkan panas-panas"};




        for (int i = 0; i < NamaPadang.length; i++)
        {
            com.example.listviewmenu.ListViewAdapterMenu wp = new com.example.listviewmenu.ListViewAdapterMenu(NamaPadang[i], HargaPadang[i], Deskripsi[i], Gambar[i] );
            arraylist.add(wp);
        }

        adapter = new com.example.listviewmenu.ListViewAdapterCall(this, arraylist);
        lvItem.setAdapter(adapter);

        Editcari.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable arg0) {
                String text = Editcari.getText().toString().toLowerCase(Locale.getDefault());
                adapter.filter(text);
                showToastMessage("Pencarian dilakukan");
            }

            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
                // TODO Auto-generated method stub
            }
            @Override
            public void onTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
                // TODO Auto-generated method stub
            }
        });

    }

    void showToastMessage(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
