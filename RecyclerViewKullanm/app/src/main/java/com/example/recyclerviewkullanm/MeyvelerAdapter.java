package com.example.recyclerviewkullanm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
 public class MeyvelerAdapter extends RecyclerView.Adapter<MeyvelerAdapter.MeyvelerHolder> {

    private ArrayList<Meyveler> meyvelerList;
    private Context context;
    private OnItemClickListener listener;

    public MeyvelerAdapter(ArrayList<Meyveler> meyvelerList, Context context) {
        this.meyvelerList = meyvelerList;
        this.context = context;
    }

    @NonNull
    @Override
    public MeyvelerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from (context).inflate (R.layout.meyveler_item,parent,false);

        return new MeyvelerHolder (v);



    }

    @Override
    public void onBindViewHolder(@NonNull MeyvelerHolder holder, int position) {

        Meyveler meyveler=meyvelerList.get (position);
        holder.setData (meyveler);
    }

    @Override
    public int getItemCount() {
        return meyvelerList.size ();
    }

    class MeyvelerHolder extends  RecyclerView.ViewHolder{
        TextView meyveIsmi,meyveKalori;
        ImageView meyveResmi;

        public MeyvelerHolder(@NonNull View itemView) {
            super (itemView);
            meyveIsmi=(TextView)itemView.findViewById (R.id.meyveİsmi);
            meyveKalori=(TextView)itemView.findViewById (R.id.meyveKalori);
            meyveResmi=(ImageView)itemView.findViewById (R.id.meyveImage);

            itemView.setOnClickListener (new View.OnClickListener () {
                @Override
                public void onClick(View v) {
                    int position=getAdapterPosition ();

                    if (listener!=null && position !=RecyclerView.NO_POSITION ){
                        listener.onItemClick (meyvelerList.get (position),position);
                    }
                }
            });
        }


        public  void setData(Meyveler meyveler){
            this.meyveIsmi.setText (meyveler.getMeyveIsmi ());
            this.meyveKalori.setText (String.valueOf(meyveler.getMeyvekalori ()));
            this.meyveResmi.setBackgroundResource(meyveler.getMeyveResmi ());
        }

    }
    public  interface  OnItemClickListener{
        void onItemClick(Meyveler meyveler,int position);
    }
    public  void setOnClickListener(OnItemClickListener listener){
        this.listener=listener;

    }
}
