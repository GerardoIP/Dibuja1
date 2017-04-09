package com.dibuja;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.view.View;

public class DrawView extends View {
	Paint paint = new Paint();

	public DrawView(Context context) {
		super(context);
	}

	@Override
	public void onDraw(Canvas canvas) {
	   //.drawRect(left, top, right, bottom, paint)
        paint.setColor(Color.RED);
		canvas.drawRect(30, 30, 80, 80, paint);
	    paint.setColor(Color.CYAN);
		canvas.drawRect(33, 60, 77, 77, paint);
		paint.setColor(Color.YELLOW);
		canvas.drawRect(33, 33, 77, 60, paint);
		
		//.drawCircle(cx, cy, radius, paint);
		paint.setColor(Color.RED);
		canvas.drawCircle(100, 100, 20, paint);
		
		//.drawText(text, x, y, paint)
		canvas.drawText("Texto con CANVAS", 200, 30, paint);
		
		//.drawLine(startX, startY, stopX, stopY, paint)
        paint.setColor(Color.BLUE);
        canvas.drawLine(0, 0, 350, 100, paint);


		//     OCTAGONO
		paint.setColor(Color.MAGENTA);
		paint.setStrokeWidth(4);
		canvas.drawLine(180, 160, 200, 160, paint);
		canvas.drawLine(200, 160, 220, 180, paint);
		canvas.drawLine(220, 180, 220, 200, paint);
		canvas.drawLine(220, 200, 200, 220, paint);
		canvas.drawLine(200, 220, 180, 220, paint);
		canvas.drawLine(180, 220, 160, 200, paint);
		canvas.drawLine(160, 200, 160, 180, paint);
		canvas.drawLine(160, 180, 180, 160, paint);



		//      ESTRELLA
		paint.setColor(Color.BLUE);
		paint.setStrokeWidth(3);
		canvas.drawLine(300, 180, 330, 210, paint);
		canvas.drawLine(300, 180, 270, 210, paint);
		canvas.drawLine(330, 210, 360, 210, paint);
		canvas.drawLine(270, 210, 240, 210, paint);
		canvas.drawLine(360, 210, 330, 240, paint);
		canvas.drawLine(240, 210, 270, 240, paint);
		canvas.drawLine(330, 240, 350, 270, paint);
		canvas.drawLine(270, 240, 250, 270, paint);
		canvas.drawLine(350, 270, 300, 240, paint);
		canvas.drawLine(250, 270, 300, 240, paint);



		paint.setColor(Color.CYAN);
		paint.setStyle(Paint.Style.FILL);
		Path TUBO = new Path();
		TUBO.moveTo(500, 200);
		TUBO.cubicTo(500,200, 600,300, 700,200);
		TUBO.moveTo(700, 200);
		TUBO.cubicTo(700,200, 750,180, 780,300);
		TUBO.moveTo(780, 300);
		TUBO.cubicTo(780,300, 750,420, 700,400);
		TUBO.moveTo(700, 400);
		TUBO.cubicTo(700,400, 600,300, 500,400);
		TUBO.moveTo(500, 400);
		TUBO.cubicTo(500,400, 450,420, 420,300);
		TUBO.moveTo(420, 300);
		TUBO.cubicTo(420,300, 450,180, 500,200);
		paint.setStrokeWidth(4);
		paint.setStyle(Paint.Style.STROKE);
		canvas.drawPath(TUBO, paint);
		paint.setStrokeWidth(1);
		paint.setStyle(Paint.Style.FILL);
		paint.setTextSize(20);
		paint.setTypeface(Typeface.SANS_SERIF);
		canvas.drawTextOnPath("INFANZON PICAZO GERARDO 6IM7 ", TUBO, 0, 30, paint);





        Path trazo = new Path();
        trazo.addCircle(150, 450, 100, Path.Direction.CCW);
        paint.setColor(Color.BLUE);
        paint.setStrokeWidth(8);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawPath(trazo, paint);
        paint.setStrokeWidth(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setTextSize(20);
        paint.setTypeface(Typeface.SANS_SERIF);
        canvas.drawTextOnPath("Cecyt 9 \"Juan de Dios Bátiz\" graficos en Android ", trazo, 150, 40, paint);

	}

}
