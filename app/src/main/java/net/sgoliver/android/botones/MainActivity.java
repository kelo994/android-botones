package net.sgoliver.android.botones;

import android.annotation.TargetApi;
import android.os.Build;
import android.support.design.widget.FloatingActionButton;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private TextView lblMensaje;
    private TextView textTest;
    private Button btnBotonSimple;
    private Button btnBotonMasImagen;
    private ToggleButton btnToggle;
    private Switch btnSwitch;
    private ImageButton btnImagen;
    private ToggleButton btnPersonalizado;
    private ImageButton btnSinBorde;
    private Button btnAceptar;
    private Button btnCancelar;
    private FloatingActionButton fabButton;
    private Toast toast;
    private Button toast1;
    private Button snack;
    private int i=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lblMensaje = (TextView)findViewById(R.id.LblMensaje);

        btnBotonSimple = (Button)findViewById(R.id.BtnBotonSimple);

        btnBotonSimple.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0)
            {
                toast = Toast.makeText(getApplicationContext(),"Botón Simple pulsado!!", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        toast1 = (Button) findViewById(R.id.button2);
        toast1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toast = Toast.makeText(getApplicationContext(),"Botón Simple pulsado!", Toast.LENGTH_SHORT);
                toast.show();
            }

        });
        snack = (Button) findViewById(R.id.button3);
        snack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "This is a Snackbar return", Snackbar.LENGTH_LONG).show();
            }
        });
        btnBotonMasImagen = (Button)findViewById(R.id.BtnBotonMasImagen);
        btnBotonMasImagen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0)
            {
                    toast =  Toast.makeText(getApplicationContext(),
                            "Botón texto+imagen pulsado!", Toast.LENGTH_SHORT);
                    toast.show();


            }
        });

        btnToggle = (ToggleButton)findViewById(R.id.BtnToggle);

        btnToggle.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0)
            {
                if(btnToggle.isChecked()) {
                    lblMensaje.setText(" ");
                    toast = Toast.makeText(getApplicationContext(),
                            "Botón Toggle: ON", Toast.LENGTH_SHORT);
                    toast.show();
                }else {
                    lblMensaje.setText(" ");
                    toast = Toast.makeText(getApplicationContext(),
                            "Botón Toggle: OFF", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        btnSwitch = (Switch)findViewById(R.id.BtnSwitch);

        btnSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btnSwitch.isChecked()){
                    lblMensaje.setText(" ");
                    toast = Toast.makeText(getApplicationContext(),
                            "Botón Switch: ON", Toast.LENGTH_SHORT);
                            toast.show();
            }else{
                    lblMensaje.setText(" ");
                    toast = Toast.makeText(getApplicationContext(),
                            "Botón Switch: OFF", Toast.LENGTH_SHORT);
                toast.show();
            }
        }});

        btnImagen = (ImageButton)findViewById(R.id.BtnImagen);

        btnImagen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0)
            {
                lblMensaje.setText(" ");
                toast = Toast.makeText(getApplicationContext(),
                        "Botón Imagen pulsado!", Toast.LENGTH_SHORT);
                toast.show();

            }
        });

        btnPersonalizado = (ToggleButton)findViewById(R.id.BtnPersonalizado);

        btnPersonalizado.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0)
            {
                if(btnPersonalizado.isChecked())

                    lblMensaje.setText("Botón Personalizado: ON");
                else
                    lblMensaje.setText("Botón Personalizado: OFF");
            }
        });

        btnSinBorde = (ImageButton)findViewById(R.id.BtnSinBorde);

        btnSinBorde.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                lblMensaje.setText("Botón Sin Borde pulsado!");
                TextView textTest = (TextView) findViewById(R.id.textview2);
                if (i == 1) {
                    textTest.setText("boton pulsado " + i + " vez.");
                } else{
                    textTest.setText("boton pulsado " + i + " veces.");
            }
                i++;
            }
        });

        btnAceptar = (Button)findViewById(R.id.BtnAceptar);

        btnAceptar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0)
            {
                lblMensaje.setText("Botón Aceptar pulsado!");
            }
        });

        btnCancelar = (Button)findViewById(R.id.BtnCancelar);

        btnCancelar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0)
            {
                lblMensaje.setText("Botón Cancelar pulsado!");


            }
        });

        fabButton = (FloatingActionButton)findViewById(R.id.fab);
        fabButton.setBackgroundTintList(
                getResources().getColorStateList(R.color.fab_color));
        fabButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View view) {
                            Snackbar.make(view, "This is a Snackbar", Snackbar.LENGTH_LONG).show();


            }
        });
   }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
