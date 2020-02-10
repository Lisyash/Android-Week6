package com.lassie.business_card;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AboutActivity extends AppCompatActivity {

    private Button buttonHome;
    private Button buttonContacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        buttonHome = (Button) findViewById(R.id.button3);
        buttonHome.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openActivityHome();
            }
        });

        buttonContacts = (Button) findViewById(R.id.button4);
        buttonContacts.setOnClickListener(new View.OnClickListener(){
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
        Intent intent = new Intent(this, ContactsActivity.class);
        startActivity(intent);
    }
}
