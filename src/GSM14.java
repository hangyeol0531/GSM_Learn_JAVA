import gsm.util.MovieArray;
import gsm.util.MovieVO;
public class GSM14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MovieArray movie = new MovieArray(3);
		 movie.add(new MovieVO("movie1", "정한결  ", 10000, 10));
		 movie.add(new MovieVO("movie2", "정한결  ", 9000, 9));
		 movie.add(new MovieVO("movie3", "정한결  ", 8000, 8));
		 
		 for(int i = 0; i<movie.size();i++){
	            System.out.println(movie.get(i));
	        }
	}

}
