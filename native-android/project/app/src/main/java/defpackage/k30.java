package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class k30 {
    public final int a;
    public final Method b;

    public k30(Method r1, int r2) {
        this.a = r2;
        this.b = r1;
        r1.setAccessible(true);
    }

    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if ((r3 instanceof k30) == false) goto L17;
        k30 r4 = (k30) r3;
        if (this.a == r4.a) goto L10;
        return false;
    L10:
        if (this.b.getName().equals(r4.b.getName()) == false) goto L16;
        return true;
    L16:
        return false;
    L17:
        return false;
    }

    public final int hashCode() {
        int r0 = this.a * 31;
        return this.b.getName().hashCode() + r0;
    }
}
