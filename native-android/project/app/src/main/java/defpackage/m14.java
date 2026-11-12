package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class m14 {
    public static fv3 a(String str, hu2 hu2Var) {
        str.getClass();
        kd3 kd3VarD = ud3.d(hu2Var);
        Charset charset = (Charset) kd3VarD.n;
        hu2 hu2Var2 = (hu2) kd3VarD.o;
        tv tvVar = new tv();
        charset.getClass();
        int length = str.length();
        str.getClass();
        charset.getClass();
        if (length < 0) {
            kf2.e(xa3.e(length, 0, "endIndex < beginIndex: ", " < "));
        } else {
            if (length > str.length()) {
                StringBuilder sbJ = f34.j(length, "endIndex > string.length: ", " > ");
                sbJ.append(str.length());
                throw new IllegalArgumentException(sbJ.toString().toString());
            }
            if (charset.equals(w10.a)) {
                tvVar.e0(str, 0, length);
            } else {
                byte[] bytes = str.substring(0, length).getBytes(charset);
                bytes.getClass();
                tvVar.m78write(bytes, 0, bytes.length);
            }
        }
        return new fv3(hu2Var2, tvVar.o, tvVar, 1);
    }

    public static fv3 b(byte[] bArr, hu2 hu2Var) {
        bArr.getClass();
        m14 m14Var = n14.Companion;
        tv tvVar = new tv();
        tvVar.m78write(bArr, 0, bArr.length);
        long length = bArr.length;
        m14Var.getClass();
        return new fv3(hu2Var, length, tvVar, 1);
    }
}
