package com.example.interfazuser;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputLayout;

public class login extends AppCompatActivity {

    // Valores válidos para la cédula y contraseña
    private static final String CEDULA_VALIDO = "123456789";
    private static final String CONTRASENA_VALIDA = "holamundo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        // Configuración para los bordes de la pantalla
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Referencias a los campos de entrada y al botón
        TextInputLayout textInputLayout = findViewById(R.id.cedu);
        TextInputLayout textInputLayout2 = findViewById(R.id.pass);
        EditText edtCedula = findViewById(R.id.cedu).findViewById(R.id.Cedula);
        EditText edtContrasena = findViewById(R.id.pass).findViewById(R.id.Password);
        Button btnLogin = findViewById(R.id.button2);

        // Configuración del botón de inicio de sesión
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener los valores ingresados en los campos de cédula y contraseña
                String cedula = edtCedula.getText().toString();
                String contrasena = edtContrasena.getText().toString();

                // Validar la cédula y la contraseña
                if (cedula.equals(CEDULA_VALIDO) && contrasena.equals(CONTRASENA_VALIDA)) {
                    // Si son correctos, mostrar mensaje de éxito
                    Toast.makeText(login.this, "Inicio de sesión exitoso", Toast.LENGTH_SHORT).show();
                    // Crear un Intent para ir a la actividad Formulario
                    Intent intent = new Intent(login.this, Formulario.class);
                    startActivity(intent);
                } else {
                    // Si son incorrectos, mostrar mensaje de error
                    Toast.makeText(login.this, "Cédula o contraseña incorrectos", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}