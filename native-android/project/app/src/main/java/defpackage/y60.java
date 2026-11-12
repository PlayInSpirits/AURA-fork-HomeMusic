package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class y60 {
    public final Object a;
    public final wy b;
    public final xf1 c;
    public final Object d;
    public final Throwable e;

    public /* synthetic */ y60(Object r3, wy r4, xf1 r5, Throwable r6, int r7) {
        if ((r7 & 2) == 0) goto L6;
        r4 = null;
    L6:
        if ((r7 & 4) == 0) goto L9;
        r5 = null;
    L9:
        if ((r7 & 16) == 0) goto L11;
        Throwable r8 = null;
    L12:
        this(r3, r4, r5, null, r8);
        return;
    L11:
        r8 = r6;
        goto L12
    }

    public static y60 a(y60 r6, wy r7, Throwable r8, int r9) {
        Object r1 = r6.a;
        if ((r9 & 2) == 0) goto L5;
        r7 = r6.b;
    L5:
        wy r2 = r7;
        xf1 r3 = r6.c;
        Object r4 = r6.d;
        if ((r9 & 16) == 0) goto L9;
        r8 = r6.e;
    L9:
        return new y60(r1, r2, r3, r4, r8);
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof y60) == true) goto L8;
        return false;
    L8:
        y60 r6 = (y60) r5;
        if (h12.c(this.a, r6.a) == true) goto L12;
        return false;
    L12:
        if (h12.c(this.b, r6.b) == true) goto L15;
        return false;
    L15:
        if (h12.c(this.c, r6.c) == true) goto L18;
        return false;
    L18:
        if (h12.c(this.d, r6.d) == true) goto L21;
        return false;
    L21:
        if (h12.c(this.e, r6.e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public final int hashCode() {
        int r0 = 0;
        Object r1 = this.a;
        if (r1 != null) goto L5;
        int r2 = 0;
    L6:
        int r3 = r2 * 31;
        wy r4 = this.b;
        if (r4 != null) goto L9;
        int r5 = 0;
    L10:
        int r6 = (r3 + r5) * 31;
        xf1 r7 = this.c;
        if (r7 != null) goto L13;
        int r8 = 0;
    L14:
        int r9 = (r6 + r8) * 31;
        Object r10 = this.d;
        if (r10 != null) goto L17;
        int r11 = 0;
    L18:
        int r12 = (r9 + r11) * 31;
        Throwable r13 = this.e;
        if (r13 == null) goto L23;
        r0 = r13.hashCode();
    L23:
        return r12 + r0;
    L17:
        r11 = r10.hashCode();
        goto L18
    L13:
        r8 = r7.hashCode();
        goto L14
    L9:
        r5 = r4.hashCode();
        goto L10
    L5:
        r2 = r1.hashCode();
        goto L6
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public y60(Object r1, wy r2, xf1 r3, Object r4, Throwable r5) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
    }
}
