package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wg4 implements y71 {
    public final rf2 a;
    public final ui0 b;
    public final ck4 c;
    public final sq0 d = v64.b;

    public wg4(rf2 rf2Var, ui0 ui0Var, ck4 ck4Var) {
        this.a = rf2Var;
        this.b = ui0Var;
        this.c = ck4Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object b(wg4 wg4Var, q64 q64Var, float f, float f2, tg4 tg4Var, wd0 wd0Var) {
        vg4 vg4Var;
        if (wd0Var instanceof vg4) {
            vg4Var = (vg4) wd0Var;
            int i = vg4Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                vg4Var.p = i - Integer.MIN_VALUE;
            } else {
                vg4Var = new vg4(wg4Var, wd0Var);
            }
        } else {
            vg4Var = new vg4(wg4Var, wd0Var);
        }
        vg4 vg4Var2 = vg4Var;
        Object objZ = vg4Var2.n;
        int i2 = vg4Var2.p;
        if (i2 == 0) {
            kb4.X(objZ);
            int i3 = 28;
            if (Math.abs(f) == 0.0f || Math.abs(f2) == 0.0f) {
                return j51.a(f, f2, 28);
            }
            vg4Var2.p = 1;
            ui0 ui0Var = wg4Var.b;
            objZ = (Math.abs(((zd) new na4(ui0Var.a).D(new zd(0.0f), new zd(f2))).a) >= Math.abs(f) ? new hg3(13, ui0Var) : new pz1(i3, wg4Var.c)).z(q64Var, new Float(f), new Float(f2), tg4Var, vg4Var2);
            xe0 xe0Var = xe0.n;
            if (objZ == xe0Var) {
                return xe0Var;
            }
        } else {
            if (i2 != 1) {
                kf2.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kb4.X(objZ);
        }
        return ((ud) objZ).b;
    }

    @Override // defpackage.y71
    public Object a(c74 c74Var, float f, vd0 vd0Var) {
        return d(c74Var, f, q05.c, (wd0) vd0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(q64 q64Var, float f, if1 if1Var, wd0 wd0Var) throws Throwable {
        sg4 sg4Var;
        if1 if1Var2;
        if (wd0Var instanceof sg4) {
            sg4Var = (sg4) wd0Var;
            int i = sg4Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                sg4Var.q = i - Integer.MIN_VALUE;
            } else {
                sg4Var = new sg4(this, wd0Var);
            }
        } else {
            sg4Var = new sg4(this, wd0Var);
        }
        Object objP = sg4Var.o;
        int i2 = sg4Var.q;
        if (i2 == 0) {
            kb4.X(objP);
            tk0 tk0Var = new tk0(this, f, if1Var, q64Var, null);
            sg4Var.n = if1Var;
            sg4Var.q = 1;
            objP = fu.P(this.d, tk0Var, sg4Var);
            xe0 xe0Var = xe0.n;
            if (objP == xe0Var) {
                return xe0Var;
            }
            if1Var2 = if1Var;
        } else {
            if (i2 != 1) {
                kf2.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            if1Var2 = sg4Var.n;
            kb4.X(objP);
        }
        ud udVar = (ud) objP;
        if1Var2.invoke(new Float(0.0f));
        return udVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(q64 q64Var, float f, if1 if1Var, wd0 wd0Var) throws Throwable {
        ug4 ug4Var;
        if (wd0Var instanceof ug4) {
            ug4Var = (ug4) wd0Var;
            int i = ug4Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                ug4Var.p = i - Integer.MIN_VALUE;
            } else {
                ug4Var = new ug4(this, wd0Var);
            }
        } else {
            ug4Var = new ug4(this, wd0Var);
        }
        Object objC = ug4Var.n;
        int i2 = ug4Var.p;
        if (i2 == 0) {
            kb4.X(objC);
            ug4Var.p = 1;
            objC = c(q64Var, f, if1Var, ug4Var);
            Object obj = xe0.n;
            if (objC == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                kf2.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kb4.X(objC);
        }
        ud udVar = (ud) objC;
        return new Float(udVar.a.floatValue() != 0.0f ? ((Number) udVar.b.a()).floatValue() : 0.0f);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wg4) {
            wg4 wg4Var = (wg4) obj;
            return wg4Var.c.equals(this.c) && h12.c(wg4Var.b, this.b) && wg4Var.a == this.a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + ((this.b.hashCode() + (this.c.hashCode() * 31)) * 31);
    }
}
