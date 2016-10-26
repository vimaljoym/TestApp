package com.example.vimaljoym.drivojoytest.api;

import com.example.vimaljoym.drivojoytest.model.Vehicle;

import retrofit2.Call;
import retrofit2.http.GET;


/**
 * Created by vimaljoym on 26/10/16.
 */

public interface IApiService {
    @GET("VehiclesMaster?vehicleModelBrand=Bajaj%20Pulsar%20180")
    Call<Vehicle> getVehicle();
}
