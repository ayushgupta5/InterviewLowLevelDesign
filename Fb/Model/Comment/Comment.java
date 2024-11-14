package Model.Comment;

public class Comment {
    private int commentID;
    private String content;

    public Comment(int commentID, String content) {
        this.commentID = commentID;
        this.content = content;
    }

    public int getCommentID() {
        return commentID;
    }

    public void setCommentID(int commentID) {
        this.commentID = commentID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "commentID=" + commentID +
                ", content='" + content + '\'' +
                '}';
    }
}
