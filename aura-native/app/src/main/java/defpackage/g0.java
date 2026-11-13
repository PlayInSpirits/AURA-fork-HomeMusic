package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class g0 extends Throwable {
    public final /* synthetic */ int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(int i, String str) {
        super(str);
        this.n = i;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        int i = this.n;
        synchronized (this) {
            switch (i) {
            }
            return this;
        }
    }
}
