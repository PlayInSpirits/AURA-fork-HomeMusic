package defpackage;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements GenericArrayType, Serializable {
    public final /* synthetic */ int n;
    public final Type o;

    public a(int r1, Type r2) {
        this.n = r1;
        switch(r1) {
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        Objects.requireNonNull(r2);
        this.o = gb.h(r2);
        return;
    L6:
        this.o = x05.p.d(r2);
    }

    public final boolean equals(Object r3) {
        switch(this.n) {
            case 0: goto L9;
            default: goto L5;
        };
    L5:
        if ((r3 instanceof GenericArrayType) == true) goto L7;
        return false;
    L7:
        return si0.s(this.o, ((GenericArrayType) r3).getGenericComponentType());
    L9:
        if ((r3 instanceof GenericArrayType) == true) goto L11;
        return false;
    L11:
        if (gb.v(this, (GenericArrayType) r3) == false) goto L16;
        return true;
    L16:
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return this.o;
    L7:
        return this.o;
    }

    public final int hashCode() {
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return this.o.hashCode();
    L7:
        return this.o.hashCode();
    }

    public final String toString() {
        int r0 = this.n;
        Type r3 = this.o;
        switch(r0) {
            case 0: goto L11;
            default: goto L4;
        };
    L4:
        StringBuilder r1 = new StringBuilder();
        c32 r2 = b15.a;
        if ((r3 instanceof Class) == false) goto L7;
        String r4 = ((Class) r3).getName();
    L9:
        return b11.q(r1, r4, "[]");
    L7:
        r4 = r3.toString();
        goto L9
    L11:
        return gb.e0(r3) + "[]";
    }
}
