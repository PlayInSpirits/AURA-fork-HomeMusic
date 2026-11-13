package defpackage;

import android.os.IBinder;
import android.support.v4.media.session.PlaybackStateCompat;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class np2 implements IBinder.DeathRecipient {
    public final /* synthetic */ int a;
    public final /* synthetic */ dg b;

    public np2(dg dgVar, int i) {
        this.a = i;
        this.b = dgVar;
        new uk2(this);
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
    }

    public final void a(PlaybackStateCompat playbackStateCompat) {
    }
}
