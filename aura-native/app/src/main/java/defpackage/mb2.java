package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class mb2 implements Map.Entry {
    public mb2 n;
    public mb2 o;
    public mb2 p;
    public mb2 q;
    public mb2 r;
    public final Object s;
    public final boolean t;
    public Object u;
    public int v;

    public mb2(boolean z, mb2 mb2Var, Object obj, mb2 mb2Var2, mb2 mb2Var3) {
        this.n = mb2Var;
        this.s = obj;
        this.t = z;
        this.v = 1;
        this.q = mb2Var2;
        this.r = mb2Var3;
        mb2Var3.q = this;
        mb2Var2.r = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.s;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.u;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.s;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.u;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.s;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.u;
        return hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.t) {
            nz2.n("value == null");
            return null;
        }
        Object obj2 = this.u;
        this.u = obj;
        return obj2;
    }

    public final String toString() {
        return this.s + "=" + this.u;
    }

    public mb2(boolean z) {
        this.s = null;
        this.t = z;
        this.r = this;
        this.q = this;
    }
}
