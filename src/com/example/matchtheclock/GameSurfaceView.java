package com.example.matchtheclock;

import com.example.matchtheclock.R;

import android.R.color;
import android.R.string;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;

import android.media.MediaPlayer;

import android.net.rtp.RtpStream;
import android.provider.ContactsContract.CommonDataKinds.Im;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View.MeasureSpec;
import android.widget.Toast;
import android.annotation.SuppressLint;
import android.content.Context;;

public class GameSurfaceView extends SurfaceView implements SurfaceHolder.Callback{
	
	Bitmap [] clock;
	int cx=20;
	int cy=20;
    
    public GameSurfaceView(Context context,AttributeSet attrSet) {
		super(context,attrSet);
		getHolder().addCallback( this);
		setBackgroundResource(R.drawable.images);
        clock=new Bitmap[2];
		clock[0] = BitmapFactory.decodeResource(getResources(), R.drawable.clock1);
		clock[1] = BitmapFactory.decodeResource(getResources(), R.drawable.clock2);
    }
    
    protected void onDraw(Canvas canvas)
    {
    	super.onDraw(canvas);
    	canvas.drawBitmap(clock[0],cx,cy,null);
    	canvas.drawBitmap(clock[1],cx,cy,null);
    	
    }
    Thread t = new Thread(new Runnable(){public void run(){}});
	
	@Override
	public void surfaceCreated(SurfaceHolder holder) {
		// TODO Auto-generated method stub
		t.start();
	}

	@Override
	public void surfaceChanged(SurfaceHolder holder, int format, int width,
			int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void surfaceDestroyed(SurfaceHolder holder) {
		// TODO Auto-generated method stub
		t.interrupt();
	}
	
}
