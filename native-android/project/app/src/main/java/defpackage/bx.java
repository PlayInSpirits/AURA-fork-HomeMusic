package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bx implements Parcelable {
    public static final Parcelable.Creator<bx> CREATOR = null;
    public final g9 n;

    static {
        CREATOR = new rh5(14);
    }

    public bx(g9 r1) {
        this.n = r1;
    }

    public static bx a(int r7) {
        if (r7 != (-262)) goto L5;
        g9 r8 = tt3.o;
    L17:
        return new bx(r8);
    L5:
        tt3[] r1 = tt3.values();
        int r2 = r1.length;
        int r3 = 0;
        int r4 = 0;
    L6:
        if (r4 >= r2) goto L11;
        tt3 r5 = r1[r4];
        if (r5.n == r7) goto L9;
        r4 = r4 + 1;
        goto L6
    L9:
        r8 = r5;
        goto L17
    L11:
        py0[] r6 = py0.values();
        int r9 = r6.length;
    L12:
        if (r3 >= r9) goto L20;
        py0 r10 = r6[r3];
        if (r10.n == r7) goto L15;
        r3 = r3 + 1;
        goto L12
    L15:
        r8 = r10;
        goto L17
    L20:
        throw new COSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException(b11.j(r7, "Algorithm with COSE value ", " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof bx) == true) goto L6;
        return false;
    L6:
        if (this.n.a() != ((bx) r2).n.a()) goto L9;
        return true;
    L9:
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.n});
    }

    public final String toString() {
        return xa3.h("COSEAlgorithmIdentifier{algorithm=", String.valueOf(this.n), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        r1.writeInt(this.n.a());
    }
}
