package com.example.testnavigationdrawer.repository.remote;

import com.example.testnavigationdrawer.model.WeatherResponse;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface WeatherService {

    @GET("/forecast/{key}/{lat}/{lon}")
    Observable<WeatherResponse> getWeather(
            @Path("key") String key,
            @Path("lat") String latitude,
            @Path("lon") String longitude,
            @Query("exclude")List<String> exclude
    );
}
