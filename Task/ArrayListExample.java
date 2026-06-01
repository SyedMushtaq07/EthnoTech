import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<String> playlist = new ArrayList<>();

        playlist.add("Shape of You");
        playlist.add("Perfect");
        playlist.add("Believer");

        System.out.println("Playlist: " + playlist);

        playlist.remove("Perfect");

        for(String song: playlist){
            System.out.println(song);
        }
    }
}
