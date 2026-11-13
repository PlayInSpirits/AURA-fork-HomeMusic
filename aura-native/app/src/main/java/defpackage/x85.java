package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class x85 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ AtomicBoolean o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ Object r;

    public /* synthetic */ x85(Object obj, AtomicBoolean atomicBoolean, boolean z, boolean z2, int i) {
        this.n = i;
        this.r = obj;
        this.o = atomicBoolean;
        this.p = z;
        this.q = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        boolean z = this.q;
        boolean z2 = this.p;
        AtomicBoolean atomicBoolean = this.o;
        y10 y10Var = (y10) this.r;
        switch (i) {
            case 0:
                atomicBoolean.set(false);
                xc5.l((xc5) y10Var.d, z2, z);
                break;
            default:
                atomicBoolean.set(false);
                ((rf2) y10Var.d).n(z2, z);
                break;
        }
    }
}
