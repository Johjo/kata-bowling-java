import bowling.Bowling;
import org.junit.Test;

public class TestBowling {

    @Test
    public void one_game() {
        Bowling game = new Bowling();

        game.roll(3);
        game.roll(4);
        game.roll(6);
        game.roll(3);
        game.roll(2);
        game.roll(8);
        game.roll(4);
        game.roll(3);
        game.roll(4);
        game.roll(4);
        game.roll(5);
        game.roll(2);
        game.roll(6);
        game.roll(4);
        game.roll(10);
        game.roll(8);
        game.roll(0);
        game.roll(10);
        game.roll(8);
        game.roll(1);





    }

}
