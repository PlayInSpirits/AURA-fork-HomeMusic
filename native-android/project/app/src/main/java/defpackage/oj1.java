package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class oj1 implements zj2 {
    public static oj1 o;
    public final Context n;

    public oj1(Context r1, int r2) {
        switch(r2) {
            case 1: goto L5;
            default: goto L3;
        };
    L3:
        this.n = r1.getApplicationContext();
        return;
    L5:
        this.n = r1;
    }

    public static oj1 b(Context r4) {
        ji2.m(r4);
        monitor-enter(oj1.class);
    L19:
        th = move-exception;
        throw th;
    L5:
        if (o != null) goto L23;
        aj5 r1 = mk5.a;     // Catch: Throwable -> L19
        monitor-enter(mk5.class);     // Catch: Throwable -> L19
    L13:
        th = move-exception;
        throw th;     // Catch: Throwable -> L19
    L9:
        if (mk5.c != null) goto L15;
        mk5.c = r4.getApplicationContext();     // Catch: Throwable -> L13
        monitor-exit(mk5.class);     // Catch: Throwable -> L19
    L17:
        o = new oj1(r4, 0);     // Catch: Throwable -> L19
        goto L23
    L15:
        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");     // Catch: Throwable -> L13
        monitor-exit(mk5.class);     // Catch: Throwable -> L19
    L23:
        monitor-exit(oj1.class);     // Catch: Throwable -> L19
        return o;
    }

    public static final ik5 c(PackageInfo r3, ik5... r4) {
        Signature[] r0 = r3.signatures;
        if (r0 != null) goto L6;
    L17:
        return null;
    L6:
        if (r0.length == 1) goto L9;
        Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
        return null;
    L9:
        int r2 = 0;
        kk5 r1 = new kk5(r3.signatures[0].toByteArray());
    L11:
        if (r2 >= r4.length) goto L17;
        if (r4[r2].equals(r1) == true) goto L15;
        r2 = r2 + 1;
        goto L11
    L15:
        return r4[r2];
    }

    public static final boolean d(PackageInfo r4, boolean r5) {
        if (r5 == false) goto L15;
        if (r4 != null) goto L6;
        PackageInfo r2 = null;
    L17:
        if (r4 != null) goto L19;
    L25:
        return false;
    L19:
        if (r2.signatures == null) goto L25;
        if (r5 == false) goto L22;
        ik5 r6 = c(r2, lk5.a);
    L23:
        if (r6 == null) goto L25;
        return true;
    L22:
        r6 = c(r2, new ik5[]{lk5.a[0]});
        goto L23
    L6:
        if ("com.android.vending".equals(r4.packageName) == false) goto L8;
    L9:
        ApplicationInfo r7 = r4.applicationInfo;
        if (r7 != null) goto L13;
    L11:
        r5 = false;
        goto L15
    L13:
        if ((r7.flags & 129) == 0) goto L11;
        r5 = true;
        goto L15
    L8:
        if ("com.google.android.gms".equals(r4.packageName) == true) goto L9;
    L15:
        r2 = r4;
        goto L17
    }

    @Override // defpackage.zj2
    public ak2 a(ml3 r5) {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 >= 31) goto L11;
        Context r4 = this.n;
        if (r4 == null) goto L14;
        if (r0 < 28) goto L14;
        if (r4.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen") == true) goto L11;
    L14:
        return new xi4(16).a(r5);
    L11:
        int r6 = lw2.h(((tb1) r5.c).n);
        l93.K("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(f35.H(r6)));
        mf4 r1 = new mf4(new xk(r6, 0), new xk(r6, 1));
        r1.o = true;
        return r1.d(r5);
    }
}
