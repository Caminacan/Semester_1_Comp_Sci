import java.util.*;

public class StepTracker{
    public int activeThreshold; // Amount of Steps needed to be considered "Active"
    public int totalDays;
    public int activeDays;
    public int totalSteps;
    
    public StepTracker(){
        activeThreshold = 0;
        totalDays = 0;
        activeDays = 0;
        totalSteps = 0;
    }
    public StepTracker(int threshold){
        totalDays = 0;
        activeThreshold=threshold;
        totalDays=0;
        activeDays=0;
        totalSteps=0;
    }
    public int activeDays(){
        return activeDays;
    }
    public void addDailySteps(int steps){
        totalDays++;
        totalSteps = totalSteps + steps;
        if (steps >= activeThreshold) activeDays++;
    }
    public double averageSteps(){
        if (totalDays == 0) return 0.0;
        return 1.0*totalSteps/totalDays;
    }
    
}