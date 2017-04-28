package com.foc.pmdm.testusercontrol;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.provider.CalendarContract;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * Created by javacasm on 27/04/2017.
 */

public class TweetText extends EditText {

    Paint paint=null;
    Paint paintLineas=null;
    public TweetText(Context context, AttributeSet attrs){
        super(context,attrs);

        //Inicializamos los objetos que reutilizamos

        paint=new Paint();
        paint.setTextSize(fTextSize);

        paintLineas=new Paint();
        paintLineas.setStrokeWidth(1);
        paintLineas.setStyle(Paint.Style.FILL_AND_STROKE);

    }

    float fTextSize=11;

    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);

        // Añadimos en una esquina el número de caracteres escritos

        // Obtener el número de caracteres
        String strTexto=this.getText().toString();
        int iNumeroCaracteres=strTexto.length();

        // Definimos el tipo de trazo



        // usaremos canvas.drawText
        String strNumeroCaracteres=Integer.toString(iNumeroCaracteres);
        // Queremos que salga al limite de la derecha y arriba
        canvas.drawText(strNumeroCaracteres,getWidth()-fTextSize*iNumeroCaracteres,getHeight()-fTextSize,paint);
        // Añadimos una línea abajo del texto de izq a drcha
        canvas.drawColor(Color.BLACK);
        canvas.drawLine(0,0,getWidth(),0,paintLineas);

    }

}
