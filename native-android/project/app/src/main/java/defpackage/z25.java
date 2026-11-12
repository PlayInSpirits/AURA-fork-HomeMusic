package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.zzbc;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum z25 extends Enum implements Parcelable {
    public static final Parcelable.Creator<z25> CREATOR = null;
    public static final /* synthetic */ z25[] o = null;
    public final String n;

    static {
        o = new z25[]{new z25(0, "USER_VERIFICATION_REQUIRED", "required"), new z25(1, "USER_VERIFICATION_PREFERRED", "preferred"), new z25(2, "USER_VERIFICATION_DISCOURAGED", "discouraged")};
        CREATOR = new ch5(28);
    }

    public z25(int r1, String r2, String r3) {
        super(r2, r1);
        this.n = r3;
    }

    public static z25 a(String r5) {
        z25[] r0 = values();
        int r1 = r0.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L9;
        z25 r3 = r0[r2];
        if (r5.equals(r3.n) == true) goto L6;
        r2 = r2 + 1;
        goto L3
    L6:
        return r3;
    L9:
        throw new zzbc(xa3.h("User verification requirement ", r5, " not supported"));
    }

    public static z25[] values() {
        return (z25[]) o.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        r1.writeString(this.n);
    }
}
