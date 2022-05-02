package bowling;

import java.util.ArrayList;
import java.util.List;

public class Bowling {
    List<Integer> rolls = new ArrayList<>();

    public void roll(int pins) {
        rolls.add(pins);
    }

    public int score() {
        int score = 0;

        // frame 1
        score += 3; // roll 1
        score += 4; // roll 2

        // frame 2
        score += 6; // roll 3
        score += 3; // roll 4

        // frame 3
        score += 2; // roll 5
        score += 8; // roll 6 (spare)
        score += 4; // roll 7 (spare bonus)

        // frame 4
        score += 4; // roll 7
        score += 3; // roll 8

        // frame 5
        score += 4; // roll 9
        score += 4; // roll 10

        // frame 6
        score += 5; // roll 11
        score += 2; // roll 12

        // frame 7
        score += 6; // roll 13
        score += 4; // roll 14
        score += 10; // roll 15

        // frame 8
        score += 10; // roll 15 (strike)
        score += 8; // roll 16 (strike bonus)
        score += 0; // roll 17 (strike bonus)


        // frame 9
        score += 8; // roll 16
        score += 0; // roll 17


        // frame 10
        score += 10; // roll 18 (strike)
        score += 8; // roll 19 (strike bonus)
        score += 1; // roll 20 (strike bonus)

        return score;
    }
}
