package com.nickfrost.infosystem;

import java.util.Calendar;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Schedule extends Supplementary {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.schedule);
		Button backButton = (Button) findViewById(R.id.back_button);
		backButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				finish();
			}
		});

//		SharedPreferences prefs = PreferenceManager
//				.getDefaultSharedPreferences(this);
//
//		String groupName = "R.id." + prefs.getString("groupListKey", "<unset>")
//				+ "_" + (Calendar.getInstance().get(Calendar.DAY_OF_WEEK));
//
//		ImageView image = (ImageView) findViewById(int);

	}
}
