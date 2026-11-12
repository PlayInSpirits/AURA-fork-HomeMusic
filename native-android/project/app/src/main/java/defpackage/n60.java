package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class n60 extends AbstractSet {
    public final /* synthetic */ int n;
    public final /* synthetic */ Map o;

    public /* synthetic */ n60(Map r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        int r0 = this.n;
        Map r1 = this.o;
        switch(r0) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        super.clear();
        return;
    L6:
        ((p60) r1).clear();
        return;
    L8:
        ((p60) r1).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object r3) {
        int r0 = this.n;
        Map r1 = this.o;
        switch(r0) {
            case 0: goto L8;
            case 1: goto L7;
            default: goto L5;
        };
    L8:
        p60 r2 = (p60) r1;
        Map r4 = r2.c();
        if (r4 == null) goto L12;
        return r4.entrySet().contains(r3);
    L12:
        if ((r3 instanceof Map.Entry) == false) goto L18;
        Map.Entry r5 = (Map.Entry) r3;
        int r6 = r2.e(r5.getKey());
        if (r6 == (-1)) goto L18;
        if (si0.s(r2.k()[r6], r5.getValue()) == false) goto L18;
        return true;
    L18:
        return false;
    L5:
        return super.contains(r3);
    L7:
        return ((p60) r1).containsKey(r3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int r0 = this.n;
        Map r2 = this.o;
        switch(r0) {
            case 0: goto L11;
            case 1: goto L6;
            default: goto L5;
        };
    L6:
        p60 r3 = (p60) r2;
        Map r1 = r3.c();
        if (r1 == null) goto L10;
        return r1.keySet().iterator();
    L10:
        return new m60(r3, 0);
    L11:
        p60 r4 = (p60) r2;
        Map r5 = r4.c();
        if (r5 == null) goto L15;
        return r5.entrySet().iterator();
    L15:
        return new m60(r4, 1);
    L5:
        return new mi((oi) r2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object r12) {
        int r0 = this.n;
        Map r3 = this.o;
        switch(r0) {
            case 0: goto L13;
            case 1: goto L6;
            default: goto L5;
        };
    L6:
        p60 r4 = (p60) r3;
        Map r11 = r4.c();
        if (r11 == null) goto L10;
        return r11.keySet().remove(r12);
    L10:
        if (r4.h(r12) != p60.w) goto L12;
        return false;
    L12:
        return true;
    L13:
        p60 r5 = (p60) r3;
        Map r13 = r5.c();
        if (r13 == null) goto L17;
        return r13.entrySet().remove(r12);
    L17:
        if ((r12 instanceof Map.Entry) == false) goto L29;
        Map.Entry r14 = (Map.Entry) r12;
        if (r5.g() == true) goto L30;
        int r6 = r5.d();
        Object r7 = r14.getKey();
        Object r8 = r14.getValue();
        Object r9 = r5.n;
        Objects.requireNonNull(r9);
        int r15 = bu.A(r7, r8, r6, r9, r5.i(), r5.j(), r5.k());
        if (r15 == (-1)) goto L31;
        r5.f(r15, r6);
        r5.s--;
        r5.r += 32;
        return true;
    L31:
        return false;
    L30:
        return false;
    L29:
        return false;
    L5:
        return super.remove(r12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int r0 = this.n;
        Map r1 = this.o;
        switch(r0) {
            case 0: goto L9;
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return ((oi) r1).p;
    L7:
        return ((p60) r1).size();
    L9:
        return ((p60) r1).size();
    }
}
