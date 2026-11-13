package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class tq4 implements aa4 {
    public final /* synthetic */ int a;
    public final Object b;
    public final if1 c;

    public /* synthetic */ tq4(Object obj, if1 if1Var, int i) {
        this.a = i;
        this.b = obj;
        this.c = if1Var;
    }

    @Override // defpackage.aa4
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new g71(this);
            case 1:
                return new zw4(this);
            default:
                return new bh1(this);
        }
    }
}
