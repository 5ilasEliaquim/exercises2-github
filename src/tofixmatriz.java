

public class tofixmatriz {

	public static void main(String[] args) {
		
		int n = 3;
		int[][] mat = new int [n][n]; 
		int [] v = new int [n];
		
		for(int i =0;i<n;i++) {
			int x = 0;
			for(int j=0;j<n;j++) {
				mat[i][j] = i +j;
				x = x + mat[i][j];
				
			}
			v[i]=x;
		}
		
		System.out.println();

	}

}
