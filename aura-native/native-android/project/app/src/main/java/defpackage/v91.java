package defpackage;

import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v91 implements if1 {
    public final /* synthetic */ int n = 1;
    public final /* synthetic */ int o;
    public final /* synthetic */ Object p;

    public /* synthetic */ v91(int i, jx3 jx3Var) {
        this.p = jx3Var;
        this.o = i;
    }

    @Override // defpackage.if1
    public final Object invoke(Object obj) {
        boolean zY0;
        int i = this.n;
        Object obj2 = this.p;
        int i2 = this.o;
        switch (i) {
            case 0:
                zY0 = ((ba1) obj).y0(i2);
                ((jx3) obj2).n = Boolean.valueOf(zY0);
                break;
            default:
                zY0 = ((List) obj).addAll(i2, (Collection) obj2);
                break;
        }
        return Boolean.valueOf(zY0);
    }

    public /* synthetic */ v91(int i, Collection collection) {
        this.o = i;
        this.p = collection;
    }
}
