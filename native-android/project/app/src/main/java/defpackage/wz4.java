package defpackage;

import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wz4 extends gb3 {
    public final /* synthetic */ HashMap n;

    public wz4(HashMap map) {
        this.n = map;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        HashMap map = this.n;
        Object obj3 = map.get(obj);
        Objects.requireNonNull(obj3);
        Object obj4 = map.get(obj2);
        Objects.requireNonNull(obj4);
        Comparable comparable = (Comparable) obj3;
        Comparable comparable2 = (Comparable) obj4;
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }
}
