package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mm0 {
    public final String a;
    public int b;
    public long c;
    public final mt2 d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ nm0 g;

    public mm0(nm0 r1, String r2, int r3, mt2 r4) {
        this.g = r1;
        this.a = r2;
        this.b = r3;
        if (r4 != null) goto L5;
        long r5 = -1;
    L6:
        this.c = r5;
        if (r4 != null) goto L9;
        return;
    L9:
        if (r4.b() == false) goto L13;
        this.d = r4;
        return;
    L13:
        return;
    L5:
        r5 = r4.d;
        goto L6
    }

    public final boolean a(q9 r8) {
        mt2 r0 = r8.d;
        cu4 r1 = r8.b;
        if (r0 == null) goto L5;
        long r2 = this.c;
        if (r2 != (-1)) goto L11;
        return false;
    L11:
        if (r0.d > r2) goto L40;
        mt2 r7 = this.d;
        if (r7 == null) goto L48;
        int r9 = r7.b;
        int r3 = r1.b(r0.a);
        int r4 = r1.b(r7.a);
        if (r0.d < r7.d) goto L43;
        if (r3 < r4) goto L49;
        if (r3 <= r4) goto L23;
        return true;
    L23:
        if (r0.b() == false) goto L30;
        int r5 = r0.b;
        int r6 = r0.c;
        if (r5 > r9) goto L33;
        if (r5 == r9) goto L28;
        return false;
    L28:
        if (r6 <= r7.c) goto L45;
        return true;
    L45:
        return false;
    L33:
        return true;
    L30:
        int r10 = r0.e;
        if (r10 == (-1)) goto L37;
        if (r10 <= r9) goto L46;
        return true;
    L46:
        return false;
    L37:
        return true;
    L49:
        return false;
    L43:
        return false;
    L48:
        return false;
    L40:
        return true;
    L5:
        if (this.b != r8.c) goto L39;
        return false;
    L39:
        return true;
    }

    public final boolean b(cu4 r7, cu4 r8) {
        int r0 = this.b;
        if (r0 >= r7.o()) goto L5;
        nm0 r1 = this.g;
        bu4 r4 = r1.a;
        r7.n(r0, r4);
        int r2 = r4.m;
    L10:
        if (r2 > r4.n) goto L7;
        int r5 = r8.b(r7.l(r2));
        if (r5 != (-1)) goto L13;
        r2 = r2 + 1;
        goto L10
    L13:
        r0 = r8.f(r5, r1.b, false).c;
    L15:
        this.b = r0;
        if (r0 == (-1)) goto L25;
        mt2 r6 = this.d;
        if (r6 != null) goto L22;
        return true;
    L22:
        if (r8.b(r6.a) == (-1)) goto L25;
        return true;
    L25:
        return false;
    L7:
        r0 = -1;
        goto L15
    L5:
        if (r0 >= r8.o()) goto L7;
        goto L7
    }
}
