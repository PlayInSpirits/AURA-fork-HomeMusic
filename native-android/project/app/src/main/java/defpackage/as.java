package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class as extends h2 {
    public static final Parcelable.Creator<as> CREATOR = null;
    public final boolean n;
    public final byte[] o;
    public final String p;

    static {
        CREATOR = new j84(26);
    }

    public as(boolean r1, byte[] r2, String r3) {
        if (r1 == false) goto L5;
        ji2.m(r2);
        ji2.m(r3);
    L5:
        this.n = r1;
        this.o = r2;
        this.p = r3;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof as) == true) goto L8;
        return false;
    L8:
        as r6 = (as) r5;
        if (this.n == r6.n) goto L11;
    L15:
        return false;
    L11:
        if (Arrays.equals(this.o, r6.o) == false) goto L15;
        if (Objects.equals(this.p, r6.p) == false) goto L15;
        return true;
    }

    public final int hashCode() {
        int r0 = Objects.hash(new Object[]{Boolean.valueOf(this.n), this.p}) * 31;
        return Arrays.hashCode(this.o) + r0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        int r5 = ud3.R0(r3, 20293);
        ud3.T0(r3, 1, 4);
        r3.writeInt(this.n ? 1 : 0);
        ud3.L0(r3, 2, this.o);
        ud3.O0(r3, 3, this.p);
        ud3.S0(r3, r5);
    }
}
