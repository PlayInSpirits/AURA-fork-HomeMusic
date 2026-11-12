package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qk5 extends h2 {
    public static final Parcelable.Creator<qk5> CREATOR = null;
    public final long n;
    public final rj5 o;
    public final rj5 p;
    public final rj5 q;

    static {
        CREATOR = new rh5(15);
    }

    public qk5(long r2, byte[] r4, byte[] r5, byte[] r6) {
        ji2.m(r4);
        rj5 r7 = rj5.i(r4.length, r4);
        ji2.m(r5);
        rj5 r8 = rj5.i(r5.length, r5);
        ji2.m(r6);
        rj5 r9 = rj5.i(r6.length, r6);
        this.n = r2;
        this.o = r7;
        this.p = r8;
        this.q = r9;
    }

    public final boolean equals(Object r5) {
        if ((r5 instanceof qk5) == false) goto L20;
        qk5 r6 = (qk5) r5;
        if (this.n == r6.n) goto L8;
        return false;
    L8:
        if (au0.n(this.o, r6.o) == true) goto L10;
        return false;
    L10:
        if (au0.n(this.p, r6.p) == true) goto L12;
        return false;
    L12:
        if (au0.n(this.q, r6.q) == false) goto L19;
        return true;
    L19:
        return false;
    L20:
        return false;
    }

    public final int hashCode() {
        Long r0 = Long.valueOf(this.n);
        rj5 r1 = this.p;
        rj5 r2 = this.q;
        return Arrays.hashCode(new Object[]{r0, this.o, r1, r2});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        int r5 = ud3.R0(r3, 20293);
        ud3.T0(r3, 1, 8);
        r3.writeLong(this.n);
        ud3.L0(r3, 2, this.o.j());
        ud3.L0(r3, 3, this.p.j());
        ud3.L0(r3, 4, this.q.j());
        ud3.S0(r3, r5);
    }
}
