package collection.social_network;

import java.util.ArrayList;
import java.util.List;

public class User {

    private UserProfile profile;
    private List<User> friends;
    private List<Group> groups;
    private List<Photo> photos;
    private List<Audio> audios;
    private List<Video> videos;
    private Feed feed;

    public User(UserProfile profile) {
        this.profile = profile;
        friends = new ArrayList<>();
        groups = new ArrayList<>();
        photos = new ArrayList<>();
        audios = new ArrayList<>();
        videos = new ArrayList<>();
        feed = new Feed();
    }

    public UserProfile getProfile() {
        return profile;
    }

    public void setProfile(UserProfile profile) {
        this.profile = profile;
    }

    public void setFriends(List<User> friends) {
        this.friends = friends;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    public void setAudios(List<Audio> audios) {
        this.audios = audios;
    }

    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }

    public void setFeed(Feed feed) {
        this.feed = feed;
    }

    @Override
    public String toString() {
        return "User: profile (" + profile.toString() + "), " +
                "has " + friends.size() + " friends, " +
                "is member of " + groups.size() + " groups, " +
                "has " + photos.size() + " photos, " +
                "has " + audios.size() + " audios, " +
                "has " + videos.size() + " videos, " +
                "has " + feed.getPosts().size() + " posts in feed.";
    }
}
