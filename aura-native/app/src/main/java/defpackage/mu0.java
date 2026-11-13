/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.f34;
import defpackage.ku0;

public final class mu0 {
    public final long a;

    public mu0(long l16) {
        this.a = l16;
    }

    public final boolean equals(Object object) {
        long l16;
        return object instanceof mu0 && this.a == (l16 = ((mu0)object).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        long l16 = this.a;
        if (l16 != 9205357640488583168L) {
            return f34.h("(", ku0.c(Float.intBitsToFloat((int)(l16 >> 32))), ", ", ku0.c(Float.intBitsToFloat((int)(0xFFFFFFFFL & l16))), ")");
        }
        return "DpOffset.Unspecified";
    }
}

