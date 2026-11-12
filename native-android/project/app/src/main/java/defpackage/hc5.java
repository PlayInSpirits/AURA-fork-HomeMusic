package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.Settings;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hc5 extends ep4 implements wf1 {
    public xv o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ ContentResolver r;
    public final /* synthetic */ Uri s;
    public final /* synthetic */ ng0 t;
    public final /* synthetic */ aw u;
    public final /* synthetic */ Context v;

    public hc5(ContentResolver r1, Uri r2, ng0 r3, aw r4, Context r5, vd0 r6) {
        this.r = r1;
        this.s = r2;
        this.t = r3;
        this.u = r4;
        this.v = r5;
        super(2, r6);
    }

    @Override // defpackage.jp
    public final vd0 create(Object r8, vd0 r9) {
        aw r4 = this.u;
        Context r5 = this.v;
        hc5 r0 = new hc5(this.r, this.s, this.t, r4, r5, r9);
        r0.q = r8;
        return r0;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r1, Object r2) {
        return ((hc5) create((q81) r1, (vd0) r2)).invokeSuspend(j15.a);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007e -> B:8:0x0019). Please report as a decompilation issue!!! */
    @Override // defpackage.jp
    public final Object invokeSuspend(Object r11) {
        int r0 = this.p;
        ng0 r3 = this.t;
        ContentResolver r4 = this.r;
        xe0 r5 = xe0.n;
        if (r0 == 0) goto L16;
        if (r0 == 1) goto L13;
        if (r0 != 2) goto L11;
        xv r1 = this.o;
        q81 r6 = (q81) this.q;
        kb4.X(r11);     // Catch: Throwable -> L9
    L8:
        q81 r12 = r6;
        xv r7 = r1;
    L18:
        this.q = r12;     // Catch: Throwable -> L9
        this.o = r7;     // Catch: Throwable -> L9
        this.p = 1;     // Catch: Throwable -> L9
        Object r2 = r7.b(this);     // Catch: Throwable -> L9
        if (r2 == r5) goto L26;
        xv r9 = r7;
        r6 = r12;
        r11 = r2;
        r1 = r9;
    L23:
        if (((Boolean) r11).booleanValue() == false) goto L27;
        r1.c();     // Catch: Throwable -> L9
        Context r13 = this.v;     // Catch: Throwable -> L9
        w03 r8 = ic5.a;     // Catch: Throwable -> L9
        Float r10 = new Float(Settings.Global.getFloat(r13.getContentResolver(), "animator_duration_scale", 1.0f));     // Catch: Throwable -> L9
        this.q = r6;     // Catch: Throwable -> L9
        this.o = r1;     // Catch: Throwable -> L9
        this.p = 2;     // Catch: Throwable -> L9
        if (r6.b(r10, this) != r5) goto L8;
    L27:
        r4.unregisterContentObserver(r3);
        return j15.a;
    L26:
        return r5;
    L11:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L13:
        r1 = this.o;
        r6 = (q81) this.q;
        kb4.X(r11);     // Catch: Throwable -> L9
        goto L23
    L16:
        kb4.X(r11);
        r12 = (q81) this.q;
        r4.registerContentObserver(this.s, false, r3);
        r7 = new xv(this.u);     // Catch: Throwable -> L9
    L9:
        th = move-exception;
        r4.unregisterContentObserver(r3);
        throw th;
    }
}
