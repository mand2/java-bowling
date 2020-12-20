package bowling.domain;

import bowling.domain.frame.Frames;
import bowling.domain.score.Pitch;

/**
 * Created By mand2 on 2020-12-21.
 */
public class Bowling {

    private final Name playerName;
    private final Frames frames;

    private Bowling(Name playerName) {
        this(playerName, Frames.init());
    }

    private Bowling(Name playerName, Frames frames) {
        this.playerName = playerName;
        this.frames = frames;
    }

    public static Bowling of(Name playerName) {
        return new Bowling(playerName);
    }

    public String getPlayerName() {
        return playerName.getName();
    }

    public void pitch(Pitch score) {
        frames.bowling(score);
    }

    public boolean isGameEnd() {
        return frames.isFrameEnd();
    }

    public int currentIndex() {
        return this.frames.getCurrentIndex();
    }

}
