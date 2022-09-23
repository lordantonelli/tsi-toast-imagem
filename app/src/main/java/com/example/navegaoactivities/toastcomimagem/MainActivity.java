package com.example.navegaoactivities.toastcomimagem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Criando a variável que vai armazenar a imagem
        ImageView img = new ImageView(getApplicationContext());
        // Ajusta a escala da imagem na tela
        img.setScaleY(0.5F);
        img.setScaleX(0.5F);
        // Carregando a imagem em drawable na variável acima
        img.setImageResource(R.drawable.logo_ufms);
        // Criando um Toast vazio
        Toast t = new Toast(getApplicationContext());
        // Definindo a duração do toast
        t.setDuration(Toast.LENGTH_LONG);
        // Definindo a imagem no toast
        t.setView(img);
        // Exibindo o toast
        t.show();
    }
}

