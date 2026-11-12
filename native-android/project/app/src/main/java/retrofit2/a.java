package retrofit2;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ DefaultCallAdapterFactory.ExecutorCallbackCall.AnonymousClass1 o;
    public final /* synthetic */ Callback p;
    public final /* synthetic */ Object q;

    public /* synthetic */ a(DefaultCallAdapterFactory.ExecutorCallbackCall.AnonymousClass1 anonymousClass1, Callback callback, Object obj, int i) {
        this.n = i;
        this.o = anonymousClass1;
        this.p = callback;
        this.q = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        Object obj = this.q;
        Callback callback = this.p;
        DefaultCallAdapterFactory.ExecutorCallbackCall.AnonymousClass1 anonymousClass1 = this.o;
        switch (i) {
            case 0:
                anonymousClass1.lambda$onResponse$0(callback, (Response) obj);
                break;
            default:
                anonymousClass1.lambda$onFailure$1(callback, (Throwable) obj);
                break;
        }
    }
}
