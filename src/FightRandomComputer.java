import java.util.Random;

public class FightRandomComputer extends Variables {
    public static void fightRandomComputer() {
        Random random = new Random();
        rand1 = random.nextInt(10);
        rand2 = random.nextInt(10);

        if (PlayerFieldMatrix1[rand1][rand2].equals(zvezda1)) {
            PlayerFieldMatrix1[rand1][rand2] = miss;
            FieldPrisvoenie.fieldPrisvoeniePlayer();
            FightRandomPlayer.fightRandomPlayer();
        } else if (PlayerFieldMatrix1[rand1][rand2].equals(playerShip)) {
            PlayerFieldMatrix1[rand1][rand2] = ubit;
            FieldPrisvoenie.fieldPrisvoeniePlayer();
            FightRandomPlayer.fightRandomPlayer();
        }
        while ((PlayerFieldMatrix1[rand1][rand2].equals(miss)) || (PlayerFieldMatrix1[rand1][rand2].equals(ubit))) {
            rand1 = random.nextInt(10);
            rand2 = random.nextInt(10);
        }

        if (PlayerFieldMatrix1[rand1][rand2].equals(zvezda1)) {
            PlayerFieldMatrix1[rand1][rand2] = miss;
            FieldPrisvoenie.fieldPrisvoeniePlayer();
            FightRandomPlayer.fightRandomPlayer();

        } else if (PlayerFieldMatrix1[rand1][rand2].equals(playerShip)) {
            PlayerFieldMatrix1[rand1][rand2] = ubit;
            FieldPrisvoenie.fieldPrisvoeniePlayer();
            FightRandomPlayer.fightRandomPlayer();


        }
    }
}
