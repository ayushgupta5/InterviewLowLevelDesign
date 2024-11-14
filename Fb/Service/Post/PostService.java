package Service.Post;

import Model.Post.Post;

public class PostService implements IPostService {

    @Override
    public void createPost(Post post) {
        System.out.println("Creating the Post : " +post.toString());
    }

    @Override
    public void likePost(Post post) {
        System.out.println("Liking the Post : " +post.toString());
    }

    @Override
    public void commentPost(Post post) {
        System.out.println("Commenting the Post : " +post.toString());
    }
}
