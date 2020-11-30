package readModel;

import entities.Post;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PostStorage implements Storage<String, Post>{
    private final Map<String, ArrayList<Post>> idsAndPosts;

    PostStorage() {
        idsAndPosts = new HashMap<>();
    }

    @Override
    public void add(String id, Post post) {
        ArrayList<Post> posts = idsAndPosts.get(id);
        if (posts != null) {
            posts.add(post);
            return;
        }
        posts = new ArrayList<>();
        posts.add(post);
        idsAndPosts.put(id, posts);
    }

    @Override
    public Collection<Post> select(String key) {
        return idsAndPosts.get(key);
    }
}
