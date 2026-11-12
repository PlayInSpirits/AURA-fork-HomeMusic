package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ze4 implements Parcelable {
    public static final Parcelable.Creator<ze4> CREATOR = null;
    public Long n;

    static {
        CREATOR = new j84(4);
    }

    public final ArrayList a() {
        ArrayList r0 = new ArrayList();
        Long r1 = this.n;
        if (r1 == null) goto L5;
        r0.add(r1);
    L5:
        return r0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        r1.writeValue(this.n);
    }
}
