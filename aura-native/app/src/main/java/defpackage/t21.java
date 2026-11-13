package defpackage;

import com.google.gson.reflect.TypeToken;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class t21 extends bz4 {
    public bz4 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ nk1 d;
    public final /* synthetic */ TypeToken e;
    public final /* synthetic */ u21 f;

    public t21(u21 u21Var, boolean z, boolean z2, nk1 nk1Var, TypeToken typeToken) {
        this.f = u21Var;
        this.b = z;
        this.c = z2;
        this.d = nk1Var;
        this.e = typeToken;
    }

    @Override // defpackage.bz4
    public final Object a(l32 l32Var) {
        if (this.b) {
            l32Var.k0();
            return null;
        }
        bz4 bz4Var = this.a;
        if (bz4Var == null) {
            bz4Var = this.d.h(this.f, this.e);
            this.a = bz4Var;
        }
        return bz4Var.a(l32Var);
    }

    @Override // defpackage.bz4
    public final void b(q32 q32Var, Object obj) {
        if (this.c) {
            q32Var.F();
            return;
        }
        bz4 bz4Var = this.a;
        if (bz4Var == null) {
            bz4Var = this.d.h(this.f, this.e);
            this.a = bz4Var;
        }
        bz4Var.b(q32Var, obj);
    }
}
