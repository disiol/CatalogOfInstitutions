package com.denisimusit.catalogOfInstitutions.di.component;

import android.content.Context;

import com.denisimusit.catalogOfInstitutions.MainActivity;
import com.denisimusit.catalogOfInstitutions.TokenExchangeApplication;
import com.denisimusit.catalogOfInstitutions.di.ApplicationModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder context(Context context);
        ApplicationComponent build();
    }

    void inject(TokenExchangeApplication app);
    void inject(MainActivity mainActivity);
}
