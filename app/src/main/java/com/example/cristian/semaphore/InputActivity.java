package com.example.cristian.semaphore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InputActivity extends AppCompatActivity {

    float energy, fat, saturates, sugars,salt;

    EditText EnergyInput;
    EditText FatInput;
    EditText SaturatedInput;
    EditText SugarInput;
    EditText SaltInput;

    Button ResultsButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        EnergyInput = (EditText)findViewById(R.id.EnergyInput);
        FatInput = (EditText)findViewById(R.id.FatInput);
        SaturatedInput = (EditText)findViewById(R.id.SaturatedInput);
        SugarInput = (EditText)findViewById(R.id.SugarInput);
        SaltInput =(EditText)findViewById(R.id.SaltInput);

        ResultsButton = (Button)findViewById(R.id.button);
        ResultsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    energy = Float.parseFloat(EnergyInput.getText().toString());
                    fat = Float.parseFloat(FatInput.getText().toString());
                    saturates = Float.parseFloat(SaturatedInput.getText().toString());
                    sugars = Float.parseFloat(SugarInput.getText().toString());
                    salt = Float.parseFloat(SaltInput.getText().toString());

                    openResulstsActivity();

                   // showToast(String.valueOf(energy));
                   // showToast(String.valueOf(fat));
                   // showToast(String.valueOf(saturates));
                   // showToast(String.valueOf(sugars));
                   // showToast(String.valueOf(salt));

                }catch (Exception e){

                    showToast("Hay campos en blanco");

                    return;

                }
            }
        });

    }

    public void openResulstsActivity() {

        Intent intent =new Intent(this,ResultsActivity.class);
        startActivity(intent);

    }

    private void showToast(String text){

        Toast.makeText(InputActivity.this,text,Toast.LENGTH_SHORT).show();

    }
}
