package pe.uni.jjimenezch.deliveryfast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;

public class Carta extends AppCompatActivity {

    CheckBox plato7;
    CheckBox plato8;
    CheckBox plato9;
    CheckBox plato10;
    CheckBox plato11;
    CheckBox plato12;

    Button pedir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carta);


        plato7=findViewById(R.id.plato7);
        plato8=findViewById(R.id.plato8);
        plato9=findViewById(R.id.plato9);
        plato10=findViewById(R.id.plato10);
        plato11=findViewById(R.id.plato11);
        plato12=findViewById(R.id.plato12);

        pedir = findViewById(R.id.pedir);


        pedir.setOnClickListener(view -> {
            Intent intent4 = new Intent(Carta.this,EndingActivity.class);
            startActivity(intent4);
        });

    }
}