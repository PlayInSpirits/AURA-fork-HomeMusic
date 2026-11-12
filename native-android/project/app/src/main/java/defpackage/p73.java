package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class p73 {
    public final Object a;
    public int b;
    public final /* synthetic */ q73 c;

    public p73(q73 r1, int r2) {
        this.c = r1;
        this.a = r1.a[r2];
        this.b = r2;
    }

    public final int a() {
        int r0 = this.b;
        Object r1 = this.a;
        q73 r2 = this.c;
        if (r0 != (-1)) goto L5;
    L8:
        this.b = r2.c(r1);
    L9:
        int r5 = this.b;
        if (r5 != (-1)) goto L14;
        return 0;
    L14:
        return r2.b[r5];
    L5:
        if (r0 >= r2.c) goto L8;
        if (si0.s(r1, r2.a[r0]) == true) goto L9;
        goto L8
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof p73) == false) goto L10;
        p73 r5 = (p73) r4;
        if (a() != r5.a()) goto L10;
        if (si0.s(this.a, r5.a) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public final int hashCode() {
        Object r0 = this.a;
        if (r0 != null) goto L5;
        int r1 = 0;
    L7:
        return a() ^ r1;
    L5:
        r1 = r0.hashCode();
        goto L7
    }

    public final String toString() {
        String r0 = String.valueOf(this.a);
        int r2 = a();
        if (r2 != 1) goto L6;
        return r0;
    L6:
        return r0 + " x " + r2;
    }
}
