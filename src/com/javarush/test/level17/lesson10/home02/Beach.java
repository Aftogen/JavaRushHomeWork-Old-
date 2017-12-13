package com.javarush.test.level17.lesson10.home02;

/* Comparable
Реализуйте интерфейс Comparable<Beach> в классе Beach, который будет использоваться нитями.
*/

public class Beach implements Comparable<Beach> {
    private volatile String name;      //название
    private volatile float distance;   //расстояние
    private volatile int quality;    //качество

    public Beach(String name, float distance, int quality) {
        synchronized (this){
            this.name = name;
            this.distance = distance;
            this.quality = quality;
        }
    }

    public synchronized String getName() {

        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    @Override
    public synchronized int compareTo(Beach o) {
        int a = 0;
        int b = 0;
        int c = 0;
        a = getName().compareTo(o.getName());
        b = (int) (10*(getDistance() - o.getDistance()));
        c = 100*(getQuality() - o.getQuality());
        return a+b+c;
    }
}
