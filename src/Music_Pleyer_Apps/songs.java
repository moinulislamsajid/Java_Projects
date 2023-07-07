package Music_Pleyer_Apps;

public class songs {
	 String title;
	 double duration;
	 //create a constructor
	 
	public songs(String name, double duration) {
		
		this.title = name;
		this.duration = duration;
	}
	// create a constructor to ope
	public songs() {
		
	}
	public String getTitle() {
		return title;
	}
	public double getDuration() {
		return duration;
	}
	@Override
	public String toString() {
		return "songs [title=" + title + ", duration=" + duration + "]";
	}
	
	
	 

}
