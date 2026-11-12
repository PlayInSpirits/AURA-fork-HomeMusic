package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ik5 extends ef5 implements IInterface {
    public final int f;

    public ik5(byte[] r3) {
        super(3, "com.google.android.gms.common.internal.ICertData");
        if (r3.length != 25) goto L5;
        boolean r0 = true;
    L6:
        ji2.i(r0);
        this.f = Arrays.hashCode(r3);
        return;
    L5:
        r0 = false;
        goto L6
    }

    public static byte[] P0(String r1) {
        return r1.getBytes("ISO-8859-1");
    L4:
        e = move-exception;
        throw new AssertionError(e);
    }

    @Override // defpackage.ef5
    public final boolean O0(int r2, Parcel r3, Parcel r4) {
        if (r2 != 1) goto L5;
        x73 r5 = new x73(Q0());
        r4.writeNoException();
        int r1 = zh5.a;
        r4.writeStrongBinder(r5);
        return true;
    L5:
        if (r2 == 2) goto L8;
        return false;
    L8:
        r4.writeNoException();
        r4.writeInt(this.f);
        return true;
    }

    public abstract byte[] Q0();

    public final boolean equals(Object r4) {
        if (r4 != null) goto L5;
    L14:
        return false;
    L5:
        if ((r4 instanceof ik5) == false) goto L14;
        ik5 r5 = (ik5) r4;     // Catch: RemoteException -> L12
        if (r5.f != this.f) goto L14;
        byte[] r6 = (byte[]) new x73(r5.Q0()).f;     // Catch: RemoteException -> L12
        return Arrays.equals(Q0(), r6);
    L12:
        e = move-exception;
        Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
        goto L14
    }

    public final int hashCode() {
        return this.f;
    }
}
