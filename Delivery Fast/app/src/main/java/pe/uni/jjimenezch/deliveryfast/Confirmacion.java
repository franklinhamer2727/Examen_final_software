package pe.uni.jjimenezch.deliveryfast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Confirmacion extends AppCompatActivity {

    Button buttom_nuevo;
    Button buttom_salir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacion);

        buttom_nuevo = findViewById(R.id.buttom_nuevo);
        buttom_salir = findViewById(R.id.buttom_salir);






        buttom_nuevo.setOnClickListener(view -> {
            Intent intent1 = new Intent(Confirmacion.this,MainActivity.class);
            startActivity(intent1);

        });

        buttom_salir.setOnClickListener(view -> finish());
    }
}