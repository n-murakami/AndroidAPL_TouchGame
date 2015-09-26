package com.example.touchgame2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ModeSelect extends Activity implements OnClickListener{
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.touch_mode_select);

		Button button = new Button(this);
        button.setOnClickListener(this);
	}


	@Override
	public void onClick(View v) {
		Intent intent = new Intent();
		switch(v.getId()){
		case R.id.btn_scoreAtack:
			intent.setClassName("", "");
			startActivity(intent);
			break;
		case R.id.btn_timeAtack:
			intent.setClassName("", "");
			startActivity(intent);
			break;
		case R.id.btn_bestScore:
			intent.setClassName("", "");
			startActivity(intent);
			break;
			default:
		}
	}
}
