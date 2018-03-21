package codeclan.com.rockpaperscissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ScoreBoard.resetScoreboard();
        updateScore();
    }

    public void updateScore() {
        TextView player_score = findViewById(R.id.player_score);
        TextView computer_score = findViewById(R.id.computer_score);
        player_score.setText(ScoreBoard.getPlayerScore());
        computer_score.setText(ScoreBoard.getComputerScore());
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
        updateScore();
    }

    public void onResetButtonClick(View aView) {
    ScoreBoard.resetScoreboard();
    updateScore();
    }

}
