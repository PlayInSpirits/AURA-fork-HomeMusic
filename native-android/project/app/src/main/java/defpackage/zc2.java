package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zc2 {
    public final a83 n;
    public boolean o;
    public int p;
    public final /* synthetic */ ad2 q;

    public zc2(ad2 r1, a83 r2) {
        this.q = r1;
        this.p = -1;
        this.n = r2;
    }

    public final void a(boolean r6) {
        if (r6 == this.o) goto L45;
        this.o = r6;
        if (r6 == false) goto L8;
        int r7 = 1;
    L9:
        ad2 r1 = this.q;
        int r2 = r1.c;
        r1.c = r7 + r2;
        if (r1.d == true) goto L33;
        r1.d = true;
    L38:
        int r3 = r1.c;     // Catch: Throwable -> L26
        if (r2 == r3) goto L31;
        if (r2 != 0) goto L19;
        if (r3 <= 0) goto L19;
        boolean r4 = true;
    L20:
        if (r2 <= 0) goto L23;
        if (r3 != 0) goto L23;
        boolean r5 = true;
    L24:
        if (r4 == false) goto L28;
        r1.g();     // Catch: Throwable -> L26
    L30:
        r2 = r3;
        goto L38
    L28:
        if (r5 == false) goto L30;
        r1.h();     // Catch: Throwable -> L26
    L23:
        r5 = false;
    L19:
        r4 = false;
        goto L20
    L31:
        r1.d = false;
    L26:
        th = move-exception;
        r1.d = false;
        throw th;
    L33:
        if (this.o == false) goto L44;
        r1.c(this);
        return;
    L44:
        return;
    L8:
        r7 = -1;
        goto L9
    }

    public void c() {
    }

    public boolean d(ba2 r1) {
        return false;
    }

    public abstract boolean e();
}
