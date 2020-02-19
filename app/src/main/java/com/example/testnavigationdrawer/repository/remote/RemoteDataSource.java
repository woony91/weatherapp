package com.example.testnavigationdrawer.repository.remote;

import retrofit2.Retrofit;

public class RemoteDataSource {
    private Retrofit retrofit = RetrofitInstance.getInstance();

    private RemoteDataSource(){}

    private static class RemoteDataSourceHolder{
        private static final RemoteDataSource INSTANCE = new RemoteDataSource();
    }

    public static RemoteDataSource getInstance(){
        return RemoteDataSourceHolder.INSTANCE;
    }

    public WeatherService getWeatherService() {
        return retrofit.create(WeatherService.class);
    }
}
