package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class hs4 extends k {
    public hs4(android.os.Parcelable a0) {
        super(a0);
    }

    public static final Parcelable.Creator<hs4> CREATOR = new yd3(9);
    public CharSequence p;
    public boolean q;

    public hs4(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.p = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.q = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.p) + "}";
    }

    @Override // defpackage.k, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.p, parcel, i);
        parcel.writeInt(this.q ? 1 : 0);
    }
}
