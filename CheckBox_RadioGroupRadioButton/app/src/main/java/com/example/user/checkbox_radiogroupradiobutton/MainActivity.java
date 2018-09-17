package com.example.user.checkbox_radiogroupradiobutton;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

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

        // 체크박스와 달리 라디오 그룹은 그룹 전체를 등록한다
        // RadioButton 은 각각 선언하는 것이 아니라 RadioGroup 으로 선언해서 사용한다.

        final RadioGroup rg = (RadioGroup)findViewById(R.id.plant);
        Button button = (Button)findViewById(R.id.button);
        final TextView tv = (TextView)findViewById(R.id.resultLabel);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int id = rg.getCheckedRadioButtonId();
                //getCheckedRadioButtonId() 의 리턴값은 선택된 RadioButton 의 id 값.
                RadioButton rb = (RadioButton) findViewById(id);
                tv.setText("결과: " + rb.getText().toString());
            } // end onClick()
        });  // end Listener
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
