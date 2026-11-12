package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m2 {
    public n2[] n;
    public int o;
    public int p;
    public on4 q;

    public final n2 d() {
        monitor-enter(this);
        n2[] r0 = this.n;     // Catch: Throwable -> L6
        if (r0 != null) goto L9;
        r0 = f();     // Catch: Throwable -> L6
        this.n = r0;     // Catch: Throwable -> L6
    L11:
        int r1 = this.p;     // Catch: Throwable -> L6
    L12:
        n2 r2 = r0[r1];     // Catch: Throwable -> L6
        if (r2 != null) goto L15;
        r2 = e();     // Catch: Throwable -> L6
        r0[r1] = r2;     // Catch: Throwable -> L6
    L15:
        r1 = r1 + 1;     // Catch: Throwable -> L6
        if (r1 < r0.length) goto L19;
        r1 = 0;
    L19:
        if (r2.a(this) == false) goto L12;
        this.p = r1;     // Catch: Throwable -> L6
        this.o++;     // Catch: Throwable -> L6
        on4 r3 = this.q;     // Catch: Throwable -> L6
        monitor-exit(this);
        if (r3 == null) goto L24;
        r3.w(1);
    L24:
        return r2;
    L9:
        if (this.o < r0.length) goto L11;
        Object[] r4 = Arrays.copyOf(r0, r0.length * 2);     // Catch: Throwable -> L6
        this.n = (n2[]) r4;     // Catch: Throwable -> L6
        r0 = (n2[]) r4;     // Catch: Throwable -> L6
    L6:
        th = move-exception;
        throw th;
    }

    public abstract n2 e();

    public abstract n2[] f();

    public final void g(n2 r6) {
        monitor-enter(this);
        int r0 = this.o - 1;     // Catch: Throwable -> L6
        this.o = r0;     // Catch: Throwable -> L6
        on4 r2 = this.q;     // Catch: Throwable -> L6
        int r3 = 0;
        if (r0 != 0) goto L8;
        this.p = 0;     // Catch: Throwable -> L6
    L8:
        r6.getClass();     // Catch: Throwable -> L6
        vd0[] r7 = r6.b(this);     // Catch: Throwable -> L6
        monitor-exit(this);
        int r5 = r7.length;
    L11:
        if (r3 >= r5) goto L16;
        vd0 r1 = r7[r3];
        if (r1 == null) goto L15;
        r1.resumeWith(j15.a);
    L15:
        r3 = r3 + 1;
        goto L11
    L16:
        if (r2 == null) goto L26;
        r2.w(-1);
        return;
    L26:
        return;
    L6:
        th = move-exception;
        throw th;
    }

    public final on4 h() {
        monitor-enter(this);
        on4 r0 = this.q;     // Catch: Throwable -> L7
        if (r0 != null) goto L9;
        int r1 = this.o;     // Catch: Throwable -> L7
        r0 = new on4(1, Integer.MAX_VALUE, wv.o);     // Catch: Throwable -> L7
        r0.q(Integer.valueOf(r1));     // Catch: Throwable -> L7
        this.q = r0;     // Catch: Throwable -> L7
    L9:
        monitor-exit(this);
        return r0;
    L7:
        th = move-exception;
        throw th;
    }
}
