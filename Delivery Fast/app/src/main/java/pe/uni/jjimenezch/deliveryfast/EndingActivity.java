package pe.uni.jjimenezch.deliveryfast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import pe.uni.jjimenezch.deliveryfast.Command.GestorTareas;
import pe.uni.jjimenezch.deliveryfast.Command.Plato;
import pe.uni.jjimenezch.deliveryfast.Command.SuperTarea;
import pe.uni.jjimenezch.deliveryfast.Command.TareaListarPlato;
import pe.uni.jjimenezch.deliveryfast.Command.TareaRegistrarPlato;
import pe.uni.jjimenezch.deliveryfast.bridge.Consumo;
import pe.uni.jjimenezch.deliveryfast.bridge.MetodoPago;
import pe.uni.jjimenezch.deliveryfast.bridge.Tarjeta;
import pe.uni.jjimenezch.deliveryfast.factoryMethods.Pedido;

public class EndingActivity extends AppCompatActivity {

    ListView listView;
    TextView textView;
    String[] platos;
    ArrayAdapter<String> arrayAdapter;
    Button buttom_accept;

    int numPedidos;
    RadioButton radioButton1, radioButton2;
    Pedido pedido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_ending);

        Resources res = getResources();

        listView = findViewById(R.id.list_view_ending);
        textView = findViewById(R.id.textView_ending_2);
        buttom_accept = findViewById(R.id.buttom_accept);

        radioButton1 = findViewById(R.id.radioButton_1);
        radioButton2 = findViewById(R.id.radioButton_2);


        pedido = (Pedido) getIntent().getSerializableExtra("PEDIDO");
        ArrayList<String> platos_temp = (ArrayList<String>) getIntent().getSerializableExtra("LISTA PEDIDOS");

        platos = new String[platos_temp.toArray().length];

        for (int i = 0; i < platos_temp.toArray().length; i++) {
            platos[i] = platos_temp.get(i);
        }

        numPedidos = getIntent().getIntExtra("NUM PEDIDOS", 0);

        arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, platos);
        listView.setAdapter(arrayAdapter);

        textView.setText(String.format(res.getString(R.string.monto), pedido.Calculator(numPedidos)));

        listView.setOnItemClickListener((adapterView, view, i, l) -> {
            String country = adapterView.getItemAtPosition(i).toString();
            Toast.makeText(getApplicationContext(), country, Toast.LENGTH_LONG).show();
        });

        buttom_accept.setOnClickListener(view -> {

            if (radioButton1.isChecked()) {
                SuperTarea st= new SuperTarea();
                st.addTarea(new TareaRegistrarPlato());
                st.addTarea(new TareaListarPlato());
                GestorTareas gt= new GestorTareas();
                Plato pla= new Plato(1,"Platos debitados");
                gt.ejecutar(st, pla);

                MetodoPago pa = new Tarjeta(new Consumo());
                pa.pagar();
            } else if (radioButton2.isChecked()) {
                SuperTarea st= new SuperTarea();
                st.addTarea(new TareaRegistrarPlato());
                st.addTarea(new TareaListarPlato());
                GestorTareas gt= new GestorTareas();
                Plato pla= new Plato(1,"Platos debitados");
                gt.ejecutar(st, pla);

                MetodoPago pa = new Tarjeta(new Consumo());
                pa.pagar();
            } else {
                Toast.makeText(getApplicationContext(), "Seleccione un médio de pago", Toast.LENGTH_LONG).show();
                return;
            }

            Intent intent = new Intent(EndingActivity.this, Confirmacion.class);
            intent.putExtra("MONTO FINAL", pedido.Calculator(numPedidos));
            startActivity(intent);
            finish();
        });
    }
}