package assignment_14jan;

import classWork.Movie;

public class Theatre {
		int Theatreid;
		String Theatrename;
		String location;
		MOvie m;
		public Theatre(int theatreid, String theatrename, String location, MOvie mv) {
			super();
			Theatreid = theatreid;
			Theatrename = theatrename;
			this.location = location;
			this.m = mv;
		}
		@Override
		public String toString() {
			return "Theatre [Theatreid=" + Theatreid + ", Theatrename=" + Theatrename + ", location=" + location + ", m="
					+ m + "]";
		}
		
		
		

	}



