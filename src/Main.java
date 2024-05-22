import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        List<Integer> source = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        Filter filter;
        Scanner in = new Scanner(System.in);

        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");

        System.out.print("Введите размер списка: ");
        int n = in.nextInt();

        System.out.print("Введите верхнюю границу для значений: ");
        int maxNum = in.nextInt();

        ///создать рандомный список
        for(int i = 0; i<n; i++) {
            int numRandom = (int) (Math.random() * (maxNum + 1));
            source.add(numRandom);
        }

        logger.log("Создаём и наполняем список");
        System.out.print("Вот случайный список: ");
        source.forEach(System.out::print);
        System.out.print("\n");
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");

        int f = in.nextInt();
        filter = new Filter(f);
        logger.log("Запускаем фильтрацию");
        result = filter.filterOut(source);
        logger.log("Прошло фильтр " + result.size() + " элемента из " + source.size());
        logger.log("Выводим результат на экран");
        System.out.print("Отфильтрованный список: ");
        result.forEach(System.out::print);
        System.out.print("\n");
        logger.log("Завершаем программу");
    }
}