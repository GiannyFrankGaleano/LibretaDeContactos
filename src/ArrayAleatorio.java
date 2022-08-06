public class ArrayAleatorio {
    public static void main(String[] args) {
        String [][] nombres = new String[3][4];

        nombres [0][0] = "Laura";
        nombres [0][1] = "Diego";
        nombres [0][2] = "Paola";
        nombres [0][3] = "Frank";
        nombres [1][0] = "Leilany";
        nombres [1][1] = "Santiago";
        nombres [1][2] = "Jose";
        nombres [1][3] = "Katherin";
        nombres [2][0] = "Issa";
        nombres [2][1] = "Caren";
        nombres [2][2] = "Ronald";
        nombres [2][3] = "Mallerly";



    for (int a = 0; a < 10; a++) {
        int j = (int) (Math.random() * 2-0);
        int i = (int) (Math.random() * 3-0);
        System.out.println(nombres[i][j]);
    }
    }

}
