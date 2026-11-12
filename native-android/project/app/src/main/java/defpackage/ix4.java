package defpackage;

import android.view.ViewGroup;
import app.homemusic.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ix4 {
    public static final rn a = null;
    public static final ThreadLocal b = null;
    public static final ArrayList c = null;

    static {
        a = new rn();
        b = new ThreadLocal();
        c = new ArrayList();
    }

    public static void a(ViewGroup r4, dx4 r5) {
        ArrayList r0 = c;
        if (r0.contains(r4) == true) goto L27;
        WeakHashMap r1 = j65.a;
        if (r4.isLaidOut() == false) goto L28;
        r0.add(r4);
        if (r5 != null) goto L9;
        r5 = a;
    L9:
        dx4 r6 = r5.i();
        ArrayList r2 = (ArrayList) b().get(r4);
        if (r2 != null) goto L12;
    L16:
        if (r6 == null) goto L19;
        r6.g(r4, true);
    L19:
        if (r4.getTag(R.id.transition_current_scene) != null) goto L24;
        r4.setTag(R.id.transition_current_scene, null);
        if (r6 == null) goto L29;
        hx4 r3 = new hx4();
        r3.n = r6;
        r3.o = r4;
        r4.addOnAttachStateChangeListener(r3);
        r4.getViewTreeObserver().addOnPreDrawListener(r3);
        return;
    L29:
        return;
    L24:
        kf2.k();
        return;
    L12:
        if (r2.size() <= 0) goto L16;
        int r7 = r2.size();
        int r8 = 0;
    L14:
        if (r8 >= r7) goto L16;
        Object r9 = r2.get(r8);
        r8 = r8 + 1;
        ((dx4) r9).t(r4);
        goto L14
    L28:
        return;
    }

    public static oi b() {
        ThreadLocal r0 = b;
        WeakReference r1 = (WeakReference) r0.get();
        if (r1 == null) goto L7;
        oi r2 = (oi) r1.get();
        if (r2 == null) goto L7;
        return r2;
    L7:
        oi r3 = new oi(0);
        r0.set(new WeakReference(r3));
        return r3;
    }
}
