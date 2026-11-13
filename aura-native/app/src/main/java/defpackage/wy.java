package defpackage;

import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class wy implements o63 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ wy(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final String toString() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) obj) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((if1) obj).getClass().getSimpleName() + '@' + si0.x(this) + ']';
            default:
                return "DisposeOnCancel[" + ((as0) obj) + ']';
        }
    }
}
