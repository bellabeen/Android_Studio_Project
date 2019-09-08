package com.kedaiit.myasynctask;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String DEMO_ASYNC = "DemoAsync";
    private TextView mytextview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mytextview = (TextView)findViewById(R.id.mytextview);
        DemoAsync demoAsync = new DemoAsync();
        demoAsync.execute("Press Me");
    }

    public void buttonOnClick(View view) {

    }

    private class DemoAsync extends AsyncTask<String, Void, String> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            mytextview.setText("Vika Rahayu A");
        }
        @Override
        protected String doInBackground(String...params) {
            Log.d(DEMO_ASYNC, "status : doInBackground");
            try {
                Thread.sleep(20000);
            }
            catch (Exception e) {
                Log.d(DEMO_ASYNC, e.getMessage());
            }
            return params[0];
        }
        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            mytextview.setText(""+s);
        }

        public void buttonOnClick(View view) {
            long endTime = System.currentTimeMillis() + 20*1000;

            while (System.currentTimeMillis() < endTime) {
                synchronized (this) {
                    try {
                        wait(endTime - System.currentTimeMillis());

                    } catch (Exception e) {

                    }
                }
            }
            TextView mytextview   =
                    (TextView)findViewById(R.id.btn_press);
            mytextview.setText("Button Pressed");
        }
    }
}
