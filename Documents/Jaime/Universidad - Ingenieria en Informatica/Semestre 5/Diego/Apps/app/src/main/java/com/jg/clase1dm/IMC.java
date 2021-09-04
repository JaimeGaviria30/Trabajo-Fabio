package com.jg.clase1dm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class IMC extends AppCompatActivity implements View.OnClickListener {
    //implements me permite llamar al metodo onclick

    EditText txtAltura;
    EditText txtPeso;
    Button BtnCalcularIMC;
    private String nombreUsuario;

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);
        txtAltura = findViewById(R.id.editTextAltura);
        txtPeso = findViewById(R.id.editTextPeso);
        BtnCalcularIMC = findViewById(R.id.BtnCalcular);
        BtnCalcularIMC.setOnClickListener(this);
        Intent intent = getIntent();
        nombreUsuario = intent.getStringExtra("nombreUsuario");
        /*txtPeso.setOnClickListener(this);
            txtAltura.setOnClickListener(this);*/

    }

    public double calcularImc(double peso, double altura){
        double imc =0;
        imc= peso/(altura*altura);
        return imc;
    }

    @Override
    public void onClick(View var1) {
        switch (var1.getId()){
            case R.id.BtnCalcular:{
                Double peso = Double.parseDouble(txtPeso.getText().toString());
                Double altura = Double.parseDouble((txtAltura.getText().toString()));
                Double imc = calcularImc(peso, altura);
                Toast.makeText(this,"su IMC es:" + imc, Toast.LENGTH_LONG).show();

            }
        }
    }
}