package com.sample.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Preference.java - To manage local data on mobile
 * @author Rahul Purohit Created On Mar 26, 2015 on 1:45:50 PM
 * @version 1.0
 */
public class Preference implements TAGS {

	private static final String TAG = Preference.class.getName();
	private static final String DEFAULT_HOSTNAME = "XX.XX.XX.XX";
	private static final int DEFAULT_PORT = XXXXX;

	private static final String SETTING_XML = "settinges.xml";
	private static final String PREFERENCE_NAME = "app_preference";

	private static SharedPreferences getdefaultPreferences(Context context) {
		SharedPreferences preferences = context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE);
		return preferences;
	}

	/**
	 * @param context
	 * @param hostname
	 */
	public static void setHostname(Context context, String hostname) {
		getdefaultPreferences(context).edit().putString(TAG_HOSTNAME, hostname).commit();
	}

	/**
	 * @param context
	 * @return
	 */
	public static String getHostname(Context context) {

		String string = getdefaultPreferences(context).getString(TAG_HOSTNAME,
				DEFAULT_HOSTNAME);
		Utills.logd(TAG , TAG_HOSTNAME + ":" + string);
		return string;
	}

	/**
	 * @param context
	 * @param port
	 */
	public static void setPort(Context context, int port) {
		getdefaultPreferences(context).edit().putInt(TAG_PORT, port).commit();

	}

	/**
	 * @param context
	 * @return
	 */
	public static int getPort(Context context) {
		int int1 = getdefaultPreferences(context).getInt(TAG_PORT, DEFAULT_PORT);
		Utills.logd(TAG, TAG_PORT + ":" + int1);

		return int1;
	}

	/**
	 * @param context
	 * @param username
	 */
	public static void setUserName(Context context, String username) {
		getdefaultPreferences(context).edit().putString(TAG_USER, username).commit();
	}

	/**
	 * @param context
	 * @return
	 */
	public static String getUserName(Context context) {
		return getdefaultPreferences(context).getString(TAG_USER, null);

	}

	/**
	 * @param context
	 * @param password
	 */
	public static void setPassword(Context context, String password) {
		getdefaultPreferences(context).edit().putString(TAG_PASSWORD, password)
				.commit();

	}

	public static String getPassword(Context context) {
		return getdefaultPreferences(context).getString(TAG_PASSWORD, null);
	}
}