package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sy3 {
    public final int a;
    public final z70 b;
    public float c;

    public sy3(int i, z70 z70Var) {
        this.a = i;
        this.b = z70Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(float f, wd0 wd0Var) {
        ry3 ry3Var;
        if (wd0Var instanceof ry3) {
            ry3Var = (ry3) wd0Var;
            int i = ry3Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                ry3Var.p = i - Integer.MIN_VALUE;
            } else {
                ry3Var = new ry3(this, wd0Var);
            }
        } else {
            ry3Var = new ry3(this, wd0Var);
        }
        Object objInvoke = ry3Var.n;
        int i2 = ry3Var.p;
        if (i2 == 0) {
            kb4.X(objInvoke);
            Float f2 = new Float(f);
            ry3Var.p = 1;
            objInvoke = this.b.invoke(f2, ry3Var);
            xe0 xe0Var = xe0.n;
            if (objInvoke == xe0Var) {
                return xe0Var;
            }
        } else {
            if (i2 != 1) {
                kf2.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kb4.X(objInvoke);
        }
        this.c += ((Number) objInvoke).floatValue();
        return j15.a;
    }
}
