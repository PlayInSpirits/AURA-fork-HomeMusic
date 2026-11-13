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

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class vt0 extends Service {
    public static final HashMap v = new HashMap();
    public final la0 n;
    public final String o;
    public final int p;
    public ut0 q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;

    public vt0() {
        la0 la0Var = new la0();
        la0Var.q = this;
        la0Var.p = new Handler(Looper.getMainLooper());
        this.n = la0Var;
        this.o = "download_channel";
        this.p = R.string.exo_download_notification_channel_name;
    }

    public static void a(vt0 vt0Var, List list) {
        la0 la0Var = vt0Var.n;
        if (la0Var != null) {
            for (int i = 0; i < list.size(); i++) {
                int i2 = ((ns0) list.get(i)).b;
                if (i2 == 2 || i2 == 5 || i2 == 7) {
                    la0Var.n = true;
                    la0Var.d();
                    return;
                }
            }
        }
    }

    public final void b() {
        la0 la0Var = this.n;
        if (la0Var != null) {
            la0Var.n = false;
            ((Handler) la0Var.p).removeCallbacksAndMessages(null);
        }
        ut0 ut0Var = this.q;
        ut0Var.getClass();
        if (ut0Var.i()) {
            if (Build.VERSION.SDK_INT >= 28 || !this.t) {
                this.u |= stopSelfResult(this.r);
            } else {
                stopSelf();
                this.u = true;
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public final void onCreate() {
        lt0 lt0Var;
        String str = this.o;
        if (str != null) {
            int i = this.p;
            if (Build.VERSION.SDK_INT >= 26) {
                NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
                notificationManager.getClass();
                gm0.n();
                notificationManager.createNotificationChannel(gm0.d(str, getString(i)));
            }
        }
        Class<?> cls = getClass();
        HashMap hashMap = v;
        ut0 ut0Var = (ut0) hashMap.get(cls);
        if (ut0Var == null) {
            boolean z = this.n != null;
            dh3 dh3Var = (z && (Build.VERSION.SDK_INT < 31)) ? new dh3((DownloaderService) this) : null;
            DownloaderService downloaderService = (DownloaderService) this;
            synchronized (au0.class) {
                au0.m(downloaderService);
                lt0Var = au0.t;
            }
            fu0 fu0Var = new fu0(downloaderService);
            lt0Var.getClass();
            lt0Var.e.add(fu0Var);
            lt0Var.c(false);
            ut0 ut0Var2 = new ut0(getApplicationContext(), lt0Var, z, dh3Var, cls);
            hashMap.put(cls, ut0Var2);
            ut0Var = ut0Var2;
        }
        this.q = ut0Var;
        rr2.w(ut0Var.f == null);
        ut0Var.f = this;
        if (ut0Var.b.h) {
            f35.q(null).postAtFrontOfQueue(new k6(22, ut0Var, this));
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        ut0 ut0Var = this.q;
        ut0Var.getClass();
        rr2.w(ut0Var.f == this);
        ut0Var.f = null;
        la0 la0Var = this.n;
        if (la0Var != null) {
            la0Var.n = false;
            ((Handler) la0Var.p).removeCallbacksAndMessages(null);
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        String str;
        String str2;
        lt0 lt0Var;
        it0 it0Var;
        la0 la0Var;
        this.r = i2;
        this.t = false;
        if (intent != null) {
            str = intent.getAction();
            str2 = intent.getStringExtra("content_id");
            this.s |= intent.getBooleanExtra("foreground", false) || "androidx.media3.exoplayer.downloadService.action.RESTART".equals(str);
        } else {
            str = null;
            str2 = null;
        }
        if (str == null) {
            str = "androidx.media3.exoplayer.downloadService.action.INIT";
        }
        ut0 ut0Var = this.q;
        ut0Var.getClass();
        lt0Var = ut0Var.b;
        it0Var = lt0Var.c;
        switch (str) {
            case "androidx.media3.exoplayer.downloadService.action.SET_STOP_REASON":
                intent.getClass();
                if (!intent.hasExtra("stop_reason")) {
                    l93.F("DownloadService", "Ignored SET_STOP_REASON: Missing stop_reason extra");
                    break;
                } else {
                    int intExtra = intent.getIntExtra("stop_reason", 0);
                    lt0Var.f++;
                    it0Var.obtainMessage(4, intExtra, 0, str2).sendToTarget();
                    break;
                }
            case "androidx.media3.exoplayer.downloadService.action.REMOVE_DOWNLOAD":
                if (str2 != null) {
                    lt0Var.f++;
                    it0Var.obtainMessage(8, str2).sendToTarget();
                    break;
                } else {
                    l93.F("DownloadService", "Ignored REMOVE_DOWNLOAD: Missing content_id extra");
                    break;
                }
            case "androidx.media3.exoplayer.downloadService.action.RESTART":
            case "androidx.media3.exoplayer.downloadService.action.INIT":
                break;
            case "androidx.media3.exoplayer.downloadService.action.RESUME_DOWNLOADS":
                lt0Var.c(false);
                break;
            case "androidx.media3.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS":
                lt0Var.f++;
                it0Var.obtainMessage(9).sendToTarget();
                break;
            case "androidx.media3.exoplayer.downloadService.action.ADD_DOWNLOAD":
                intent.getClass();
                tt0 tt0Var = (tt0) intent.getParcelableExtra("download_request");
                if (tt0Var != null) {
                    int intExtra2 = intent.getIntExtra("stop_reason", 0);
                    lt0Var.f++;
                    it0Var.obtainMessage(7, intExtra2, 0, tt0Var).sendToTarget();
                    break;
                } else {
                    l93.F("DownloadService", "Ignored ADD_DOWNLOAD: Missing download_request extra");
                    break;
                }
            case "androidx.media3.exoplayer.downloadService.action.SET_REQUIREMENTS":
                intent.getClass();
                h04 h04Var = (h04) intent.getParcelableExtra("requirements");
                if (h04Var != null) {
                    lt0Var.d(h04Var);
                    break;
                } else {
                    l93.F("DownloadService", "Ignored SET_REQUIREMENTS: Missing requirements extra");
                    break;
                }
            case "androidx.media3.exoplayer.downloadService.action.PAUSE_DOWNLOADS":
                lt0Var.c(true);
                break;
            default:
                l93.F("DownloadService", "Ignored unrecognized action: ".concat(str));
                break;
        }
        if (Build.VERSION.SDK_INT >= 26 && this.s && (la0Var = this.n) != null && !la0Var.o) {
            la0Var.d();
        }
        this.u = false;
        if (lt0Var.g == 0 && lt0Var.f == 0) {
            b();
        }
        return 1;
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        this.t = true;
    }

    public final void onTimeout(int i, int i2) {
        l93.q0("DownloadService", "onTimeout() called by system. Calling stopSelf() to terminate gracefully.");
        stopSelf();
    }
}
