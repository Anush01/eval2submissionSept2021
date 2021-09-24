package com.example.anushmp.eval2submissionjavaseptember2021;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;


public class SneakerFragment extends Fragment {

   NavController navController;

   List<ShoeResponse> ShoeList = new ArrayList<>();

   RecyclerView rv;

    public SneakerFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sneaker, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);
        rv = view.findViewById(R.id.rv);


        Retrofit browser = Networker.getRetrofit();

       Api api = browser.create(Api.class);

        api.getShoeResponse().enqueue(new Callback<List<ShoeResponse>>() {
            @Override
            public void onResponse(Call<List<ShoeResponse>> call, Response<List<ShoeResponse>> response) {

                ShoeList = response.body();

                ShoeAdapter sa = new ShoeAdapter(ShoeList);

                GridLayoutManager glm = new GridLayoutManager(getContext(),2,RecyclerView.VERTICAL,false);

                rv.setAdapter(sa);
                rv.setLayoutManager(glm);
                //rv.setAdapter(sa);



            }

            @Override
            public void onFailure(Call<List<ShoeResponse>> call, Throwable t) {

            }
        });




    }
}