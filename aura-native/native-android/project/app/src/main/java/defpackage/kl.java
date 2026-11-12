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

    public kl(ll llVar, yp4 yp4Var, d41 d41Var) {
        this.c = llVar;
        this.b = yp4Var;
        this.a = d41Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.b.d(new a0(8, this));
        }
    }
}
