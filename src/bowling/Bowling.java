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
        score += rolls.get(0); // roll 1
        score += rolls.get(0 + 1); // roll 2

        // frame 2
        score += rolls.get(2); // roll 3
        score += rolls.get(2 + 1); // roll 4

        // frame 3
        score += rolls.get(4); // roll 5
        score += rolls.get(4 + 1); // roll 6 (spare)
        score += rolls.get(4 + 2); // roll 7 (spare bonus)

        // frame 4
        score += rolls.get(6); // roll 7
        score += rolls.get(6 + 1); // roll 8

        // frame 5
        score += rolls.get(8); // roll 9
        score += rolls.get(8 + 1); // roll 10

        // frame 6
        score += rolls.get(10); // roll 11
        score += rolls.get(10 + 1); // roll 12

        // frame 7
        score += rolls.get(12); // roll 13
        score += rolls.get(12 + 1); // roll 14
        score += rolls.get(12 + 2); // roll 15

        // frame 8
        score += rolls.get(14); // roll 15 (strike)
        score += rolls.get(14 + 1); // roll 16 (strike bonus)
        score += rolls.get(14 + 2); // roll 17 (strike bonus)


        // frame 9
        score += rolls.get(15); // roll 16
        score += rolls.get(15 + 1); // roll 17


        // frame 10
        score += rolls.get(17); // roll 18 (strike)
        score += rolls.get(17 + 1); // roll 19 (strike bonus)
        score += rolls.get(17 + 2); // roll 20 (strike bonus)

        return score;
    }
}
