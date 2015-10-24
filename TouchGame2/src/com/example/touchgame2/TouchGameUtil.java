package com.example.touchgame2;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class TouchGameUtil extends Activity{

	private static SharedPreferences pri = null;

	/**
	 * �R���X�g���N�^
	 * @param context �R���e�L�X�g
	 */
	public TouchGameUtil(Context context){
		pri = context.getSharedPreferences("savedate",0);
	}

	/**
	 * �x�X�g�X�R�A�擾����
	 *
	 * @return �x�X�g�X�R�A
	 */
	public int getBastScore(){
		return pri.getInt("", 60);
	}


	/**
	 * �x�X�g�^�C���擾����
	 *
	 * @return �x�X�g�^�C��
	 */
	public long getBastTime(){
		return pri.getInt("", 60);
	}

	/**
	 * �X�R�A�ۑ�
	 * @param score �L�^
	 * @param key
	 */
	public void write(int score,String key){
		Editor edit = pri.edit();
		edit.remove(key);
		edit.putInt(key, score);
		edit.commit();
	}

	/**
	 * �X�R�A�ۑ�
	 * @param score �L�^
	 * @param key
	 */
	public void write(long score,String key){
		Editor edit = pri.edit();
		edit.remove(key);
		edit.putLong(key, score);
		edit.commit();
	}
}
