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
    }

    private static void task8() {
        var totalHourse = 640;
        var workinghourseForOne = 8;
        var workersAmount = totalHourse / workinghourseForOne;
        System.out.println("колличество работников в компании составляет" + workersAmount);
        var newWorkersAmount = workersAmount + 94;
        var newWorkingHourse = workinghourseForOne * newWorkersAmount;
        System.out.println("если в компании работает" + newWorkersAmount + "человек, то всего" + newWorkingHourse + "часов работы может быть поделено между сотрудниками");


    }

    private static void task7() {
        var boxerWeight = 78.2;
        var boxerWeight2 = 82.7;
        var weightDifference = boxerWeight2 - boxerWeight;
        System.out.println(weightDifference);
        var weightDifference2 = boxerWeight2 % boxerWeight;
        System.out.println("разница веса боксеров составляет" + weightDifference2);

    }

    private static void task6() {
        var boxerWeight = 78.2;
        var boxerWeight2 = 82.7;
        var totalweight = boxerWeight + boxerWeight2;
        System.out.println(totalweight);
        var weightDifference = boxerWeight2 - boxerWeight;
        System.out.println(weightDifference);
    }

    private static void task5() {
        var frog = 3.5;
                frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog +4;
        System.out.println(frog);
    }

    private static void task4() {
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 4;
        System.out.println(friend);

    }

    private static void task3() {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog - 3.5;
        cat = cat - 1.6;
                paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task1 () {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task2 () {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
}