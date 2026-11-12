package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zr extends h2 {
    public static final Parcelable.Creator<zr> CREATOR = null;
    public final boolean n;
    public final String o;

    static {
        CREATOR = new j84(25);
    }

    public zr(boolean r1, String r2) {
        if (r1 == false) goto L5;
        ji2.m(r2);
    L5:
        this.n = r1;
        this.o = r2;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof zr) == true) goto L8;
        return false;
    L8:
        zr r6 = (zr) r5;
        if (this.n == r6.n) goto L11;
    L13:
        return false;
    L11:
        if (au0.n(this.o, r6.o) == false) goto L13;
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.n), this.o});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        int r5 = ud3.R0(r3, 20293);
        ud3.T0(r3, 1, 4);
        r3.writeInt(this.n ? 1 : 0);
        ud3.O0(r3, 2, this.o);
        ud3.S0(r3, r5);
    }
}
