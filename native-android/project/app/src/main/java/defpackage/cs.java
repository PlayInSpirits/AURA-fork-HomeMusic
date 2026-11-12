package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cs extends h2 {
    public static final Parcelable.Creator<cs> CREATOR = new j84(21);
    public final bs n;
    public final yr o;
    public final String p;
    public final boolean q;
    public final int r;
    public final as s;
    public final zr t;
    public final boolean u;

    public cs(bs bsVar, yr yrVar, String str, boolean z, int i, as asVar, zr zrVar, boolean z2) {
        ji2.m(bsVar);
        this.n = bsVar;
        ji2.m(yrVar);
        this.o = yrVar;
        this.p = str;
        this.q = z;
        this.r = i;
        this.s = asVar == null ? new as(false, null, null) : asVar;
        this.t = zrVar == null ? new zr(false, null) : zrVar;
        this.u = z2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cs)) {
            return false;
        }
        cs csVar = (cs) obj;
        return au0.n(this.n, csVar.n) && au0.n(this.o, csVar.o) && au0.n(this.s, csVar.s) && au0.n(this.t, csVar.t) && au0.n(this.p, csVar.p) && this.q == csVar.q && this.r == csVar.r && this.u == csVar.u;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.n, this.o, this.s, this.t, this.p, Boolean.valueOf(this.q), Integer.valueOf(this.r), Boolean.valueOf(this.u)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iR0 = ud3.R0(parcel, 20293);
        ud3.M0(parcel, 1, this.n, i);
        ud3.M0(parcel, 2, this.o, i);
        ud3.O0(parcel, 3, this.p);
        ud3.T0(parcel, 4, 4);
        parcel.writeInt(this.q ? 1 : 0);
        ud3.T0(parcel, 5, 4);
        parcel.writeInt(this.r);
        ud3.M0(parcel, 6, this.s, i);
        ud3.M0(parcel, 7, this.t, i);
        ud3.T0(parcel, 8, 4);
        parcel.writeInt(this.u ? 1 : 0);
        ud3.S0(parcel, iR0);
    }
}
