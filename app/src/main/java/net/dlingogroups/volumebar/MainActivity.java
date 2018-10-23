package net.dlingogroups.volumebar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edPnjg, edLebar, edTinggi;
    private Button btnHasili;
    private TextView hasili;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText edPnjg = (EditText)findViewById(R.id.edP);
        final EditText edLebar = (EditText)findViewById(R.id.edL);
        final EditText edTinggi = (EditText)findViewById(R.id.edT);
        Button btnHasili = (Button)findViewById(R.id.btnHasil);
        final TextView hasili = (TextView)findViewById(R.id.hasil);

        btnHasili.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String panjang = edPnjg.getText().toString().trim();
                String lebar = edLebar.getText().toString().trim();
                String tinggi = edTinggi.getText().toString().trim();

                double p = Double.parseDouble(panjang);
                double l = Double.parseDouble(lebar);
                double t = Double.parseDouble(tinggi);

                double luas = p * l * t;

                hasili.setText("Luas : "+luas);
            }
        });
    }
}
