package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class dg2 implements Map.Entry, x32 {
    public final /* synthetic */ int n;
    public final Object o;
    public final Object p;

    public /* synthetic */ dg2(int i, Object obj, Object obj2) {
        this.n = i;
        this.o = obj;
        this.p = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        switch (this.n) {
            case 0:
                Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
                return entry != null && h12.c(entry.getKey(), this.o) && h12.c(entry.getValue(), getValue());
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.n) {
        }
        return this.o;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        switch (this.n) {
        }
        return this.p;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        switch (this.n) {
            case 0:
                Object obj = this.o;
                int hashCode = obj != null ? obj.hashCode() : 0;
                Object value = getValue();
                return hashCode ^ (value != null ? value.hashCode() : 0);
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        switch (this.n) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public String toString() {
        switch (this.n) {
            case 0:
                return this.o + "=" + getValue();
            default:
                return super.toString();
        }
    }
}
