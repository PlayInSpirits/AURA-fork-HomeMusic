package kotlinx.coroutines;

import defpackage.gu4;
import defpackage.s22;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class TimeoutCancellationException extends CancellationException {
    public final transient s22 n;

    public TimeoutCancellationException(String str, gu4 gu4Var) {
        super(str);
        this.n = gu4Var;
    }
}
