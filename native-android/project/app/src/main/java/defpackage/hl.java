package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference$UnsupportedAttestationConveyancePreferenceException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum hl extends Enum implements Parcelable {
    public static final Parcelable.Creator<hl> CREATOR = null;
    public static final hl o = null;
    public static final /* synthetic */ hl[] p = null;
    public final String n;

    static {
        hl r0 = new hl(0, "NONE", "none");
        o = r0;
        p = new hl[]{r0, new hl(1, "INDIRECT", "indirect"), new hl(2, "DIRECT", "direct")};
        CREATOR = new ch5(25);
    }

    public hl(int r1, String r2, String r3) {
        super(r2, r1);
        this.n = r3;
    }

    public static hl a(String r5) {
        hl[] r0 = values();
        int r1 = r0.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L9;
        hl r3 = r0[r2];
        if (r5.equals(r3.n) == true) goto L6;
        r2 = r2 + 1;
        goto L3
    L6:
        return r3;
    L9:
        throw new AttestationConveyancePreference$UnsupportedAttestationConveyancePreferenceException(xa3.h("Attestation conveyance preference ", r5, " not supported"));
    }

    public static hl valueOf(String r1) {
        return (hl) Enum.valueOf(hl.class, r1);
    }

    public static hl[] values() {
        return (hl[]) p.clone();
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
