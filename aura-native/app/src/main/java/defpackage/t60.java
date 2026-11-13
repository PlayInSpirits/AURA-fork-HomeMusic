package defpackage;

import java.util.Comparator;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class t60 extends v60 {
    public static v60 f(int i) {
        return i < 0 ? v60.b : i > 0 ? v60.c : v60.a;
    }

    @Override // defpackage.v60
    public final v60 a(int i, int i2) {
        return f(Integer.compare(i, i2));
    }

    @Override // defpackage.v60
    public final v60 b(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // defpackage.v60
    public final v60 c(boolean z, boolean z2) {
        return f(Boolean.compare(z, z2));
    }

    @Override // defpackage.v60
    public final v60 d(boolean z, boolean z2) {
        return f(Boolean.compare(z2, z));
    }

    @Override // defpackage.v60
    public final int e() {
        return 0;
    }
}
