public class Main {
    public static void main(String[] args) {
        StepTracker a = new StepTracker(10000);
        System.out.println(a.activeDays());
        System.out.println(a.averageSteps());
        a.addDailySteps(9000) ;
        a.addDailySteps(5000) ;
        System.out.println(a.activeDays());
        System.out.println(a.averageSteps());

        a.addDailySteps(13000) ;
        System.out.println(a.activeDays());
        System.out.println(a.averageSteps());
        a.addDailySteps(23000) ;
        a.addDailySteps(1111) ;
        System.out.println(a.activeDays());
        System.out.println(a.averageSteps());

}
    }
    