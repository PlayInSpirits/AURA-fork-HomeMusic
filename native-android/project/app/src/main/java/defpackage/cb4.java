package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cb4 {
    public static final String b = null;
    public static final String c = null;
    public final bb4 a;

    static {
        hn2.a("media3.session");
        String r0 = f35.a;
        b = Integer.toString(0, 36);
        c = Integer.toString(1, 36);
    }

    public cb4(Context r13, ComponentName r14) {
        rr2.s(r13, "context must not be null");
        PackageManager r15 = r13.getPackageManager();
        int r0 = r15.getApplicationInfo(r14.getPackageName(), 0).uid;     // Catch: PackageManager.NameNotFoundException -> L5
    L4:
        int r2 = r0;
        if (a(r15, "androidx.media3.session.MediaLibraryService", r14) == false) goto L11;
        int r16 = 2;
    L9:
        int r3 = r16;
    L16:
        if (r3 == 101) goto L18;
        this.a = new db4(r2, r3, 1000000, 0, r14.getPackageName(), r14.getClassName(), r14, null, Bundle.EMPTY, null);
        return;
    L18:
        this.a = new eb4(r14, r2);
        return;
    L11:
        if (a(r15, "androidx.media3.session.MediaSessionService", r14) == false) goto L14;
        r16 = 1;
        goto L9
    L14:
        if (a(r15, "android.media.browse.MediaBrowserService", r14) == false) goto L20;
        r3 = 101;
        goto L16
    L20:
        nz2.A(r14, ". Manifest doesn't declare one of either MediaSessionService, MediaLibraryService, MediaBrowserService or MediaBrowserServiceCompat. Use service's full name.", "Failed to resolve SessionToken for ");
        throw null;
    L5:
        r0 = -1;
        goto L4
    }

    public static boolean a(PackageManager r3, String r4, ComponentName r5) {
        Intent r0 = new Intent(r4);
        r0.setPackage(r5.getPackageName());
        List<ResolveInfo> r6 = r3.queryIntentServices(r0, 128);
        if (r6 == null) goto L17;
        int r1 = 0;
    L6:
        if (r1 >= r6.size()) goto L17;
        ResolveInfo r2 = r6.get(r1);
        if (r2 == null) goto L16;
        ServiceInfo r7 = r2.serviceInfo;
        if (r7 == null) goto L16;
        if (TextUtils.equals(r7.name, r5.getClassName()) == false) goto L16;
        return true;
    L16:
        r1 = r1 + 1;
    L17:
        return false;
    }

    public final Bundle b() {
        Bundle r0 = new Bundle();
        bb4 r3 = this.a;
        boolean r1 = r3 instanceof db4;
        String r2 = b;
        if (r1 == false) goto L5;
        r0.putInt(r2, 0);
    L6:
        r0.putBundle(c, r3.h());
        return r0;
    L5:
        r0.putInt(r2, 1);
        goto L6
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof cb4) == true) goto L7;
        return false;
    L7:
        return this.a.equals(((cb4) r2).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }

    public cb4(int r12, int r13, int r14, String r15, pu1 r16, Bundle r17, MediaSession.Token r18) {
        r15.getClass();
        IBinder r8 = r16.asBinder();
        r17.getClass();
        this.a = new db4(r12, 0, r13, r14, r15, "", null, r8, r17, r18);
    }
}
