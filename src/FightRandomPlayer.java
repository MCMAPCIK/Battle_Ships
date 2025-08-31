import java.util.Random;

public class FightRandomPlayer extends Variables {
    public static void fightRandomPlayer() {
        Random random = new Random();
        rand1 = random.nextInt(10);
        rand2 = random.nextInt(10);

        if (ComputerFieldMatrix2[rand1][rand2].equals(zvezda2)) {
            ComputerFieldMatrix2[rand1][rand2] = miss;


        } else if (ComputerFieldMatrix2[rand1][rand2].equals(computerShip)) {
            ComputerFieldMatrix2[rand1][rand2] = ubit;


//        } else while (ComputerFieldMatrix2[rand1][rand2].equals(miss)) {
//
//            rand1 = random.nextInt(10);
//            rand2 = random.nextInt(10);
//
//            if (ComputerFieldMatrix2[rand1][rand2].equals(zvezda2)) {
//                ComputerFieldMatrix2[rand1][rand2] = miss;
//
//
//            } else if (ComputerFieldMatrix2[rand1][rand2].equals(computerShip)) {
//                ComputerFieldMatrix2[rand1][rand2] = ubit;
//
//
//            }
            FieldPrisvoenie.fieldPrisvoenieComputer();
            FightRandomComputer.fightRandomComputer();
        }
    }
}
