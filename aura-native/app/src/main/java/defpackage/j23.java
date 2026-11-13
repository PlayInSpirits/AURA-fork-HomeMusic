package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class j23 extends x65 {
    public static final un0 c = new un0(3);
    public final LinkedHashMap b = new LinkedHashMap();

    @Override // defpackage.x65
    public final void b() {
        LinkedHashMap linkedHashMap = this.b;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((e75) it.next()).a();
        }
        linkedHashMap.clear();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator it = this.b.keySet().iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
