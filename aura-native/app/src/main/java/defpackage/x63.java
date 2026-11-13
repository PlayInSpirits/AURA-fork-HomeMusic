package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class x63 {
    public static String d;
    public static w63 g;
    public final Context a;
    public final NotificationManager b;
    public static final Object c = new Object();
    public static HashSet e = new HashSet();
    public static final Object f = new Object();

    public x63(Context context) {
        this.a = context;
        this.b = (NotificationManager) context.getSystemService("notification");
    }

    public final void a(int i, Notification notification) {
        Bundle bundle = notification.extras;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            this.b.notify(null, i, notification);
            return;
        }
        t63 t63Var = new t63(this.a.getPackageName(), i, notification);
        synchronized (f) {
            try {
                if (g == null) {
                    g = new w63(this.a.getApplicationContext());
                }
                g.o.obtainMessage(0, t63Var).sendToTarget();
            } catch (Throwable th) {
                throw th;
            }
        }
        this.b.cancel(null, i);
    }
}
