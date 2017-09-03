import java.util.HashMap;

public class TrackList {
    public void trackList(){
        // Create a trackList of type HashMap
        HashMap<String, String> tracks = new HashMap<>();
        // Add in at least 4 songs that are stored by title
        tracks.put("Hey Jude", "Nah, nah nah, nah nah, nah nah, nah nah");
        tracks.put("A Hard Day's Night", "It's been a hard day's night, and I've been working like a dog");
        tracks.put("Help!", "Help me if you can, I'm feeling down");
        tracks.put("Eleanor Rigby","All the lonely people, where do they all come from?");
        // Pull out one of the songs by its track title
        System.out.println("The lyrics to Help! include: "+tracks.get("Help!"));
        // Print out all the track names and lyrics in the format Track: Lyrics
        tracks.forEach((k,v) -> System.out.println(k+": "+v));
    }
}
