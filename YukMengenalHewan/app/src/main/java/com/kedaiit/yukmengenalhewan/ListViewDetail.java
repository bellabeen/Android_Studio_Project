package com.kedaiit.yukmengenalhewan;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListViewDetail extends AppCompatActivity {
    ImageView img_photo;
    TextView tv_remarks, tv_name;
    TextView tv_detail, tv_kingdom, tv_filum, tv_kelas, tv_ordo, tv_famili;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //get inten dari kajian activity
        final String dtNama = getIntent().getExtras().getString("iNama");
        final String dtRemarks = getIntent().getExtras().getString("iRemarks");
        final String dtFoto = getIntent().getExtras().getString("iFoto");
        final String dtDetail = getIntent().getExtras().getString("iDetail");
        final String dtKingdom = getIntent().getExtras().getString("iKingdom");
        final String dtFilum = getIntent().getExtras().getString("iFilum");
        final String dtKelas = getIntent().getExtras().getString("iKelas");
        final String dtOrdo = getIntent().getExtras().getString("iOrdo");
        final String dtFamili = getIntent().getExtras().getString("iFamili");

        //id
        img_photo = findViewById(R.id.img_item_photo);
        tv_name = findViewById(R.id.tv_item_name);
        tv_remarks = findViewById(R.id.tv_item_remarks);
        tv_detail = findViewById(R.id.tv_item_detail);
        tv_kingdom = findViewById(R.id.tv_item_kingdom);
        tv_filum = findViewById(R.id.tv_item_filum);
        tv_kelas = findViewById(R.id.tv_item_kelas);
        tv_ordo = findViewById(R.id.tv_item_ordo);
        tv_famili = findViewById(R.id.tv_item_famili);

        //setText
        tv_name.setText(dtNama);
        tv_remarks.setText(dtRemarks);
        tv_detail.setText(dtDetail);
        tv_kingdom.setText(dtKingdom);
        tv_filum.setText(dtFilum);
        tv_kelas.setText(dtKelas);
        tv_ordo.setText(dtOrdo);
        tv_famili.setText(dtFamili);
        //ini load gambar

        Glide.with(this)
                .load(dtFoto)
//                .apply(new RequestOptions().override(100, 100))
                .into(img_photo);

    }
}
