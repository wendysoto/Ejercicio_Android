package com.example.propuesto11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText passwd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        passwd = (EditText)findViewById(R.id.password);
    }

    public void Validar(View view){
        String pass = passwd.getText().toString();

        if (pass.length() == 0){
            Toast.makeText(this, "Por Favor ingrese la contraseña", Toast.LENGTH_LONG).show();
        }else{
            if (pass.trim().equalsIgnoreCase("abc7991")){
                Intent i= new Intent(this, ventana2.class);
                startActivity(i);
            }else {
                Toast.makeText(this, "Contraseña Incorrecta", Toast.LENGTH_LONG).show();
            }
        }
    }

    public void ventana (View view){

        Intent i=new Intent(this, ventana2.class);
        startActivity(i);

    }



}