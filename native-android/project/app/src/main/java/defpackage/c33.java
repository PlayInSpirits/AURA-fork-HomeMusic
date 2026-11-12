package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class c33 extends g33 {
    public final Class s;

    public c33(Class r2) {
        super(0, r2);
        if (r2.isEnum() == false) goto L6;
        this.s = r2;
        return;
    L6:
        nz2.h(r2, " is not an Enum type.");
        throw null;
    }

    @Override // defpackage.g33, defpackage.h33
    public final String b() {
        return this.s.getName();
    }

    @Override // defpackage.g33, defpackage.h33
    public final /* bridge */ /* synthetic */ Object d(String r1) {
        return h(r1);
    }

    @Override // defpackage.g33
    public final /* bridge */ /* synthetic */ Serializable g(String r1) {
        return h(r1);
    }

    public final Enum h(String r7) {
        r7.getClass();
        Class r6 = this.s;
        Object[] r0 = r6.getEnumConstants();
        r0.getClass();
        int r1 = r0.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L8;
        Object r3 = r0[r2];
        if (xm4.f0(((Enum) r3).name(), r7, true) == true) goto L9;
        r2 = r2 + 1;
    L9:
        Enum r4 = (Enum) r3;
        if (r4 == null) goto L12;
        return r4;
    L12:
        StringBuilder r8 = xa3.j("Enum value ", r7, " not found for type ");
        r8.append(r6.getName());
        r8.append('.');
        throw new IllegalArgumentException(r8.toString());
    L8:
        r3 = null;
        goto L9
    }
}
