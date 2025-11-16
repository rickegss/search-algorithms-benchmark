package utils;

public class Timer {
    private long Start_time;
    private long End_time;

    public void start(){
        Start_time = System.nanoTime();
    }

    public void stop(){
        End_time = System.nanoTime();
    }

    public long ElapsedNano(){
        return End_time - Start_time;
    }

    public double ElapsedMillis(){
        return (End_time - Start_time) / 1000000.0;
    }
}
