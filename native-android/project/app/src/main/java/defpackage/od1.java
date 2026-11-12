package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class od1 extends x65 {
    public static final un0 h = null;
    public final HashMap b;
    public final HashMap c;
    public final HashMap d;
    public final boolean e;
    public boolean f;
    public boolean g;

    static {
        h = new un0(1);
    }

    public od1(boolean r2) {
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.f = false;
        this.g = false;
        this.e = r2;
    }

    @Override // defpackage.x65
    public final void b() {
        if (ld1.I(3) == false) goto L5;
        Log.d("FragmentManager", "onCleared called for " + this);
    L5:
        this.f = true;
    }

    public final void c(kc1 r3, boolean r4) {
        if (ld1.I(3) == false) goto L5;
        Log.d("FragmentManager", "Clearing non-config state for " + r3);
    L5:
        e(r3.r, r4);
    }

    public final void d(String r3, boolean r4) {
        if (ld1.I(3) == false) goto L5;
        Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + r3);
    L5:
        e(r3, r4);
    }

    public final void e(String r7, boolean r8) {
        HashMap r0 = this.c;
        od1 r1 = (od1) r0.get(r7);
        if (r1 == null) goto L9;
        if (r8 == false) goto L8;
        ArrayList r9 = new ArrayList();
        r9.addAll(r1.c.keySet());
        int r2 = r9.size();
        int r3 = 0;
    L6:
        if (r3 >= r2) goto L8;
        Object r4 = r9.get(r3);
        r3 = r3 + 1;
        r1.d((String) r4, true);
    L8:
        r1.b();
        r0.remove(r7);
    L9:
        HashMap r6 = this.d;
        e75 r10 = (e75) r6.get(r7);
        if (r10 == null) goto L14;
        r10.a();
        r6.remove(r7);
        return;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L17:
        return false;
    L8:
        if (od1.class != r5.getClass()) goto L17;
        od1 r6 = (od1) r5;
        if (this.b.equals(r6.b) == false) goto L17;
        if (this.c.equals(r6.c) == false) goto L17;
        if (this.d.equals(r6.d) == false) goto L17;
        return true;
    }

    public final void f(kc1 r4) {
        if (this.g == false) goto L9;
        if (ld1.I(2) == false) goto L14;
        Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
        return;
    L14:
        return;
    L9:
        if (this.b.remove(r4.r) != null) goto L11;
        return;
    L11:
        if (ld1.I(2) == false) goto L16;
        Log.v("FragmentManager", "Updating retained Fragments: Removed " + r4);
        return;
    }

    public final int hashCode() {
        int r0 = this.b.hashCode() * 31;
        int r1 = (this.c.hashCode() + r0) * 31;
        return this.d.hashCode() + r1;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("FragmentManagerViewModel{");
        r0.append(Integer.toHexString(System.identityHashCode(this)));
        r0.append("} Fragments (");
        Iterator r1 = this.b.values().iterator();
    L4:
        if (r1.hasNext() == false) goto L8;
        r0.append(r1.next());
        if (r1.hasNext() == false) goto L4;
        r0.append(", ");
        goto L4
    L8:
        r0.append(") Child Non Config (");
        Iterator r2 = this.c.keySet().iterator();
    L10:
        if (r2.hasNext() == false) goto L14;
        r0.append((String) r2.next());
        if (r2.hasNext() == false) goto L10;
        r0.append(", ");
        goto L10
    L14:
        r0.append(") ViewModelStores (");
        Iterator r4 = this.d.keySet().iterator();
    L16:
        if (r4.hasNext() == false) goto L20;
        r0.append((String) r4.next());
        if (r4.hasNext() == false) goto L16;
        r0.append(", ");
        goto L16
    L20:
        r0.append(')');
        return r0.toString();
    }
}
