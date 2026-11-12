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

    public bf2(int i, int i2, Map map, if1 if1Var, if1 if1Var2, cf2 cf2Var) {
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = if1Var;
        this.e = if1Var2;
        this.f = cf2Var;
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
        this.e.invoke(this.f.C);
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
