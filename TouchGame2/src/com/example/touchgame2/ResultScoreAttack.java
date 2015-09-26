package com.example.touchgame2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class ResultScoreAttack extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.touch_result_score_atack);

		Button button = new Button(this);
        button.setOnClickListener(this);
	}


	@Override
	public void onClick(View v) {
		Intent intent = new Intent();

		switch(v.getId()){
		case R.id.btn_retry:
			finish();
//			intent.setClassName("", "");
//			startActivity(intent);
			break;
		case R.id.btn_modeSelect:
			finish();
//			intent.setClassName("", "");
//			startActivity(intent);
			break;

		default:
			// TODO ‰½‚à‚µ‚È‚¢
		}
	}



	@Override
	protected void onStart(){
		super.onStart();

		View imegNew = (View) findViewById(R.id.img_newResult);
		imegNew.setVisibility(View.INVISIBLE);
		Intent intent = getIntent();
		TouchGameUtil util = new TouchGameUtil(this);

		int newScore = intent.getIntExtra("score", 60);
		int bestScore = util.getBastScore();

		TextView newScoreText = (TextView) findViewById(R.id.lbl_newResult);
		TextView bestScoreText = (TextView) findViewById(R.id.lbl_bestScore);

		newScoreText.setText(String.valueOf(newScore));
		bestScoreText.setText(String.valueOf(bestScore));

		if(bestScore < newScore){
			// TODO ’è”ƒNƒ‰ƒX‚©‚çŽæ“¾
			util.write(newScore, "");
			imegNew.setVisibility(View.VISIBLE);
		}

	}
}
