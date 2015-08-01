package netspacekenya.com.emergencylocator;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by Edwin on 01-Aug-15.
 */
public class EntryApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, AppConstants.PARSE_CLIENT_ID, AppConstants.PARSE_SECRET);
    }
}
