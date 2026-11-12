package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class my2 implements pv2 {
    public final float a;
    public final ly2 b;
    public final ly2 c;

    public my2(float r1, ly2 r2, ly2 r3) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof my2) == true) goto L5;
        return false;
    L5:
        my2 r5 = (my2) r4;
        if (Float.compare(this.a, r5.a) == 0) goto L8;
    L13:
        return false;
    L8:
        if (Objects.equals(this.b, r5.b) == false) goto L13;
        if (Objects.equals(this.c, r5.c) == false) goto L13;
        return true;
    }

    public final int hashCode() {
        int r0 = Float.hashCode(this.a) * 31;
        int r1 = 0;
        ly2 r2 = this.b;
        if (r2 == null) goto L5;
        int r3 = r2.hashCode();
    L6:
        int r4 = (r0 + r3) * 31;
        ly2 r5 = this.c;
        if (r5 == null) goto L10;
        r1 = r5.hashCode();
    L10:
        return r4 + r1;
    L5:
        r3 = 0;
        goto L6
    }

    public final String toString() {
        return "ReplayGain Xing/Info: peak=" + this.a + ", field 1=" + this.b + ", field 2=" + this.c;
    }
}
