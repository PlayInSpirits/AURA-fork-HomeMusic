package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class i22 extends yw4 {
    public final /* synthetic */ eg1 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i22(Iterator it, eg1 eg1Var) {
        super(it);
        this.o = eg1Var;
    }

    @Override // defpackage.yw4
    public final Object a(Object obj) {
        return this.o.mo77apply(obj);
    }
}
