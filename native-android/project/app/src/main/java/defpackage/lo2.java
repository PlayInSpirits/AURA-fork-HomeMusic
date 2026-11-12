package defpackage;

import android.app.Notification;
import android.content.Intent;
import android.media.session.MediaSession;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.session.MediaLibraryService;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lo2 implements Handler.Callback {
    public final long A;
    public final int B;
    public final MediaLibraryService n;
    public final x7 o;
    public final x63 p;
    public final Handler q;
    public final h41 r;
    public final Intent s;
    public final HashMap t;
    public final yl0 u;
    public int v;
    public rm2 w;
    public boolean x;
    public boolean y;
    public boolean z;

    public lo2(MediaLibraryService r1, yl0 r2, x7 r3) {
        this.n = r1;
        this.u = r2;
        this.o = r3;
        this.p = new x63(r1);
        Looper r4 = Looper.getMainLooper();
        String r5 = f35.a;
        this.q = new Handler(r4, this);
        this.r = new h41(2, this);
        this.s = new Intent(r1, r1.getClass());
        this.t = new HashMap();
        this.x = false;
        this.z = true;
        this.A = 600000;
        this.B = 3;
    }

    public final void a() {
        this.z = false;
        Handler r1 = this.q;
        if (r1.hasMessages(1) == false) goto L8;
        r1.removeMessages(1);
        MediaLibraryService r4 = this.n;
        ArrayList r2 = r4.e();
        int r3 = 0;
    L6:
        if (r3 >= r2.size()) goto L10;
        r4.k((kn2) r2.get(r3), false);
        r3 = r3 + 1;
        goto L6
    L10:
        return;
    }

    public final sk2 b(kn2 r1) {
        jo2 r0 = (jo2) this.t.get(r1);
        if (r0 == null) goto L12;
        bl2 r2 = r0.a;
        if (r2.isDone() == false) goto L16;
        return (sk2) hw.j(r2);
    L9:
        e = move-exception;
        throw new IllegalStateException(e);
    L16:
        return null;
    L12:
        return null;
    }

    public final boolean c(boolean r8) {
        ArrayList r0 = this.n.e();
        int r2 = 0;
    L4:
        if (r2 >= r0.size()) goto L16;
        sk2 r3 = b((kn2) r0.get(r2));
        if (r3 == null) goto L15;
        if (r3.q() == true) goto L11;
        if (r8 == false) goto L15;
    L11:
        if (r3.g() == 3) goto L14;
        if (r3.g() != 2) goto L15;
    L14:
        boolean r9 = true;
    L17:
        boolean r1 = this.z;
        long r4 = this.A;
        if (r1 == true) goto L20;
    L22:
        boolean r5 = false;
    L23:
        boolean r6 = this.y;
        Handler r7 = this.q;
        if (r6 == false) goto L28;
        if (r9 == true) goto L28;
        if (r5 == false) goto L28;
        r7.sendEmptyMessageDelayed(1, r4);
    L30:
        this.y = r9;
        boolean r10 = r7.hasMessages(1);
        if (r9 == true) goto L35;
        if (r10 == true) goto L35;
        return false;
    L35:
        return true;
    L28:
        if (r9 == false) goto L30;
        r7.removeMessages(1);
        goto L30
    L20:
        if (r4 <= 0) goto L22;
        r5 = true;
    L15:
        r2 = r2 + 1;
        goto L4
    L16:
        r9 = false;
        goto L17
    }

    public final boolean d(kn2 r4) {
        sk2 r0 = b(r4);
        if (r0 != null) goto L5;
    L26:
        return false;
    L5:
        if (r0.x0().p() == true) goto L26;
        jo2 r5 = (jo2) this.t.get(r4);
        r5.getClass();
        if (r0.g() == 1) goto L11;
        r5.b = false;
        r5.c = true;
        return true;
    L11:
        int r3 = this.B;
        if (r3 == 1) goto L25;
        if (r3 == 2) goto L26;
        if (r3 == 3) goto L18;
        tb4.a();
        return false;
    L18:
        if (r5.b == true) goto L26;
        if (r5.c == false) goto L26;
        return true;
    L25:
        return !r5.b;
    }

    public final void e(kn2 r4, rm2 r5, boolean r6) {
        MediaSession.Token r7 = ((kr2) r4.a.h.m.o).c.o;
        Notification r0 = (Notification) r5.o;
        r0.extras.putParcelable("android.mediaSession", r7);
        this.w = r5;
        MediaLibraryService r8 = this.n;
        if (r6 == false) goto L6;
        ud3.G0(r8, this.s);
        f35.c0(r8, 1001, r0, 2, "mediaPlayback");
        this.x = true;
        return;
    L6:
        this.p.a(1001, r0);
        r8.stopForeground(2);
        this.x = false;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message r5) {
        if (r5.what != 1) goto L9;
        MediaLibraryService r4 = this.n;
        ArrayList r6 = r4.e();
        int r2 = 0;
    L6:
        if (r2 >= r6.size()) goto L8;
        r4.k((kn2) r6.get(r2), false);
        r2 = r2 + 1;
        goto L6
    L8:
        return true;
    L9:
        return false;
    }
}
