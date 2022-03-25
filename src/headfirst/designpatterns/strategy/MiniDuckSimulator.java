package src.headfirst.designpatterns.strategy;

import src.headfirst.designpatterns.adapter.Duck;
import src.headfirst.designpatterns.adapter.MallardDuck;

public class MiniDuckSimulator {
  public static void main(String[] args) {
    Duck mallard = new MallardDuck();
    mallard.performQuack();
    mallard.performFly();
  }
}
