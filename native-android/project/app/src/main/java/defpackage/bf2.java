package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bf2 implements vi2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ if1 d;
    public final /* synthetic */ if1 e;
    public final /* synthetic */ cf2 f;

    public bf2(int r1, int r2, Map r3, if1 r4, if1 r5, cf2 r6) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
        this.f = r6;
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
        df2 r0 = this.f.C;
        this.e.invoke(r0);
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
