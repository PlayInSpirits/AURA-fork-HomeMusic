package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xg4 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ float o;
    public final /* synthetic */ gx3 p;
    public final /* synthetic */ q64 q;
    public final /* synthetic */ if1 r;

    public /* synthetic */ xg4(float r1, gx3 r2, q64 r3, if1 r4, int r5) {
        this.n = r5;
        this.o = r1;
        this.p = r2;
        this.q = r3;
        this.r = r4;
    }

    @Override // defpackage.if1
    public final Object invoke(Object r7) {
        int r0 = this.n;
        j15 r1 = j15.a;
        if1 r2 = this.r;
        q64 r3 = this.q;
        gx3 r4 = this.p;
        float r6 = this.o;
        vd r8 = (vd) r7;
        switch(r0) {
            case 0: goto L16;
            default: goto L4;
        };
    L4:
        float r9 = su3.m(((Number) r8.e.getValue()).floatValue(), r6);
        float r5 = r9 - r4.n;
        float r10 = r3.a(r5);     // Catch: CancellationException -> L7
    L8:
        r2.invoke(Float.valueOf(r10));
        if (Math.abs(r5 - r10) <= 0.5f) goto L11;
    L13:
        r8.a();
    L14:
        r4.n += r10;
        return r1;
    L11:
        if (r9 != ((Number) r8.e.getValue()).floatValue()) goto L13;
    L7:
        r8.a();
        r10 = 0.0f;
        goto L8
    L16:
        float r11 = Math.abs(((Number) r8.e.getValue()).floatValue());
        float r12 = Math.abs(r6);
        zd3 r13 = r8.e;
        if (r11 < r12) goto L19;
        float r14 = su3.m(((Number) r13.getValue()).floatValue(), r6);
        su3.g(r8, r3, r2, r14 - r4.n);
        r8.a();
        r4.n = r14;
    L20:
        return r1;
    L19:
        su3.g(r8, r3, r2, ((Number) r13.getValue()).floatValue() - r4.n);
        r4.n = ((Number) r13.getValue()).floatValue();
        goto L20
    }
}
