package com.lassie.business_card;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ContactsActivity extends AppCompatActivity {

    private Button buttonHome;
    private Button buttonAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);

        buttonAbout = (Button) findViewById(R.id.button5);
        buttonAbout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openActivityHome();
            }
        });

        buttonAbout = (Button) findViewById(R.id.button6);
        buttonAbout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openActivityContacts();
            }
        });

    }

    private void openActivityHome() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    private void openActivityContacts() {
        Intent intent = new Intent(this, AboutActivity.class);
        startActivity(intent);
    }
}
