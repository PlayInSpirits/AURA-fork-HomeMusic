package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vt1 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ List o;
    public final /* synthetic */ int p;

    public /* synthetic */ vt1(int r1, int r2, List r3) {
        this.n = r2;
        this.o = r3;
        this.p = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.n) {
            case 0: goto L8;
            default: goto L4;
        };
    L4:
        List r0 = this.o;
        int r2 = this.p;
        es1 r1 = xt1.d;
        if (r1 == null) goto L12;
        r1.invoke(r0, Integer.valueOf(r2));
        return;
    L12:
        return;
    L8:
        List r3 = this.o;
        int r4 = this.p;
        es1 r5 = xt1.c;
        if (r5 == null) goto L13;
        r5.invoke(r3, Integer.valueOf(r4));
        return;
    }
}
