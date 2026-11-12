package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j21 implements Runnable, Comparable, as0 {
    private volatile Object _heap;
    public long n;
    public int o;

    public j21(long r1) {
        this.n = r1;
        this.o = -1;
    }

    @Override // defpackage.as0
    public final void a() {
        monitor-enter(this);
        Object r0 = this._heap;     // Catch: Throwable -> L10
        f01 r1 = hw.b;     // Catch: Throwable -> L10
        if (r0 != r1) goto L7;
        monitor-exit(this);
        return;
    L7:
        lt4 r3 = null;
        if ((r0 instanceof k21) == false) goto L12;
        k21 r2 = (k21) r0;     // Catch: Throwable -> L10
    L13:
        if (r2 == null) goto L26;
        monitor-enter(r2);     // Catch: Throwable -> L10
        Object r4 = this._heap;     // Catch: Throwable -> L23
        if ((r4 instanceof lt4) == false) goto L18;
        r3 = (lt4) r4;     // Catch: Throwable -> L23
    L18:
        if (r3 == null) goto L21;
        r2.b(this.o);     // Catch: Throwable -> L23
    L21:
        monitor-exit(r2);     // Catch: Throwable -> L10
    L23:
        th = move-exception;
        throw th;     // Catch: Throwable -> L10
    L26:
        this._heap = r1;     // Catch: Throwable -> L10
        monitor-exit(this);
        return;
    L12:
        r2 = null;
    L10:
        th = move-exception;
        throw th;
    }

    public final int b(long r9, k21 r11, l21 r12) {
        monitor-enter(this);
    L22:
        th = move-exception;
        throw th;
    L4:
        if (this._heap != hw.b) goto L8;
        monitor-exit(this);
        return 2;
    L8:
        monitor-enter(r11);     // Catch: Throwable -> L22
        j21[] r0 = r11.a;     // Catch: Throwable -> L27
        if (r0 == null) goto L12;
        j21 r1 = r0[0];     // Catch: Throwable -> L27
    L15:
        if (l21.v.get(r12) == 0) goto L17;
        boolean r13 = true;
    L18:
        if (r13 == false) goto L25;
        monitor-exit(r11);     // Catch: Throwable -> L22
        monitor-exit(this);
        return 1;
    L25:
        if (r1 != null) goto L29;
        r11.c = r9;     // Catch: Throwable -> L27
    L36:
        long r10 = this.n;     // Catch: Throwable -> L27
        long r4 = r11.c;     // Catch: Throwable -> L27
        if ((r10 - r4) >= 0) goto L39;
        this.n = r4;     // Catch: Throwable -> L27
    L39:
        r11.a(this);     // Catch: Throwable -> L27
        monitor-exit(r11);     // Catch: Throwable -> L22
        monitor-exit(this);
        return 0;
    L29:
        long r5 = r1.n;     // Catch: Throwable -> L27
        if ((r5 - r9) >= 0) goto L34;
        r9 = r5;
    L34:
        if ((r9 - r11.c) <= 0) goto L36;
        r11.c = r9;     // Catch: Throwable -> L27
        goto L36
    L17:
        r13 = false;
        goto L18
    L12:
        r1 = null;
    L27:
        th = move-exception;
        throw th;     // Catch: Throwable -> L22
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object r3) {
        long r0 = this.n - ((j21) r3).n;
        if (r0 <= 0) goto L6;
        return 1;
    L6:
        if (r0 >= 0) goto L9;
        return -1;
    L9:
        return 0;
    }

    public final void d(k21 r3) {
        if (this._heap == hw.b) goto L6;
        this._heap = r3;
        return;
    L6:
        kf2.n("Failed requirement.");
    }

    public String toString() {
        return "Delayed[nanos=" + this.n + ']';
    }
}
