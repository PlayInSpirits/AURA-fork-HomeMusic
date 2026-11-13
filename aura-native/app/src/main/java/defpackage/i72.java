package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class i72 implements vi2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ if1 d;
    public final /* synthetic */ j72 e;
    public final /* synthetic */ o72 f;
    public final /* synthetic */ if1 g;

    public i72(int i, int i2, Map map, if1 if1Var, j72 j72Var, o72 o72Var, if1 if1Var2) {
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = if1Var;
        this.e = j72Var;
        this.f = o72Var;
        this.g = if1Var2;
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
        hz1 hz1Var;
        c72 c72Var = this.f.n;
        boolean K = this.e.K();
        if1 if1Var = this.g;
        if (!K || (hz1Var = ((iz1) c72Var.Q.d).o0) == null) {
            if1Var.invoke(((iz1) c72Var.Q.d).C);
        } else {
            if1Var.invoke(hz1Var.C);
        }
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
