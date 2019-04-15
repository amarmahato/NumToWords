package com.example.numtowords;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText eValue;
    private Button btnConvert;
    private TextView Toutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eValue = findViewById(R.id.EValue);
        Toutput = findViewById(R.id.Output);
        btnConvert = findViewById(R.id.btnConvert);

        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.parseInt(eValue.getText().toString());
                Change ch = new Change();
                if (num<=10000000) {
                    String res = ch.change(num);
                    Toutput.setText(res);
                }else{
                    Toutput.setText("High number of length");
                }
            }
        });

    }

}
