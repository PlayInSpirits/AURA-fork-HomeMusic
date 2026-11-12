package defpackage;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import app.homemusic.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class i65 {
    public static final ArrayList d = null;
    public WeakHashMap a;
    public SparseArray b;
    public WeakReference c;

    static {
        d = new ArrayList();
    }

    public final View a(View r5) {
        WeakHashMap r0 = this.a;
        if (r0 != null) goto L5;
    L21:
        return null;
    L5:
        if (r0.containsKey(r5) == false) goto L21;
        if ((r5 instanceof ViewGroup) == false) goto L15;
        ViewGroup r1 = (ViewGroup) r5;
        int r2 = r1.getChildCount() - 1;
    L10:
        if (r2 < 0) goto L15;
        View r3 = a(r1.getChildAt(r2));
        if (r3 != null) goto L13;
        r2 = r2 - 1;
        goto L10
    L13:
        return r3;
    L15:
        ArrayList r4 = (ArrayList) r5.getTag(R.id.tag_unhandled_key_listeners);
        if (r4 == null) goto L21;
        int r6 = r4.size() - 1;
        if (r6 < 0) goto L21;
        r4.get(r6).getClass();
        kf2.k();
        goto L21
    }
}
