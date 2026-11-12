package defpackage;

import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rw2 extends sj0 {
    @Override // defpackage.sj0
    public final void c(Object obj, Object obj2) {
        sw2 sw2Var = (sw2) obj;
        sw2Var.getClass();
        ArrayDeque arrayDeque = sw2.b;
        synchronized (arrayDeque) {
            arrayDeque.offer(sw2Var);
        }
    }
}
