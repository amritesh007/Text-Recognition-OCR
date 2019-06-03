package com.android.amritesh.textrecognition;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class inputActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        final EditText et = (EditText)findViewById(R.id.etInput);
        Button submit = (Button)findViewById(R.id.btn1);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uinput = et.getText().toString();
                Intent i = new Intent(inputActivity.this, MainActivity.class);
                Bundle b = new Bundle();
                b.putString("input", uinput);
                i.putExtra("user", b);
                startActivity(i);

            }
        });

    }
}
