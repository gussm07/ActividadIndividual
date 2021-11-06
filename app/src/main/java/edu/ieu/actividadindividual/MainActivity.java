package edu.ieu.actividadindividual;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //BUSCA LOS BOTONES PARA ESCUCHARLOS
        findViewById(R.id.button).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);
        findViewById(R.id.button3).setOnClickListener(this);
        findViewById(R.id.button4).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int color;

        View contenedor = v.getRootView();

        switch (v.getId()) {
            case R.id.button:
                color = Color.parseColor("#80CBC4"); // Verde azulado
                break;
            case R.id.button2:
                color = Color.parseColor("#A5D6A7"); // Verde
                break;
            case R.id.button3:
                color = Color.parseColor("#C5E1A5"); // Verde claro
                break;
            case R.id.button4:
                color = Color.parseColor("#E6EE9C"); // Lima
                break;
            default:
                color = Color.BLUE; // Blano
        }

        contenedor.setBackgroundColor(color);
    }
}