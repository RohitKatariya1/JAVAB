package assignment_14jan;





	public class MOvie {
		int Movieid;
		String Moviename;
		double Rating;
		public MOvie(int movieid, String moviename, int rating) {
			super();
			Movieid = movieid;
			Moviename = moviename;
			Rating = rating;
		}
		@Override
		public String toString() {
			return "Movie [Movieid=" + Movieid + ", Moviename=" + Moviename + ", Rating=" + Rating + "]";
		}
		

	
}


