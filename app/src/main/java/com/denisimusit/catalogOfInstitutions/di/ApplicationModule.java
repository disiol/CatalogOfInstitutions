package com.denisimusit.catalogOfInstitutions.di;

import com.denisimusit.catalogOfInstitutions.MainActivity;
import com.denisimusit.catalogOfInstitutions.di.modules.ApiModule;
import com.denisimusit.catalogOfInstitutions.di.modules.MainActivityModule;
import com.denisimusit.catalogOfInstitutions.di.scopes.ActivityScope;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Module(includes = {AndroidSupportInjectionModule.class, ApiModule.class, AppModule.class})
public interface ApplicationModule {
    @ActivityScope
    @ContributesAndroidInjector(modules = {MainActivityModule.class})
    MainActivity mainActivityInjector();


}
