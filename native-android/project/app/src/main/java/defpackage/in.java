package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class in extends h2 {
    public static final Parcelable.Creator<in> CREATOR = null;
    public final boolean n;

    static {
        CREATOR = new rh5(4);
    }

    public in(boolean r1) {
        this.n = r1;
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof in) == true) goto L6;
        return false;
    L6:
        if (this.n != ((in) r3).n) goto L9;
        return true;
    L9:
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.n)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        int r5 = ud3.R0(r3, 20293);
        ud3.T0(r3, 1, 4);
        r3.writeInt(this.n ? 1 : 0);
        ud3.S0(r3, r5);
    }
}
