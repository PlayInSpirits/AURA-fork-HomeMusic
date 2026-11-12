package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.os.Handler;
import app.homemusic.R;
import com.eddyizm.tempus.service.DownloaderService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class la0 implements kg1 {
    public boolean n;
    public boolean o;
    public Object p;
    public Object q;

    public la0() {
        this.n = true;
    }

    public ma0 a() {
        return new ma0(this.n, this.o, (String[]) this.p, (String[]) this.q);
    }

    public void b(v20... r7) {
        if (this.n == false) goto L15;
        ArrayList r0 = new ArrayList(r7.length);
        int r2 = r7.length;
        int r4 = 0;
    L5:
        if (r4 >= r2) goto L7;
        r0.add(r7[r4].a);
        r4 = r4 + 1;
        goto L5
    L7:
        String[] r8 = (String[]) r0.toArray(new String[0]);
        String[] r9 = (String[]) Arrays.copyOf(r8, r8.length);
        if (this.n == true) goto L10;
        kf2.n("no cipher suites for cleartext connections");
        return;
    L10:
        if (r9.length == 0) goto L12;
        this.p = (String[]) Arrays.copyOf(r9, r9.length);
        return;
    L12:
        kf2.n("At least one cipher suite is required");
        return;
    L15:
        kf2.n("no cipher suites for cleartext connections");
    }

    public void c(mu4... r7) {
        if (this.n == false) goto L15;
        ArrayList r0 = new ArrayList(r7.length);
        int r2 = r7.length;
        int r4 = 0;
    L5:
        if (r4 >= r2) goto L7;
        r0.add(r7[r4].n);
        r4 = r4 + 1;
        goto L5
    L7:
        String[] r8 = (String[]) r0.toArray(new String[0]);
        String[] r9 = (String[]) Arrays.copyOf(r8, r8.length);
        if (this.n == true) goto L10;
        kf2.n("no TLS versions for cleartext connections");
        return;
    L10:
        if (r9.length == 0) goto L12;
        this.q = (String[]) Arrays.copyOf(r9, r9.length);
        return;
    L12:
        kf2.n("At least one TLS version is required");
        return;
    L15:
        kf2.n("no TLS versions for cleartext connections");
    }

    public void d() {
        ut0 r0 = ((vt0) this.q).q;
        r0.getClass();
        List r1 = r0.b.l;
        DownloaderService r2 = (DownloaderService) ((vt0) this.q);
        List r3 = (List) r1.stream().filter(new c7(11)).collect(Collectors.toList());
        if (r3.isEmpty() == false) goto L5;
        s63 r4 = new s63(r2, "download_channel");
        r4.e = s63.b(r2.getString(R.string.homemusic_offline_sync_notification));
        r4.v.icon = R.drawable.ic_download;
        r4.c(2, true);
        r4.w = true;
        r4.i = -1;
        Notification r5 = r4.a();
    L38:
        boolean r6 = this.o;
        vt0 r7 = (vt0) this.q;
        if (r6 == true) goto L41;
        f35.c0(r7, 1, r5, 1, "dataSync");
        this.o = true;
    L43:
        if (this.n == false) goto L55;
        ((Handler) this.p).removeCallbacksAndMessages(null);
        ((Handler) this.p).postDelayed(new a0(24, this), 1000);
        return;
    L55:
        return;
    L41:
        ((NotificationManager) r7.getSystemService("notification")).notify(1, r5);
        goto L43
    L5:
        int r8 = Math.max(DownloaderService.x, r3.size());
        int r9 = DownloaderService.y;
        Iterator r10 = r3.iterator();
    L7:
        if (r10.hasNext() == false) goto L11;
        ns0 r11 = (ns0) r10.next();
        if (r11.b != 2) goto L7;
        String r12 = (String) DownloaderService.z.get(r11.a.n);
    L12:
        if (r12 != null) goto L20;
        Iterator r13 = r3.iterator();
    L15:
        if (r13.hasNext() == false) goto L20;
        ns0 r14 = (ns0) r13.next();
        if (r14.b == 3) goto L15;
        r12 = (String) DownloaderService.z.get(r14.a.n);
        if (r12 == null) goto L15;
    L20:
        if (r12 == null) goto L22;
        String r15 = r2.getString(R.string.notification_downloading_title, new Object[]{r12});
    L23:
        if (r8 <= 0) goto L36;
        StringBuilder r16 = xa3.i(r2.getString(R.string.notification_download_progress_format, new Object[]{Integer.valueOf(Math.min(r9 + 1, r8)), Integer.valueOf(r8)}));
        if (DownloaderService.w <= 0.0f) goto L34;
        StringBuilder r17 = new StringBuilder(" • ");
        float r18 = DownloaderService.w;
        if (r18 < 1000000.0f) goto L30;
        String r19 = String.format(Locale.US, "%.1f MB/s", new Object[]{Float.valueOf(r18 / 1000000.0f)});
    L33:
        r17.append(r19);
        String r110 = r17.toString();
    L35:
        r16.append(r110);
        String r111 = r16.toString();
    L37:
        s63 r112 = new s63(r2, "download_channel");
        r112.e = s63.b(r15);
        r112.f = s63.b(r111);
        r112.v.icon = R.drawable.ic_download;
        r112.m = r8;
        r112.n = r9;
        r112.c(2, true);
        r112.w = true;
        r112.i = -1;
        r112.c(8, true);
        r5 = r112.a();
        goto L38
    L30:
        if (r18 < 1000.0f) goto L32;
        r19 = String.format(Locale.US, "%.0f KB/s", new Object[]{Float.valueOf(r18 / 1000.0f)});
        goto L33
    L32:
        r19 = String.format(Locale.US, "%.0f B/s", new Object[]{Float.valueOf(r18)});
        goto L33
    L34:
        r110 = " • ? KB/s";
        goto L35
    L36:
        r111 = r2.getString(R.string.notification_downloading_progress);
        goto L37
    L22:
        r15 = r2.getString(R.string.notification_downloading);
        goto L23
    L11:
        r12 = null;
        goto L12
    }

    @Override // defpackage.kg1
    public void h(Object r8) {
        final gr2 r2 = (gr2) r8;
        tn2 r9 = ((ls2) this.q).g;
        Handler r6 = r9.l;
        final fr2 r5 = (fr2) this.p;
        final boolean r3 = this.n;
        final boolean r4 = this.o;
        f35.W(r6, new ur2(r9, r5, new gs2(this, r2, r3, r4, r5)));
    }

    @Override // defpackage.kg1
    public void o(Throwable r1) {
    }
}
