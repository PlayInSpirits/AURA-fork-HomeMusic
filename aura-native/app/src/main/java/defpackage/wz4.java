package defpackage;

import java.util.HashMap;
import java.util.Objects;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class wz4 extends gb3 {
    public final /* synthetic */ HashMap n;

    public wz4(HashMap hashMap) {
        this.n = hashMap;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        HashMap hashMap = this.n;
        Object obj3 = hashMap.get(obj);
        Objects.requireNonNull(obj3);
        Object obj4 = hashMap.get(obj2);
        Objects.requireNonNull(obj4);
        Comparable comparable = (Comparable) obj3;
        Comparable comparable2 = (Comparable) obj4;
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }
}
