import java.util.Random;
// Рандомное расставление кораблей компьютера
public class RandomComputer extends Variables {
    public static void randomComputer() {
        // Рандомное расставление кораблей компьютера
        Random random = new Random();

        rand1 = random.nextInt(10);
        rand2 = random.nextInt(10);
        for (int i = 0; i < 10; i++) {

            while (!ComputerFieldMatrix2[rand1][rand2].equals(zvezda2)) {

                rand1 = random.nextInt(10);
                rand2 = random.nextInt(10);
            }
            if (ComputerFieldMatrix2[rand1][rand2].equals(zvezda2)) {
                ComputerFieldMatrix2[rand1][rand2] = computerShip;

                FieldPrisvoenie.fieldPrisvoenieComputer();
                System.out.println();
                System.out.println();
            }
        }
    }
}