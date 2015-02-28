package com.to.touchgame;

import java.util.Random;

import com.to.game.R;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;


// ゲーム画面描画クラス
public class GameView extends View{
	// ゲームエリア最上部
	int MIN_AREA_Y = 800-480; //GameView以外に定義する　現在の値は仮
	private Paint paint = new Paint();
	//画像読み込み
    private Resources res = this.getContext().getResources();
    private final Bitmap IMG_BOARD = BitmapFactory.decodeResource(res, R.drawable.buttan);
	//Randomクラスのインスタンス化
    Random rnd = new Random();

    // 正当数のカウント
    int count;

    class Buttan{
    	int x;
    	int y;
        boolean next;
        boolean flag;
    }
    Buttan buttan[] =new Buttan[9];
	
    // コンストラクタ
	public GameView(Context context) {
		super(context);
	}
	// 初期化
	void ini(){
		for(int i=0;i<9;i++){
			buttan[i].x=160 *(i+1);
			buttan[i].y=MIN_AREA_Y + 160 *(1+(i/3));
			buttan[i].next=false;
			buttan[i].flag=false;
		}
	}
	
	// 描画処理
    @Override
	public void onDraw(Canvas c){
    	for(int i= 0; i<10 ; i++ ){
    		if(buttan[i].flag){
    			c.drawBitmap(IMG_BOARD,buttan[i].x,buttan[i].y, paint);
    		}
    	}
    	
    }
    
    
    public boolean onTouchEvent(MotionEvent me) {
        //タッチされた時
    	
    	int x = (int)me.getX()/(480/3);
        int y = (int)(me.getY() - MIN_AREA_Y)/(480/3);
        int on = x + (y * 3);
        if(me.getAction()==MotionEvent.ACTION_DOWN) {
        	if(y < 0){ 
        			if(buttan[on].next){
        				buttan[on].next=false;
        				buttan[on].flag=false;
        				count++;
        				int temp = randam();
        				buttan[temp].next = true;
        				buttan[temp].flag = true;
        				}
        			}
        	}
        return true;
    }

    
    // 乱数生成
    private int randam(){
    	return rnd.nextInt(9);	 
    }
}
