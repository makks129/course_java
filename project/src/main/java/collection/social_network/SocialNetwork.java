package collection.social_network;

import java.util.List;

public class SocialNetwork {

    private static SocialNetwork instance;

    private String name;
    private final long dateCreated;
    private List<User> users;
    private List<Group> groups;
    private List<Photo> photos;
    private List<Audio> audios;
    private List<Video> videos;

    private SocialNetwork(String name) {
        this.name = name;
        dateCreated = System.currentTimeMillis();
    }

    public static SocialNetwork getInstance(String name) {
        if (instance == null) {
            instance = new SocialNetwork(name);
        }
        return instance;
    }

}
