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
        int frameIndex = 0;

        // frame 1
        frameIndex = 0;
        score += rolls.get(frameIndex); // roll 1
        score += rolls.get(frameIndex + 1); // roll 2

        // frame 2
        frameIndex = 0 + 2;
        score += rolls.get(frameIndex); // roll 3
        score += rolls.get(frameIndex + 1); // roll 4

        // frame 3
        frameIndex = 2 + 2;
        score += rolls.get(frameIndex); // roll 5
        score += rolls.get(frameIndex + 1); // roll 6 (spare)
        score += rolls.get(frameIndex + 2); // roll 7 (spare bonus)

        // frame 4
        frameIndex = 4 + 2;
        score += rolls.get(frameIndex); // roll 7
        score += rolls.get(frameIndex + 1); // roll 8

        // frame 5
        frameIndex = 6 + 2;
        score += rolls.get(frameIndex); // roll 9
        score += rolls.get(frameIndex + 1); // roll 10

        // frame 6
        frameIndex = 8 + 2;
        score += rolls.get(frameIndex); // roll 11
        score += rolls.get(frameIndex + 1); // roll 12

        // frame 7
        frameIndex = 10 + 2;
        score += rolls.get(frameIndex); // roll 13
        score += rolls.get(frameIndex + 1); // roll 14
        score += rolls.get(frameIndex + 2); // roll 15

        // frame 8
        frameIndex = 12 + 2;
        score += rolls.get(frameIndex); // roll 15 (strike)
        score += rolls.get(frameIndex + 1); // roll 16 (strike bonus)
        score += rolls.get(frameIndex + 2); // roll 17 (strike bonus)


        // frame 9
        frameIndex = 14 + 1;
        score += rolls.get(frameIndex); // roll 16
        score += rolls.get(frameIndex + 1); // roll 17


        // frame 10
        frameIndex = 15 + 2;
        score += rolls.get(frameIndex); // roll 18 (strike)
        score += rolls.get(frameIndex + 1); // roll 19 (strike bonus)
        score += rolls.get(frameIndex + 2); // roll 20 (strike bonus)

        return score;
    }
}
