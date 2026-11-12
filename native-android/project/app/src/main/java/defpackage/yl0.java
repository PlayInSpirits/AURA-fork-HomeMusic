package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yl0 {
    public static final go4 h = null;
    public final Context a;
    public final int b;
    public final NotificationManager c;
    public mf4 d;
    public final int e;
    public x7 f;
    public xc5 g;

    static {
        h = au0.L(new di0(1));
    }

    public yl0(bk r2) {
        Context r0 = (Context) r2.q;
        int r3 = r2.o;
        this.a = r0;
        this.b = r3;
        NotificationManager r4 = (NotificationManager) r0.getSystemService("notification");
        r4.getClass();
        this.c = r4;
        this.e = R.drawable.media3_notification_small_icon;
    }
}
