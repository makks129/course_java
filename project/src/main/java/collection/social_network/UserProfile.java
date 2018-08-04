package collection.social_network;

import java.util.Date;

public class UserProfile {

    public static final int GENDER_MALE = 1;
    public static final int GENDER_FEMALE = 2;

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

    public int getGender() {
        return gender;
    }

    public Photo getAvatar() {
        return avatar;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public void setAvatar(Photo avatar) {
        this.avatar = avatar;
    }

    @Override
    public String toString() {
        return "id = " + id +
                ", name = " + name +
                ", age = " + age +
                ", gender = " + gender +
                ", dateRegistered = " + new Date(dateRegistered);
    }
}
