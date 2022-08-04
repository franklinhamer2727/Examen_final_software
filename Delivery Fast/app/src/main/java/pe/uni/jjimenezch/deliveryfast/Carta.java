package pe.uni.jjimenezch.deliveryfast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;

import java.io.Serializable;
import java.util.ArrayList;

import pe.uni.jjimenezch.deliveryfast.factoryMethods.Pedido;

public class Carta extends AppCompatActivity {

    CheckBox plato7;
    CheckBox plato8;
    CheckBox plato9;
    CheckBox plato10;
    CheckBox plato11;
    CheckBox plato12;

    Button pedir;
    Pedido pedido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carta);

        pedido = (Pedido) getIntent().getSerializableExtra("PEDIDO");

        plato7 = findViewById(R.id.plato7);
        plato8 = findViewById(R.id.plato8);
        plato9 = findViewById(R.id.plato9);
        plato10 = findViewById(R.id.plato10);
        plato11 = findViewById(R.id.plato11);
        plato12 = findViewById(R.id.plato12);

        pedir = findViewById(R.id.pedir);


        pedir.setOnClickListener(view -> {
            Intent intent = new Intent(Carta.this, EndingActivity.class);
            int numPedidos = 0;
            ArrayList<String> listaPedidos = new ArrayList<>();
            if (plato7.isChecked()) {
                numPedidos++;
                listaPedidos.add(plato7.getText().toString());
            }
            if (plato8.isChecked()) {
                numPedidos++;
                listaPedidos.add(plato8.getText().toString());
            }
            if (plato9.isChecked()) {
                numPedidos++;
                listaPedidos.add(plato9.getText().toString());
            }
            if (plato10.isChecked()) {
                numPedidos++;
                listaPedidos.add(plato10.getText().toString());
            }
            if (plato11.isChecked()) {
                numPedidos++;
                listaPedidos.add(plato11.getText().toString());
            }
            if (plato12.isChecked()) {
                numPedidos++;
                listaPedidos.add(plato12.getText().toString());
            }

            intent.putExtra("NUM PEDIDOS", numPedidos);
            intent.putExtra("PEDIDO", pedido);
            intent.putExtra("LISTA PEDIDOS", listaPedidos);
            startActivity(intent);
        });

    }
}