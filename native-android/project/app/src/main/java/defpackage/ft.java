package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ft extends cx2 implements u62, g94 {
    public if1 B;

    @Override // defpackage.g94
    public final boolean c() {
        return false;
    }

    @Override // defpackage.g94
    public final void c0(q94 q94Var) {
        ac4 ac4Var;
        boolean z;
        f63 f63VarM = j51.M(this, 2);
        if (f63VarM.a0) {
            ac4Var = f63VarM.W;
            z = f63VarM.Z;
        } else {
            b24 b24Var = au0.w;
            if (b24Var == null) {
                au0.w = new b24();
            } else {
                b24Var.a();
            }
            b24 b24Var2 = au0.w;
            b24Var2.getClass();
            b24Var2.z = f63VarM.H.J;
            b24Var2.x = l93.o0(f63VarM.p);
            ch4 ch4VarT = ya4.t();
            if1 if1VarE = ch4VarT != null ? ch4VarT.e() : null;
            ch4 ch4VarZ = ya4.z(ch4VarT);
            try {
                this.B.invoke(b24Var2);
                ya4.H(ch4VarT, ch4VarZ, if1VarE);
                ac4Var = b24Var2.v;
                z = b24Var2.w;
            } catch (Throwable th) {
                ya4.H(ch4VarT, ch4VarZ, if1VarE);
                throw th;
            }
        }
        if (z) {
            o94.b(q94Var, ac4Var);
        }
    }

    @Override // defpackage.cx2
    public final boolean f0() {
        return false;
    }

    @Override // defpackage.u62
    public final vi2 r(cf2 cf2Var, pi2 pi2Var, long j) {
        jg3 jg3VarR = pi2Var.r(j);
        return cf2Var.v(jg3VarR.n, jg3VarR.o, v01.n, new o(2, jg3VarR, this));
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.B + ")";
    }
}
