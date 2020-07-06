package com.appfrasesdodia.pedrapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
        public void selecionadoPedra(View view){
            this.opcaoSelecionada("pedra");
        }

    public void selecionadoPapel(View view){
        this.opcaoSelecionada("papel");
    }

    public void selecionadoTesoura(View view){
        this.opcaoSelecionada("tesoura");
    }

        public void opcaoSelecionada(String opSelecionado){

            ImageView imageResults  = findViewById(R.id.imageResultado);
            TextView textoResults = findViewById(R.id.textResultado);


            int numero  = new Random().nextInt(3);

            String[] opcoes = {"pedra", "papel", "tesoura"};

            String opcaoApp = opcoes[numero];

            switch (opcaoApp){
                case "pedra":
                    imageResults.setImageResource(R.drawable.pedra);
                break;
                case "papel":
                    imageResults.setImageResource(R.drawable.papel);
                    break;
                case "tesoura":
                    imageResults.setImageResource(R.drawable.tesoura);
                    break;
            }


            if(
                    (opcaoApp == "tesoura" && opSelecionado == "papel") ||
                    (opcaoApp == "papel" && opSelecionado == "pedra") ||
                    (opcaoApp == "pedra" && opSelecionado == "tesoura")

            ){
                textoResults.setText("Que Triste você Perdeu. :(");

            }else if(
                (opSelecionado == "tesoura" && opcaoApp == "papel") ||
                (opSelecionado == "papel" && opcaoApp == "pedra") ||
                (opSelecionado == "pedra" && opcaoApp == "tesoura")
            ){
                textoResults.setText("Parabéns Voce Ganhou!");
            }else{
                textoResults.setText("Empate Técnico.");
            }
        }


}
