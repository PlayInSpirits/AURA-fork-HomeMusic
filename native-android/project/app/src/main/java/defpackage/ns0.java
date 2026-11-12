package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ns0 {
    public final tt0 a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final int g;
    public final mt0 h;

    public ns0(tt0 r5, int r6, long r7, long r9, long r11, int r13, int r14, mt0 r15) {
        r15.getClass();
        boolean r0 = false;
        if (r14 != 0) goto L5;
        boolean r2 = true;
    L7:
        if (r6 == 4) goto L9;
        boolean r3 = true;
    L10:
        if (r2 != r3) goto L12;
        boolean r4 = true;
    L13:
        rr2.l(r4);
        if (r13 != 0) goto L16;
    L20:
        this.a = r5;
        this.b = r6;
        this.c = r7;
        this.d = r9;
        this.e = r11;
        this.f = r13;
        this.g = r14;
        this.h = r15;
        return;
    L16:
        if (r6 == 2) goto L19;
        if (r6 == 0) goto L19;
        r0 = true;
    L19:
        rr2.l(r0);
        goto L20
    L12:
        r4 = false;
        goto L13
    L9:
        r3 = false;
        goto L10
    L5:
        r2 = false;
        goto L7
    }

    public ns0(tt0 r13, int r14, long r15, long r17, int r19) {
        this(r13, r14, r15, r17, -1, r19, 0, new mt0());
    }
}
