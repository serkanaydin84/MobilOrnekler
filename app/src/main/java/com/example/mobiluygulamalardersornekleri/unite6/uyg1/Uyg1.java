package com.example.mobiluygulamalardersornekleri.unite6.uyg1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mobiluygulamalardersornekleri.R;

import java.util.ArrayList;

public class Uyg1 extends AppCompatActivity {

    ImageView imageViewGorsel;
    Button btnGeri, btnIleri;
    TextView textViewBilgi;

    ArrayList<Gorsel> gorselArrayList;
    int seciliSiraNo;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u6_uyg1);

        tanimlamalar();

        gorselArrayList = new ArrayList<>();

        Gorsel balon = new Gorsel("Balonlar", 1, R.drawable.balon);
        Gorsel cicek = new Gorsel("Çiçekler", 2, R.drawable.cicek);
        Gorsel kelebek = new Gorsel("Mavi Kelebek", 3, R.drawable.kelebek);
        Gorsel kus = new Gorsel("Muhabbet Kuşu", 4, R.drawable.kus);

        gorselArrayList.add(balon);
        gorselArrayList.add(cicek);
        gorselArrayList.add(kelebek);
        gorselArrayList.add(kus);

        imageViewGorsel.setImageResource(gorselArrayList.get(0).foto);
        textViewBilgi.setText("Bilgi : " + gorselArrayList.get(0).bilgi);
        seciliSiraNo = 0;
    }

    public void geriGelme() {
        if (seciliSiraNo > 0) {
            seciliSiraNo--;
            imageViewGorsel.setImageResource(gorselArrayList.get(seciliSiraNo).foto);
            textViewBilgi.setText("Bilgi : " + gorselArrayList.get(seciliSiraNo).bilgi);
        }
    }

    public void ileriGitme() {
        if (seciliSiraNo < gorselArrayList.size() - 1) {
            seciliSiraNo++;
            imageViewGorsel.setImageResource(gorselArrayList.get(seciliSiraNo).foto);
            textViewBilgi.setText("Bilgi : " + gorselArrayList.get(seciliSiraNo).bilgi);
        }
    }

    // u6_uyg1.xml deki componentlerin tanımlamaları yapıldı
    private void tanimlamalar() {
        imageViewGorsel = findViewById(R.id.imageViewGorsel);
        btnGeri = findViewById(R.id.btnGeri);
        btnIleri = findViewById(R.id.btnIleri);
        textViewBilgi = findViewById(R.id.textViewBilgi);
    }
}
