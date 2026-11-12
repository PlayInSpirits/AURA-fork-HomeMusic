package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bx implements Parcelable {
    public static final Parcelable.Creator<bx> CREATOR = new rh5(14);
    public final g9 n;

    public bx(g9 g9Var) {
        this.n = g9Var;
    }

    public static bx a(int i) throws COSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException {
        g9 g9Var;
        if (i != -262) {
            for (tt3 tt3Var : tt3.values()) {
                if (tt3Var.n == i) {
                    g9Var = tt3Var;
                }
            }
            for (py0 py0Var : py0.values()) {
                if (py0Var.n == i) {
                    g9Var = py0Var;
                }
            }
            throw new COSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException(b11.j(i, "Algorithm with COSE value ", " not supported"));
        }
        g9Var = tt3.RS1;
        return new bx(g9Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof bx) && this.n.a() == ((bx) obj).n.a();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.n});
    }

    public final String toString() {
        return xa3.h("COSEAlgorithmIdentifier{algorithm=", String.valueOf(this.n), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.n.a());
    }
}
