package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i25 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ q25 c;
    public final /* synthetic */ long d;

    public /* synthetic */ i25(long r2, q25 r4, long r5) {
        this.a = 1;
        this.b = r2;
        this.c = r4;
        this.d = r5;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch(this.a) {
            case 0: goto L15;
            default: goto L4;
        };
    L4:
        long r0 = this.b;
        q25 r2 = this.c;
        long r3 = this.d;
    L9:
        th = move-exception;
        r2.G.decrementAndGet();
        throw th;
    L6:
        if (r0 != r2.E) goto L11;
        r2.P1(r3);     // Catch: Throwable -> L9
        r2.F = r0;     // Catch: Throwable -> L9
    L11:
        r2.G.decrementAndGet();
        return j15.a;
    L15:
        q25 r1 = this.c;
        long r4 = this.b;
        long r5 = this.d;
        if (r1.r == false) goto L21;
        if (r1.J == true) goto L21;
        boolean r7 = r1.V1(r4);
    L24:
        if (r7 == true) goto L26;
    L28:
        r1.F = r5;
        r1.O1();
        return j15.a;
    L26:
        if (r5 != r1.E) goto L28;
        r1.Y1(r4);
        r1.A = r4;
    L21:
        if (r1.r == false) goto L23;
        r1.H = null;
        r7 = r1.W1(r4);
        goto L24
    L23:
        r1.H = Long.valueOf(r4);
        r7 = true;
        goto L24
    }

    public /* synthetic */ i25(q25 r2, long r3, long r5) {
        this.a = 0;
        this.c = r2;
        this.b = r3;
        this.d = r5;
    }
}
