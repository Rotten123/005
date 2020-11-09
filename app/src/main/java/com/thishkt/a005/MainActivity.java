package com.thishkt.a005;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText a,b,c,d,e,f;
    TextView fa,fb,fc,fd,fe,ff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fa = (TextView)findViewById(R.id.textView11);
        fb = (TextView)findViewById(R.id.textView13);
        fc = (TextView)findViewById(R.id.textView15);
        fd = (TextView)findViewById(R.id.textView16);
        fe = (TextView)findViewById(R.id.textView18);
        ff = (TextView)findViewById(R.id.textView20);

        a = (EditText)findViewById(R.id.year);
        b = (EditText)findViewById(R.id.mon);
        c = (EditText)findViewById(R.id.day);
        d = (EditText)findViewById(R.id.hr);
        e = (EditText)findViewById(R.id.min);
        f = (EditText)findViewById(R.id.sec);
        Button submit = (Button)findViewById(R.id.button);

        submit.setOnClickListener(new Button.OnClickListener() {


            public void onClick(View arg0) {
                fa.setText(a.getText().toString());
                fb.setText(b.getText().toString());
                fc.setText(c.getText().toString());
                fd.setText(d.getText().toString());
                fe.setText(e.getText().toString());
                ff.setText(f.getText().toString());


            }

        });

    }
}