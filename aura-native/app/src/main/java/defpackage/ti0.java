package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ti0 implements rd {
    public final na4 a;
    public final hd5 b;
    public final Object c;
    public final ce d;
    public final ce e;
    public final ce f;
    public final Object g;
    public final long h;

    public ti0(ui0 ui0Var, Object obj, ce ceVar) {
        na4 na4Var = new na4(ui0Var.a);
        this.a = na4Var;
        hd5 hd5Var = p35.a;
        this.b = hd5Var;
        this.c = obj;
        ce ceVar2 = (ce) ((if1) hd5Var.o).invoke(obj);
        this.d = ceVar2;
        this.e = kb4.n(ceVar);
        this.g = ((if1) hd5Var.p).invoke(na4Var.D(ceVar2, ceVar));
        if (((ce) na4Var.p) == null) {
            na4Var.p = ceVar2.c();
        }
        ce ceVar3 = (ce) na4Var.p;
        if (ceVar3 == null) {
            h12.Q("velocityVector");
            throw null;
        }
        int b = ceVar3.b();
        long j = 0;
        for (int i = 0; i < b; i++) {
            rm2 rm2Var = (rm2) na4Var.n;
            ceVar2.getClass();
            j = Math.max(j, ((long) (Math.exp(((yx0) rm2Var.o).b(ceVar.a(i)) / (a81.a - 1.0d)) * 1000.0d)) * 1000000);
        }
        this.h = j;
        ce n = kb4.n(this.a.E(j, this.d, ceVar));
        this.f = n;
        int b2 = n.b();
        for (int i2 = 0; i2 < b2; i2++) {
            ce ceVar4 = this.f;
            float a = ceVar4.a(i2);
            this.a.getClass();
            this.a.getClass();
            ceVar4.d(i2, gb.l(a, -0.0f, 0.0f));
        }
    }

    @Override // defpackage.rd
    public final boolean a() {
        return false;
    }

    @Override // defpackage.rd
    public final long b() {
        return this.h;
    }

    @Override // defpackage.rd
    public final hd5 c() {
        return this.b;
    }

    @Override // defpackage.rd
    public final ce d(long j) {
        if (e(j)) {
            return this.f;
        }
        return this.a.E(j, this.d, this.e);
    }

    @Override // defpackage.rd
    public final Object f(long j) {
        if (e(j)) {
            return this.g;
        }
        if1 if1Var = (if1) this.b.p;
        na4 na4Var = this.a;
        ce ceVar = (ce) na4Var.o;
        ce ceVar2 = this.d;
        if (ceVar == null) {
            na4Var.o = ceVar2.c();
        }
        ce ceVar3 = (ce) na4Var.o;
        if (ceVar3 == null) {
            h12.Q("valueVector");
            throw null;
        }
        int b = ceVar3.b();
        int i = 0;
        while (true) {
            ce ceVar4 = (ce) na4Var.o;
            if (i >= b) {
                if (ceVar4 != null) {
                    return if1Var.invoke(ceVar4);
                }
                h12.Q("valueVector");
                throw null;
            }
            if (ceVar4 == null) {
                h12.Q("valueVector");
                throw null;
            }
            rm2 rm2Var = (rm2) na4Var.n;
            float a = ceVar2.a(i);
            long j2 = j / 1000000;
            z71 a2 = ((yx0) rm2Var.o).a(this.e.a(i));
            long j3 = a2.c;
            ceVar4.d(i, (Math.signum(a2.a) * a2.b * yb.a(j3 > 0 ? j2 / j3 : 1.0f).a) + a);
            i++;
        }
    }

    @Override // defpackage.rd
    public final Object g() {
        return this.g;
    }
}
