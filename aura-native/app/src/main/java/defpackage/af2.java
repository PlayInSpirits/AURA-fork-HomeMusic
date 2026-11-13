package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class af2 implements oo0 {
    public boolean n;
    public long o = 9223372034707292159L;
    public long p = 0;
    public final /* synthetic */ cf2 q;

    public af2(cf2 cf2Var) {
        this.q = cf2Var;
    }

    @Override // defpackage.oo0
    public final float J() {
        return this.q.J();
    }

    public final void a(rp1 rp1Var, float f) {
        cf2 cf2Var = this.q;
        c6 c6Var = cf2Var.D;
        if (c6Var == null) {
            c6Var = new c6();
            cf2Var.D = c6Var;
        }
        int m0 = ti.m0((rp1[]) c6Var.b, rp1Var);
        if (m0 >= 0) {
            float[] fArr = (float[]) c6Var.c;
            if (fArr[m0] != f) {
                fArr[m0] = f;
                ((byte[]) c6Var.d)[m0] = 1;
                return;
            } else {
                byte[] bArr = (byte[]) c6Var.d;
                if (bArr[m0] == 2) {
                    bArr[m0] = 0;
                    return;
                }
                return;
            }
        }
        int i = c6Var.a;
        rp1[] rp1VarArr = (rp1[]) c6Var.b;
        if (i == rp1VarArr.length) {
            int i2 = i * 2;
            c6Var.b = (rp1[]) Arrays.copyOf(rp1VarArr, i2);
            c6Var.c = Arrays.copyOf((float[]) c6Var.c, i2);
            c6Var.d = Arrays.copyOf((byte[]) c6Var.d, i2);
        }
        ((rp1[]) c6Var.b)[i] = rp1Var;
        ((byte[]) c6Var.d)[i] = 3;
        ((float[]) c6Var.c)[i] = f;
        c6Var.a++;
    }

    @Override // defpackage.oo0
    public final float g() {
        return this.q.g();
    }
}
