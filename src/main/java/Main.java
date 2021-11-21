public class Main {
    //3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;
    private static double method_3(double a, double b, double c, double d) {
        return a * (b + (c / d));
    }

    //4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
    // если да – вернуть true, в противном случае – false;
    private static boolean method_4(double a, double b) {
        return (a + b) >= 10 && (a + b) <= 20;
    }

    //5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли
    // число передали, или отрицательное;
    private static void method_5(int a) {
        System.out.println("5: " + (a >= 0 ? "положительное" : "отрицательное"));
    }

    //6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
    private static boolean method_6(int a) {
        return a < 0;
    }

    //7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение
    // «Привет, указанное_имя!»;
    private static void method_7(String name) {
        System.out.println("7: " + "\"Привет, " + name + "!\"");
    }

    //8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным,
    // кроме каждого 100-го, при этом каждый 400-й – високосный.
    private static void method_8(int year) {
        System.out.println("8: " + ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0));
    }

    //1. Создать пустой проект в IntelliJ IDEA и прописать метод main();
    public static void main(String[] args) {
        //2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
        // примитивные
        byte b = 123;
        short s = 12345;
        int i = 123_456_789;
        long l = 123_456_789_123_456_789L;
        float f = 123.45f;
        double d = 45678.99;
        char c = 'c';
        boolean bool = true;
        // ссылочные
        String str = "Hello";
        StringBuilder strBuilder = new StringBuilder("World");
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String[][] strArr = {{"qwe", "asd", "zxc"}, {"123", "456", "789"}, {"111", "222", "333"}};

        // 3
        System.out.println("3: " + method_3(11, 2.2, 33, 44.4));

        // 4
        System.out.println("4: " + method_4(6, 5));

        // 5
        method_5(-1);

        // 6
        System.out.println("6: " + method_6(-1));

        // 7
        method_7("Damir");

        // 8
        method_8(2020);
    }
}
