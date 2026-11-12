package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g21 extends pe0 {
    public static final /* synthetic */ int s = 0;
    public long p;
    public boolean q;
    public ii r;

    public final void a0(boolean r5) {
        long r0 = this.p;
        if (r5 == false) goto L5;
        long r2 = 4294967296L;
    L6:
        long r1 = r0 - r2;
        this.p = r1;
        if (r1 <= 0) goto L10;
        return;
    L10:
        if (this.q == false) goto L13;
        shutdown();
        return;
    L13:
        return;
    L5:
        r2 = 1;
        goto L6
    }

    public final void b0(or0 r2) {
        ii r0 = this.r;
        if (r0 != null) goto L5;
        r0 = new ii();
        this.r = r0;
    L5:
        r0.addLast(r2);
    }

    public final void c0(boolean r5) {
        long r0 = this.p;
        if (r5 == false) goto L5;
        long r2 = 4294967296L;
    L6:
        this.p = r2 + r0;
        if (r5 == true) goto L10;
        this.q = true;
        return;
    L10:
        return;
    L5:
        r2 = 1;
        goto L6
    }

    public abstract long d0();

    public final boolean e0() {
        ii r1 = this.r;
        if (r1 != null) goto L6;
        return false;
    L6:
        if (r1.isEmpty() == false) goto L8;
        Object r2 = null;
    L9:
        or0 r3 = (or0) r2;
        if (r3 != null) goto L13;
        return false;
    L13:
        r3.run();
        return true;
    L8:
        r2 = r1.removeFirst();
        goto L9
    }

    public abstract void shutdown();
}
