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
    public final HashMap f = new HashMap();
    public final /* synthetic */ pn2 g;

    public oj2(pn2 pn2Var, String str, int i, int i2, hg3 hg3Var) {
        this.g = pn2Var;
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = new ms2(str, i, i2);
        this.e = hg3Var;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.g.t.post(new g5(20, this));
    }
}
