package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ka0 extends h2 {
    public static final Parcelable.Creator<ka0> CREATOR = null;
    public static final ka0 r = null;
    public final int n;
    public final int o;
    public final PendingIntent p;
    public final String q;

    static {
        r = new ka0(0);
        CREATOR = new ch5(26);
    }

    public ka0(int r1, int r2, PendingIntent r3, String r4) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
        this.q = r4;
    }

    public static String b(int r2) {
        if (r2 != 99) goto L5;
        return "UNFINISHED";
    L5:
        if (r2 == 1500) goto L60;
        switch(r2) {
            case -1: goto L58;
            case 0: goto L56;
            case 1: goto L54;
            case 2: goto L52;
            case 3: goto L50;
            case 4: goto L48;
            case 5: goto L46;
            case 6: goto L44;
            case 7: goto L42;
            case 8: goto L40;
            case 9: goto L38;
            case 10: goto L36;
            case 11: goto L34;
            default: goto L7;
        };
    L7:
        switch(r2) {
            case 13: goto L32;
            case 14: goto L30;
            case 15: goto L28;
            case 16: goto L26;
            case 17: goto L24;
            case 18: goto L22;
            case 19: goto L20;
            case 20: goto L18;
            case 21: goto L16;
            case 22: goto L14;
            case 23: goto L12;
            case 24: goto L10;
            default: goto L9;
        };
    L10:
        return "API_DISABLED_FOR_CONNECTION";
    L12:
        return "API_DISABLED";
    L14:
        return "RESOLUTION_ACTIVITY_NOT_FOUND";
    L16:
        return "API_VERSION_UPDATE_REQUIRED";
    L18:
        return "RESTRICTED_PROFILE";
    L20:
        return "SERVICE_MISSING_PERMISSION";
    L22:
        return "SERVICE_UPDATING";
    L24:
        return "SIGN_IN_FAILED";
    L26:
        return "API_UNAVAILABLE";
    L28:
        return "INTERRUPTED";
    L30:
        return "TIMEOUT";
    L32:
        return "CANCELED";
    L9:
        return b11.j(r2, "UNKNOWN_ERROR_CODE(", ")");
    L34:
        return "LICENSE_CHECK_FAILED";
    L36:
        return "DEVELOPER_ERROR";
    L38:
        return "SERVICE_INVALID";
    L40:
        return "INTERNAL_ERROR";
    L42:
        return "NETWORK_ERROR";
    L44:
        return "RESOLUTION_REQUIRED";
    L46:
        return "INVALID_ACCOUNT";
    L48:
        return "SIGN_IN_REQUIRED";
    L50:
        return "SERVICE_DISABLED";
    L52:
        return "SERVICE_VERSION_UPDATE_REQUIRED";
    L54:
        return "SERVICE_MISSING";
    L56:
        return "SUCCESS";
    L58:
        return "UNKNOWN";
    L60:
        return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
    }

    public final boolean equals(Object r5) {
        if (r5 != this) goto L6;
        return true;
    L6:
        if ((r5 instanceof ka0) == true) goto L8;
        return false;
    L8:
        ka0 r6 = (ka0) r5;
        if (this.o == r6.o) goto L11;
    L15:
        return false;
    L11:
        if (au0.n(this.p, r6.p) == false) goto L15;
        if (au0.n(this.q, r6.q) == false) goto L15;
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.o), this.p, this.q});
    }

    public final String toString() {
        qr2 r0 = new qr2(this);
        r0.c(b(this.o), "statusCode");
        r0.c(this.p, "resolution");
        r0.c(this.q, "message");
        return r0.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r5, int r6) {
        int r0 = ud3.R0(r5, 20293);
        ud3.T0(r5, 1, 4);
        r5.writeInt(this.n);
        ud3.T0(r5, 2, 4);
        r5.writeInt(this.o);
        ud3.M0(r5, 3, this.p, r6);
        ud3.O0(r5, 4, this.q);
        ud3.S0(r5, r0);
    }

    public ka0(int r3) {
        this(1, r3, null, null);
    }

    public ka0(int r3, PendingIntent r4) {
        this(1, r3, r4, null);
    }
}
