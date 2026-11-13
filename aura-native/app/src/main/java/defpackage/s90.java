package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class s90 implements ThreadFactory {
    public final AtomicInteger a = new AtomicInteger(0);
    public final /* synthetic */ boolean b;

    public s90(boolean z) {
        this.b = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        runnable.getClass();
        StringBuilder i = xa3.i(this.b ? "WM.task-" : "androidx.work-");
        i.append(this.a.incrementAndGet());
        return new Thread(runnable, i.toString());
    }
}
