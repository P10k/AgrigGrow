package com.example.login;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    String BASE_URL="https://newsapi.org/v2/";
    @GET("top-headlines")
    Call<MainNews> getNews(
            @Query("country") String country,
            @Query("pageSize") int pageSize,
            @Query("apikey")  String apikey
    );


    @GET("everything")
    Call<MainNews> getEverythingNews(
            @Query("q") String query,
            @Query("pageSize") int pageSize,
            @Query("apikey")  String apikey
    );



}