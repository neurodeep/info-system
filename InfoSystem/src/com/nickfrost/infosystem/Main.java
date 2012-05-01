package com.nickfrost.infosystem;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main extends Supplementary {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		Button scheduleButton = (Button) findViewById(R.id.schedule_button);
		scheduleButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				Intent intent = new Intent(Main.this, Schedule.class);
				startActivity(intent);
			}
		});

		Button teacher_scheduleButton = (Button) findViewById(R.id.teacher_schedule_button);
		teacher_scheduleButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				Intent intent = new Intent(Main.this, TeacherSchedule.class);
				startActivity(intent);
			}
		});

		Button mapButton = (Button) findViewById(R.id.map_button);
		mapButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				Intent intent = new Intent(Main.this, Map.class);
				startActivity(intent);
			}
		});
		
		Button chatButton = (Button) findViewById(R.id.chat_button);
		chatButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				Intent intent = new Intent(Main.this, Chat.class);
				startActivity(intent);
			}
		});
		
		Button showPrefs = (Button) findViewById(R.id.show_preferences);
		showPrefs.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				Intent myIntent = new Intent(view.getContext(), ShowPrefs.class);
				startActivityForResult(myIntent, 0);
			}
		});
		
	}
}