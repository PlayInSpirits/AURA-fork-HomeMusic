package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class h35 extends h2 {
    public static final Parcelable.Creator<h35> CREATOR = new rh5(0);
    public final int n;
    public final short o;
    public final short p;

    public h35(int i, short s, short s2) {
        this.n = i;
        this.o = s;
        this.p = s2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h35)) {
            return false;
        }
        h35 h35Var = (h35) obj;
        return this.n == h35Var.n && this.o == h35Var.o && this.p == h35Var.p;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.n), Short.valueOf(this.o), Short.valueOf(this.p)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int R0 = ud3.R0(parcel, 20293);
        ud3.T0(parcel, 1, 4);
        parcel.writeInt(this.n);
        ud3.T0(parcel, 2, 4);
        parcel.writeInt(this.o);
        ud3.T0(parcel, 3, 4);
        parcel.writeInt(this.p);
        ud3.S0(parcel, R0);
    }
}
