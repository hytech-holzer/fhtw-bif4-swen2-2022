package patterns.templatemethod;

public class PermanentEmployee extends Employee {
    @Override
    protected String getProjectDetailsImpl() {
        return "permanent";
    }
}
