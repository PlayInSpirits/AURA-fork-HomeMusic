package defpackage;

import android.view.View;
import android.view.ViewGroup;
import app.homemusic.R;
import com.google.android.material.chip.ChipGroup;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h91 extends ViewGroup {
    public int n;
    public int o;
    public boolean p;
    public int q;

    public int getItemSpacing() {
        return this.o;
    }

    public int getLineSpacing() {
        return this.n;
    }

    public int getRowCount() {
        return this.q;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        if (getChildCount() != 0) goto L6;
        this.q = 0;
        return;
    L6:
        this.q = 1;
        WeakHashMap r16 = j65.a;
        if (getLayoutDirection() != 1) goto L9;
        boolean r17 = true;
    L10:
        if (r17 == false) goto L12;
        int r0 = getPaddingRight();
    L13:
        if (r17 == false) goto L15;
        int r1 = getPaddingLeft();
    L16:
        int r2 = getPaddingTop();
        int r18 = (r14 - r12) - r1;
        int r3 = 0;
        int r4 = r0;
        int r19 = r2;
    L18:
        if (r3 >= getChildCount()) goto L36;
        View r5 = getChildAt(r3);
        if (r5.getVisibility() != 8) goto L22;
        r5.setTag(R.id.row_index_key, -1);
    L35:
        r3 = r3 + 1;
        goto L18
    L22:
        ViewGroup.LayoutParams r6 = r5.getLayoutParams();
        if ((r6 instanceof ViewGroup.MarginLayoutParams) == false) goto L25;
        ViewGroup.MarginLayoutParams r7 = (ViewGroup.MarginLayoutParams) r6;
        int r8 = r7.getMarginStart();
        int r9 = r7.getMarginEnd();
    L26:
        int r10 = r5.getMeasuredWidth() + (r4 + r8);
        if (this.p == true) goto L30;
        if (r10 <= r18) goto L30;
        r19 = this.n + r2;
        this.q++;
        r4 = r0;
    L30:
        r5.setTag(R.id.row_index_key, Integer.valueOf(this.q - 1));
        int r20 = r4 + r8;
        int r21 = r5.getMeasuredWidth() + r20;
        int r22 = r5.getMeasuredHeight() + r19;
        if (r17 == false) goto L33;
        r5.layout(r18 - r21, r19, (r18 - r4) - r8, r22);
    L34:
        r4 = r4 + ((r5.getMeasuredWidth() + (r8 + r9)) + this.o);
        r2 = r22;
        goto L35
    L33:
        r5.layout(r20, r19, r21, r22);
        goto L34
    L25:
        r9 = 0;
        r8 = 0;
        goto L26
    L36:
        return;
    L15:
        r1 = getPaddingRight();
        goto L16
    L12:
        r0 = getPaddingLeft();
        goto L13
    L9:
        r17 = false;
        goto L10
    }

    @Override // android.view.View
    public final void onMeasure(int r20, int r21) {
        int r1 = View.MeasureSpec.getSize(r20);
        int r2 = View.MeasureSpec.getMode(r20);
        int r3 = View.MeasureSpec.getSize(r21);
        int r4 = View.MeasureSpec.getMode(r21);
        if (r2 == Integer.MIN_VALUE) goto L7;
        if (r2 == 1073741824) goto L7;
        int r7 = Integer.MAX_VALUE;
    L8:
        int r8 = getPaddingLeft();
        int r9 = getPaddingTop();
        int r10 = r7 - getPaddingRight();
        int r11 = r9;
        int r12 = 0;
        int r13 = 0;
    L10:
        if (r12 >= getChildCount()) goto L31;
        View r14 = getChildAt(r12);
        if (r14.getVisibility() == 8) goto L30;
        measureChild(r14, r20, r21);
        ViewGroup.LayoutParams r5 = r14.getLayoutParams();
        if ((r5 instanceof ViewGroup.MarginLayoutParams) == false) goto L17;
        ViewGroup.MarginLayoutParams r6 = (ViewGroup.MarginLayoutParams) r5;
        int r15 = r6.leftMargin;
        int r16 = r6.rightMargin;
    L18:
        int r18 = r16;
        if ((r14.getMeasuredWidth() + (r8 + r15)) > r10) goto L21;
    L23:
        int r17 = r14.getMeasuredWidth() + (r8 + r15);
        int r19 = r14.getMeasuredHeight() + r11;
        if (r17 <= r13) goto L26;
        r13 = r17;
    L26:
        int r22 = ((r14.getMeasuredWidth() + (r15 + r18)) + this.o) + r8;
        if (r12 != (getChildCount() - 1)) goto L29;
        r13 = r13 + r18;
    L29:
        r8 = r22;
        r9 = r19;
        goto L30
    L21:
        if (((ChipGroup) this).p == true) goto L23;
        r8 = getPaddingLeft();
        r11 = r9 + this.n;
        goto L23
    L17:
        r16 = 0;
        r15 = 0;
    L30:
        r12 = r12 + 1;
        goto L10
    L31:
        int r23 = getPaddingRight() + r13;
        int r24 = getPaddingBottom() + r9;
        if (r2 == Integer.MIN_VALUE) goto L36;
        int r25 = 1073741824;
        if (r2 == 1073741824) goto L37;
        r1 = r23;
    L37:
        if (r4 == Integer.MIN_VALUE) goto L40;
        if (r4 == r25) goto L41;
        r3 = r24;
    L41:
        setMeasuredDimension(r1, r3);
        return;
    L40:
        r3 = Math.min(r24, r3);
        goto L41
    L36:
        r25 = 1073741824;
        r1 = Math.min(r23, r1);
    L7:
        r7 = r1;
        goto L8
    }

    public void setItemSpacing(int r1) {
        this.o = r1;
    }

    public void setLineSpacing(int r1) {
        this.n = r1;
    }

    public void setSingleLine(boolean r1) {
        this.p = r1;
    }
}
