package com.example.personajerandom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random valorRandom = new Random();
    TextView textView1;
    TextView textView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //variables de los dos textView
        textView1 = findViewById(R.id.personaje);
        textView2 = findViewById(R.id.personaje2);
        //variables de los dos botones
    }

    public void personaje(View view){
        String elegido = "";
        int valorPersonaje = valorRandom.nextInt(12);
        switch (valorPersonaje) {
            case 0: elegido = "viper";
                break;
            case 1: elegido = "sova";
                break;
            case 2: elegido = "Breach";
                break;
            case 3: elegido = "Sage";
                break;
            case 4: elegido = "Cypher";
                break;
            case 5: elegido = "Killjoy";
                break;
            case 6: elegido = "Jett";
                break;
            case 7: elegido = "Phoenix";
                break;
            case 8: elegido = "Raze";
                break;
            case 9: elegido = "Reyna";
                break;
            case 10: elegido = "Omen";
                break;
            case 11: elegido = "Brimstone";
                break;

            default: assert(false): "hay un valor menor a 0 o mayor a 11 que fue generado";
        }
        textView1.setText(elegido);
        textView2.setText("");
    }
    public void modoDosPersonas(View view){
        String resultadoFinal;
        String elegido = "";
        String elegido2 = "";
        String VAKENSI = "vakensi: ";
        String YO = "yo: ";
        int aux = 100;
        int i = 0;
        while (i <= 1){

            int valorPersonaje = valorRandom.nextInt(12);
            if(i == 0) {
                aux = valorPersonaje;
            }
            if(i == 1 && valorPersonaje == aux){
                while(valorPersonaje == aux){
                    valorPersonaje = valorRandom.nextInt(12);
                }
            }
            if(i == 0){
                switch (valorPersonaje) {
                    case 0: elegido = "viper";
                        break;
                    case 1: elegido = "sova";
                        break;
                    case 2: elegido = "Breach";
                        break;
                    case 3: elegido = "Sage";
                        break;
                    case 4: elegido = "Cypher";
                        break;
                    case 5: elegido = "Killjoy";
                        break;
                    case 6: elegido = "Jett";
                        break;
                    case 7: elegido = "Phoenix";
                        break;
                    case 8: elegido = "Raze";
                        break;
                    case 9: elegido = "Reyna";
                        break;
                    case 10: elegido = "Omen";
                        break;
                    case 11: elegido = "Brimstone";
                        break;
                }
            }else{
                switch (valorPersonaje) {
                    case 0: elegido2 = "viper";
                        break;
                    case 1: elegido2 = "sova";
                        break;
                    case 2: elegido2 = "Breach";
                        break;
                    case 3: elegido2 = "Sage";
                        break;
                    case 4: elegido2 = "Cypher";
                        break;
                    case 5: elegido2 = "Killjoy";
                        break;
                    case 6: elegido2 = "Jett";
                        break;
                    case 7: elegido2 = "Phoenix";
                        break;
                    case 8: elegido2 = "Raze";
                        break;
                    case 9: elegido2 = "Reyna";
                        break;
                    case 10: elegido2 = "Omen";
                        break;
                    case 11: elegido2 = "Brimstone";
                        break;
                }
            }

            i++;
        }
        resultadoFinal = VAKENSI + elegido + "\n" + YO + elegido2;
        textView2.setText(resultadoFinal);
        textView1.setText("");
    }

}