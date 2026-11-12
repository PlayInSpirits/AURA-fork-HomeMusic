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
import java.util.concurrent.ExecutionException;

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

    public lo2(MediaLibraryService mediaLibraryService, yl0 yl0Var, x7 x7Var) {
        this.n = mediaLibraryService;
        this.u = yl0Var;
        this.o = x7Var;
        this.p = new x63(mediaLibraryService);
        Looper mainLooper = Looper.getMainLooper();
        String str = f35.a;
        this.q = new Handler(mainLooper, this);
        this.r = new h41(2, this);
        this.s = new Intent(mediaLibraryService, mediaLibraryService.getClass());
        this.t = new HashMap();
        this.x = false;
        this.z = true;
        this.A = 600000L;
        this.B = 3;
    }

    public final void a() {
        this.z = false;
        Handler handler = this.q;
        if (handler.hasMessages(1)) {
            handler.removeMessages(1);
            MediaLibraryService mediaLibraryService = this.n;
            ArrayList arrayListE = mediaLibraryService.e();
            for (int i = 0; i < arrayListE.size(); i++) {
                mediaLibraryService.k((kn2) arrayListE.get(i), false);
            }
        }
    }

    public final sk2 b(kn2 kn2Var) {
        jo2 jo2Var = (jo2) this.t.get(kn2Var);
        if (jo2Var == null) {
            return null;
        }
        bl2 bl2Var = jo2Var.a;
        if (!bl2Var.isDone()) {
            return null;
        }
        try {
            return (sk2) hw.j(bl2Var);
        } catch (ExecutionException e) {
            throw new IllegalStateException(e);
        }
    }

    public final boolean c(boolean z) {
        boolean z2;
        ArrayList arrayListE = this.n.e();
        int i = 0;
        while (true) {
            if (i >= arrayListE.size()) {
                z2 = false;
                break;
            }
            sk2 sk2VarB = b((kn2) arrayListE.get(i));
            if (sk2VarB != null && ((sk2VarB.q() || z) && (sk2VarB.g() == 3 || sk2VarB.g() == 2))) {
                z2 = true;
                break;
            }
            i++;
        }
        boolean z3 = this.z;
        long j = this.A;
        boolean z4 = z3 && j > 0;
        boolean z5 = this.y;
        Handler handler = this.q;
        if (z5 && !z2 && z4) {
            handler.sendEmptyMessageDelayed(1, j);
        } else if (z2) {
            handler.removeMessages(1);
        }
        this.y = z2;
        return z2 || handler.hasMessages(1);
    }

    public final boolean d(kn2 kn2Var) {
        sk2 sk2VarB = b(kn2Var);
        if (sk2VarB != null && !sk2VarB.x0().p()) {
            jo2 jo2Var = (jo2) this.t.get(kn2Var);
            jo2Var.getClass();
            if (sk2VarB.g() != 1) {
                jo2Var.b = false;
                jo2Var.c = true;
                return true;
            }
            int i = this.B;
            if (i == 1) {
                return !jo2Var.b;
            }
            if (i != 2) {
                if (i != 3) {
                    tb4.a();
                    return false;
                }
                if (!jo2Var.b && jo2Var.c) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void e(kn2 kn2Var, rm2 rm2Var, boolean z) {
        MediaSession.Token token = ((kr2) kn2Var.a.h.m.o).c.o;
        Notification notification = (Notification) rm2Var.o;
        notification.extras.putParcelable("android.mediaSession", token);
        this.w = rm2Var;
        MediaLibraryService mediaLibraryService = this.n;
        if (z) {
            ud3.G0(mediaLibraryService, this.s);
            f35.c0(mediaLibraryService, 1001, notification, 2, "mediaPlayback");
            this.x = true;
        } else {
            this.p.a(1001, notification);
            mediaLibraryService.stopForeground(2);
            this.x = false;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            return false;
        }
        MediaLibraryService mediaLibraryService = this.n;
        ArrayList arrayListE = mediaLibraryService.e();
        for (int i = 0; i < arrayListE.size(); i++) {
            mediaLibraryService.k((kn2) arrayListE.get(i), false);
        }
        return true;
    }
}
