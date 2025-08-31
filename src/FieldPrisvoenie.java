// Присвоение изменений(расстановка кораблей, вместо звёздочек)
public class FieldPrisvoenie extends Field {
    public static void fieldPrisvoeniePlayer() {
        for (int i = 0; i < PlayerFieldMatrix1.length; i++) { // Строки
            for (int j = 0; j < PlayerFieldMatrix1[i].length; j++) { // Столбцы
                System.out.print(PlayerFieldMatrix1[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }

    public static void fieldPrisvoenieComputer() {
        for (int i = 0; i < ComputerFieldMatrix2.length; i++) {
            for (int j = 0; j < ComputerFieldMatrix2[i].length; j++) {
                System.out.print(ComputerFieldMatrix2[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }
}