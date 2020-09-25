package com.example.asyntask13072020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button mBtnStart;
    TextView mTvProgress;
    ProgressBar mProgressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnStart = findViewById(R.id.buttonStart);
        mTvProgress = findViewById(R.id.textviewProgress);
        mProgressBar = findViewById(R.id.progressbar);

    }
    // 1 - params : giá trị đầu vào để xử lý trong luồng background
    // 2 - progress : giá trị dùng để cập nhật tiến trình trong luồng background
    // 3 - result : giá trị trả về sau khi xử lý xong tiến trình
    class MyAsynTask extends AsyncTask<String,String,String>{

        @Override
        protected String doInBackground(String... strings) {
//            publishProgress();
            return null;
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);
        }

        @Override
        protected void onPostExecute(String integer) {
            super.onPostExecute(integer);
        }
    }
}