package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gh5 extends h2 {
    public static final Parcelable.Creator<gh5> CREATOR = null;
    public final long n;

    static {
        CREATOR = new ch5(6);
    }

    public gh5(long r1) {
        this.n = Long.valueOf(r1).longValue();
    }

    public final boolean equals(Object r5) {
        if ((r5 instanceof gh5) == true) goto L6;
        return false;
    L6:
        if (this.n != ((gh5) r5).n) goto L9;
        return true;
    L9:
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.n)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        int r5 = ud3.R0(r3, 20293);
        ud3.T0(r3, 1, 8);
        r3.writeLong(this.n);
        ud3.S0(r3, r5);
    }
}
