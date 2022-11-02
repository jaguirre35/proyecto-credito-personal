package com.example.credito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    TextView jetusuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        //Ocultar la barra del titulo y asociar los abjetos java con xml
        getSupportActionBar().hide();
        jetusuario=findViewById(R.id.tvusuario);
        String usuario;
        usuario=getIntent().getStringExtra("datos");
        jetusuario.setText(usuario);
    }

    public void creditos(View view){
        Intent intcredito=new Intent(this,CreditoActivity.class);
        startActivity(intcredito);
    }

    public void usuarios(View view){
        Intent intusuarios=new Intent(this,UsuariosActivity.class);
        startActivity(intusuarios);
    }

    public void salir(View view){
        Intent intmain=new Intent(this,MainActivity.class);
        startActivity(intmain);
    }

}