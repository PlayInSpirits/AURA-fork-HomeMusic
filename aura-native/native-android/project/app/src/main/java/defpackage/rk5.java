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
    public static final Parcelable.Creator<rk5> CREATOR = new rh5(16);
    public final List n;

    public rk5(ArrayList arrayList) {
        ji2.m(arrayList);
        this.n = arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rk5)) {
            return false;
        }
        List list = ((rk5) obj).n;
        List list2 = this.n;
        return list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.n)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iR0 = ud3.R0(parcel, 20293);
        ud3.Q0(parcel, 1, this.n);
        ud3.S0(parcel, iR0);
    }
}
