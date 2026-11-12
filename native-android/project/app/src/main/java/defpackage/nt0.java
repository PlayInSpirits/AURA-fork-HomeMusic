package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import app.homemusic.R;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nt0 {
    public static volatile nt0 l;
    public final Object a;
    public final boolean b;
    public int c;
    public int d;
    public int e;
    public int f;
    public long g;
    public long h;
    public long i;
    public float j;
    public volatile String k;

    public nt0(boolean r3) {
        this.a = new Object();
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = 0.0f;
        this.k = null;
        this.b = r3;
    }

    public final void a(Context r9) {
        int r0 = (this.d + this.e) + this.f;
        int r1 = this.c;
        if (r0 < r1) goto L27;
        if (r1 <= 0) goto L27;
        if (this.b == false) goto L25;
        NotificationManager r2 = (NotificationManager) r9.getSystemService("notification");
        r2.cancel(1012);
        StringBuilder r3 = new StringBuilder();
        StringBuilder r4 = new StringBuilder();
        int r5 = this.d;
        if (r5 > 0) goto L11;
    L13:
        if (r5 <= 0) goto L16;
        r3.append(r9.getString(R.string.notification_downloads_complete));
        r4.append(r9.getString(R.string.notification_download_mixed_saved, new Object[]{Integer.valueOf(this.d), Integer.valueOf(this.e)}));
    L18:
        s63 r6 = new s63(r9, "download_channel");
        r6.e = s63.b(r3.toString());
        r6.f = s63.b(r4.toString());
        if (this.e > 0) goto L21;
    L23:
        int r10 = R.drawable.ic_check_circle;
    L24:
        r6.v.icon = r10;
        r6.c(2, false);
        r6.c(16, false);
        r6.w = true;
        r6.i = 0;
        r6.c(8, true);
        r2.notify(1013, r6.a());
        goto L25
    L21:
        if (this.d != 0) goto L23;
        r10 = R.drawable.ic_error;
        goto L24
    L16:
        if (this.e <= 0) goto L25;
        r3.append(r9.getString(R.string.notification_download_failed));
        Resources r7 = r9.getResources();
        int r8 = this.e;
        r4.append(r7.getQuantityString(R.plurals.notification_tracks_failed, r8, new Object[]{Integer.valueOf(r8)}));
        goto L18
    L11:
        if (this.e != 0) goto L13;
        r3.append(r9.getString(R.string.notification_downloads_complete));
        Resources r11 = r9.getResources();
        int r12 = this.d;
        r4.append(r11.getQuantityString(R.plurals.notification_tracks_saved, r12, new Object[]{Integer.valueOf(r12)}));
    L25:
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = SystemClock.elapsedRealtime();
        this.j = 0.0f;
        this.k = null;
        return;
    L27:
        d(r9);
    }

    public final void b(Context r3) {
        Object r0 = this.a;
        monitor-enter(r0);
        this.e++;     // Catch: Throwable -> L7
        a(r3.getApplicationContext());     // Catch: Throwable -> L7
        monitor-exit(r0);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public final void c(Context r3) {
        Object r0 = this.a;
        monitor-enter(r0);
        this.f++;     // Catch: Throwable -> L7
        a(r3.getApplicationContext());     // Catch: Throwable -> L7
        monitor-exit(r0);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public final void d(Context r7) {
        if (this.b == true) goto L5;
        return;
    L5:
        int r0 = (this.d + this.e) + this.f;
        int r1 = this.c;
        if (this.k == null) goto L8;
        String r2 = r7.getString(R.string.notification_downloading_title, new Object[]{this.k});
    L9:
        if (r1 <= 0) goto L22;
        StringBuilder r3 = xa3.i(r7.getString(R.string.notification_download_progress_format, new Object[]{Integer.valueOf(r0), Integer.valueOf(r1)}));
        float r6 = this.j;
        if (r6 > 0.0f) goto L13;
        String r8 = " • ? KB/s";
    L21:
        r3.append(r8);
        String r9 = r3.toString();
    L23:
        s63 r4 = new s63(r7, "download_channel");
        r4.e = s63.b(r2);
        r4.f = s63.b(r9);
        r4.v.icon = R.drawable.ic_download;
        r4.m = r1;
        r4.n = r0;
        r4.c(2, true);
        r4.w = true;
        r4.i = -1;
        r4.c(8, true);
        Notification r10 = r4.a();
        ((NotificationManager) r7.getSystemService("notification")).notify(1012, r10);
        return;
    L13:
        if (r6 < 1000000.0f) goto L16;
        String r11 = String.format(Locale.US, "%.1f MB/s", new Object[]{Float.valueOf(r6 / 1000000.0f)});
    L19:
        r8 = " • ".concat(r11);
        goto L21
    L16:
        if (r6 < 1000.0f) goto L18;
        r11 = String.format(Locale.US, "%.0f KB/s", new Object[]{Float.valueOf(r6 / 1000.0f)});
        goto L19
    L18:
        r11 = String.format(Locale.US, "%.0f B/s", new Object[]{Float.valueOf(r6)});
        goto L19
    L22:
        r9 = r7.getString(R.string.notification_processing);
        goto L23
    L8:
        r2 = r7.getString(R.string.notification_downloading);
        goto L9
    }
}
