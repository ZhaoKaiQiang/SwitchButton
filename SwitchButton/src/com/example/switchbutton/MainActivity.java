package com.example.switchbutton;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.switchbutton.SwitchButton.OnChangeListener;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		SwitchButton sb = (SwitchButton) findViewById(R.id.wiperSwitch1);
		sb.setOnChangeListener(new OnChangeListener() {

			@Override
			public void onChange(SwitchButton sb, boolean state) {
				Toast.makeText(MainActivity.this, state ? "¿ª" : "¹Ø",
						Toast.LENGTH_SHORT).show();
			}
		});
	}
}
