class Elf extends WorkshopMember implements ChristmasCelebrator {
    private int skillLevel;
    private  String elfType;

    public Elf(String name,  int age, int skillLevel, String elfType) {
        super(name, age);
        this.skillLevel = skillLevel;
        this.elfType = elfType;
    }

    private void increaseExperience() {
        skillLevel++;
    }

    public int getSkillLevel() {
        return skillLevel;
    }

    public String getElfType() {
        return elfType;
    }

    public void setElfType(String elfType) {
        this.elfType = elfType;
    }

    public void setSkillLevel(int skillLevel) {
        this.skillLevel = skillLevel;
    }

    public void makeToy() {
        System.out.println("Making toys");
        increaseExperience();
    }

    public void wrapGifts() {
        System.out.println("Wraping gifts");
        increaseExperience();
    }

    public void celebrateChristmas() {
        System.out.println(getName() + " is celebrating Christmas!");
    }

    @Override
    public void hostChristmasParty() {
        System.out.println(getName() + " is hosting a Christmas party!");
    }

    public String toString() {
        return "Elf" + super.toString() + ", skillLevel=" + skillLevel + ", elfType='" + elfType;
    }

    public void performSkill() {
        System.out.println(getName() + " is performing their skill: " + getSkillLevel() + "!");
    }
}
