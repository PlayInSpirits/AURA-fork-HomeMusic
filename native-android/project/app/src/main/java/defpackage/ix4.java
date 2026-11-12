package defpackage;

import android.view.ViewGroup;
import app.homemusic.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ix4 {
    public static final rn a = new rn();
    public static final ThreadLocal b = new ThreadLocal();
    public static final ArrayList c = new ArrayList();

    public static void a(ViewGroup viewGroup, dx4 dx4Var) {
        ArrayList arrayList = c;
        if (arrayList.contains(viewGroup)) {
            return;
        }
        WeakHashMap weakHashMap = j65.a;
        if (viewGroup.isLaidOut()) {
            arrayList.add(viewGroup);
            if (dx4Var == null) {
                dx4Var = a;
            }
            dx4 dx4VarClone = dx4Var.clone();
            ArrayList arrayList2 = (ArrayList) b().get(viewGroup);
            if (arrayList2 != null && arrayList2.size() > 0) {
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    ((dx4) obj).t(viewGroup);
                }
            }
            if (dx4VarClone != null) {
                dx4VarClone.g(viewGroup, true);
            }
            if (viewGroup.getTag(R.id.transition_current_scene) != null) {
                kf2.k();
                return;
            }
            viewGroup.setTag(R.id.transition_current_scene, null);
            if (dx4VarClone != null) {
                hx4 hx4Var = new hx4();
                hx4Var.n = dx4VarClone;
                hx4Var.o = viewGroup;
                viewGroup.addOnAttachStateChangeListener(hx4Var);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(hx4Var);
            }
        }
    }

    public static oi b() {
        oi oiVar;
        ThreadLocal threadLocal = b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (oiVar = (oi) weakReference.get()) != null) {
            return oiVar;
        }
        oi oiVar2 = new oi(0);
        threadLocal.set(new WeakReference(oiVar2));
        return oiVar2;
    }
}
