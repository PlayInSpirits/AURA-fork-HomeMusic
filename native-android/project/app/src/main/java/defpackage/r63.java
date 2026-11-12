package defpackage;

import android.app.Notification;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class r63 extends rp {
    public CharSequence b;

    @Override // defpackage.rp
    public final void c(gc r2) {
        new Notification.BigTextStyle((Notification.Builder) r2.b).setBigContentTitle(null).bigText(this.b);
    }

    @Override // defpackage.rp
    public final String i() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
