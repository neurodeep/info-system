package com.nickfrost.infosystem;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.TextView;

public class ShowPrefs extends Supplementary {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.showpreferences);

		SharedPreferences prefs = PreferenceManager
				.getDefaultSharedPreferences(this);

		TextView text1 = (TextView) findViewById(R.id.textview1);
		TextView text2 = (TextView) findViewById(R.id.textview2);
		TextView text3 = (TextView) findViewById(R.id.textview3);
		TextView text4 = (TextView) findViewById(R.id.textview4);

		text1.setText(new Boolean(prefs.getBoolean("offsetWeekKey", false))
				.toString());
		text2.setText(prefs.getString("firstNameKey", "<unset>"));

		text3.setText(prefs.getString("lastNameKey", "<unset>"));

		text4.setText(prefs.getString("groupListKey", "<unset>"));
	}
}
