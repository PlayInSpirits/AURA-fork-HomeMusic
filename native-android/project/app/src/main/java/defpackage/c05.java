package defpackage;

import android.os.Parcel;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class c05 implements j45, zy3 {
    public Object n;

    public c05(ViewGroup viewGroup) {
        this.n = viewGroup.getOverlay();
    }

    @Override // defpackage.j45, defpackage.g45
    public boolean a() {
        ((ss0) this.n).getClass();
        return false;
    }

    @Override // defpackage.zy3
    public void accept(Object obj, Object obj2) {
        jg5 jg5Var = new jg5((cr4) obj2, 2);
        eh5 eh5Var = (eh5) ((lg5) obj).e();
        th1 th1Var = (th1) this.n;
        Parcel parcelM = eh5Var.m();
        int i = pg5.a;
        parcelM.writeStrongBinder(jg5Var);
        pg5.c(parcelM, th1Var);
        eh5Var.U(parcelM, 3);
    }

    @Override // defpackage.g45
    public ce d(long j, ce ceVar, ce ceVar2, ce ceVar3) {
        return ((ss0) this.n).d(j, ceVar, ceVar2, ceVar3);
    }

    @Override // defpackage.g45
    public ce k(long j, ce ceVar, ce ceVar2, ce ceVar3) {
        return ((ss0) this.n).k(j, ceVar, ceVar2, ceVar3);
    }

    @Override // defpackage.g45
    public ce l(ce ceVar, ce ceVar2, ce ceVar3) {
        return ((ss0) this.n).l(ceVar, ceVar2, ceVar3);
    }

    @Override // defpackage.g45
    public long m(ce ceVar, ce ceVar2, ce ceVar3) {
        return ((ss0) this.n).m(ceVar, ceVar2, ceVar3);
    }

    public /* synthetic */ c05(Object obj) {
        this.n = obj;
    }
}
