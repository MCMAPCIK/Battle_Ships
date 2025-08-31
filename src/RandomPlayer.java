import java.util.Random;

public class RandomPlayer extends Variables {
    public static void randomPlayer() {
        // Рандомное расставление кораблей игрока
        Random random = new Random();

        rand1 = random.nextInt(10);
        rand2 = random.nextInt(10);
        for (int i = 0; i < 10; i++) {

            while (!PlayerFieldMatrix1[rand1][rand2].equals(zvezda1)) {

                rand1 = random.nextInt(10);
                rand2 = random.nextInt(10);
            }
            if (PlayerFieldMatrix1[rand1][rand2].equals(zvezda1)) {
                PlayerFieldMatrix1[rand1][rand2] = playerShip;

                FieldPrisvoenie.fieldPrisvoeniePlayer();
                System.out.println();
                System.out.println();
            }
        }
    }
}