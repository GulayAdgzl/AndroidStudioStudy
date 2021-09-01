package com.example.recyclerviewkullanm;

import java.util.ArrayList;

public class Meyveler  {

    private String meyveIsmi;
    private int meyvekalori,meyveResmi;

    public Meyveler(){ }

    public Meyveler(String meyveIsmi, int meyvekalori, int meyveResmi) {
        this.meyveIsmi = meyveIsmi;
        this.meyvekalori = meyvekalori;
        this.meyveResmi = meyveResmi;
    }

    public String getMeyveIsmi() {
        return meyveIsmi;
    }

    public void setMeyveIsmi(String meyveIsmi) {
        this.meyveIsmi = meyveIsmi;
    }

    public int getMeyvekalori() {
        return meyvekalori;
    }

    public void setMeyvekalori(int meyvekalori) {
        this.meyvekalori = meyvekalori;
    }

    public int getMeyveResmi() {
        return meyveResmi;
    }

    public void setMeyveResmi(int meyveResmi) {
        this.meyveResmi = meyveResmi;
    }


    static  public ArrayList<Meyveler> getData(){
        ArrayList<Meyveler> meyvelerList=new ArrayList<Meyveler> ();
        String[] meyveler={"Muz","Kiraz","çilek"};
        int[] kaloriler={15,5,25};
        int [] resimler={R.drawable.muz,R.drawable.kiraz,R.drawable.cilek};

        for (int i=0; i<meyveler.length;i++){
            Meyveler meyve=new Meyveler ();
            meyve.setMeyveIsmi (meyveler[i]);
            meyve.setMeyvekalori (kaloriler[i]);
            meyve.setMeyveResmi (resimler[i]);

            meyvelerList.add (meyve);
        }
        return meyvelerList;


    }
}
