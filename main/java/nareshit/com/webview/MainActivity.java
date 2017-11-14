package nareshit.com.webview;

import android.content.Intent;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void vibrate(View view) {
        Vibrator vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);
        vibrator.vibrate(new long[]{300, 100, 500, 400}, 2);
        vibrator.vibrate(2000);
    }

    public void gotoWebView(View view) {
        startActivity(new Intent(this, WebViewActivity.class));
    }
}
