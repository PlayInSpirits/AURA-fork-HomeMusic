package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bf5 extends h2 implements t14 {
    public static final Parcelable.Creator<bf5> CREATOR = new j84(12);
    public final int n;
    public final int o;
    public final Intent p;

    public bf5(int i, int i2, Intent intent) {
        this.n = i;
        this.o = i2;
        this.p = intent;
    }

    @Override // defpackage.t14
    public final Status a() {
        return this.o == 0 ? Status.r : Status.v;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iR0 = ud3.R0(parcel, 20293);
        ud3.T0(parcel, 1, 4);
        parcel.writeInt(this.n);
        ud3.T0(parcel, 2, 4);
        parcel.writeInt(this.o);
        ud3.M0(parcel, 3, this.p, i);
        ud3.S0(parcel, iR0);
    }
}
