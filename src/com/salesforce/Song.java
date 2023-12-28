package com.salesforce;

public class Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private String year;
	private int track;
	
	
	

	public Song() {

	}
	
	public Song(String s1, String s2) {
		this(s1, s2, null, null, null, 0); // this는 아래 생성자를 가리킴.
	}

	public Song(String title, String artist, String album, String composer, String year, int track) {
		super();
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
	
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	
	public void showInfo() {
		System.out.println(this.getArtist() + ", " + this.getTitle() + " (" + this.getAlbum() + ", "
				+ this.getYear() + ", " + this.getTrack() + "번 트랙, " + this.getComposer() + " 작곡 )");
	}

	//모든 멤버에 접근해서 하나의 문자열로 리턴해줌.
	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer + ", year="
				+ year + ", track=" + track + "]";
	}
	
	
	
}
