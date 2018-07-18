package collection.social_network;

public class SocialNetwork {

    private static SocialNetwork instance;

    private String name;
    private final long dateCreated;
    private User[] users;
    private Group[] groups;
    private Photo[] photos;
    private Audio[] audios;
    private Video[] videos;

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
