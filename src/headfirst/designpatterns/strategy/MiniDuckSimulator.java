package src.headfirst.designpatterns.strategy;

import src.headfirst.designpatterns.adapter.ducks.Duck;
import src.headfirst.designpatterns.adapter.ducks.MallardDuck;
import src.headfirst.designpatterns.adapter.ducks.ModelDuck;

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
