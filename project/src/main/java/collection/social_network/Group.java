package collection.social_network;

import java.util.ArrayList;
import java.util.List;

public class Group {

    private GroupProfile profile;
    private List<User> members;
    private User admin;
    private List<Photo> photos;
    private List<Audio> audios;
    private List<Video> videos;
    private Feed feed;

    public Group(GroupProfile profile, User admin) {
        this.profile = profile;
        this.admin = admin;
        members = new ArrayList<>();
        photos = new ArrayList<>();
        audios = new ArrayList<>();
        videos = new ArrayList<>();
        feed = new Feed();
        addUser(admin);
    }

    public void addUser(User user) {
        members.add(user);
    }

    public void removeUser(User user) {
        members.remove(user);
    }
}
