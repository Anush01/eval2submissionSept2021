package com.example.anushmp.eval2submissionjavaseptember2021;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;


public class SneakerDetailsFragment extends Fragment {

    ImageView shoedetailphoto;
    TextView name;
    TextView brand;
    TextView year;
    TextView price;
    Button addtocart;
    Button backtosneakers;

    NavController n;



    public SneakerDetailsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sneaker_details, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



        shoedetailphoto = view.findViewById(R.id.shoedetailphoto);
        name = view.findViewById(R.id.namedetail);
        brand = view.findViewById(R.id.branddetail);
        year = view.findViewById(R.id.yearofman);
        price = view.findViewById(R.id.pricedetail);

        addtocart = view.findViewById(R.id.addcart);
        backtosneakers = view.findViewById(R.id.backtosneakers);

        n = Navigation.findNavController(view);


        String name1 = getArguments().getString("name");
        String imageurl1 = getArguments().getString("image");

        String brand1 = getArguments().getString("brand");
        String year1 = getArguments().getString("year");
        String price1 = getArguments().getString("price");


        name.setText(name1);
        Glide.with(view).load(imageurl1).into(shoedetailphoto);
        brand.setText(brand1);
        year.setText(year1);
        price.setText(price1);



        backtosneakers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                n.navigate(R.id.action_sneakerDetailsFragment_to_sneakerFragment);

            }
        });




    }



}