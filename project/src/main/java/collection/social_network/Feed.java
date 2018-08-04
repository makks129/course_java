package collection.social_network;

import java.util.ArrayList;
import java.util.List;

public class Feed {

    private List<Post> posts;

    public Feed() {
        posts = new ArrayList<>();
    }

    public List<Post> getPosts() {
        return posts;
    }
}
