package com.nickfrost.infosystem;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TeacherSchedule extends Supplementary {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.teacher_schedule);
		Button backButton = (Button)findViewById(R.id.back_button);
        backButton.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				finish();
			}
		});
	}

}
