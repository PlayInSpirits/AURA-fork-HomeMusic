package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement$UnsupportedResidentKeyRequirementException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum l04 extends Enum implements Parcelable {
    public static final Parcelable.Creator<l04> CREATOR = null;
    public static final l04 o = null;
    public static final /* synthetic */ l04[] p = null;
    public final String n;

    static {
        l04 r0 = new l04(0, "RESIDENT_KEY_DISCOURAGED", "discouraged");
        l04 r1 = new l04(1, "RESIDENT_KEY_PREFERRED", "preferred");
        l04 r2 = new l04(2, "RESIDENT_KEY_REQUIRED", "required");
        o = r2;
        p = new l04[]{r0, r1, r2};
        CREATOR = new ch5(20);
    }

    public l04(int r1, String r2, String r3) {
        super(r2, r1);
        this.n = r3;
    }

    public static l04 a(String r5) {
        l04[] r0 = values();
        int r1 = r0.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L9;
        l04 r3 = r0[r2];
        if (r5.equals(r3.n) == true) goto L6;
        r2 = r2 + 1;
        goto L3
    L6:
        return r3;
    L9:
        throw new ResidentKeyRequirement$UnsupportedResidentKeyRequirementException(xa3.h("Resident key requirement ", r5, " not supported"));
    }

    public static l04 valueOf(String r1) {
        return (l04) Enum.valueOf(l04.class, r1);
    }

    public static l04[] values() {
        return (l04[]) p.clone();
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
