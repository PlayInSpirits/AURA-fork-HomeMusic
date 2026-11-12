package defpackage;

import android.app.Notification;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class eu2 extends rp {
    public final kn2 b;
    public int[] c;

    public eu2(kn2 r1) {
        this.b = r1;
    }

    @Override // defpackage.rp
    public final void c(gc r4) {
        Notification.Builder r5 = (Notification.Builder) r4.b;
        Notification.MediaStyle r0 = new Notification.MediaStyle();
        kn2 r1 = this.b;
        Notification.MediaStyle r2 = r0.setMediaSession(((kr2) r1.a.h.m.o).c.o);
        int[] r3 = this.c;
        if (r3 == null) goto L5;
        r2.setShowActionsInCompactView(r3);
    L5:
        r5.setStyle(r2);
        Bundle r6 = new Bundle();
        r6.putBundle("androidx.media3.session", r1.a.j.b());
        r5.addExtras(r6);
    }
}
