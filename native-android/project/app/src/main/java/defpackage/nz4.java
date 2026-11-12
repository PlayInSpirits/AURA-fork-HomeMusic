package defpackage;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nz4 extends oz4 {
    public final /* synthetic */ TypeVariable o;
    public final /* synthetic */ oz4 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nz4(TypeVariable typeVariable, oz4 oz4Var) {
        super(0);
        this.o = typeVariable;
        this.p = oz4Var;
    }

    @Override // defpackage.oz4
    public final Type a(TypeVariable typeVariable, nz4 nz4Var) {
        return typeVariable.getGenericDeclaration().equals(this.o.getGenericDeclaration()) ? typeVariable : this.p.a(typeVariable, nz4Var);
    }
}
