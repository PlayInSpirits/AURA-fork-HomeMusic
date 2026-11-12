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
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ bg d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yf(bg bgVar, Context context) {
        super(bgVar);
        this.d = bgVar;
        this.e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // defpackage.b3
    public final IntentFilter e() {
        switch (this.c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    @Override // defpackage.b3
    public final int g() {
        Location location;
        boolean z;
        long j;
        Location lastKnownLocation;
        int i = this.c;
        Object obj = this.e;
        switch (i) {
            case 0:
                return tf.a((PowerManager) obj) ? 2 : 1;
            default:
                qp4 qp4Var = (qp4) obj;
                yn4 yn4Var = (yn4) qp4Var.c;
                LocationManager locationManager = (LocationManager) qp4Var.b;
                if (yn4Var.b <= System.currentTimeMillis()) {
                    Context context = (Context) qp4Var.a;
                    Location lastKnownLocation2 = null;
                    if (si0.l(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        try {
                            lastKnownLocation = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
                        } catch (Exception e) {
                            Log.d("TwilightManager", "Failed to get last known location", e);
                        }
                        location = lastKnownLocation;
                    } else {
                        location = null;
                    }
                    if (si0.l(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                lastKnownLocation2 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e2) {
                            Log.d("TwilightManager", "Failed to get last known location", e2);
                        }
                    }
                    if (lastKnownLocation2 == null || location == null ? lastKnownLocation2 != null : lastKnownLocation2.getTime() > location.getTime()) {
                        location = lastKnownLocation2;
                    }
                    z = false;
                    if (location != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (os.f == null) {
                            os.f = new os();
                        }
                        os osVar = os.f;
                        osVar.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis - 86400000);
                        osVar.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis);
                        z = osVar.d == 1;
                        long j2 = osVar.c;
                        long j3 = osVar.b;
                        osVar.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis + 86400000);
                        long j4 = osVar.c;
                        if (j2 == -1 || j3 == -1) {
                            j = jCurrentTimeMillis + 43200000;
                        } else {
                            if (jCurrentTimeMillis > j3) {
                                j2 = j4;
                            } else if (jCurrentTimeMillis > j2) {
                                j2 = j3;
                            }
                            j = j2 + 60000;
                        }
                        yn4Var.a = z;
                        yn4Var.b = j;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i2 = Calendar.getInstance().get(11);
                        if (i2 < 6 || i2 >= 22) {
                            z = true;
                        }
                    }
                    break;
                } else {
                    z = yn4Var.a;
                }
                return z ? 2 : 1;
        }
    }

    @Override // defpackage.b3
    public final void l() {
        int i = this.c;
        bg bgVar = this.d;
        switch (i) {
            case 0:
                bgVar.r(true, true);
                break;
            default:
                bgVar.r(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yf(bg bgVar, qp4 qp4Var) {
        super(bgVar);
        this.d = bgVar;
        this.e = qp4Var;
    }
}
