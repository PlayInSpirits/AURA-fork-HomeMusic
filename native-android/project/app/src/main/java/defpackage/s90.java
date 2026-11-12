package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class s90 implements ThreadFactory {
    public final AtomicInteger a;
    public final /* synthetic */ boolean b;

    public s90(boolean r2) {
        this.b = r2;
        this.a = new AtomicInteger(0);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable r3) {
        r3.getClass();
        if (this.b == false) goto L5;
        String r0 = "WM.task-";
    L6:
        StringBuilder r1 = xa3.i(r0);
        r1.append(this.a.incrementAndGet());
        return new Thread(r3, r1.toString());
    L5:
        r0 = "androidx.work-";
        goto L6
    }
}
