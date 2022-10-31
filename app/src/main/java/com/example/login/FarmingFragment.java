package com.example.login;

import android.os.Bundle;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FarmingFragment extends Fragment{

    String api="f630712f3ab5452c83245323327122d9";
    ArrayList<ModelClass> modelClassArrayList;
    Adapter adapter;

    private RecyclerView recyclerviewoffarming;





    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.farming_fragment,null);



        recyclerviewoffarming=v.findViewById(R.id.recyclerviewoffarming);
        modelClassArrayList=new ArrayList<>();
        recyclerviewoffarming.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter=new Adapter(getContext(),modelClassArrayList);
        recyclerviewoffarming.setAdapter(adapter);
        findNews();


        return  v;

    }

    private void findNews() {



        ApiUtilities.getApiInterface().getEverythingNews("farming",100,api).enqueue(new Callback<MainNews>() {
            @Override
            public void onResponse(Call<MainNews> call, Response<MainNews> response) {
                if(response.isSuccessful())
                {
                    modelClassArrayList.addAll(response.body().getArticles());
                    adapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<MainNews> call, Throwable t) {

            }
        });
    }
}