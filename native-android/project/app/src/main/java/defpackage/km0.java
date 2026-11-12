package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class km0 implements gf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ List o;

    public /* synthetic */ km0(List list, int i) {
        this.n = i;
        this.o = list;
    }

    @Override // defpackage.gf1
    public final Object invoke() {
        int i = this.n;
        List list = this.o;
        switch (i) {
            case 0:
                Object obj = list.get(2);
                obj.getClass();
                return (Integer) obj;
            default:
                return rr1.r(list);
        }
    }
}
