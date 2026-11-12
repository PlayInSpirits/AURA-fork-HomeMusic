package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class kb0 extends View {
    public int[] n;
    public int o;
    public Context p;
    public ep q;
    public String r;
    public String s;
    public HashMap t;

    public final void a(String r6) {
        Context r0 = this.p;
        if (r6.length() == 0) goto L40;
        if (r0 == null) goto L41;
        String r7 = r6.trim();
        if ((getParent() instanceof ConstraintLayout) == false) goto L10;
        ConstraintLayout r1 = (ConstraintLayout) getParent();
    L12:
        if (isInEditMode() == false) goto L24;
        if (r1 == null) goto L24;
        if (r7 == null) goto L20;
        HashMap r3 = r1.z;
        if (r3 == null) goto L20;
        if (r3.containsKey(r7) == false) goto L20;
        Object r4 = r1.z.get(r7);
    L22:
        if ((r4 instanceof Integer) == false) goto L24;
        int r5 = ((Integer) r4).intValue();
    L25:
        if (r5 != 0) goto L28;
        if (r1 == null) goto L28;
        r5 = d(r1, r7);
    L28:
        if (r5 == 0) goto L37;
    L30:
        if (r5 != 0) goto L32;
        r5 = r0.getResources().getIdentifier(r7, "id", r0.getPackageName());
    L32:
        if (r5 == 0) goto L34;
        this.t.put(Integer.valueOf(r5), r7);
        b(r5);
        return;
    L34:
        Log.w("ConstraintHelper", "Could not find id of \"" + r7 + "\"");
        return;
    L37:
        r5 = ys3.class.getField(r7).getInt(null);     // Catch: Exception -> L36
    L20:
        r4 = null;
    L24:
        r5 = 0;
        goto L25
    L10:
        r1 = null;
        goto L12
    L41:
        return;
    }

    public final void b(int r4) {
        if (r4 != getId()) goto L5;
        return;
    L5:
        int r0 = this.o + 1;
        int[] r1 = this.n;
        if (r0 <= r1.length) goto L8;
        this.n = Arrays.copyOf(r1, r1.length * 2);
    L8:
        int[] r2 = this.n;
        int r3 = this.o;
        r2[r3] = r4;
        this.o = r3 + 1;
    }

    public final void c(String r8) {
        if (r8.length() != 0) goto L6;
        return;
    L6:
        if (this.p == null) goto L33;
        String r9 = r8.trim();
        if ((getParent() instanceof ConstraintLayout) == false) goto L11;
        ConstraintLayout r0 = (ConstraintLayout) getParent();
    L13:
        if (r0 != null) goto L16;
        Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
        return;
    L16:
        int r2 = r0.getChildCount();
        int r3 = 0;
    L17:
        if (r3 >= r2) goto L34;
        View r4 = r0.getChildAt(r3);
        ViewGroup.LayoutParams r5 = r4.getLayoutParams();
        if ((r5 instanceof mb0) == false) goto L26;
        if (r9.equals(((mb0) r5).Y) == false) goto L26;
        if (r4.getId() != (-1)) goto L25;
        Log.w("ConstraintHelper", "to use ConstraintTag view " + r4.getClass().getSimpleName() + " must have an ID");
        goto L26
    L25:
        b(r4.getId());
    L26:
        r3 = r3 + 1;
        goto L17
    L34:
        return;
    L11:
        r0 = null;
        goto L13
    }

    public final int d(ConstraintLayout r7, String r8) {
        if (r8 == null) goto L19;
        Resources r6 = this.p.getResources();
        if (r6 == null) goto L19;
        int r1 = r7.getChildCount();
        int r2 = 0;
    L8:
        if (r2 >= r1) goto L19;
        View r3 = r7.getChildAt(r2);
        if (r3.getId() == (-1)) goto L18;
        String r4 = r6.getResourceEntryName(r3.getId());     // Catch: Resources.NotFoundException -> L13
    L15:
        if (r8.equals(r4) == false) goto L18;
        return r3.getId();
    L13:
        r4 = null;
    L18:
        r2 = r2 + 1;
    L19:
        return 0;
    }

    public final void e() {
        if (this.q == null) goto L10;
        ViewGroup.LayoutParams r0 = getLayoutParams();
        if ((r0 instanceof mb0) == false) goto L9;
        ep r2 = this.q;
        ((mb0) r0).p0 = r2;
        return;
    L9:
        return;
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.n, this.o);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        String r0 = this.r;
        if (r0 == null) goto L5;
        setIds(r0);
    L5:
        String r1 = this.s;
        if (r1 == null) goto L9;
        setReferenceTags(r1);
        return;
    }

    @Override // android.view.View
    public final void onDraw(Canvas r1) {
    }

    @Override // android.view.View
    public final void onMeasure(int r1, int r2) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String r4) {
        this.r = r4;
        if (r4 != null) goto L5;
        return;
    L5:
        int r0 = 0;
        this.o = 0;
    L6:
        int r1 = r4.indexOf(44, r0);
        if (r1 == (-1)) goto L8;
        a(r4.substring(r0, r1));
        r0 = r1 + 1;
        goto L6
    L8:
        a(r4.substring(r0));
    }

    public void setReferenceTags(String r4) {
        this.s = r4;
        if (r4 != null) goto L5;
        return;
    L5:
        int r0 = 0;
        this.o = 0;
    L6:
        int r1 = r4.indexOf(44, r0);
        if (r1 == (-1)) goto L8;
        c(r4.substring(r0, r1));
        r0 = r1 + 1;
        goto L6
    L8:
        c(r4.substring(r0));
    }

    public void setReferencedIds(int[] r3) {
        this.r = null;
        int r0 = 0;
        this.o = 0;
    L4:
        if (r0 >= r3.length) goto L6;
        b(r3[r0]);
        r0 = r0 + 1;
        goto L4
    }

    @Override // android.view.View
    public final void setTag(int r1, Object r2) {
        super.setTag(r1, r2);
        if (r2 == null) goto L5;
        return;
    L5:
        if (this.r != null) goto L9;
        b(r1);
        return;
    }
}
