package com.example.interfazuser;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class Formulario extends AppCompatActivity {

    // Declaración de los campos
    private TextInputEditText etNombre, etApellido, etTelefono, etCorreo, etEmpresa, etFechaNacimiento, etCedula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formulario);

        // Inicialización de los campos
        etNombre = findViewById(R.id.pass).findViewById(R.id.nombre);
        etApellido = findViewById(R.id.textInputLayout3).findViewById(R.id.apellido);
        etTelefono = findViewById(R.id.textInputLayout6).findViewById(R.id.telefono);
        etCorreo = findViewById(R.id.textInputLayout7).findViewById(R.id.correo);
        etEmpresa = findViewById(R.id.textInputLayout8).findViewById(R.id.empresa);
        etFechaNacimiento = findViewById(R.id.textInputLayout9).findViewById(R.id.nazi);
        etCedula = findViewById(R.id.textInputLayout10).findViewById(R.id.cedula);

        Button btnAgregar = findViewById(R.id.button3);

        // Configuración del botón
        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Obtener los datos ingresados
                String nombre = etNombre.getText().toString();
                String apellido = etApellido.getText().toString();
                String telefono = etTelefono.getText().toString();
                String correo = etCorreo.getText().toString();
                String empresa = etEmpresa.getText().toString();
                String fechaNacimiento = etFechaNacimiento.getText().toString();
                String cedula = etCedula.getText().toString();

                // Validar los datos
                if (nombre.isEmpty() || apellido.isEmpty() || telefono.isEmpty() || correo.isEmpty() ||
                        empresa.isEmpty() || fechaNacimiento.isEmpty() || cedula.isEmpty()) {
                    Toast.makeText(Formulario.this, "Por favor, complete todos los campos.", Toast.LENGTH_SHORT).show();
                } else {
                    // Mostrar los datos en el log
                    Log.d("RegistroActivity", "Nombre: " + nombre);
                    Log.d("RegistroActivity", "Apellido: " + apellido);
                    Log.d("RegistroActivity", "Teléfono: " + telefono);
                    Log.d("RegistroActivity", "Correo: " + correo);
                    Log.d("RegistroActivity", "Empresa: " + empresa);
                    Log.d("RegistroActivity", "Fecha de nacimiento: " + fechaNacimiento);
                    Log.d("RegistroActivity", "Cédula: " + cedula);

                    // Notificación de éxito
                    Toast.makeText(Formulario.this, "Datos registrados exitosamente.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}


