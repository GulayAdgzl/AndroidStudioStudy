package com.example.customview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MeyveAdapter extends ArrayAdapter<String> {
    private String[] meyveler;
    private int[] kaloriler;
    private int[] resimler;
    private Context context;
    private TextView meyveIsmi,meyveKalori;
    private ImageView meyveResmi;

    public MeyveAdapter( String[] meyveler,int[] kaloriler,int[] resimler,Context context){
        super(context,R.layout.meyve_item,meyveler);
        this.meyveler=meyveler;
        this.kaloriler=kaloriler;
        this.resimler=resimler;
        this.context=context;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view= LayoutInflater.from (context).inflate (R.layout.meyve_item,null);

        if (view!=null){

            meyveIsmi=(TextView)view.findViewById (R.id.meyvelerView);
            meyveKalori=(TextView) view.findViewById (R.id.meyvekaloriView);
            meyveResmi=(ImageView) view.findViewById (R.id.meyve_item);

            meyveIsmi.setText (meyveler[position]);
            meyveKalori.setText (String.valueOf (kaloriler[position]));
            meyveResmi.setBackgroundResource (resimler[position]);
        }

        return view;
    }
}
