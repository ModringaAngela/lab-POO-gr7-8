package lab6.indrumator;

public class Sub extends Base{
    public int field = 1;

    @Override
    public int getField() {
        return field;
    }

    public int getField2(int i) {
        return 0;
    }

    public int getField2(int i, float t) {
        return 0;
    }
}
