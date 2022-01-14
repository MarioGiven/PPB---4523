package com.example.listviewmenu;

public class ListViewAdapterMenu {
    private String NamaPadang, HargaPadang, Deskripsi;
    private int Gambar;

    public ListViewAdapterMenu(String NamaPadang, String HargaPadang, String Deskripsi, int Gambar) {
        this.NamaPadang = NamaPadang;
        this.HargaPadang = HargaPadang;
        this.Deskripsi = Deskripsi;
        this.Gambar = Gambar;
    }

    public String getNamaPadang() {
        return this.NamaPadang;
    }

    public String getHargaPadang() {
        return this.HargaPadang;
    }

    public String getDeskripsi() {
        return this.Deskripsi;
    }

    public int getGambar() {
        return this.Gambar;
    }
}
