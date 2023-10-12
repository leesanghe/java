package ch09_class.quiz;

import java.util.ArrayList;

public class MovieDB {

	private ArrayList<Movie> movieList = new ArrayList<Movie>();
	//싱글톤 패턴
	private MovieDB() {
		movieList.add(new Movie("신세계", "거 죽기 딱 좋은 날씨네", "박성웅", "ㅅㅅㄱ"));
		movieList.add(new Movie("기생충", "넌 계획이 다 있구나", "송강호", "ㄱㅅㅊ"));
		movieList.add(new Movie("달콤한인생", "넌 나에게 모욕감을 줬어", "김영철", "ㄷㅋㅎㅇㅅ"));
		movieList.add(new Movie("해바라기", "꼭 그렇게 다 가져가야만 속이 후련했냐!!!", "김래원", "ㅎㅂㄹㄱ"));
		movieList.add(new Movie("내머리속에지우개", "용서는 미움에 방 한 칸만 내어주면 되는 거래", "손예진", "ㄴㅁㄹㅅㅇㅈㅇㄱ"));
		movieList.add(new Movie("내머리속에지우개", "이거 마시면 사귀는거다", "정우성", "ㄴㅁㄹㅅㅇㅈㅇㄱ"));
		movieList.add(new Movie("은교", "너희 젊음이 너희 노력으로 얻은 상이 아니듯이 내 늙음도 내 잘못으로 받은 벌이 아니다", "박해일", "ㅇㄱ"));
	}
	//인스턴스 생성을 해당 클래스에 하기 때문에(private)외부에서 못함.
	private static MovieDB instance = new MovieDB();
	//외부에서 접근 
	public static MovieDB getInstance() {
		return instance;
	}
	//외부에서 접근
	public ArrayList<Movie> getMovieList(){
		return movieList;
	}
}
