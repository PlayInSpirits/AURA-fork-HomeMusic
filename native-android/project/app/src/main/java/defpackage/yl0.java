package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yl0 {
    public static final go4 h = au0.L(new di0(1));
    public final Context a;
    public final int b;
    public final NotificationManager c;
    public mf4 d;
    public final int e;
    public x7 f;
    public xc5 g;

    public yl0(bk bkVar) {
        Context context = (Context) bkVar.q;
        int i = bkVar.o;
        this.a = context;
        this.b = i;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        notificationManager.getClass();
        this.c = notificationManager;
        this.e = R.drawable.media3_notification_small_icon;
    }
}
