package com.pyo.android.activity.lifecyle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class SubActivity1 extends Activity {
	private static final String DEBUG_TAG = 
		 "SubActivity1.out";
	private Button endBtn;
	
	@Override
	public  void  onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		
		Log.i(DEBUG_TAG,"-- SubActivity1.onCreate(Bundle) Callback -- ");
		
	   Window w = getWindow();
	   w.setFlags(WindowManager.LayoutParams.FLAG_BLUR_BEHIND, 
			        WindowManager.LayoutParams.FLAG_BLUR_BEHIND);
	   
	   setContentView(R.layout.sub_activity1_layout);
	   
	   endBtn = (Button)findViewById(R.id.endBtn);
	   endBtn.setOnClickListener(new View.OnClickListener(){
		@Override
		public void onClick(View v) {
		     SubActivity1.this.finish();
		 }
	   });
	}
	@Override
	protected void onStart() {
    	super.onStart();
    	Log.i(DEBUG_TAG, "SubActivity1.onStart() callback");
    }  
    @Override
    protected void onResume() {
    	super.onResume();
    	Log.i(DEBUG_TAG, "SubActivity1.onResume() callback");
    }      
    @Override
    protected void onRestart() {
    	super.onRestart();
    	Log.i(DEBUG_TAG, "SubActivity1.onRestart() callback");
    }     
    @Override
    protected void onPause() {
    	super.onPause();
    	Log.i(DEBUG_TAG, "SubActivity1.onPause() callback");
    }   
    @Override
    protected void onStop() {
    	super.onStop();
    	Log.i(DEBUG_TAG, "SubActivity1.onStop() callback");
    }   
    @Override
    protected void onDestroy() {
    	super.onDestroy();
    	Log.i(DEBUG_TAG, "SubActivity1.onDestroy() callback");
    }      
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
    	super.onRestoreInstanceState(savedInstanceState);
    	Log.i(DEBUG_TAG, "SubActivity1.onRestoreInstanceState(Bundle) callback");
    }    
    @Override
    protected void onSaveInstanceState(Bundle b) {
    	super.onSaveInstanceState(b);
    	Log.i(DEBUG_TAG, "SubActivity1.onSaveInstanceState(Bundle) callback");
    }
}
