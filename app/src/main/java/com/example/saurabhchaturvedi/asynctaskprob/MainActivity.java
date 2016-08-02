package com.example.saurabhchaturvedi.asynctaskprob;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener {
    private ProgressDialog progressDialog;
    private TextView textView;
    private ProgressBar progressbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.start).setOnClickListener(this);
        //textView = (TextView) findViewById(R.id.hello);
        progressbar = (ProgressBar) findViewById(R.id.progress);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.start) {
            new AsyncTaskExample().execute();
        }
    }

//    @Override
//    public void onTaskStarted() {
//            progressDialog = ProgressDialog.show(MainActivity.this, "Loading", "Please wait a moment!");
//    }
//
//    @Override
//    public void onTaskFinished(String result) {
//            if (progressDialog != null) {
//                progressDialog.dismiss();
//            }
//    }

    public class AsyncTaskExample extends AsyncTask<String, Integer, String> {

       // private final TaskListener listener;

        public AsyncTaskExample() {

        }
        public AsyncTaskExample(TaskListener listener) {
           // this.listener = listener;
        }

        @Override
        protected void onPreExecute() {
           // listener.onTaskStarted();
           // progressDialog = ProgressDialog.show(MainActivity.this, "Loading", "Please wait a moment!");
            progressbar.
        }

        @Override
        protected String doInBackground(String... params) {
            for (int i = 1; i <= 10; i++) {
                Log.d("GREC", "AsyncTask is working: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return "All Done!";
        }

        @Override
        protected void onPostExecute(String result) {
            //listener.onTaskFinished(result);
//            if (progressDialog != null) {
//                progressDialog.dismiss();
//            }
            textView.setText("Done !");
        }
    }
}


