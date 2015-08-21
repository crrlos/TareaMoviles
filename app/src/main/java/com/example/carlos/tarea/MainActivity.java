package com.example.carlos.tarea;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    static final int KEY_SUMAR = 1;
    static final int KEY_RESTAR = 2;
    static final int KEY_MULTIPLICAR = 3;
    static final int KEY_DIVIDIR = 4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);
    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

      switch (keyCode){
          case KeyEvent.KEYCODE_S: {
              Intent sumar = new Intent(this, Suma.class);
              startActivityForResult(sumar, KEY_SUMAR);
              break;
          }
          case KeyEvent.KEYCODE_R: {
              Intent restar = new Intent(this, Resta.class);
              startActivityForResult(restar, KEY_RESTAR);
              break;
          }
          case KeyEvent.KEYCODE_M: {
              Intent multiplicar = new Intent(this, Multiplicacion.class);
              startActivityForResult(multiplicar, KEY_MULTIPLICAR);
              break;
          }
          case KeyEvent.KEYCODE_D: {
              Intent dividir = new Intent(this, Division.class);
              startActivityForResult(dividir, KEY_DIVIDIR);
              break;
          }

      }
        return super.onKeyDown(keyCode, event);
    }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode){
            case KEY_SUMAR:
                Toast.makeText(getApplicationContext(),data.getExtras().getString("result"),Toast.LENGTH_SHORT).show();
                break;
            case KEY_RESTAR:
                Toast.makeText(getApplicationContext(),data.getExtras().getString("result"),Toast.LENGTH_SHORT).show();
                break;
            case KEY_MULTIPLICAR:
                Toast.makeText(getApplicationContext(),data.getExtras().getString("result"),Toast.LENGTH_SHORT).show();
                break;
            case KEY_DIVIDIR:
                Toast.makeText(getApplicationContext(),data.getExtras().getString("result"),Toast.LENGTH_SHORT).show();
                break;

        }
    }
}
