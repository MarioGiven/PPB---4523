package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Listview extends AppCompatActivity {
    Listview listview;
    public String bhs_prog[]={"Prolog","Python","C++","C+","Java","Perl","PHP","html","CSS",};

    Spinner combo;
    private Object setAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        listview=(Listview) findViewById(R.id.listdata);
        combo=(Spinner) findViewById(R.id.combodata);

        ArrayAdapter adapter=new ArrayAdapter(Listview.this,R.layout.support_simple_spinner_dropdown_item,bhs_prog);
        listview.setAdapter(adapter);
        combo.setAdapter(adapter);
    }
}