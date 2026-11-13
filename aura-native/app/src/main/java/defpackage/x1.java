package defpackage;

import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class x1 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Collection o;

    public /* synthetic */ x1(int i, Collection collection) {
        this.n = i;
        this.o = collection;
    }

    @Override // defpackage.if1
    public final Object invoke(Object obj) {
        boolean contains;
        int i = this.n;
        Collection<?> collection = this.o;
        switch (i) {
            case 0:
                contains = collection.contains(obj);
                break;
            case 1:
                contains = collection.contains(obj);
                break;
            default:
                contains = ((List) obj).retainAll(collection);
                break;
        }
        return Boolean.valueOf(contains);
    }
}
