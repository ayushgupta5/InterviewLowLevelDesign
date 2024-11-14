package Service.Comment;

import Model.Comment.Comment;

public class CommentService implements ICommentService {
    @Override
    public void addComment(Comment comment) {
        System.out.println("Adding the Comments : " +comment.toString());
    }
}
