package com.ramadhan.drugstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

public class DetailActivity extends AppCompatActivity {
    private ImageView ivFoto;
    private TextView tvNama, tvTentang;
    private String xNama, xTentang, xFoto, xKordinat;
    private Button btnLokasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ivFoto = findViewById(R.id.iv_foto);
        tvNama = findViewById(R.id.tv_nama);
        tvTentang = findViewById(R.id.tv_tentang);
        btnLokasi = findViewById(R.id.btn_lokasi);

        Intent terima = getIntent();
        xNama = terima.getStringExtra("xNama");
        xTentang = terima.getStringExtra("xTentang");
        xFoto = terima.getStringExtra("xFoto");
        xKordinat = terima.getStringExtra("xKordinat");

        btnLokasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri urilokasi = Uri.parse("geo:0,0?q=" + xKordinat);
                Intent lokasi = new Intent(Intent.ACTION_VIEW, urilokasi);
                startActivity(lokasi);
            }
        });

        tvNama.setText(xNama);
        tvTentang.setText(xTentang);
        Glide
                .with(DetailActivity.this)
                .load(xFoto)
                .into(ivFoto);
    }
}