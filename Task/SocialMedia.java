class Post{
    String content;
    Post prev, next;

    Post(String content){
        this.content = content;
        this.prev = null;
        this.next = null;
    }
}

class SocialMediaFeed{
    Post head, tail, current;
    public void insertPost(String content){
        Post newPost = new Post(content);
        if (head == null) {
            head = tail = current = newPost;
        } else {
            tail.next = newPost;
            newPost.prev = tail;
            tail = newPost;
        }
        System.out.println("Post added: " + content);
    }
    public void nextPost(){
        if (current != null && current.next != null){
            current = current.next;
            System.out.println("Current Post: " + current.content);
        } else{
            System.out.println("No next post available.");
        }
    }
    public void previousPost(){
        if (current != null && current.prev != null){
            current = current.prev;
            System.out.println("Current Post: " + current.content);
        } else{
            System.out.println("No previous post available.");
        }
    }
    public void displayFeed(){
        if (head == null){
            System.out.println("Feed is empty.");
            return;
        }
        Post temp = head;
        System.out.println("\nFeed");
        while (temp != null){
            System.out.println(temp.content);
            temp = temp.next;
        }
    }
    public void showCurrentPost(){
        if (current != null)
            System.out.println("Current Post: " + current.content);
        else
            System.out.println("No posts available.");
    }
    public void insertSponsoredPost(String content){
        Post sponsored = new Post("{Sponsored}: " + content);
        if (head == null){
            head = tail = current = sponsored;
        } else{
            sponsored.next = head;
            head.prev = sponsored;
            head = sponsored;
        }
        System.out.println("Sponsored Post Added.");
    }
    public void deleteCurrentPost(){
        if (current == null){
            System.out.println("No post to delete.");
            return;
        }
        System.out.println("Deleted: " + current.content);
        
        if (current == head && current == tail) {
            head = tail = current = null;
        } else if (current == head) {
            head = head.next;
            head.prev = null;
            current = head;
        } else if (current == tail) {
            tail = tail.prev;
            tail.next = null;
            current = tail;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
            current = current.next;
        }
    }
}

public class SocialMedia{
    public static void main(String[] args){
        SocialMediaFeed feed = new SocialMediaFeed();
        feed.insertPost("Trip for Annapurna Base Camp!!!");
        feed.insertPost("Learning Java.");
        feed.insertPost("Playing Chess.");
        feed.insertSponsoredPost("Buy Premium Subscription!");
        feed.displayFeed();
        System.out.println();
        feed.showCurrentPost();
        feed.nextPost();
        feed.nextPost();
        feed.previousPost();
        feed.deleteCurrentPost();
        feed.displayFeed();
    }
}