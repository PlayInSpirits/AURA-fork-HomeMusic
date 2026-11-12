package defpackage;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class th {
    public static final Class[] b = null;
    public static final int[] c = null;
    public static final int[] d = null;
    public static final int[] e = null;
    public static final int[] f = null;
    public static final String[] g = null;
    public static final yd4 h = null;
    public final Object[] a;

    static {
        b = new Class[]{Context.class, AttributeSet.class};
        c = new int[]{R.attr.onClick};
        d = new int[]{R.attr.accessibilityHeading};
        e = new int[]{R.attr.accessibilityPaneTitle};
        f = new int[]{R.attr.screenReaderFocusable};
        g = new String[]{"android.widget.", "android.view.", "android.webkit."};
        h = new yd4(0);
    }

    public th() {
        this.a = new Object[2];
    }

    public ef a(Context r2, AttributeSet r3) {
        return new ef(r2, r3, app.homemusic.R.attr.autoCompleteTextViewStyle);
    }

    public ff b(Context r2, AttributeSet r3) {
        return new ff(r2, r3, app.homemusic.R.attr.buttonStyle);
    }

    public hf c(Context r2, AttributeSet r3) {
        return new hf(r2, r3, app.homemusic.R.attr.checkboxStyle);
    }

    public mg d(Context r1, AttributeSet r2) {
        return new mg(r1, r2);
    }

    public mh e(Context r1, AttributeSet r2) {
        return new mh(r1, r2);
    }

    public final View f(Context r3, String r4, String r5) {
        yd4 r0 = h;
        Constructor r1 = (Constructor) r0.get(r4);
        if (r1 != null) goto L8;
        if (r5 != null) goto L12;
        String r6 = r4;
    L7:
        r1 = Class.forName(r6, false, r3.getClassLoader()).asSubclass(View.class).getConstructor(b);     // Catch: Exception -> L10
        r0.put(r4, r1);     // Catch: Exception -> L10
        goto L8
    L12:
        r6 = r5.concat(r4);     // Catch: Exception -> L10
    L10:
        return null;
    L8:
        r1.setAccessible(true);     // Catch: Exception -> L10
        return (View) r1.newInstance(this.a);
    }
}
