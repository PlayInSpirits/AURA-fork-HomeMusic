/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.g02;
import defpackage.ho;
import defpackage.xa3;
import java.util.Arrays;

public final class qy3 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final float[] f;
    public final ho g;

    public qy3(long l16, long l17, long l18, long l19, long l26, float[] fArray, ho ho5) {
        this.a = l16;
        this.b = l17;
        this.c = l18;
        this.d = l19;
        this.e = l26;
        this.f = fArray;
        this.g = ho5;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean equals(Object object) {
        boolean bl5;
        if (this == object) {
            return true;
        }
        if (object == null) return false;
        if (qy3.class != object.getClass()) {
            return false;
        }
        qy3 qy32 = (qy3)object;
        if (this.a != qy32.a) {
            return false;
        }
        if (this.b != qy32.b) {
            return false;
        }
        if (this.e != qy32.e) {
            return false;
        }
        if (!g02.a(this.c, qy32.c)) {
            return false;
        }
        if (!g02.a(this.d, qy32.d)) {
            return false;
        }
        float[] fArray = qy32.f;
        object = this.f;
        if (object == null) {
            if (fArray != null) return false;
            bl5 = true;
        } else {
            if (fArray == null) {
                return false;
            }
            bl5 = object.equals(fArray);
        }
        if (!bl5) {
            return false;
        }
        if (this.g == qy32.g) return true;
        return false;
    }

    public final int hashCode() {
        int n16 = xa3.b(xa3.b(xa3.b(xa3.b(Long.hashCode(this.a) * 31, 31, this.b), 31, this.e), 31, this.c), 31, this.d);
        float[] fArray = this.f;
        int n17 = fArray != null ? Arrays.hashCode(fArray) : 0;
        return this.g.hashCode() + (n16 + n17) * 31;
    }
}

