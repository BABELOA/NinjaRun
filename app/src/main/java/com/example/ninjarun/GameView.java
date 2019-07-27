package com.example.ninjarun;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.AnimationDrawable;
import android.view.SurfaceView;
import android.view.SurfaceHolder;
import android.widget.ImageView;

public class GameView extends SurfaceView implements SurfaceHolder.Callback {

    public GameView(Context context){
        super(context);

        SurfaceHolder holder = super.getHolder();
        holder.addCallback(this);
    }
    @Override
    public void surfaceCreated(SurfaceHolder surfaceHolder) {

        Paint paint = new Paint();
        Canvas canvas = surfaceHolder.lockCanvas();


        // 緑のステージを作成
        paint.setColor(Color.GREEN);
        canvas.drawRect(0, super.getHeight() - 150, super.getWidth(), super.getHeight(), paint);

        // 赤の実態を作成
        paint.setColor(Color.RED);
        canvas.drawCircle(super.getWidth() / 2, super.getHeight() - 180, 30, paint);
        ImageView image = findViewById(R.id.wait);

        // 設定を返す
        surfaceHolder.unlockCanvasAndPost(canvas);

     }

    @Override
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i1, int i2) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {

    }
}
