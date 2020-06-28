package com.example.ejercicio33;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*setContentView(R.layout.activity_main);
        RelativeLayout layout1 = (RelativeLayout) findViewById(R.id.layout1);
        Canvas fondo = new Canvas(this);
        layout1.addView(fondo);*/
        RelativeLayout layout1 = (RelativeLayout) findViewById(R.id.layout1);
        DimensionesView dimensiones=new DimensionesView(this);
        setContentView(dimensiones);

    }
    class DimensionesView  extends View{
        public DimensionesView (Context context){
            super(context);
        }
        protected void onDraw (Canvas canvas){
            super.onDraw(canvas);
            int ancho =getWidth();
            int alto=getHeight();

            canvas.drawColor(Color.GRAY);

            Paint paint =new Paint();
            paint.setAntiAlias(true);
            paint.setStyle(Style.STROKE);

            paint.setColor(Color.WHITE);
            for (int f = 0; f < 10; f++) {
                canvas.drawCircle(ancho / 2, alto / 2, f * 15, paint);
            }

        }
    }

}

