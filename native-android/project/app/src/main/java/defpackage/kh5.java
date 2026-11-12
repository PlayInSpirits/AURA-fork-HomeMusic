package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kh5 extends h2 {
    public static final Parcelable.Creator<kh5> CREATOR = null;
    public final String n;

    static {
        CREATOR = new ch5(9);
    }

    public kh5(String r1) {
        ji2.m(r1);
        this.n = r1;
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof kh5) == true) goto L7;
        return false;
    L7:
        return this.n.equals(((kh5) r2).n);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.n});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r2, int r3) {
        int r4 = ud3.R0(r2, 20293);
        ud3.O0(r2, 1, this.n);
        ud3.S0(r2, r4);
    }
}
