package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class vw3 extends k {
    public vw3(android.os.Parcelable a0) {
        super(a0);
    }

    public static final Parcelable.Creator<vw3> CREATOR = new qh4(6);
    public Parcelable p;

    public vw3(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.p = parcel.readParcelable(classLoader == null ? mw3.class.getClassLoader() : classLoader);
    }

    @Override // defpackage.k, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.p, 0);
    }
}
