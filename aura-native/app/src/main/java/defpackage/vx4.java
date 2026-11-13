package defpackage;

import com.google.gson.reflect.TypeToken;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class vx4 extends ja4 {
    public final g32 a;
    public final nk1 b;
    public final TypeToken c;
    public final cz4 d;
    public final si1 e = new si1(29, this);
    public final boolean f;
    public volatile bz4 g;

    public vx4(g32 g32Var, nk1 nk1Var, TypeToken typeToken, ux4 ux4Var, boolean z) {
        this.a = g32Var;
        this.b = nk1Var;
        this.c = typeToken;
        this.d = ux4Var;
        this.f = z;
    }

    @Override // defpackage.bz4
    public final Object a(l32 l32Var) {
        g32 g32Var = this.a;
        if (g32Var == null) {
            bz4 bz4Var = this.g;
            if (bz4Var == null) {
                bz4Var = this.b.h(this.d, this.c);
                this.g = bz4Var;
            }
            return bz4Var.a(l32Var);
        }
        h32 q = fh0.q(l32Var);
        if (this.f) {
            q.getClass();
            if (q instanceof i32) {
                return null;
            }
        }
        return g32Var.a(q, this.c.getType(), this.e);
    }

    @Override // defpackage.bz4
    public final void b(q32 q32Var, Object obj) {
        bz4 bz4Var = this.g;
        if (bz4Var == null) {
            bz4Var = this.b.h(this.d, this.c);
            this.g = bz4Var;
        }
        bz4Var.b(q32Var, obj);
    }

    @Override // defpackage.ja4
    public final bz4 c() {
        bz4 bz4Var = this.g;
        if (bz4Var != null) {
            return bz4Var;
        }
        bz4 h = this.b.h(this.d, this.c);
        this.g = h;
        return h;
    }
}
