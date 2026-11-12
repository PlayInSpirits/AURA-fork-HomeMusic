package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class h35 extends h2 {
    public static final Parcelable.Creator<h35> CREATOR = null;
    public final int n;
    public final short o;
    public final short p;

    static {
        CREATOR = new rh5(0);
    }

    public h35(int r1, short r2, short r3) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof h35) == true) goto L5;
        return false;
    L5:
        h35 r5 = (h35) r4;
        if (this.n == r5.n) goto L8;
    L13:
        return false;
    L8:
        if (this.o != r5.o) goto L13;
        if (this.p != r5.p) goto L13;
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.n), Short.valueOf(this.o), Short.valueOf(this.p)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        int r5 = ud3.R0(r3, 20293);
        ud3.T0(r3, 1, 4);
        r3.writeInt(this.n);
        ud3.T0(r3, 2, 4);
        r3.writeInt(this.o);
        ud3.T0(r3, 3, 4);
        r3.writeInt(this.p);
        ud3.S0(r3, r5);
    }
}
