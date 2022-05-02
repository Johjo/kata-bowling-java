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
        int bonus = 0;

        // frame 1
        frameIndex = 0;
        score += rolls.get(frameIndex); // roll 1
        score += rolls.get(frameIndex + 1); // roll 2
        if (isStrike(frameIndex)) {
            bonus = rolls.get(frameIndex + 1);
            bonus += rolls.get(frameIndex + 2);
        }else if (rolls.get(frameIndex) + rolls.get(frameIndex + 1) == 10)
            bonus = rolls.get(frameIndex + 2);
        else
            bonus = 0;
        score += bonus;

        // frame 2
        frameIndex = frameIndex + 2;
        score += rolls.get(frameIndex); // roll 3
        score += rolls.get(frameIndex + 1); // roll 4
        if (isStrike(frameIndex)) {
            bonus = rolls.get(frameIndex + 1);
            bonus += rolls.get(frameIndex + 2);
        }else if (rolls.get(frameIndex) + rolls.get(frameIndex + 1) == 10)
            bonus = rolls.get(frameIndex + 2);
        else
            bonus = 0;
        score += bonus;

        // frame 3
        frameIndex = frameIndex + 2;
        score += rolls.get(frameIndex); // roll 5
        score += rolls.get(frameIndex + 1); // roll 6 (spare)
        if (isStrike(frameIndex)) {
            bonus = rolls.get(frameIndex + 1);
            bonus += rolls.get(frameIndex + 2);
        }else if (rolls.get(frameIndex) + rolls.get(frameIndex + 1) == 10)
            bonus = rolls.get(frameIndex + 2);
        else
            bonus = 0;
        score += bonus;

        // frame 4
        frameIndex = frameIndex + 2;
        score += rolls.get(frameIndex); // roll 7
        score += rolls.get(frameIndex + 1); // roll 8
        if (isStrike(frameIndex)) {
            bonus = rolls.get(frameIndex + 1);
            bonus += rolls.get(frameIndex + 2);
        }else if (rolls.get(frameIndex) + rolls.get(frameIndex + 1) == 10)
            bonus = rolls.get(frameIndex + 2);
        else
            bonus = 0;
        score += bonus;

        // frame 5
        frameIndex = frameIndex + 2;
        score += rolls.get(frameIndex); // roll 9
        score += rolls.get(frameIndex + 1); // roll 10
        if (isStrike(frameIndex)) {
            bonus = rolls.get(frameIndex + 1);
            bonus += rolls.get(frameIndex + 2);
        }else if (rolls.get(frameIndex) + rolls.get(frameIndex + 1) == 10)
            bonus = rolls.get(frameIndex + 2);
        else
            bonus = 0;
        score += bonus;

        // frame 6
        frameIndex = frameIndex + 2;
        score += rolls.get(frameIndex); // roll 11
        score += rolls.get(frameIndex + 1); // roll 12
        if (isStrike(frameIndex)) {
            bonus = rolls.get(frameIndex + 1);
            bonus += rolls.get(frameIndex + 2);
        }else if (rolls.get(frameIndex) + rolls.get(frameIndex + 1) == 10)
            bonus = rolls.get(frameIndex + 2);
        else
            bonus = 0;
        score += bonus;

        // frame 7
        frameIndex = frameIndex + 2;
        score += rolls.get(frameIndex); // roll 13
        score += rolls.get(frameIndex + 1); // roll 14 (spare)
        if (isStrike(frameIndex)) {
            bonus = rolls.get(frameIndex + 1);
            bonus += rolls.get(frameIndex + 2);
        }else if (rolls.get(frameIndex) + rolls.get(frameIndex + 1) == 10)
            bonus = rolls.get(frameIndex + 2);
        else
            bonus = 0;
        score += bonus;

        // frame 8
        frameIndex = frameIndex + 2;
        score += rolls.get(frameIndex); // roll 15 (strike)
        if (isStrike(frameIndex)) {
            bonus = rolls.get(frameIndex + 1);
            bonus += rolls.get(frameIndex + 2);
        }else if (rolls.get(frameIndex) + rolls.get(frameIndex + 1) == 10)
            bonus = rolls.get(frameIndex + 2);
        else
            bonus = 0;
        score += bonus;

        // frame 9
        frameIndex = frameIndex + 1;
        score += rolls.get(frameIndex); // roll 16
        score += rolls.get(frameIndex + 1); // roll 17
        if (isStrike(frameIndex)) {
            bonus = rolls.get(frameIndex + 1);
            bonus += rolls.get(frameIndex + 2);
        }else if (rolls.get(frameIndex) + rolls.get(frameIndex + 1) == 10)
            bonus = rolls.get(frameIndex + 2);
        else
            bonus = 0;
        score += bonus;

        // frame 10
        frameIndex = frameIndex + 2;
        score += rolls.get(frameIndex); // roll 18 (strike)
        if (isStrike(frameIndex)) {
            bonus = rolls.get(frameIndex + 1);
            bonus += rolls.get(frameIndex + 2);
        }else if (rolls.get(frameIndex) + rolls.get(frameIndex + 1) == 10)
            bonus = rolls.get(frameIndex + 2);
        else
            bonus = 0;
        score += bonus;

        return score;
    }

    private boolean isStrike(int frameIndex) {
        return rolls.get(frameIndex) == 10;
    }
}
