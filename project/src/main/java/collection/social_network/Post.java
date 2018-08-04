package collection.social_network;

import java.util.ArrayList;
import java.util.List;

public class Post {

    private User author;
    private Group group;
    private long dateCreated;
    private String text;
    private List<Photo> photos;
    private List<Audio> audios;
    private List<Video> videos;
    private List<Like> likes;

    public Post(User author) {
        this.author = author;
        dateCreated = System.currentTimeMillis();
        photos = new ArrayList<>();
        audios = new ArrayList<>();
        videos = new ArrayList<>();
        likes = new ArrayList<>();
    }

    public Post(User author, Group group) {
        this(author);
        this.group = group;
    }


}
