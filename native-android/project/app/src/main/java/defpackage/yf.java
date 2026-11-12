package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yf extends b3 {
    public final /* synthetic */ int c;
    public final /* synthetic */ bg d;
    public final Object e;

    public yf(bg r2, Context r3) {
        this.c = 0;
        this.d = r2;
        super(r2);
        this.e = (PowerManager) r3.getApplicationContext().getSystemService("power");
    }

    @Override // defpackage.b3
    public final IntentFilter e() {
        switch(this.c) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        IntentFilter r1 = new IntentFilter();
        r1.addAction("android.intent.action.TIME_SET");
        r1.addAction("android.intent.action.TIMEZONE_CHANGED");
        r1.addAction("android.intent.action.TIME_TICK");
        return r1;
    L6:
        IntentFilter r2 = new IntentFilter();
        r2.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        return r2;
    }

    @Override // defpackage.b3
    public final int g() {
        int r1 = this.c;
        Object r0 = this.e;
        switch(r1) {
            case 0: goto L67;
            default: goto L4;
        };
    L4:
        qp4 r2 = (qp4) r0;
        yn4 r3 = (yn4) r2.c;
        LocationManager r4 = (LocationManager) r2.b;
        if (r3.b <= System.currentTimeMillis()) goto L7;
        boolean r5 = r3.a;
    L62:
        if (r5 == false) goto L65;
        return 2;
    L65:
        return 1;
    L7:
        Context r6 = (Context) r2.a;
        Location r8 = null;
        if (si0.l(r6, "android.permission.ACCESS_COARSE_LOCATION") == 0) goto L73;
        Location r9 = null;
    L20:
        if (si0.l(r6, "android.permission.ACCESS_FINE_LOCATION") == 0) goto L71;
    L28:
        if (r8 == null) goto L33;
        if (r9 == null) goto L33;
        if (r8.getTime() <= r9.getTime()) goto L35;
    L32:
        r9 = r8;
    L35:
        r5 = false;
        if (r9 == null) goto L57;
        long r15 = System.currentTimeMillis();
        if (os.f != null) goto L40;
        os.f = new os();
    L40:
        os r17 = os.f;
        r17.a(r9.getLatitude(), r9.getLongitude(), r15 - 86400000);
        r17.a(r9.getLatitude(), r9.getLongitude(), r15);
        if (r17.d != 1) goto L43;
        r5 = true;
    L43:
        long r7 = r17.c;
        long r11 = r17.b;
        r17.a(r9.getLatitude(), r9.getLongitude(), r15 + 86400000);
        long r10 = r17.c;
        if (r7 != (-1)) goto L46;
    L55:
        long r12 = r15 + 43200000;
    L56:
        r3.a = r5;
        r3.b = r12;
        goto L62
    L46:
        if (r11 == (-1)) goto L55;
        if (r15 <= r11) goto L52;
        r7 = r10;
    L54:
        r12 = r7 + 60000;
        goto L56
    L52:
        if (r15 <= r7) goto L54;
        r7 = r11;
        goto L54
    L57:
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int r13 = Calendar.getInstance().get(11);
        if (r13 >= 6) goto L60;
    L61:
        r5 = true;
        goto L62
    L60:
        if (r13 < 22) goto L62;
    L33:
        if (r8 == null) goto L35;
    L71:
    L26:
        e = move-exception;
        Log.d("TwilightManager", "Failed to get last known location", e);
        goto L28
    L23:
        if (r4.isProviderEnabled("gps") == false) goto L28;
        r8 = r4.getLastKnownLocation("gps");     // Catch: Exception -> L26
        goto L28
    L73:
    L14:
        e = move-exception;
        Log.d("TwilightManager", "Failed to get last known location", e);
    L16:
        Location r14 = null;
    L17:
        r9 = r14;
        goto L20
    L11:
        if (r4.isProviderEnabled("network") == false) goto L16;
        r14 = r4.getLastKnownLocation("network");     // Catch: Exception -> L14
        goto L17
    L67:
        if (tf.a((PowerManager) r0) == false) goto L70;
        return 2;
    L70:
        return 1;
    }

    @Override // defpackage.b3
    public final void l() {
        int r0 = this.c;
        bg r2 = this.d;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        r2.r(true, true);
        return;
    L6:
        r2.r(true, true);
    }

    public yf(bg r2, qp4 r3) {
        this.c = 1;
        this.d = r2;
        super(r2);
        this.e = r3;
    }
}
