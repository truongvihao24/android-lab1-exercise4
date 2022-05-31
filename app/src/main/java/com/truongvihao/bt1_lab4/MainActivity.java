package com.truongvihao.bt1_lab4;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText typeHere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        typeHere=findViewById(R.id.typeHere);
        final AlertDialog ad=new AlertDialog.Builder(this).create();

        typeHere.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if(keyEvent.getAction()==KeyEvent.ACTION_DOWN&&i==KeyEvent.KEYCODE_DPAD_CENTER)
                {
                    String message=typeHere.getText().toString();
                    ad.setMessage(message);
                    ad.show();
                    return  true;
                }
                return false;
            }
        });
    }
}