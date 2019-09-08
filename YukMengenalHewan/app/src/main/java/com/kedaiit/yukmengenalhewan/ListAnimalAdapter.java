package com.kedaiit.yukmengenalhewan;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListAnimalAdapter extends RecyclerView.Adapter<ListAnimalAdapter.CategoryViewHolder> {
    public ListAnimalAdapter(Context context) {
        this.context = context;
    }

    private Context context;

    public ArrayList<Animal> getListAnimal() {
        return listAnimal;
    }

    public void setListAnimal(ArrayList<Animal> listAnimal) {
        this.listAnimal = listAnimal;
    }

    private ArrayList<Animal> listAnimal;

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_animal, viewGroup, false);
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder categoryViewHolder, int position) {
        final String nama = getListAnimal().get(position).getName();
        final String remarks = getListAnimal().get(position).getRemarks();
        final String foto = getListAnimal().get(position).getPhoto();
        final String detail = getListAnimal().get(position).getDetail();
        final String kingdom = getListAnimal().get(position).getKingdom();
        final String filum = getListAnimal().get(position).getFilum();
        final String kelas = getListAnimal().get(position).getKelas();
        final String ordo = getListAnimal().get(position).getOrdo();
        final String famili = getListAnimal().get(position).getFamili();
        categoryViewHolder.tvName.setText(nama);
        categoryViewHolder.tvRemarks.setText(remarks);
        Glide.with(context)
                .load(foto)
                .apply(new RequestOptions().override(55, 55))
                .into(categoryViewHolder.imgPhoto);

        categoryViewHolder.relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ListViewDetail.class);
                intent.putExtra("iNama", nama);
                intent.putExtra("iRemarks", remarks);
                intent.putExtra("iFoto", foto);
                intent.putExtra("iDetail", detail);
                intent.putExtra("iKingdom", kingdom);
                intent.putExtra("iKelas", kelas);
                intent.putExtra("iFilum", filum);
                intent.putExtra("iOrdo", ordo);
                intent.putExtra("iFamili", famili);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return getListAnimal().size();
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {
        RelativeLayout relative;
        TextView tvName;
        TextView tvRemarks;
        ImageView imgPhoto;
        TextView tvDetail, tvKingdom, tvFilum, tvKelas, tvOrdo, tvFamili;
        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            relative = itemView.findViewById(R.id.relative);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvRemarks = itemView.findViewById(R.id.tv_item_remarks);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
            tvKingdom = itemView.findViewById(R.id.tv_item_kingdom);
            tvFilum = itemView.findViewById(R.id.tv_item_filum);
            tvKelas = itemView.findViewById(R.id.tv_item_kelas);
            tvOrdo = itemView.findViewById(R.id.tv_item_ordo);
            tvFamili = itemView.findViewById(R.id.tv_item_famili);
        }
    }
}
