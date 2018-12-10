package pro.araozu.lassiete;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button botonIrCarrito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = findViewById(R.id.mi_toolbar);
        setSupportActionBar(myToolbar);

        botonIrCarrito = findViewById(R.id.boton_carrito);
        botonIrCarrito.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intencion = new Intent(this, CarritoActivity2.class);
        startActivity(intencion);
    }
}
