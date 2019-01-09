package com.example.qasim.actions;

import android.content.Intent;
import android.drm.DrmStore;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1=findViewById(R.id.btnCall);
        Button button2=findViewById(R.id.btnDial);
        Button button3=findViewById(R.id.btnContacts);
        Button button4=findViewById(R.id.btnBrowser);
        Button button5=findViewById(R.id.btnCallLog);
        Button button6=findViewById(R.id.btnGallery);
        Button button7=findViewById(R.id.btnCamera);
        EditText editText=findViewById(R.id.txtEdit);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_CALL);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI);
                startActivityForResult(intent,1);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                startActivity(intent);
            }
        });
    }
}
