package defpackage;

import android.R;
import android.content.res.TypedArray;
import android.graphics.drawable.AnimationDrawable;
import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.mediarouter.app.MediaRouteExpandCollapseButton;
import androidx.preference.Preference;
import com.google.android.material.internal.NavigationMenuItemView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class i4 implements View.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ i4(int r1, Object r2) {
        this.n = r1;
        this.o = r2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View.OnClickListener
    public final void onClick(View r17) {
        int r2 = this.n;
        Message r8 = null;
        tu2 r9 = null;
        r8 = null;
        boolean r10 = false;
        int r11 = 0;
        int r12 = 0;
        int r13 = 1;
        Object r14 = this.o;
        switch(r2) {
            case 0: goto L227;
            case 1: goto L218;
            case 2: goto L199;
            case 3: goto L188;
            case 4: goto L186;
            case 5: goto L180;
            case 6: goto L178;
            case 7: goto L166;
            case 8: goto L136;
            case 9: goto L41;
            case 10: goto L33;
            case 11: goto L29;
            case 12: goto L13;
            case 13: goto L11;
            default: goto L4;
        };
    L4:
        yu4 r0 = ((Toolbar) r14).c0;
        if (r0 == null) goto L8;
        r9 = r0.o;
    L8:
        if (r9 == null) goto L248;
        r9.collapseActionView();
        return;
    L248:
        return;
    L11:
        ((Preference) r14).s(r17);
        return;
    L13:
        NavigationMenuItemView r1 = (NavigationMenuItemView) r17;
        l43 r15 = (l43) r14;
        d43 r3 = r15.r;
        if (r3 == null) goto L16;
        r3.s = true;
    L16:
        tu2 r4 = r1.getItemData();
        boolean r5 = r15.p.q(r4, r15, 0);
        if (r4 != null) goto L19;
    L22:
        r13 = 0;
    L23:
        d43 r6 = r15.r;
        if (r6 == null) goto L26;
        r6.s = false;
    L26:
        if (r13 == 0) goto L249;
        r15.c(false);
        return;
    L249:
        return;
    L19:
        if (r4.isCheckable() == false) goto L22;
        if (r5 == false) goto L22;
        r15.r.q(r4);
        goto L23
    L29:
        tu2 r7 = ((k33) r17).getItemData();
        qt r16 = (qt) r14;
        if (r16.R.q(r7, r16.Q, 0) == true) goto L250;
        r7.setChecked(true);
        return;
    L250:
        return;
    L33:
        MediaRouteExpandCollapseButton r18 = (MediaRouteExpandCollapseButton) r14;
        AnimationDrawable r19 = r18.r;
        AnimationDrawable r20 = r18.q;
        boolean r21 = r18.u;
        r18.u = !r21;
        if (r21 == true) goto L36;
        r18.setImageDrawable(r20);
        r20.start();
        r18.setContentDescription(r18.t);
    L37:
        View.OnClickListener r22 = r18.v;
        if (r22 == null) goto L251;
        r22.onClick(r17);
        return;
    L251:
        return;
    L36:
        r18.setImageDrawable(r19);
        r19.start();
        r18.setContentDescription(r18.s);
        goto L37
    L41:
        iq2 r110 = (iq2) r14;
        boolean r23 = r110.u(r110.u);
        boolean r24 = !r23;
        boolean r25 = r110.u.e();
        jq2 r26 = r110.H;
        if (r23 == true) goto L65;
        yq2 r27 = r26.z.t;
        wq2 r111 = r110.u;
        r27.getClass();
        if (r111 == null) goto L64;
        yq2.b();
        ui1 r28 = yq2.c();
        tq2 r29 = r28.c.a();
        if (r29 != null) goto L49;
        Log.w("AxMediaRouter", "Ignoring attempt to add a member route to a selected non-group route");
    L91:
        r110.v(r24, !r25);
        if (r25 == false) goto L101;
        List r30 = Collections.unmodifiableList(r26.z.w.v);
        Iterator r31 = Collections.unmodifiableList(r110.u.v).iterator();
    L95:
        if (r31.hasNext() == false) goto L101;
        wq2 r32 = (wq2) r31.next();
        if (r30.contains(r32) == r24) goto L95;
        dq2 r33 = (dq2) r26.z.J.get(r32.c);
        if ((r33 instanceof iq2) == false) goto L95;
        ((iq2) r33).v(r24, true);
    L101:
        lq2 r34 = r26.z;
        wq2 r35 = r110.u;
        List r36 = Collections.unmodifiableList(r34.w.v);
        int r37 = Math.max(1, r36.size());
        if (r35.e() == false) goto L112;
        Iterator r38 = Collections.unmodifiableList(r35.v).iterator();
    L105:
        if (r38.hasNext() == false) goto L117;
        if (r36.contains((wq2) r38.next()) == r24) goto L105;
        if (r23 == true) goto L110;
        int r39 = 1;
    L111:
        r37 = r37 + r39;
        goto L105
    L110:
        r39 = -1;
    L117:
        if (r34.f0 == true) goto L119;
    L121:
        int r40 = 0;
    L123:
        if (r34.f0 == false) goto L126;
        if (r37 < 2) goto L126;
    L127:
        if (r40 == r13) goto L255;
        cx3 r41 = r34.G.I(0);
        if ((r41 instanceof fq2) == false) goto L256;
        fq2 r42 = (fq2) r41;
        View r43 = r42.a;
        if (r13 == 0) goto L133;
        r11 = r42.z;
    L133:
        r26.p(r43, r11);
        return;
    L256:
        return;
    L255:
        return;
    L126:
        r13 = 0;
        goto L127
    L119:
        if (Collections.unmodifiableList(r34.w.v).size() <= 1) goto L121;
        r40 = 1;
        goto L123
    L112:
        if (r23 == true) goto L114;
        int r44 = 1;
    L115:
        r37 = r37 + r44;
        goto L117
    L114:
        r44 = -1;
        goto L115
    L49:
        if (r29.n(r111) == true) goto L52;
        Log.w("AxMediaRouter", "Ignoring attempt to add a non-groupable member route: " + r111);
        goto L91
    L52:
        if (Collections.unmodifiableList(r29.v).contains(r111) == false) goto L55;
        Log.w("AxMediaRouter", "Ignoring attempt to add an existing member route: " + r111);
        goto L91
    L55:
        if (r29.g() == false) goto L61;
        oq2 r45 = r28.d;
        if ((r45 instanceof nq2) == false) goto L59;
        ((nq2) r45).m(r111.b);
        goto L91
    L59:
        kf2.o("There is no currently selected dynamic group route.");
        return;
    L61:
        if (r29.m() == false) goto L63;
        r28.e();
        Log.w("AxMediaRouter", "Ignoring attempt to add a route to a non-available connected route: " + r29);
        goto L91
    L63:
        Log.w("AxMediaRouter", "Ignoring attempt to add a route to an unsupported group route:" + r29);
        goto L91
    L64:
        nz2.n("route must not be null");
        return;
    L65:
        yq2 r112 = r26.z.t;
        wq2 r113 = r110.u;
        r112.getClass();
        if (r113 == null) goto L134;
        yq2.b();
        ui1 r46 = yq2.c();
        tq2 r114 = r46.c.a();
        if (r114 != null) goto L70;
        Log.w("AxMediaRouter", "Ignoring attempt to remove a member route from a selected non-group route");
        goto L91
    L70:
        mq2 r47 = (mq2) r114.x.get(r113.c);
        if (r47 != null) goto L73;
    L90:
        Log.w("AxMediaRouter", "Ignoring attempt to remove a non-unselectable member route: " + r113);
        goto L91
    L73:
        if (r47.c == false) goto L90;
        if (Collections.unmodifiableList(r114.v).contains(r113) == true) goto L78;
        Log.w("AxMediaRouter", "Ignoring attempt to remove a non-in-group member route: " + r113);
        goto L91
    L78:
        if (Collections.unmodifiableList(r114.v).size() > 1) goto L81;
        Log.w("AxMediaRouter", "Ignoring attempt to remove the last member route.");
        goto L91
    L81:
        if (r114.g() == false) goto L87;
        oq2 r48 = r46.d;
        if ((r48 instanceof nq2) == false) goto L85;
        ((nq2) r48).n(r113.b);
        goto L91
    L85:
        kf2.o("There is no currently selected dynamic group route.");
        return;
    L87:
        if (r114.m() == false) goto L89;
        r46.e();
        Log.w("AxMediaRouter", "Ignoring attempt to update routes for a non-available connected route: " + r114);
        goto L91
    L89:
        Log.w("AxMediaRouter", "Ignoring attempt to remove a route from an unsupported group route:" + r114);
        goto L91
    L134:
        nz2.n("route must not be null");
        return;
    L136:
        eq2 r115 = (eq2) r14;
        yq2 r49 = r115.A.z.t;
        wq2 r50 = r115.z;
        r49.getClass();
        if (r50 == null) goto L164;
        yq2.b();
        ui1 r51 = yq2.c();
        tq2 r52 = r51.c.a();
        if (r52 != null) goto L141;
        Log.w("AxMediaRouter", "Ignoring attempt to transfer for a selected non-group route");
    L163:
        r115.v.setVisibility(4);
        r115.w.setVisibility(0);
        return;
    L141:
        List r53 = Collections.singletonList(r50);
        ArrayList r54 = new ArrayList();
        Iterator r55 = r53.iterator();
    L143:
        if (r55.hasNext() == false) goto L151;
        wq2 r56 = (wq2) r55.next();
        mq2 r57 = (mq2) r52.x.get(r56.c);
        if (r57 == null) goto L149;
        if (r57.e == false) goto L149;
        r54.add(r56.b);
    L149:
        Log.w("AxMediaRouter", "Ignoring attempt to update the group with a non-transferable route: " + r56);
        goto L143
    L151:
        if (r54.isEmpty() == false) goto L154;
        Log.w("AxMediaRouter", "Ignoring attempt to update the group with non-transferable routes");
        goto L163
    L154:
        if (r52.g() == false) goto L160;
        oq2 r58 = r51.d;
        if ((r58 instanceof nq2) == false) goto L158;
        ((nq2) r58).o(r54);
        goto L163
    L158:
        kf2.o("There is no currently selected dynamic group route.");
        return;
    L160:
        if (r52.m() == false) goto L162;
        r51.e();
        Log.w("AxMediaRouter", "Ignoring attempt to update routes for a non-available connected route: " + r52);
        goto L163
    L162:
        Log.w("AxMediaRouter", "Ignoring attempt to update routes for an unsupported group route:" + r52);
        goto L163
    L164:
        nz2.n("route must not be null");
        return;
    L166:
        dq2 r116 = (dq2) r14;
        lq2 r59 = r116.x;
        if (r59.K == null) goto L169;
        r59.F.removeMessages(2);
    L169:
        r59.K = r116.u;
        boolean r60 = r17.isActivated();
        boolean r61 = !r60;
        if (r60 == false) goto L176;
        Integer r62 = (Integer) r59.L.get(r116.u.c);
        if (r62 != null) goto L175;
        r12 = 1;
        goto L176
    L175:
        r12 = Math.max(1, r62.intValue());
    L176:
        r116.t(r61);
        r116.w.setProgress(r12);
        r116.u.j(r12);
        r59.F.sendEmptyMessageDelayed(2, 500);
        return;
    L178:
        ((aq2) r14).dismiss();
        return;
    L180:
        nh2 r117 = (nh2) r14;
        int r63 = r117.q0;
        if (r63 != 2) goto L183;
        r117.j0(1);
        return;
    L183:
        if (r63 != 1) goto L261;
        r117.j0(2);
        return;
    L261:
        return;
    L186:
        cp1 r118 = (cp1) r14;
        r118.n0.c.getClass();
        xi4.s(-1, false, false).e(r118.v(), new np0(r13, this));
        return;
    L188:
        yt r119 = (yt) r14;
        if (r119.x == true) goto L191;
        return;
    L191:
        if (r119.isShowing() == true) goto L193;
        return;
    L193:
        if (r119.z == true) goto L196;
        TypedArray r64 = r119.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
        r119.y = r64.getBoolean(0, true);
        r64.recycle();
        r119.z = true;
    L196:
        if (r119.y == false) goto L264;
        r119.cancel();
        return;
    L264:
        return;
    L199:
        d9 r120 = (d9) r14;
        if (r17 != r120.i) goto L205;
        Message r65 = r120.k;
        if (r65 == null) goto L205;
        r8 = Message.obtain(r65);
    L214:
        if (r8 == null) goto L216;
        r8.sendToTarget();
    L216:
        r120.F.obtainMessage(1, r120.b).sendToTarget();
        return;
    L205:
        if (r17 != r120.l) goto L210;
        Message r66 = r120.n;
        if (r66 == null) goto L210;
        r8 = Message.obtain(r66);
    L210:
        if (r17 != r120.o) goto L214;
        Message r67 = r120.q;
        if (r67 == null) goto L214;
        r8 = Message.obtain(r67);
        goto L214
    L218:
        DrawerLayout r68 = ((k4) r14).b;
        int r69 = r68.h(8388611);
        View r70 = r68.f(8388611);
        if (r70 == null) goto L221;
        r10 = DrawerLayout.o(r70);
    L221:
        if (r10 == false) goto L224;
        if (r69 == 2) goto L224;
        r68.d();
        return;
    L224:
        if (r69 == 1) goto L266;
        r68.q();
        return;
    L266:
        return;
    L227:
        ((d5) r14).a();
    }
}
