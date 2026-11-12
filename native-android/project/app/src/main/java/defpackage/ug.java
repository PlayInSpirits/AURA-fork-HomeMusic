package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ug implements ah, DialogInterface.OnClickListener {
    public f9 n;
    public vg o;
    public CharSequence p;
    public final /* synthetic */ bh q;

    public ug(bh r1) {
        this.q = r1;
    }

    @Override // defpackage.ah
    public final boolean b() {
        f9 r0 = this.n;
        if (r0 != null) goto L5;
        return false;
    L5:
        return r0.isShowing();
    }

    @Override // defpackage.ah
    public final int c() {
        return 0;
    }

    @Override // defpackage.ah
    public final void d(int r1) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.ah
    public final void dismiss() {
        f9 r0 = this.n;
        if (r0 == null) goto L6;
        r0.dismiss();
        this.n = null;
        return;
    }

    @Override // defpackage.ah
    public final CharSequence e() {
        return this.p;
    }

    @Override // defpackage.ah
    public final Drawable g() {
        return null;
    }

    @Override // defpackage.ah
    public final void h(CharSequence r1) {
        this.p = r1;
    }

    @Override // defpackage.ah
    public final void i(Drawable r1) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.ah
    public final void j(int r1) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.ah
    public final void m(int r1) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.ah
    public final void n(int r5, int r6) {
        if (this.o != null) goto L5;
        return;
    L5:
        bh r1 = this.q;
        e9 r0 = new e9(r1.getPopupContext());
        CharSequence r2 = this.p;
        if (r2 == null) goto L8;
        r0.setTitle(r2);
    L8:
        vg r3 = this.o;
        int r4 = r1.getSelectedItemPosition();
        a9 r7 = r0.a;
        r7.q = r3;
        r7.r = this;
        r7.w = r4;
        r7.v = true;
        f9 r8 = r0.create();
        this.n = r8;
        AlertController$RecycleListView r9 = r8.t.f;
        r9.setTextDirection(r5);
        r9.setTextAlignment(r6);
        this.n.show();
    }

    @Override // defpackage.ah
    public final int o() {
        return 0;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface r4, int r5) {
        bh r6 = this.q;
        r6.setSelection(r5);
        if (r6.getOnItemClickListener() == null) goto L5;
        r6.performItemClick(null, r5, this.o.getItemId(r5));
    L5:
        dismiss();
    }

    @Override // defpackage.ah
    public final void p(ListAdapter r1) {
        this.o = (vg) r1;
    }
}
