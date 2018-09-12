package com.example.zhang.twoactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button button_second = (Button) this.findViewById(R.id.button2);
        TextView textshow = (TextView) this.findViewById(R.id.textView2);

        Intent it2get = getIntent();
        String gettext = it2get.getStringExtra("data1");
        textshow.setText(gettext);


        button_second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str2 = ((EditText) findViewById(R.id.editText2)).getText().toString();

                Intent intent =new Intent(secondActivity.this,MainActivity.class);
                intent.putExtra("data2",str2);
                startActivity(intent);
            }
        });
    }
}
