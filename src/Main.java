public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task1() {
        System.out.println("Task1");
        for(int i = 1 ; i<=10;i++){
            System.out.println(i);
        }
    }

    public static void task2() {
        System.out.println("Task2");
        for(int i = 10 ; i>=1;i--){
            System.out.println(i);
        }
    }

    public static void task3() {
        System.out.println("Task3");
        for(int i = 2 ; i<=17;i++){
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void task4() {
        System.out.println("Task4");
        for(int i = 10 ; i>=-10;i--){
            System.out.println(i);
        }

    }

    public static void task5() {
        System.out.println("Task5");
        for(int i = 1904 ; i<=2096;i++){
            if(i%400==0){
                if(i%100==0){
                    continue;
                }else{
                    System.out.println(i+" год является високосным.");
                    continue;
                }
            } else if (i%4==0) {
                if(i%100==0){
                    continue;
                }else{
                    System.out.println(i+" год является високосным.");
                    continue;
                }
            }

        }
    }

    public static void task6() {
        System.out.println("Task6");
        for(int i = 7; i<=98;i+=7){
            System.out.println(i);
        }
    }

    public static void task7() {
        System.out.println("Task7");
        for(int i = 1;i<=512;i+=i){
            System.out.println(i);
        }
    }

    public static void task8() {
        System.out.println("Task8");
        int sum = 0;
        for(int mounth = 1;mounth<=12;mounth++){
            sum+=29000;
            System.out.println("Месяц "+ mounth + ", сумма накоплений равна " + sum + " рублей.");
        }
    }

    public static void task9() {
        System.out.println("Task9");
        int sum = 0;
        int procent = 0;
        for(int mounth = 1;mounth<=12;mounth++){
            sum+=29000;
            procent=sum/100;
            sum+=procent;
            System.out.println("Месяц "+ mounth + ", сумма накоплений равна " + sum + " рублей.");
        }
    }

    public static void task10(){
        int numberOne = 2;
        int answer = 0;
        for(int i = 1; i <= 10;i++){
            System.out.printf("%d*%d="+(numberOne*i)+"\n",numberOne,i);
        }
    }
}