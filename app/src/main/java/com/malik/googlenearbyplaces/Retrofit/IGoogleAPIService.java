package com.malik.googlenearbyplaces.Retrofit;

import com.malik.googlenearbyplaces.Model.MyPlaces;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface IGoogleAPIService {

    @GET
    Call<MyPlaces> getNearBYPlaces(@Url String url);

    @GET
    Call<MyPlaces> getDetailPlace(@Url String url);
}
