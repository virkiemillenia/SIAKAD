package com.ivenavm.sistemakademik

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var mahasiswa : ImageView
    lateinit var dosen : ImageView
    lateinit var matakuliah : ImageView
    lateinit var nilai : ImageView
    lateinit var tentang : ImageView
    lateinit var alamat : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mahasiswa = findViewById(R.id.mahasiswa)
        dosen = findViewById(R.id.dosen)
        matakuliah = findViewById(R.id.matkul)
        nilai = findViewById(R.id.nilai)
        tentang = findViewById(R.id.tentang)
        alamat = findViewById(R.id.lokasi)

        mahasiswa.setOnClickListener {
            val pindah = Intent(this, MahasiswaActivity::class.java)
            startActivity(pindah)
        }
    }

}