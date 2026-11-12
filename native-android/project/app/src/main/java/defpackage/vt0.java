package defpackage;

import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import app.homemusic.R;
import com.eddyizm.tempus.service.DownloaderService;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vt0 extends Service {
    public static final HashMap v = null;
    public final la0 n;
    public final String o;
    public final int p;
    public ut0 q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;

    static {
        v = new HashMap();
    }

    public vt0() {
        la0 r0 = new la0();
        r0.q = this;
        r0.p = new Handler(Looper.getMainLooper());
        this.n = r0;
        this.o = "download_channel";
        this.p = R.string.exo_download_notification_channel_name;
    }

    public static void a(vt0 r3, List r4) {
        la0 r5 = r3.n;
        if (r5 == null) goto L21;
        int r0 = 0;
    L6:
        if (r0 >= r4.size()) goto L22;
        int r1 = ((ns0) r4.get(r0)).b;
        if (r1 == 2) goto L15;
        if (r1 == 5) goto L15;
        if (r1 == 7) goto L15;
        r0 = r0 + 1;
    L15:
        r5.n = true;
        r5.d();
        return;
    L22:
        return;
    }

    public final void b() {
        la0 r0 = this.n;
        if (r0 == null) goto L5;
        r0.n = false;
        ((Handler) r0.p).removeCallbacksAndMessages(null);
    L5:
        ut0 r1 = this.q;
        r1.getClass();
        if (r1.i() == true) goto L9;
        return;
    L9:
        if (Build.VERSION.SDK_INT < 28) goto L11;
    L14:
        this.u |= stopSelfResult(this.r);
        return;
    L11:
        if (this.t == false) goto L14;
        stopSelf();
        this.u = true;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent r1) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public final void onCreate() {
        String r0 = this.o;
        if (r0 == null) goto L7;
        int r1 = this.p;
        if (Build.VERSION.SDK_INT < 26) goto L7;
        NotificationManager r2 = (NotificationManager) getSystemService("notification");
        r2.getClass();
        gm0.n();
        gm0.q(r2, gm0.d(r0, getString(r1)));
    L7:
        Class<?> r8 = getClass();
        HashMap r3 = v;
        ut0 r4 = (ut0) r3.get(r8);
        boolean r9 = false;
        if (r4 == null) goto L10;
    L30:
        this.q = r4;
        if (r4.f != null) goto L33;
        r9 = true;
    L33:
        rr2.w(r9);
        r4.f = this;
        if (r4.b.h == false) goto L39;
        f35.q(null).postAtFrontOfQueue(new k6(22, r4, this));
        return;
    L39:
        return;
    L10:
        if (this.n == null) goto L12;
        boolean r6 = true;
    L14:
        if (Build.VERSION.SDK_INT >= 31) goto L16;
        boolean r5 = true;
    L17:
        if (r6 == false) goto L20;
        if (r5 == false) goto L20;
        dh3 r7 = new dh3((DownloaderService) this);
    L21:
        DownloaderService r10 = (DownloaderService) this;
        monitor-enter(au0.class);
        au0.m(r10);     // Catch: Throwable -> L26
        lt0 r11 = au0.t;     // Catch: Throwable -> L26
        monitor-exit(au0.class);
        fu0 r12 = new fu0(r10);
        r11.getClass();
        r11.e.add(r12);
        r11.c(false);
        ut0 r13 = new ut0(getApplicationContext(), r11, r6, r7, r8);
        r3.put(r8, r13);
        r4 = r13;
    L26:
        th = move-exception;
        throw th;
    L20:
        r7 = null;
        goto L21
    L16:
        r5 = false;
        goto L17
    L12:
        r6 = false;
        goto L14
    }

    @Override // android.app.Service
    public final void onDestroy() {
        ut0 r0 = this.q;
        r0.getClass();
        if (r0.f != this) goto L5;
        boolean r1 = true;
    L6:
        rr2.w(r1);
        r0.f = null;
        la0 r3 = this.n;
        if (r3 == null) goto L10;
        r3.n = false;
        ((Handler) r3.p).removeCallbacksAndMessages(null);
        return;
    L10:
        return;
    L5:
        r1 = false;
        goto L6
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent r12, int r13, int r14) {
        this.r = r14;
        this.t = false;
        if (r12 == null) goto L12;
        String r1 = r12.getAction();
        String r2 = r12.getStringExtra("content_id");
        boolean r3 = this.s;
        if (r12.getBooleanExtra("foreground", false) == false) goto L7;
    L10:
        boolean r4 = true;
    L11:
        this.s = r3 | r4;
    L14:
        if (r1 != null) goto L16;
        r1 = "androidx.media3.exoplayer.downloadService.action.INIT";
    L16:
        ut0 r5 = this.q;
        r5.getClass();
        lt0 r6 = r5.b;
        it0 r7 = r6.c;
        byte r10 = -1;
        switch(r1.hashCode()) {
            case -2068303304: goto L52;
            case -1192305801: goto L48;
            case -659421309: goto L44;
            case -238450692: goto L40;
            case 32678949: goto L36;
            case 464223742: goto L32;
            case 829812082: goto L28;
            case 845668953: goto L24;
            case 1746253622: goto L20;
            default: goto L56;
        };
    L20:
        if (r1.equals("androidx.media3.exoplayer.downloadService.action.PAUSE_DOWNLOADS") == false) goto L56;
        r10 = 8;
        goto L56
    L24:
        if (r1.equals("androidx.media3.exoplayer.downloadService.action.SET_REQUIREMENTS") == false) goto L56;
        r10 = 7;
        goto L56
    L28:
        if (r1.equals("androidx.media3.exoplayer.downloadService.action.ADD_DOWNLOAD") == false) goto L56;
        r10 = 6;
        goto L56
    L32:
        if (r1.equals("androidx.media3.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS") == false) goto L56;
        r10 = 5;
        goto L56
    L36:
        if (r1.equals("androidx.media3.exoplayer.downloadService.action.RESUME_DOWNLOADS") == false) goto L56;
        r10 = 4;
        goto L56
    L40:
        if (r1.equals("androidx.media3.exoplayer.downloadService.action.INIT") == false) goto L56;
        r10 = 3;
        goto L56
    L44:
        if (r1.equals("androidx.media3.exoplayer.downloadService.action.RESTART") == false) goto L56;
        r10 = 2;
        goto L56
    L48:
        if (r1.equals("androidx.media3.exoplayer.downloadService.action.REMOVE_DOWNLOAD") == false) goto L56;
        r10 = 1;
        goto L56
    L52:
        if (r1.equals("androidx.media3.exoplayer.downloadService.action.SET_STOP_REASON") == false) goto L56;
        r10 = 0;
    L56:
        switch(r10) {
            case 0: goto L72;
            case 1: goto L69;
            case 2: goto L77;
            case 3: goto L77;
            case 4: goto L68;
            case 5: goto L67;
            case 6: goto L63;
            case 7: goto L59;
            case 8: goto L58;
            default: goto L57;
        };
    L57:
        l93.F("DownloadService", "Ignored unrecognized action: ".concat(r1));
        goto L77
    L58:
        r6.c(true);
        goto L77
    L59:
        r12.getClass();
        h04 r15 = (h04) r12.getParcelableExtra("requirements");
        if (r15 != null) goto L62;
        l93.F("DownloadService", "Ignored SET_REQUIREMENTS: Missing requirements extra");
        goto L77
    L62:
        r6.d(r15);
        goto L77
    L63:
        r12.getClass();
        tt0 r8 = (tt0) r12.getParcelableExtra("download_request");
        if (r8 != null) goto L66;
        l93.F("DownloadService", "Ignored ADD_DOWNLOAD: Missing download_request extra");
        goto L77
    L66:
        int r16 = r12.getIntExtra("stop_reason", 0);
        r6.f++;
        r7.obtainMessage(7, r16, 0, r8).sendToTarget();
        goto L77
    L67:
        r6.f++;
        r7.obtainMessage(9).sendToTarget();
        goto L77
    L68:
        r6.c(false);
        goto L77
    L69:
        if (r2 != null) goto L71;
        l93.F("DownloadService", "Ignored REMOVE_DOWNLOAD: Missing content_id extra");
        goto L77
    L71:
        r6.f++;
        r7.obtainMessage(8, r2).sendToTarget();
        goto L77
    L72:
        r12.getClass();
        if (r12.hasExtra("stop_reason") == true) goto L75;
        l93.F("DownloadService", "Ignored SET_STOP_REASON: Missing stop_reason extra");
        goto L77
    L75:
        int r17 = r12.getIntExtra("stop_reason", 0);
        r6.f++;
        r7.obtainMessage(4, r17, 0, r2).sendToTarget();
    L77:
        if (Build.VERSION.SDK_INT >= 26) goto L79;
    L85:
        this.u = false;
        if (r6.g == 0) goto L88;
    L90:
        return 1;
    L88:
        if (r6.f != 0) goto L90;
        b();
        goto L90
    L79:
        if (this.s == false) goto L85;
        la0 r18 = this.n;
        if (r18 == null) goto L85;
        if (r18.o == true) goto L85;
        r18.d();
        goto L85
    L7:
        if ("androidx.media3.exoplayer.downloadService.action.RESTART".equals(r1) == true) goto L10;
        r4 = false;
        goto L11
    L12:
        r1 = null;
        r2 = null;
        goto L14
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent r1) {
        this.t = true;
    }

    public final void onTimeout(int r1, int r2) {
        l93.q0("DownloadService", "onTimeout() called by system. Calling stopSelf() to terminate gracefully.");
        stopSelf();
    }
}
