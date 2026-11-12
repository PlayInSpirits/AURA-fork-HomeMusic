package defpackage;

import android.os.Process;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xz3 extends Thread {
    public final int n;

    public xz3(Runnable r2) {
        super(r2, "fonts-androidx");
        this.n = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.n);
        super.run();
    }
}
