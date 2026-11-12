package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ik5 extends ef5 implements IInterface {
    public final int f;

    public ik5(byte[] bArr) {
        super(3, "com.google.android.gms.common.internal.ICertData");
        ji2.i(bArr.length == 25);
        this.f = Arrays.hashCode(bArr);
    }

    public static byte[] P0(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.ef5
    public final boolean O0(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.f);
            return true;
        }
        x73 x73Var = new x73(Q0());
        parcel2.writeNoException();
        int i2 = zh5.a;
        parcel2.writeStrongBinder(x73Var);
        return true;
    }

    public abstract byte[] Q0();

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof ik5)) {
            try {
                ik5 ik5Var = (ik5) obj;
                if (ik5Var.f == this.f) {
                    return Arrays.equals(Q0(), (byte[]) new x73(ik5Var.Q0()).f);
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f;
    }
}
