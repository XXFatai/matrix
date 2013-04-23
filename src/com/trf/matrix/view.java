package com.trf.matrix;

import java.math.BigDecimal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.View;

public class view extends View{

	private Bitmap mBitmap;
	private Bitmap newbmp;
	public view(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
		mBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.mole);
	}
	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
		Matrix matrix = new Matrix();
		float w=320, h=240;
		float scaleWidht = ((float) w / mBitmap.getWidth()); 
	    float scaleHeight = ((float) h / mBitmap.getHeight()); 
		matrix.postScale(scaleWidht,scaleHeight); //长和宽放大缩小的比例
		newbmp = Bitmap.createBitmap(mBitmap,0,0,mBitmap.getWidth(),mBitmap.getHeight(),matrix,true);
		canvas.drawBitmap(mBitmap, 0, 0, null);
        canvas.drawBitmap(newbmp, 0, 0, null);
	}
/*	private static Bitmap big(Bitmap bitmap) {
		  Matrix matrix = new Matrix();
		  float w=320, h=200;
		  float scaleWidht = ((float) w / bitmap.getWidth()); 
	      float scaleHeight = ((float) h / bitmap.getHeight()); 
		  matrix.postScale(scaleWidht,scaleHeight); //长和宽放大缩小的比例
		  Bitmap resizeBmp = Bitmap.createBitmap(bitmap,0,0,bitmap.getWidth(),bitmap.getHeight(),matrix,true);
		  return resizeBmp;
		 }*/
}
