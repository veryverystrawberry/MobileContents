package com.example.user.mycalculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button plus;
    Button minus;
    Button multiply;
    Button divide;

    EditText first;
    EditText second;

    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        plus = (Button) findViewById(R.id.button);
        minus = (Button) findViewById(R.id.button2);
        multiply = (Button) findViewById(R.id.button3);
        divide = (Button) findViewById(R.id.button4);

        plus.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                first = (EditText) findViewById(R.id.editText);
                second = (EditText) findViewById(R.id.editText2);

                result = (TextView) findViewById(R.id.result);

                int sum =0;
                int a=0;
                int b=0;

                a = Integer.parseInt(first.getText().toString());
                b = Integer.parseInt(second.getText().toString());

                sum = a+b;

                result.setText(Integer.toString(sum));
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                first = (EditText) findViewById(R.id.editText);
                second = (EditText) findViewById(R.id.editText2);

                result = (TextView) findViewById(R.id.result);

                int sum =0;
                int a=0;
                int b=0;

                a = Integer.parseInt(first.getText().toString());
                b = Integer.parseInt(second.getText().toString());

                sum = a-b;

                result.setText(Integer.toString(sum));
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                first = (EditText) findViewById(R.id.editText);
                second = (EditText) findViewById(R.id.editText2);

                result = (TextView) findViewById(R.id.result);

                int sum =0;
                int a=0;
                int b=0;

                a = Integer.parseInt(first.getText().toString());
                b = Integer.parseInt(second.getText().toString());

                sum = a*b;

                result.setText(Integer.toString(sum));
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                first = (EditText) findViewById(R.id.editText);
                second = (EditText) findViewById(R.id.editText2);

                result = (TextView) findViewById(R.id.result);

                int sum =0;
                int a=0;
                int b=0;

                a = Integer.parseInt(first.getText().toString());
                b = Integer.parseInt(second.getText().toString());

                sum = a/b;

                result.setText(Integer.toString(sum));
            }
        });
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
