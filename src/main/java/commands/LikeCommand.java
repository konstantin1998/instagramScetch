package commands;

import entities.Comment;
import entities.Likable;
import entities.Like;
import entities.Post;
import readModel.Storage;

public class LikeCommand implements Command{
    private final Storage<Likable, Like> storage;
    private final Likable likable;
    private final Like like;

    public LikeCommand(Storage<Likable, Like> storage, Likable likable, Like like) {
        this.storage = storage;
        this.likable = likable;
        this.like = like;
    }

    @Override
    public void execute() {
        likable.like();
        storage.add(likable, like);
    }
}
