package patterns.templatemethod;

public abstract class Employee {

    public final String getProjectDetails() {
        return "super " + getProjectDetailsImpl();
    }

    protected abstract String getProjectDetailsImpl();

}
