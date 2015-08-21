package com.example.carlos.tarea;

import java.util.Date;
import java.util.Random;

/**
 * Created by Carlos on 21/08/2015.
 */
public class GeneradorNumerosAleatorios {

    public static int generarNumero(){
        Date date = new Date();


       Random r = new Random();
        r.setSeed((long)(r.nextDouble()*1000000000));


        return (int)(r.nextDouble()*100);

    }


}
