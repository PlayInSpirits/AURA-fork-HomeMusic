package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class dg2 implements Map.Entry, x32 {
    public final /* synthetic */ int n;
    public final Object o;
    public final Object p;

    public /* synthetic */ dg2(int r1, Object r2, Object r3) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object r3) {
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return super.equals(r3);
    L7:
        if ((r3 instanceof Map.Entry) == false) goto L9;
        Map.Entry r4 = (Map.Entry) r3;
    L10:
        if (r4 != null) goto L12;
    L16:
        return false;
    L12:
        if (h12.c(r4.getKey(), this.o) == false) goto L16;
        if (h12.c(r4.getValue(), getValue()) == false) goto L16;
        return true;
    L9:
        r4 = null;
        goto L10
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return this.o;
    L7:
        return this.o;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return this.p;
    L7:
        return this.p;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        switch(this.n) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        int r0 = 0;
        Object r1 = this.o;
        if (r1 == null) goto L9;
        int r2 = r1.hashCode();
    L10:
        Object r3 = getValue();
        if (r3 == null) goto L14;
        r0 = r3.hashCode();
    L14:
        return r2 ^ r0;
    L9:
        r2 = 0;
        goto L10
    L5:
        return super.hashCode();
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object r1) {
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    L7:
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public String toString() {
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return super.toString();
    L7:
        return this.o + "=" + getValue();
    }
}
