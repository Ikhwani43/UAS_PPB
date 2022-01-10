package com.example.kemuniggroup.Home;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.kemuniggroup.R;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.viewHolder>{

    private ArrayList<String> fotoData = new ArrayList<>();
    private ArrayList<String> namaData = new ArrayList<>();
    private ArrayList<String> infoData = new ArrayList<>();
    private Context context;

    public RecyclerViewAdapter(ArrayList<String> fotoData, ArrayList<String> namaData,ArrayList<String> infoData,Context context) {
        this.fotoData = fotoData;
        this.namaData = namaData;
        this.infoData = infoData;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.desain_layout_adapter,viewGroup,false);

        return new viewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder viewHolder, int i) {

        Glide.with(context).asBitmap().load(fotoData.get(i)).into(viewHolder.imageViewFotoData);
        viewHolder.textViewNamaData.setText(namaData.get(i));

        viewHolder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(context,namaData.get(i), Toast.LENGTH_LONG).show();

                Intent intent = new Intent(context,DetailActivity.class);

                intent.putExtra("foto_data", fotoData.get(i));
                intent.putExtra("nama_data", namaData.get(i));
                intent.putExtra("info_data", infoData.get(i));

                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return namaData.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{

        ImageView imageViewFotoData;
        TextView textViewNamaData;
        ConstraintLayout constraintLayout;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewFotoData = itemView.findViewById(R.id.imageViewFotoData);
            textViewNamaData = itemView.findViewById(R.id.textViewNamaData);
            constraintLayout = itemView.findViewById(R.id.contraintLayout);
        }
    }

}
