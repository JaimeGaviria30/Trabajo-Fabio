package com.jg.parcial1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private CheckBox Enero;
    private CheckBox Febrero;
    private CheckBox Marzo;
    private CheckBox Abril;
    private CheckBox Mayo;
    private CheckBox Junio;
    private CheckBox Julio;
    private CheckBox Agosto;
    private CheckBox Septiembre;
    private CheckBox Octubre;
    private CheckBox Noviembre;
    private CheckBox Diciembre;
    private EditText Salario;
    private TextView Total,Prima, Cesantias,Vacaciones,Salud,Pension,Para;
    private Button CalcularJ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Salario = (EditText) findViewById(R.id.salarioI);
        Total = (TextView) findViewById(R.id.totalI);
        Prima = (TextView) findViewById(R.id.primaI);
        Cesantias = (TextView) findViewById(R.id.cesantiaI);
        Vacaciones = (TextView) findViewById(R.id.vacacionesI);
        Salud = (TextView) findViewById(R.id.saludI);
        Pension = (TextView) findViewById(R.id.PensionI);
        Para = (TextView) findViewById(R.id.paraI);
        Enero = (CheckBox) findViewById(R.id.mes1);
        Febrero =(CheckBox) findViewById(R.id.mes2);
        Marzo = (CheckBox) findViewById(R.id.mes3);
        Abril = (CheckBox) findViewById(R.id.mes4);
        Mayo = (CheckBox) findViewById(R.id.mes5);
        Junio = (CheckBox) findViewById(R.id.mes6);
        Julio = (CheckBox) findViewById(R.id.mes7);
        Agosto = (CheckBox) findViewById(R.id.mes8);
        Septiembre = (CheckBox) findViewById(R.id.mes9);
        Octubre = (CheckBox) findViewById(R.id.mes10);
        Noviembre = (CheckBox) findViewById(R.id.mes11);
        Diciembre = (CheckBox) findViewById(R.id.mes12);
        CalcularJ=findViewById(R.id.btnCalcularI);
        CalcularJ.setOnClickListener(this);

    }

    public double valorPrimaCesan(double salario, double dias,double auxT){
        double calc =0;
        calc= (salario+(auxT*dias))/360;
        return calc;
    }
    public double valorVaciones(double salario, double dias){
        double calc =0;
        calc= (salario*dias)/720;
        return calc;
    }
    public double valorSalud(double salario){
        double calc =0;
        calc= salario*0.125;
        return calc;
    }
    public double valorPension(double salario){
        double calc =0;
        calc= salario*0.16;
        return calc;
    }
    public double valorParafiscal(double salario){//Sena, cajas de compensacion e ICBF
        double calc =0;
        calc= salario*0.09;
        return calc;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnCalcularI:{
                if (Enero.isChecked()==true) {
                    Double salario = Double.parseDouble(Salario.getText().toString());
                    int dias = 30;
                    int auxT = 106454;
                    Double primacesan = valorPrimaCesan(salario, dias, auxT);
                    Double vacaciones = valorVaciones(salario,dias);
                    Double salud = valorSalud(salario);
                    Double pension = valorPension(salario);
                    Double para = valorParafiscal(salario);
                    Double total = primacesan+salario+vacaciones+salud+pension+para;

                    Prima.setText(""+ primacesan);
                    Total.setText(""+ total);
                    Cesantias.setText(""+ primacesan);
                    Vacaciones.setText(""+ vacaciones);
                    Salud.setText(""+ salud);
                    Pension.setText(""+ pension);
                    Para.setText(""+para);

                    //Toast.makeText(this, "su Prima es:" + primacesan + "su Cesantias es:" +
                           // primacesan+ "su Vaciones es:" + vacaciones+ "su Salud es:" + salud + "su Pension es:" + pension +
                          //  "su Parafiscales es:" + para +"su Total es:" + total, Toast.LENGTH_SHORT).show();
                    // Toast.makeText(this,"su IMC es:" + imc, Toast.LENGTH_LONG).show();
                }
                if (Febrero.isChecked()==true) {
                    Double salario = Double.parseDouble(Salario.getText().toString());
                    int dias = 60;
                    int auxT = 106454;
                    Double primacesan = valorPrimaCesan(salario, dias, auxT);
                    Double vacaciones = valorVaciones(salario,dias);
                    Double salud = valorSalud(salario);
                    Double pension = valorPension(salario);
                    Double para = valorParafiscal(salario);
                    Double total = primacesan+salario+vacaciones+salud+pension+para;

                    Prima.setText(""+ primacesan);
                    Total.setText(""+ total);
                    Cesantias.setText(""+ primacesan);
                    Vacaciones.setText(""+ vacaciones);
                    Salud.setText(""+ salud);
                    Pension.setText(""+ pension);
                    Para.setText(""+para);

                    //Toast.makeText(this, "su Prima es:" + primacesan + "su Cesantias es:" +
                    // primacesan+ "su Vaciones es:" + vacaciones+ "su Salud es:" + salud + "su Pension es:" + pension +
                    //  "su Parafiscales es:" + para +"su Total es:" + total, Toast.LENGTH_SHORT).show();
                    // Toast.makeText(this,"su IMC es:" + imc, Toast.LENGTH_LONG).show();;
                }
                if (Marzo.isChecked()==true) {
                    Double salario = Double.parseDouble(Salario.getText().toString());
                    int dias = 90;
                    int auxT = 106454;
                    Double primacesan = valorPrimaCesan(salario, dias, auxT);
                    Double vacaciones = valorVaciones(salario,dias);
                    Double salud = valorSalud(salario);
                    Double pension = valorPension(salario);
                    Double para = valorParafiscal(salario);
                    Double total = primacesan+salario+vacaciones+salud+pension+para;

                    Prima.setText(""+ primacesan);
                    Total.setText(""+ total);
                    Cesantias.setText(""+ primacesan);
                    Vacaciones.setText(""+ vacaciones);
                    Salud.setText(""+ salud);
                    Pension.setText(""+ pension);
                    Para.setText(""+para);

                    //Toast.makeText(this, "su Prima es:" + primacesan + "su Cesantias es:" +
                    // primacesan+ "su Vaciones es:" + vacaciones+ "su Salud es:" + salud + "su Pension es:" + pension +
                    //  "su Parafiscales es:" + para +"su Total es:" + total, Toast.LENGTH_SHORT).show();
                    // Toast.makeText(this,"su IMC es:" + imc, Toast.LENGTH_LONG).show();
                }
                if (Abril.isChecked()==true) {
                    Double salario = Double.parseDouble(Salario.getText().toString());
                    int dias = 120;
                    int auxT = 106454;
                    Double primacesan = valorPrimaCesan(salario, dias, auxT);
                    Double vacaciones = valorVaciones(salario,dias);
                    Double salud = valorSalud(salario);
                    Double pension = valorPension(salario);
                    Double para = valorParafiscal(salario);
                    Double total = primacesan+salario+vacaciones+salud+pension+para;

                    Prima.setText(""+ primacesan);
                    Total.setText(""+ total);
                    Cesantias.setText(""+ primacesan);
                    Vacaciones.setText(""+ vacaciones);
                    Salud.setText(""+ salud);
                    Pension.setText(""+ pension);
                    Para.setText(""+para);

                    //Toast.makeText(this, "su Prima es:" + primacesan + "su Cesantias es:" +
                    // primacesan+ "su Vaciones es:" + vacaciones+ "su Salud es:" + salud + "su Pension es:" + pension +
                    //  "su Parafiscales es:" + para +"su Total es:" + total, Toast.LENGTH_SHORT).show();
                    // Toast.makeText(this,"su IMC es:" + imc, Toast.LENGTH_LONG).show();
                }
                if (Mayo.isChecked()==true) {
                    Double salario = Double.parseDouble(Salario.getText().toString());
                    int dias = 150;
                    int auxT = 106454;
                    Double primacesan = valorPrimaCesan(salario, dias, auxT);
                    Double vacaciones = valorVaciones(salario,dias);
                    Double salud = valorSalud(salario);
                    Double pension = valorPension(salario);
                    Double para = valorParafiscal(salario);
                    Double total = primacesan+salario+vacaciones+salud+pension+para;



                    Prima.setText(""+ primacesan);
                    Total.setText(""+ total);
                    Cesantias.setText(""+ primacesan);
                    Vacaciones.setText(""+ vacaciones);
                    Salud.setText(""+ salud);
                    Pension.setText(""+ pension);
                    Para.setText(""+para);

                    //Toast.makeText(this, "su Prima es:" + primacesan + "su Cesantias es:" +
                    // primacesan+ "su Vaciones es:" + vacaciones+ "su Salud es:" + salud + "su Pension es:" + pension +
                    //  "su Parafiscales es:" + para +"su Total es:" + total, Toast.LENGTH_SHORT).show();
                    // Toast.makeText(this,"su IMC es:" + imc, Toast.LENGTH_LONG).show();
                }
                if (Junio.isChecked()==true) {
                    Double salario = Double.parseDouble(Salario.getText().toString());
                    int dias = 180;
                    int auxT = 106454;
                    Double primacesan = valorPrimaCesan(salario, dias, auxT);
                    Double vacaciones = valorVaciones(salario,dias);
                    Double salud = valorSalud(salario);
                    Double pension = valorPension(salario);
                    Double para = valorParafiscal(salario);
                    Double total = primacesan+salario+vacaciones+salud+pension+para;

                    Prima.setText(""+ primacesan);
                    Total.setText(""+ total);
                    Cesantias.setText(""+ primacesan);
                    Vacaciones.setText(""+ vacaciones);
                    Salud.setText(""+ salud);
                    Pension.setText(""+ pension);
                    Para.setText(""+para);

                    //Toast.makeText(this, "su Prima es:" + primacesan + "su Cesantias es:" +
                    // primacesan+ "su Vaciones es:" + vacaciones+ "su Salud es:" + salud + "su Pension es:" + pension +
                    //  "su Parafiscales es:" + para +"su Total es:" + total, Toast.LENGTH_SHORT).show();
                    // Toast.makeText(this,"su IMC es:" + imc, Toast.LENGTH_LONG).show();
                }
                if (Julio.isChecked()==true) {
                    Double salario = Double.parseDouble(Salario.getText().toString());
                    int dias = 210;
                    int auxT = 106454;
                    Double primacesan = valorPrimaCesan(salario, dias, auxT);
                    Double vacaciones = valorVaciones(salario,dias);
                    Double salud = valorSalud(salario);
                    Double pension = valorPension(salario);
                    Double para = valorParafiscal(salario);
                    Double total = primacesan+salario+vacaciones+salud+pension+para;

                    Prima.setText(""+ primacesan);
                    Total.setText(""+ total);
                    Cesantias.setText(""+ primacesan);
                    Vacaciones.setText(""+ vacaciones);
                    Salud.setText(""+ salud);
                    Pension.setText(""+ pension);
                    Para.setText(""+para);

                    //Toast.makeText(this, "su Prima es:" + primacesan + "su Cesantias es:" +
                    // primacesan+ "su Vaciones es:" + vacaciones+ "su Salud es:" + salud + "su Pension es:" + pension +
                    //  "su Parafiscales es:" + para +"su Total es:" + total, Toast.LENGTH_SHORT).show();
                    // Toast.makeText(this,"su IMC es:" + imc, Toast.LENGTH_LONG).show();
                }
                if (Agosto.isChecked()==true) {
                    Double salario = Double.parseDouble(Salario.getText().toString());
                    int dias = 240;
                    int auxT = 106454;
                    Double primacesan = valorPrimaCesan(salario, dias, auxT);
                    Double vacaciones = valorVaciones(salario,dias);
                    Double salud = valorSalud(salario);
                    Double pension = valorPension(salario);
                    Double para = valorParafiscal(salario);
                    Double total = primacesan+salario+vacaciones+salud+pension+para;

                    Prima.setText(""+ primacesan);
                    Total.setText(""+ total);
                    Cesantias.setText(""+ primacesan);
                    Vacaciones.setText(""+ vacaciones);
                    Salud.setText(""+ salud);
                    Pension.setText(""+ pension);
                    Para.setText(""+para);

                    //Toast.makeText(this, "su Prima es:" + primacesan + "su Cesantias es:" +
                    // primacesan+ "su Vaciones es:" + vacaciones+ "su Salud es:" + salud + "su Pension es:" + pension +
                    //  "su Parafiscales es:" + para +"su Total es:" + total, Toast.LENGTH_SHORT).show();
                    // Toast.makeText(this,"su IMC es:" + imc, Toast.LENGTH_LONG).show();
                }
                if (Septiembre.isChecked()==true) {
                    Double salario = Double.parseDouble(Salario.getText().toString());
                    int dias = 270;
                    int auxT = 106454;
                    Double primacesan = valorPrimaCesan(salario, dias, auxT);
                    Double vacaciones = valorVaciones(salario,dias);
                    Double salud = valorSalud(salario);
                    Double pension = valorPension(salario);
                    Double para = valorParafiscal(salario);
                    Double total = primacesan+salario+vacaciones+salud+pension+para;

                    Prima.setText(""+ primacesan);
                    Total.setText(""+ total);
                    Cesantias.setText(""+ primacesan);
                    Vacaciones.setText(""+ vacaciones);
                    Salud.setText(""+ salud);
                    Pension.setText(""+ pension);
                    Para.setText(""+para);

                    //Toast.makeText(this, "su Prima es:" + primacesan + "su Cesantias es:" +
                    // primacesan+ "su Vaciones es:" + vacaciones+ "su Salud es:" + salud + "su Pension es:" + pension +
                    //  "su Parafiscales es:" + para +"su Total es:" + total, Toast.LENGTH_SHORT).show();
                    // Toast.makeText(this,"su IMC es:" + imc, Toast.LENGTH_LONG).show();
                }
                if (Octubre.isChecked()==true) {
                    Double salario = Double.parseDouble(Salario.getText().toString());
                    int dias = 300;
                    int auxT = 106454;
                    Double primacesan = valorPrimaCesan(salario, dias, auxT);
                    Double vacaciones = valorVaciones(salario,dias);
                    Double salud = valorSalud(salario);
                    Double pension = valorPension(salario);
                    Double para = valorParafiscal(salario);
                    Double total = primacesan+salario+vacaciones+salud+pension+para;

                    Prima.setText(""+ primacesan);
                    Total.setText(""+ total);
                    Cesantias.setText(""+ primacesan);
                    Vacaciones.setText(""+ vacaciones);
                    Salud.setText(""+ salud);
                    Pension.setText(""+ pension);
                    Para.setText(""+para);

                    //Toast.makeText(this, "su Prima es:" + primacesan + "su Cesantias es:" +
                    // primacesan+ "su Vaciones es:" + vacaciones+ "su Salud es:" + salud + "su Pension es:" + pension +
                    //  "su Parafiscales es:" + para +"su Total es:" + total, Toast.LENGTH_SHORT).show();
                    // Toast.makeText(this,"su IMC es:" + imc, Toast.LENGTH_LONG).show();
                }
                if (Noviembre.isChecked()==true) {
                    Double salario = Double.parseDouble(Salario.getText().toString());
                    int dias = 330;
                    int auxT = 106454;
                    Double primacesan = valorPrimaCesan(salario, dias, auxT);
                    Double vacaciones = valorVaciones(salario,dias);
                    Double salud = valorSalud(salario);
                    Double pension = valorPension(salario);
                    Double para = valorParafiscal(salario);
                    Double total = primacesan+salario+vacaciones+salud+pension+para;

                    Prima.setText(""+ primacesan);
                    Total.setText(""+ total);
                    Cesantias.setText(""+ primacesan);
                    Vacaciones.setText(""+ vacaciones);
                    Salud.setText(""+ salud);
                    Pension.setText(""+ pension);
                    Para.setText(""+para);

                    //Toast.makeText(this, "su Prima es:" + primacesan + "su Cesantias es:" +
                    // primacesan+ "su Vaciones es:" + vacaciones+ "su Salud es:" + salud + "su Pension es:" + pension +
                    //  "su Parafiscales es:" + para +"su Total es:" + total, Toast.LENGTH_SHORT).show();
                    // Toast.makeText(this,"su IMC es:" + imc, Toast.LENGTH_LONG).show();
                }
                if (Diciembre.isChecked()==true) {
                    Double salario = Double.parseDouble(Salario.getText().toString());
                    int dias = 360;
                    int auxT = 106454;
                    Double primacesan = valorPrimaCesan(salario, dias, auxT);
                    Double vacaciones = valorVaciones(salario,dias);
                    Double salud = valorSalud(salario);
                    Double pension = valorPension(salario);
                    Double para = valorParafiscal(salario);
                    Double total = primacesan+salario+vacaciones+salud+pension+para;

                    Prima.setText(""+ primacesan);
                    Total.setText(""+ total);
                    Cesantias.setText(""+ primacesan);
                    Vacaciones.setText(""+ vacaciones);
                    Salud.setText(""+ salud);
                    Pension.setText(""+ pension);
                    Para.setText(""+para);

                    //Toast.makeText(this, "su Prima es:" + primacesan + "su Cesantias es:" +
                    // primacesan+ "su Vaciones es:" + vacaciones+ "su Salud es:" + salud + "su Pension es:" + pension +
                    //  "su Parafiscales es:" + para +"su Total es:" + total, Toast.LENGTH_SHORT).show();
                    // Toast.makeText(this,"su IMC es:" + imc, Toast.LENGTH_LONG).show();
                }

            }
        }


    }
}