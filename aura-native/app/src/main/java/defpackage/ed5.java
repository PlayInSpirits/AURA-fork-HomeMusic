package defpackage;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ed5 implements Callable {
    public final /* synthetic */ w24 a;
    public final /* synthetic */ fd5 b;

    public ed5(fd5 fd5Var, w24 w24Var) {
        this.b = fd5Var;
        this.a = w24Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Boolean bool;
        Cursor H = xl.H(this.b.a, this.a);
        try {
            if (H.moveToFirst()) {
                bool = Boolean.valueOf(H.getInt(0) != 0);
            } else {
                bool = Boolean.FALSE;
            }
            H.close();
            return bool;
        } catch (Throwable th) {
            H.close();
            throw th;
        }
    }

    public final void finalize() {
        this.a.j();
    }
}
