package codeclan.com.rockpaperscissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View buttonChoice) {
        Hand userHand;

        if (buttonChoice.getId() == R.id.rock) {
            userHand = Hand.ROCK;

        } else if (buttonChoice.getId() == R.id.paper) {
            userHand = Hand.PAPER;

        } else {
            userHand = Hand.SCISSORS;
        }

        Game game = new Game(userHand);
        TextView resultMessage = findViewById(R.id.resultTextView);
        resultMessage.setText(game.getWinner());

    }
}
