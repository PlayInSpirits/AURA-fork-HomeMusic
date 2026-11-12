package defpackage;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n90 implements ThreadFactory {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ n90(int r1, String r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable r2) {
        int r0 = this.a;
        String r1 = this.b;
        switch(r0) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        Thread r3 = new Thread(r2, r1);
        r3.setPriority(10);
        return r3;
    L5:
        return new Thread(r2, r1);
    }
}
