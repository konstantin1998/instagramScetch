package commands;

import entities.Post;
import readModel.Storage;


public class PostCommand implements Command{
    private final Storage<String, Post> storage;
    private final Post post;
    private final String id;

    public PostCommand(Storage<String, Post> storage, String id, Post post) {
        this.storage = storage;
        this.post = post;
        this.id = id;
    }

    @Override
    public void execute() {
        storage.add(id, post);
    }
}
