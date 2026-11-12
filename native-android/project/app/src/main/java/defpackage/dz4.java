package defpackage;

import com.google.gson.reflect.TypeToken;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dz4 implements cz4 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ bz4 p;

    public /* synthetic */ dz4(Object r1, bz4 r2, int r3) {
        this.n = r3;
        this.o = r1;
        this.p = r2;
    }

    @Override // defpackage.cz4
    public final bz4 a(nk1 r4, TypeToken r5) {
        int r6 = this.n;
        bz4 r0 = this.p;
        Object r2 = this.o;
        switch(r6) {
            case 0: goto L15;
            case 1: goto L9;
            default: goto L5;
        };
    L9:
        Class<?> r7 = r5.getRawType();
        if (((Class) r2).isAssignableFrom(r7) == true) goto L13;
        return null;
    L13:
        return new si(this, r7);
    L5:
        if (r5.equals((TypeToken) r2) == false) goto L8;
        return r0;
    L8:
        return null;
    L15:
        if (r5.getRawType() != ((Class) r2)) goto L18;
        return r0;
    L18:
        return null;
    }

    public String toString() {
        int r0 = this.n;
        bz4 r2 = this.p;
        Object r4 = this.o;
        switch(r0) {
            case 0: goto L9;
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return super.toString();
    L7:
        return "Factory[typeHierarchy=" + ((Class) r4).getName() + ",adapter=" + r2 + "]";
    L9:
        return "Factory[type=" + ((Class) r4).getName() + ",adapter=" + r2 + "]";
    }
}
