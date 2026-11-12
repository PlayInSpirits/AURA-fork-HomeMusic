package defpackage;

import android.view.KeyEvent;
import android.widget.SeekBar;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ap2 extends uo {
    public final /* synthetic */ int u;
    public final /* synthetic */ KeyEvent.Callback v;

    public /* synthetic */ ap2(KeyEvent.Callback r1, int r2) {
        this.u = r2;
        super(14);
        this.v = r1;
    }

    private final void W() {
    }

    @Override // defpackage.uo
    public void D() {
        switch(this.u) {
            case 0: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        ((cp2) this.v).b();
    }

    @Override // defpackage.uo
    public void E() {
        switch(this.u) {
            case 0: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        ((cp2) this.v).b();
    }

    @Override // defpackage.uo
    public void F() {
        switch(this.u) {
            case 0: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        ((cp2) this.v).b();
    }

    @Override // defpackage.uo
    public void G() {
        int r0 = this.u;
        KeyEvent.Callback r1 = this.v;
        switch(r0) {
            case 0: goto L11;
            case 1: goto L9;
            case 2: goto L4;
            case 3: goto L7;
            case 4: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        ((lq2) r1).p();
        return;
    L7:
        ((aq2) r1).i();
        return;
    L9:
        ((ep2) r1).j();
        return;
    L11:
        ((cp2) r1).b();
    }

    @Override // defpackage.uo
    public final void H(wq2 r3) {
        int r0 = this.u;
        KeyEvent.Callback r2 = this.v;
        switch(r0) {
            case 0: goto L30;
            case 1: goto L28;
            case 2: goto L26;
            case 3: goto L24;
            default: goto L4;
        };
    L4:
        lq2 r4 = (lq2) r2;
        if (r3 == r4.w) goto L7;
    L22:
        r4.p();
        return;
    L7:
        if (wq2.b() == null) goto L22;
        vq2 r5 = r3.a;
        r5.getClass();
        yq2.b();
        Iterator r6 = Collections.unmodifiableList(r5.b).iterator();
    L10:
        if (r6.hasNext() == false) goto L22;
        wq2 r1 = (wq2) r6.next();
        if (Collections.unmodifiableList(r4.w.v).contains(r1) == true) goto L10;
        tq2 r7 = r4.w.a();
        if (r7 == null) goto L10;
        if (r7.n(r1) == false) goto L10;
        if (r4.y.contains(r1) == true) goto L10;
        r4.q();
        r4.o();
        return;
    L24:
        ((aq2) r2).i();
        return;
    L26:
        ((qp2) r2).t(true);
        return;
    L28:
        ((ep2) r2).j();
        return;
    L30:
        ((cp2) r2).b();
    }

    @Override // defpackage.uo
    public void I() {
        int r0 = this.u;
        KeyEvent.Callback r1 = this.v;
        switch(r0) {
            case 0: goto L11;
            case 1: goto L9;
            case 2: goto L4;
            case 3: goto L7;
            case 4: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        ((lq2) r1).p();
        return;
    L7:
        ((aq2) r1).i();
        return;
    L9:
        ((ep2) r1).j();
        return;
    L11:
        ((cp2) r1).b();
    }

    @Override // defpackage.uo
    public void J(wq2 r2) {
        int r0 = this.u;
        KeyEvent.Callback r1 = this.v;
        switch(r0) {
            case 0: goto L11;
            case 1: goto L9;
            case 2: goto L4;
            case 3: goto L7;
            case 4: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        lq2 r3 = (lq2) r1;
        r3.w = r2;
        r3.q();
        r3.o();
        return;
    L7:
        ((aq2) r1).dismiss();
        return;
    L9:
        ((ep2) r1).dismiss();
        return;
    L11:
        ((cp2) r1).b();
    }

    @Override // defpackage.uo
    public void K() {
        int r0 = this.u;
        KeyEvent.Callback r1 = this.v;
        switch(r0) {
            case 0: goto L9;
            case 1: goto L4;
            case 2: goto L7;
            case 3: goto L4;
            case 4: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        ((lq2) r1).p();
        return;
    L7:
        ((qp2) r1).t(false);
        return;
    L9:
        ((cp2) r1).b();
    }

    @Override // defpackage.uo
    public void L(wq2 r4) {
        int r0 = this.u;
        KeyEvent.Callback r3 = this.v;
        switch(r0) {
            case 2: goto L15;
            case 3: goto L4;
            case 4: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        int r1 = lq2.g0;
        lq2 r5 = (lq2) r3;
        if (r5.K == r4) goto L21;
        dq2 r6 = (dq2) r5.J.get(r4.c);
        if (r6 == null) goto L22;
        int r7 = r6.u.p;
        if (r7 != 0) goto L12;
        boolean r2 = true;
    L13:
        r6.t(r2);
        r6.w.setProgress(r7);
        return;
    L12:
        r2 = false;
        goto L13
    L22:
        return;
    L21:
        return;
    L15:
        qp2 r8 = (qp2) r3;
        SeekBar r9 = (SeekBar) r8.e0.get(r4);
        int r10 = r4.p;
        int r11 = qp2.B0;
        if (r9 != null) goto L18;
        return;
    L18:
        if (r8.Z == r4) goto L24;
        r9.setProgress(r10);
        return;
    }

    @Override // defpackage.uo
    public void M() {
        int r0 = this.u;
    }
}
