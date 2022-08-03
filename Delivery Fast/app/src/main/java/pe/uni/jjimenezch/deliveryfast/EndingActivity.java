package pe.uni.jjimenezch.deliveryfast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class EndingActivity extends AppCompatActivity {

    ListView listView;
    TextView textView;
    String[] platos;
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ending);

        Resources res = getResources();

        listView = findViewById(R.id.list_view_ending);
        textView = findViewById(R.id.textView_ending_2);
        platos = getArray();

        arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, platos);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener((adapterView, view, i, l) -> {
            String country = adapterView.getItemAtPosition(i).toString();
            Toast.makeText(getApplicationContext(),  country, Toast.LENGTH_LONG).show();
        });

        textView.setText(String.format(res.getString(R.string.monto), 10));
    }

    protected String[] getArray(){
        return null;
    }
}