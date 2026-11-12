package defpackage;

import android.os.Parcel;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class c05 implements j45, zy3 {
    public Object n;

    public c05(ViewGroup r1) {
        this.n = r1.getOverlay();
    }

    @Override // defpackage.j45, defpackage.g45
    public boolean a() {
        ((ss0) this.n).getClass();
        return false;
    }

    @Override // defpackage.zy3
    public void accept(Object r3, Object r4) {
        jg5 r0 = new jg5((cr4) r4, 2);
        eh5 r5 = (eh5) ((lg5) r3).e();
        th1 r2 = (th1) this.n;
        Parcel r6 = r5.m();
        int r1 = pg5.a;
        r6.writeStrongBinder(r0);
        pg5.c(r6, r2);
        r5.U(r6, 3);
    }

    @Override // defpackage.g45
    public ce d(long r7, ce r9, ce r10, ce r11) {
        return ((ss0) this.n).d(r7, r9, r10, r11);
    }

    @Override // defpackage.g45
    public ce k(long r7, ce r9, ce r10, ce r11) {
        return ((ss0) this.n).k(r7, r9, r10, r11);
    }

    @Override // defpackage.g45
    public ce l(ce r1, ce r2, ce r3) {
        return ((ss0) this.n).l(r1, r2, r3);
    }

    @Override // defpackage.g45
    public long m(ce r1, ce r2, ce r3) {
        return ((ss0) this.n).m(r1, r2, r3);
    }

    public /* synthetic */ c05(Object r1) {
        this.n = r1;
    }
}
