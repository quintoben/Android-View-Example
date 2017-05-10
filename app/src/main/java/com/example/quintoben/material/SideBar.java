package com.example.quintoben.material;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

/**
 * Created by quintoben on 5/7/17.
 */

public class SideBar extends View {

	public static String[] letter = { "☆","A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q",
			"R", "S", "T", "U", "V", "W", "X", "Y", "Z", "#" };
	private Paint paint = new Paint();

	private float letterHeight;

	public SideBar(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	//constructor
	public SideBar(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public SideBar(Context context) {
		super(context);
	}

	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		//get view height and width
		int height = getHeight();
		int width = getWidth();

		// get single letter height
		letterHeight = (height * 1f) / letter.length;
		//set the letter height be 5/6
		letterHeight = (height * 1f - letterHeight / 2) / letter.length * 5/6;
		for (int i = 0; i < letter.length; i++) {
			paint.setColor(Color.BLACK);
//			paint.setTypeface(Typeface.DEFAULT_BOLD);
			paint.setAntiAlias(true);
			paint.setTextSize(30);

			// x pos=view mid - letter mid to set letter to be centered
			float xPos = width / 2 - paint.measureText(letter[i]) / 2;
			float yPos = letterHeight * i + letterHeight;
			canvas.drawText(letter[i], xPos, yPos, paint);
			paint.reset();
		}

	}

}