package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.util.SparseArray;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class bp2 extends AsyncTask {
    public final int a;
    public final Context b;
    public final /* synthetic */ cp2 c;

    public bp2(cp2 cp2Var, int i, Context context) {
        this.c = cp2Var;
        this.a = i;
        this.b = context;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        SparseArray sparseArray = cp2.B;
        int i = this.a;
        if (((Drawable.ConstantState) sparseArray.get(i)) == null) {
            return zz1.r(this.b, i);
        }
        return null;
    }

    @Override // android.os.AsyncTask
    public final void onCancelled(Object obj) {
        Drawable drawable = (Drawable) obj;
        if (drawable != null) {
            cp2.B.put(this.a, drawable.getConstantState());
        }
        this.c.s = null;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Drawable drawable = (Drawable) obj;
        int i = this.a;
        cp2 cp2Var = this.c;
        if (drawable != null) {
            cp2.B.put(i, drawable.getConstantState());
            cp2Var.s = null;
        } else {
            Drawable.ConstantState constantState = (Drawable.ConstantState) cp2.B.get(i);
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            cp2Var.s = null;
        }
        cp2Var.setRemoteIndicatorDrawableInternal(drawable);
    }
}
