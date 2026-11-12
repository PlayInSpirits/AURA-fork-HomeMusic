package defpackage;

import kotlinx.coroutines.flow.internal.ChildCancelledException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class s81 extends e64 {
    @Override // defpackage.a32
    public final boolean y(Throwable th) {
        if (th instanceof ChildCancelledException) {
            return true;
        }
        return o(th);
    }
}
