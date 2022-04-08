package src.headfirst.designpatterns.ducks;

import src.headfirst.designpatterns.strategy.FlyWithWings;
import src.headfirst.designpatterns.strategy.Quack;

public class MallardDuck extends Duck {
  public MallardDuck() {
    quackBehavior = new Quack();
    flyBehavior = new FlyWithWings();
  }

  public void display() {
    System.out.println("I'm a real Mallard duck");
  }
}
