package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qg5 implements le {
    public static final qg5 p = null;
    public final boolean n;
    public final String o;

    static {
        rf2 r0 = new rf2();
        r0.n = Boolean.FALSE;
        p = new qg5(r0);
    }

    public qg5(rf2 r2) {
        this.n = ((Boolean) r2.n).booleanValue();
        this.o = (String) r2.o;
    }

    public final boolean equals(Object r5) {
        if (r5 != this) goto L6;
        return true;
    L6:
        if ((r5 instanceof qg5) == true) goto L8;
        return false;
    L8:
        qg5 r6 = (qg5) r5;
        if (au0.n(null, null) == true) goto L11;
    L15:
        return false;
    L11:
        if (this.n != r6.n) goto L15;
        if (au0.n(this.o, r6.o) == false) goto L15;
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.n), this.o});
    }
}
