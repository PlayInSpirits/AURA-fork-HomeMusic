package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l25 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q25 b;

    public /* synthetic */ l25(q25 r1, int r2) {
        this.a = r2;
        this.b = r1;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int r0 = this.a;
        q25 r1 = this.b;
        switch(r0) {
            case 0: goto L10;
            case 1: goto L8;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        r1.a2("on release");
        r1.l.shutdown();
        return j15.a;
    L6:
        r1.a2("on stop");
        r1.r = false;
        r1.c2();
        r1.s = 1;
        r1.Z1();
        r1.O1();
        return j15.a;
    L8:
        r1.X1();
        return j15.a;
    L10:
        r1.a2("on an emptied queue");
        r1.s = 4;
        r1.Z1();
        r1.O1();
        return j15.a;
    }
}
