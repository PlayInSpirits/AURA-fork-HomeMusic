package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class b51 extends k {
    public static final Parcelable.Creator<b51> CREATOR = new qh4(3);
    public final yd4 p;

    public b51(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.p = new yd4(readInt);
        for (int i = 0; i < readInt; i++) {
            this.p.put(strArr[i], bundleArr[i]);
        }
    }

    public final String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.p + "}";
    }

    @Override // defpackage.k, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        yd4 yd4Var = this.p;
        int i2 = yd4Var.p;
        parcel.writeInt(i2);
        String[] strArr = new String[i2];
        Bundle[] bundleArr = new Bundle[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = (String) yd4Var.f(i3);
            bundleArr[i3] = (Bundle) yd4Var.j(i3);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public b51(Parcelable parcelable) {
        super(parcelable);
        this.p = new yd4(0);
    }
}
