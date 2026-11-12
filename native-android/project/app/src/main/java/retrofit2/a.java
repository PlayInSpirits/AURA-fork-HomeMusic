package retrofit2;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ DefaultCallAdapterFactory.ExecutorCallbackCall.AnonymousClass1 o;
    public final /* synthetic */ Callback p;
    public final /* synthetic */ Object q;

    public /* synthetic */ a(DefaultCallAdapterFactory.ExecutorCallbackCall.AnonymousClass1 r1, Callback r2, Object r3, int r4) {
        this.n = r4;
        this.o = r1;
        this.p = r2;
        this.q = r3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        Object r1 = this.q;
        Callback r2 = this.p;
        DefaultCallAdapterFactory.ExecutorCallbackCall.AnonymousClass1 r3 = this.o;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        DefaultCallAdapterFactory.ExecutorCallbackCall.AnonymousClass1.a(r3, r2, (Throwable) r1);
        return;
    L6:
        DefaultCallAdapterFactory.ExecutorCallbackCall.AnonymousClass1.b(r3, r2, (Response) r1);
    }
}
