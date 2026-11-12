package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ie0 implements Iterable {
    public final Object n = new Object();
    public final HashMap o = new HashMap();
    public Set p = Collections.EMPTY_SET;
    public List q = Collections.EMPTY_LIST;

    public final int a(sw0 sw0Var) {
        int iIntValue;
        synchronized (this.n) {
            try {
                iIntValue = this.o.containsKey(sw0Var) ? ((Integer) this.o.get(sw0Var)).intValue() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iIntValue;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it;
        synchronized (this.n) {
            it = this.q.iterator();
        }
        return it;
    }
}
