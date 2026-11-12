package defpackage;

import android.os.Bundle;
import android.text.Spanned;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class yg0 {
    public static final String a = null;
    public static final String b = null;
    public static final String c = null;
    public static final String d = null;
    public static final String e = null;

    static {
        String r0 = f35.a;
        a = Integer.toString(0, 36);
        b = Integer.toString(1, 36);
        c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
        e = Integer.toString(4, 36);
    }

    public static Bundle a(Spanned r3, Object r4, int r5, Bundle r6) {
        Bundle r0 = new Bundle();
        r0.putInt(a, r3.getSpanStart(r4));
        r0.putInt(b, r3.getSpanEnd(r4));
        r0.putInt(c, r3.getSpanFlags(r4));
        r0.putInt(d, r5);
        if (r6 == null) goto L5;
        r0.putBundle(e, r6);
    L5:
        return r0;
    }
}
