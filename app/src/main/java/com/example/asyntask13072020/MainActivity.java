package com.example.asyntask13072020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button mBtnStart;
    TextView mTvProgress;
    ProgressBar mProgressBar;
    int mProgress = 0;
    Random mRandom ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnStart = findViewById(R.id.buttonStart);
        mTvProgress = findViewById(R.id.textviewProgress);
        mProgressBar = findViewById(R.id.progressbar);

        mRandom = new Random();

    }

    class DownLoad extends AsyncTask<Void,Integer,String>{

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            Toast.makeText(MainActivity.this, "Bắt đầu tải xuống", Toast.LENGTH_SHORT).show();
        }

        @Override
        protected String doInBackground(Void... voids) {
            for ( ; true ;){
                if (mProgress >= 100){
                    mProgress = 100;
                    publishProgress(mProgress);
                    break;
                }else{
                    mProgress += mRandom.nextInt(10);
                    publishProgress(mProgress);
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return "Down load kết thúc";
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            Integer progress = values[0];
            mTvProgress.setText(progress + " %");
            mProgressBar.setProgress(progress);
            super.onProgressUpdate(values);
        }

        @Override
        protected void onPostExecute(String s) {
            Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
            super.onPostExecute(s);
        }
    }
}