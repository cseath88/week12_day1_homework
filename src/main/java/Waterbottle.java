public class Waterbottle {
    private int volume;

    public Waterbottle(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return this.volume;
    }

    public int takeDrink() {
        return this.volume -= 10;
    }

    public int emptyBottle() {
        if(this.volume >= 0) {
            return 0;
        }
        return this.volume;
    }

    public int fillBottle() {
        if(this.volume <= 99) {
            return 100;
        }
        return this.volume;
    }

}
