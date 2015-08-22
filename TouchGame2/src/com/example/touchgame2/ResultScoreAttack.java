package com.example.touchgame2;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultScoreAttack extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		Intent intent = getIntent();
		TouchGameUtil util = new TouchGameUtil(this);

;;
		boolean flag = setText(intent.getIntExtra("score", 0),util.getBastScore());
	}

	public boolean setText(int befor,int after){

		TextView scoreText1 = (TextView) findViewById(R.id.text1);
		TextView scoreText2 = (TextView) findViewById(R.id.text2);
		scoreText1.setText(String.valueOf(befor));
		scoreText2.setText(String.valueOf(after));
		if(after > befor){
			new TouchGameUtil(this).write(after, "");
			return true;
		}
		return false;
	}
}
