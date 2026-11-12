package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class st0 implements Parcelable {
    public static final Parcelable.Creator<st0> CREATOR = null;
    public final long n;
    public final long o;

    static {
        CREATOR = new w4(27);
    }

    public st0(Parcel r7) {
        long r0 = r7.readLong();
        long r2 = r7.readLong();
        if (r2 < 0) goto L5;
    L8:
        boolean r8 = true;
    L9:
        rr2.l(r8);
        this.n = r0;
        this.o = r2;
        return;
    L5:
        if (r2 == (-9223372036854775807L)) goto L8;
        r8 = false;
        goto L9
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object r7) {
        if ((r7 instanceof st0) == true) goto L5;
        return false;
    L5:
        st0 r8 = (st0) r7;
        if (this.n == r8.n) goto L8;
    L11:
        return false;
    L8:
        if (this.o != r8.o) goto L11;
        return true;
    }

    public final int hashCode() {
        return (((int) this.n) * 961) + ((int) this.o);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        r3.writeLong(this.n);
        r3.writeLong(this.o);
    }
}
