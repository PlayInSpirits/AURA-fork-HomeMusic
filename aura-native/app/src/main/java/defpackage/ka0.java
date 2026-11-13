package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.eddyizm.tempus.homemusic.WaveRetry;
import java.util.Arrays;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ka0 extends h2 {
    public final int n;
    public final int o;
    public final PendingIntent p;
    public final String q;
    public static final ka0 r = new ka0(0);
    public static final Parcelable.Creator<ka0> CREATOR = new ch5(26);

    public ka0(int i, int i2, PendingIntent pendingIntent, String str) {
        this.n = i;
        this.o = i2;
        this.p = pendingIntent;
        this.q = str;
    }

    public static String b(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case WaveRetry.MAX_FAILURES /* 16 */:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return b11.j(i, "UNKNOWN_ERROR_CODE(", ")");
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ka0)) {
            return false;
        }
        ka0 ka0Var = (ka0) obj;
        return this.o == ka0Var.o && au0.n(this.p, ka0Var.p) && au0.n(this.q, ka0Var.q);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.o), this.p, this.q});
    }

    public final String toString() {
        qr2 qr2Var = new qr2(this);
        qr2Var.c(b(this.o), "statusCode");
        qr2Var.c(this.p, "resolution");
        qr2Var.c(this.q, "message");
        return qr2Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int R0 = ud3.R0(parcel, 20293);
        ud3.T0(parcel, 1, 4);
        parcel.writeInt(this.n);
        ud3.T0(parcel, 2, 4);
        parcel.writeInt(this.o);
        ud3.M0(parcel, 3, this.p, i);
        ud3.O0(parcel, 4, this.q);
        ud3.S0(parcel, R0);
    }

    public ka0(int i) {
        this(1, i, null, null);
    }

    public ka0(int i, PendingIntent pendingIntent) {
        this(1, i, pendingIntent, null);
    }
}
