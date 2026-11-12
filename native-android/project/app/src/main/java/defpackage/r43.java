package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class r43 extends k {
    public static final Parcelable.Creator<r43> CREATOR = null;
    public Bundle p;

    static {
        CREATOR = new qh4(5);
    }

    public r43(Parcel r1, ClassLoader r2) {
        super(r1, r2);
        this.p = r1.readBundle(r2);
    }

    @Override // defpackage.k, android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        super.writeToParcel(r1, r2);
        r1.writeBundle(this.p);
    }
}
