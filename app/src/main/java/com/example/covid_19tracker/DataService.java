package com.example.covid_19tracker;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/*
*   Interface used with the services generated by the ServiceGenerator.java class.
*   The getData() method
* */
public interface DataService {
    @GET("current.json")
    Call<List<StateData>> getData();
}