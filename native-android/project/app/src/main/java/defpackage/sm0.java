package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sm0 implements q64 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public sm0(q64 r1, ad3 r2) {
        this.a = 1;
        this.b = r1;
    }

    @Override // defpackage.q64
    public final float a(float r6) {
        int r0 = this.a;
        Object r5 = this.b;
        switch(r0) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        ml3 r7 = (ml3) r5;
        if (Float.isNaN(r6) == true) goto L18;
        float r8 = ((Number) ((uc3) r7.a).invoke(Float.valueOf(r6))).floatValue();
        zd3 r1 = (zd3) r7.e;
        boolean r3 = false;
        if (r8 <= 0.0f) goto L12;
        boolean r2 = true;
    L13:
        r1.setValue(Boolean.valueOf(r2));
        zd3 r9 = (zd3) r7.f;
        if (r8 >= 0.0f) goto L16;
        r3 = true;
    L16:
        r9.setValue(Boolean.valueOf(r3));
        return r8;
    L12:
        r2 = false;
        goto L13
    L18:
        return 0.0f;
    L5:
        return ((q64) r5).a(r6);
    }

    public sm0(ml3 r2) {
        this.a = 0;
        this.b = r2;
    }
}
