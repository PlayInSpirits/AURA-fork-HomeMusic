package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class as extends h2 {
    public static final Parcelable.Creator<as> CREATOR = new j84(26);
    public final boolean n;
    public final byte[] o;
    public final String p;

    public as(boolean z, byte[] bArr, String str) {
        if (z) {
            ji2.m(bArr);
            ji2.m(str);
        }
        this.n = z;
        this.o = bArr;
        this.p = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof as)) {
            return false;
        }
        as asVar = (as) obj;
        return this.n == asVar.n && Arrays.equals(this.o, asVar.o) && Objects.equals(this.p, asVar.p);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.o) + (Objects.hash(Boolean.valueOf(this.n), this.p) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iR0 = ud3.R0(parcel, 20293);
        ud3.T0(parcel, 1, 4);
        parcel.writeInt(this.n ? 1 : 0);
        ud3.L0(parcel, 2, this.o);
        ud3.O0(parcel, 3, this.p);
        ud3.S0(parcel, iR0);
    }
}
