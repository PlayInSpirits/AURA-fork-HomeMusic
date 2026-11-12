package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jc2 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ AtomicBoolean o;

    public /* synthetic */ jc2(AtomicBoolean atomicBoolean, int i) {
        this.n = i;
        this.o = atomicBoolean;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        AtomicBoolean atomicBoolean = this.o;
        switch (i) {
            case 0:
                atomicBoolean.set(true);
                break;
            default:
                atomicBoolean.set(true);
                break;
        }
    }
}
