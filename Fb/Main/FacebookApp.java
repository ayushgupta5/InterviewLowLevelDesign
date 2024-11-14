package Main;

import Model.Comment.Comment;
import Model.Notification.Notification;
import Model.Post.Post;
import Model.User.User;
import Service.Comment.CommentService;
import Service.Comment.ICommentService;
import Service.Notification.INotificationService;
import Service.Notification.NotificationService;
import Service.Post.IPostService;
import Service.Post.PostService;
import Service.User.IUserService;
import Service.User.UserService;

import java.time.LocalDateTime;

public class FacebookApp {
    public static void main(String[] args) {
        User user = new User(1, "Kohli", "kohli@gmail.com");
        LocalDateTime createdAt = LocalDateTime.now();
        Post post = new Post(1, "Trip", createdAt);
        Comment comment = new Comment(1, "Post");
        Notification notification = new Notification(1, "Got Friend Request");

        IUserService userService = new UserService();
        userService.login(user);
        userService.sendFriendRequest(user);
        userService.acceptFriendRequest(user);

        IPostService postService = new PostService();
        postService.createPost(post);
        postService.commentPost(post);
        postService.likePost(post);

        ICommentService commentService = new CommentService();
        commentService.addComment(comment);

        INotificationService notificationService = new NotificationService();
        notificationService.sendNotification(notification);
    }
}
