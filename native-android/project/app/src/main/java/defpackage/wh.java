package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wh extends zz1 {
    public final /* synthetic */ int n;

    public /* synthetic */ wh(int i) {
        this.n = i;
    }

    public static m21 O(be3 be3Var) {
        String strV = be3Var.v();
        strV.getClass();
        String strV2 = be3Var.v();
        strV2.getClass();
        return new m21(strV, strV2, be3Var.u(), be3Var.u(), Arrays.copyOfRange(be3Var.a, be3Var.b, be3Var.c));
    }

    @Override // defpackage.zz1
    public final qv2 k(uv2 uv2Var, ByteBuffer byteBuffer) {
        switch (this.n) {
            case 0:
                if (byteBuffer.get() != 116) {
                    return null;
                }
                h00 h00Var = new h00(byteBuffer.limit(), byteBuffer.array());
                h00Var.t(12);
                int iF = (h00Var.f() + h00Var.i(12)) - 4;
                h00Var.t(44);
                h00Var.u(h00Var.i(12));
                h00Var.t(16);
                ArrayList arrayList = new ArrayList();
                while (h00Var.f() < iF) {
                    h00Var.t(48);
                    int i = h00Var.i(8);
                    h00Var.t(4);
                    int iF2 = h00Var.f() + h00Var.i(12);
                    String str = null;
                    String str2 = null;
                    while (h00Var.f() < iF2) {
                        int i2 = h00Var.i(8);
                        int i3 = h00Var.i(8);
                        int iF3 = h00Var.f() + i3;
                        if (i2 == 2) {
                            int i4 = h00Var.i(16);
                            h00Var.t(8);
                            if (i4 == 3) {
                                while (h00Var.f() < iF3) {
                                    int i5 = h00Var.i(8);
                                    Charset charset = StandardCharsets.US_ASCII;
                                    byte[] bArr = new byte[i5];
                                    h00Var.l(i5, bArr);
                                    String str3 = new String(bArr, charset);
                                    int i6 = h00Var.i(8);
                                    for (int i7 = 0; i7 < i6; i7++) {
                                        h00Var.u(h00Var.i(8));
                                    }
                                    str = str3;
                                }
                            }
                        } else if (i2 == 21) {
                            Charset charset2 = StandardCharsets.US_ASCII;
                            byte[] bArr2 = new byte[i3];
                            h00Var.l(i3, bArr2);
                            str2 = new String(bArr2, charset2);
                        }
                        h00Var.q(iF3 * 8);
                    }
                    h00Var.q(iF2 * 8);
                    if (str != null && str2 != null) {
                        arrayList.add(new vh(i, str.concat(str2)));
                    }
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new qv2(arrayList);
            default:
                return new qv2(O(new be3(byteBuffer.limit(), byteBuffer.array())));
        }
    }
}
