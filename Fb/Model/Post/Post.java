package Model.Post;

import java.time.LocalDateTime;

public class Post {
    private int postID;
    private String content;
    private LocalDateTime createdAt;

    public Post(int postID, String content, LocalDateTime createdAt) {
        this.postID = postID;
        this.content = content;
        this.createdAt = createdAt;
    }

    public int getPostID() {
        return postID;
    }

    public void setPostID(int postID) {
        this.postID = postID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Post{" +
                "postID=" + postID +
                ", content='" + content + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
