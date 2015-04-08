/**
 * ***************************************************************************
 * COMINTO GmbH
 * Klosterstr. 49
 * 40211 Düsseldorf
 * Germany
 *
 * (c) Copyright 2015 by COMINTO GmbH
 * ALL RIGHTS RESERVED
 *
 * -----------------------------------------------------------------------------
 *
 * $Id: $
 * ****************************************************************************
 */
package de.gruenewald.android.pg;

import android.content.Context;
import android.location.LocationManager;
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

/**
 * Class DaggerApplicationModule
 * <p>
 * DOCUMENT ME.
 * </p>
 *
 * $ Date: $
 *
 * @author Jan
 * @version $Revision: $
 */
@Module
public class DaggerApplicationModule {
    private final DaggerApplication mApplication;

    public DaggerApplicationModule(DaggerApplication applicationRef) {
        mApplication = applicationRef;
    }

    @Provides
    @Singleton
    LocationManager provideLocationManager() {
        return (LocationManager) mApplication.getSystemService(Context.LOCATION_SERVICE);
    }

    @Provides
    @Singleton
    @ForApplication
    Context provideApplicationContext() {
        return mApplication;
    }
}
