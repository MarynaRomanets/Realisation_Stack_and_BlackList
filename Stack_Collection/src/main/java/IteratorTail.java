public class IteratorTail {

    private IteratorTail nextStep;
    private Object object;

    public IteratorTail getNextStep() {
        return nextStep;
    }

    public void setNextStep(IteratorTail nextStep) {
        this.nextStep = nextStep;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
