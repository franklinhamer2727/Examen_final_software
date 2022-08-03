package pe.uni.jjimenezch.deliveryfast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;

public class Menu extends AppCompatActivity {


    CheckBox plato1;
    CheckBox plato2;
    CheckBox plato3;
    CheckBox plato4;
    CheckBox plato5;
    CheckBox plato6;

    Button pedir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        plato1=findViewById(R.id.plato1);
        plato2=findViewById(R.id.plato2);
        plato3=findViewById(R.id.plato3);
        plato4=findViewById(R.id.plato4);
        plato5=findViewById(R.id.plato5);
        plato6=findViewById(R.id.plato6);

        pedir = findViewById(R.id.pedir);







    }
}