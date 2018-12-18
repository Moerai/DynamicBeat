package dynamic_beat;

public class Track {

	private String titleImage;
	private String startImage;
	private String gameImamge;
	private String startMusic;
	private String gameMusic;
	private String titleName;
	
	public String getTitleImage() {
		return titleImage;
	}
	public void setTitleImage(String titleImage) {
		this.titleImage = titleImage;
	}
	public String getStartImage() {
		return startImage;
	}
	public void setStartImage(String startImage) {
		this.startImage = startImage;
	}
	public String getGameImamge() {
		return gameImamge;
	}
	public void setGameImamge(String gameImamge) {
		this.gameImamge = gameImamge;
	}
	public String getStartMusic() {
		return startMusic;
	}
	public void setStartMusic(String startMusic) {
		this.startMusic = startMusic;
	}
	public String getGameMusic() {
		return gameMusic;
	}
	public void setGameMusic(String gameMusic) {
		this.gameMusic = gameMusic;
	}
	public String getTitleName() {
		return titleName;
	}
	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}
	public Track(String titleImage, String startImage, String gameImamge, String startMusic, String gameMusic, String titleName) {
		this.titleImage = titleImage;
		this.startImage = startImage;
		this.gameImamge = gameImamge;
		this.startMusic = startMusic;
		this.gameMusic = gameMusic;
		this.titleName = titleName;
	}
}
