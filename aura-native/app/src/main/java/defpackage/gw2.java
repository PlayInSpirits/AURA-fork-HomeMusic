package defpackage;

import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class gw2 {
    public static final AtomicInteger d = new AtomicInteger(5);
    public final ArrayDeque a = new ArrayDeque();
    public HandlerThread b;
    public int c;

    public final void a() {
        ArrayDeque arrayDeque = this.a;
        if (!arrayDeque.isEmpty() && this.c - arrayDeque.size() < d.get()) {
            fw2 fw2Var = (fw2) arrayDeque.removeFirst();
            fw2Var.c.b(1, fw2Var.b).b();
        }
    }
}
