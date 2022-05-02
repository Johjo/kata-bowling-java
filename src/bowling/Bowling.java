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
        bonus = calculateBonus(frameIndex);
        score += bonus;
        frameIndex = nextFrame(frameIndex);

        // frame 2
        score += rolls.get(frameIndex); // roll 3
        score += rolls.get(frameIndex + 1); // roll 4
        bonus = calculateBonus(frameIndex);
        score += bonus;
        frameIndex = nextFrame(frameIndex);
        // frame 3
        score += rolls.get(frameIndex); // roll 5
        score += rolls.get(frameIndex + 1); // roll 6 (spare)
        bonus = calculateBonus(frameIndex);
        score += bonus;
        frameIndex = nextFrame(frameIndex);

        // frame 4
        score += rolls.get(frameIndex); // roll 7
        score += rolls.get(frameIndex + 1); // roll 8
        bonus = calculateBonus(frameIndex);
        score += bonus;
        frameIndex = nextFrame(frameIndex);

        // frame 5
        score += rolls.get(frameIndex); // roll 9
        score += rolls.get(frameIndex + 1); // roll 10
        bonus = calculateBonus(frameIndex);
        score += bonus;
        frameIndex = nextFrame(frameIndex);

        // frame 6
        score += rolls.get(frameIndex); // roll 11
        score += rolls.get(frameIndex + 1); // roll 12
        bonus = calculateBonus(frameIndex);
        score += bonus;
        frameIndex = nextFrame(frameIndex);

        // frame 7
        score += rolls.get(frameIndex); // roll 13
        score += rolls.get(frameIndex + 1); // roll 14 (spare)
        bonus = calculateBonus(frameIndex);
        score += bonus;
        frameIndex = nextFrame(frameIndex);
        // frame 8
        score += rolls.get(frameIndex); // roll 15 (strike)
        bonus = calculateBonus(frameIndex);
        score += bonus;
        frameIndex = nextFrame(frameIndex);
        // frame 9
        score += rolls.get(frameIndex); // roll 16
        score += rolls.get(frameIndex + 1); // roll 17
        bonus = calculateBonus(frameIndex);
        score += bonus;
        frameIndex = nextFrame(frameIndex);

        // frame 10
        score += rolls.get(frameIndex); // roll 18 (strike)
        bonus = calculateBonus(frameIndex);
        score += bonus;

        return score;
    }

    private int nextFrame(int frameIndex) {
        if (isStrike(frameIndex))
            return frameIndex + 1;
        else
            return frameIndex + 2;

    }

    private int calculateBonus(int frameIndex) {
        int bonus;
        if (isStrike(frameIndex)) {
            bonus = rolls.get(frameIndex + 1);
            bonus += rolls.get(frameIndex + 2);
        }else if (isSpare(frameIndex))
            bonus = rolls.get(frameIndex + 2);
        else
            bonus = 0;
        return bonus;
    }

    private boolean isSpare(int frameIndex) {
        return rolls.get(frameIndex) + rolls.get(frameIndex + 1) == 10;
    }

    private boolean isStrike(int frameIndex) {
        return rolls.get(frameIndex) == 10;
    }
}



