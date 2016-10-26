package com.example.vimaljoym.drivojoytest.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


public class Vehicle {

    @SerializedName("VehicleType")
    @Expose
    private String vehicleType;
    @SerializedName("VehicleBrand")
    @Expose
    private String vehicleBrand;
    @SerializedName("VehicleModel")
    @Expose
    private String vehicleModel;
    @SerializedName("VehicleModelBrand")
    @Expose
    private String vehicleModelBrand;
    @SerializedName("DisassemblingQty")
    @Expose
    private Integer disassemblingQty;
    @SerializedName("DrainingQty")
    @Expose
    private Integer drainingQty;
    @SerializedName("Quantity")
    @Expose
    private Integer quantity;
    @SerializedName("Grade")
    @Expose
    private String grade;
    @SerializedName("OilBrandPrice")
    @Expose
    private List<OilBrandPrice> oilBrandPrice = new ArrayList<OilBrandPrice>();
    @SerializedName("VehicleCategory")
    @Expose
    private Integer vehicleCategory;
    @SerializedName("VehicleYears")
    @Expose
    private List<Integer> vehicleYears = new ArrayList<Integer>();
    @SerializedName("EntityID")
    @Expose
    private String entityID;
    @SerializedName("CreatedTime")
    @Expose
    private String createdTime;
    @SerializedName("UpdatedTime")
    @Expose
    private String updatedTime;
    @SerializedName("SoftDelete")
    @Expose
    private Boolean softDelete;

    /**
     * @return The vehicleType
     */
    public String getVehicleType() {
        return vehicleType;
    }

    /**
     * @param vehicleType The VehicleType
     */
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    /**
     * @return The vehicleBrand
     */
    public String getVehicleBrand() {
        return vehicleBrand;
    }

    /**
     * @param vehicleBrand The VehicleBrand
     */
    public void setVehicleBrand(String vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
    }

    /**
     * @return The vehicleModel
     */
    public String getVehicleModel() {
        return vehicleModel;
    }

    /**
     * @param vehicleModel The VehicleModel
     */
    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    /**
     * @return The vehicleModelBrand
     */
    public String getVehicleModelBrand() {
        return vehicleModelBrand;
    }

    /**
     * @param vehicleModelBrand The VehicleModelBrand
     */
    public void setVehicleModelBrand(String vehicleModelBrand) {
        this.vehicleModelBrand = vehicleModelBrand;
    }

    /**
     * @return The disassemblingQty
     */
    public Integer getDisassemblingQty() {
        return disassemblingQty;
    }

    /**
     * @param disassemblingQty The DisassemblingQty
     */
    public void setDisassemblingQty(Integer disassemblingQty) {
        this.disassemblingQty = disassemblingQty;
    }

    /**
     * @return The drainingQty
     */
    public Integer getDrainingQty() {
        return drainingQty;
    }

    /**
     * @param drainingQty The DrainingQty
     */
    public void setDrainingQty(Integer drainingQty) {
        this.drainingQty = drainingQty;
    }

    /**
     * @return The quantity
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * @param quantity The Quantity
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * @return The grade
     */
    public String getGrade() {
        return grade;
    }

    /**
     * @param grade The Grade
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * @return The oilBrandPrice
     */
    public List<OilBrandPrice> getOilBrandPrice() {
        return oilBrandPrice;
    }

    /**
     * @param oilBrandPrice The OilBrandPrice
     */
    public void setOilBrandPrice(List<OilBrandPrice> oilBrandPrice) {
        this.oilBrandPrice = oilBrandPrice;
    }

    /**
     * @return The vehicleCategory
     */
    public Integer getVehicleCategory() {
        return vehicleCategory;
    }

    /**
     * @param vehicleCategory The VehicleCategory
     */
    public void setVehicleCategory(Integer vehicleCategory) {
        this.vehicleCategory = vehicleCategory;
    }

    /**
     * @return The vehicleYears
     */
    public List<Integer> getVehicleYears() {
        return vehicleYears;
    }

    /**
     * @param vehicleYears The VehicleYears
     */
    public void setVehicleYears(List<Integer> vehicleYears) {
        this.vehicleYears = vehicleYears;
    }

    /**
     * @return The entityID
     */
    public String getEntityID() {
        return entityID;
    }

    /**
     * @param entityID The EntityID
     */
    public void setEntityID(String entityID) {
        this.entityID = entityID;
    }

    /**
     * @return The createdTime
     */
    public String getCreatedTime() {
        return createdTime;
    }

    /**
     * @param createdTime The CreatedTime
     */
    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * @return The updatedTime
     */
    public String getUpdatedTime() {
        return updatedTime;
    }

    /**
     * @param updatedTime The UpdatedTime
     */
    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * @return The softDelete
     */
    public Boolean getSoftDelete() {
        return softDelete;
    }

    /**
     * @param softDelete The SoftDelete
     */
    public void setSoftDelete(Boolean softDelete) {
        this.softDelete = softDelete;
    }

}
