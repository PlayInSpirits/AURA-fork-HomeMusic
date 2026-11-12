package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class eb3 extends im4 {
    public static final byte[] o = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] p = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean n;

    public static boolean e(be3 be3Var, byte[] bArr) {
        if (be3Var.a() < bArr.length) {
            return false;
        }
        int i = be3Var.b;
        byte[] bArr2 = new byte[bArr.length];
        be3Var.k(bArr2, 0, bArr.length);
        be3Var.N(i);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // defpackage.im4
    public final long b(be3 be3Var) {
        byte[] bArr = be3Var.a;
        return (((long) this.i) * su3.t(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // defpackage.im4
    public final boolean c(be3 be3Var, long j, rf2 rf2Var) {
        if (e(be3Var, o)) {
            byte[] bArrCopyOf = Arrays.copyOf(be3Var.a, be3Var.c);
            int i = bArrCopyOf[9] & 255;
            ArrayList arrayListJ = su3.j(bArrCopyOf);
            if (((tb1) rf2Var.n) == null) {
                sb1 sb1Var = new sb1();
                sb1Var.l = lw2.m("audio/ogg");
                sb1Var.m = lw2.m("audio/opus");
                sb1Var.E = i;
                sb1Var.F = 48000;
                sb1Var.p = arrayListJ;
                rf2Var.n = new tb1(sb1Var);
                return true;
            }
        } else {
            if (!e(be3Var, p)) {
                ((tb1) rf2Var.n).getClass();
                return false;
            }
            ((tb1) rf2Var.n).getClass();
            if (!this.n) {
                this.n = true;
                be3Var.O(8);
                qv2 qv2VarW = zz1.w(yw1.l((String[]) zz1.C(be3Var, false, false).n));
                if (qv2VarW != null) {
                    sb1 sb1VarA = ((tb1) rf2Var.n).a();
                    sb1VarA.k = qv2VarW.b(((tb1) rf2Var.n).l);
                    rf2Var.n = new tb1(sb1VarA);
                    return true;
                }
            }
        }
        return true;
    }

    @Override // defpackage.im4
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = false;
        }
    }
}
