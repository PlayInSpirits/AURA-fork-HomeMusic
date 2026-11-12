package defpackage;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nz4 extends oz4 {
    public final /* synthetic */ TypeVariable o;
    public final /* synthetic */ oz4 p;

    public nz4(TypeVariable r1, oz4 r2) {
        this.o = r1;
        this.p = r2;
        super(0);
    }

    @Override // defpackage.oz4
    public final Type a(TypeVariable r3, nz4 r4) {
        if (r3.getGenericDeclaration().equals(this.o.getGenericDeclaration()) == false) goto L6;
        return r3;
    L6:
        return this.p.a(r3, r4);
    }
}
