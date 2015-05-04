package com.sample.fragment;

import android.app.Activity;
import android.app.DialogFragment;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;

import com.sample.DemoApplication;

/**  
* AbstractFragment.java - a Base fragment class to show dialog whenever get message from server.  
* @author  Rahul Purohit
* @version 1.0 
* @see DialogFragment
*/
public class AbstractFragment extends DialogFragment implements TAGS {
		
		public AbstractActivity activity;
		
		@Override
		public void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			activity = (AbstractActivity) getActivity();
		}

		/**
		 * {@link EditText} Error Shower
		 * 
		 * @author Rahul Purohit
		 * @Feb 26, 2015
		 * @param editText
		 * @param errmsg
		 */
		public void setError(EditText editText, int errmsg) {
			editText.setError(getString(errmsg));
			editText.requestFocus();
		}

		/**
		 * 
		 * @author Rahul Purohit
		 * @Mar 2, 2015
		 * @param tag
		 * @param object
		 */
		public abstract void callFromServer(String tag, Object object);
}
