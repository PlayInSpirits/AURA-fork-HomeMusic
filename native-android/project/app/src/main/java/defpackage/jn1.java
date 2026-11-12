package defpackage;

import java.io.EOFException;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jn1 implements wv4 {
    public static final tb1 f;
    public static final tb1 g;
    public final wv4 a;
    public final tb1 b;
    public tb1 c;
    public byte[] d;
    public int e;

    static {
        sb1 sb1Var = new sb1();
        sb1Var.m = lw2.m("application/id3");
        f = new tb1(sb1Var);
        sb1 sb1Var2 = new sb1();
        sb1Var2.m = lw2.m("application/x-emsg");
        g = new tb1(sb1Var2);
    }

    public jn1(wv4 wv4Var, int i) {
        this.a = wv4Var;
        if (i == 1) {
            this.b = f;
        } else {
            if (i != 3) {
                kf2.n(f34.f(i, "Unknown metadataType: "));
                throw null;
            }
            this.b = g;
        }
        this.d = new byte[0];
        this.e = 0;
    }

    @Override // defpackage.wv4
    public final void a(long j, int i, int i2, int i3, vv4 vv4Var) {
        this.c.getClass();
        int i4 = this.e - i3;
        be3 be3Var = new be3(Arrays.copyOfRange(this.d, i4 - i2, i4));
        byte[] bArr = this.d;
        System.arraycopy(bArr, i4, bArr, 0, i3);
        this.e = i3;
        String str = this.c.n;
        tb1 tb1Var = this.b;
        String str2 = tb1Var.n;
        String str3 = tb1Var.n;
        if (!Objects.equals(str, str2)) {
            if (!"application/x-emsg".equals(this.c.n)) {
                l93.q0("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.c.n);
                return;
            }
            m21 m21VarO = wh.O(be3Var);
            tb1 tb1VarA = m21VarO.a();
            if (tb1VarA == null || !Objects.equals(str3, tb1VarA.n)) {
                l93.q0("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str3 + " but actual wrapped format: " + m21VarO.a());
                return;
            }
            byte[] bArrC = m21VarO.c();
            bArrC.getClass();
            be3Var = new be3(bArrC);
        }
        int iA = be3Var.a();
        wv4 wv4Var = this.a;
        wv4Var.e(iA, be3Var);
        wv4Var.a(j, i, iA, 0, vv4Var);
    }

    @Override // defpackage.wv4
    public final void b(be3 be3Var, int i, int i2) {
        int i3 = this.e + i;
        byte[] bArr = this.d;
        if (bArr.length < i3) {
            this.d = Arrays.copyOf(bArr, (i3 / 2) + i3);
        }
        be3Var.k(this.d, this.e, i);
        this.e += i;
    }

    @Override // defpackage.wv4
    public final int c(wh0 wh0Var, int i, boolean z) throws EOFException {
        int i2 = this.e + i;
        byte[] bArr = this.d;
        if (bArr.length < i2) {
            this.d = Arrays.copyOf(bArr, (i2 / 2) + i2);
        }
        int i3 = wh0Var.read(this.d, this.e, i);
        if (i3 != -1) {
            this.e += i3;
            return i3;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // defpackage.wv4
    public final void g(tb1 tb1Var) {
        this.c = tb1Var;
        this.a.g(this.b);
    }
}
