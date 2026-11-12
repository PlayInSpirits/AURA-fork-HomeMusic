package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kl extends BroadcastReceiver {
    public final d41 a;
    public final yp4 b;
    public final /* synthetic */ ll c;

    public kl(ll r1, yp4 r2, d41 r3) {
        this.c = r1;
        this.b = r2;
        this.a = r3;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context r1, Intent r2) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(r2.getAction()) == false) goto L6;
        a0 r3 = new a0(8, this);
        this.b.d(r3);
        return;
    }
}
