package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class o33 implements gv2 {
    public qt n;
    public boolean o;
    public int p;

    @Override // defpackage.gv2
    public final void a(qu2 r1, boolean r2) {
    }

    @Override // defpackage.gv2
    public final void c(boolean r7) {
        if (this.o == true) goto L45;
        qt r6 = this.n;
        if (r7 == false) goto L9;
        r6.a();
        return;
    L9:
        qu2 r8 = r6.R;
        if (r8 != null) goto L12;
        return;
    L12:
        if (r6.s == null) goto L46;
        int r9 = r8.f.size();
        if (r9 == r6.s.length) goto L18;
        r6.a();
        return;
    L18:
        int r0 = r6.t;
        int r2 = 0;
    L19:
        if (r2 >= r9) goto L25;
        MenuItem r3 = r6.R.getItem(r2);
        if (r3.isChecked() == false) goto L23;
        r6.t = r3.getItemId();
        r6.u = r2;
    L23:
        r2 = r2 + 1;
        goto L19
    L25:
        if (r0 == r6.t) goto L29;
        rn r1 = r6.n;
        if (r1 == null) goto L29;
        ix4.a(r6, r1);
    L29:
        int r4 = r6.r;
        int r5 = r6.R.l().size();
        if (r4 == (-1)) goto L32;
        if (r4 != 0) goto L36;
    L35:
        boolean r10 = true;
    L37:
        int r11 = 0;
    L38:
        if (r11 >= r9) goto L47;
        r6.Q.o = true;
        r6.s[r11].setLabelVisibilityMode(r6.r);
        r6.s[r11].setShifting(r10);
        r6.s[r11].c((tu2) r6.R.getItem(r11));
        r6.Q.o = false;
        r11 = r11 + 1;
        goto L38
    L47:
        return;
    L36:
        r10 = false;
        goto L37
    L32:
        if (r5 <= 3) goto L36;
    L46:
        return;
    }

    @Override // defpackage.gv2
    public final boolean d(en4 r1) {
        return false;
    }

    @Override // defpackage.gv2
    public final boolean e() {
        return false;
    }

    @Override // defpackage.gv2
    public final boolean g(tu2 r1) {
        return false;
    }

    @Override // defpackage.gv2
    public final int getId() {
        return this.p;
    }

    @Override // defpackage.gv2
    public final void h(Parcelable r8) {
        if ((r8 instanceof n33) == false) goto L30;
        qt r0 = this.n;
        n33 r9 = (n33) r8;
        int r1 = r9.n;
        int r2 = r0.R.f.size();
        int r3 = 0;
        int r4 = 0;
    L5:
        if (r4 >= r2) goto L10;
        MenuItem r5 = r0.R.getItem(r4);
        if (r1 == r5.getItemId()) goto L8;
        r4 = r4 + 1;
        goto L5
    L8:
        r0.t = r1;
        r0.u = r4;
        r5.setChecked(true);
    L10:
        Context r6 = this.n.getContext();
        ae3 r10 = r9.o;
        SparseArray r7 = new SparseArray(r10.size());
        int r11 = 0;
    L12:
        if (r11 >= r10.size()) goto L18;
        int r12 = r10.keyAt(r11);
        zo r13 = (zo) r10.valueAt(r11);
        if (r13 == null) goto L16;
        r7.put(r12, new yo(r6, r13));
        r11 = r11 + 1;
        goto L12
    L16:
        kf2.n("BadgeDrawable's savedState cannot be null");
        return;
    L18:
        qt r14 = this.n;
        SparseArray r15 = r14.F;
        int r16 = 0;
    L20:
        if (r16 >= r7.size()) goto L25;
        int r17 = r7.keyAt(r16);
        if (r15.indexOfKey(r17) >= 0) goto L24;
        r15.append(r17, (yo) r7.get(r17));
    L24:
        r16 = r16 + 1;
        goto L20
    L25:
        k33[] r18 = r14.s;
        if (r18 == null) goto L39;
        int r19 = r18.length;
    L28:
        if (r3 >= r19) goto L40;
        k33 r20 = r18[r3];
        r20.setBadge((yo) r15.get(r20.getId()));
        r3 = r3 + 1;
        goto L28
    L40:
        return;
    L39:
        return;
    }

    @Override // defpackage.gv2
    public final boolean j(tu2 r1) {
        return false;
    }

    @Override // defpackage.gv2
    public final void l(Context r1, qu2 r2) {
        this.n.R = r2;
    }

    @Override // defpackage.gv2
    public final Parcelable m() {
        n33 r0 = new n33();
        r0.n = this.n.getSelectedItemId();
        SparseArray<yo> r5 = this.n.getBadgeDrawables();
        ae3 r1 = new ae3();
        int r2 = 0;
    L4:
        if (r2 >= r5.size()) goto L10;
        int r3 = r5.keyAt(r2);
        yo r4 = r5.valueAt(r2);
        if (r4 == null) goto L8;
        r1.put(r3, r4.r.a);
        r2 = r2 + 1;
        goto L4
    L8:
        kf2.n("badgeDrawable cannot be null");
        return null;
    L10:
        r0.o = r1;
        return r0;
    }
}
