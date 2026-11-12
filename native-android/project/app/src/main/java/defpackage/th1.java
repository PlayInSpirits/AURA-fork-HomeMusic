package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class th1 extends h2 {
    public static final Parcelable.Creator<th1> CREATOR = null;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final boolean r;
    public final int s;

    static {
        CREATOR = new j84(23);
    }

    public th1(String r1, String r2, String r3, String r4, boolean r5, int r6) {
        ji2.m(r1);
        this.n = r1;
        this.o = r2;
        this.p = r3;
        this.q = r4;
        this.r = r5;
        this.s = r6;
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof th1) == true) goto L5;
        return false;
    L5:
        th1 r5 = (th1) r4;
        if (au0.n(this.n, r5.n) == true) goto L8;
    L17:
        return false;
    L8:
        if (au0.n(this.q, r5.q) == false) goto L17;
        if (au0.n(this.o, r5.o) == false) goto L17;
        if (au0.n(Boolean.valueOf(this.r), Boolean.valueOf(r5.r)) == false) goto L17;
        if (this.s != r5.s) goto L17;
        return true;
    }

    public final int hashCode() {
        Boolean r0 = Boolean.valueOf(this.r);
        Integer r1 = Integer.valueOf(this.s);
        return Arrays.hashCode(new Object[]{this.n, this.o, this.q, r0, r1});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        int r5 = ud3.R0(r3, 20293);
        ud3.O0(r3, 1, this.n);
        ud3.O0(r3, 2, this.o);
        ud3.O0(r3, 3, this.p);
        ud3.O0(r3, 4, this.q);
        ud3.T0(r3, 5, 4);
        r3.writeInt(this.r ? 1 : 0);
        ud3.T0(r3, 6, 4);
        r3.writeInt(this.s);
        ud3.S0(r3, r5);
    }
}
