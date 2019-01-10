package com.example.consultants.retrofitexample;

import retrofit.Callback;
import retrofit.http.GET;

public interface MInterface {

        @GET("/users/mobilesiri")
        void getUser(Callback<Pojo> uscb);
    }

