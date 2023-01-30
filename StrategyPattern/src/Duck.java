public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public Duck(){

    }
    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All dogs float, even decoys");
    }

    public  abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }
}
