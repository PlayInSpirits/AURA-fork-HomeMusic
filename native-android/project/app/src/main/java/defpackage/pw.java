package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pw implements sh0 {
    public final /* synthetic */ int n;
    public final Object o;

    public /* synthetic */ pw(int i, Object obj) {
        this.n = i;
        this.o = obj;
    }

    private final void b() {
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }

    @Override // defpackage.sh0
    public final Class a() {
        switch (this.n) {
            case 0:
                return ByteBuffer.class;
            default:
                return this.o.getClass();
        }
    }

    @Override // defpackage.sh0
    public final void c() {
        int i = this.n;
    }

    @Override // defpackage.sh0
    public final void cancel() {
        int i = this.n;
    }

    @Override // defpackage.sh0
    public final void d(eq3 eq3Var, rh0 rh0Var) {
        int i = this.n;
        Object obj = this.o;
        switch (i) {
            case 0:
                try {
                    rh0Var.f(vw.a((File) obj));
                } catch (IOException e) {
                    if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                        Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e);
                    }
                    rh0Var.b(e);
                    return;
                }
                break;
            default:
                rh0Var.f(obj);
                break;
        }
    }

    @Override // defpackage.sh0
    public final int e() {
        switch (this.n) {
        }
        return 1;
    }
}
