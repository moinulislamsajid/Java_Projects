package Music_Pleyer_Apps;

import java.util.ArrayList;
import java.util.LinkedList;


public class Album  {
	private String nameOfAlbum;
	private String artist;
	private ArrayList<songs>song;  // this is a array list here a songs is class and song is variable name
	
	// create a constructor
	
	public Album(String nameOfAlbum, String artist) {
		super();
		this.nameOfAlbum = nameOfAlbum;
		this.artist = artist;
		this.song = new ArrayList<songs>(); // array for songs
	}
	
	// create a empty constructor
	
	public Album() {
		
	}
	
	// create a songs method
	public songs findSongs(String title) {
		// to for each loop
		for(songs checkedSong : song)        // syntax to for each loop data type new variable : old variable
		if(checkedSong.getTitle().equals(title)) {
			return checkedSong;
		}
		return null;
	}
	//  import speaking
	// when you declared a class this  class also work on data type
	
	/*
	 * 
	 * 
	 * public songs findSongs(String title,double duration){
	 * 	/// to generated a for each loop       
	 * for(songs checkedSongs: song){
	 * 	if(checkedSong.getTitle().equals(title){
	 * 			return checkedSong;
	 *		 }
	 * }
	 * */
	
	
	// create a method for add songs
	
	public boolean addSongs(String title,double duration) {
		if(findSongs(title) == null) {
			song.add((new songs(title,duration)));
			System.out.println(title+"succesfully Add to this list");
			return true;
		}
		else {
			System.out.println("songs with name" + title + "Already exist in the title");
			return false;
		}
	}
	
	public boolean addtoplaylist(int trackNumber, LinkedList<songs> playlist) {
		int index = trackNumber -1;
		if(index > 0 && index <=this.song.size()) {
			playlist.add(this.song.get(index));
			return true;
		}
		System.out.println("THis is album have song with tracknumber"+trackNumber);
		return false;
		
		
			}
	
	public boolean addtoplaylist(String title,LinkedList<songs> playlist) {
		for(songs checkedSong : this.song) {
			if(checkedSong.getTitle().equals(title)) {
				playlist.add(checkedSong);
				return true;

			}
			
		}
		System.out.println(title+"there is no such songs album");
		return false;


		
	}
	
	
	
	

}
