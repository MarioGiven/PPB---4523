package com.example.tampillistview;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class BantuDatabase extends SQLiteOpenHelper {


    private static final String DATABASE_BUAH = "db_buah";
    private static final String TABEL_BUAH = "tabel_buah";
    private static final String KODE = "kode";
    private static final String NAMA_BUAH = "nm_buah";

    public BantuDatabase(@Nullable Context context) {
        super(context, DATABASE_BUAH, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String nama_tabel="create table"+TABEL_BUAH+ "(" + KODE + " integer primary key autoincrement," + NAMA_BUAH + " text)"
        db.execSQL(nama_tabel);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }

    public boolean tambahData(String namabuah)
    {
        SQLiteDatabase db=this.getReadableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(NAMA_BUAH,namabuah);

        long hasil=db.insert(TABEL_BUAH,null,contentValues);
        return hasil != -1;
    }

    public Cursor tampilbuah()
    {
        SQLiteDatabase db=this.getReadableDatabase();
        String sql="select = from "+TABEL_BUAH;
        Cursor cursor=db.rawQuery(sql,null);
        return cursor;
    }

}
