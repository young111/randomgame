package kr.hs.emirim.young111.monchicken;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class SplashActivity extends AppCompatActivity {



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_splash);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);//새로운 액티비티 시작
                overridePendingTransition(0,R.anim.zoom_exit);
                finish();//현재 액티비티를 소멸(splash activity 마감)
            }
        },3000);
    }

}
