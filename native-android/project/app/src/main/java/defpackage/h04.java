package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class h04 implements Parcelable {
    public static final Parcelable.Creator<h04> CREATOR = null;
    public final int n;

    static {
        CREATOR = new b23(28);
    }

    public h04(int r2) {
        if ((r2 & 2) == 0) goto L5;
        r2 = r2 | 1;
    L5:
        this.n = r2;
    }

    public final int a(Context r8) {
        int r7 = this.n;
        int r3 = 0;
        if ((r7 & 1) == 0) goto L22;
        Object r0 = r8.getSystemService("connectivity");
        r0.getClass();
        ConnectivityManager r1 = (ConnectivityManager) r0;
        NetworkInfo r4 = r1.getActiveNetworkInfo();
        if (r4 != null) goto L7;
    L20:
        r3 = r7 & 3;
        goto L22
    L7:
        if (r4.isConnected() == false) goto L20;
        Network r5 = r1.getActiveNetwork();
        if (r5 == null) goto L20;
        NetworkCapabilities r6 = r1.getNetworkCapabilities(r5);     // Catch: SecurityException -> L44
        if (r6 == null) goto L20;
        if (r6.hasCapability(16) == false) goto L20;
    L16:
        if ((r7 & 2) == 0) goto L22;
        if (r1.isActiveNetworkMetered() == false) goto L22;
        r3 = 2;
    L22:
        if ((r7 & 8) == 0) goto L33;
        Intent r2 = r8.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (r2 == null) goto L31;
        int r9 = r2.getIntExtra("status", -1);
        if (r9 == 2) goto L33;
        if (r9 == 5) goto L33;
    L31:
        r3 = r3 | 8;
    L33:
        if ((r7 & 4) == 0) goto L38;
        Object r10 = r8.getSystemService("power");
        r10.getClass();
        if (((PowerManager) r10).isDeviceIdleMode() == true) goto L38;
        r3 = r3 | 4;
    L38:
        if ((r7 & 16) != 0) goto L40;
        return r3;
    L40:
        if (r8.registerReceiver(null, new IntentFilter("android.intent.action.DEVICE_STORAGE_LOW")) != null) goto L43;
        return r3;
    L43:
        return r3 | 16;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L13:
        return false;
    L8:
        if (h04.class != r5.getClass()) goto L13;
        int r6 = ((h04) r5).n;
        if (this.n != r6) goto L13;
        return true;
    }

    public final int hashCode() {
        return this.n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        r1.writeInt(this.n);
    }
}
