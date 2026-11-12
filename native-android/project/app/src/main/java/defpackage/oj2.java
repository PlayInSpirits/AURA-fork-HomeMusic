package defpackage;

import android.os.IBinder;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class oj2 implements IBinder.DeathRecipient {
    public final String a;
    public final int b;
    public final int c;
    public final ms2 d;
    public final hg3 e;
    public final HashMap f;
    public final /* synthetic */ pn2 g;

    public oj2(pn2 r1, String r2, int r3, int r4, hg3 r5) {
        this.g = r1;
        this.f = new HashMap();
        this.a = r2;
        this.b = r3;
        this.c = r4;
        this.d = new ms2(r2, r3, r4);
        this.e = r5;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.g.t.post(new g5(20, this));
    }
}
