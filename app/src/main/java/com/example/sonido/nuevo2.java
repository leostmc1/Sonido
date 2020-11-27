package com.example.sonido;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link nuevo2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class nuevo2 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    EditText txAltura,txPeso;
    TextView txResultado,txRecomendacion1,txRecomendacion2;
    Button btCalcular,btLimpiar;

    public nuevo2() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment nuevo2.
     */
    // TODO: Rename and change types and number of parameters
    public static nuevo2 newInstance(String param1, String param2) {
        nuevo2 fragment = new nuevo2();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_nuevo2, container, false);
        txAltura = (EditText) root.findViewById(R.id.txtAltura);
        txPeso = (EditText) root.findViewById(R.id.txtPeso);
        txResultado = (TextView) root.findViewById(R.id.txtResultado);
        txRecomendacion1 = (TextView) root.findViewById(R.id.txtRecomendacion1);
        txRecomendacion2 = (TextView) root.findViewById(R.id.txtRecomendacion2);
        btCalcular = (Button) root.findViewById(R.id.btnCalcular);
        btLimpiar = (Button) root.findViewById(R.id.btnLimpiar);
        btLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Limpiar();
            }
        });
        btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CalcularIMC();
            }
        });
        return root;
    }
    private void Limpiar(){
        txAltura.setText("");
        txPeso.setText("");
    }
    private void CalcularIMC(){
        if(txAltura.getText().toString().equals("")){

        }
        else{
        Double altura = Double.valueOf(txAltura.getText().toString());
        Double peso = Double.valueOf(txPeso.getText().toString());

        double IMC = peso/Math.pow(altura,2);

        txResultado.setText(MensajeIMC(IMC));

        txRecomendacion1.setText(MensajeIMC1(IMC));
        txRecomendacion2.setText(MensajeIMC2(IMC));
        }
    }

    private String MensajeIMC (double IMC){
        String mensaje = "";
        if(IMC < 16)
            mensaje = "IMC : "+String.format("%.2f",IMC)+" (PESO MUY BAJO GRAVE) ";
        else if (IMC >= 16 & IMC < 16.9)
            mensaje = "IMC : "+String.format("%.2f",IMC)+" (PESO BAJO GRAVE) ";
        else if (IMC >= 16.9 & IMC < 18.49)
            mensaje = "IMC : "+String.format("%.2f",IMC)+" (PESO BAJO) ";
        else if (IMC >= 18.49 & IMC < 24.99)
            mensaje = "IMC : "+String.format("%.2f",IMC)+" (PESO NORMAL) ";
        else if (IMC >= 24.99 & IMC < 29.99)
            mensaje = "IMC : "+String.format("%.2f",IMC)+" (SOBREPESO) ";
        else if (IMC >= 29.99 & IMC < 34.99)
            mensaje = "IMC : "+String.format("%.2f",IMC)+" (OBESIDAD GRADO I) ";
        else if (IMC >= 34.99 & IMC < 39.99)
            mensaje = "IMC : "+String.format("%.2f",IMC)+" (OBESIDAD GRADO II) ";
        else if (IMC > 40)
            mensaje = "IMC : "+String.format("%.2f",IMC)+" (OBESIDAD GRADO III) ";
        return mensaje;
    }

    private String MensajeIMC1 (double IMC){
        String mensaje = "";
        if(IMC < 16)
            mensaje = "Debererías seguir un plan alimenticio para obtener un peso apto y una correcta nutrición";
        else if (IMC >= 16 & IMC < 16.9)
            mensaje = "Debererías seguir un plan alimenticio para obtener un peso apto y una correcta nutrición";
        else if (IMC >= 16.9 & IMC < 18.49)
            mensaje = "Debererías seguir un plan alimenticio para obtener un peso apto y una correcta nutrición";
        else if (IMC >= 18.49 & IMC < 24.99)
            mensaje = "Tu peso es adecuado u óptimo para tu estatura";
        else if (IMC >= 24.99 & IMC < 29.99)
            mensaje = "Tu peso está por encima del recomendado para tu estatura";
        else if (IMC >= 29.99 & IMC < 34.99)
            mensaje = "Tu peso está por encima del recomendado para tu estatura, y además tienes probabilidades de que vaya asociado todo ello a la aparición de patologías (colesterol, Trigliéridos, hipertensión, diabetes tipoII, etc)";
        else if (IMC >= 34.99 & IMC < 39.99)
            mensaje = "Tu peso está por encima del recomendado para tu estatura, y además tienes probabilidades de que vaya asociado todo ello a la aparición de patologías (colesterol, Trigliéridos, hipertensión, diabetes tipoII, etc)";
        else if (IMC > 40)
            mensaje = "Tu peso está por encima del recomendado para tu estatura, y además tienes probabilidades de que vaya asociado todo ello a la aparición de patologías (colesterol, Trigliéridos, hipertensión, diabetes tipoII, etc)";
        return mensaje;
    }

    private String MensajeIMC2 (double IMC){
        String mensaje = "";
        if(IMC < 16)
            mensaje = "RECOMENDACIONES: Consume mas calorias y proteinas, aumenta la frecuencia de tus comidas y no beber líquidos antes de comer";
        else if (IMC >= 16 & IMC < 16.9)
            mensaje = "RECOMENDACIONES: Consume mas calorias y proteinas, aumenta la frecuencia de tus comidas y no beber líquidos antes de comer";
        else if (IMC >= 16.9 & IMC < 18.49)
            mensaje = "RECOMENDACIONES: Consume mas calorias y proteinas, aumenta la frecuencia de tus comidas y no beber líquidos antes de comer";
        else if (IMC >= 18.49 & IMC < 24.99)
            mensaje = "RECOMENDACIONES: Continua con tu alimentacion saludable y ejercitandote";
        else if (IMC >= 24.99 & IMC < 29.99)
            mensaje = "RECOMENDACIONES: Limita el consumo de alimentos que sean ricos en azúcares y grasas, come verduras y frutas, realiza actividad fisica y no fumes";
        else if (IMC >= 29.99 & IMC < 34.99)
            mensaje = "RECOMENDACIONES: Limita el consumo de alimentos que sean ricos en azúcares y grasas, come verduras y frutas, realiza actividad fisica y no fumes";
        else if (IMC >= 34.99 & IMC < 39.99)
            mensaje = "RECOMENDACIONES: Limita el consumo de alimentos que sean ricos en azúcares y grasas, come verduras y frutas, realiza actividad fisica y no fumes";
        else if (IMC > 40)
            mensaje = "RECOMENDACIONES: Limita el consumo de alimentos que sean ricos en azúcares y grasas, come verduras y frutas, realiza actividad fisica y no fumes";
        return mensaje;
    }
}