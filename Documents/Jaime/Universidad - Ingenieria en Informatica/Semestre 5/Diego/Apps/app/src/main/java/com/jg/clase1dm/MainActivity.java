package com.jg.clase1dm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnIMC;
    private Button btnCalc;
    private Button btnConv;
    private EditText TxtNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCalc = findViewById(R.id.btnCalculator);
        btnIMC = findViewById(R.id.btnCalcularIMC);
        btnConv = findViewById(R.id.btnConversor);
        TxtNombre = findViewById(R.id.txtUsuario);
        btnIMC.setOnClickListener(this);
        btnCalc.setOnClickListener(this);
        btnConv.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.btnCalcularIMC:
                Toast.makeText(this,"IMC",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this,IMC.class);
                intent.putExtra("nombreUsuario", TxtNombre.getText().toString());
                startActivity(intent);
                break;
            case R.id.btnConversor:
                Toast.makeText(this,"Conversor",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnCalculator:
                Toast.makeText(this,"Calculadora",Toast.LENGTH_SHORT).show();
                break;
        }
    }

   /* EditText txtAltura;
    EditText txtPeso;
    Button BtnCalcularIMC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);
        txtAltura = findViewById(R.id.editTextAltura);
        txtPeso = findViewById(R.id.editTextPeso);
        BtnCalcularIMC = findViewById(R.id.BtnCalcular);
        BtnCalcularIMC.setOnClickListener(this);
        /*txtPeso.setOnClickListener(this);
            txtAltura.setOnClickListener(this);

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

*/

}