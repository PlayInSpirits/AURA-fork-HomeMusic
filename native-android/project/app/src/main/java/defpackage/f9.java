package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import app.homemusic.R;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class f9 extends dg implements DialogInterface {
    public final d9 t;

    public f9(ContextThemeWrapper r2, int r3) {
        super(r2, j(r2, r3));
        this.t = new d9(getContext(), this, getWindow());
    }

    public static int j(Context r2, int r3) {
        if (((r3 >>> 24) & 255) < 1) goto L5;
        return r3;
    L5:
        TypedValue r4 = new TypedValue();
        r2.getTheme().resolveAttribute(R.attr.alertDialogTheme, r4, true);
        return r4.resourceId;
    }

    public final Button i(int r2) {
        d9 r1 = this.t;
        if (r2 == (-3)) goto L15;
        if (r2 == (-2)) goto L13;
        if (r2 == (-1)) goto L11;
        r1.getClass();
        return null;
    L11:
        return r1.i;
    L13:
        return r1.l;
    L15:
        return r1.o;
    }

    @Override // defpackage.dg, defpackage.n70, android.app.Dialog
    public void onCreate(Bundle r17) {
        super.onCreate(r17);
        d9 r0 = this.t;
        r0.b.setContentView(r0.z);
        Context r1 = r0.a;
        Window r2 = r0.c;
        View r3 = r2.findViewById(R.id.parentPanel);
        View r5 = r3.findViewById(R.id.topPanel);
        View r7 = r3.findViewById(R.id.contentPanel);
        View r9 = r3.findViewById(R.id.buttonPanel);
        ViewGroup r4 = (ViewGroup) r3.findViewById(R.id.customPanel);
        View r10 = r0.g;
        if (r10 != null) goto L6;
        r10 = null;
    L6:
        int r13 = 0;
        if (r10 == null) goto L9;
        boolean r14 = true;
    L10:
        if (r14 == true) goto L12;
    L13:
        r2.setFlags(131072, 131072);
    L15:
        if (r14 == false) goto L22;
        FrameLayout r15 = (FrameLayout) r2.findViewById(R.id.custom);
        r15.addView(r10, new ViewGroup.LayoutParams(-1, -1));
        if (r0.h == false) goto L20;
        r15.setPadding(0, 0, 0, 0);
    L20:
        if (r0.f == null) goto L23;
        ((LinearLayout.LayoutParams) ((ya2) r4.getLayoutParams())).weight = 0.0f;
    L23:
        View r6 = r4.findViewById(R.id.topPanel);
        View r8 = r4.findViewById(R.id.contentPanel);
        View r11 = r4.findViewById(R.id.buttonPanel);
        ViewGroup r12 = d9.b(r6, r5);
        ViewGroup r16 = d9.b(r8, r7);
        ViewGroup r18 = d9.b(r11, r9);
        NestedScrollView r19 = (NestedScrollView) r2.findViewById(R.id.scrollView);
        r0.r = r19;
        r19.setFocusable(false);
        r0.r.setNestedScrollingEnabled(false);
        TextView r20 = (TextView) r16.findViewById(android.R.id.message);
        r0.v = r20;
        if (r20 == null) goto L33;
        CharSequence r21 = r0.e;
        if (r21 == null) goto L29;
        r20.setText(r21);
        goto L33
    L29:
        r20.setVisibility(8);
        r0.r.removeView(r0.v);
        if (r0.f == null) goto L32;
        ViewGroup r22 = (ViewGroup) r0.r.getParent();
        int r23 = r22.indexOfChild(r0.r);
        r22.removeViewAt(r23);
        r22.addView(r0.f, r23, new ViewGroup.LayoutParams(-1, -1));
        goto L33
    L32:
        r16.setVisibility(8);
    L33:
        Button r24 = (Button) r18.findViewById(android.R.id.button1);
        r0.i = r24;
        i4 r25 = r0.G;
        r24.setOnClickListener(r25);
        boolean r26 = TextUtils.isEmpty(r0.j);
        Button r27 = r0.i;
        if (r26 == false) goto L36;
        r27.setVisibility(8);
        int r28 = 0;
    L37:
        Button r29 = (Button) r18.findViewById(android.R.id.button2);
        r0.l = r29;
        r29.setOnClickListener(r25);
        boolean r30 = TextUtils.isEmpty(r0.m);
        Button r110 = r0.l;
        if (r30 == false) goto L40;
        r110.setVisibility(8);
    L41:
        Button r31 = (Button) r18.findViewById(android.R.id.button3);
        r0.o = r31;
        r31.setOnClickListener(r25);
        boolean r32 = TextUtils.isEmpty(r0.p);
        Button r33 = r0.o;
        if (r32 == false) goto L44;
        r33.setVisibility(8);
    L45:
        TypedValue r34 = new TypedValue();
        r1.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, r34, true);
        if (r34.data != 0) goto L48;
    L55:
        if (r28 != 0) goto L59;
        r18.setVisibility(8);
    L59:
        if (r0.w == null) goto L61;
        r12.addView(r0.w, 0, new ViewGroup.LayoutParams(-1, -2));
        r2.findViewById(R.id.title_template).setVisibility(8);
    L71:
        if (r4.getVisibility() == 8) goto L73;
        boolean r111 = true;
    L74:
        if (r12 != null) goto L76;
    L78:
        int r35 = 0;
    L80:
        if (r18.getVisibility() == 8) goto L82;
        boolean r36 = true;
    L83:
        if (r36 == true) goto L87;
        View r37 = r16.findViewById(R.id.textSpacerNoButtons);
        if (r37 == null) goto L87;
        r37.setVisibility(0);
    L87:
        if (r35 == 0) goto L100;
        NestedScrollView r38 = r0.r;
        if (r38 == null) goto L92;
        r38.setClipToPadding(true);
    L92:
        if (r0.e == null) goto L94;
    L97:
        View r39 = r12.findViewById(R.id.titleDividerNoCustom);
    L98:
        if (r39 == null) goto L103;
        r39.setVisibility(0);
    L103:
        AlertController$RecycleListView r40 = r0.f;
        if (r40 == null) goto L116;
        if (r36 == false) goto L107;
        if (r35 != 0) goto L116;
    L107:
        int r41 = r40.getPaddingLeft();
        if (r35 == 0) goto L110;
        int r42 = r40.getPaddingTop();
    L111:
        int r43 = r40.getPaddingRight();
        if (r36 == false) goto L114;
        int r112 = r40.getPaddingBottom();
    L115:
        r40.setPadding(r41, r42, r43, r112);
        goto L116
    L114:
        r112 = r40.o;
        goto L115
    L110:
        r42 = r40.n;
    L116:
        if (r111 == true) goto L129;
        View r44 = r0.f;
        if (r44 != null) goto L121;
        r44 = r0.r;
    L121:
        if (r44 == null) goto L129;
        if (r36 == false) goto L124;
        r13 = 2;
    L124:
        View r45 = r2.findViewById(R.id.scrollIndicatorUp);
        View r46 = r2.findViewById(R.id.scrollIndicatorDown);
        WeakHashMap r47 = j65.a;
        r44.setScrollIndicators(r35 | r13, 3);
        if (r45 == null) goto L127;
        r16.removeView(r45);
    L127:
        if (r46 == null) goto L129;
        r16.removeView(r46);
    L129:
        AlertController$RecycleListView r48 = r0.f;
        if (r48 == null) goto L137;
        ListAdapter r49 = r0.x;
        if (r49 == null) goto L138;
        r48.setAdapter(r49);
        int r50 = r0.y;
        if (r50 <= (-1)) goto L139;
        r48.setItemChecked(r50, true);
        r48.setSelection(r50);
        return;
    L139:
        return;
    L138:
        return;
    L137:
        return;
    L94:
        if (r0.f != null) goto L97;
        r39 = null;
        goto L98
    L100:
        View r51 = r16.findViewById(R.id.textSpacerNoTitle);
        if (r51 == null) goto L103;
        r51.setVisibility(0);
        goto L103
    L82:
        r36 = false;
        goto L83
    L76:
        if (r12.getVisibility() == 8) goto L78;
        r35 = 1;
        goto L80
    L73:
        r111 = false;
        goto L74
    L61:
        r0.t = (ImageView) r2.findViewById(android.R.id.icon);
        if (TextUtils.isEmpty(r0.d) == false) goto L64;
    L69:
        r2.findViewById(R.id.title_template).setVisibility(8);
        r0.t.setVisibility(8);
        r12.setVisibility(8);
        goto L71
    L64:
        if (r0.E == false) goto L69;
        TextView r52 = (TextView) r2.findViewById(R.id.alertTitle);
        r0.u = r52;
        r52.setText(r0.d);
        Drawable r53 = r0.s;
        if (r53 == null) goto L68;
        r0.t.setImageDrawable(r53);
        goto L71
    L68:
        r0.u.setPadding(r0.t.getPaddingLeft(), r0.t.getPaddingTop(), r0.t.getPaddingRight(), r0.t.getPaddingBottom());
        r0.t.setVisibility(8);
        goto L71
    L48:
        if (r28 != 1) goto L50;
        Button r54 = r0.i;
        LinearLayout.LayoutParams r113 = (LinearLayout.LayoutParams) r54.getLayoutParams();
        r113.gravity = 1;
        r113.weight = 0.5f;
        r54.setLayoutParams(r113);
        goto L55
    L50:
        if (r28 != 2) goto L53;
        Button r55 = r0.l;
        LinearLayout.LayoutParams r114 = (LinearLayout.LayoutParams) r55.getLayoutParams();
        r114.gravity = 1;
        r114.weight = 0.5f;
        r55.setLayoutParams(r114);
        goto L55
    L53:
        if (r28 != 4) goto L55;
        Button r56 = r0.o;
        LinearLayout.LayoutParams r115 = (LinearLayout.LayoutParams) r56.getLayoutParams();
        r115.gravity = 1;
        r115.weight = 0.5f;
        r56.setLayoutParams(r115);
        goto L55
    L44:
        r33.setText(r0.p);
        r0.o.setVisibility(0);
        r28 = r28 | 4;
        goto L45
    L40:
        r110.setText(r0.m);
        r0.l.setVisibility(0);
        r28 = r28 | 2;
        goto L41
    L36:
        r27.setText(r0.j);
        r0.i.setVisibility(0);
        r28 = 1;
        goto L37
    L22:
        r4.setVisibility(8);
        goto L23
    L12:
        if (d9.a(r10) == true) goto L15;
    L9:
        r14 = false;
        goto L10
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int r2, KeyEvent r3) {
        NestedScrollView r0 = this.t.r;
        if (r0 == null) goto L9;
        if (r0.i(r3) == false) goto L9;
        return true;
    L9:
        return super.onKeyDown(r2, r3);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int r2, KeyEvent r3) {
        NestedScrollView r0 = this.t.r;
        if (r0 == null) goto L9;
        if (r0.i(r3) == false) goto L9;
        return true;
    L9:
        return super.onKeyUp(r2, r3);
    }

    @Override // defpackage.dg, android.app.Dialog
    public final void setTitle(CharSequence r1) {
        super.setTitle(r1);
        d9 r0 = this.t;
        r0.d = r1;
        TextView r2 = r0.u;
        if (r2 == null) goto L6;
        r2.setText(r1);
        return;
    }
}
