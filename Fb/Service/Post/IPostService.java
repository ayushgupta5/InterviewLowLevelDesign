package Service.Post;

import Model.Post.Post;

public interface IPostService {
    void createPost(Post post);
    void likePost(Post post);
    void commentPost(Post post);
}
