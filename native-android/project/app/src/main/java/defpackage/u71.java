package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class u71 extends im4 {
    public v71 n;
    public ru o;

    @Override // defpackage.im4
    public final long b(be3 be3Var) {
        byte[] bArr = be3Var.a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i = (bArr[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            be3Var.O(4);
            be3Var.I();
        }
        int iP = rr2.P(i, be3Var);
        be3Var.N(0);
        return iP;
    }

    @Override // defpackage.im4
    public final boolean c(be3 be3Var, long j, rf2 rf2Var) {
        byte[] bArr = be3Var.a;
        v71 v71Var = this.n;
        if (v71Var == null) {
            v71 v71Var2 = new v71(17, bArr);
            this.n = v71Var2;
            sb1 sb1VarA = v71Var2.c(Arrays.copyOfRange(bArr, 9, be3Var.c), null).a();
            sb1VarA.l = lw2.m("audio/ogg");
            rf2Var.n = new tb1(sb1VarA);
            return true;
        }
        byte b = bArr[0];
        if ((b & 127) != 3) {
            if (b != -1) {
                return true;
            }
            ru ruVar = this.o;
            if (ruVar != null) {
                ruVar.n = j;
                rf2Var.o = ruVar;
            }
            ((tb1) rf2Var.n).getClass();
            return false;
        }
        rm3 rm3VarY = l93.Y(be3Var);
        v71 v71Var3 = new v71(v71Var.a, v71Var.b, v71Var.c, v71Var.d, v71Var.e, v71Var.g, v71Var.h, v71Var.j, rm3VarY, v71Var.l);
        this.n = v71Var3;
        ru ruVar2 = new ru();
        ruVar2.p = v71Var3;
        ruVar2.q = rm3VarY;
        ruVar2.n = -1L;
        ruVar2.o = -1L;
        this.o = ruVar2;
        return true;
    }

    @Override // defpackage.im4
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = null;
            this.o = null;
        }
    }
}
