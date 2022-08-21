package com.amath.knowyourlagos.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.amath.knowyourlagos.FoodInfo;
import com.amath.knowyourlagos.Modal.Food;
import com.amath.knowyourlagos.R;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodHolder> {

    Context context;
    ArrayList<Food> foodArrayList;



    public FoodAdapter(ArrayList<Food> foodArrayList, Context context) {
        this.foodArrayList = foodArrayList;
        this.context = context;
       // this.clickInterface = clickInterface;
    }


    @NonNull
    @Override
    public FoodHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.food_row,parent,false);

        return new FoodAdapter.FoodHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodHolder holder, int position) {

        holder.resName.setText(foodArrayList.get(position).getNameFood());
        holder.resLocation.setText(foodArrayList.get(position).getLocationFood());
        holder.resContact.setText(foodArrayList.get(position).getContactFood());
        // holder.img_animal.setImageResource(lagosData.get(position).getImage());
        Glide.with(holder.itemView.getContext()).load(foodArrayList.get(position).getImageFood()).into(holder.foodImg1);
        Glide.with(holder.itemView.getContext()).load(foodArrayList.get(position).getImageTwoFood()).into(holder.foodImg2);


        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent  = new Intent(context,FoodInfo.class);
                intent.putExtra("imageFood",foodArrayList.get(position).getImageFood());
                intent.putExtra("imageTwoFood",foodArrayList.get(position).getImageTwoFood());
                intent.putExtra("nameFood",foodArrayList.get(position).getNameFood());
                intent.putExtra("descriptionFood",foodArrayList.get(position).getDescriptionFood());
                intent.putExtra("locationFood",foodArrayList.get(position).getLocationFood());
                intent.putExtra("contactFood",foodArrayList.get(position).getContactFood());
                context.startActivity(intent);


            }
        });

    }

    @Override
    public int getItemCount() {
        return foodArrayList.size();
    }

    public class FoodHolder extends RecyclerView.ViewHolder{

        ImageView foodImg1,foodImg2;
        TextView resName,resLocation,resContact;
        LinearLayout parentLayout;

        public FoodHolder(@NonNull View itemView) {
            super(itemView);

            foodImg1 =  itemView.findViewById(R.id.foodImg1);
            foodImg2 =  itemView.findViewById(R.id.foodImg2);
            resName = itemView.findViewById(R.id.resName);
            resLocation = itemView.findViewById(R.id.resLocation);
            resContact = itemView.findViewById(R.id.resContact);
            parentLayout = itemView.findViewById(R.id.parentLayout);

   /**         itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clickInterface.onItemClicked(getAdapterPosition());
                }
            });
            **/

        }
    }
/**
    public interface ClickInterface{

        void onItemClicked(int positionOfTheFood);

    }   **/

}
