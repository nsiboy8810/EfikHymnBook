package com.example.nyongnsikak.efikhymnbook;

public class HymnItem {
    String title, hymn;
    int image;
    public HymnItem(String title, String hymn, int image){
        this.title = title;
        this.hymn = hymn;
        this.image = image;
    }
    public int getImage(){
        return image;
    }

    public String getHymn() {
        return hymn;
    }

    public String getTitle() {
        return title;
    }

    public void setHymn(String hymn) {
        this.hymn = hymn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
