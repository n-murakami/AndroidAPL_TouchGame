package jp.co.android.touchgame;

import jp.co.android.touchgame.constant.TouchGameConst;
import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;

public class GameScoreAttack extends Activity {

    /**
     * スコアアタック画面の初期処理
     */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
        // ************************************************************
        // 処理①：スコアアタック画面の表示設定　Start
        // ************************************************************

        // ActivityクラスのonCreateメソッド呼び出し
        super.onCreate(savedInstanceState);
        // 画面表示次のレイアウトを設定
        setContentView(R.layout.touch_game_score_attack);
        // 画面タイトルの設定
        setTitle(TouchGameConst.TITLE_TOUCHGAME);

        // ************************************************************
        // 処理①：スコアアタック画面の表示設定　End
        // ************************************************************
	}

    /**
     * スコアアタック画面の画面表示時処理
     */
    @Override
    protected void onStart() {

        // ************************************************************
        // 処理②：画面表示時の処理　Start
        // ************************************************************

    	// ActivityクラスのonStartメソッド呼び出し
    	super.onStart();

    	// 制限時間の初期値を取得


    	// 次表示ボタン押下時のスコア（スコア初期値 + 1）を取得


    	// 0～8の範囲で乱数を取得（次表示ボタンを特定）


    	// スコア表示ラベルにスコアの初期値を設定


    	// タイマー表示ラベルに取得した制限時間を設定


    	// 次表示ボタンのtextに取得したスコアを設定


    	// 次表示ボタンを表示

        // ************************************************************
        // 処理②：画面表示時の処理　End
        // ************************************************************

    }

    /**
     * タイマースタート処理処理
     */
    @Override
    protected void onResume() {

        // ************************************************************
        // 処理②：タイマースタート処理　Start
        // ************************************************************

    	// ActivityクラスのonResumeメソッド呼び出し
        super.onResume();

        // タイマーのスタート

        // ************************************************************
        // 処理②：タイマースタート処理　End
        // ************************************************************
    }

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
