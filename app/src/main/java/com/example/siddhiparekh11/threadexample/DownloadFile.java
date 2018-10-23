package com.example.siddhiparekh11.threadexample;

import android.os.AsyncTask;

import java.net.URL;

public class DownloadFile extends AsyncTask<String,Integer,String> {

    public AsyncResponse delegate;

    public DownloadFile(AsyncResponse delegate){
        this.delegate=delegate;
    }

    @Override
    protected String doInBackground(String... urls) {
        int i =0;
        for(;i<10000;i++){

        }
        return String.valueOf(i);
    }

    @Override
    protected void onPostExecute(String s) {
       delegate.processFinish(s);

    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
    }
}
