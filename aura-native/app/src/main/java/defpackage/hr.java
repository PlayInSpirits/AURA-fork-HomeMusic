/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

public final class hr {
    public final float a;

    public hr(float f16) {
        this.a = f16;
    }

    public final boolean equals(Object object) {
        float f16;
        return object instanceof hr && Float.compare(this.a, f16 = ((hr)object).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("BaselineShift(multiplier=");
        stringBuilder.append(this.a);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

