package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class za2 extends ViewGroup {
    public int A;
    public int B;
    public boolean n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public float t;
    public boolean u;
    public int[] v;
    public int[] w;
    public Drawable x;
    public int y;
    public int z;

    public za2(Context r12, AttributeSet r13, int r14) {
        super(r12, r13, r14);
        this.n = true;
        this.o = -1;
        this.p = 0;
        this.r = 8388659;
        int[] r6 = st3.o;
        jv3 r3 = jv3.f(r12, r13, r6, r14);
        j65.n(this, r12, r6, r13, (TypedArray) r3.o, r14, 0);
        TypedArray r11 = (TypedArray) r3.o;
        int r15 = r11.getInt(1, -1);
        if (r15 < 0) goto L5;
        setOrientation(r15);
    L5:
        int r16 = r11.getInt(0, -1);
        if (r16 < 0) goto L8;
        setGravity(r16);
    L8:
        boolean r17 = r11.getBoolean(2, true);
        if (r17 == true) goto L11;
        setBaselineAligned(r17);
    L11:
        this.t = r11.getFloat(4, -1.0f);
        this.o = r11.getInt(3, -1);
        this.u = r11.getBoolean(7, false);
        setDividerDrawable(r3.c(5));
        this.A = r11.getInt(8, 0);
        this.B = r11.getDimensionPixelSize(6, 0);
        r3.g();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams r1) {
        return r1 instanceof ya2;
    }

    public final void d(Canvas r5, int r6) {
        this.x.setBounds(getPaddingLeft() + this.B, r6, (getWidth() - getPaddingRight()) - this.B, this.z + r6);
        this.x.draw(r5);
    }

    public final void e(Canvas r6, int r7) {
        this.x.setBounds(r7, getPaddingTop() + this.B, this.y + r7, (getHeight() - getPaddingBottom()) - this.B);
        this.x.draw(r6);
    }

    public ya2 f() {
        int r2 = this.q;
        if (r2 != 0) goto L7;
        return new ya2(-2, -2);
    L7:
        if (r2 == 1) goto L9;
        return null;
    L9:
        return new ya2(-1, -2);
    }

    public ya2 g(AttributeSet r2) {
        return new ya2(getContext(), r2);
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return f();
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet r1) {
        return g(r1);
    }

    @Override // android.view.View
    public int getBaseline() {
        if (this.o < 0) goto L5;
        int r0 = getChildCount();
        int r1 = this.o;
        if (r0 <= r1) goto L28;
        View r2 = getChildAt(r1);
        int r3 = r2.getBaseline();
        if (r3 == (-1)) goto L11;
        int r4 = this.p;
        if (this.q != 1) goto L27;
        int r5 = this.r & 112;
        if (r5 == 48) goto L27;
        if (r5 != 16) goto L22;
        r4 = r4 + (((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.s) / 2);
        goto L27
    L22:
        if (r5 != 80) goto L27;
        r4 = ((getBottom() - getTop()) - getPaddingBottom()) - this.s;
    L27:
        return (r4 + ((LinearLayout.LayoutParams) ((ya2) r2.getLayoutParams())).topMargin) + r3;
    L11:
        if (this.o != 0) goto L13;
        return -1;
    L13:
        tb4.e("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        return 0;
    L28:
        tb4.e("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        return 0;
    L5:
        return super.getBaseline();
    }

    public int getBaselineAlignedChildIndex() {
        return this.o;
    }

    public Drawable getDividerDrawable() {
        return this.x;
    }

    public int getDividerPadding() {
        return this.B;
    }

    public int getDividerWidth() {
        return this.y;
    }

    public int getGravity() {
        return this.r;
    }

    public int getOrientation() {
        return this.q;
    }

    public int getShowDividers() {
        return this.A;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.t;
    }

    public ya2 h(ViewGroup.LayoutParams r1) {
        if ((r1 instanceof ya2) == false) goto L7;
        return new ya2((ya2) r1);
    L7:
        if ((r1 instanceof ViewGroup.MarginLayoutParams) == false) goto L11;
        return new ya2((ViewGroup.MarginLayoutParams) r1);
    L11:
        return new ya2(r1);
    }

    public final boolean i(int r5) {
        if (r5 == 0) goto L5;
        int r2 = getChildCount();
        int r3 = this.A;
        if (r5 != r2) goto L15;
        if ((r3 & 4) == 0) goto L13;
        return true;
    L13:
        return false;
    L15:
        if ((r3 & 2) == 0) goto L22;
        int r6 = r5 - 1;
    L17:
        if (r6 < 0) goto L22;
        if (getChildAt(r6).getVisibility() != 8) goto L20;
        r6 = r6 - 1;
        goto L17
    L20:
        return true;
    L22:
        return false;
    L5:
        if ((this.A & 1) == 0) goto L7;
        return true;
    L7:
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas r8) {
        if (this.x == null) goto L69;
        int r2 = 0;
        if (this.q != 1) goto L25;
        int r0 = getVirtualChildCount();
    L8:
        if (r2 >= r0) goto L18;
        View r4 = getChildAt(r2);
        if (r4 == null) goto L16;
        if (r4.getVisibility() == 8) goto L16;
        if (i(r2) == false) goto L16;
        d(r8, (r4.getTop() - ((LinearLayout.LayoutParams) ((ya2) r4.getLayoutParams())).topMargin) - this.z);
    L16:
        r2 = r2 + 1;
        goto L8
    L18:
        if (i(r0) == false) goto L67;
        View r1 = getChildAt(r0 - 1);
        if (r1 != null) goto L22;
        int r3 = (getHeight() - getPaddingBottom()) - this.z;
    L23:
        d(r8, r3);
        return;
    L22:
        r3 = r1.getBottom() + ((LinearLayout.LayoutParams) ((ya2) r1.getLayoutParams())).bottomMargin;
        goto L23
    L67:
        return;
    L25:
        int r5 = getVirtualChildCount();
        boolean r6 = e85.a;
        if (getLayoutDirection() != 1) goto L28;
        boolean r7 = true;
    L29:
        if (r2 >= r5) goto L43;
        View r9 = getChildAt(r2);
        if (r9 == null) goto L41;
        if (r9.getVisibility() == 8) goto L41;
        if (i(r2) == false) goto L41;
        ya2 r10 = (ya2) r9.getLayoutParams();
        if (r7 == false) goto L39;
        int r11 = r9.getRight() + ((LinearLayout.LayoutParams) r10).rightMargin;
    L40:
        e(r8, r11);
        goto L41
    L39:
        r11 = (r9.getLeft() - ((LinearLayout.LayoutParams) r10).leftMargin) - this.y;
    L41:
        r2 = r2 + 1;
        goto L29
    L43:
        if (i(r5) == false) goto L68;
        View r12 = getChildAt(r5 - 1);
        if (r12 != null) goto L50;
        if (r7 == false) goto L48;
        int r13 = getPaddingLeft();
    L54:
        e(r8, r13);
        return;
    L48:
        int r14 = getWidth() - getPaddingRight();
        int r15 = this.y;
    L49:
        r13 = r14 - r15;
        goto L54
    L50:
        ya2 r16 = (ya2) r12.getLayoutParams();
        if (r7 == false) goto L53;
        r14 = r12.getLeft() - ((LinearLayout.LayoutParams) r16).leftMargin;
        r15 = this.y;
        goto L49
    L53:
        r13 = r12.getRight() + ((LinearLayout.LayoutParams) r16).rightMargin;
        goto L54
    L68:
        return;
    L28:
        r7 = false;
        goto L29
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent r1) {
        super.onInitializeAccessibilityEvent(r1);
        r1.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo r1) {
        super.onInitializeAccessibilityNodeInfo(r1);
        r1.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
        int r3 = 8;
        char r8 = 2;
        if (this.q != 1) goto L32;
        int r1 = getPaddingLeft();
        int r10 = r26 - r24;
        int r11 = r10 - getPaddingRight();
        int r12 = (r10 - r1) - getPaddingRight();
        int r13 = getVirtualChildCount();
        int r14 = this.r;
        int r15 = r14 & 112;
        int r7 = 8388615 & r14;
        if (r15 == 16) goto L9;
        if (r15 == 80) goto L8;
        int r5 = getPaddingTop();
    L10:
        int r4 = 0;
    L11:
        if (r4 >= r13) goto L85;
        View r6 = getChildAt(r4);
        if (r6 != null) goto L16;
    L31:
        r4 = r4 + 1;
        r8 = r8;
        r3 = 8;
        goto L11
    L16:
        if (r6.getVisibility() == r3) goto L31;
        int r16 = r6.getMeasuredWidth();
        int r17 = r6.getMeasuredHeight();
        ya2 r18 = (ya2) r6.getLayoutParams();
        int r9 = ((LinearLayout.LayoutParams) r18).gravity;
        if (r9 >= 0) goto L20;
        r9 = r7;
    L20:
        int r19 = Gravity.getAbsoluteGravity(r9, getLayoutDirection()) & 7;
        if (r19 == 1) goto L26;
        if (r19 == 5) goto L24;
        int r20 = ((LinearLayout.LayoutParams) r18).leftMargin + r1;
    L28:
        if (i(r4) == false) goto L30;
        r5 = r5 + this.z;
    L30:
        int r21 = r5 + ((LinearLayout.LayoutParams) r18).topMargin;
        r6.layout(r20, r21, r16 + r20, r21 + r17);
        r5 = (r17 + ((LinearLayout.LayoutParams) r18).bottomMargin) + r21;
        goto L31
    L24:
        int r22 = r11 - r16;
        int r28 = ((LinearLayout.LayoutParams) r18).rightMargin;
    L25:
        r20 = r22 - r28;
        goto L28
    L26:
        r22 = (((r12 - r16) / 2) + r1) + ((LinearLayout.LayoutParams) r18).leftMargin;
        r28 = ((LinearLayout.LayoutParams) r18).rightMargin;
        goto L25
    L85:
        return;
    L8:
        r5 = ((getPaddingTop() + r27) - r25) - this.s;
        goto L10
    L9:
        r5 = getPaddingTop() + (((r27 - r25) - this.s) / 2);
        goto L10
    L32:
        boolean r2 = e85.a;
        if (getLayoutDirection() != 1) goto L35;
        boolean r29 = true;
    L36:
        int r30 = getPaddingTop();
        int r31 = r27 - r25;
        int r110 = r31 - getPaddingBottom();
        int r32 = (r31 - r30) - getPaddingBottom();
        int r111 = getVirtualChildCount();
        int r112 = this.r;
        int r33 = 8388615 & r112;
        int r113 = r112 & 112;
        boolean r114 = this.n;
        int[] r115 = this.v;
        int[] r116 = this.w;
        int r34 = Gravity.getAbsoluteGravity(r33, getLayoutDirection());
        if (r34 == 1) goto L41;
        if (r34 == 5) goto L40;
        int r35 = getPaddingLeft();
    L42:
        if (r29 == false) goto L44;
        int r36 = r111 - 1;
        int r37 = -1;
    L45:
        int r38 = 0;
    L46:
        if (r38 >= r111) goto L92;
        int r39 = (r37 * r38) + r36;
        View r40 = getChildAt(r39);
        if (r40 != null) goto L51;
        int r210 = r36;
    L50:
        int r117 = r30;
    L84:
        r38 = r38 + 1;
        r36 = r210;
        r30 = r117;
        goto L46
    L51:
        r210 = r36;
        if (r40.getVisibility() == 8) goto L50;
        int r41 = r40.getMeasuredWidth();
        int r118 = r40.getMeasuredHeight();
        ya2 r42 = (ya2) r40.getLayoutParams();
        int r211 = r35;
        if (r114 == false) goto L58;
        r117 = r30;
        if (((LinearLayout.LayoutParams) r42).height == (-1)) goto L59;
        int r43 = r40.getBaseline();
    L60:
        int r44 = ((LinearLayout.LayoutParams) r42).gravity;
        if (r44 >= 0) goto L63;
        r44 = r113;
    L63:
        int r45 = r44 & 112;
        if (r45 != 16) goto L66;
        int r46 = (((r32 - r118) / 2) + r117) + ((LinearLayout.LayoutParams) r42).topMargin;
        int r47 = ((LinearLayout.LayoutParams) r42).bottomMargin;
    L73:
        r46 = r46 - r47;
    L79:
        if (i(r39) == false) goto L81;
        int r48 = r211 + this.y;
    L82:
        int r49 = r48 + ((LinearLayout.LayoutParams) r42).leftMargin;
        r40.layout(r49, r46, r49 + r41, r46 + r118);
        r35 = (r41 + ((LinearLayout.LayoutParams) r42).rightMargin) + r49;
        goto L84
    L81:
        r48 = r211;
        goto L82
    L66:
        if (r45 != 48) goto L68;
        r46 = r117 + ((LinearLayout.LayoutParams) r42).topMargin;
        if (r43 == (-1)) goto L79;
        r46 = (r115[1] - r43) + r46;
        goto L79
    L68:
        if (r45 == 80) goto L70;
        r46 = r117;
        goto L79
    L70:
        r46 = (r110 - r118) - ((LinearLayout.LayoutParams) r42).bottomMargin;
        if (r43 == (-1)) goto L79;
        r47 = r116[2] - (r40.getMeasuredHeight() - r43);
    L59:
        r43 = -1;
        goto L60
    L58:
        r117 = r30;
        goto L59
    L92:
        return;
    L44:
        r37 = 1;
        r36 = 0;
        goto L45
    L40:
        r35 = ((getPaddingLeft() + r26) - r24) - this.s;
        goto L42
    L41:
        r35 = getPaddingLeft() + (((r26 - r24) - this.s) / 2);
        goto L42
    L35:
        r29 = false;
        goto L36
    }

    @Override // android.view.View
    public void onMeasure(int r39, int r40) {
        za2 r0 = this;
        int r7 = -2;
        int r9 = 0;
        int r10 = 1073741824;
        int r11 = 8;
        if (r0.q != 1) goto L171;
        r0.s = 0;
        int r15 = r0.getVirtualChildCount();
        int r1 = View.MeasureSpec.getMode(r39);
        int r2 = View.MeasureSpec.getMode(r40);
        int r3 = r0.o;
        boolean r4 = r0.u;
        int r5 = 0;
        int r6 = 0;
        int r8 = 0;
        boolean r19 = false;
        int r22 = 0;
        boolean r23 = false;
        boolean r24 = true;
        float r16 = 0.0f;
        int r14 = 0;
    L5:
        if (r5 >= r15) goto L74;
        int r25 = r1;
        View r12 = r0.getChildAt(r5);
        if (r12 != null) goto L11;
        r0.s = r0.s;
    L9:
        int r29 = r2;
        int r13 = r3;
        boolean r28 = r4;
        int r17 = r5;
        int r18 = r25;
    L73:
        r5 = r17 + 1;
        r3 = r13;
        r1 = r18;
        r4 = r28;
        r2 = r29;
        r7 = -2;
        r10 = 1073741824;
        r11 = 8;
        goto L5
    L11:
        if (r12.getVisibility() == r11) goto L9;
        if (r0.i(r5) == false) goto L16;
        r0.s += r0.z;
    L16:
        ya2 r110 = (ya2) r12.getLayoutParams();
        float r111 = ((LinearLayout.LayoutParams) r110).weight;
        r16 = r16 + r111;
        if (r2 != r10) goto L24;
        if (((LinearLayout.LayoutParams) r110).height != 0) goto L24;
        if (r111 <= 0.0f) goto L24;
        int r112 = r0.s;
        r0.s = Math.max(r112, (((LinearLayout.LayoutParams) r110).topMargin + r112) + ((LinearLayout.LayoutParams) r110).bottomMargin);
        View r30 = r12;
        r29 = r2;
        r13 = r3;
        r28 = r4;
        r17 = r5;
        r19 = true;
        r18 = r25;
    L40:
        if (r13 >= 0) goto L42;
    L44:
        if (r17 >= r13) goto L50;
        if (((LinearLayout.LayoutParams) r110).weight <= 0.0f) goto L50;
        tb4.e("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
        return;
    L50:
        if (r18 != 1073741824) goto L52;
    L54:
        boolean r20 = false;
    L55:
        int r21 = ((LinearLayout.LayoutParams) r110).leftMargin + ((LinearLayout.LayoutParams) r110).rightMargin;
        int r26 = r30.getMeasuredWidth() + r21;
        r9 = Math.max(r9, r26);
        int r113 = r30.getMeasuredState();
        boolean r31 = r20;
        int r27 = View.combineMeasuredStates(r22, r113);
        if (r24 == false) goto L60;
        r22 = r27;
        if (((LinearLayout.LayoutParams) r110).width != (-1)) goto L61;
        boolean r32 = true;
    L63:
        if (((LinearLayout.LayoutParams) r110).weight <= 0.0f) goto L68;
        if (r31 == true) goto L67;
        r21 = r26;
    L67:
        r8 = Math.max(r8, r21);
    L72:
        r24 = r32;
        goto L73
    L68:
        if (r31 == true) goto L71;
        r21 = r26;
    L71:
        r6 = Math.max(r6, r21);
    L61:
        r32 = false;
        goto L63
    L60:
        r22 = r27;
        goto L61
    L52:
        if (((LinearLayout.LayoutParams) r110).width != (-1)) goto L54;
        r20 = true;
        r23 = true;
        goto L55
    L42:
        if (r13 != (r17 + 1)) goto L44;
        r0.p = r0.s;
    L24:
        if (((LinearLayout.LayoutParams) r110).height == 0) goto L26;
    L28:
        int r114 = Integer.MIN_VALUE;
    L30:
        if (r16 != 0.0f) goto L33;
        int r33 = r0.s;
    L34:
        r29 = r2;
        r28 = r4;
        r13 = r3;
        r17 = r5;
        r18 = r25;
        r0.measureChildWithMargins(r12, r39, 0, r40, r33);
        if (r114 == Integer.MIN_VALUE) goto L37;
        ((LinearLayout.LayoutParams) r110).height = r114;
    L37:
        int r34 = r12.getMeasuredHeight();
        int r35 = r0.s;
        r30 = r12;
        r0.s = Math.max(r35, ((r35 + r34) + ((LinearLayout.LayoutParams) r110).topMargin) + ((LinearLayout.LayoutParams) r110).bottomMargin);
        if (r28 == false) goto L40;
        r14 = Math.max(r34, r14);
        goto L40
    L33:
        r33 = 0;
        goto L34
    L26:
        if (r111 <= 0.0f) goto L28;
        ((LinearLayout.LayoutParams) r110).height = r7;
        r114 = 0;
        goto L30
    L74:
        int r115 = r1;
        int r210 = r2;
        boolean r211 = r4;
        int r36 = r22;
        int r37 = r40;
        if (r0.s <= 0) goto L80;
        if (r0.i(r15) == false) goto L80;
        r0.s += r0.z;
    L80:
        if (r211 == true) goto L82;
    L94:
        int r116 = (r0.getPaddingBottom() + r0.getPaddingTop()) + r0.s;
        r0.s = r116;
        int r38 = View.resolveSizeAndState(Math.max(r116, r0.getSuggestedMinimumHeight()), r37, 0);
        int r41 = (r38 & 16777215) - r0.s;
        if (r19 == true) goto L115;
        if (r41 != 0) goto L98;
    L100:
        r6 = Math.max(r6, r8);
        if (r211 == true) goto L103;
    L156:
        if (r24 == false) goto L158;
    L160:
        r6 = r9;
    L161:
        r0.setMeasuredDimension(View.resolveSizeAndState(Math.max((r0.getPaddingRight() + r0.getPaddingLeft()) + r6, r0.getSuggestedMinimumWidth()), r39, r36), r38);
        if (r23 == false) goto L398;
        int r42 = View.MeasureSpec.makeMeasureSpec(r0.getMeasuredWidth(), 1073741824);
        int r43 = 0;
    L164:
        if (r43 >= r15) goto L441;
        View r44 = r0.getChildAt(r43);
        if (r44.getVisibility() == 8) goto L170;
        ya2 r45 = (ya2) r44.getLayoutParams();
        if (((LinearLayout.LayoutParams) r45).width != (-1)) goto L170;
        int r46 = ((LinearLayout.LayoutParams) r45).height;
        ((LinearLayout.LayoutParams) r45).height = r44.getMeasuredHeight();
        r0.measureChildWithMargins(r44, r42, 0, r37, 0);
        ((LinearLayout.LayoutParams) r45).height = r46;
    L170:
        r43 = r43 + 1;
        r37 = r40;
        goto L164
    L441:
        return;
    L398:
        return;
    L158:
        if (r115 == 1073741824) goto L160;
    L103:
        if (r210 == 1073741824) goto L156;
        int r47 = 0;
    L105:
        if (r47 >= r15) goto L156;
        View r48 = r0.getChildAt(r47);
        if (r48 == null) goto L114;
        if (r48.getVisibility() == 8) goto L114;
        if (((LinearLayout.LayoutParams) ((ya2) r48.getLayoutParams())).weight <= 0.0f) goto L114;
        r48.measure(View.MeasureSpec.makeMeasureSpec(r48.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(r14, 1073741824));
    L114:
        r47 = r47 + 1;
        goto L105
    L98:
        if (r16 <= 0.0f) goto L100;
    L115:
        float r49 = r0.t;
        if (r49 <= 0.0f) goto L118;
        r16 = r49;
    L118:
        r0.s = 0;
        int r50 = r36;
        int r51 = 0;
    L119:
        if (r51 >= r15) goto L155;
        View r117 = r0.getChildAt(r51);
        if (r117.getVisibility() != 8) goto L123;
        r51 = r51;
    L154:
        r51 = r51 + 1;
        goto L119
    L123:
        ya2 r118 = (ya2) r117.getLayoutParams();
        float r119 = ((LinearLayout.LayoutParams) r118).weight;
        if (r119 <= 0.0f) goto L141;
        int r120 = (int) ((r41 * r119) / r16);
        r16 = r16 - r119;
        r41 = r41 - r120;
        int r52 = ViewGroup.getChildMeasureSpec(r39, ((r0.getPaddingRight() + r0.getPaddingLeft()) + ((LinearLayout.LayoutParams) r118).leftMargin) + ((LinearLayout.LayoutParams) r118).rightMargin, ((LinearLayout.LayoutParams) r118).width);
        if (((LinearLayout.LayoutParams) r118).height != 0) goto L134;
        int r121 = 1073741824;
        if (r210 != 1073741824) goto L135;
        if (r120 > 0) goto L133;
        r120 = 0;
    L133:
        r117.measure(r52, View.MeasureSpec.makeMeasureSpec(r120, 1073741824));
    L139:
        r50 = View.combineMeasuredStates(r50, r117.getMeasuredState() & (-256));
    L135:
        int r122 = r117.getMeasuredHeight() + r120;
        if (r122 >= 0) goto L138;
        r122 = 0;
    L138:
        r117.measure(r52, View.MeasureSpec.makeMeasureSpec(r122, r121));
        goto L139
    L134:
        r121 = 1073741824;
    L141:
        int r53 = ((LinearLayout.LayoutParams) r118).leftMargin + ((LinearLayout.LayoutParams) r118).rightMargin;
        int r123 = r117.getMeasuredWidth() + r53;
        r9 = Math.max(r9, r123);
        if (r115 == 1073741824) goto L146;
        int r54 = -1;
        if (((LinearLayout.LayoutParams) r118).width != (-1)) goto L147;
        r123 = r53;
    L147:
        r6 = Math.max(r6, r123);
        if (r24 == true) goto L150;
    L152:
        boolean r55 = false;
    L153:
        int r124 = r0.s;
        r0.s = Math.max(r124, ((r117.getMeasuredHeight() + r124) + ((LinearLayout.LayoutParams) r118).topMargin) + ((LinearLayout.LayoutParams) r118).bottomMargin);
        r24 = r55;
        goto L154
    L150:
        if (((LinearLayout.LayoutParams) r118).width != r54) goto L152;
        r55 = true;
        goto L153
    L146:
        r54 = -1;
        goto L147
    L155:
        r0.s = (r0.getPaddingBottom() + r0.getPaddingTop()) + r0.s;
        r36 = r50;
        goto L156
    L82:
        if (r210 == Integer.MIN_VALUE) goto L84;
        if (r210 != 0) goto L94;
    L84:
        r0.s = 0;
        int r56 = 0;
    L85:
        if (r56 >= r15) goto L94;
        View r57 = r0.getChildAt(r56);
        if (r57 != null) goto L90;
        r0.s = r0.s;
    L93:
        r56 = r56 + 1;
        goto L85
    L90:
        if (r57.getVisibility() == 8) goto L93;
        ya2 r58 = (ya2) r57.getLayoutParams();
        int r125 = r0.s;
        r0.s = Math.max(r125, ((r125 + r14) + ((LinearLayout.LayoutParams) r58).topMargin) + ((LinearLayout.LayoutParams) r58).bottomMargin);
        goto L93
    L171:
        int r59 = r39;
        r0.s = 0;
        int r60 = r0.getVirtualChildCount();
        int r61 = View.MeasureSpec.getMode(r59);
        int r62 = View.MeasureSpec.getMode(r40);
        if (r0.v != null) goto L174;
    L175:
        r0.v = new int[4];
        r0.w = new int[4];
    L176:
        int[] r126 = r0.v;
        int[] r127 = r0.w;
        r126[3] = -1;
        char r128 = 2;
        r126[2] = -1;
        r126[1] = -1;
        r126[0] = -1;
        r127[3] = -1;
        r127[2] = -1;
        r127[1] = -1;
        r127[0] = -1;
        boolean r129 = r0.n;
        boolean r130 = r0.u;
        if (r61 != 1073741824) goto L179;
        boolean r131 = true;
    L180:
        float r212 = 0.0f;
        boolean r213 = true;
        int r63 = 0;
        int r64 = 0;
        int r65 = 0;
        int r66 = 0;
        int r67 = 0;
        int r132 = 0;
        boolean r133 = false;
        boolean r214 = false;
    L181:
        if (r63 >= r60) goto L257;
        char r310 = r128;
        View r134 = r0.getChildAt(r63);
        if (r134 != null) goto L185;
        r0.s = r0.s;
        int r311 = r63;
        int r68 = r65;
        int[] r312 = r126;
        int[] r313 = r127;
        boolean r314 = r129;
        boolean r315 = r130;
    L256:
        r65 = r68;
        r63 = r311 + 1;
        r128 = r310;
        r126 = r312;
        r127 = r313;
        r129 = r314;
        r130 = r315;
        goto L181
    L185:
        int r316 = r64;
        if (r134.getVisibility() != 8) goto L189;
        r59 = r39;
        r311 = r63;
        r68 = r65;
        r313 = r127;
        r314 = r129;
        r315 = r130;
        r64 = r316;
        r312 = r126;
        goto L256
    L189:
        if (r0.i(r63) == false) goto L191;
        r0.s += r0.y;
    L191:
        ya2 r69 = (ya2) r134.getLayoutParams();
        float r70 = ((LinearLayout.LayoutParams) r69).weight;
        r212 = r212 + r70;
        int r317 = r63;
        if (r61 != 1073741824) goto L205;
        if (((LinearLayout.LayoutParams) r69).width != 0) goto L205;
        if (r70 <= 0.0f) goto L205;
        int r71 = r0.s;
        int r72 = ((LinearLayout.LayoutParams) r69).leftMargin;
        if (r131 == false) goto L200;
        r0.s = (r72 + ((LinearLayout.LayoutParams) r69).rightMargin) + r71;
    L201:
        if (r129 == false) goto L203;
        int r73 = View.MeasureSpec.makeMeasureSpec(0, 0);
        r134.measure(r73, r73);
        View r74 = r134;
        r314 = r129;
        r315 = r130;
        int r135 = r316;
        r311 = r317;
        ya2 r136 = r69;
        r312 = r126;
        r313 = r127;
        r59 = r39;
        int r137 = r65;
        int r138 = r66;
    L224:
        int r75 = 1073741824;
    L225:
        if (r62 != r75) goto L227;
    L229:
        boolean r76 = false;
    L230:
        int r77 = ((LinearLayout.LayoutParams) r136).topMargin + ((LinearLayout.LayoutParams) r136).bottomMargin;
        int r78 = r74.getMeasuredHeight() + r77;
        r132 = View.combineMeasuredStates(r132, r74.getMeasuredState());
        if (r314 == false) goto L238;
        int r139 = r74.getBaseline();
        boolean r318 = r76;
        if (r139 == (-1)) goto L239;
        int r79 = ((LinearLayout.LayoutParams) r136).gravity;
        if (r79 >= 0) goto L237;
        r79 = r0.r;
    L237:
        int r80 = (((r79 & 112) >> 4) & (-2)) >> 1;
        r312[r80] = Math.max(r312[r80], r139);
        r313[r80] = Math.max(r313[r80], r78 - r139);
    L239:
        int r81 = Math.max(r135, r78);
        if (r213 == true) goto L242;
    L244:
        boolean r140 = false;
    L246:
        if (((LinearLayout.LayoutParams) r136).weight <= 0.0f) goto L251;
        if (r318 == true) goto L250;
        r77 = r78;
    L250:
        r66 = Math.max(r138, r77);
        int r82 = r137;
    L255:
        int r215 = r82;
        r64 = r81;
        r68 = r215;
        r213 = r140;
        goto L256
    L251:
        if (r318 == true) goto L254;
        r77 = r78;
    L254:
        r82 = Math.max(r137, r77);
        r66 = r138;
        goto L255
    L242:
        if (((LinearLayout.LayoutParams) r136).height != (-1)) goto L244;
        r140 = true;
        goto L246
    L238:
        r318 = r76;
        goto L239
    L227:
        if (((LinearLayout.LayoutParams) r136).height != (-1)) goto L229;
        r76 = true;
        r133 = true;
        goto L230
    L203:
        r74 = r134;
        r314 = r129;
        r315 = r130;
        r214 = true;
        r135 = r316;
        r311 = r317;
        r75 = 1073741824;
        r136 = r69;
        r312 = r126;
        r313 = r127;
        r59 = r39;
        r137 = r65;
        r138 = r66;
        goto L225
    L200:
        r0.s = Math.max(r71, (r71 + r72) + ((LinearLayout.LayoutParams) r69).rightMargin);
    L205:
        if (((LinearLayout.LayoutParams) r69).width == 0) goto L207;
    L209:
        int r83 = Integer.MIN_VALUE;
    L211:
        if (r212 != 0.0f) goto L214;
        int r84 = r0.s;
    L215:
        r313 = r127;
        r138 = r66;
        r311 = r317;
        r314 = r129;
        r315 = r130;
        int r141 = r83;
        r136 = r69;
        r74 = r134;
        r135 = r316;
        r59 = r39;
        r312 = r126;
        r137 = r65;
        r0.measureChildWithMargins(r74, r59, r84, r40, 0);
        if (r141 == Integer.MIN_VALUE) goto L218;
        ((LinearLayout.LayoutParams) r136).width = r141;
    L218:
        int r85 = r74.getMeasuredWidth();
        int r86 = r0.s;
        int r142 = ((LinearLayout.LayoutParams) r136).leftMargin;
        if (r131 == false) goto L221;
        r0.s = ((r142 + r85) + ((LinearLayout.LayoutParams) r136).rightMargin) + r86;
    L222:
        if (r315 == false) goto L224;
        r67 = Math.max(r85, r67);
        goto L224
    L221:
        r0.s = Math.max(r86, ((r86 + r85) + r142) + ((LinearLayout.LayoutParams) r136).rightMargin);
        goto L222
    L214:
        r84 = 0;
        goto L215
    L207:
        if (r70 <= 0.0f) goto L209;
        ((LinearLayout.LayoutParams) r69).width = -2;
        r83 = 0;
        goto L211
    L257:
        int[] r319 = r126;
        int[] r320 = r127;
        char r321 = r128;
        boolean r322 = r129;
        boolean r323 = r130;
        int r143 = r64;
        int r144 = r65;
        int r145 = r66;
        if (r0.s > 0) goto L260;
    L262:
        int r87 = r319[1];
        if (r87 == (-1)) goto L265;
    L272:
        int r88 = Math.max(r143, Math.max(r320[3], Math.max(r320[0], Math.max(r320[1], r320[r321]))) + Math.max(r319[3], Math.max(r319[0], Math.max(r87, r319[r321]))));
    L273:
        if (r323 == true) goto L275;
    L290:
        int r146 = (r0.getPaddingRight() + r0.getPaddingLeft()) + r0.s;
        r0.s = r146;
        int r89 = View.resolveSizeAndState(Math.max(r146, r0.getSuggestedMinimumWidth()), r59, 0);
        int r90 = (r89 & 16777215) - r0.s;
        if (r214 == true) goto L312;
        if (r90 != 0) goto L294;
    L296:
        int r91 = Math.max(r144, r145);
        if (r323 == true) goto L299;
    L311:
        int r216 = r89;
        int r147 = -16777216;
        int r217 = 0;
    L383:
        if (r213 == false) goto L385;
    L387:
        r0.setMeasuredDimension(r216 | (r132 & r147), View.resolveSizeAndState(Math.max((r0.getPaddingBottom() + r0.getPaddingTop()) + r88, r0.getSuggestedMinimumHeight()), r40, r132 << 16));
        if (r133 == false) goto L440;
        int r92 = View.MeasureSpec.makeMeasureSpec(r0.getMeasuredHeight(), 1073741824);
        int r93 = r217;
    L390:
        if (r93 >= r60) goto L442;
        View r94 = r0.getChildAt(r93);
        if (r94.getVisibility() == 8) goto L397;
        ya2 r95 = (ya2) r94.getLayoutParams();
        if (((LinearLayout.LayoutParams) r95).height != (-1)) goto L397;
        int r96 = ((LinearLayout.LayoutParams) r95).width;
        ((LinearLayout.LayoutParams) r95).width = r94.getMeasuredWidth();
        r0.measureChildWithMargins(r94, r59, 0, r92, 0);
        ((LinearLayout.LayoutParams) r95).width = r96;
    L397:
        r93 = r93 + 1;
        r0 = this;
        r59 = r39;
        goto L390
    L442:
        return;
    L440:
        return;
    L385:
        if (r62 == 1073741824) goto L387;
        r88 = r91;
        goto L387
    L299:
        if (r61 == 1073741824) goto L311;
        int r97 = 0;
    L301:
        if (r97 >= r60) goto L311;
        View r148 = r0.getChildAt(r97);
        if (r148 == null) goto L310;
        if (r148.getVisibility() == 8) goto L310;
        if (((LinearLayout.LayoutParams) ((ya2) r148.getLayoutParams())).weight <= 0.0f) goto L310;
        r148.measure(View.MeasureSpec.makeMeasureSpec(r67, 1073741824), View.MeasureSpec.makeMeasureSpec(r148.getMeasuredHeight(), 1073741824));
    L310:
        r97 = r97 + 1;
        goto L301
    L294:
        if (r212 <= 0.0f) goto L296;
    L312:
        float r98 = r0.t;
        if (r98 <= 0.0f) goto L315;
        r212 = r98;
    L315:
        r319[3] = -1;
        r319[r321] = -1;
        r319[1] = -1;
        r319[0] = -1;
        r320[3] = -1;
        r320[r321] = -1;
        r320[1] = -1;
        r320[0] = -1;
        r0.s = 0;
        r88 = -1;
        int r99 = 0;
    L316:
        if (r99 >= r60) goto L371;
        View r149 = r0.getChildAt(r99);
        if (r149 != null) goto L320;
    L321:
        r89 = r89;
    L370:
        r99 = r99 + 1;
        r89 = r89;
        goto L316
    L320:
        if (r149.getVisibility() == 8) goto L321;
        ya2 r150 = (ya2) r149.getLayoutParams();
        float r151 = ((LinearLayout.LayoutParams) r150).weight;
        if (r151 <= 0.0f) goto L340;
        int r152 = (int) ((r90 * r151) / r212);
        r212 = r212 - r151;
        r90 = r90 - r152;
        int r100 = ViewGroup.getChildMeasureSpec(r40, ((r0.getPaddingBottom() + r0.getPaddingTop()) + ((LinearLayout.LayoutParams) r150).topMargin) + ((LinearLayout.LayoutParams) r150).bottomMargin, ((LinearLayout.LayoutParams) r150).height);
        if (((LinearLayout.LayoutParams) r150).width != 0) goto L333;
        int r153 = 1073741824;
        if (r61 != 1073741824) goto L334;
        if (r152 > 0) goto L332;
        r152 = 0;
    L332:
        r149.measure(View.MeasureSpec.makeMeasureSpec(r152, 1073741824), r100);
    L338:
        r132 = View.combineMeasuredStates(r132, r149.getMeasuredState() & (-16777216));
    L334:
        int r154 = r149.getMeasuredWidth() + r152;
        if (r154 >= 0) goto L337;
        r154 = 0;
    L337:
        r149.measure(View.MeasureSpec.makeMeasureSpec(r154, r153), r100);
        goto L338
    L333:
        r153 = 1073741824;
    L340:
        int r101 = r0.s;
        if (r131 == false) goto L344;
        r0.s = ((r149.getMeasuredWidth() + ((LinearLayout.LayoutParams) r150).leftMargin) + ((LinearLayout.LayoutParams) r150).rightMargin) + r101;
    L345:
        if (r62 != 1073741824) goto L347;
    L349:
        boolean r102 = false;
    L350:
        int r155 = ((LinearLayout.LayoutParams) r150).topMargin + ((LinearLayout.LayoutParams) r150).bottomMargin;
        int r156 = r149.getMeasuredHeight() + r155;
        r88 = Math.max(r88, r156);
        if (r102 == true) goto L354;
        r155 = r156;
    L354:
        int r103 = Math.max(r144, r155);
        if (r213 == false) goto L359;
        int r157 = -1;
        if (((LinearLayout.LayoutParams) r150).height != (-1)) goto L360;
        boolean r158 = true;
    L361:
        if (r322 == false) goto L369;
        int r159 = r149.getBaseline();
        if (r159 == r157) goto L369;
        int r160 = ((LinearLayout.LayoutParams) r150).gravity;
        if (r160 >= 0) goto L367;
        r160 = r0.r;
    L367:
        int r161 = (((r160 & 112) >> 4) & (-2)) >> 1;
        r319[r161] = Math.max(r319[r161], r159);
        r320[r161] = Math.max(r320[r161], r156 - r159);
    L369:
        r213 = r158;
        r144 = r103;
    L360:
        r158 = false;
        goto L361
    L359:
        r157 = -1;
        goto L360
    L347:
        if (((LinearLayout.LayoutParams) r150).height != (-1)) goto L349;
        r102 = true;
        goto L350
    L344:
        r0.s = Math.max(r101, ((r149.getMeasuredWidth() + r101) + ((LinearLayout.LayoutParams) r150).leftMargin) + ((LinearLayout.LayoutParams) r150).rightMargin);
        goto L345
    L371:
        r216 = r89;
        r147 = -16777216;
        r0.s = (r0.getPaddingRight() + r0.getPaddingLeft()) + r0.s;
        int r104 = r319[1];
        if (r104 == (-1)) goto L374;
    L381:
        r217 = 0;
        r88 = Math.max(r88, Math.max(r320[3], Math.max(r320[0], Math.max(r320[1], r320[r321]))) + Math.max(r319[3], Math.max(r319[0], Math.max(r104, r319[r321]))));
    L382:
        r91 = r144;
        goto L383
    L374:
        if (r319[0] != (-1)) goto L381;
        if (r319[r321] != (-1)) goto L381;
        if (r319[3] != (-1)) goto L381;
        r217 = 0;
        goto L382
    L275:
        if (r61 == Integer.MIN_VALUE) goto L277;
        if (r61 != 0) goto L290;
    L277:
        r0.s = 0;
        int r105 = 0;
    L278:
        if (r105 >= r60) goto L290;
        View r106 = r0.getChildAt(r105);
        if (r106 != null) goto L283;
        r0.s = r0.s;
    L289:
        r105 = r105 + 1;
        goto L278
    L283:
        if (r106.getVisibility() == 8) goto L289;
        ya2 r107 = (ya2) r106.getLayoutParams();
        int r162 = r0.s;
        if (r131 == false) goto L288;
        r0.s = ((((LinearLayout.LayoutParams) r107).leftMargin + r67) + ((LinearLayout.LayoutParams) r107).rightMargin) + r162;
        goto L289
    L288:
        r0.s = Math.max(r162, ((r162 + r67) + ((LinearLayout.LayoutParams) r107).leftMargin) + ((LinearLayout.LayoutParams) r107).rightMargin);
        goto L289
    L265:
        if (r319[0] != (-1)) goto L272;
        if (r319[r321] != (-1)) goto L272;
        if (r319[3] != (-1)) goto L272;
        r88 = r143;
        goto L273
    L260:
        if (r0.i(r60) == false) goto L262;
        r0.s += r0.y;
        goto L262
    L179:
        r131 = false;
        goto L180
    L174:
        if (r0.w != null) goto L176;
        goto L175
    }

    public void setBaselineAligned(boolean r1) {
        this.n = r1;
    }

    public void setBaselineAlignedChildIndex(int r3) {
        if (r3 < 0) goto L8;
        if (r3 >= getChildCount()) goto L8;
        this.o = r3;
        return;
    L8:
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable r3) {
        if (r3 != this.x) goto L5;
        return;
    L5:
        this.x = r3;
        boolean r0 = false;
        if (r3 == null) goto L8;
        this.y = r3.getIntrinsicWidth();
        this.z = r3.getIntrinsicHeight();
    L9:
        if (r3 != null) goto L11;
        r0 = true;
    L11:
        setWillNotDraw(r0);
        requestLayout();
        return;
    L8:
        this.y = 0;
        this.z = 0;
        goto L9
    }

    public void setDividerPadding(int r1) {
        this.B = r1;
    }

    public void setGravity(int r2) {
        if (this.r != r2) goto L5;
        return;
    L5:
        if ((8388615 & r2) != 0) goto L8;
        r2 = r2 | 8388611;
    L8:
        if ((r2 & 112) != 0) goto L10;
        r2 = r2 | 48;
    L10:
        this.r = r2;
        requestLayout();
    }

    public void setHorizontalGravity(int r3) {
        int r4 = r3 & 8388615;
        int r1 = this.r;
        if ((8388615 & r1) == r4) goto L6;
        this.r = r4 | ((-8388616) & r1);
        requestLayout();
        return;
    }

    public void setMeasureWithLargestChildEnabled(boolean r1) {
        this.u = r1;
    }

    public void setOrientation(int r2) {
        if (this.q == r2) goto L6;
        this.q = r2;
        requestLayout();
        return;
    }

    public void setShowDividers(int r2) {
        if (r2 == this.A) goto L5;
        requestLayout();
    L5:
        this.A = r2;
    }

    public void setVerticalGravity(int r3) {
        int r4 = r3 & 112;
        int r0 = this.r;
        if ((r0 & 112) == r4) goto L6;
        this.r = r4 | (r0 & (-113));
        requestLayout();
        return;
    }

    public void setWeightSum(float r2) {
        this.t = Math.max(0.0f, r2);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams r1) {
        return h(r1);
    }
}
