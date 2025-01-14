import java.util.ArrayList;
import java.util.List;


public class Snowman {
    private double height;
    private String hatColor;
    private boolean isMagical;
    private List<String> accessories;

    public Snowman(double height, String hatColor) {
        this.height = height;
        this.hatColor = hatColor;
        this.isMagical = false;
        this.accessories = new ArrayList<>();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getHatColor() {
        return hatColor;
    }

    public void setHatColor(String hatColor) {
        this.hatColor = hatColor;
    }

    public boolean isMagical() {
        return isMagical;
    }

    public void makeMagical() {
        this.isMagical = true;
        System.out.println("The snowman is now magical");
    }

    public List<String> getAccessories() {
        return accessories;
    }

    public void decorate(String accessory) {
        accessories.add(accessory);
        System.out.println("Snowman is decorated with: " + accessory);
    }

    public void melt() {
        if (height > 1) {
            height /= 2;
        } else if (height > 0) {
            height = 0;
        } else {
            System.out.println("The snowman has already melted.");
        }
    }

    @Override
    public String toString() {
        return "Snowman height=" + height + ", hatColor='" + hatColor + "', isMagical=" + isMagical + ", accessories=" + accessories;
    }
}

