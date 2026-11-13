package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class r43 extends k {
    public r43(android.os.Parcelable a0) {
        super(a0);
    }

    public static final Parcelable.Creator<r43> CREATOR = new qh4(5);
    public Bundle p;

    public r43(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.p = parcel.readBundle(classLoader);
    }

    @Override // defpackage.k, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeBundle(this.p);
    }
}
