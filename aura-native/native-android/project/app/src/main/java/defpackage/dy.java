package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dy implements Parcelable {
    public static final Parcelable.Creator<dy> CREATOR = new w4(12);
    public final ix2 n;
    public final ix2 o;
    public final pi0 p;
    public ix2 q;
    public final int r;
    public final int s;
    public final int t;

    public dy(ix2 ix2Var, ix2 ix2Var2, pi0 pi0Var, ix2 ix2Var3, int i) {
        Objects.requireNonNull(ix2Var, "start cannot be null");
        Objects.requireNonNull(ix2Var2, "end cannot be null");
        Objects.requireNonNull(pi0Var, "validator cannot be null");
        this.n = ix2Var;
        this.o = ix2Var2;
        this.q = ix2Var3;
        this.r = i;
        this.p = pi0Var;
        if (ix2Var3 != null && ix2Var.n.compareTo(ix2Var3.n) > 0) {
            kf2.n("start Month cannot be after current Month");
            throw null;
        }
        if (ix2Var3 != null && ix2Var3.n.compareTo(ix2Var2.n) > 0) {
            kf2.n("current Month cannot be after end Month");
            throw null;
        }
        if (i < 0 || i > a35.e(null).getMaximum(7)) {
            kf2.n("firstDayOfWeek is not valid");
            throw null;
        }
        this.t = ix2Var.e(ix2Var2) + 1;
        this.s = (ix2Var2.p - ix2Var.p) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dy)) {
            return false;
        }
        dy dyVar = (dy) obj;
        return this.n.equals(dyVar.n) && this.o.equals(dyVar.o) && Objects.equals(this.q, dyVar.q) && this.r == dyVar.r && this.p.equals(dyVar.p);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.n, this.o, this.q, Integer.valueOf(this.r), this.p});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.n, 0);
        parcel.writeParcelable(this.o, 0);
        parcel.writeParcelable(this.q, 0);
        parcel.writeParcelable(this.p, 0);
        parcel.writeInt(this.r);
    }
}
