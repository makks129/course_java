package collection.social_network;

public class GroupProfile {

    private String id;
    private String name;
    private String description;
    private Photo avatar;
    private final long dateCreated;

    public GroupProfile(String id, String name) {
        this.id = id;
        this.name = name;
        dateCreated = System.currentTimeMillis();
    }

}
