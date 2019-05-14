package com.denisimusit.catalogOfInstitutions.interactor;

import android.util.Log;

import com.denisimusit.catalogOfInstitutions.api.Api;
import com.denisimusit.catalogOfInstitutions.models.Response;
import com.google.gson.Gson;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import retrofit2.Call;
import retrofit2.Callback;

import static com.denisimusit.catalogOfInstitutions.constants.Constants.CLIENT_ID;
import static com.denisimusit.catalogOfInstitutions.constants.Constants.CLIENT_SECRET;
import static com.denisimusit.catalogOfInstitutions.constants.Constants.LOG_TEG;

@Singleton
public class DataStore {

    private Api api;
    private Gson gson;

    @Inject
    public DataStore(Api api, Gson gson) {
        this.api = api;
        this.gson = gson;
    }

    public void getVenuesByLocation(String latLng) {
        api.getVenuesByLocation(CLIENT_ID, CLIENT_SECRET, latLng).enqueue(new Callback<List<Response>>() {
            @Override
            public void onResponse(Call<List<Response>> call, retrofit2.Response<List<Response>> response) {

                Log.d(LOG_TEG,response.toString());

            }

            @Override
            public void onFailure(Call<List<Response>> call, Throwable t) {
                Log.d(LOG_TEG," getVenuesByLocation" +t.getMessage() + "\n"  + t.getCause());

            }
        });
    }
}
