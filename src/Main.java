import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            List<String> products = new LinkedList<>();
            products.add("Сыр");
            products.add("Молоко");
            products.add("Хлеб");

            List<String> list = new LinkedList<>();
            list.add("1. Добавить");
            list.add("2. Показать");
            list.add("3. Удалить");

            List<String> listProducts = new LinkedList<>();

            System.out.println("Выберите номер одной из операций: 1. Добавить, 2. Показать, 3. Удалить");
            Scanner scanner = new Scanner(System.in); // 1 nomer
            String input = scanner.nextLine();
            int i = Integer.parseInt(input) - 1;
            switch (i) {
                case 0:
                    System.out.println("Что вы хотите добавить в список?");
                    System.out.println(products);
                    String product = scanner.nextLine();
                        listProducts.add(product);
                    System.out.println("Итого всписке покупок: " + listProducts.size());
                    break;
                case 1:
                    System.out.println("Список покупок " + listProducts.size());
                    break;
                case 2:
                    System.out.println("Список покупок: "  + listProducts);
                    System.out.println("Какую хотите удалить? Введите номер или название");
                    String remove = scanner.nextLine();
                    int y = 0;
                    if (y == Integer.parseInt(remove)){
                    listProducts.remove(y);
                } else {
                    listProducts.remove(remove);
                }
                    break;
            }
        }
    }
}