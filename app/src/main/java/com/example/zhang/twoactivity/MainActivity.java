package com.example.zhang.twoactivity;

import android.content.Intent;
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

        Button button_main =(Button) this.findViewById(R.id.button);
        TextView textshow = (TextView) this.findViewById(R.id.textView);

        Intent it1get = getIntent();
        String gettext = it1get.getStringExtra("data2");
        textshow.setText(gettext);

        button_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1 = ((EditText) findViewById(R.id.editText)).getText().toString();
                Intent intent =new Intent(MainActivity.this,secondActivity.class);
               //Bundle data = new Bundle();
                //data.putString("1",str1);
                intent.putExtra("data1",str1);
                startActivity(intent);
            }
        });
    }
}
