package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class r44 extends h2 {
    public static final Parcelable.Creator<r44> CREATOR = null;
    public final vd4 n;
    public final String o;
    public final int p;

    static {
        CREATOR = new j84(28);
    }

    public r44(vd4 r1, String r2, int r3) {
        ji2.m(r1);
        this.n = r1;
        this.o = r2;
        this.p = r3;
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof r44) == true) goto L5;
        return false;
    L5:
        r44 r5 = (r44) r4;
        if (au0.n(this.n, r5.n) == true) goto L8;
    L13:
        return false;
    L8:
        if (au0.n(this.o, r5.o) == false) goto L13;
        if (this.p != r5.p) goto L13;
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.n, this.o});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        int r0 = ud3.R0(r4, 20293);
        ud3.M0(r4, 1, this.n, r5);
        ud3.O0(r4, 2, this.o);
        ud3.T0(r4, 3, 4);
        r4.writeInt(this.p);
        ud3.S0(r4, r0);
    }
}
