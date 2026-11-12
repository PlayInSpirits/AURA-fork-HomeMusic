package defpackage;

import com.google.android.gms.internal.fido.zzho;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ak5 implements Comparable {
    public static int d(byte r0) {
        return (r0 >> 5) & 7;
    }

    public static ak5 e(byte... r1) {
        r1.getClass();
        ck5 r2 = new ck5(new ByteArrayInputStream(Arrays.copyOf(r1, r1.length)));
        ak5 r0 = vr1.J(r2);     // Catch: Throwable -> L6
        r2.close();     // Catch: IOException -> L9
    L5:
        return r0;
    L6:
        th = move-exception;
        r2.close();     // Catch: IOException -> L10
    L8:
        throw th;
    }

    public abstract int a();

    public int b() {
        return 0;
    }

    public final ak5 c(Class r4) {
        if (r4.isInstance(this) == false) goto L7;
        return (ak5) r4.cast(this);
    L7:
        throw new zzho("Expected a " + r4.getName() + " value, but got " + getClass().getName());
    }
}
