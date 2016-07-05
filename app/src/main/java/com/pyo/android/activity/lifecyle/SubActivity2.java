package com.pyo.android.activity.lifecyle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SubActivity2 extends Activity {
    private static final String DEBUG_TAG =
    	   "SubActivity2.out";
    private  Button stopBtn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		Log.i(DEBUG_TAG," -- SubActivity2.onCreate(Bundle) Callback --");
		
		setContentView(R.layout.sub_activity2_layout);
		stopBtn = (Button)findViewById(R.id.stopBtn);
		stopBtn.setOnClickListener(new View.OnClickListener() {	
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				SubActivity2.this.finish();
			}
		});
	}
	@Override
	protected void onStart() {
    	super.onStart();
    	Log.i(DEBUG_TAG, "SubActivity2.onStart() callback");
    }   
    @Override
    protected void onResume() {
    	super.onResume();
    	Log.i(DEBUG_TAG, "SubActivity2.onResume() callback");
    }       
    @Override
    protected void onRestart() {
    	super.onRestart();
    	Log.i(DEBUG_TAG, "SubActivity2.onRestart() callback");
    }      
    @Override
    protected void onPause() {
    	super.onPause();
    	Log.i(DEBUG_TAG, "SubActivity2.onPause() callback");
    }   
    @Override
    protected void onStop() {
    	super.onStop();
    	Log.i(DEBUG_TAG, "SubActivity2.onStop() callback");
    }   
    @Override
    protected void onDestroy() {
    	super.onDestroy();
    	Log.i(DEBUG_TAG, "SubActivity2.onDestroy() callback");
    }       
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
    	super.onRestoreInstanceState(savedInstanceState);
    	Log.i(DEBUG_TAG, "SubActivity2.onRestoreInstanceState(Bundle) callback");
    }  
    @Override
    protected void onSaveInstanceState(Bundle b) {
    	super.onSaveInstanceState(b);
    	Log.i(DEBUG_TAG, "SubActivity2.onSaveInstanceState(Bundle) callback");
    }
}
