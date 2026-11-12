package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zr extends h2 {
    public static final Parcelable.Creator<zr> CREATOR = new j84(25);
    public final boolean n;
    public final String o;

    public zr(boolean z, String str) {
        if (z) {
            ji2.m(str);
        }
        this.n = z;
        this.o = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zr)) {
            return false;
        }
        zr zrVar = (zr) obj;
        return this.n == zrVar.n && au0.n(this.o, zrVar.o);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.n), this.o});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iR0 = ud3.R0(parcel, 20293);
        ud3.T0(parcel, 1, 4);
        parcel.writeInt(this.n ? 1 : 0);
        ud3.O0(parcel, 2, this.o);
        ud3.S0(parcel, iR0);
    }
}
