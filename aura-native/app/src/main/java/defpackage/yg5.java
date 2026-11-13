package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class yg5 {
    public static final ge2 a = new ge2("GoogleSignInCommon", new String[0]);

    public static void a(Context context) {
        zg5.E(context).F();
        Set set = if5.b;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        if (it.hasNext()) {
            ((if5) it.next()).getClass();
            throw new UnsupportedOperationException();
        }
        synchronized (ij1.E) {
            try {
                ij1 ij1Var = ij1.F;
                if (ij1Var != null) {
                    ij1Var.v.incrementAndGet();
                    zw2 zw2Var = ij1Var.A;
                    zw2Var.sendMessageAtFrontOfQueue(zw2Var.obtainMessage(10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
