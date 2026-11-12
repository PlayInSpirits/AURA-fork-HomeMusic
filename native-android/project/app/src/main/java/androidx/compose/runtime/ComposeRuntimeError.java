package androidx.compose.runtime;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ComposeRuntimeError extends IllegalStateException {
    public final String n;

    public ComposeRuntimeError(String str) {
        this.n = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.n;
    }
}
