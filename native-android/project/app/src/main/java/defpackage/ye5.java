package defpackage;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ye5 implements ThreadFactory {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ ye5(String r1, boolean r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable r3) {
        Thread r0 = new Thread(r3, this.a);
        r0.setDaemon(this.b);
        return r0;
    }
}
