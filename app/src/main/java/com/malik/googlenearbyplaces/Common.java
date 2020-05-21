package com.malik.googlenearbyplaces;

import com.malik.googlenearbyplaces.Model.MyPlaces;
import com.malik.googlenearbyplaces.Model.Results;
import com.malik.googlenearbyplaces.Retrofit.IGoogleAPIService;
import com.malik.googlenearbyplaces.Retrofit.RetrofitClient;

import retrofit2.converter.gson.GsonConverterFactory;

public class Common {

    public static Results currentResult;
    private static final String GOOGLE_API_URL = "https://maps.googleapis.com/";
    public static IGoogleAPIService getGoogleAPIService()
    {
        return RetrofitClient.getClient(GOOGLE_API_URL).create(IGoogleAPIService.class);
    }
}
