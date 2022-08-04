package pe.uni.jjimenezch.deliveryfast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;

import java.io.Serializable;
import java.util.ArrayList;

import pe.uni.jjimenezch.deliveryfast.factoryMethods.Pedido;

public class Menu extends AppCompatActivity {


    CheckBox plato1;
    CheckBox plato2;
    CheckBox plato3;
    CheckBox plato4;
    CheckBox plato5;
    CheckBox plato6;

    Button pedir;
    Pedido pedido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        plato1 = findViewById(R.id.plato1);
        plato2 = findViewById(R.id.plato2);
        plato3 = findViewById(R.id.plato3);
        plato4 = findViewById(R.id.plato4);
        plato5 = findViewById(R.id.plato5);
        plato6 = findViewById(R.id.plato6);

        pedir = findViewById(R.id.pedir);

        pedido = (Pedido) getIntent().getSerializableExtra("PEDIDO");

        pedir.setOnClickListener(view -> {
            Intent intent = new Intent(Menu.this, EndingActivity.class);
            int numPedidos = 0;
            ArrayList<String> listaPedidos = new ArrayList<>();
            if (plato1.isChecked()) {
                numPedidos++;
                listaPedidos.add(plato1.getText().toString());
            }
            if (plato2.isChecked())  {
                numPedidos++;
                listaPedidos.add(plato2.getText().toString());
            }
            if (plato3.isChecked())  {
                numPedidos++;
                listaPedidos.add(plato3.getText().toString());
            }
            if (plato4.isChecked())  {
                numPedidos++;
                listaPedidos.add(plato4.getText().toString());
            }
            if (plato5.isChecked())  {
                numPedidos++;
                listaPedidos.add(plato5.getText().toString());
            }
            if (plato6.isChecked())  {
                numPedidos++;
                listaPedidos.add(plato6.getText().toString());
            }

            intent.putExtra("NUM PEDIDOS", numPedidos);
            intent.putExtra("PEDIDO", pedido);
            intent.putExtra("LISTA PEDIDOS", listaPedidos);
            startActivity(intent);
        });


    }
}