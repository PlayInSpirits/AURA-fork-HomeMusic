package defpackage;

import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wx3 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ xx3 o;

    public /* synthetic */ wx3(xx3 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        xx3 r3 = this.o;
        switch(r0) {
            case 0: goto L8;
            default: goto L4;
        };
    L4:
        cy3 r1 = r3.i;
        if (r1.A != r3) goto L14;
        r1.j();
        return;
    L14:
        return;
    L8:
        SparseArray r4 = r3.h;
        int r2 = r4.size();
        int r5 = 0;
    L9:
        if (r5 >= r2) goto L11;
        ((zx3) r4.valueAt(r5)).getClass();
        zx3.a(null, null);
        r5 = r5 + 1;
        goto L9
    L11:
        r4.clear();
    }
}
