package defpackage;

import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rz extends uv {
    public final /* synthetic */ int p;
    public final /* synthetic */ CarouselLayoutManager q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rz(CarouselLayoutManager carouselLayoutManager, int i) {
        super(1, 1);
        this.p = i;
        switch (i) {
            case 1:
                this.q = carouselLayoutManager;
                super(0, 1);
                break;
            default:
                this.q = carouselLayoutManager;
                break;
        }
    }

    @Override // defpackage.uv
    public final int f() {
        int i = this.p;
        CarouselLayoutManager carouselLayoutManager = this.q;
        switch (i) {
            case 0:
                return carouselLayoutManager.o;
            default:
                return carouselLayoutManager.o - carouselLayoutManager.E();
        }
    }

    @Override // defpackage.uv
    public final int g() {
        switch (this.p) {
            case 0:
                return this.q.F();
            default:
                return 0;
        }
    }

    @Override // defpackage.uv
    public final int h() {
        int i = this.p;
        CarouselLayoutManager carouselLayoutManager = this.q;
        switch (i) {
            case 0:
                return carouselLayoutManager.n - carouselLayoutManager.G();
            default:
                return carouselLayoutManager.n;
        }
    }

    @Override // defpackage.uv
    public final int i() {
        switch (this.p) {
            case 0:
                return 0;
            default:
                return this.q.H();
        }
    }
}
