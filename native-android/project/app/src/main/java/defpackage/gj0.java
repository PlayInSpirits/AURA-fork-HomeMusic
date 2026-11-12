package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gj0 implements n9 {
    public final boolean n;
    public final int o;
    public int p;
    public int q;
    public int r;
    public m9[] s;

    public gj0() {
        this.n = true;
        this.o = 65536;
        this.r = 0;
        this.s = new m9[100];
    }

    @Override // defpackage.n9
    public final synchronized void a(ru r4) {
        monitor-enter(this);
    L3:
        if (r4 == null) goto L11;
        m9[] r0 = this.s;     // Catch: Throwable -> L9
        int r1 = this.r;     // Catch: Throwable -> L9
        this.r = r1 + 1;     // Catch: Throwable -> L9
        m9 r2 = (m9) r4.p;     // Catch: Throwable -> L9
        r2.getClass();     // Catch: Throwable -> L9
        r0[r1] = r2;     // Catch: Throwable -> L9
        this.q--;     // Catch: Throwable -> L9
        r4 = (ru) r4.q;     // Catch: Throwable -> L9
        if (r4 == null) goto L8;
        if (((m9) r4.p) != null) goto L3;
    L8:
        r4 = null;
    L9:
        th = move-exception;
        throw th;
    L11:
        notifyAll();     // Catch: Throwable -> L9
        monitor-exit(this);
    }

    public final synchronized void b(int r2) {
        monitor-enter(this);
    L11:
        th = move-exception;
        throw th;
    L4:
        if (r2 >= this.p) goto L6;
        boolean r0 = true;
    L7:
        this.p = r2;     // Catch: Throwable -> L11
        if (r0 == false) goto L13;
        h();     // Catch: Throwable -> L11
    L13:
        monitor-exit(this);
        return;
    L6:
        r0 = false;
        goto L7
    }

    @Override // defpackage.n9
    public final synchronized void f(m9 r4) {
        monitor-enter(this);
        m9[] r0 = this.s;     // Catch: Throwable -> L6
        int r1 = this.r;     // Catch: Throwable -> L6
        this.r = r1 + 1;     // Catch: Throwable -> L6
        r0[r1] = r4;     // Catch: Throwable -> L6
        this.q--;     // Catch: Throwable -> L6
        notifyAll();     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.n9
    public final synchronized m9 g() {
        monitor-enter(this);
        int r0 = this.q + 1;     // Catch: Throwable -> L6
        this.q = r0;     // Catch: Throwable -> L6
        int r1 = this.r;     // Catch: Throwable -> L6
        if (r1 <= 0) goto L8;
        m9[] r2 = this.s;     // Catch: Throwable -> L6
        int r3 = r1 - 1;     // Catch: Throwable -> L6
        this.r = r3;     // Catch: Throwable -> L6
        m9 r4 = r2[r3];     // Catch: Throwable -> L6
        r4.getClass();     // Catch: Throwable -> L6
        this.s[this.r] = null;     // Catch: Throwable -> L6
    L12:
        monitor-exit(this);
        return r4;
    L8:
        m9 r5 = new m9(0, new byte[this.o]);     // Catch: Throwable -> L6
        m9[] r6 = this.s;     // Catch: Throwable -> L6
        if (r0 <= r6.length) goto L11;
        this.s = (m9[]) Arrays.copyOf(r6, r6.length * 2);     // Catch: Throwable -> L6
    L11:
        r4 = r5;
    L6:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.n9
    public final synchronized void h() {
        monitor-enter(this);
        int r0 = Math.max(0, f35.g(this.p, this.o) - this.q);     // Catch: Throwable -> L10
        int r1 = this.r;     // Catch: Throwable -> L10
        if (r0 < r1) goto L7;
        monitor-exit(this);
        return;
    L7:
        Arrays.fill(this.s, r0, r1, null);     // Catch: Throwable -> L10
        this.r = r0;     // Catch: Throwable -> L10
        monitor-exit(this);
        return;
    L10:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.n9
    public final int m() {
        return this.o;
    }
}
