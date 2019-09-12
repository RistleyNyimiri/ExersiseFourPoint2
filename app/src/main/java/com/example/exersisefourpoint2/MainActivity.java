package com.example.exersisefourpoint2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    EditText firstName; //middleName, SirName, registerdName;
    Button buttonSave;
    String stringText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        firstName = findViewById(R.id.editext);
        buttonSave = findViewById( R.id.button );

        buttonSave.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent Form = new Intent( MainActivity.this,RegistrationForm.class );
                stringText = firstName.getText().toString();
                Form.putExtra("Value",stringText);
                startActivity(Form);
                finish();
            }
        } );
    }
}
/*Scanner registarionForm = new Scanner(System.in);
        System.out.println("Enter your First Name");
        firstName = registarionForm.next();
        System.out.println("Enter your middle Name");
        middleName = registarionForm.next();
        System.out.println("Enter your Sir Name");
        SirName = registarionForm.next();
        registerdName = firstName + middleName + SirName;
        System.out.println(registerdName);*/