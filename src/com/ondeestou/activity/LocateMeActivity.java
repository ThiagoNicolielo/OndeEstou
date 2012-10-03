package com.ondeestou.activity;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class LocateMeActivity extends Activity {

	TextView tvMyLocation;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locate_me);
        
        tvMyLocation = (TextView) findViewById( R.id.tvMyLocation );
        
        LocationManager locationManager = (LocationManager) this.getSystemService(Context.LOCATION_SERVICE);
        Location location = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
        
        tvMyLocation.setText("Latitude: "+(location.getLatitude()*1E6)+"\n"+(location.getLongitude()*1E6));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_locate_me, menu);
        return true;
    }
    
}
