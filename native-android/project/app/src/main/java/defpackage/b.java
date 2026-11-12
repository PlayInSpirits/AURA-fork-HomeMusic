package defpackage;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements ParameterizedType, Serializable {
    public final /* synthetic */ int n;
    public final Type o;
    public final Object p;
    public final Serializable q;

    /* JADX WARN: Type inference failed for: r5v5, types: [java.io.Serializable, java.lang.reflect.Type[]] */
    public b(Type r5, Type r6, Type[] r7) {
        int r0 = 0;
        this.n = 0;
        Objects.requireNonNull(r6);
        if ((r6 instanceof Class) == false) goto L16;
        Class r1 = (Class) r6;
        boolean r3 = true;
        if (Modifier.isStatic(r1.getModifiers()) == false) goto L7;
    L10:
        boolean r2 = true;
    L11:
        if (r5 != null) goto L15;
        if (r2 == true) goto L15;
        r3 = false;
    L15:
        vr1.d(r3);
        goto L16
    L7:
        if (r1.getEnclosingClass() == null) goto L10;
        r2 = false;
    L16:
        if (r5 != null) goto L18;
        Type r8 = null;
    L19:
        this.o = r8;
        this.p = gb.h(r6);
        ?? r9 = (Type[]) r7.clone();
        this.q = r9;
        int r10 = r9.length;
    L20:
        if (r0 >= r10) goto L22;
        Objects.requireNonNull(((Type[]) this.q)[r0]);
        gb.i(((Type[]) this.q)[r0]);
        Type[] r11 = (Type[]) this.q;
        r11[r0] = gb.h(r11[r0]);
        r0 = r0 + 1;
        goto L20
    L22:
        return;
    L18:
        r8 = gb.h(r5);
        goto L19
    }

    public final boolean equals(Object r5) {
        switch(this.n) {
            case 0: goto L17;
            default: goto L5;
        };
    L5:
        if ((r5 instanceof ParameterizedType) == false) goto L15;
        ParameterizedType r6 = (ParameterizedType) r5;
        if (((Class) this.q).equals(r6.getRawType()) == false) goto L15;
        if (si0.s(this.o, r6.getOwnerType()) == false) goto L15;
        if (Arrays.equals((Type[]) ((gy3) this.p).toArray(new Type[0]), r6.getActualTypeArguments()) == false) goto L15;
        return true;
    L15:
        return false;
    L17:
        if ((r5 instanceof ParameterizedType) == false) goto L22;
        if (gb.v(this, (ParameterizedType) r5) == false) goto L22;
        return true;
    L22:
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return (Type[]) ((gy3) this.p).toArray(new Type[0]);
    L7:
        return (Type[]) ((Type[]) this.q).clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return this.o;
    L7:
        return this.o;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return (Class) this.q;
    L7:
        return (Type) this.p;
    }

    public final int hashCode() {
        int r0 = this.n;
        Object r1 = this.q;
        Object r2 = this.p;
        int r3 = 0;
        Type r4 = this.o;
        switch(r0) {
            case 0: goto L9;
            default: goto L4;
        };
    L4:
        if (r4 == null) goto L8;
        r3 = r4.hashCode();
    L8:
        return (((gy3) r2).hashCode() ^ r3) ^ ((Class) r1).hashCode();
    L9:
        int r5 = Arrays.hashCode((Type[]) r1) ^ ((Type) r2).hashCode();
        if (r4 == null) goto L13;
        r3 = r4.hashCode();
    L13:
        return r5 ^ r3;
    }

    public final String toString() {
        int r0 = this.n;
        int r1 = 1;
        Object r2 = this.p;
        Object r3 = this.q;
        switch(r0) {
            case 0: goto L11;
            default: goto L4;
        };
    L4:
        StringBuilder r4 = new StringBuilder();
        Type r6 = this.o;
        if (r6 == null) goto L9;
        x05 r5 = x05.p;
        r5.getClass();
        if ((r5 instanceof v05) == true) goto L9;
        r4.append(r5.b(r6));
        r4.append('.');
    L9:
        r4.append(((Class) r3).getName());
        r4.append('<');
        c32 r7 = b15.a;
        gy3 r8 = (gy3) r2;
        x05 r9 = x05.p;
        Objects.requireNonNull(r9);
        ss2 r10 = new ss2(23, r9);
        r8.getClass();
        r4.append(r7.b(new g22(r8, r10, r1)));
        r4.append('>');
        return r4.toString();
    L11:
        Type r11 = (Type) r2;
        Type[] r12 = (Type[]) r3;
        int r13 = r12.length;
        if (r13 == 0) goto L20;
        StringBuilder r14 = new StringBuilder((r13 + 1) * 30);
        r14.append(gb.e0(r11));
        r14.append("<");
        r14.append(gb.e0(r12[0]));
    L15:
        if (r1 >= r13) goto L17;
        r14.append(", ");
        r14.append(gb.e0(r12[r1]));
        r1 = r1 + 1;
        goto L15
    L17:
        r14.append(">");
        return r14.toString();
    L20:
        return gb.e0(r11);
    }

    public b(Type r4, Class r5, Type[] r6) {
        boolean r0 = true;
        this.n = 1;
        r5.getClass();
        if (r6.length == r5.getTypeParameters().length) goto L6;
        r0 = false;
    L6:
        rr2.l(r0);
        b15.b(r6, "type parameter");
        this.o = r4;
        this.q = r5;
        this.p = x05.p.c(r6);
    }
}
