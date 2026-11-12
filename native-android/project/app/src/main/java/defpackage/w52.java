package defpackage;

import android.media.session.MediaSession;
import android.os.Handler;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w52 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ x52 o;
    public final /* synthetic */ MediaSession p;
    public final /* synthetic */ int q;

    public /* synthetic */ w52(x52 r1, MediaSession r2, int r3, int r4) {
        this.n = r4;
        this.o = r1;
        this.p = r2;
        this.q = r3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        int r3 = this.q;
        MediaSession r4 = this.p;
        x52 r5 = this.o;
        switch(r0) {
            case 0: goto L14;
            default: goto L5;
        };
    L5:
        if (z52.b == r5) goto L7;
        return;
    L7:
        if (z52.a != r4) goto L25;
        Handler r6 = u52.a;
        if (u52.c().b == false) goto L26;
        JSONObject r7 = new JSONObject().put("command", "device_volume").put("level", gb.m(r3, 0, u52.c().n));
        r7.getClass();
        u52.p(r7, new k52(3));
        return;
    L26:
        return;
    L25:
        return;
    L14:
        if (z52.b == r5) goto L16;
        return;
    L16:
        if (z52.a != r4) goto L28;
        Handler r8 = u52.a;
        if (u52.c().b == true) goto L20;
        return;
    L20:
        if (gb.P(new Integer[]{1, -1}).contains(Integer.valueOf(r3)) == false) goto L30;
        JSONObject r9 = new JSONObject().put("command", "device_volume").put("direction", r3);
        r9.getClass();
        u52.p(r9, new k52(4));
        return;
    L30:
        return;
    }
}
