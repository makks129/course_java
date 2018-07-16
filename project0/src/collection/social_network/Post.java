package collection.social_network;

public class Post {

    private User author;
    private Group group;
    private long dateCreated;
    private String text;
    private Photo[] photos;
    private Audio[] audios;
    private Video[] videos;
    private Like[] likes;

    public Post(User author) {
        this.author = author;
        dateCreated = System.currentTimeMillis();
        photos = new Photo[100]; // Post can have maximum 100 photos
        audios = new Audio[10]; // Post can have maximum 10 audios
        videos = new Video[3]; // Post can have maximum 3 videos
        likes = new Like[1000]; // Post can have maximum 1000 likes
    }

    public Post(User author, Group group) {
        this(author);
        this.group = group;
    }


}
