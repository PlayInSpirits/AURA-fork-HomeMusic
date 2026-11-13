package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class td4 extends h2 {
    public static final Parcelable.Creator<td4> CREATOR = new ch5(1);
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final Uri r;
    public final String s;
    public final String t;
    public final String u;
    public final vr3 v;

    public td4(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, vr3 vr3Var) {
        ji2.m(str);
        this.n = str;
        this.o = str2;
        this.p = str3;
        this.q = str4;
        this.r = uri;
        this.s = str5;
        this.t = str6;
        this.u = str7;
        this.v = vr3Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof td4)) {
            return false;
        }
        td4 td4Var = (td4) obj;
        return au0.n(this.n, td4Var.n) && au0.n(this.o, td4Var.o) && au0.n(this.p, td4Var.p) && au0.n(this.q, td4Var.q) && au0.n(this.r, td4Var.r) && au0.n(this.s, td4Var.s) && au0.n(this.t, td4Var.t) && au0.n(this.u, td4Var.u) && au0.n(this.v, td4Var.v);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int R0 = ud3.R0(parcel, 20293);
        ud3.O0(parcel, 1, this.n);
        ud3.O0(parcel, 2, this.o);
        ud3.O0(parcel, 3, this.p);
        ud3.O0(parcel, 4, this.q);
        ud3.M0(parcel, 5, this.r, i);
        ud3.O0(parcel, 6, this.s);
        ud3.O0(parcel, 7, this.t);
        ud3.O0(parcel, 8, this.u);
        ud3.M0(parcel, 9, this.v, i);
        ud3.S0(parcel, R0);
    }
}
