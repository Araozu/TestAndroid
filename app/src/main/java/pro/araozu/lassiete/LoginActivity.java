package pro.araozu.lassiete;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private Button botonInicioSesion;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_principal);
        botonInicioSesion = findViewById(R.id.boton_inicio_sesion);
        botonInicioSesion.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intencion = new Intent(this, MainActivity.class);
        startActivity(intencion);
    }

}
