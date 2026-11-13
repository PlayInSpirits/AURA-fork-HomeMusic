/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

public final class sx2 {
    public final long a;

    public sx2(long l16) {
        this.a = l16;
    }

    public final boolean equals(Object object) {
        long l16;
        return object instanceof sx2 && this.a == (l16 = ((sx2)object).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("IndirectPointerEventData(packedValue=");
        stringBuilder.append(this.a);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

