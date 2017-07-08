package crossingdeal.com.crossingdeal.Activity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import crossingdeal.com.crossingdeal.R;

public class SplashScreen extends AppCompatActivity {
    private static final String TAG = SplashScreen.class.getSimpleName() + ".";

    private Activity mActivity = SplashScreen.this;
    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        new Thread() {
            public void run() {
                try {
                    Thread.sleep(1000);
                    Intent intent = new Intent(SplashScreen.this, Login.class);
                    startActivity(intent);
                } catch (Exception e) {
                    Log.e(TAG, e.toString());
                }
            }
        }.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);

        new Thread(){
            public void run()
            {
                try {
                    Thread.sleep(1000);
                    startActivity(new Intent(SplashScreen.this,Login.class));
                } catch (Exception e) {
                    Log.e("Splash Exception", e.toString());
                }

            }
        }.start();
    }
}
