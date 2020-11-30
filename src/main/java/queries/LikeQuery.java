package queries;

import entities.Likable;
import entities.Like;
import readModel.Storage;

import java.util.Collection;

public class LikeQuery implements Query<Like>{
    private final Storage<Likable, Like> storage;
    private final Likable key;

    public LikeQuery(Storage<Likable, Like> storage, Likable likable) {
        this.storage = storage;
        this.key = likable;
    }


    @Override
    public Collection<Like> select() {
        return storage.select(key);
    }
}
