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
    public final void a(qu2 qu2Var, boolean z) {
    }

    @Override // defpackage.gv2
    public final void c(boolean z) {
        rn rnVar;
        if (this.o) {
            return;
        }
        qt qtVar = this.n;
        if (z) {
            qtVar.a();
            return;
        }
        qu2 qu2Var = qtVar.R;
        if (qu2Var == null || qtVar.s == null) {
            return;
        }
        int size = qu2Var.f.size();
        if (size != qtVar.s.length) {
            qtVar.a();
            return;
        }
        int i = qtVar.t;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = qtVar.R.getItem(i2);
            if (item.isChecked()) {
                qtVar.t = item.getItemId();
                qtVar.u = i2;
            }
        }
        if (i != qtVar.t && (rnVar = qtVar.n) != null) {
            ix4.a(qtVar, rnVar);
        }
        int i3 = qtVar.r;
        boolean z2 = i3 != -1 ? i3 == 0 : qtVar.R.l().size() > 3;
        for (int i4 = 0; i4 < size; i4++) {
            qtVar.Q.o = true;
            qtVar.s[i4].setLabelVisibilityMode(qtVar.r);
            qtVar.s[i4].setShifting(z2);
            qtVar.s[i4].c((tu2) qtVar.R.getItem(i4));
            qtVar.Q.o = false;
        }
    }

    @Override // defpackage.gv2
    public final boolean d(en4 en4Var) {
        return false;
    }

    @Override // defpackage.gv2
    public final boolean e() {
        return false;
    }

    @Override // defpackage.gv2
    public final boolean g(tu2 tu2Var) {
        return false;
    }

    @Override // defpackage.gv2
    public final int getId() {
        return this.p;
    }

    @Override // defpackage.gv2
    public final void h(Parcelable parcelable) {
        if (parcelable instanceof n33) {
            qt qtVar = this.n;
            n33 n33Var = (n33) parcelable;
            int i = n33Var.n;
            int size = qtVar.R.f.size();
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem item = qtVar.R.getItem(i2);
                if (i == item.getItemId()) {
                    qtVar.t = i;
                    qtVar.u = i2;
                    item.setChecked(true);
                    break;
                }
            }
            Context context = this.n.getContext();
            ae3 ae3Var = n33Var.o;
            SparseArray sparseArray = new SparseArray(ae3Var.size());
            for (int i3 = 0; i3 < ae3Var.size(); i3++) {
                int iKeyAt = ae3Var.keyAt(i3);
                zo zoVar = (zo) ae3Var.valueAt(i3);
                if (zoVar == null) {
                    kf2.n("BadgeDrawable's savedState cannot be null");
                    return;
                }
                sparseArray.put(iKeyAt, new yo(context, zoVar));
            }
            qt qtVar2 = this.n;
            SparseArray sparseArray2 = qtVar2.F;
            for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                int iKeyAt2 = sparseArray.keyAt(i4);
                if (sparseArray2.indexOfKey(iKeyAt2) < 0) {
                    sparseArray2.append(iKeyAt2, (yo) sparseArray.get(iKeyAt2));
                }
            }
            k33[] k33VarArr = qtVar2.s;
            if (k33VarArr != null) {
                for (k33 k33Var : k33VarArr) {
                    k33Var.setBadge((yo) sparseArray2.get(k33Var.getId()));
                }
            }
        }
    }

    @Override // defpackage.gv2
    public final boolean j(tu2 tu2Var) {
        return false;
    }

    @Override // defpackage.gv2
    public final void l(Context context, qu2 qu2Var) {
        this.n.R = qu2Var;
    }

    @Override // defpackage.gv2
    public final Parcelable m() {
        n33 n33Var = new n33();
        n33Var.n = this.n.getSelectedItemId();
        SparseArray<yo> badgeDrawables = this.n.getBadgeDrawables();
        ae3 ae3Var = new ae3();
        for (int i = 0; i < badgeDrawables.size(); i++) {
            int iKeyAt = badgeDrawables.keyAt(i);
            yo yoVarValueAt = badgeDrawables.valueAt(i);
            if (yoVarValueAt == null) {
                kf2.n("badgeDrawable cannot be null");
                return null;
            }
            ae3Var.put(iKeyAt, yoVarValueAt.r.a);
        }
        n33Var.o = ae3Var;
        return n33Var;
    }
}
