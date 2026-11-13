package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class b52 implements kk1 {
    public final ArrayList a;

    public b52() {
        this.a = new ArrayList();
    }

    public synchronized w04 a(Class cls) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            x04 x04Var = (x04) this.a.get(i);
            if (x04Var.a.isAssignableFrom(cls)) {
                return x04Var.b;
            }
        }
        return null;
    }

    @Override // defpackage.kk1
    public Object keyOf(Object obj) {
        return (String) obj;
    }

    @Override // defpackage.kk1
    public Iterator sourceIterator() {
        return this.a.iterator();
    }

    public b52(ArrayList arrayList) {
        this.a = arrayList;
    }
}
