package com.example.siddhiparekh11.threadexample;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AsyncResponse {

    Thread thread;
    Handler handler;
    TextView txtview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtview = (TextView) findViewById(R.id.txtthread);
        new DownloadFile(this).execute("ABC");
       // thread = new Thread(new Counter());
        //thread.start();
       /* handler = new Handler(Looper.getMainLooper()){
            @Override
            public void handleMessage(Message msg) {
                txtview.setText(String.valueOf(msg.arg1));
            }
        };*/
    }

    @Override
    public void processFinish(String output) {
        txtview.setText(output);
    }

  /*  public class Counter implements  Runnable{

        @Override
        public void run() {

            for(int i=0;i<100;i++){
                Message message = new Message();
                message.arg1=i;

                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                handler.sendMessage(message);

            }
        }
    }*/
}
