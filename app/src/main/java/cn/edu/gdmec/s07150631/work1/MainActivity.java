package cn.edu.gdmec.s07150631.work1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("MyActivity","onCreate方法被执行");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("MyActivity","onStart方法被执行");
    }

    protected void onResume(){
        super.onResume();
        Log.v("MyActivity","onResume方法被执行");
    }
    protected void onPause(){
        super.onPause();
        Log.v("MyActicvity","onPause方法被执行");
    }
    protected void onStop(){
        super.onStop();
        Log.v("MyActicvity","onStop方法被执行");
    }
    protected void onRestart(){
        super.onRestart();
        Log.v("MyActicvity","onRestart方法被执行");
    }
    protected void onDestory(){
        Log.v("MyActicvity","onDestory方法被执行");
    }
}
