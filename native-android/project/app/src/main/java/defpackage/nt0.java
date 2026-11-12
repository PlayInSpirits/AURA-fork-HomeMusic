package defpackage;

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
    public final boolean b;
    public final Object a = new Object();
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public long g = 0;
    public long h = 0;
    public long i = 0;
    public float j = 0.0f;
    public volatile String k = null;

    public nt0(boolean z) {
        this.b = z;
    }

    public final void a(Context context) {
        int i = this.d + this.e + this.f;
        int i2 = this.c;
        if (i < i2 || i2 <= 0) {
            d(context);
            return;
        }
        if (this.b) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            notificationManager.cancel(1012);
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            int i3 = this.d;
            if (i3 > 0 && this.e == 0) {
                sb.append(context.getString(R.string.notification_downloads_complete));
                Resources resources = context.getResources();
                int i4 = this.d;
                sb2.append(resources.getQuantityString(R.plurals.notification_tracks_saved, i4, Integer.valueOf(i4)));
            } else if (i3 > 0) {
                sb.append(context.getString(R.string.notification_downloads_complete));
                sb2.append(context.getString(R.string.notification_download_mixed_saved, Integer.valueOf(this.d), Integer.valueOf(this.e)));
            } else if (this.e > 0) {
                sb.append(context.getString(R.string.notification_download_failed));
                Resources resources2 = context.getResources();
                int i5 = this.e;
                sb2.append(resources2.getQuantityString(R.plurals.notification_tracks_failed, i5, Integer.valueOf(i5)));
            }
            s63 s63Var = new s63(context, "download_channel");
            s63Var.e = s63.b(sb.toString());
            s63Var.f = s63.b(sb2.toString());
            s63Var.v.icon = (this.e <= 0 || this.d != 0) ? R.drawable.ic_check_circle : R.drawable.ic_error;
            s63Var.c(2, false);
            s63Var.c(16, false);
            s63Var.w = true;
            s63Var.i = 0;
            s63Var.c(8, true);
            notificationManager.notify(1013, s63Var.a());
        }
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0L;
        this.h = 0L;
        this.i = SystemClock.elapsedRealtime();
        this.j = 0.0f;
        this.k = null;
    }

    public final void b(Context context) {
        synchronized (this.a) {
            this.e++;
            a(context.getApplicationContext());
        }
    }

    public final void c(Context context) {
        synchronized (this.a) {
            this.f++;
            a(context.getApplicationContext());
        }
    }

    public final void d(Context context) {
        String string;
        String strConcat;
        String str;
        if (this.b) {
            int i = this.d + this.e + this.f;
            int i2 = this.c;
            String string2 = this.k != null ? context.getString(R.string.notification_downloading_title, this.k) : context.getString(R.string.notification_downloading);
            if (i2 > 0) {
                StringBuilder sbI = xa3.i(context.getString(R.string.notification_download_progress_format, Integer.valueOf(i), Integer.valueOf(i2)));
                float f = this.j;
                if (f > 0.0f) {
                    if (f >= 1000000.0f) {
                        str = String.format(Locale.US, "%.1f MB/s", Float.valueOf(f / 1000000.0f));
                    } else {
                        str = f >= 1000.0f ? String.format(Locale.US, "%.0f KB/s", Float.valueOf(f / 1000.0f)) : String.format(Locale.US, "%.0f B/s", Float.valueOf(f));
                    }
                    strConcat = " • ".concat(str);
                } else {
                    strConcat = " • ? KB/s";
                }
                sbI.append(strConcat);
                string = sbI.toString();
            } else {
                string = context.getString(R.string.notification_processing);
            }
            s63 s63Var = new s63(context, "download_channel");
            s63Var.e = s63.b(string2);
            s63Var.f = s63.b(string);
            s63Var.v.icon = R.drawable.ic_download;
            s63Var.m = i2;
            s63Var.n = i;
            s63Var.c(2, true);
            s63Var.w = true;
            s63Var.i = -1;
            s63Var.c(8, true);
            ((NotificationManager) context.getSystemService("notification")).notify(1012, s63Var.a());
        }
    }
}
