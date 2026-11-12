package defpackage;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ed5 implements Callable {
    public final /* synthetic */ w24 a;
    public final /* synthetic */ fd5 b;

    public ed5(fd5 fd5Var, w24 w24Var) {
        this.b = fd5Var;
        this.a = w24Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Boolean boolValueOf;
        Cursor cursorH = xl.H(this.b.a, this.a);
        try {
            if (cursorH.moveToFirst()) {
                boolValueOf = Boolean.valueOf(cursorH.getInt(0) != 0);
            } else {
                boolValueOf = Boolean.FALSE;
            }
            return boolValueOf;
        } finally {
            cursorH.close();
        }
    }

    public final void finalize() {
        this.a.j();
    }
}
