package com.example.user.imageview;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    FrameLayout fl;
    TextView tv;

    int j=1;

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

        //클릭할 이미지가 배치된 FrameLayout의 정보를 얻어냄
        fl = (FrameLayout) findViewById(R.id.frameLayout1);
        tv = (TextView) findViewById(R.id.textView);
        tv.setText(j+"번째 그림입니다.");

        //FrameLayout에 배치된 자식뷰인 ImageView에 OnClickListener등록
        for (int i = 0; i < fl.getChildCount(); i++)
            fl.getChildAt(i).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        //이벤트가 발생한 이미지뷰를 안보이게 투명하게 함
        v.setVisibility(View.INVISIBLE);

            if (j >= fl.getChildCount()) {
                tv.setText("끝");
            }

             else{
                j++;
                tv.setText(j + "번째 그림입니다.");
            }

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
