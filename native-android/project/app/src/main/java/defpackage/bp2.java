package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bp2 extends AsyncTask {
    public final int a;
    public final Context b;
    public final /* synthetic */ cp2 c;

    public bp2(cp2 r1, int r2, Context r3) {
        this.c = r1;
        this.a = r2;
        this.b = r3;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] r2) {
        Void[] r3 = (Void[]) r2;
        SparseArray r4 = cp2.B;
        int r0 = this.a;
        if (((Drawable.ConstantState) r4.get(r0)) == null) goto L5;
        return null;
    L5:
        return zz1.r(this.b, r0);
    }

    @Override // android.os.AsyncTask
    public final void onCancelled(Object r3) {
        Drawable r4 = (Drawable) r3;
        if (r4 == null) goto L5;
        cp2.B.put(this.a, r4.getConstantState());
    L5:
        this.c.s = null;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object r5) {
        Drawable r6 = (Drawable) r5;
        int r1 = this.a;
        cp2 r4 = this.c;
        if (r6 == null) goto L5;
        cp2.B.put(r1, r6.getConstantState());
        r4.s = null;
    L9:
        r4.setRemoteIndicatorDrawableInternal(r6);
        return;
    L5:
        Drawable.ConstantState r2 = (Drawable.ConstantState) cp2.B.get(r1);
        if (r2 == null) goto L8;
        r6 = r2.newDrawable();
    L8:
        r4.s = null;
        goto L9
    }
}
