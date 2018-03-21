package codeclan.com.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class WelcomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);
    }

    public void onClickPlayButton(View playGame) {
        Log.d("MainActivity", "Play button pressed. ");

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
