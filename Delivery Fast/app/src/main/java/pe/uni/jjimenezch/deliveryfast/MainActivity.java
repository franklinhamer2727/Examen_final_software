package pe.uni.jjimenezch.deliveryfast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button boton1;
    Button boton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton1 = findViewById(R.id.boton1);
        boton2 = findViewById(R.id.boton2);

        boton1.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,Menu.class);
            startActivity(intent);
        });

        boton2.setOnClickListener(view -> {
            Intent intent2 = new Intent(MainActivity.this,Carta.class);
            startActivity(intent2);
        });

    }
}