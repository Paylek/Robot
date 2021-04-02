package iLeg;

public class ToshibaLeg implements ILeg {
    private int price;

    public ToshibaLeg(){
    }

    public ToshibaLeg(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Сделал шаг Toshiba!");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
