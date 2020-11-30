package queries;

import entities.Post;
import readModel.Storage;

import java.util.Collection;

public class PostQuery implements Query<Post>{
    private final Storage<String, Post> storage;
    private final String key;

    public PostQuery(Storage<String, Post> storage, String id) {
        this.storage = storage;
        this.key = id;
    }

    @Override
    public Collection<Post> select() {
        return storage.select(key);
    }
}
