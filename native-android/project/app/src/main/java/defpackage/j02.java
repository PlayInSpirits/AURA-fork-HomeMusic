package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class j02 extends h02 {
    public static final j02 q = null;

    static {
        q = new j02(1, 0, 1);
    }

    @Override // defpackage.h02
    public final boolean equals(Object r3) {
        if ((r3 instanceof j02) == true) goto L5;
        return false;
    L5:
        if (isEmpty() == true) goto L7;
    L8:
        j02 r4 = (j02) r3;
        int r0 = r4.n;
        if (this.n == r0) goto L11;
        return false;
    L11:
        if (this.o != r4.o) goto L18;
        return true;
    L18:
        return false;
    L7:
        if (((j02) r3).isEmpty() == false) goto L8;
        return true;
    }

    @Override // defpackage.h02
    public final int hashCode() {
        if (isEmpty() == false) goto L7;
        return -1;
    L7:
        return (this.n * 31) + this.o;
    }

    @Override // defpackage.h02
    public final boolean isEmpty() {
        if (this.n <= this.o) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // defpackage.h02
    public final String toString() {
        return this.n + ".." + this.o;
    }
}
