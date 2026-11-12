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

    public /* synthetic */ pw(int r1, Object r2) {
        this.n = r1;
        this.o = r2;
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
        switch(this.n) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        return ByteBuffer.class;
    L5:
        return this.o.getClass();
    }

    @Override // defpackage.sh0
    public final void c() {
        int r0 = this.n;
    }

    @Override // defpackage.sh0
    public final void cancel() {
        int r0 = this.n;
    }

    @Override // defpackage.sh0
    public final void d(eq3 r2, rh0 r3) {
        int r4 = this.n;
        Object r1 = this.o;
        switch(r4) {
            case 0: goto L14;
            default: goto L4;
        };
    L4:
        r3.f(r1);
        return;
    L14:
        r3.f(vw.a((File) r1));     // Catch: IOException -> L8
        return;
    L8:
        e = move-exception;
        if (Log.isLoggable("ByteBufferFileLoader", 3) == false) goto L12;
        Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e);
    L12:
        r3.b(e);
    }

    @Override // defpackage.sh0
    public final int e() {
        switch(this.n) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        return 1;
    L6:
        return 1;
    }
}
