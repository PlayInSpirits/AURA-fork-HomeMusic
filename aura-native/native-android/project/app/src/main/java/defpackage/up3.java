package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class up3 {
    public final List a;
    public final List[] b;
    public int c;
    public int d;
    public boolean e;
    public final /* synthetic */ vp3 f;

    public up3(vp3 vp3Var, List list) {
        this.f = vp3Var;
        this.a = list;
        this.b = new List[list.size()];
        if (list.isEmpty()) {
            fz1.a("NestedPrefetchController shouldn't be created with no states");
        }
    }
}
