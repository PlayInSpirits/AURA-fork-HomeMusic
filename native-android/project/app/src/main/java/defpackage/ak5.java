package defpackage;

import com.google.android.gms.internal.fido.zzho;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ak5 implements Comparable {
    public static int d(byte b) {
        return (b >> 5) & 7;
    }

    public static ak5 e(byte... bArr) {
        bArr.getClass();
        ck5 ck5Var = new ck5(new ByteArrayInputStream(Arrays.copyOf(bArr, bArr.length)));
        try {
            return vr1.J(ck5Var);
        } finally {
            try {
                ck5Var.close();
            } catch (IOException unused) {
            }
        }
    }

    public abstract int a();

    public int b() {
        return 0;
    }

    public final ak5 c(Class cls) throws zzho {
        if (cls.isInstance(this)) {
            return (ak5) cls.cast(this);
        }
        throw new zzho("Expected a " + cls.getName() + " value, but got " + getClass().getName());
    }
}
