package sample;

public class Controller {
    Model model;

    MilkshakeModel milkShakeModel;

    public Controller(MilkshakeModel milkShakeModel) {this.milkShakeModel = milkShakeModel;}
    public void handleClick(ModelListener modelListener){
        milkShakeModel.addItem(modelListener);
        System.out.println(milkShakeModel);
    }
    public void setModel (Model newModel) {
        model = newModel;
    }
}
