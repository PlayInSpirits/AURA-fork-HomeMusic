package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cs extends h2 {
    public static final Parcelable.Creator<cs> CREATOR = null;
    public final bs n;
    public final yr o;
    public final String p;
    public final boolean q;
    public final int r;
    public final as s;
    public final zr t;
    public final boolean u;

    static {
        CREATOR = new j84(21);
    }

    public cs(bs r1, yr r2, String r3, boolean r4, int r5, as r6, zr r7, boolean r8) {
        ji2.m(r1);
        this.n = r1;
        ji2.m(r2);
        this.o = r2;
        this.p = r3;
        this.q = r4;
        this.r = r5;
        if (r6 != null) goto L5;
        r6 = new as(false, null, null);
    L5:
        this.s = r6;
        if (r7 != null) goto L8;
        r7 = new zr(false, null);
    L8:
        this.t = r7;
        this.u = r8;
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof cs) == true) goto L5;
        return false;
    L5:
        cs r5 = (cs) r4;
        if (au0.n(this.n, r5.n) == true) goto L8;
    L23:
        return false;
    L8:
        if (au0.n(this.o, r5.o) == false) goto L23;
        if (au0.n(this.s, r5.s) == false) goto L23;
        if (au0.n(this.t, r5.t) == false) goto L23;
        if (au0.n(this.p, r5.p) == false) goto L23;
        if (this.q != r5.q) goto L23;
        if (this.r != r5.r) goto L23;
        if (this.u != r5.u) goto L23;
        return true;
    }

    public final int hashCode() {
        Boolean r6 = Boolean.valueOf(this.q);
        Integer r7 = Integer.valueOf(this.r);
        Boolean r8 = Boolean.valueOf(this.u);
        return Arrays.hashCode(new Object[]{this.n, this.o, this.s, this.t, this.p, r6, r7, r8});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r5, int r6) {
        int r0 = ud3.R0(r5, 20293);
        ud3.M0(r5, 1, this.n, r6);
        ud3.M0(r5, 2, this.o, r6);
        ud3.O0(r5, 3, this.p);
        ud3.T0(r5, 4, 4);
        r5.writeInt(this.q ? 1 : 0);
        ud3.T0(r5, 5, 4);
        r5.writeInt(this.r);
        ud3.M0(r5, 6, this.s, r6);
        ud3.M0(r5, 7, this.t, r6);
        ud3.T0(r5, 8, 4);
        r5.writeInt(this.u ? 1 : 0);
        ud3.S0(r5, r0);
    }
}
