import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket(10);

        ElectronicProduct coffeeMachine = new ElectronicProduct("Delonghi ECAM 370.70", 72670.0, 9.5);
        ElectronicProduct notebook = new ElectronicProduct("Asus zenbook 14", 78900.0, 1.15);
        ElectronicProduct printer = new ElectronicProduct("Canon PIXMA G-540", 35230.0, 5.1);
        ClothingProduct sweater = new ClothingProduct("L", "no brand", "black", 2300.0);
        ClothingProduct downJacket = new ClothingProduct("L", "nike", "black", 7500.0);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите один из вариантов: \n" +
                "1. Перейти в раздел товаров\n" +
                "0. Перейти в корзину покупок  ");
        int number = scanner.nextInt();


        while (number != 0) {
            System.out.println("Выберите раздел товаров:\n" +
                    "1. Електронника\n" +
                    "2. Одежда\n" +
                    "3. Закончить покупки");
            int number2 = scanner.nextInt();


            switch (number2) {
                case 1:     //electro

                    System.out.println("Выберите товар :\n" +
                            "1.Кофе машина\n" +
                            "2. Ноутбук\n");
                    int number3 = scanner.nextInt();
                    if (number3 == 1) {
                        coffeeMachine.displayInfo();
                        System.out.println("Вы желаете приобрести данный подукт?\n" +
                                "1.Добавить в корзину \n" +
                                "0.Выйти в меню выбора\n");
                        int number4 = scanner.nextInt();
                        if (number4 == 1) {
                            basket.addProduct(coffeeMachine);
                        }
                    }
                    if (number3 == 2) {
                        notebook.displayInfo();
                        System.out.println("Вы желаете приобрести данный подукт?\n" +
                                "1.Добавить в корзину \n" +
                                "0.Выйти в меню выбора\n");
                        int number5 = scanner.nextInt();
                        if (number5 == 1) {
                            basket.addProduct(notebook);
                        }
                    }
                    if (number3 == 3) {
                        printer.displayInfo();
                        System.out.println("Вы желаете приобрести данный подукт?\n" +
                                "1.Добавить в корзину \n" +
                                "0.Выйти в меню выбора\n");
                        int number6 = scanner.nextInt();
                        if (number6 == 1) {
                            basket.addProduct(printer);
                        }
                    }

                    break;

                case 2:
                    System.out.println("Выберите товар :\n" +
                            "1.Свитер\n" +
                            "2.Пуховик\n");
                    int number7 = scanner.nextInt();
                    if (number7 == 1) {
                        sweater.displayInfo();
                        System.out.println("Вы желаете приобрести данный подукт?\n" +
                                "1.Добавить в корзину \n" +
                                "0.Выйти в меню выбора\n");
                        int number6 = scanner.nextInt();
                        if (number6 == 1) {
                            basket.addProduct(sweater);
                        }
                    }
                    int number8 = scanner.nextInt();
                    if (number8 == 2) {
                        downJacket.displayInfo();
                        System.out.println("Вы желаете приобрести данный подукт?\n" +
                                "1.Добавить в корзину \n" +
                                "0.Выйти в меню выбора\n");
                        int number6 = scanner.nextInt();
                        if (number6 == 1) {
                            basket.addProduct(downJacket);
                        }
                    }

                    break;


            }
            number = scanner.nextInt();
        }


        basket.display();
        System.out.println("__________________________________________");
        basket.calculateTotalCost();

    }
}
