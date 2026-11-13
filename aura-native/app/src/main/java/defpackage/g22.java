package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class g22 extends m91 {
    public final /* synthetic */ int o;
    public final /* synthetic */ Iterable p;
    public final /* synthetic */ Object q;

    public /* synthetic */ g22(Iterable iterable, Object obj, int i) {
        this.o = i;
        this.p = iterable;
        this.q = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i = this.o;
        Object obj = this.q;
        Iterable iterable = this.p;
        switch (i) {
            case 0:
                Iterator it = iterable.iterator();
                it.getClass();
                return new h22(it, (ro3) obj);
            default:
                return new i22(iterable.iterator(), (ss2) obj);
        }
    }
}
