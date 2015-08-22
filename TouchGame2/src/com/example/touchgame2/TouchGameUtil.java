package com.example.touchgame2;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class TouchGameUtil extends Activity{

	private static SharedPreferences pri = null;

	/**
	 * コンストラクタ
	 * @param context コンテキスト
	 */
	public TouchGameUtil(Context context){
		pri = context.getSharedPreferences("savedate",0);
	}

	/**
	 * ベストスコア取得処理
	 *
	 * @return ベストスコア
	 */
	public int getBastScore(){
		return pri.getInt("", 0);
	}

	/**
	 * ベストタイム取得処理
	 *
	 * @return ベストタイム
	 */
	public int getBastTime(){
		return pri.getInt("", 0);
	}

	/**
	 *
	 * @param score 記録
	 * @param key
	 */
	public void write(int score,String key){
		Editor edit = pri.edit();
		edit.remove(key);
		edit.putInt(key, score);
		edit.commit();
	}
}
