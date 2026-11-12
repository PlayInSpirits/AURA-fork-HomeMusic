package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.SystemClock;
import app.homemusic.R;
import com.eddyizm.tempus.database.AppDatabase;
import com.eddyizm.tempus.model.Download;
import com.eddyizm.tempus.service.DownloaderService;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fu0 implements jt0 {
    public final Context a;
    public final AtomicInteger b = new AtomicInteger(0);
    public final AtomicInteger c = new AtomicInteger(0);
    public long d = 0;
    public long e = 0;
    public float f = 0.0f;

    public fu0(DownloaderService downloaderService) {
        this.a = downloaderService.getApplicationContext();
    }

    public static void h(ns0 ns0Var) {
        Download download;
        String str = ns0Var.a.n;
        if (DownloaderService.z.containsKey(str)) {
            return;
        }
        byte[] bArr = eu0.c;
        pb0 pb0Var = new pb0(AppDatabase.y().w(), str, 1);
        Thread thread = new Thread(pb0Var);
        thread.start();
        try {
            thread.join();
            download = (Download) pb0Var.q;
        } catch (InterruptedException e) {
            e.printStackTrace();
            download = null;
        }
        String title = download != null ? download.getTitle() : null;
        if (title != null) {
            DownloaderService.z.put(str, title);
        }
    }

    @Override // defpackage.jt0
    public final void b(lt0 lt0Var, ns0 ns0Var) {
        Notification notificationG;
        boolean zEquals = Arrays.equals(ns0Var.a.t, eu0.c);
        int i = ns0Var.b;
        if (zEquals) {
            if (i == 3) {
                eu0.h(ns0Var);
                return;
            } else {
                if (i == 4) {
                    eu0.e.remove(ns0Var.a.n);
                    return;
                }
                return;
            }
        }
        if (i == 0) {
            i(lt0Var);
            j(lt0Var);
            h(ns0Var);
            return;
        }
        if (i == 2) {
            i(lt0Var);
            j(lt0Var);
            h(ns0Var);
            return;
        }
        if (i == 3) {
            this.b.incrementAndGet();
            DownloaderService.y = this.b.get();
            eu0.h(ns0Var);
        } else {
            if (i != 4) {
                return;
            }
            eu0.e.remove(ns0Var.a.n);
            this.c.incrementAndGet();
            DownloaderService.y = this.c.get() + this.b.get();
        }
        if (lt0Var.l.stream().noneMatch(new c7(12))) {
            Context context = this.a;
            int i2 = this.b.get();
            int i3 = this.c.get();
            if (i2 > 0 && i3 == 0) {
                notificationG = g(R.drawable.ic_check_circle, context.getString(R.string.notification_downloads_complete), context.getResources().getQuantityString(R.plurals.notification_tracks_downloaded, i2, Integer.valueOf(i2)));
            } else if (i2 > 0) {
                notificationG = g(R.drawable.ic_check_circle, context.getString(R.string.notification_downloads_complete), context.getString(R.string.notification_download_mixed_result, Integer.valueOf(i2), Integer.valueOf(i3)));
            } else {
                notificationG = g(R.drawable.ic_error, context.getString(R.string.notification_download_failed), context.getResources().getQuantityString(R.plurals.notification_tracks_failed, i3, Integer.valueOf(i3)));
            }
            ((NotificationManager) context.getSystemService("notification")).notify(2, notificationG);
            this.b.set(0);
            this.c.set(0);
            this.f = 0.0f;
            DownloaderService.w = 0.0f;
            DownloaderService.x = 0;
            DownloaderService.y = 0;
            DownloaderService.z.clear();
            this.d = 0L;
            this.e = 0L;
        }
    }

    @Override // defpackage.jt0
    public final void d(ns0 ns0Var) {
        byte[] bArr = eu0.c;
        new Thread(new qt0(AppDatabase.y().w(), ns0Var.a.n, 0)).start();
        HashMap map = eu0.d;
        tt0 tt0Var = ns0Var.a;
        map.remove(tt0Var.n);
        eu0.e.remove(tt0Var.n);
    }

    public final Notification g(int i, String str, String str2) {
        s63 s63Var = new s63(this.a, "download_channel");
        s63Var.e = s63.b(str);
        s63Var.f = s63.b(str2);
        s63Var.v.icon = i;
        s63Var.c(2, false);
        s63Var.c(16, false);
        s63Var.w = true;
        s63Var.i = 0;
        s63Var.c(8, true);
        return s63Var.a();
    }

    public final void i(lt0 lt0Var) {
        int iCount = (int) lt0Var.l.stream().filter(new c7(13)).count();
        if (iCount > DownloaderService.x) {
            DownloaderService.x = iCount;
            return;
        }
        if (DownloaderService.x <= 0 || DownloaderService.y < DownloaderService.x || iCount != 1) {
            return;
        }
        DownloaderService.x = 0;
        DownloaderService.y = 0;
        this.b.set(0);
        this.c.set(0);
        DownloaderService.z.clear();
    }

    public final void j(lt0 lt0Var) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = 0;
        for (ns0 ns0Var : lt0Var.l) {
            if (!Arrays.equals(ns0Var.a.t, eu0.c)) {
                j += ns0Var.h.a;
            }
        }
        long j2 = this.e;
        if (j2 > 0) {
            long j3 = jElapsedRealtime - j2;
            if (j3 > 500) {
                this.f = ((j - this.d) * 1000.0f) / j3;
                this.d = j;
                this.e = jElapsedRealtime;
            }
        } else {
            this.d = j;
            this.e = jElapsedRealtime;
        }
        DownloaderService.w = this.f;
    }
}
