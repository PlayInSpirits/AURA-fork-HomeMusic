package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ug implements ah, DialogInterface.OnClickListener {
    public f9 n;
    public vg o;
    public CharSequence p;
    public final /* synthetic */ bh q;

    public ug(bh bhVar) {
        this.q = bhVar;
    }

    @Override // defpackage.ah
    public final boolean b() {
        f9 f9Var = this.n;
        if (f9Var != null) {
            return f9Var.isShowing();
        }
        return false;
    }

    @Override // defpackage.ah
    public final int c() {
        return 0;
    }

    @Override // defpackage.ah
    public final void d(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.ah
    public final void dismiss() {
        f9 f9Var = this.n;
        if (f9Var != null) {
            f9Var.dismiss();
            this.n = null;
        }
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
    public final void h(CharSequence charSequence) {
        this.p = charSequence;
    }

    @Override // defpackage.ah
    public final void i(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.ah
    public final void j(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.ah
    public final void m(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.ah
    public final void n(int i, int i2) {
        if (this.o == null) {
            return;
        }
        bh bhVar = this.q;
        e9 e9Var = new e9(bhVar.getPopupContext());
        CharSequence charSequence = this.p;
        if (charSequence != null) {
            e9Var.setTitle(charSequence);
        }
        vg vgVar = this.o;
        int selectedItemPosition = bhVar.getSelectedItemPosition();
        a9 a9Var = e9Var.a;
        a9Var.q = vgVar;
        a9Var.r = this;
        a9Var.w = selectedItemPosition;
        a9Var.v = true;
        f9 create = e9Var.create();
        this.n = create;
        AlertController$RecycleListView alertController$RecycleListView = create.t.f;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.n.show();
    }

    @Override // defpackage.ah
    public final int o() {
        return 0;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        bh bhVar = this.q;
        bhVar.setSelection(i);
        if (bhVar.getOnItemClickListener() != null) {
            bhVar.performItemClick(null, i, this.o.getItemId(i));
        }
        dismiss();
    }

    @Override // defpackage.ah
    public final void p(ListAdapter listAdapter) {
        this.o = (vg) listAdapter;
    }
}
