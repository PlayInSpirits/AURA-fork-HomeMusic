package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class x74 extends k {
    public x74(android.os.Parcelable a0) {
        super(a0);
    }

    public static final Parcelable.Creator<x74> CREATOR = new yd3(8);
    public boolean p;

    public x74(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.p = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.p + "}";
    }

    @Override // defpackage.k, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Boolean.valueOf(this.p));
    }
}
