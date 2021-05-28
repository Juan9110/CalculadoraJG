package com.juan.calculadorajg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button  btn_suma;
    private Button  btn_resta;
    private Button  btn_divicion;
    private Button  btn_multiplicasion;

    private TextView text_respuesta;

    private EditText edit_numero_uno;
    private EditText edit_numero_dos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        btn_suma = findViewById(R.id.button_suma);
        btn_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer numero1 = Integer.parseInt(edit_numero_uno.getText().toString());
                Integer numero2 = Integer.parseInt(edit_numero_dos.getText().toString());
                Integer resultado =  suma(numero1, numero2);
               text_respuesta.setText( Integer.toString(resultado) );
            }
        });

        btn_resta = findViewById(R.id.button_resta);
        btn_resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer numero1 = Integer.parseInt(edit_numero_uno.getText().toString());
                Integer numero2 = Integer.parseInt(edit_numero_dos.getText().toString());
                Integer resultado =  resta(numero1, numero2);
                text_respuesta.setText( Integer.toString(resultado) );
            }
        });
        btn_divicion = findViewById(R.id.button_division);
        btn_divicion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edit_numero_uno.getText().toString().equals("") || edit_numero_dos.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Introduce dos números", Toast.LENGTH_SHORT).show();
                }else{
                    Integer numero1 = Integer.parseInt(edit_numero_uno.getText().toString());
                    Integer numero2 = Integer.parseInt(edit_numero_dos.getText().toString());
                    Integer resultado;

                    if(numero2 != 0){
                        resultado =  division(numero1, numero2);
                        text_respuesta.setText( Integer.toString(resultado) );
                    }else{
                        Toast.makeText(MainActivity.this, "No se puede dividir por cero", Toast.LENGTH_SHORT).show();
                    }
                }


            }
        });

        btn_multiplicasion = findViewById(R.id.button_multiplicasion);
        btn_multiplicasion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer numero1 = Integer.parseInt(edit_numero_uno.getText().toString());
                Integer numero2 = Integer.parseInt(edit_numero_dos.getText().toString());
                Integer resultado = multiplicasion(numero1, numero2);
                text_respuesta.setText( Integer.toString(resultado) );
            }
        });

        text_respuesta = findViewById(R.id.respuesta);

        edit_numero_uno = findViewById(R.id.numero1);
        edit_numero_dos = findViewById(R.id.numero2);


    }

    public int suma(int a, int b){
        return a+b;
    }

    public int resta (int a, int b){
        return a-b;
    }

    public int division (int a, int b){
        return a/b;

    }

    public int multiplicasion (int a, int b){
        return a*b;
    }


}