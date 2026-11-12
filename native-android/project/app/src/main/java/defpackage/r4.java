package defpackage;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class r4 extends vb1 {
    public final /* synthetic */ int w;
    public final /* synthetic */ View x;

    public r4(ActionMenuItemView r2) {
        this.w = 0;
        this.x = r2;
        super(r2);
    }

    @Override // defpackage.vb1
    public final nd4 b() {
        int r0 = this.w;
        View r2 = this.x;
        switch(r0) {
            case 0: goto L9;
            default: goto L4;
        };
    L4:
        t4 r3 = ((v4) r2).q.G;
        if (r3 != null) goto L8;
        return null;
    L8:
        return r3.a();
    L9:
        s4 r4 = ((ActionMenuItemView) r2).z;
        if (r4 == null) goto L16;
        t4 r5 = ((u4) r4).a.H;
        if (r5 != null) goto L14;
        return null;
    L14:
        return r5.a();
    L16:
        return null;
    }

    @Override // defpackage.vb1
    public final boolean c() {
        int r0 = this.w;
        View r2 = this.x;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((v4) r2).q.n();
        return true;
    L6:
        ActionMenuItemView r3 = (ActionMenuItemView) r2;
        pu2 r1 = r3.x;
        if (r1 != null) goto L9;
    L15:
        return false;
    L9:
        if (r1.a(r3.u) == false) goto L15;
        nd4 r4 = b();
        if (r4 == null) goto L15;
        if (r4.b() == false) goto L15;
        return true;
    }

    @Override // defpackage.vb1
    public boolean d() {
        switch(this.w) {
            case 1: goto L6;
            default: goto L5;
        };
    L6:
        y4 r1 = ((v4) this.x).q;
        if (r1.I == null) goto L9;
        return false;
    L9:
        r1.f();
        return true;
    L5:
        return super.d();
    }

    public r4(v4 r2, v4 r3) {
        this.w = 1;
        this.x = r2;
        super(r3);
    }
}
