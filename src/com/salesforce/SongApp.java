package com.salesforce;

public class SongApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Song song1 = new Song();
//		Song song2 = new Song();
//		Song song3 = new Song();
//		
//		song1.setArtist("아이유");
//		song1.setTitle("좋은날");
//		song1.setAlbum("Real");
//		song1.setYear("2010");
//		song1.setTrack(3);
//		song1.setComposer("이민수");
//		
//		song2.setArtist("BIGBANG");
//		song2.setTitle("거짓말");
//		song2.setAlbum("Always");
//		song2.setYear("2007");
//		song2.setTrack(2);
//		song2.setComposer("G-DRAGON");
//		
//		song3.setArtist("버스커버스커");
//		song3.setTitle("벚꽃엔딩");
//		song3.setAlbum("버스커버스커1집");
//		song3.setYear("2012");
//		song3.setTrack(4);
//		song3.setComposer("장범준");
		
		Song song1 = new Song("좋은날","아이유","Real","이민수","2010",3);
		Song song2 = new Song("거짓말","BIGBANG","Always","G-DRAGON","2007",2);
		Song song3 = new Song("벚꽃엔딩","버스커버스커","버스커버스커1집","장범준","2012",4);
		
		song1.showInfo();
		
		//toString()을 호출한다. println 은 명령어를 받으면 자동으로 toString()메소드가 호출된다.
		//toString()이 없으면 객체의 메모리 주소가 리턴된다.
		System.out.println(song1);
		
		song2.showInfo();
		System.out.println(song2);
		
		song3.showInfo();
		System.out.println(song3);
		
	}

}
