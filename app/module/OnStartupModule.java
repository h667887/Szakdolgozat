package module;

import com.google.inject.AbstractModule;
import models.User;

import javax.inject.Inject;
import javax.inject.Singleton;



public class OnStartupModule extends AbstractModule {
    @Override
    public void configure() {
        bind(OnStartup.class).asEagerSingleton();
    }
}


