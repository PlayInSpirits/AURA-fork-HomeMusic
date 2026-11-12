package defpackage;

import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class q63 {
    public final Bundle a;
    public IconCompat b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final CharSequence f;
    public final PendingIntent g;

    public q63(IconCompat r10, CharSequence r11, PendingIntent r12) {
        Bundle r0 = new Bundle();
        this.d = true;
        this.b = r10;
        if (r10 == null) goto L24;
        int r2 = r10.a;
        if (r2 != (-1)) goto L22;
        Object r3 = r10.b;
        if (Build.VERSION.SDK_INT < 28) goto L26;
        r2 = ne.p(r3);
        goto L22
    L26:
        r2 = ((Integer) r3.getClass().getMethod("getType", null).invoke(r3, null)).intValue();     // Catch: NoSuchMethodException -> L11 InvocationTargetException -> L13 IllegalAccessException -> L15
    L15:
        e = move-exception;
        Log.e("IconCompat", "Unable to get icon type " + r3, e);
    L20:
        r2 = -1;
    L11:
        e = move-exception;
        Log.e("IconCompat", "Unable to get icon type " + r3, e);
    L13:
        e = move-exception;
        Log.e("IconCompat", "Unable to get icon type " + r3, e);
    L22:
        if (r2 != 2) goto L24;
        this.e = r10.c();
    L24:
        this.f = s63.b(r11);
        this.g = r12;
        this.a = r0;
        this.c = true;
        this.d = true;
    }
}
