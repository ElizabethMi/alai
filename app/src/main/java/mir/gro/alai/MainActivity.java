package mir.gro.alai;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editTextValor1, editTextValor2;
    Button buttoncalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextValor1 = findViewById(R.id.id1);
        editTextValor2 = findViewById(R.id.id2);
        buttoncalcular = findViewById(R.id.btn);
        buttoncalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (editTextValor1.getText().toString().equals("") && editTextValor2.getText().toString().equals("") ){

                    Toast.makeText(getApplicationContext(),
                            "Ingresa los 2 numeros", Toast.LENGTH_SHORT).show();

                }else{
                    int id1 = Integer.parseInt(editTextValor1.getText().toString());
                    int id2 = Integer.parseInt(editTextValor2.getText().toString());

                    int suma = id1+id2;

                    Toast.makeText(getApplicationContext(),
                            "Resultado "+suma, Toast.LENGTH_SHORT).show();


                }


            }
        });
    }

}
