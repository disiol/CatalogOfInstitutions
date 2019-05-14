package com.denisimusit.catalogOfInstitutions.di.modules;

import com.denisimusit.catalogOfInstitutions.MainActivity;
import com.denisimusit.catalogOfInstitutions.di.scopes.ActivityScope;

import dagger.Binds;
import dagger.Module;

@Module
public interface MainActivityModule {
    MainActivity mainActivity();

}
