package com.example.tampillistview;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class TampilListview extends AppCompatActivity {
    BantuDatabase bd;
    ListView listView;
    EditText editText;
    Button tblTambah;

    ArrayAdapter adapter;
    ArrayList<String> listviewku;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.Tampillistview);

        listView=findViewById(R.id.listdatabuah);
        editText=findViewById(R.id.databuah);
        tblTambah+findViewById(R.id.tbltambah);
        listviewku=new ArrayList<>();
        tampilkan_buah();
        tblTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bd.tambahData(editText.getText().toString());
                Toast.makeText(TampilListview.this, "Data Tersimpan", Toast.LENGTH_SHORT).show();

            }
        });
    }

    private void tampilkan_buah() {
        Cursor cursor=bd.tampilbuah();
        if (cursor.getCount()==0)
        {
            Toast.makeText(this, "Record Kosong Bro !", Toast.LENGTH_SHORT).show();
        }else {
            while (cursor.moveToNext())
            {
                listviewku.add(String.valueOf(cursor.getInt(0))+" "+cursor.getString(1));

            }
            adapter=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,listviewku);
            listView.setAdapter(adapter);
        }
    }
}