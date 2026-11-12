package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import app.homemusic.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class s63 {
    public final Context a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public CharSequence e;
    public CharSequence f;
    public PendingIntent g;
    public IconCompat h;
    public int i;
    public boolean j;
    public boolean k;
    public rp l;
    public int m;
    public int n;
    public String o;
    public boolean p;
    public Bundle q;
    public int r;
    public String s;
    public int t;
    public final boolean u;
    public final Notification v;
    public boolean w;
    public final ArrayList x;

    public s63(Context r4, String r5) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.j = true;
        this.p = false;
        this.r = 0;
        this.t = 0;
        Notification r2 = new Notification();
        this.v = r2;
        this.a = r4;
        this.s = r5;
        r2.when = System.currentTimeMillis();
        r2.audioStreamType = -1;
        this.i = 0;
        this.x = new ArrayList();
        this.u = true;
    }

    public static CharSequence b(CharSequence r2) {
        if (r2 != null) goto L5;
        return r2;
    L5:
        if (r2.length() > 5120) goto L7;
        return r2;
    L7:
        return r2.subSequence(0, 5120);
    }

    public final Notification a() {
        gc r0 = new gc(this);
        s63 r5 = (s63) r0.c;
        rp r1 = r5.l;
        if (r1 == null) goto L5;
        r1.c(r0);
    L5:
        int r2 = r0.a;
        int r3 = Build.VERSION.SDK_INT;
        Notification.Builder r4 = (Notification.Builder) r0.b;
        if (r3 < 26) goto L8;
        Notification r6 = r4.build();
    L24:
        if (r1 == null) goto L26;
        r5.l.getClass();
    L26:
        if (r1 == null) goto L32;
        Bundle r7 = r6.extras;
        if (r7 == null) goto L32;
        String r8 = r1.i();
        if (r8 == null) goto L32;
        r7.putString("androidx.core.app.extra.COMPAT_TEMPLATE", r8);
    L32:
        return r6;
    L8:
        r6 = r4.build();
        if (r2 == 0) goto L24;
        if (r6.getGroup() == null) goto L18;
        if ((r6.flags & 512) == 0) goto L18;
        if (r2 != 2) goto L18;
        r6.sound = null;
        r6.vibrate = null;
        r6.defaults &= -4;
    L18:
        if (r6.getGroup() == null) goto L24;
        if ((r6.flags & 512) != 0) goto L24;
        if (r2 != 1) goto L24;
        r6.sound = null;
        r6.vibrate = null;
        r6.defaults &= -4;
        goto L24
    }

    public final void c(int r1, boolean r2) {
        Notification r0 = this.v;
        if (r2 == false) goto L6;
        r0.flags = r1 | r0.flags;
        return;
    L6:
        int r3 = r0.flags;
        r0.flags = (~r1) & r3;
    }

    public final void d(Bitmap r8) {
        if (r8 != null) goto L5;
        IconCompat r9 = null;
    L14:
        this.h = r9;
        return;
    L5:
        if (Build.VERSION.SDK_INT >= 27) goto L13;
        Resources r0 = this.a.getResources();
        int r1 = r0.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
        int r2 = r0.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
        if (r8.getWidth() <= r1) goto L10;
    L12:
        double r3 = Math.min(((double) r1) / ((double) Math.max(1, r8.getWidth())), ((double) r2) / ((double) Math.max(1, r8.getHeight())));
        r8 = Bitmap.createScaledBitmap(r8, (int) Math.ceil(((double) r8.getWidth()) * r3), (int) Math.ceil(((double) r8.getHeight()) * r3), true);
        goto L13
    L10:
        if (r8.getHeight() > r2) goto L12;
    L13:
        PorterDuff.Mode r4 = IconCompat.k;
        r8.getClass();
        IconCompat r5 = new IconCompat(1);
        r5.b = r8;
        r9 = r5;
        goto L14
    }

    public final void e(rp r2) {
        if (this.l == r2) goto L8;
        this.l = r2;
        if (((s63) r2.a) == this) goto L9;
        r2.a = this;
        e(r2);
        return;
    L9:
        return;
    }
}
