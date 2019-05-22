package hk.krause.tareatriangulo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView ladoA,ladoB, ladoC, resultado;
    private Button consulta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ladoA = findViewById(R.id.Id_ladoA);
        ladoB = findViewById(R.id.Id_LadoB);
        ladoC = findViewById(R.id.Id_LadoC);
        consulta = findViewById(R.id.bt_consultar);
        resultado = findViewById(R.id.IdTriangulo);

        consulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String LA = ladoA.getText().toString();
                String LB = ladoB.getText().toString();
                String LC = ladoC.getText().toString();
                int la = Integer.parseInt(LA);
                int lb = Integer.parseInt(LB);
                int lc = Integer.parseInt(LC);
                //Toast.makeText(getApplicationContext(),la,Toast.LENGTH_SHORT).show();
                //Toast.makeText(getApplicationContext(),LC,Toast.LENGTH_SHORT).show();
                if (la+lb<=lc || la+lc<=lb || lb+lc<=la)
                {
                    resultado.setText("Los Nros Ingresados No pertenecen a un Triangulo ");
                }
                else {
                    if (la == lb && lb == lc){
                        resultado.setText("Es un Triangulo Equilatero");
                    }
                    else if ((la != lb)&&(la != lc)&& (lb != lc)) {
                        resultado.setText("Es un Triangulo Escaleno");
                    }
                    else {
                        resultado.setText("El Triangulo es Isoceles");
                    }
                }

            }
        });
    }
}
