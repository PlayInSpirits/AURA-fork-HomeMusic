package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class i72 implements vi2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ if1 d;
    public final /* synthetic */ j72 e;
    public final /* synthetic */ o72 f;
    public final /* synthetic */ if1 g;

    public i72(int r1, int r2, Map r3, if1 r4, j72 r5, o72 r6, if1 r7) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
        this.f = r6;
        this.g = r7;
    }

    @Override // defpackage.vi2
    public final Map a() {
        return this.c;
    }

    @Override // defpackage.vi2
    public final int b() {
        return this.b;
    }

    @Override // defpackage.vi2
    public final void c() {
        c72 r0 = this.f.n;
        boolean r1 = this.e.K();
        if1 r2 = this.g;
        if (r1 == false) goto L8;
        hz1 r3 = ((iz1) r0.Q.d).o0;
        if (r3 == null) goto L8;
        r2.invoke(r3.C);
        return;
    L8:
        r2.invoke(((iz1) r0.Q.d).C);
    }

    @Override // defpackage.vi2
    public final int d() {
        return this.a;
    }

    @Override // defpackage.vi2
    public final if1 g() {
        return this.d;
    }
}
