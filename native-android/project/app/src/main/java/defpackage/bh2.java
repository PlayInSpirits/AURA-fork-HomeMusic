package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bh2 implements OnBackAnimationCallback {
    public final /* synthetic */ zg2 a;
    public final /* synthetic */ ch2 b;

    public bh2(ch2 r1, zg2 r2) {
        this.b = r1;
        this.a = r2;
    }

    public final void onBackCancelled() {
        if (this.b.a == null) goto L6;
        this.a.d();
        return;
    }

    public final void onBackInvoked() {
        this.a.a();
    }

    public final void onBackProgressed(BackEvent r2) {
        if (this.b.a == null) goto L6;
        oo r0 = new oo(r2);
        this.a.b(r0);
        return;
    }

    public final void onBackStarted(BackEvent r2) {
        if (this.b.a == null) goto L6;
        oo r0 = new oo(r2);
        this.a.c(r0);
        return;
    }
}
