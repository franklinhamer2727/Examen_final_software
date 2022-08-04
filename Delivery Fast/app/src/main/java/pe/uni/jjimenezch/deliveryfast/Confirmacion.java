package pe.uni.jjimenezch.deliveryfast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Confirmacion extends AppCompatActivity {

    Button buttom_nuevo;
    Button buttom_salir;
    TextView textViewMonto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacion);
        Resources res = getResources();
        buttom_nuevo = findViewById(R.id.buttom_nuevo);
        buttom_salir = findViewById(R.id.buttom_salir);
        textViewMonto = findViewById(R.id.textview_confirmacion_3);

        textViewMonto.setText(String.format(res.getString(R.string.monto), getIntent().getStringExtra("MONTO FINAL")));
        buttom_nuevo.setOnClickListener(view -> {
            Intent intent1 = new Intent(Confirmacion.this, MainActivity.class);
            startActivity(intent1);
            finish();
        });

        buttom_salir.setOnClickListener(view -> {
            moveTaskToBack(true);
            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(1);
        });
    }
}