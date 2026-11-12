package defpackage;

import android.content.Context;
import android.content.pm.PackageInstaller;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class lj1 {
    public static final AtomicBoolean a = null;
    public static boolean b;
    public static boolean c;
    public static final AtomicBoolean d = null;
    public static final /* synthetic */ int e = 0;

    static {
        a = new AtomicBoolean();
        d = new AtomicBoolean();
    }

    public static boolean a(Context r3) {
        Iterator<PackageInstaller.SessionInfo> r0 = r3.getPackageManager().getPackageInstaller().getAllSessions().iterator();
    L5:
        if (r0.hasNext() == false) goto L11;
        if ("com.google.android.gms".equals(r0.next().getAppPackageName()) == false) goto L5;
        return true;
    L11:
        return r3.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
    L12:
        return false;
    }
}
