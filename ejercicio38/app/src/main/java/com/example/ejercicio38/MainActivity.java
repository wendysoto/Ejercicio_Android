package com.example.ejercicio38;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
        pantallaImagenView layout =new pantallaImagenView(this);
        setContentView(layout);

    }

    public class pantallaImagenView extends View{
        Drawable imagen;
        public pantallaImagenView(Context context){
            super(context);
            imagen=context.getResources().getDrawable(R.drawable.img1);
        }
        protected void onDraw (Canvas canvas){
            canvas.drawRGB(57,97,157);
            Paint paint=new Paint();
            paint.setAntiAlias(true);
            int ancho=canvas.getWidth();
            int alto=canvas.getHeight();
            Bitmap bmp= BitmapFactory.decodeResource(getResources(),
                    R.drawable.img1);
            canvas.drawBitmap(bmp, (ancho-250)/3, (alto-200)/3,null);
        }


    }

    /*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout layout1=(RelativeLayout) findViewById(R.id.layout1);
        Lienzo fondo=new Lienzo (this);
        layout1.addView(fondo);
        getSupportActionBar().hide();
    }

    public boolean onCreateOptionsMenu(Menu menu ){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    public boolean onOptionsItemSelected (MenuItem item){
        int id=item.getItemId();
        if(id==R.id.action_settings){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

     class Lienzo extends View {
        public Lienzo (Context context){
            super(context);
        }
        protected void onDraw(Canvas canvas){
            canvas.drawRGB(0,0,255);
            int ancho=canvas.getWidth();
            int alto=canvas.getHeight();
            Bitmap bmp= BitmapFactory.decodeResource(getResources(),
                    R.drawable.img1);
            canvas.drawBitmap(bmp, (ancho-250)/2, (alto-200)/2,null);

        }
    }*/
}