package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hs4 extends k {
    public static final Parcelable.Creator<hs4> CREATOR = null;
    public CharSequence p;
    public boolean q;

    static {
        CREATOR = new yd3(9);
    }

    public hs4(Parcel r1, ClassLoader r2) {
        super(r1, r2);
        this.p = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(r1);
        boolean r3 = true;
        if (r1.readInt() == 1) goto L6;
        r3 = false;
    L6:
        this.q = r3;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + this.p + "}";
    }

    @Override // defpackage.k, android.os.Parcelable
    public final void writeToParcel(Parcel r2, int r3) {
        super.writeToParcel(r2, r3);
        TextUtils.writeToParcel(this.p, r2, r3);
        r2.writeInt(this.q ? 1 : 0);
    }
}
