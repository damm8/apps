package com.company.contadordeclics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int contador;
    TextView contadorDeClics;
    Button augmentarElContador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contadorDeClics = findViewById(R.id.contadorDeClics);
        augmentarElContador = findViewById(R.id.augmentarElContador);

        augmentarElContador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador++;
                contadorDeClics.setText("Has clicado " + contador + " veces");
            }
        });
    }
}

/*

// Con ViewBinding

public class MainActivity extends AppCompatActivity {

   int contador;
   ActivityMainBinding binding;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       binding = ActivityMainBinding.inflate(getLayoutInflater());
       setContentView(binding.getRoot());

       binding.augmentarElContador.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               contador++;
               binding.contadorDeClics.setText("Has clicado " + contador + " veces");
           }
       });
   }
}

 */