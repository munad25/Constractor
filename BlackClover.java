public class BlackClover extends Anime{
	
	public int jmlTokoh;

	public BlackClover(String genre, int jmlTokoh){
		super(genre);		
		this.jmlTokoh = jmlTokoh;
	}

	public BlackClover(String genre){
		super(genre);
	}


	public void showJmlTokoh(){
		System.out.println(jmlTokoh);
	}

}