package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kn4 {
    public final wo0 a;
    public o72 b;
    public final hn4 c;
    public final hn4 d;
    public final hn4 e;

    /* JADX WARN: Type inference failed for: r2v1, types: [hn4] */
    /* JADX WARN: Type inference failed for: r2v2, types: [hn4] */
    /* JADX WARN: Type inference failed for: r2v3, types: [hn4] */
    public kn4(wo0 wo0Var) {
        this.a = wo0Var;
        final int i = 0;
        this.c = new wf1(this) { // from class: hn4
            public final /* synthetic */ kn4 o;

            {
                this.o = this;
            }

            @Override // defpackage.wf1
            public final Object invoke(Object obj, Object obj2) {
                int i2 = i;
                j15 j15Var = j15.a;
                kn4 kn4Var = this.o;
                switch (i2) {
                    case 0:
                        wo0 wo0Var2 = kn4Var.a;
                        c72 c72Var = (c72) obj;
                        o72 o72Var = c72Var.S;
                        if (o72Var == null) {
                            o72Var = new o72(c72Var, wo0Var2);
                            c72Var.S = o72Var;
                        }
                        kn4Var.b = o72Var;
                        kn4Var.a().h();
                        o72 o72VarA = kn4Var.a();
                        if (o72VarA.p != wo0Var2) {
                            o72VarA.p = wo0Var2;
                            o72VarA.i(false);
                            c72.W(o72VarA.n, false, 7);
                        }
                        break;
                    case 1:
                        kn4Var.a().o = (u80) obj2;
                        break;
                    default:
                        c72 c72Var2 = (c72) obj;
                        l72 l72Var = new l72(kn4Var.a(), (wf1) obj2);
                        if (!h12.c(c72Var2.I, l72Var)) {
                            c72Var2.I = l72Var;
                            c72Var2.D();
                        }
                        break;
                }
                return j15Var;
            }
        };
        final int i2 = 1;
        this.d = new wf1(this) { // from class: hn4
            public final /* synthetic */ kn4 o;

            {
                this.o = this;
            }

            @Override // defpackage.wf1
            public final Object invoke(Object obj, Object obj2) {
                int i3 = i2;
                j15 j15Var = j15.a;
                kn4 kn4Var = this.o;
                switch (i3) {
                    case 0:
                        wo0 wo0Var2 = kn4Var.a;
                        c72 c72Var = (c72) obj;
                        o72 o72Var = c72Var.S;
                        if (o72Var == null) {
                            o72Var = new o72(c72Var, wo0Var2);
                            c72Var.S = o72Var;
                        }
                        kn4Var.b = o72Var;
                        kn4Var.a().h();
                        o72 o72VarA = kn4Var.a();
                        if (o72VarA.p != wo0Var2) {
                            o72VarA.p = wo0Var2;
                            o72VarA.i(false);
                            c72.W(o72VarA.n, false, 7);
                        }
                        break;
                    case 1:
                        kn4Var.a().o = (u80) obj2;
                        break;
                    default:
                        c72 c72Var2 = (c72) obj;
                        l72 l72Var = new l72(kn4Var.a(), (wf1) obj2);
                        if (!h12.c(c72Var2.I, l72Var)) {
                            c72Var2.I = l72Var;
                            c72Var2.D();
                        }
                        break;
                }
                return j15Var;
            }
        };
        final int i3 = 2;
        this.e = new wf1(this) { // from class: hn4
            public final /* synthetic */ kn4 o;

            {
                this.o = this;
            }

            @Override // defpackage.wf1
            public final Object invoke(Object obj, Object obj2) {
                int i4 = i3;
                j15 j15Var = j15.a;
                kn4 kn4Var = this.o;
                switch (i4) {
                    case 0:
                        wo0 wo0Var2 = kn4Var.a;
                        c72 c72Var = (c72) obj;
                        o72 o72Var = c72Var.S;
                        if (o72Var == null) {
                            o72Var = new o72(c72Var, wo0Var2);
                            c72Var.S = o72Var;
                        }
                        kn4Var.b = o72Var;
                        kn4Var.a().h();
                        o72 o72VarA = kn4Var.a();
                        if (o72VarA.p != wo0Var2) {
                            o72VarA.p = wo0Var2;
                            o72VarA.i(false);
                            c72.W(o72VarA.n, false, 7);
                        }
                        break;
                    case 1:
                        kn4Var.a().o = (u80) obj2;
                        break;
                    default:
                        c72 c72Var2 = (c72) obj;
                        l72 l72Var = new l72(kn4Var.a(), (wf1) obj2);
                        if (!h12.c(c72Var2.I, l72Var)) {
                            c72Var2.I = l72Var;
                            c72Var2.D();
                        }
                        break;
                }
                return j15Var;
            }
        };
    }

    public final o72 a() {
        o72 o72Var = this.b;
        if (o72Var != null) {
            return o72Var;
        }
        kf2.n("SubcomposeLayoutState is not attached to SubcomposeLayout");
        return null;
    }
}
