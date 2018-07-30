package collection.social_network;

public class User {

    private UserProfile profile;
    private User[] friends;
    private Group[] groups;
    private Photo[] photos;
    private Audio[] audios;
    private Video[] videos;
    private Feed feed;

    public User(UserProfile profile) {
        this.profile = profile;
        friends = new User[1000]; // User can have maximum 1000 friends
        groups = new Group[100]; // User can have maximum 100 groups
        photos = new Photo[1000]; // User can have maximum 1000 photos
        audios = new Audio[100]; // User can have maximum 100 audios
        videos = new Video[100]; // User can have maximum 100 videos
        feed = new Feed();
    }

    public UserProfile getProfile() {
        return profile;
    }
}
