package defpackage;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements WildcardType, Serializable {
    public final /* synthetic */ int n;
    public final Object o;
    public final Object p;

    public c(Type[] r3, Type[] r4, int r5) {
        this.n = r5;
        switch(r5) {
            case 1: goto L21;
            default: goto L4;
        };
    L4:
        boolean r1 = true;
        if (r4.length > 1) goto L7;
        boolean r6 = true;
    L8:
        vr1.d(r6);
        if (r3.length != 1) goto L11;
        boolean r7 = true;
    L12:
        vr1.d(r7);
        if (r4.length != 1) goto L19;
        Objects.requireNonNull(r4[0]);
        gb.i(r4[0]);
        if (r3[0] == Object.class) goto L18;
        r1 = false;
    L18:
        vr1.d(r1);
        this.p = gb.h(r4[0]);
        this.o = Object.class;
        return;
    L19:
        Objects.requireNonNull(r3[0]);
        gb.i(r3[0]);
        this.p = null;
        this.o = gb.h(r3[0]);
        return;
    L11:
        r7 = false;
        goto L12
    L7:
        r6 = false;
        goto L8
    L21:
        b15.b(r3, "lower bound for wildcard");
        b15.b(r4, "upper bound for wildcard");
        x05 r8 = x05.p;
        this.o = r8.c(r3);
        this.p = r8.c(r4);
    }

    public final boolean equals(Object r5) {
        switch(this.n) {
            case 0: goto L14;
            default: goto L5;
        };
    L5:
        if ((r5 instanceof WildcardType) == false) goto L12;
        WildcardType r6 = (WildcardType) r5;
        if (((gy3) this.o).equals(Arrays.asList(r6.getLowerBounds())) == false) goto L12;
        if (((gy3) this.p).equals(Arrays.asList(r6.getUpperBounds())) == false) goto L12;
        return true;
    L12:
        return false;
    L14:
        if ((r5 instanceof WildcardType) == false) goto L19;
        if (gb.v(this, (WildcardType) r5) == false) goto L19;
        return true;
    L19:
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        switch(this.n) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        gy3 r2 = (gy3) this.o;
        c32 r0 = b15.a;
        return (Type[]) r2.toArray(new Type[0]);
    L6:
        Type r3 = (Type) this.p;
        if (r3 == null) goto L10;
        return new Type[]{r3};
    L10:
        return gb.a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        switch(this.n) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        gy3 r2 = (gy3) this.p;
        c32 r0 = b15.a;
        return (Type[]) r2.toArray(new Type[0]);
    L7:
        return new Type[]{(Type) this.o};
    }

    public final int hashCode() {
        int r0 = this.n;
        Object r1 = this.p;
        Object r2 = this.o;
        switch(r0) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        Type r3 = (Type) r1;
        if (r3 == null) goto L9;
        int r4 = r3.hashCode() + 31;
    L11:
        return (((Type) r2).hashCode() + 31) ^ r4;
    L9:
        r4 = 1;
        goto L11
    L5:
        return ((gy3) r2).hashCode() ^ ((gy3) r1).hashCode();
    }

    public final String toString() {
        int r0 = this.n;
        Object r1 = this.p;
        Object r4 = this.o;
        switch(r0) {
            case 0: goto L14;
            default: goto L4;
        };
    L4:
        StringBuilder r2 = new StringBuilder("?");
        vw1 r5 = ((gy3) r4).m(0);
    L6:
        if (r5.hasNext() == false) goto L8;
        Type r3 = (Type) r5.next();
        r2.append(" super ");
        r2.append(x05.p.b(r3));
        goto L6
    L8:
        gy3 r6 = (gy3) r1;
        c32 r7 = b15.a;
        uo3 r8 = new uo3(new to3());
        r6.getClass();
        Iterator<E> r9 = r6.iterator();
        r9.getClass();
        h22 r10 = new h22(r9, r8);
    L10:
        if (r10.hasNext() == false) goto L13;
        Type r11 = (Type) r10.next();
        r2.append(" extends ");
        r2.append(x05.p.b(r11));
        goto L10
    L13:
        return r2.toString();
    L14:
        Type r12 = (Type) r4;
        Type r13 = (Type) r1;
        if (r13 == null) goto L18;
        return "? super " + gb.e0(r13);
    L18:
        if (r12 != Object.class) goto L21;
        return "?";
    L21:
        return "? extends " + gb.e0(r12);
    }
}
