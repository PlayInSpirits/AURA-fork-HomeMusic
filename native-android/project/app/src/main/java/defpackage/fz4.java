package defpackage;

import com.google.gson.JsonSyntaxException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fz4 extends bz4 {
    public final /* synthetic */ int a;

    public /* synthetic */ fz4(int r1) {
        this.a = r1;
    }

    @Override // defpackage.bz4
    public final Object a(l32 r1) {
        switch(this.a) {
            case 0: goto L10;
            default: goto L11;
        };
    L11:
        return new AtomicInteger(r1.W());
    L6:
        e = move-exception;
        throw new JsonSyntaxException(e);
    L10:
        return new AtomicBoolean(r1.R());
    }

    @Override // defpackage.bz4
    public final void b(q32 r3, Object r4) {
        switch(this.a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        r3.M(((AtomicInteger) r4).get());
        return;
    L6:
        r3.X(((AtomicBoolean) r4).get());
    }
}
