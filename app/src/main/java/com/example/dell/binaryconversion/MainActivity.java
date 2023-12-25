package com.example.dell.binaryconversion;

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
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText =  (EditText) findViewById(R.id.editText);
                int num = Integer.parseInt(editText.getText().toString());
                int i = 0;
                int j;
                int[] arr =  new int[100];
                TextView tv = (TextView) findViewById(R.id.textView);
                while (num > 0)
                {
                    arr[i] = num % 2;
                    i++;
                    num /=2;
                }
                for(j=i-1; j >= 0; j--)
                {
                    tv.setText(arr[j] + "");
                }
            }
        });
    }
}
