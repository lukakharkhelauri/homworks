public class SilenceController extends Consultant{
    private double strictness;

    public SilenceController(String firstName, String lastName, int id, double strictness) {
        super(firstName, lastName, id);
        this.strictness = strictness;
    }

    public String toString() {
        return super.toString() + ", strictness=" + strictness;
    }
}
