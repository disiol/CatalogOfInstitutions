package com.denisimusit.catalogOfInstitutions;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.denisimusit.catalogOfInstitutions.di.component.DaggerApplicationComponent;
import com.denisimusit.catalogOfInstitutions.interactor.DataStore;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    DataStore dataStore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DaggerApplicationComponent.builder()
                .context(this)
                .build()
                .inject(this);

        setContentView(R.layout.activity_main);
        getVenuesByLocation();
    }

    private void getVenuesByLocation() {
        dataStore.getVenuesByLocation("40.7484,-73.9857");
    }


}
