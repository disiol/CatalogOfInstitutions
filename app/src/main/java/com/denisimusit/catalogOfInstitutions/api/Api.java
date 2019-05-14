package com.denisimusit.catalogOfInstitutions.api;

import com.denisimusit.catalogOfInstitutions.models.Response;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {
    @GET("getVenuesByLocation")
    Call<List<Response>> getVenuesByLocation(@Query("client_id") String client_id,
                                             @Query("client_secret") String client_secret,
                                             @Query("ll") String latLng);


}
