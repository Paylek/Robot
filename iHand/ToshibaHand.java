package iHand;

public class ToshibaHand implements IHand {
    private int price;

    public ToshibaHand(){
    }

    public ToshibaHand(int price) {
        this.price = price;
    }

    @Override
    public void upHand() {
        System.out.println("Рука поднята Toshiba!");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
