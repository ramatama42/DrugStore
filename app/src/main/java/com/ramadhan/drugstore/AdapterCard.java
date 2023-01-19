package com.ramadhan.drugstore;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class AdapterCard extends RecyclerView.Adapter<AdapterCard.CardViewHolder> {
    private ArrayList<ModelApotik> dataApotik;

    public AdapterCard(ArrayList<ModelApotik> dataApotik) {this.dataApotik = dataApotik; }


    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card, parent, false);

        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {

        ModelApotik lokasi = dataApotik.get(position);

        Glide.with(holder.itemView.getContext()).load(lokasi.getFoto()).apply(new RequestOptions().override(350, 550)).into(holder.iv_foto);
        holder.tv_nama.setText(lokasi.getNama());
        holder.tv_tentang.setText(lokasi.getTentang());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = dataApotik.get(holder.getAdapterPosition()).getNama();
                String tentang = dataApotik.get(holder.getAdapterPosition()).getTentang();
                String foto = dataApotik.get(holder.getAdapterPosition()).getFoto();
                String kordinat = dataApotik.get(holder.getAdapterPosition()).getKordinat();



                Intent intent = new Intent(holder.itemView.getContext(), DetailActivity.class);
                intent.putExtra("xNama", nama);
                intent.putExtra("xTentang", tentang);
                intent.putExtra("xFoto", foto);
                intent.putExtra("xKordinat",kordinat);

                holder.itemView.getContext().startActivity(intent);



            }
        });



    }


    @Override
    public int getItemCount() {
        return dataApotik.size();
    }




    public class CardViewHolder extends RecyclerView.ViewHolder{
        ImageView iv_foto;
        TextView tv_nama, tv_tentang;



        public CardViewHolder(@NonNull View itemView){
            super(itemView);
            iv_foto = itemView.findViewById(R.id.iv_foto);
            tv_nama = itemView.findViewById(R.id.tv_nama);
            tv_tentang = itemView.findViewById(R.id.tv_tentang);

         }
    }

}
