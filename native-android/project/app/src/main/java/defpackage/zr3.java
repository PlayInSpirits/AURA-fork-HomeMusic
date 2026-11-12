package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zr3 extends h2 {
    public static final Parcelable.Creator<zr3> CREATOR = new ch5(16);
    public final bs3 n;
    public final bx o;

    public zr3(int i, String str) {
        ji2.m(str);
        try {
            this.n = bs3.a(str);
            try {
                this.o = bx.a(i);
            } catch (COSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException e) {
                throw new IllegalArgumentException(e);
            }
        } catch (PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zr3)) {
            return false;
        }
        zr3 zr3Var = (zr3) obj;
        return this.n.equals(zr3Var.n) && this.o.equals(zr3Var.o);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.n, this.o});
    }

    public final String toString() {
        return f34.h("PublicKeyCredentialParameters{\n type=", String.valueOf(this.n), ", \n algorithm=", String.valueOf(this.o), "\n }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iR0 = ud3.R0(parcel, 20293);
        this.n.getClass();
        ud3.O0(parcel, 2, "public-key");
        int iA = this.o.n.a();
        ud3.T0(parcel, 3, 4);
        parcel.writeInt(iA);
        ud3.S0(parcel, iR0);
    }
}
