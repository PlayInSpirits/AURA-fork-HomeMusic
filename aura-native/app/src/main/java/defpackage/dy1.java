/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.b11;

public final class dy1 {
    public final int a;

    public dy1(int n16) {
        this.a = n16;
    }

    public final boolean equals(Object object) {
        int n16;
        return object instanceof dy1 && this.a == (n16 = ((dy1)object).a);
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return b11.j(this.a, "IndirectPointerEventPrimaryDirectionalMotionAxis(value=", ")");
    }
}

