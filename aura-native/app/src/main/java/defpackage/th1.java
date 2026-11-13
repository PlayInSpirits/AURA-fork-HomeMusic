package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class th1 extends h2 {
    public static final Parcelable.Creator<th1> CREATOR = new j84(23);
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final boolean r;
    public final int s;

    public th1(String str, String str2, String str3, String str4, boolean z, int i) {
        ji2.m(str);
        this.n = str;
        this.o = str2;
        this.p = str3;
        this.q = str4;
        this.r = z;
        this.s = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof th1)) {
            return false;
        }
        th1 th1Var = (th1) obj;
        return au0.n(this.n, th1Var.n) && au0.n(this.q, th1Var.q) && au0.n(this.o, th1Var.o) && au0.n(Boolean.valueOf(this.r), Boolean.valueOf(th1Var.r)) && this.s == th1Var.s;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.n, this.o, this.q, Boolean.valueOf(this.r), Integer.valueOf(this.s)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int R0 = ud3.R0(parcel, 20293);
        ud3.O0(parcel, 1, this.n);
        ud3.O0(parcel, 2, this.o);
        ud3.O0(parcel, 3, this.p);
        ud3.O0(parcel, 4, this.q);
        ud3.T0(parcel, 5, 4);
        parcel.writeInt(this.r ? 1 : 0);
        ud3.T0(parcel, 6, 4);
        parcel.writeInt(this.s);
        ud3.S0(parcel, R0);
    }
}
