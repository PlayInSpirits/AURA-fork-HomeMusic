package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lb2 extends AbstractSet {
    public final /* synthetic */ int n;
    public final /* synthetic */ nb2 o;

    public /* synthetic */ lb2(nb2 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int r0 = this.n;
        nb2 r1 = this.o;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        r1.clear();
        return;
    L6:
        r1.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object r4) {
        int r0 = this.n;
        nb2 r3 = this.o;
        switch(r0) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return r3.containsKey(r4);
    L7:
        if ((r4 instanceof Map.Entry) == false) goto L23;
        Map.Entry r5 = (Map.Entry) r4;
        Object r1 = r5.getKey();
        mb2 r2 = null;
        if (r1 != null) goto L21;
    L12:
        mb2 r6 = null;
    L13:
        if (r6 != null) goto L15;
    L17:
        if (r2 == null) goto L24;
        return true;
    L24:
        return false;
    L15:
        if (Objects.equals(r6.u, r5.getValue()) == false) goto L17;
        r2 = r6;
        goto L17
    L21:
        r6 = r3.a(r1, false);     // Catch: ClassCastException -> L20
    L23:
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int r0 = this.n;
        nb2 r2 = this.o;
        switch(r0) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return new kb2(r2, 1);
    L7:
        return new kb2(r2, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object r6) {
        int r0 = this.n;
        mb2 r1 = null;
        nb2 r5 = this.o;
        switch(r0) {
            case 0: goto L12;
            default: goto L4;
        };
    L4:
        if (r6 != null) goto L31;
    L6:
        if (r1 == null) goto L8;
        r5.c(r1, true);
    L8:
        if (r1 != null) goto L10;
        return false;
    L10:
        return true;
    L31:
        r1 = r5.a(r6, false);     // Catch: ClassCastException -> L27
        goto L6
    L12:
        if ((r6 instanceof Map.Entry) == false) goto L34;
        Map.Entry r7 = (Map.Entry) r6;
        Object r2 = r7.getKey();
        if (r2 != null) goto L29;
    L18:
        mb2 r3 = null;
    L19:
        if (r3 != null) goto L21;
    L23:
        if (r1 == null) goto L35;
        r5.c(r1, true);
        return true;
    L35:
        return false;
    L21:
        if (Objects.equals(r3.u, r7.getValue()) == false) goto L23;
        r1 = r3;
        goto L23
    L29:
        r3 = r5.a(r2, false);     // Catch: ClassCastException -> L28
    L34:
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int r0 = this.n;
        nb2 r1 = this.o;
        switch(r0) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return r1.q;
    L7:
        return r1.q;
    }
}
