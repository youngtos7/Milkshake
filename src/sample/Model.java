package sample;

import java.util.ArrayList;

public class Model implements ModelListener{
    MilkShakeEnum milkShakeEnum;
    float flavorTotalPrice;
    int flavorQuantity;
    String flavorName;

    public Model(String flavorName){
        this.milkShakeEnum = MilkShakeEnum.FLAVOUR;
        this.flavorName = flavorName;
        this.flavorQuantity = 0;
        this.flavorTotalPrice = .0f;
    }

    void changeQuantity(boolean bIncrease){
        if(bIncrease){
            if(flavorQuantity < 7) {
                flavorQuantity++;
                flavorTotalPrice += 1;
            }
        } else {
            if(flavorQuantity > 0) {
                flavorQuantity--;
                flavorTotalPrice -= 1;
            }
        }
    }

    @Override
    public void modelChanged() {

    }

    @Override
    public String toString() {
        return flavorName + " x" + flavorQuantity + " =" + flavorTotalPrice;
    }
}
