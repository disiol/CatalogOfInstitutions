package com.denisimusit.catalogOfInstitutions;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

import com.denisimusit.catalogOfInstitutions.api.Api;
import com.denisimusit.catalogOfInstitutions.di.component.DaggerApplicationComponent;
import com.denisimusit.catalogOfInstitutions.models.Response;

import java.util.List;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;
import retrofit2.Call;
import retrofit2.Callback;

import static com.denisimusit.catalogOfInstitutions.constants.Constants.CLIENT_ID;
import static com.denisimusit.catalogOfInstitutions.constants.Constants.CLIENT_SECRET;
import static com.denisimusit.catalogOfInstitutions.constants.Constants.LOG_TEG;

public class TokenExchangeApplication extends Application  {

    @Override
    public void onCreate() {
        super.onCreate();
        DaggerApplicationComponent.builder()
                .context(this)
                .build()
                .inject(this);


    }




}
