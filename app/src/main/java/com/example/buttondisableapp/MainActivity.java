package com.example.buttondisableapp;
import android.widget.Toast;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button buttonDisable; // Declare the button

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Set the content view

        // Initialize the button by its ID from the XML file
        buttonDisable = findViewById(R.id.buttonDisable);

        // Set a click listener on the button
        buttonDisable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Disable the button when clicked
                buttonDisable.setEnabled(false);
                Toast.makeText(MainActivity.this, "Przycisk został wyłączony", Toast.LENGTH SHORT).show();
            }
        });
    }
}
