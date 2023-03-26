package Array;

public class LetterClass {
    public static void main(String[] args) {
        String[][] letter = new String[6][4];
        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                if (i == 0 || i == 2) {
                    letter[i][j] = " * ";
                } else if (j==0 || j==3) {
                    letter[i][j] = " * ";
                } else {
                    letter[i][j] = "   ";
                }
            }
        }
        for (String [] row : letter) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.print("\n");

        }
        System.out.println("\n");

        String[][] letterb = new String[7][4];
        for (int k = 0; k<letterb.length; k++) {
            for (int l = 0; l<letterb[k].length; l++) {
                if (k == 0 || k == 3 || k == 6) {
                    letterb[k][l] = " * ";

                } else if(l == 0 || l == 3) {
                    letterb[k][l] = " * ";
                } else {
                    letterb[k][l] = "   ";
                }
            }
        }
        for (String[] roww : letterb) {
            for (String coll : roww) {
                System.out.print(coll);
            }
            System.out.print("\n");
        }
    }
}
