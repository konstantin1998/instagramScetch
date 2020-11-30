package entities;

public class Post implements Likable{
    private int numLikes;
    private final String id;
    private final String content;

    Post(String id, String content) {
        numLikes = 0;
        this.id = id;
        this.content = content;
    }

    @Override
    public void like() {
        numLikes += 1;
    }
}
