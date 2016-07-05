package com.pyo.android.activity.lifecyle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActivityLifeCycle extends Activity {
	private  static final String DEBUG_TAG = 
		  "ActivityLifeCycle.out" ;
	private Button subActivity1;
	private Button subActivity2;
	
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Log.i(DEBUG_TAG, " -- ActivityLifeCycle.onCreate(Bundle)  Callback --");
       
        subActivity1 = (Button)findViewById(R.id.btnPause);
        subActivity2 = (Button)findViewById(R.id.btnStop);


        subActivity1.setOnClickListener(new View.OnClickListener() {	
			@Override
			public void onClick(View button) {
				// TODO Auto-generated method stub
			   startActivity(new Intent(getApplication(), SubActivity1.class));
			
			}
		});
        subActivity2.setOnClickListener(new View.OnClickListener() {	
			@Override
			public void onClick(View button) {
				// TODO Auto-generated method stub
			   startActivity(new Intent(getApplication(), SubActivity2.class));
			}
		});
    }
    @Override
    public void onStart() {
    	super.onStart();
    	Log.i(DEBUG_TAG, "ActivityLifeCycle.onStart() callback");
    }   
    @Override
    public void onResume() {
    	super.onResume();
    	Log.i(DEBUG_TAG, "ActivityLifeCycle.onResume() callback");
    }
        
    @Override
    public void onRestart() {
    	super.onRestart();
    	Log.i(DEBUG_TAG, "ActivityLifeCycle.onRestart() callback");
    }     
    @Override
    public void onPause() {
    	super.onPause();
        Log.i(DEBUG_TAG, "ActivityLifeCycle.onPause() callback");
    }    
    @Override
    public void onStop() {
    	super.onStop();
    	Log.i(DEBUG_TAG, "ActivityLifeCycle.onStop() callback");
    }  
    @Override
    public void onDestroy(){
    	super.onDestroy();
    	Log.i(DEBUG_TAG, "ActivityLifeCycle.onDestroy() callback");
    }   
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
    	super.onRestoreInstanceState(savedInstanceState);
    	Log.i(DEBUG_TAG, "ActivityLifeCycle.onRestoreInstanceState(Bundle) callback");
    }   
    @Override
    protected void onSaveInstanceState(Bundle b) {
    	super.onSaveInstanceState(b);
    	Log.i(DEBUG_TAG, "ActivityLifeCycle.onSaveInstanceState(Bundle) callback");
    }   
    
}