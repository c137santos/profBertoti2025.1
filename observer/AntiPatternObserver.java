import java.util.ArrayList;
import java.util.List;

public class Blog {
    
    private List<String> posts = new ArrayList<>();
    private boolean hasNewPost = false;

    public void addPost(String post) {
        posts.add(post);
        hasNewPost = true;
    }

    public boolean checkForNewPost() {
        return hasNewPost;
    }

    public List<String> getPosts() {
        return posts;
    }
}

public class Client {
    private Blog blog;

    public Client(Blog blog) {
        this.blog = blog;
    }

    public void checkForUpdates() {
        while (true) {
            if (blog.checkForNewPost()) {
                System.out.println("New post available: " + blog.getPosts().get(blog.getPosts().size() - 1));
                break;
            }
        }
    }
}
