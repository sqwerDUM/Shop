import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        На примере одного покупателя мы продемонстрируем как работает наш интернет магазин.
        Пока он включает в себя два раздела - электроника и одежда.
        Итак, наш покупатель собирается закупиться. Бюджет у него неограничен, так что он собирается купить вещи
        сразу из двух разделов.
        Тем хотим представить вам возможность нашего интернет магазина покупать что-то из нескольких разделов
        (не отдельно - это было бы довольно неудобно)
         */
        ElectronicProduct coffeeMachine = new ElectronicProduct("Delonghi ECAM 370.70",72670.0, 9.5);
        ElectronicProduct notebook = new ElectronicProduct("Asus zenbook 14", 78900.0,1.15);
        ElectronicProduct printer = new ElectronicProduct("Canon PIXMA G-540", 35230.0, 5.1);
        ClothingProduct sweater = new ClothingProduct("L", "no brand", "black", 2300.0);
        ClothingProduct downJacket = new ClothingProduct("L", "nike", "black", 7500.0);
        /*
        добавьте сюда сумму всех товаров total cost. В классе корзина вы как раз можете создать массив интерфейса
        то есть Product [] products;
        В принципе я так и сделала, вот мой пример:
         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите один из вариантов: \n" +
                "1. Перейти в раздел товаров\n" +
                "0. Перейти в корзину покупок  " );


        int number = scanner.nextInt();
        while (number != 0) {
            Scanner scanner1 = new Scanner(System.in);// выбор товара
            System.out.println("Выберите раздел товаров:\n" +
                    "1. Електронника\n" +
                    "2. Одежда\n");

            int number2 = scanner1.nextInt();
            switch (number2) {
                case 1:     //electro
                    Scanner scanner3 = new Scanner(System.in);
                    System.out.println("Выберите товар :\n" +
                            "1.Кофе машина\n" +
                            "2. Ноутбук\n");
                    int number3 = scanner3.nextInt();
                    if (number3 == 1) {
                        coffeeMachine.displayInfo();
                    }

                    break;

                case 2:
                    System.out.println();
                    break;


            }
            number = scanner.nextInt();
        }
    }
}
