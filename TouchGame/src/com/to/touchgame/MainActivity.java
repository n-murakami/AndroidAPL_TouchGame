package com.to.touchgame;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	
		//Viewをセットする
    LinearLayout l = new LinearLayout(this);
    setContentView(l);
    l.addView(new GameView(this));
    }
}
