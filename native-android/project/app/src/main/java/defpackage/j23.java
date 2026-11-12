package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class j23 extends x65 {
    public static final un0 c = null;
    public final LinkedHashMap b;

    static {
        c = new un0(3);
    }

    public j23() {
        this.b = new LinkedHashMap();
    }

    @Override // defpackage.x65
    public final void b() {
        LinkedHashMap r2 = this.b;
        Iterator r0 = r2.values().iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        ((e75) r0.next()).a();
        goto L4
    L6:
        r2.clear();
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("NavControllerViewModel{");
        r0.append(Integer.toHexString(System.identityHashCode(this)));
        r0.append("} ViewModelStores (");
        Iterator r2 = this.b.keySet().iterator();
    L4:
        if (r2.hasNext() == false) goto L8;
        r0.append((String) r2.next());
        if (r2.hasNext() == false) goto L4;
        r0.append(", ");
        goto L4
    L8:
        r0.append(')');
        return r0.toString();
    }
}
