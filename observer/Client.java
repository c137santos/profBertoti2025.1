package observer;
    
public class Client implements Observer {
    private String name;

    public Client(String name) {
        this.name = name;
    }

    @Override
    public void update(Blog blog) {
        System.out.println(name + " received an update! New posts:");
        for (String post : blog.getPosts()) {
            System.out.println(post);
        }
    }
}
