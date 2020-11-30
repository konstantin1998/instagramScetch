package readModel;

import entities.Comment;
import entities.Post;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CommentStorage implements Storage<Post, Comment>{
    private final Map<Post, ArrayList<Comment>> postsAndComments;

    public CommentStorage() {
        postsAndComments = new HashMap<>();
    }

    @Override
    public void add(Post post, Comment comment) {
        if (postsAndComments.containsKey(post)) {
            postsAndComments.get(post).add(comment);
        } else {
            ArrayList<Comment> comments = new ArrayList<>();
            comments.add(comment);
            postsAndComments.put(post, comments);
        }
    }

    @Override
    public Collection<Comment> select(Post key) {
        return postsAndComments.get(key);
    }
}
