package com.example.kemuniggroup.Home;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.kemuniggroup.R;

public class DetailActivity extends AppCompatActivity {

    ImageView imageViewFotoData2;
    TextView textViewNamaData2;
    TextView textViewInfoData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imageViewFotoData2 = findViewById(R.id.imageViewFotoData2);
        textViewNamaData2 = findViewById(R.id.textViewNamaData2);
        textViewInfoData = findViewById(R.id.textViewInfoData);

        getInComingExtra();

    }

    private  void getInComingExtra(){

        if(getIntent().hasExtra("foto_data") && getIntent().hasExtra("nama_data") && getIntent().hasExtra("info_data")){
            String fotodata = getIntent().getStringExtra("foto_data");
            String namadata = getIntent().getStringExtra("nama_data");
            String infodata = getIntent().getStringExtra("info_data");

            setDataActivity(fotodata,namadata,infodata);
        }
    }

    private void setDataActivity(String fotodata,String namadata,String infodata){

        Glide.with(this).asBitmap().load(fotodata).into(imageViewFotoData2);

        textViewNamaData2.setText(namadata);
        textViewInfoData.setText(infodata);

    }
}