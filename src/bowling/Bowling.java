package bowling;

import org.hamcrest.core.Is;

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
        int frameScore = 0;
        int bonus = 0;

        // frame 1
        frameIndex = 0;
        frameScore = calculateFrameScore(frameIndex);
        bonus = calculateBonus(frameIndex);
        score += frameScore + bonus;
        frameIndex = nextFrame(frameIndex);

        // frame 2
        frameScore = calculateFrameScore(frameIndex);
        bonus = calculateBonus(frameIndex);
        score += frameScore + bonus;
        frameIndex = nextFrame(frameIndex);

        // frame 3
        frameScore = calculateFrameScore(frameIndex);
        bonus = calculateBonus(frameIndex);
        score += frameScore + bonus;
        frameIndex = nextFrame(frameIndex);

        // frame 4
        frameScore = calculateFrameScore(frameIndex);
        bonus = calculateBonus(frameIndex);
        score += frameScore + bonus;
        frameIndex = nextFrame(frameIndex);

        // frame 5
        frameScore = calculateFrameScore(frameIndex);
        bonus = calculateBonus(frameIndex);
        score += frameScore + bonus;
        frameIndex = nextFrame(frameIndex);

        // frame 6
        frameScore = calculateFrameScore(frameIndex);
        bonus = calculateBonus(frameIndex);
        score += frameScore + bonus;
        frameIndex = nextFrame(frameIndex);

        // frame 7
        frameScore = calculateFrameScore(frameIndex);
        bonus = calculateBonus(frameIndex);
        score += frameScore + bonus;
        frameIndex = nextFrame(frameIndex);

        // frame 8
        frameScore = calculateFrameScore(frameIndex);
        bonus = calculateBonus(frameIndex);
        score += frameScore + bonus;
        frameIndex = nextFrame(frameIndex);

        // frame 9
        frameScore = calculateFrameScore(frameIndex);
        bonus = calculateBonus(frameIndex);
        score += frameScore + bonus;
        frameIndex = nextFrame(frameIndex);

        // frame 10
        frameScore = calculateFrameScore(frameIndex);
        bonus = calculateBonus(frameIndex);
        score += frameScore + bonus;

        return score;
    }

    private int calculateFrameScore(int frameIndex) {
        int frameScore;
        if (isStrike(frameIndex))
            frameScore = rolls.get(frameIndex);
        else {
            frameScore = rolls.get(frameIndex);
            frameScore += rolls.get(frameIndex + 1);
        }
        return frameScore;
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



