import java.util.ArrayList;
import java.util.List;


class Santa extends WorkshopMember implements ChristmasSpirit {
    private List<Child> childrenList;

    public Santa(String name,  int age) {
        super(name, age);
        this.childrenList = new ArrayList<>();
    }

    public List<Child> getChildrenList() {
        return childrenList;
    }

    public void setChildrenList(List<Child> childrenList) {
        this.childrenList = childrenList;
    }

    public void deliverGifts() {
        System.out.println("Santa is delivering gifts to good children");
        for (Child child : childrenList) {
            System.out.println("Delivered gifts to: " + child.getName());
        }
    }

    public List<Child> checkNaughtyOrNiceList() {
        List<Child> goodChildren = new ArrayList<>();

        for (Child child : childrenList) {
            if (child.getBehaviorScore() > 5) {
                goodChildren.add(child);
            }
        }
        return goodChildren;
    }

    @Override
    public void spreadJoy() {
        System.out.println("Santa is spreading joy");
    }

    @Override
    public void singCarols() {
        System.out.println("Santa is singing carols");
    }
}