package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
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

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class Status extends h2 implements t14, ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = null;
    public static final Status r = null;
    public static final Status s = null;
    public static final Status t = null;
    public static final Status u = null;
    public static final Status v = null;
    public final int n;
    public final String o;
    public final PendingIntent p;
    public final ka0 q;

    static {
        r = new Status(0, null, null, null);
        s = new Status(14, null, null, null);
        t = new Status(8, null, null, null);
        u = new Status(15, null, null, null);
        v = new Status(16, null, null, null);
        CREATOR = new ch5(24);
    }

    public Status(int r1, String r2, PendingIntent r3, ka0 r4) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
        this.q = r4;
    }

    @Override // defpackage.t14
    public final Status a() {
        return this;
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof Status) == true) goto L5;
        return false;
    L5:
        Status r5 = (Status) r4;
        if (this.n == r5.n) goto L8;
    L15:
        return false;
    L8:
        if (au0.n(this.o, r5.o) == false) goto L15;
        if (au0.n(this.p, r5.p) == false) goto L15;
        if (au0.n(this.q, r5.q) == false) goto L15;
        return true;
    }

    public final int hashCode() {
        Integer r0 = Integer.valueOf(this.n);
        PendingIntent r1 = this.p;
        ka0 r2 = this.q;
        return Arrays.hashCode(new Object[]{r0, this.o, r1, r2});
    }

    public final String toString() {
        qr2 r0 = new qr2(this);
        String r1 = this.o;
        if (r1 != null) goto L28;
        int r2 = this.n;
        switch(r2) {
            case -1: goto L27;
            case 0: goto L26;
            case 1: goto L7;
            case 2: goto L25;
            case 3: goto L24;
            case 4: goto L23;
            case 5: goto L22;
            case 6: goto L21;
            case 7: goto L20;
            case 8: goto L19;
            case 9: goto L7;
            case 10: goto L18;
            case 11: goto L7;
            case 12: goto L7;
            case 13: goto L17;
            case 14: goto L16;
            case 15: goto L15;
            case 16: goto L14;
            case 17: goto L13;
            case 18: goto L12;
            case 19: goto L11;
            case 20: goto L10;
            case 21: goto L9;
            case 22: goto L8;
            default: goto L7;
        };
    L7:
        r1 = f34.f(r2, "unknown status code: ");
        goto L28
    L8:
        r1 = "RECONNECTION_TIMED_OUT";
        goto L28
    L9:
        r1 = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
        goto L28
    L10:
        r1 = "CONNECTION_SUSPENDED_DURING_CALL";
        goto L28
    L11:
        r1 = "REMOTE_EXCEPTION";
        goto L28
    L12:
        r1 = "DEAD_CLIENT";
        goto L28
    L13:
        r1 = "API_NOT_CONNECTED";
        goto L28
    L14:
        r1 = "CANCELED";
        goto L28
    L15:
        r1 = "TIMEOUT";
        goto L28
    L16:
        r1 = "INTERRUPTED";
        goto L28
    L17:
        r1 = "ERROR";
        goto L28
    L18:
        r1 = "DEVELOPER_ERROR";
        goto L28
    L19:
        r1 = "INTERNAL_ERROR";
        goto L28
    L20:
        r1 = "NETWORK_ERROR";
        goto L28
    L21:
        r1 = "RESOLUTION_REQUIRED";
        goto L28
    L22:
        r1 = "INVALID_ACCOUNT";
        goto L28
    L23:
        r1 = "SIGN_IN_REQUIRED";
        goto L28
    L24:
        r1 = "SERVICE_DISABLED";
        goto L28
    L25:
        r1 = "SERVICE_VERSION_UPDATE_REQUIRED";
        goto L28
    L26:
        r1 = "SUCCESS";
        goto L28
    L27:
        r1 = "SUCCESS_CACHE";
    L28:
        r0.c(r1, "statusCode");
        r0.c(this.p, "resolution");
        return r0.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r5, int r6) {
        int r0 = ud3.R0(r5, 20293);
        ud3.T0(r5, 1, 4);
        r5.writeInt(this.n);
        ud3.O0(r5, 2, this.o);
        ud3.M0(r5, 3, this.p, r6);
        ud3.M0(r5, 4, this.q, r6);
        ud3.S0(r5, r0);
    }
}
