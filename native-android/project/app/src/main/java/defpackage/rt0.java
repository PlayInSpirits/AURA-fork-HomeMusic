package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rt0 implements Parcelable {
    public static final Parcelable.Creator<rt0> CREATOR = null;
    public final long n;
    public final long o;

    static {
        CREATOR = new w4(26);
    }

    public rt0(Parcel r9) {
        long r0 = r9.readLong();
        long r2 = r9.readLong();
        boolean r6 = false;
        if (r0 < 0) goto L5;
        boolean r10 = true;
    L6:
        rr2.l(r10);
        if (r2 < 0) goto L9;
    L10:
        r6 = true;
    L11:
        rr2.l(r6);
        this.n = r0;
        this.o = r2;
        return;
    L9:
        if (r2 != (-1)) goto L11;
    L5:
        r10 = false;
        goto L6
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object r7) {
        if ((r7 instanceof rt0) == true) goto L5;
        return false;
    L5:
        rt0 r8 = (rt0) r7;
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
