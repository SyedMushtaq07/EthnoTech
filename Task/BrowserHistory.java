public class BrowserHistory{
    static class Node{
        String page;
        Node next;
        Node(String page){
            this.page = page;
            this.next = null;
        }
    }

    Node head = null;
    void visitPage(String page){
        Node newNode = new Node(page);
        if (head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    void displayHistory(){
        Node temp = head;
        System.out.println("Browsing History:");
        while (temp != null){
            System.out.println(temp.page);
            temp = temp.next;
        }
    }
    void searchPage(String page){
        Node temp = head;
        while (temp != null){
            if (temp.page.equals(page)){
                System.out.println(page + " Found");
                return;
            }
            temp = temp.next;
        }
        System.out.println(page + " Not Found");
    }
    void deletePage(String page){
        if (head == null)
            return;
        if (head.page.equals(page)){
            head = head.next;
            return;
        }
        Node temp = head;
        while (temp.next != null &&
               !temp.next.page.equals(page)){
            temp = temp.next;
        }
        if (temp.next != null){
            temp.next = temp.next.next;
        }
    }
    void countPages(){
        int count = 0;
        Node temp = head;
        while (temp != null){
            count++;
            temp = temp.next;
        }
        System.out.println("Total Pages Visited: " + count);
    }
    public static void main(String[] args){
        BrowserHistory bh = new BrowserHistory();
        bh.visitPage("google.com");
        bh.visitPage("youtube.com");
        bh.visitPage("github.com");
        bh.visitPage("chatgpt.com");
        bh.displayHistory();
        bh.searchPage("github.com");
        bh.deletePage("youtube.com");
        System.out.println("\nAfter Deletion:");
        bh.displayHistory();
        bh.countPages();
    }
}