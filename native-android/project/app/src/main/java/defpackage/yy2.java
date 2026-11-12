package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yy2 {
    public Class a;
    public Class b;
    public Class c;

    public yy2(Class r1, Class r2, Class r3) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L20:
        return false;
    L8:
        if (yy2.class != r5.getClass()) goto L20;
        yy2 r6 = (yy2) r5;
        if (this.a.equals(r6.a) == true) goto L14;
        return false;
    L14:
        if (this.b.equals(r6.b) == true) goto L17;
        return false;
    L17:
        if (e35.n(this.c, r6.c) == true) goto L19;
        return false;
    L19:
        return true;
    }

    public final int hashCode() {
        int r0 = this.a.hashCode() * 31;
        int r1 = (this.b.hashCode() + r0) * 31;
        Class r2 = this.c;
        if (r2 == null) goto L5;
        int r3 = r2.hashCode();
    L7:
        return r1 + r3;
    L5:
        r3 = 0;
        goto L7
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.a + ", second=" + this.b + '}';
    }
}
