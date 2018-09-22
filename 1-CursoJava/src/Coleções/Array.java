package Coleções;

public class Array {

	public static void main(String[] args) {
		double[] notasJoao = {7.0,8.7,6.2,4.9,9.7};
		
		double[] notasPedro = new double[5];
		notasPedro[0] = 7;
		notasPedro[1] = 7;
		notasPedro[2] = 7;
		notasPedro[3] = 7;
		notasPedro[4] = 7;
		
		double totalJoao = 0;
		for(double nota: notasJoao) {
			totalJoao += nota;
		}
		// for (int i = 0; i < notasJoao.length; i++) {
		// totalJoao += notasJoao[i];
		// }
		
		double totalPedro = 0;
		for(double nota: notasPedro) {
			totalPedro += nota;
		}
		// for (int i = 0; i < notasPedro.length; i++) {
		// totalPedro += notasPedro[i];
		// }

		System.out.println(totalJoao / notasJoao.length);
		System.out.println(totalPedro / notasPedro.length);
		
		
	}
}
