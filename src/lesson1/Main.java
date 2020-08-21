package lesson1;

public class Main {
        //1. Создать пустой проект в IntelliJ IDEA и прописать метод main();
    public static void main(String[] args) {
        //2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
        int a;
        a = Integer.MAX_VALUE;
        System.out.println(a);
        byte b;
        b = Byte.MIN_VALUE;
        System.out.println(b);
        long c;
        c = Long.MIN_VALUE;
        System.out.println(c);
        short d;
        d = Short.MAX_VALUE;
        System.out.println(d);
        float f;
        f = 2.1434f;
        System.out.println(f);
        double g;
        g = 1.29934949;
        System.out.println(g);
        boolean bool;
        bool = true;
        System.out.println(bool);
        char h;
        h = 57;
        System.out.println(h);

        //3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;
        System.out.println(sum(4, 55, 6, 71));
        //4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
        System.out.println(slog(19));
        //5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
        printPlusnum(-1);
        //6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
        System.out.println(retTr(-19));
        //7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
        printName("Alex");
        //8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
        //printYear(2020);
    }
    static int sum(int a, int b, int c, int d) {
        return (a * (b + (c / d)));
    }
    static boolean slog(int k) {
        return (k>10 && k<=20);
    }
    static void printPlusnum(int p) {
        if (p >= 0) System.out.println("Число положительное");
        else {
            System.out.println("Число отрицательное");
        }
    }
    static boolean retTr(int j) {
        if (j <= 0) return true;
        return false;
    }
    static void printName(String word) {
        System.out.println("«Привет, " + word + "!»");
    }

}