package Coleções;

public class Matriz {

	public static void main(String[] args) {
		
		double [][] nJ= {{ 7 , 7 },{ 9 , 9 }};	
		
		double [][] nP = new double[2][];
		nP[0] = new double[2];
		nP[1] = new double[2];
		nP[0][0] = 9;
		nP[0][1] = 9;
		nP[1][0] = 8;
		nP[1][1] = 8;
		
		double tJ = 0;
		int qJ = 0;
		
		for (int i = 0; i < nJ.length; i++) {
			for (int j = 0; j < nJ[i].length; j++) {
				tJ += nJ[i][j];
				qJ++;
			}
		}
		
		
		double tP = 0;
		int qP = 0;
		
		for (double[] NP : nP) {
			for (double N : NP) {
				tP += N;
				qP++;
			}
		}
		
		
		System.out.println(tJ/qJ);
		
		System.out.println(tP/qP);
		
		
		
	}
	
}
