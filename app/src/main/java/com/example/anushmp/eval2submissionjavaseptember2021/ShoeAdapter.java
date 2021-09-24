package com.example.anushmp.eval2submissionjavaseptember2021;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class ShoeAdapter extends RecyclerView.Adapter<ShoeAdapter.ShoeVH>{

    List<ShoeResponse> shoelist = new ArrayList<>();

    public ShoeAdapter(List<ShoeResponse> shoelist){

        this.shoelist = shoelist;


    }


    @NonNull
    @Override
    public ShoeVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View shoeView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view,parent,false);

        ShoeVH s = new ShoeVH(shoeView);

        return s ;
    }

    @Override
    public void onBindViewHolder(@NonNull ShoeVH holder, int position) {

        ShoeResponse sr = shoelist.get(position);


        holder.setdata(sr);




    }

    @Override
    public int getItemCount() {
        return shoelist.size();
    }





    public class ShoeVH extends RecyclerView.ViewHolder{


        TextView priceofshoe;
        TextView nameofshoe;
        ImageView plusbutton;
        ImageView shoephoto;



        public ShoeVH(@NonNull View itemView) {
            super(itemView);




        }


        public void setdata(ShoeResponse s){


            priceofshoe.setText(s.getRetailPrice() + "");
            nameofshoe.setText(s.getName());


            Glide.with(itemView).load(s.getMedia().getImageUrl()).into(shoephoto);



        }



    }



}
