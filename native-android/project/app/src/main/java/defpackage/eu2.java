package defpackage;

import android.app.Notification;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class eu2 extends rp {
    public final kn2 b;
    public int[] c;

    public eu2(kn2 kn2Var) {
        this.b = kn2Var;
    }

    @Override // defpackage.rp
    public final void c(gc gcVar) {
        Notification.Builder builder = (Notification.Builder) gcVar.b;
        Notification.MediaStyle mediaStyle = new Notification.MediaStyle();
        kn2 kn2Var = this.b;
        Notification.MediaStyle mediaSession = mediaStyle.setMediaSession(((kr2) kn2Var.a.h.m.o).c.o);
        int[] iArr = this.c;
        if (iArr != null) {
            mediaSession.setShowActionsInCompactView(iArr);
        }
        builder.setStyle(mediaSession);
        Bundle bundle = new Bundle();
        bundle.putBundle("androidx.media3.session", kn2Var.a.j.b());
        builder.addExtras(bundle);
    }
}
