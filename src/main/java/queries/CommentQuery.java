package queries;

import entities.Comment;
import entities.Post;
import readModel.Storage;

import java.util.Collection;

public class CommentQuery implements Query<Comment>{
    private final Storage<Post, Comment> storage;
    private final Post key;

    public CommentQuery(Storage<Post, Comment> storage, Post post) {
        this.storage = storage;
        this.key = post;
    }

    @Override
    public Collection<Comment> select() {
        return storage.select(key);
    }
}
