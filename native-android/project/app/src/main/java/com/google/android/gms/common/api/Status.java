package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.eddyizm.tempus.homemusic.WaveRetry;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.au0;
import defpackage.ch5;
import defpackage.f34;
import defpackage.h2;
import defpackage.ka0;
import defpackage.qr2;
import defpackage.t14;
import defpackage.ud3;
import java.util.Arrays;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class Status extends h2 implements t14, ReflectedParcelable {
    public final int n;
    public final String o;
    public final PendingIntent p;
    public final ka0 q;
    public static final Status r = new Status(0, null, null, null);
    public static final Status s = new Status(14, null, null, null);
    public static final Status t = new Status(8, null, null, null);
    public static final Status u = new Status(15, null, null, null);
    public static final Status v = new Status(16, null, null, null);
    public static final Parcelable.Creator<Status> CREATOR = new ch5(24);

    public Status(int i, String str, PendingIntent pendingIntent, ka0 ka0Var) {
        this.n = i;
        this.o = str;
        this.p = pendingIntent;
        this.q = ka0Var;
    }

    @Override // defpackage.t14
    public final Status a() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.n == status.n && au0.n(this.o, status.o) && au0.n(this.p, status.p) && au0.n(this.q, status.q);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.n), this.o, this.p, this.q});
    }

    public final String toString() {
        qr2 qr2Var = new qr2(this);
        String strF = this.o;
        if (strF == null) {
            int i = this.n;
            switch (i) {
                case -1:
                    strF = "SUCCESS_CACHE";
                    break;
                case 0:
                    strF = "SUCCESS";
                    break;
                case 1:
                case 9:
                case 11:
                case 12:
                default:
                    strF = f34.f(i, "unknown status code: ");
                    break;
                case 2:
                    strF = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                    strF = "SERVICE_DISABLED";
                    break;
                case 4:
                    strF = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    strF = "INVALID_ACCOUNT";
                    break;
                case 6:
                    strF = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    strF = "NETWORK_ERROR";
                    break;
                case 8:
                    strF = "INTERNAL_ERROR";
                    break;
                case 10:
                    strF = "DEVELOPER_ERROR";
                    break;
                case 13:
                    strF = "ERROR";
                    break;
                case 14:
                    strF = "INTERRUPTED";
                    break;
                case 15:
                    strF = "TIMEOUT";
                    break;
                case WaveRetry.MAX_FAILURES /* 16 */:
                    strF = "CANCELED";
                    break;
                case 17:
                    strF = "API_NOT_CONNECTED";
                    break;
                case 18:
                    strF = "DEAD_CLIENT";
                    break;
                case 19:
                    strF = "REMOTE_EXCEPTION";
                    break;
                case 20:
                    strF = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case 21:
                    strF = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    strF = "RECONNECTION_TIMED_OUT";
                    break;
            }
        }
        qr2Var.c(strF, "statusCode");
        qr2Var.c(this.p, "resolution");
        return qr2Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iR0 = ud3.R0(parcel, 20293);
        ud3.T0(parcel, 1, 4);
        parcel.writeInt(this.n);
        ud3.O0(parcel, 2, this.o);
        ud3.M0(parcel, 3, this.p, i);
        ud3.M0(parcel, 4, this.q, i);
        ud3.S0(parcel, iR0);
    }
}
