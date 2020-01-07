package com.example.navigationdraw.ui.daftarkata;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.navigationdraw.R;

import java.util.ArrayList;

public class AdapterDaftarKata extends RecyclerView.Adapter<AdapterDaftarKata.dataObjectHolder> {
    private Context context;
    private ArrayList<DataDaftarKata> listdata;

    public AdapterDaftarKata(Context context, ArrayList<DataDaftarKata> listdata) {
        this.context = context;
        this.listdata = listdata;
    }

    @NonNull
    @Override
    public dataObjectHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.parent,false);
        return new dataObjectHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final dataObjectHolder holder, int position) {
        holder.txt.setText(listdata.get(position).getKata());

        holder.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"Posisi "+
                        holder.getAdapterPosition(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }

    public class dataObjectHolder extends RecyclerView.ViewHolder{
        private ImageView img;
        private TextView txt;

        public dataObjectHolder(View itemView) {
            super(itemView);
            this.img=itemView.findViewById(R.id.imageView);
            this.txt=itemView.findViewById(R.id.tv_namaTempat);;

        }
    }
}
