package defpackage;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fz4 extends bz4 {
    public final /* synthetic */ int a;

    public /* synthetic */ fz4(int i) {
        this.a = i;
    }

    @Override // defpackage.bz4
    public final Object a(l32 l32Var) {
        switch (this.a) {
            case 0:
                return new AtomicBoolean(l32Var.R());
            default:
                try {
                    return new AtomicInteger(l32Var.W());
                } catch (NumberFormatException e) {
                    throw new JsonSyntaxException(e);
                }
        }
    }

    @Override // defpackage.bz4
    public final void b(q32 q32Var, Object obj) throws IOException {
        switch (this.a) {
            case 0:
                q32Var.X(((AtomicBoolean) obj).get());
                break;
            default:
                q32Var.M(((AtomicInteger) obj).get());
                break;
        }
    }
}
