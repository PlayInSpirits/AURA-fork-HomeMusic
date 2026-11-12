package defpackage;

import java.io.IOException;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qw {
    public final ArrayDeque a;

    public qw(int i) {
        switch (i) {
            case 1:
                this.a = new ArrayDeque(16);
                break;
            default:
                this.a = new ArrayDeque(0);
                break;
        }
    }

    public synchronized void a(di1 di1Var) {
        di1Var.b = null;
        di1Var.c = null;
        this.a.offer(di1Var);
    }

    public void b() {
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return;
        }
        throw new IOException("data item not completed, stackSize: " + arrayDeque.size() + " scope: " + d());
    }

    public void c(long j) {
        long jD = d();
        if (jD != j) {
            if (jD != -1) {
                if (jD != -2) {
                    return;
                } else {
                    jD = -2;
                }
            }
            throw new IOException("expected non-string scope or scope " + j + " but found " + jD);
        }
    }

    public long d() {
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }
}
