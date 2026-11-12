package defpackage;

import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rz extends uv {
    public final /* synthetic */ int p;
    public final /* synthetic */ CarouselLayoutManager q;

    public rz(CarouselLayoutManager r2, int r3) {
        this.p = r3;
        switch(r3) {
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        this.q = r2;
        super(1, 1);
        return;
    L6:
        this.q = r2;
        super(0, 1);
    }

    @Override // defpackage.uv
    public final int f() {
        int r0 = this.p;
        CarouselLayoutManager r1 = this.q;
        switch(r0) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return r1.o - r1.E();
    L7:
        return r1.o;
    }

    @Override // defpackage.uv
    public final int g() {
        switch(this.p) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        return 0;
    L7:
        return this.q.F();
    }

    @Override // defpackage.uv
    public final int h() {
        int r0 = this.p;
        CarouselLayoutManager r1 = this.q;
        switch(r0) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return r1.n;
    L7:
        return r1.n - r1.G();
    }

    @Override // defpackage.uv
    public final int i() {
        switch(this.p) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        return 0;
    L5:
        return this.q.H();
    }
}
