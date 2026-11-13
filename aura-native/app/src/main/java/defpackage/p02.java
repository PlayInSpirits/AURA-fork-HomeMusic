package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class p02 implements Parcelable {
    public static final Parcelable.Creator<p02> CREATOR = new hz0(10);
    public final IntentSender n;
    public final Intent o;
    public final int p;
    public final int q;

    public p02(IntentSender intentSender, Intent intent, int i, int i2) {
        this.n = intentSender;
        this.o = intent;
        this.p = i;
        this.q = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.n, i);
        parcel.writeParcelable(this.o, i);
        parcel.writeInt(this.p);
        parcel.writeInt(this.q);
    }
}
