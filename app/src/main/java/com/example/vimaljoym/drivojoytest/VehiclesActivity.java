package com.example.vimaljoym.drivojoytest;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.vimaljoym.drivojoytest.api.IApiService;
import com.example.vimaljoym.drivojoytest.common.BaseNavigation;
import com.example.vimaljoym.drivojoytest.model.OilBrandPrice;
import com.example.vimaljoym.drivojoytest.model.Vehicle;

import butterknife.BindView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class VehiclesActivity extends BaseNavigation implements Callback<Vehicle> {
    @BindView(R.id.tvCreatedTime)
    TextView tvCreatedTime;
    @BindView(R.id.tvEntityID)
    TextView tvEntityID;
    @BindView(R.id.tvSoftDelete)
    TextView tvSoftDelete;
    @BindView(R.id.tvUpdatedTime)
    TextView tvUpdatedTime;
    @BindView(R.id.tvDisassemblingQty)
    TextView tvDisassemblingQty;
    @BindView(R.id.tvDrainingQty)
    TextView tvDrainingQty;
    @BindView(R.id.tvGrade)
    TextView tvGrade;
    @BindView(R.id.tvOilBrandPrice)
    TextView tvOilBrandPrice;
    @BindView(R.id.tvQuantity)
    TextView tvQuantity;
    @BindView(R.id.tvVehicleBrand)
    TextView tvVehicleBrand;
    @BindView(R.id.tvVehicleCategory)
    TextView tvVehicleCategory;
    @BindView(R.id.tvVehicleModel)
    TextView tvVehicleModel;
    @BindView(R.id.tvVehicleModelBrand)
    TextView tvVehicleModelBrand;
    @BindView(R.id.tvVehicleType)
    TextView tvVehicleType;
    @BindView(R.id.tvVehicleYears)
    TextView tvVehicleYears;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicles);
        super.initializeNavigationMenu();


        setupView();


    }

    private void setupView() {


        //initializing the progress dialog
        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Loading...");
        progressDialog.show();


        //retrofit object
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://drivojoydev.cloudapp.net:9001/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        //enqueue the service call
        IApiService apiService = retrofit.create(IApiService.class);
        Call<Vehicle> call = apiService.getVehicle();
        call.enqueue(this);


    }


    @Override
    public void onResponse(Call<Vehicle> call, Response<Vehicle> response) {
        try {
            tvCreatedTime.setText(response.body().getCreatedTime());
            tvEntityID.setText(response.body().getEntityID());
            tvSoftDelete.setText(String.valueOf(response.body().getSoftDelete()));
            tvUpdatedTime.setText(response.body().getUpdatedTime());
            tvDisassemblingQty.setText(String.valueOf(response.body().getDisassemblingQty()));
            tvDrainingQty.setText(String.valueOf(response.body().getDrainingQty()));
            tvGrade.setText(response.body().getGrade());

            StringBuilder sbOilBrandPrice = new StringBuilder();
            for (OilBrandPrice oilBrandPrice : response.body().getOilBrandPrice()) {

                sbOilBrandPrice.append(oilBrandPrice.getOilBrandName());
                sbOilBrandPrice.append("  ");
                sbOilBrandPrice.append(oilBrandPrice.getOilPrice());
                sbOilBrandPrice.append("\n");
            }

            if (!sbOilBrandPrice.toString().isEmpty()) {
                tvOilBrandPrice.setText(sbOilBrandPrice.toString());
            }

            tvQuantity.setText(String.valueOf(response.body().getQuantity()));
            tvVehicleBrand.setText(response.body().getVehicleBrand());
            tvVehicleCategory.setText(String.valueOf(response.body().getVehicleCategory()));
            tvVehicleModel.setText(response.body().getVehicleModel());
            tvVehicleModelBrand.setText(response.body().getVehicleModelBrand());
            tvVehicleType.setText(response.body().getVehicleType());

            StringBuilder sbVehicleYears = new StringBuilder();
            for (Integer year : response.body().getVehicleYears()) {
                sbVehicleYears.append(year);
                sbVehicleYears.append("\n");
            }

            if (!sbVehicleYears.toString().isEmpty()) {
                tvVehicleYears.setText(sbVehicleYears.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        dismissProgress();
    }

    @Override
    public void onFailure(Call<Vehicle> call, Throwable t) {
        dismissProgress();
        Toast.makeText(this, "Error while fetching the data !", Toast.LENGTH_SHORT).show();

    }

    private void dismissProgress() {
        if (null != progressDialog && progressDialog.isShowing())
            progressDialog.dismiss();
    }
}
