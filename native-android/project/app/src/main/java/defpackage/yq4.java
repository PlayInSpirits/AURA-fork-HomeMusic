package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yq4 implements rd {
    public final g45 a;
    public final hd5 b;
    public final Float c;
    public final Object d;
    public final ce e;
    public final ce f;
    public final ce g;
    public long h;
    public ce i;

    public yq4(wd wdVar, Object obj, Float f, ce ceVar) {
        this.a = wdVar.a();
        hd5 hd5Var = p35.a;
        this.b = hd5Var;
        this.c = f;
        this.d = obj;
        if1 if1Var = (if1) hd5Var.o;
        this.e = (ce) if1Var.invoke(obj);
        this.f = (ce) if1Var.invoke(f);
        this.g = ceVar != null ? kb4.n(ceVar) : ((ce) if1Var.invoke(obj)).c();
        this.h = -1L;
    }

    @Override // defpackage.rd
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.rd
    public final long b() {
        if (this.h < 0) {
            this.h = this.a.m(this.e, this.f, this.g);
        }
        return this.h;
    }

    @Override // defpackage.rd
    public final hd5 c() {
        return this.b;
    }

    @Override // defpackage.rd
    public final ce d(long j) {
        if (!e(j)) {
            return this.a.d(j, this.e, this.f, this.g);
        }
        ce ceVar = this.i;
        if (ceVar != null) {
            return ceVar;
        }
        ce ceVarL = this.a.l(this.e, this.f, this.g);
        this.i = ceVarL;
        return ceVarL;
    }

    @Override // defpackage.rd
    public final Object f(long j) {
        if (e(j)) {
            return this.c;
        }
        ce ceVarK = this.a.k(j, this.e, this.f, this.g);
        int iB = ceVarK.b();
        for (int i = 0; i < iB; i++) {
            if (Float.isNaN(ceVarK.a(i))) {
                qo3.b("AnimationVector cannot contain a NaN. " + ceVarK + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return ((if1) this.b.p).invoke(ceVarK);
    }

    @Override // defpackage.rd
    public final Object g() {
        return this.c;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.d + " -> " + this.c + ",initial velocity: " + this.g + ", duration: " + (b() / 1000000) + " ms,animationSpec: " + this.a;
    }
}
