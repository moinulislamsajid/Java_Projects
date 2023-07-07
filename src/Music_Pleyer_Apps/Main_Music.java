package Music_Pleyer_Apps;
import java.util.*;
public class Main_Music {

	// creating an array list of album

	private static ArrayList<Album>  albums =  new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		Album album = new Album("album1","Ayman Sajid");
		
		album.addSongs("Kabira", 4);
		album.addSongs("kesariya", 4.5);
		album.addSongs("channaMeriya", 5);
		album.addSongs("o re piya", 5.5);
		
		album = new Album("album2","Samiur Sakib");
		
		album.addSongs("agar tum sath ho", 4);
		album.addSongs("ilahi", 4.5);
		album.addSongs("Ae dil hai mushkil", 5);
		album.addSongs("piya", 5.5);
		
		albums.add(album);
		
		// creating a linkedList for createing a songs
	
		LinkedList<songs> playlist_1 = new LinkedList<>();
	
		albums.get(0).addtoplaylist("kesariya", playlist_1);
		albums.get(0).addtoplaylist("kabira", playlist_1);
		albums.get(1).addtoplaylist("chennna meriya", playlist_1);
		albums.get(1).addtoplaylist("o re piya", playlist_1);
		
		play(playlist_1);
	}
	

	private static void play(LinkedList<songs> playlist) {
		Scanner in = new Scanner(System.in);
		boolean quit = false;
		boolean forword = true;
		ListIterator<songs> listiterator = playlist.listIterator();
		if(playlist.size() == 0) {
			System.out.println("THis playList Have No songs");
		}
		else {
			System.out.println("Now playing "+ listiterator.next().toString());
			printManu();
		}
		while(!quit) {
			int action = in.nextInt();
			in.nextLine();
			switch(action){
			case 0 :
				System.out.println("Playlist Complete");
				quit = true;
				
			case 1 :
				
			}
			
		}
	}
	
	private static void printManu() {
		System.out.println("Available option\n press");
		System.out.print(" 0 ---- to quit\n"+ "1 ---- to play next song\n" + "2 ---- to play prevoius song\n" + "3 ---- to replay the cuuernt song\n"+"4 --- list of all songs\n"+"5 ---- print all available option\n"+"6 ---- delate  cuuernt songs");
		
	}
	
	private static void printlist(LinkedList<songs> playlist) {
		Iterator<songs> iterator = playlist.iterator();
		System.out.println("---------------------------");
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("------------------------");

	}

}
