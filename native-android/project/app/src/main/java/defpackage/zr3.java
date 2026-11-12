package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zr3 extends h2 {
    public static final Parcelable.Creator<zr3> CREATOR = null;
    public final bs3 n;
    public final bx o;

    static {
        CREATOR = new ch5(16);
    }

    public zr3(int r1, String r2) {
        ji2.m(r2);
        this.n = bs3.a(r2);     // Catch: PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException -> L9
        this.o = bx.a(r1);     // Catch: COSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException -> L6
        return;
    L6:
        e = move-exception;
        throw new IllegalArgumentException(e);
    L9:
        e = move-exception;
        throw new IllegalArgumentException(e);
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof zr3) == true) goto L5;
        return false;
    L5:
        zr3 r5 = (zr3) r4;
        if (this.n.equals(r5.n) == true) goto L8;
    L11:
        return false;
    L8:
        if (this.o.equals(r5.o) == false) goto L11;
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.n, this.o});
    }

    public final String toString() {
        return f34.h("PublicKeyCredentialParameters{\n type=", String.valueOf(this.n), ", \n algorithm=", String.valueOf(this.o), "\n }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        int r5 = ud3.R0(r3, 20293);
        this.n.getClass();
        ud3.O0(r3, 2, "public-key");
        int r2 = this.o.n.a();
        ud3.T0(r3, 3, 4);
        r3.writeInt(r2);
        ud3.S0(r3, r5);
    }
}
