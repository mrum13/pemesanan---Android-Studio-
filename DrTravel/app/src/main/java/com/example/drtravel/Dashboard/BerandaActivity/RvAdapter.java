package com.example.drtravel.Dashboard.BerandaActivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.drtravel.R;

import java.util.ArrayList;

public class RvAdapter extends RecyclerView.Adapter<RvAdapter.DataObjectHolder> {
    private Context context;
    private ArrayList<DataWisata> listData;

    public RvAdapter(Context context, ArrayList<DataWisata> listData) {
        this.context = context;
        this.listData = listData;
    }

    @Override
    public DataObjectHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_wisata,parent,false);
        DataObjectHolder DOH = new DataObjectHolder(view);
        return DOH;
    }

    @Override
    public void onBindViewHolder(final DataObjectHolder holder, int position) {
        holder.txt.setText(listData.get(position).getNo());

        Glide.with(context).load(listData.get(position).getImg()).into(holder.img);

//        holder.img.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(v.getContext(),"Posisi "+holder.getAdapterPosition(),Toast.LENGTH_SHORT).show();
//            }
//        })
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public class DataObjectHolder extends RecyclerView.ViewHolder{
        private ImageView img;
        private TextView txt;

        public DataObjectHolder(View itemView) {
            super(itemView);
            this.img=itemView.findViewById(R.id.gambar_wisata);
            this.txt=itemView.findViewById(R.id.tv_namaTempat);;

        }
    }
}
