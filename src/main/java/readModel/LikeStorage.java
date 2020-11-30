package readModel;

import entities.Likable;
import entities.Like;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class LikeStorage implements Storage<Likable, Like>{
    private final Map<Likable, ArrayList<Like>> likes;

    public LikeStorage() {
        likes = new HashMap<>();
    }

    @Override
    public void add(Likable likable, Like like) {
        if (likes.containsKey(likable)) {
            likes.get(likable).add(like);
        } else {
            ArrayList<Like> comments = new ArrayList<>();
            comments.add(like);
            likes.put(likable, comments);
        }
    }

    @Override
    public Collection<Like> select(Likable key) {
        return likes.get(key);
    }
}
