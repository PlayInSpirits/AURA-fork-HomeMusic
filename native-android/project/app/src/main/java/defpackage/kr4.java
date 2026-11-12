package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kr4 extends h2 {
    public static final Parcelable.Creator<kr4> CREATOR = new j84(11);
    public final int n;
    public List o;

    public kr4(List list, int i) {
        this.n = i;
        this.o = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iR0 = ud3.R0(parcel, 20293);
        ud3.T0(parcel, 1, 4);
        parcel.writeInt(this.n);
        ud3.Q0(parcel, 2, this.o);
        ud3.S0(parcel, iR0);
    }
}
