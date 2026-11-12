package defpackage;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class h5 implements ThreadFactory {
    public final /* synthetic */ int a;

    public /* synthetic */ h5(int r1) {
        this.a = r1;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable r3) {
        switch(this.a) {
            case 0: goto L9;
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return new xz3(r3);
    L7:
        return new rk(r3);
    L9:
        return new Thread(new g5(0, r3), "glide-active-resources");
    }
}
