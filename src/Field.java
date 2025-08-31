public class Field extends Variables {
    public static void PlayerField1() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                PlayerFieldMatrix1[i][j] = zvezda1;
                System.out.print(PlayerFieldMatrix1[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }

    public static void ComputerField2() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                ComputerFieldMatrix2[i][j] = zvezda2;
                System.out.print(ComputerFieldMatrix2[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }
}
