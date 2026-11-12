package defpackage;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cc1 extends fu4 {
    public fu4 e;

    public cc1(fu4 fu4Var) {
        fu4Var.getClass();
        this.e = fu4Var;
    }

    @Override // defpackage.fu4
    public final fu4 a() {
        return this.e.a();
    }

    @Override // defpackage.fu4
    public final fu4 b() {
        return this.e.b();
    }

    @Override // defpackage.fu4
    public final long c() {
        return this.e.c();
    }

    @Override // defpackage.fu4
    public final fu4 d(long j) {
        return this.e.d(j);
    }

    @Override // defpackage.fu4
    public final boolean e() {
        return this.e.e();
    }

    @Override // defpackage.fu4
    public final void f() throws InterruptedIOException {
        this.e.f();
    }

    @Override // defpackage.fu4
    public final fu4 g(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.e.g(j, timeUnit);
    }
}
