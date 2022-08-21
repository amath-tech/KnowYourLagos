package com.amath.knowyourlagos.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.amath.knowyourlagos.Modal.Lagos;
import com.amath.knowyourlagos.R;

import java.util.ArrayList;

public class MyLagosAdapter extends RecyclerView.Adapter<MyLagosAdapter.LagosViewHolder>{

    ArrayList<Lagos> lagosData;
    Context context;
    MyClickInterface myClickInterface;

    public MyLagosAdapter(ArrayList<Lagos> lagosData, Context context,MyClickInterface myClickInterface) {
        this.lagosData = lagosData;
        this.context = context;
        this.myClickInterface = myClickInterface;
    }


    @NonNull
    @Override
    public LagosViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


       View view = LayoutInflater.from(context).inflate(R.layout.lagos_row,parent,false);

        return new LagosViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull LagosViewHolder holder, int position) {

        holder.textLagos.setText(lagosData.get(position).getName());
       // holder.img_animal.setImageResource(lagosData.get(position).getImage());
        Glide.with(holder.itemView.getContext()).load(lagosData.get(position).getImage()).into(holder.img_animal);
        holder.description.setText(lagosData.get(position).getDescription());


    }

    @Override
    public int getItemCount() {
        return lagosData.size();
    }

     class LagosViewHolder extends RecyclerView.ViewHolder{

        ImageView img_animal;
        TextView textLagos,description;

        public LagosViewHolder(@NonNull View itemView) {
            super(itemView);

            img_animal =  itemView.findViewById(R.id.img_animal);
            textLagos =  itemView.findViewById(R.id.textLagos);
            description = itemView.findViewById(R.id.descLagos);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    myClickInterface.onItemClick(getAdapterPosition());
                }
            });

        }
    }

    public interface MyClickInterface{

        void onItemClick(int positionOfTheAnimal);

    }

}
