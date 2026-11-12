package defpackage;

import kotlinx.coroutines.flow.internal.ChildCancelledException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class s81 extends e64 {
    @Override // defpackage.a32
    public final boolean y(Throwable r2) {
        if ((r2 instanceof ChildCancelledException) == false) goto L7;
        return true;
    L7:
        return o(r2);
    }
}
