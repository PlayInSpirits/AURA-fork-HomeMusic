package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sz3 {
    public static we5 a(hu2 hu2Var, byte[] bArr, int i, int i2) {
        bArr.getClass();
        xe5.a(bArr.length, i, i2);
        return new we5(hu2Var, bArr, i2, i);
    }

    public static we5 b(String str, hu2 hu2Var) {
        str.getClass();
        kd3 kd3VarD = ud3.d(hu2Var);
        Charset charset = (Charset) kd3VarD.n;
        hu2 hu2Var2 = (hu2) kd3VarD.o;
        byte[] bytes = str.getBytes(charset);
        bytes.getClass();
        return a(hu2Var2, bytes, 0, bytes.length);
    }

    public static /* synthetic */ we5 c(sz3 sz3Var, byte[] bArr, hu2 hu2Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            hu2Var = null;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        int length = bArr.length;
        sz3Var.getClass();
        return a(hu2Var, bArr, i, length);
    }
}
