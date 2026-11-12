package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class td4 extends h2 {
    public static final Parcelable.Creator<td4> CREATOR = null;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final Uri r;
    public final String s;
    public final String t;
    public final String u;
    public final vr3 v;

    static {
        CREATOR = new ch5(1);
    }

    public td4(String r1, String r2, String r3, String r4, Uri r5, String r6, String r7, String r8, vr3 r9) {
        ji2.m(r1);
        this.n = r1;
        this.o = r2;
        this.p = r3;
        this.q = r4;
        this.r = r5;
        this.s = r6;
        this.t = r7;
        this.u = r8;
        this.v = r9;
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof td4) == true) goto L5;
        return false;
    L5:
        td4 r5 = (td4) r4;
        if (au0.n(this.n, r5.n) == true) goto L8;
    L25:
        return false;
    L8:
        if (au0.n(this.o, r5.o) == false) goto L25;
        if (au0.n(this.p, r5.p) == false) goto L25;
        if (au0.n(this.q, r5.q) == false) goto L25;
        if (au0.n(this.r, r5.r) == false) goto L25;
        if (au0.n(this.s, r5.s) == false) goto L25;
        if (au0.n(this.t, r5.t) == false) goto L25;
        if (au0.n(this.u, r5.u) == false) goto L25;
        if (au0.n(this.v, r5.v) == false) goto L25;
        return true;
    }

    public final int hashCode() {
        String r7 = this.u;
        vr3 r8 = this.v;
        return Arrays.hashCode(new Object[]{this.n, this.o, this.p, this.q, this.r, this.s, this.t, r7, r8});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        int r0 = ud3.R0(r4, 20293);
        ud3.O0(r4, 1, this.n);
        ud3.O0(r4, 2, this.o);
        ud3.O0(r4, 3, this.p);
        ud3.O0(r4, 4, this.q);
        ud3.M0(r4, 5, this.r, r5);
        ud3.O0(r4, 6, this.s);
        ud3.O0(r4, 7, this.t);
        ud3.O0(r4, 8, this.u);
        ud3.M0(r4, 9, this.v, r5);
        ud3.S0(r4, r0);
    }
}
