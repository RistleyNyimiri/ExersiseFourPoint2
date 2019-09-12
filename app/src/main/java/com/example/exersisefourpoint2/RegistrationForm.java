package com.example.exersisefourpoint2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class RegistrationForm extends AppCompatActivity {
TextView viewForm;
String stringText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_registration_form );
        viewForm.findViewById( R.id.textView );

        stringText=getIntent().getExtras().getString("Value");
        viewForm.setText(stringText);
    }
}
