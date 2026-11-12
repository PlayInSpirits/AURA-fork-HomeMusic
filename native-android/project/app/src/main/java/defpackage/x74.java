package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class x74 extends k {
    public static final Parcelable.Creator<x74> CREATOR = null;
    public boolean p;

    static {
        CREATOR = new yd3(8);
    }

    public x74(Parcel r1, ClassLoader r2) {
        super(r1, r2);
        this.p = ((Boolean) r1.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.p + "}";
    }

    @Override // defpackage.k, android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        super.writeToParcel(r1, r2);
        r1.writeValue(Boolean.valueOf(this.p));
    }
}
