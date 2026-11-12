package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rk5 extends h2 {
    public static final Parcelable.Creator<rk5> CREATOR = null;
    public final List n;

    static {
        CREATOR = new rh5(16);
    }

    public rk5(ArrayList r1) {
        ji2.m(r1);
        this.n = r1;
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof rk5) == true) goto L5;
        return false;
    L5:
        List r4 = ((rk5) r3).n;
        List r2 = this.n;
        if (r2.containsAll(r4) == true) goto L8;
    L11:
        return false;
    L8:
        if (r4.containsAll(r2) == false) goto L11;
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.n)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r2, int r3) {
        int r4 = ud3.R0(r2, 20293);
        ud3.Q0(r2, 1, this.n);
        ud3.S0(r2, r4);
    }
}
