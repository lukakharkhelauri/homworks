class Reindeer extends WorkshopMember {
    private int flyingSpeed;
    private String noseColor;

    public Reindeer(String name, int age, int flyingSpeed, String noseColor) {
        super(name,  age);
        this.flyingSpeed = flyingSpeed;
        this.noseColor = noseColor;
    }

    public int getFlyingSpeed() {
        return flyingSpeed;
    }

    public void setFlyingSpeed(int flyingSpeed) {
        this.flyingSpeed = flyingSpeed;
    }

    public String getNoseColor() {
        return noseColor;
    }

    public void setNoseColor(String noseColor) {
        this.noseColor = noseColor;
    }

    public void fly() {
        System.out.println(getName() + " flying speed is " + flyingSpeed);
    }

    public void trainForChristmas() {
        System.out.println(getName() + " is training for christmas");
    }

    public char checkFitnessLevel() {
        if (flyingSpeed > 50 && getAge() < 10) {
            return 'A';
        } else if (flyingSpeed > 40) {
            return 'B';
        } else if (flyingSpeed > 30) {
            return 'C';
        } else if (flyingSpeed > 20) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
