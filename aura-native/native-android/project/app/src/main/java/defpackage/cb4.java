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
    public static final String b;
    public static final String c;
    public final bb4 a;

    static {
        hn2.a("media3.session");
        String str = f35.a;
        b = Integer.toString(0, 36);
        c = Integer.toString(1, 36);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0056  */
    public cb4(Context context, ComponentName componentName) {
        int i;
        int i2;
        int i3;
        rr2.s(context, "context must not be null");
        PackageManager packageManager = context.getPackageManager();
        try {
            i = packageManager.getApplicationInfo(componentName.getPackageName(), 0).uid;
        } catch (PackageManager.NameNotFoundException unused) {
            i = -1;
        }
        int i4 = i;
        if (!a(packageManager, "androidx.media3.session.MediaLibraryService", componentName)) {
            if (a(packageManager, "androidx.media3.session.MediaSessionService", componentName)) {
                i3 = 1;
            } else {
                if (!a(packageManager, "android.media.browse.MediaBrowserService", componentName)) {
                    nz2.A(componentName, ". Manifest doesn't declare one of either MediaSessionService, MediaLibraryService, MediaBrowserService or MediaBrowserServiceCompat. Use service's full name.", "Failed to resolve SessionToken for ");
                    throw null;
                }
                i2 = 101;
            }
            if (i2 != 101) {
                this.a = new db4(i4, i2, 1000000, 0, componentName.getPackageName(), componentName.getClassName(), componentName, null, Bundle.EMPTY, null);
            } else {
                this.a = new eb4(componentName, i4);
            }
        }
        i3 = 2;
        i2 = i3;
        if (i2 != 101) {
            this.a = new db4(i4, i2, 1000000, 0, componentName.getPackageName(), componentName.getClassName(), componentName, null, Bundle.EMPTY, null);
        } else {
            this.a = new eb4(componentName, i4);
        }
    }

    public static boolean a(PackageManager packageManager, String str, ComponentName componentName) {
        ServiceInfo serviceInfo;
        Intent intent = new Intent(str);
        intent.setPackage(componentName.getPackageName());
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 128);
        if (listQueryIntentServices != null) {
            for (int i = 0; i < listQueryIntentServices.size(); i++) {
                ResolveInfo resolveInfo = listQueryIntentServices.get(i);
                if (resolveInfo != null && (serviceInfo = resolveInfo.serviceInfo) != null && TextUtils.equals(serviceInfo.name, componentName.getClassName())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bb4 bb4Var = this.a;
        boolean z = bb4Var instanceof db4;
        String str = b;
        if (z) {
            bundle.putInt(str, 0);
        } else {
            bundle.putInt(str, 1);
        }
        bundle.putBundle(c, bb4Var.h());
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cb4) {
            return this.a.equals(((cb4) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }

    public cb4(int i, int i2, int i3, String str, pu1 pu1Var, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        IBinder iBinderAsBinder = pu1Var.asBinder();
        bundle.getClass();
        this.a = new db4(i, 0, i2, i3, str, "", null, iBinderAsBinder, bundle, token);
    }
}
