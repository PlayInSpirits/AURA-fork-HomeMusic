package defpackage;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class if5 {
    public static final Set b = null;
    public final dj1 a;

    static {
        b = Collections.newSetFromMap(new WeakHashMap());
    }

    public if5(dj1 r1) {
        this.a = r1;
    }

    public final wg5 a(wg5 r5) {
        boolean r1 = true;
        if (r5.i == false) goto L5;
    L8:
        r5.i = r1;
        dj1 r4 = this.a;
        ij1 r0 = r4.j;
        r0.getClass();
        pf5 r3 = new pf5(new vf5(r5), r0.v.get(), r4);
        zw2 r6 = r0.A;
        r6.sendMessage(r6.obtainMessage(4, r3));
        return r5;
    L5:
        if (((Boolean) BasePendingResult.j.get()).booleanValue() == true) goto L8;
        r1 = false;
        goto L8
    }
}
