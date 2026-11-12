package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vd4 extends h2 {
    public static final Parcelable.Creator<vd4> CREATOR = null;
    public final String n;
    public final String o;

    static {
        CREATOR = new ch5(2);
    }

    public vd4(String r2, String r3) {
        ji2.n(r2, "Account identifier cannot be null");
        String r4 = r2.trim();
        ji2.l(r4, "Account identifier cannot be empty");
        this.n = r4;
        ji2.k(r3);
        this.o = r3;
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof vd4) == true) goto L5;
        return false;
    L5:
        vd4 r5 = (vd4) r4;
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
    public final void writeToParcel(Parcel r3, int r4) {
        int r5 = ud3.R0(r3, 20293);
        ud3.O0(r3, 1, this.n);
        ud3.O0(r3, 2, this.o);
        ud3.S0(r3, r5);
    }
}
