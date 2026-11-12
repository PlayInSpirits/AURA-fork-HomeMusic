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
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fu0 implements jt0 {
    public final Context a;
    public final AtomicInteger b;
    public final AtomicInteger c;
    public long d;
    public long e;
    public float f;

    public fu0(DownloaderService r3) {
        this.b = new AtomicInteger(0);
        this.c = new AtomicInteger(0);
        this.d = 0;
        this.e = 0;
        this.f = 0.0f;
        this.a = r3.getApplicationContext();
    }

    public static void h(ns0 r3) {
        String r4 = r3.a.n;
        if (DownloaderService.z.containsKey(r4) == true) goto L16;
        byte[] r0 = eu0.c;
        pb0 r1 = new pb0(AppDatabase.y().w(), r4, 1);
        Thread r2 = new Thread(r1);
        r2.start();
        String r5 = null;
        r2.join();     // Catch: InterruptedException -> L7
        Download r6 = (Download) r1.q;     // Catch: InterruptedException -> L7
    L9:
        if (r6 == null) goto L11;
        r5 = r6.getTitle();
    L11:
        if (r5 == null) goto L17;
        DownloaderService.z.put(r4, r5);
        return;
    L17:
        return;
    L7:
        e = move-exception;
        e.printStackTrace();
        r6 = null;
        goto L9
    }

    @Override // defpackage.jt0
    public final void b(lt0 r7, ns0 r8) {
        boolean r0 = Arrays.equals(r8.a.t, eu0.c);
        int r1 = r8.b;
        if (r0 == false) goto L10;
        if (r1 != 3) goto L7;
        eu0.h(r8);
        return;
    L7:
        if (r1 != 4) goto L33;
        eu0.e.remove(r8.a.n);
        return;
    L33:
        return;
    L10:
        if (r1 != 0) goto L12;
        i(r7);
        j(r7);
        h(r8);
        return;
    L12:
        if (r1 == 2) goto L29;
        if (r1 == 3) goto L17;
        if (r1 != 4) goto L35;
        eu0.e.remove(r8.a.n);
        this.c.incrementAndGet();
        int r9 = this.b.get();
        DownloaderService.y = this.c.get() + r9;
    L19:
        if (r7.l.stream().noneMatch(new c7(12)) == false) goto L34;
        Context r10 = this.a;
        int r11 = this.b.get();
        int r2 = this.c.get();
        if (r11 <= 0) goto L24;
        if (r2 != 0) goto L24;
        String r12 = r10.getResources().getQuantityString(R.plurals.notification_tracks_downloaded, r11, new Object[]{Integer.valueOf(r11)});
        Notification r13 = g(R.drawable.ic_check_circle, r10.getString(R.string.notification_downloads_complete), r12);
    L27:
        ((NotificationManager) r10.getSystemService("notification")).notify(2, r13);
        this.b.set(0);
        this.c.set(0);
        this.f = 0.0f;
        DownloaderService.w = 0.0f;
        DownloaderService.x = 0;
        DownloaderService.y = 0;
        DownloaderService.z.clear();
        this.d = 0;
        this.e = 0;
        return;
    L24:
        if (r11 <= 0) goto L26;
        String r14 = r10.getString(R.string.notification_download_mixed_result, new Object[]{Integer.valueOf(r11), Integer.valueOf(r2)});
        r13 = g(R.drawable.ic_check_circle, r10.getString(R.string.notification_downloads_complete), r14);
        goto L27
    L26:
        String r15 = r10.getResources().getQuantityString(R.plurals.notification_tracks_failed, r2, new Object[]{Integer.valueOf(r2)});
        r13 = g(R.drawable.ic_error, r10.getString(R.string.notification_download_failed), r15);
        goto L27
    L34:
        return;
    L35:
        return;
    L17:
        this.b.incrementAndGet();
        DownloaderService.y = this.b.get();
        eu0.h(r8);
        goto L19
    L29:
        i(r7);
        j(r7);
        h(r8);
    }

    @Override // defpackage.jt0
    public final void d(ns0 r4) {
        byte[] r3 = eu0.c;
        String r5 = r4.a.n;
        new Thread(new qt0(AppDatabase.y().w(), r5, 0)).start();
        HashMap r6 = eu0.d;
        tt0 r7 = r4.a;
        r6.remove(r7.n);
        eu0.e.remove(r7.n);
    }

    public final Notification g(int r3, String r4, String r5) {
        s63 r0 = new s63(this.a, "download_channel");
        r0.e = s63.b(r4);
        r0.f = s63.b(r5);
        r0.v.icon = r3;
        r0.c(2, false);
        r0.c(16, false);
        r0.w = true;
        r0.i = 0;
        r0.c(8, true);
        return r0.a();
    }

    public final void i(lt0 r3) {
        int r4 = (int) r3.l.stream().filter(new c7(13)).count();
        if (r4 <= DownloaderService.x) goto L7;
        DownloaderService.x = r4;
        return;
    L7:
        if (DownloaderService.x > 0) goto L9;
        return;
    L9:
        if (DownloaderService.y >= DownloaderService.x) goto L11;
        return;
    L11:
        if (r4 != 1) goto L16;
        DownloaderService.x = 0;
        DownloaderService.y = 0;
        this.b.set(0);
        this.c.set(0);
        DownloaderService.z.clear();
        return;
    }

    public final void j(lt0 r10) {
        long r0 = SystemClock.elapsedRealtime();
        Iterator r11 = r10.l.iterator();
        long r4 = 0;
    L4:
        if (r11.hasNext() == false) goto L8;
        ns0 r6 = (ns0) r11.next();
        if (Arrays.equals(r6.a.t, eu0.c) == true) goto L4;
        r4 = r4 + r6.h.a;
        goto L4
    L8:
        long r7 = this.e;
        if (r7 <= 0) goto L13;
        long r2 = r0 - r7;
        if (r2 <= 500) goto L14;
        this.f = ((r4 - this.d) * 1000.0f) / r2;
        this.d = r4;
        this.e = r0;
    L14:
        DownloaderService.w = this.f;
        return;
    L13:
        this.d = r4;
        this.e = r0;
        goto L14
    }
}
