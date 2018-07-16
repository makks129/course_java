package collection.social_network;

public class Group {

    private GroupProfile profile;
    private User[] members;
    private int membersCount;
    private User admin;
    private Photo[] photos;
    private Audio[] audios;
    private Video[] videos;
    private Feed feed;

    public Group(GroupProfile profile, User admin) {
        this.profile = profile;
        this.admin = admin;
        membersCount = 0;
        members = new User[1000]; // Group can have maximum 1000 members
        photos = new Photo[1000]; // Group can have maximum 1000 photos
        audios = new Audio[1000]; // Group can have maximum 100 audios
        videos = new Video[1000];  // Group can have maximum 100 videos
        feed = new Feed();
        addUser(admin);
    }

    private void addUser(User user) {
        members[membersCount] = user;
        membersCount++;
    }
}
