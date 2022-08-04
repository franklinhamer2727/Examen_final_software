package pe.uni.jjimenezch.deliveryfast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.Button;

import java.io.Serializable;

import pe.uni.jjimenezch.deliveryfast.factoryMethods.GetPedido;
import pe.uni.jjimenezch.deliveryfast.factoryMethods.Pedido;

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
            //Se crea el pedido
            GetPedido ido = new GetPedido();
            Pedido pedido = ido.getPedido("Menu");

            //Se inicializa el intent
            Intent intent = new Intent(MainActivity.this,Menu.class);
            intent.putExtra("PEDIDO", pedido);
            startActivity(intent);
        });

        boton2.setOnClickListener(view -> {
            //Se crea el pedido
            GetPedido ido = new GetPedido();
            Pedido pedido = ido.getPedido("Carta");

            //Se inicializa el intent
            Intent intent = new Intent(MainActivity.this,Carta.class);
            intent.putExtra("PEDIDO", pedido);
            startActivity(intent);

        });
    }
}