public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1. Про возраст человека:");
        int agePerson = 59;
        if (agePerson >= 18) {
            System.out.println("Если возраст человека равен " + agePerson + " лет, то он совершеннолетний, не нужно ничего ждать");
        } else {
            System.out.println("Если возраст человека равен " + agePerson + " лет, то он не достиг совершеннолетия, нужно немного подождать.");
        }
        System.out.println();
        System.out.println("Задача 2. Про температуру:");
        int irTemperature = -30;
        if (irTemperature <= 5) {
            System.out.println("На улице " + irTemperature + " градуса(ов), нужно надеть шапку.");
        } else {
            System.out.println("На улице " + irTemperature + " градуса(ов), можно идти без шапки.");
        }
        System.out.println();
        System.out.println("Задача 3. Про превышение скорости:");
        int speed = 65;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно.");
        }
        System.out.println();
        System.out.println("Задача 4. Про возраст человека:");
        int age = 1;
        if ((age >= 2) && (age <= 6)) {
            System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить дет.сад.");
        } else if ((age >= 7) && (age <= 17)) {
            System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить в школу.");
        } else if ((age >= 18) && (age <= 24)) {
            System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить в университет.");
        } else if (age > 24) {
            System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить на работу.");
        } else {
            System.out.println("Если возраст человека равен " + age + " лет, то либо вы ввели неправильный возраст, " + "либо человек слишком молод, чтобы куда то ходить.");
        }
        System.out.println();
        System.out.println("Задача 5. Про аттракционы:");
        int ageChild = 15;
        if (ageChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild + " лет, то ему нельзя кататься на аттракционе.");
        } else if ((ageChild >= 5) && (ageChild < 14)) {
            System.out.println("Если возраст ребенка равен " + ageChild + " лет, то он может кататься только в сопровождении взрослого. " + "Если взрослого нет, то кататься нельзя.");
        } else if (ageChild >= 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + " лет, то он может кататься без сопровождения взрослого.");
        }
        System.out.println();
        System.out.println("Задача 6. Про вместимость вагонов поезда:");
        int quantityPerCarriage = 122; // текущее количество человек
        int Capacity = 102; // общее количество
        int seating = 60; // сидячих мест
        if (quantityPerCarriage < seating) {
            System.out.println("В вагоне есть некоторое количество сидячих мест.");
        } else if ((quantityPerCarriage >= seating) && (quantityPerCarriage < Capacity)) {
            System.out.println("В вагоне нет сидячих мест, но есть некоторое количество стоячих мест.");
        } else {
            System.out.println("В вагоне нет сидячих и стоячих мест, вагон уже полностью забит.");
        }
        System.out.println();
        System.out.println("Задача 7. Про сравнение трех чисел:");
        int one = 125;
        int two = 995;
        int three = 89;
        int max = one; //инвариант
        if ((two >= one) && (two >= three)) {
            max = two;
        } else if (one < three) {
            max = three;
        }
        System.out.println("число " + max + " является наибольшим из всех чисел.");


    }
}