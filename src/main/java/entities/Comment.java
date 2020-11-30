package entities;

public class Comment implements Likable{
    private int numLikes;
    private final String text;

    Comment(String content) {
        numLikes = 0;
        this.text = content;
    }

    @Override
    public void like() {
        numLikes += 1;
    }
}
