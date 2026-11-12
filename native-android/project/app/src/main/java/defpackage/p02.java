package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class p02 implements Parcelable {
    public static final Parcelable.Creator<p02> CREATOR = null;
    public final IntentSender n;
    public final Intent o;
    public final int p;
    public final int q;

    static {
        CREATOR = new hz0(10);
    }

    public p02(IntentSender r1, Intent r2, int r3, int r4) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
        this.q = r4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r2, int r3) {
        r2.getClass();
        r2.writeParcelable(this.n, r3);
        r2.writeParcelable(this.o, r3);
        r2.writeInt(this.p);
        r2.writeInt(this.q);
    }
}
