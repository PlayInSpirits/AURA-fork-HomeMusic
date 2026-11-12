package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sy3 {
    public final int a;
    public final z70 b;
    public float c;

    public sy3(int r1, z70 r2) {
        this.a = r1;
        this.b = r2;
    }

    public final Object a(float r5, wd0 r6) {
        if ((r6 instanceof ry3) == false) goto L7;
        ry3 r0 = (ry3) r6;
        int r1 = r0.p;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.p = r1 - Integer.MIN_VALUE;
    L8:
        Object r7 = r0.n;
        int r2 = r0.p;
        if (r2 == 0) goto L14;
        if (r2 != 1) goto L12;
        kb4.X(r7);
    L17:
        this.c += ((Number) r7).floatValue();
        return j15.a;
    L12:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L14:
        kb4.X(r7);
        Float r8 = new Float(r5);
        r0.p = 1;
        r7 = this.b.invoke(r8, r0);
        xe0 r9 = xe0.n;
        if (r7 != r9) goto L17;
        return r9;
    L7:
        r0 = new ry3(this, r6);
        goto L8
    }
}
