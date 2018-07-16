package collection.social_network;

public class SocialNetwork {

    private String name;
    private final long dateCreated;
    private User[] users;
    private Group[] groups;
    private Photo[] photos;
    private Audio[] audios;
    private Video[] videos;

    public SocialNetwork(String name) {
        this.name = name;
        dateCreated = System.currentTimeMillis();
    }


}
