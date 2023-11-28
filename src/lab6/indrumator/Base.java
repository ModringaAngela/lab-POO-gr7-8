package lab6.indrumator;

import java.util.Objects;

public class Base {
    public int field = 0;
    public int getField() {
        return field;
    }

    public int getField2(int i, float f) {
        return field;
    }


    //suprascrierea metodei equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Base base = (Base) o;
        return field == base.field;
    }

    @Override
    public int hashCode() {
        return Objects.hash(field);
    }
}
