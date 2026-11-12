package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dy implements Parcelable {
    public static final Parcelable.Creator<dy> CREATOR = null;
    public final ix2 n;
    public final ix2 o;
    public final pi0 p;
    public ix2 q;
    public final int r;
    public final int s;
    public final int t;

    static {
        CREATOR = new w4(12);
    }

    public dy(ix2 r3, ix2 r4, pi0 r5, ix2 r6, int r7) {
        Objects.requireNonNull(r3, "start cannot be null");
        Objects.requireNonNull(r4, "end cannot be null");
        Objects.requireNonNull(r5, "validator cannot be null");
        this.n = r3;
        this.o = r4;
        this.q = r6;
        this.r = r7;
        this.p = r5;
        if (r6 != null) goto L5;
    L9:
        if (r6 != null) goto L11;
    L15:
        if (r7 >= 0) goto L17;
    L20:
        kf2.n("firstDayOfWeek is not valid");
        throw null;
    L17:
        if (r7 > a35.e(null).getMaximum(7)) goto L20;
        this.t = r3.e(r4) + 1;
        this.s = (r4.p - r3.p) + 1;
        return;
    L11:
        if (r6.n.compareTo(r4.n) <= 0) goto L15;
        kf2.n("current Month cannot be after end Month");
        throw null;
    L5:
        if (r3.n.compareTo(r6.n) <= 0) goto L9;
        kf2.n("start Month cannot be after current Month");
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof dy) == true) goto L8;
        return false;
    L8:
        dy r6 = (dy) r5;
        if (this.n.equals(r6.n) == true) goto L11;
    L19:
        return false;
    L11:
        if (this.o.equals(r6.o) == false) goto L19;
        if (Objects.equals(this.q, r6.q) == false) goto L19;
        if (this.r != r6.r) goto L19;
        if (this.p.equals(r6.p) == false) goto L19;
        return true;
    }

    public final int hashCode() {
        ix2 r0 = this.q;
        Integer r1 = Integer.valueOf(this.r);
        pi0 r2 = this.p;
        return Arrays.hashCode(new Object[]{this.n, this.o, r0, r1, r2});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r2, int r3) {
        r2.writeParcelable(this.n, 0);
        r2.writeParcelable(this.o, 0);
        r2.writeParcelable(this.q, 0);
        r2.writeParcelable(this.p, 0);
        r2.writeInt(this.r);
    }
}
