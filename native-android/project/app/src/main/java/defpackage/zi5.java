package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zi5 extends h2 {
    public static final Parcelable.Creator<zi5> CREATOR = null;
    public final rj5 n;
    public final rj5 o;

    static {
        CREATOR = new rh5(5);
    }

    public zi5(rj5 r1, rj5 r2) {
        this.n = r1;
        this.o = r2;
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof zi5) == true) goto L5;
        return false;
    L5:
        zi5 r5 = (zi5) r4;
        if (au0.n(this.n, r5.n) == true) goto L8;
    L11:
        return false;
    L8:
        if (au0.n(this.o, r5.o) == false) goto L11;
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.n, this.o});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        int r6 = ud3.R0(r4, 20293);
        byte[] r0 = null;
        rj5 r1 = this.n;
        if (r1 != null) goto L5;
        byte[] r2 = null;
    L6:
        ud3.L0(r4, 1, r2);
        rj5 r3 = this.o;
        if (r3 == null) goto L10;
        r0 = r3.j();
    L10:
        ud3.L0(r4, 2, r0);
        ud3.S0(r4, r6);
        return;
    L5:
        r2 = r1.j();
        goto L6
    }
}
