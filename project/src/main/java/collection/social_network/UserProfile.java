package collection.social_network;

public class UserProfile {

    private String id;
    private String name;
    private int age;
    private int gender;
    private Photo avatar;
    private long dateRegistered;

    public UserProfile(String id, String name) {
        this.id = id;
        this.name = name;
        dateRegistered = System.currentTimeMillis();
    }

    public UserProfile(String id, String name, int age) {
        this(id, name);
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
