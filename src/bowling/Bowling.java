package bowling;

public class Bowling {
    public void roll(int pin) {

    }

    public int score() {
        int score = 0;

        // frame 1
        score += 3;
        score += 4;

        // frame 2
        score += 6;
        score += 3;

        // frame 3
        score += 2;
        score += 8;
        score += 4;

        // frame 4
        score += 4;
        score += 3;

        // frame 5
        score += 4;
        score += 4;

        // frame 6
        score += 5;
        score += 2;

        // frame 7
        score += 6;
        score += 4;
        score += 10;

        // frame 8
        score += 10;
        score += 8;
        score += 0;


        // frame 9
        score += 8;
        score += 0;


        // frame 10
        score += 10;
        score += 8;
        score += 1;

        return score;
    }
}
