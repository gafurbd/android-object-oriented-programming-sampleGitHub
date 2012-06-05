/**
 * 
 */
package com.mdgafur.android_object_oriented_programming_AsyncTask;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

/**
 * @author Md Abdul Gafur
 * Bangladesh, Dhaka.
 * Khulna University.
 * CSE 07 Batch.
 */
public class AppAsyncTask extends AsyncTask<Void, Integer, String> {

	private Context context;
	private ProgressDialog appProgressDialog;
	
	public AppAsyncTask(Context context) {
		// TODO Auto-generated constructor stub
		this.context=context;
		appProgressDialog= new ProgressDialog(context);
	}
	
	@Override
	protected void onPreExecute() {
		// TODO Auto-generated method stub
		super.onPreExecute();
		appProgressDialog.show();
	}

	@Override
	protected String doInBackground(Void... params) {
		// TODO Auto-generated method stub
		for(int i=0 ; i<6600 ; i++)
		{
			Log.i("DO", "TODO");
			if(isCancelled())
				return "done";
		}
		return "done";
	}
	
	@Override
	protected void onPostExecute(String result) {
		// TODO Auto-generated method stub
		super.onPostExecute(result);
		if(result.equals("done"))
		{
			if(appProgressDialog.isShowing())
			{
				appProgressDialog.dismiss();
			}
		}
	}

	
}
