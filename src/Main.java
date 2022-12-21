public class Main {
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("Задача 1");
        String firsttName = "Иван ";
        String middleName = "Иванович ";
        String lastName = "Иванов ";
        String fullName = lastName + firsttName + middleName;
        System.out.println( "ФИО сотрудника — " + fullName);

        System.out.println(" ");
        System.out.println("Задача 2");
        fullName = fullName.replace("Иванов Иван Иванович ", "ИВАНОВ ИВАН ИВАНОВИЧ" );
        System.out.println( "Данные ФИО сотрудника для заполнения отчета — " + fullName);

        System.out.println(" ");
        System.out.println("Задача 3");
        String fulllName = "Иванов Семён Семёнович";
        fulllName = fulllName.replace("ё", "е");
        System.out.println( "Данные ФИО сотрудника — "+fulllName);
    }
}