package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class b51 extends k {
    public static final Parcelable.Creator<b51> CREATOR = null;
    public final yd4 p;

    static {
        CREATOR = new qh4(3);
    }

    public b51(Parcel r6, ClassLoader r7) {
        super(r6, r7);
        int r8 = r6.readInt();
        String[] r0 = new String[r8];
        r6.readStringArray(r0);
        Bundle[] r1 = new Bundle[r8];
        r6.readTypedArray(r1, Bundle.CREATOR);
        this.p = new yd4(r8);
        int r9 = 0;
    L3:
        if (r9 >= r8) goto L5;
        this.p.put(r0[r9], r1[r9]);
        r9 = r9 + 1;
        goto L3
    }

    public final String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.p + "}";
    }

    @Override // defpackage.k, android.os.Parcelable
    public final void writeToParcel(Parcel r6, int r7) {
        super.writeToParcel(r6, r7);
        yd4 r5 = this.p;
        int r8 = r5.p;
        r6.writeInt(r8);
        String[] r0 = new String[r8];
        Bundle[] r1 = new Bundle[r8];
        int r3 = 0;
    L3:
        if (r3 >= r8) goto L5;
        r0[r3] = (String) r5.f(r3);
        r1[r3] = (Bundle) r5.j(r3);
        r3 = r3 + 1;
        goto L3
    L5:
        r6.writeStringArray(r0);
        r6.writeTypedArray(r1, 0);
    }

    public b51(Parcelable r2) {
        super(r2);
        this.p = new yd4(0);
    }
}
