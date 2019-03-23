package com.example.ninjarun;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;


/**
 * クリエイトバイ鈴木弦２０１９年３月２４日
 * top画面を表示させるclass
 */
public class TopView extends View {
    private Bitmap background;
    private Bitmap StartBtn;
    private Bitmap ContnBtn;







    /**
     * defaultコンストラクタ
     * @param context
     */
    public TopView(Context context) {
        super(context);
        Resources res = this.getContext().getResources();
        //背景を設定
        this.background = BitmapFactory.decodeResource(res,R.drawable.ヨシヒコ);
        //スタートボタン
        StartBtn =  BitmapFactory.decodeResource(res,R.drawable.ヨシヒコ);
        //コンテニューボタン
        ContnBtn = BitmapFactory.decodeResource(res,R.drawable.ヨシヒコ);
    }
}
