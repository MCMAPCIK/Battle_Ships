// Переменные корабля(своего и вражеского), поля,

public class Main {
    public static void main(String[] args) {
        // Печатает поле
        Field.PlayerField1();
        Field.ComputerField2();
        // Расставляет корабли
        RandomPlayer.randomPlayer();
        RandomComputer.randomComputer();
        // Присваевает изменения(выводит расставление кораблей)
        FieldPrisvoenie.fieldPrisvoeniePlayer();
        FieldPrisvoenie.fieldPrisvoenieComputer();
        // Удар по противнику
        FightRandomPlayer.fightRandomPlayer();
    }
}
