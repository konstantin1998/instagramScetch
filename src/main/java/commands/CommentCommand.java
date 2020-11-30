package commands;

import entities.Comment;
import entities.Post;
import readModel.Storage;

public class CommentCommand implements Command{
    private final Storage<Post, Comment> storage;
    private final Post post;
    private final Comment comment;

    public CommentCommand(Storage<Post, Comment> storage, Post post, Comment comment) {
        this.storage = storage;
        this.post = post;
        this.comment = comment;
    }

    @Override
    public void execute() {
        storage.add(post, comment);
    }
}
