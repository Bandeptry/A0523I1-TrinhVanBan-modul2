package stop_watch;

import java.time.Duration;
import java.time.LocalTime;

public class StopWatch {
    private LocalTime startTime = LocalTime.now();
    private LocalTime endTime = LocalTime.now();

    public StopWatch() {
    }

    public StopWatch(LocalTime startTime, LocalTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public long start(){
        return  System.currentTimeMillis();
    }
    public long stop(){
        return System.currentTimeMillis();
    }
    public long getElapsedTime(){
        Duration duration = Duration.between(startTime, endTime);
        return duration.toMillis();
    }

}
