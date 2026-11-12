package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.ErrorCode$UnsupportedErrorCodeException;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum c21 extends Enum implements Parcelable {
    public static final /* synthetic */ c21[] A = null;
    public static final Parcelable.Creator<c21> CREATOR = null;
    public static final c21 o = null;
    public static final c21 p = null;
    public static final c21 q = null;
    public static final c21 r = null;
    public static final c21 s = null;
    public static final c21 t = null;
    public static final c21 u = null;
    public static final c21 v = null;
    public static final c21 w = null;
    public static final c21 x = null;
    public static final c21 y = null;
    public static final c21 z = null;
    public final int n;

    static {
        c21 r0 = new c21("NOT_SUPPORTED_ERR", 0, 9);
        o = r0;
        c21 r1 = new c21("INVALID_STATE_ERR", 1, 11);
        p = r1;
        c21 r2 = new c21("SECURITY_ERR", 2, 18);
        q = r2;
        c21 r3 = new c21("NETWORK_ERR", 3, 19);
        r = r3;
        c21 r4 = new c21("ABORT_ERR", 4, 20);
        s = r4;
        c21 r5 = new c21("TIMEOUT_ERR", 5, 23);
        t = r5;
        c21 r6 = new c21("ENCODING_ERR", 6, 27);
        u = r6;
        c21 r7 = new c21("UNKNOWN_ERR", 7, 28);
        v = r7;
        c21 r8 = new c21("CONSTRAINT_ERR", 8, 29);
        w = r8;
        c21 r9 = new c21("DATA_ERR", 9, 30);
        x = r9;
        c21 r10 = new c21("NOT_ALLOWED_ERR", 10, 35);
        y = r10;
        c21 r11 = new c21("ATTESTATION_NOT_PRIVATE_ERR", 11, 36);
        z = r11;
        A = new c21[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11};
        CREATOR = new rh5(18);
    }

    public c21(String r1, int r2, int r3) {
        super(r1, r2);
        this.n = r3;
    }

    public static c21 a(int r5) {
        c21[] r0 = values();
        int r1 = r0.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L8;
        c21 r3 = r0[r2];
        if (r5 == r3.n) goto L6;
        r2 = r2 + 1;
        goto L3
    L6:
        return r3;
    L8:
        Locale r4 = Locale.US;
        throw new ErrorCode$UnsupportedErrorCodeException(b11.j(r5, "Error code ", " is not supported"));
    }

    public static c21 valueOf(String r1) {
        return (c21) Enum.valueOf(c21.class, r1);
    }

    public static c21[] values() {
        return (c21[]) A.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        r1.writeInt(this.n);
    }
}
