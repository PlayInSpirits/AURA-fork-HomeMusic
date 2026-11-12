package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hf3 extends h2 {
    public static final Parcelable.Creator<hf3> CREATOR = new b23(9);
    public final PendingIntent n;

    public hf3(PendingIntent pendingIntent) {
        pendingIntent.getClass();
        this.n = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int iR0 = ud3.R0(parcel, 20293);
        ud3.M0(parcel, 1, this.n, i);
        ud3.S0(parcel, iR0);
    }
}
