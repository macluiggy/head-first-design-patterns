package src.headfirst.designpatterns.adapter;

import src.headfirst.designpatterns.strategy.FlyBehavior;
import src.headfirst.designpatterns.strategy.QuackBehavior;

public abstract class Duck {
  QuackBehavior quackBehavior;
  FlyBehavior flyBehavior;

  public Duck() {}

  public void performQuack() {
    quackBehavior.quack();
  }
  
  public void performFly() {
    flyBehavior.fly();
  }

  public void swim() {
    System.out.println("All ducks float, even decoys!");
  }
}

