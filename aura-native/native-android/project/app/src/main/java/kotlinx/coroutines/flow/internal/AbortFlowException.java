package kotlinx.coroutines.flow.internal;

import defpackage.q81;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class AbortFlowException extends CancellationException {
    public final transient Object n;

    public AbortFlowException(q81 q81Var) {
        super("Flow was aborted, no more elements needed");
        this.n = q81Var;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
