package com.example.vimaljoym.drivojoytest.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class OilBrandPrice {

    @SerializedName("OilBrandName")
    @Expose
    private String oilBrandName;
    @SerializedName("OilPrice")
    @Expose
    private Double oilPrice;

    /**
     * @return The oilBrandName
     */
    public String getOilBrandName() {
        return oilBrandName;
    }

    /**
     * @param oilBrandName The OilBrandName
     */
    public void setOilBrandName(String oilBrandName) {
        this.oilBrandName = oilBrandName;
    }

    /**
     * @return The oilPrice
     */
    public Double getOilPrice() {
        return oilPrice;
    }

    /**
     * @param oilPrice The OilPrice
     */
    public void setOilPrice(Double oilPrice) {
        this.oilPrice = oilPrice;
    }

}
