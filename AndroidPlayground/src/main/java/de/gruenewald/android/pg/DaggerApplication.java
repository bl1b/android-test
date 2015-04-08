/**
 * ***************************************************************************
 * COMINTO GmbH
 * Klosterstr. 49
 * 40211 Düsseldorf
 * Germany
 * <p/>
 * (c) Copyright 2015 by COMINTO GmbH
 * ALL RIGHTS RESERVED
 * <p/>
 * -----------------------------------------------------------------------------
 * <p/>
 * $Id: $
 * ****************************************************************************
 */
package de.gruenewald.android.pg;

import android.app.Application;
import android.location.LocationManager;
import dagger.Component;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Class DaggerApplication
 * <p>
 * DOCUMENT ME.
 * </p>
 * <p/>
 * $ Date: $
 *
 * @author Jan
 * @version $Revision: $
 */
public class DaggerApplication extends Application {
    @Singleton
    @Component(modules = DaggerApplicationModule.class)
    public interface ApplicationComponent {
        void inject(DaggerApplication application);
    }

    @Inject LocationManager locationManager;
    private ApplicationComponent componentImpl;

    @Override
    public void onCreate() {
        super.onCreate();

    }
}
