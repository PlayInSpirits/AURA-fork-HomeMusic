package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class od1 extends x65 {
    public static final un0 h = new un0(1);
    public final boolean e;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public boolean f = false;
    public boolean g = false;

    public od1(boolean z) {
        this.e = z;
    }

    @Override // defpackage.x65
    public final void b() {
        if (ld1.I(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f = true;
    }

    public final void c(kc1 kc1Var, boolean z) {
        if (ld1.I(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + kc1Var);
        }
        e(kc1Var.r, z);
    }

    public final void d(String str, boolean z) {
        if (ld1.I(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        e(str, z);
    }

    public final void e(String str, boolean z) {
        HashMap map = this.c;
        od1 od1Var = (od1) map.get(str);
        if (od1Var != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(od1Var.c.keySet());
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    od1Var.d((String) obj, true);
                }
            }
            od1Var.b();
            map.remove(str);
        }
        HashMap map2 = this.d;
        e75 e75Var = (e75) map2.get(str);
        if (e75Var != null) {
            e75Var.a();
            map2.remove(str);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && od1.class == obj.getClass()) {
            od1 od1Var = (od1) obj;
            if (this.b.equals(od1Var.b) && this.c.equals(od1Var.c) && this.d.equals(od1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final void f(kc1 kc1Var) {
        if (this.g) {
            if (ld1.I(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.b.remove(kc1Var.r) == null || !ld1.I(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + kc1Var);
        }
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
