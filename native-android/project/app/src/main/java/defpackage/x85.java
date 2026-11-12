package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x85 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ AtomicBoolean o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ Object r;

    public /* synthetic */ x85(Object r1, AtomicBoolean r2, boolean r3, boolean r4, int r5) {
        this.n = r5;
        this.r = r1;
        this.o = r2;
        this.p = r3;
        this.q = r4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        boolean r2 = this.q;
        boolean r3 = this.p;
        AtomicBoolean r4 = this.o;
        y10 r5 = (y10) this.r;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        r4.set(false);
        ((rf2) r5.d).n(r3, r2);
        return;
    L6:
        r4.set(false);
        xc5.l((xc5) r5.d, r3, r2);
    }
}
