package src.headfirst.designpatterns.strategy;

import src.headfirst.designpatterns.adapter.Duck;
import src.headfirst.designpatterns.adapter.MallardDuck;
import src.headfirst.designpatterns.adapter.ModelDuck;

public class MiniDuckSimulator {
  public static void main(String[] args) {
    Duck mallard = new MallardDuck();
    mallard.performQuack();
    mallard.performFly();

    Duck model = new ModelDuck();
    model.performFly();
    model.setFlyBehavior(new FlyRocketPowered());
    model.performFly();
  }
}
