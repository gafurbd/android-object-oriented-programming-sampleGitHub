/**
 * 
 */
package com.mdgafur.android_object_oriented_programming_sample;


import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import com.mdgafur.android_object_oriented_programming_AsyncTask.AppAsyncTask;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * @author Md Abdul Gafur
 * Bangladesh, Dhaka.
 * Khulna University.
 * CSE 07 Batch.
 */
public class MainActivity extends Activity {
 private AppAsyncTask appAsyncTask;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		appAsyncTask= new AppAsyncTask(this);
		appAsyncTask.execute();
//		try {
//		String a=appAsyncTask.get();
//		Log.i("get", a);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (ExecutionException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		try {
			appAsyncTask.get(2000, TimeUnit.MILLISECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		Handler handler = new Handler();
//		handler.postDelayed(new Runnable()
//		{
//		  if ( downloader.getStatus = AsyncTask.Status.RUNNING )
//		    downloader.cancel(true);
//		}, 30000 );

		
		Log.i("get", "aa");
	}
}
