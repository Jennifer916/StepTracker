public class StepTracker {
    private int steps; 
    private int days;
    private int threshold;
    private int activeDays;
    public StepTracker (int step ) {
        threshold=step;
    }
    public int activeDays () {
        return activeDays;
    }
    public double averageSteps () {
        if (days==0) return 0; 
        return (double) steps/days; 
    }
    public void addDailySteps(int s) {
        days++;
        steps+=s;
        if (s>= threshold) {
            activeDays++;
        }
    }
}