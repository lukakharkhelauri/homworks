package ex5;

public class Car implements Engine, LeftRight {
    @Override
    public void start() {
        System.out.println("Engine has started.");
    }

    @Override
    public void stop() {
        System.out.println("Engine has stopped.");
    }

    @Override
    public void left() {
        System.out.println("Car is turned left.");
    }

    @Override
    public void right() {
        System.out.println("Car is turned right.");
    }
}
