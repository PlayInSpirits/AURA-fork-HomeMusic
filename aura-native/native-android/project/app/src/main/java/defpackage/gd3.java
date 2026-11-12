package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gd3 implements y71 {
    public final wg4 a;
    public final lm0 b;

    public gd3(wg4 wg4Var, lm0 lm0Var) {
        this.a = wg4Var;
        this.b = lm0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.y71
    public final Object a(c74 c74Var, float f, vd0 vd0Var) throws Throwable {
        fd3 fd3Var;
        if (vd0Var instanceof fd3) {
            fd3Var = (fd3) vd0Var;
            int i = fd3Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                fd3Var.p = i - Integer.MIN_VALUE;
            } else {
                fd3Var = new fd3(this, (wd0) vd0Var);
            }
        } else {
            fd3Var = new fd3(this, (wd0) vd0Var);
        }
        Object objD = fd3Var.n;
        int i2 = fd3Var.p;
        vd0 vd0Var2 = null;
        if (i2 == 0) {
            kb4.X(objD);
            x xVar = new x(27, this, c74Var);
            fd3Var.p = 1;
            objD = this.a.d(c74Var, f, xVar, fd3Var);
            xe0 xe0Var = xe0.n;
            if (objD == xe0Var) {
                return xe0Var;
            }
        } else {
            if (i2 != 1) {
                kf2.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kb4.X(objD);
        }
        float fFloatValue = ((Number) objD).floatValue();
        lm0 lm0Var = this.b;
        if (lm0Var.l() != 0.0f && Math.abs(lm0Var.l()) < 0.001d) {
            int iK = lm0Var.k();
            if (lm0Var.k.a()) {
                fu.G(((qc3) lm0Var.m.getValue()).s, null, null, new kc3(lm0Var, vd0Var2, 2), 3);
            }
            lm0Var.t(0.0f, iK, false);
        } else {
            new Float(lm0Var.l());
        }
        return new Float(fFloatValue);
    }
}
