package defpackage;

import java.io.EOFException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ov1 implements zn4 {
    public final be3 n;

    public ov1(int i) {
        switch (i) {
            case 1:
                this.n = new be3();
                break;
            default:
                this.n = new be3(10);
                break;
        }
    }

    public qv2 a(l51 l51Var, kv1 kv1Var, int i) {
        be3 be3Var;
        int i2;
        int i3 = 0;
        qv2 qv2VarO = null;
        while (true) {
            int i4 = 0;
            while (true) {
                int i5 = i4 % 10;
                int i6 = i5 + 10;
                be3Var = this.n;
                if (i5 == 0 && i4 != 0) {
                    byte[] bArr = be3Var.a;
                    System.arraycopy(bArr, 10, bArr, 0, 9);
                }
                int i7 = i4 == 0 ? 10 : 1;
                try {
                    l51Var.n(be3Var.a, i6 - i7, i7);
                    be3Var.N(i5);
                    be3Var.M(i6);
                    if (be3Var.a() < 3) {
                        er1.h(be3Var.b, be3Var.c);
                        return null;
                    }
                    int iD = be3Var.D();
                    i2 = be3Var.b - 3;
                    be3Var.b = i2;
                    if (iD == 4801587) {
                        break;
                    }
                    if (jz4.v(be3Var.i()) == -1) {
                        if (i4 == 0) {
                            be3Var.c(20);
                        }
                        i4++;
                        if (i4 > i) {
                        }
                    }
                    l51Var.k();
                    l51Var.g(i3);
                    return qv2VarO;
                } catch (EOFException unused) {
                }
            }
            be3Var.O(6);
            int iZ = be3Var.z();
            int i8 = iZ + 10;
            if (qv2VarO == null) {
                byte[] bArr2 = new byte[i8];
                System.arraycopy(be3Var.a, i2, bArr2, 0, 10);
                l51Var.n(bArr2, 10, iZ);
                qv2VarO = new mv1(kv1Var).O(i8, bArr2);
            } else {
                l51Var.g(iZ);
            }
            i3 += i8;
        }
    }

    @Override // defpackage.zn4
    public void c(byte[] bArr, int i, int i2, yn4 yn4Var, wc0 wc0Var) {
        ig0 ig0VarA;
        be3 be3Var = this.n;
        be3Var.L(i2 + i, bArr);
        be3Var.N(i);
        ArrayList arrayList = new ArrayList();
        while (be3Var.a() > 0) {
            rr2.k("Incomplete Mp4Webvtt Top Level box header found.", be3Var.a() >= 8);
            int iM = be3Var.m();
            if (be3Var.m() == 1987343459) {
                int i3 = iM - 8;
                CharSequence charSequenceF = null;
                hg0 hg0VarA = null;
                while (i3 > 0) {
                    rr2.k("Incomplete vtt cue box header found.", i3 >= 8);
                    int iM2 = be3Var.m();
                    int iM3 = be3Var.m();
                    int i4 = iM2 - 8;
                    byte[] bArr2 = be3Var.a;
                    int i5 = be3Var.b;
                    String str = f35.a;
                    String str2 = new String(bArr2, i5, i4, StandardCharsets.UTF_8);
                    be3Var.O(i4);
                    i3 = (i3 - 8) - i4;
                    if (iM3 == 1937011815) {
                        v95 v95Var = new v95();
                        w95.e(str2, v95Var);
                        hg0VarA = v95Var.a();
                    } else if (iM3 == 1885436268) {
                        charSequenceF = w95.f(null, str2.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequenceF == null) {
                    charSequenceF = "";
                }
                if (hg0VarA != null) {
                    hg0VarA.a = charSequenceF;
                    hg0VarA.b = null;
                    ig0VarA = hg0VarA.a();
                } else {
                    Pattern pattern = w95.a;
                    v95 v95Var2 = new v95();
                    v95Var2.c = charSequenceF;
                    ig0VarA = v95Var2.a().a();
                }
                arrayList.add(ig0VarA);
            } else {
                be3Var.O(iM - 8);
            }
        }
        wc0Var.accept(new lg0(-9223372036854775807L, -9223372036854775807L, arrayList));
    }
}
