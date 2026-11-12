package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ny extends z00 {
    public final wf1 q;
    public final wf1 r;

    public ny(wf1 r1, ne0 r2, int r3, wv r4) {
        super(r2, r3, r4);
        this.q = r1;
        this.r = r1;
    }

    @Override // defpackage.z00
    public final Object b(rq3 r6, vd0 r7) {
        if ((r7 instanceof my) == false) goto L7;
        my r0 = (my) r7;
        int r1 = r0.q;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.q = r1 - Integer.MIN_VALUE;
    L8:
        Object r8 = r0.o;
        int r2 = r0.q;
        j15 r3 = j15.a;
        if (r2 == 0) goto L14;
        if (r2 != 1) goto L12;
        r6 = r0.n;
        kb4.X(r8);
    L21:
        if (r6.s.C() == false) goto L23;
        return r3;
    L23:
        kf2.o("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
        return null;
    L12:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L14:
        kb4.X(r8);
        r0.n = r6;
        r0.q = 1;
        Object r5 = this.q.invoke(r6, r0);
        xe0 r9 = xe0.n;
        if (r5 == r9) goto L18;
        r5 = r3;
    L18:
        if (r5 != r9) goto L21;
        return r9;
    L7:
        r0 = new my(this, (wd0) r7);
        goto L8
    }

    @Override // defpackage.z00
    public final z00 d(ne0 r2, int r3, wv r4) {
        return new ny(this.r, r2, r3, r4);
    }

    @Override // defpackage.z00
    public final String toString() {
        return "block[" + this.q + "] -> " + super.toString();
    }
}
