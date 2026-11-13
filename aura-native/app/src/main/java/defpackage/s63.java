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

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class s63 {
    public final Context a;
    public CharSequence e;
    public CharSequence f;
    public PendingIntent g;
    public IconCompat h;
    public int i;
    public boolean k;
    public rp l;
    public int m;
    public int n;
    public String o;
    public Bundle q;
    public String s;
    public final boolean u;
    public final Notification v;
    public boolean w;
    public final ArrayList x;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public boolean j = true;
    public boolean p = false;
    public int r = 0;
    public int t = 0;

    public s63(Context context, String str) {
        Notification notification = new Notification();
        this.v = notification;
        this.a = context;
        this.s = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.i = 0;
        this.x = new ArrayList();
        this.u = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        return charSequence == null ? charSequence : charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final Notification a() {
        Notification build;
        Bundle bundle;
        String i;
        gc gcVar = new gc(this);
        s63 s63Var = (s63) gcVar.c;
        rp rpVar = s63Var.l;
        if (rpVar != null) {
            rpVar.c(gcVar);
        }
        int i2 = gcVar.a;
        int i3 = Build.VERSION.SDK_INT;
        Notification.Builder builder = (Notification.Builder) gcVar.b;
        if (i3 >= 26) {
            build = builder.build();
        } else {
            build = builder.build();
            if (i2 != 0) {
                if (build.getGroup() != null && (build.flags & 512) != 0 && i2 == 2) {
                    build.sound = null;
                    build.vibrate = null;
                    build.defaults &= -4;
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && i2 == 1) {
                    build.sound = null;
                    build.vibrate = null;
                    build.defaults &= -4;
                }
            }
        }
        if (rpVar != null) {
            s63Var.l.getClass();
        }
        if (rpVar != null && (bundle = build.extras) != null && (i = rpVar.i()) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", i);
        }
        return build;
    }

    public final void c(int i, boolean z) {
        Notification notification = this.v;
        if (z) {
            notification.flags = i | notification.flags;
        } else {
            notification.flags = (~i) & notification.flags;
        }
    }

    public final void d(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.k;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.b = bitmap;
            iconCompat = iconCompat2;
        }
        this.h = iconCompat;
    }

    public final void e(rp rpVar) {
        if (this.l != rpVar) {
            this.l = rpVar;
            if (((s63) rpVar.a) != this) {
                rpVar.a = this;
                e(rpVar);
            }
        }
    }
}
