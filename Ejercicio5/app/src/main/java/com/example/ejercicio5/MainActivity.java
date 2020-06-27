package com.example.ejercicio5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText et1, et2;
    private TextView tvres;
    private CheckBox checkBox1, checkBox2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        tvres=(TextView) findViewById(R.id.tvres);
        checkBox1 =(CheckBox)findViewById(R.id.checkBox);
        checkBox2=(CheckBox)findViewById(R.id.checkBox2);
    }

public boolean onCreateOptionsMenu (Menu menu){
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

public void operar(View view){
        String valor1=et1.getText().toString();
    String valor2=et2.getText().toString();
    int nro1=Integer.parseInt(valor1);
    int nro2= Integer.parseInt(valor2);
    String resu="";
    if(checkBox1.isChecked()==true){
        int suma=nro1+nro2;
        resu="La suma es: "+ suma;

    }
    if(checkBox2.isChecked()==true){
        int resta=nro1-nro2;
        resu=resu + " La resta es: "+ resta;
    }
    tvres.setText(resu);
}
}