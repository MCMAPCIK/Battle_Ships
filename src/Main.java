// Переменные корабля(своего и вражеского), поля,

public class Main {
    public static void main(String[] args) {
        Field.PlayerField1();
        Field.ComputerField2();

        RandomPlayer.randomPlayer();
        RandomComputer.randomComputer();

        FieldPrisvoenie.fieldPrisvoeniePlayer();
        FieldPrisvoenie.fieldPrisvoenieComputer();

        FightRandomPlayer.fightRandomPlayer();
        FightRandomComputer.fightRandomComputer();
    }
}
