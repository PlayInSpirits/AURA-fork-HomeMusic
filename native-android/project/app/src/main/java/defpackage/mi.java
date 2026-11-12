package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mi implements Iterator, Map.Entry {
    public int n;
    public int o = -1;
    public boolean p;
    public final /* synthetic */ oi q;

    public mi(oi oiVar) {
        this.q = oiVar;
        this.n = oiVar.p - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.p) {
            kf2.o("This container does not support retaining Map.Entry objects");
            return false;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i = this.o;
            oi oiVar = this.q;
            if (h12.c(key, oiVar.f(i)) && h12.c(entry.getValue(), oiVar.j(this.o))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.p) {
            return this.q.f(this.o);
        }
        kf2.o("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.p) {
            return this.q.j(this.o);
        }
        kf2.o("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.o < this.n;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.p) {
            kf2.o("This container does not support retaining Map.Entry objects");
            return 0;
        }
        int i = this.o;
        oi oiVar = this.q;
        Object objF = oiVar.f(i);
        Object objJ = oiVar.j(this.o);
        return (objF == null ? 0 : objF.hashCode()) ^ (objJ != null ? objJ.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            tb4.k();
            return null;
        }
        this.o++;
        this.p = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.p) {
            tb4.a();
            return;
        }
        this.q.h(this.o);
        this.o--;
        this.n--;
        this.p = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.p) {
            return this.q.i(this.o, obj);
        }
        kf2.o("This container does not support retaining Map.Entry objects");
        return null;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
