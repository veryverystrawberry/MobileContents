package com.example.young.mediaplayer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    MediaPlayer player;
    TextView display;
    Button pBtn, sBtn;

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

        //MediaPlayer객체 player생성
        //이때 재생되는 음악은 play1.mp3
        player = MediaPlayer.create(this, R.raw.bgbg);

        //[음악재생]버튼의 정보를 얻어낸 후 이벤트 리스너 등록
        pBtn = (Button) findViewById(R.id.playBtn);
        pBtn.setOnClickListener(this);

        //[재생 중단]버튼의 정보를 얻어낸 후 리스너 등록
        sBtn = (Button) findViewById(R.id.stopBtn);
        sBtn.setEnabled(false); //버튼의 사용을 불가능하게 설정
        sBtn.setOnClickListener(this);

        //음악이 재생중인지 중단되었는지 표시하는 TextView의 정보를 얻어냄
        display = (TextView) findViewById(R.id.display);
    }

    @Override
    public void onClick(View v) {
        if (v == pBtn) {//[음악재생]버튼을 누른 경우
            //start()메서드를 사용해 음악을 재생
            player.start();
            //[재생 중단]버튼 사용 가능
            sBtn.setEnabled(true);
            //[응악재생]버튼 사용 불가능
            pBtn.setEnabled(false);
            //화면에 음악재생중에 대한 메시지 표시
            display.setText(R.string.status1);
        } else if (v == sBtn) {
            //stop()메서드를 사용해 음악 재생 중단
            player.pause();
            //[응악재생]버튼 사용 가능
            pBtn.setEnabled(true);
            //[재생 중단]버튼 사용 불가능
            sBtn.setEnabled(false);
            //화면에 음악재생 중단에 대한 메시지 표시
            display.setText(R.string.status2);
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
