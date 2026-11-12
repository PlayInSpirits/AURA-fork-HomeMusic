package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.Messenger;
import android.os.Process;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import app.homemusic.R;
import com.eddyizm.tempus.lan.LanReceiverService;
import com.eddyizm.tempus.service.MediaService;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class g5 implements Runnable {
    public final /* synthetic */ int n;
    public final Object o;

    public /* synthetic */ g5(int r1, Object r2) {
        this.n = r1;
        this.o = r2;
    }

    /* JADX INFO: Infinite loop detected, blocks: 8, insns: 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        int r3 = 3;
        byte r6 = 0;
        boolean r7 = false;
        int r8 = 0;
        r8 = 0;
        r8 = 0;
        switch(this.n) {
            case 0: goto L271;
            case 1: goto L267;
            case 2: goto L253;
            case 3: goto L231;
            case 4: goto L223;
            case 5: goto L214;
            case 6: goto L212;
            case 7: goto L210;
            case 8: goto L176;
            case 9: goto L174;
            case 10: goto L172;
            case 11: goto L165;
            case 12: goto L161;
            case 13: goto L159;
            case 14: goto L157;
            case 15: goto L151;
            case 16: goto L97;
            case 17: goto L71;
            case 18: goto L62;
            case 19: goto L60;
            case 20: goto L58;
            case 21: goto L56;
            case 22: goto L50;
            case 23: goto L48;
            case 24: goto L41;
            case 25: goto L39;
            case 26: goto L37;
            case 27: goto L35;
            case 28: goto L33;
            default: goto L4;
        };
    L4:
        gr4 r2 = (gr4) this.o;
        ReentrantLock r4 = r2.c;
    L5:
        r4.lock();
        ar4 r5 = r2.c();     // Catch: Throwable -> L30
        r4.unlock();
        if (r5 == null) goto L9;
        Logger r9 = r2.b;
        fr4 r10 = r5.c;
        r10.getClass();
        boolean r11 = r9.isLoggable(Level.FINE);
        if (r11 == false) goto L13;
        long r12 = System.nanoTime();
        zz1.c(r9, r5, r10, "starting");
    L283:
        gr4.a(r2, r5);     // Catch: Throwable -> L17
        if (r11 == false) goto L5;
        zz1.c(r9, r5, r10, "finished run in ".concat(zz1.n(System.nanoTime() - r12)));
    L17:
        th = move-exception;
        r4.lock();     // Catch: Throwable -> L22
        ((ThreadPoolExecutor) r2.a.o).execute(this);     // Catch: Throwable -> L24
        r4.unlock();     // Catch: Throwable -> L22
        throw th;     // Catch: Throwable -> L22
    L24:
        th = move-exception;
        r4.unlock();     // Catch: Throwable -> L22
        throw th;     // Catch: Throwable -> L22
    L22:
        th = move-exception;
        if (r11 == false) goto L29;
        zz1.c(r9, r5, r10, "failed a run in ".concat(zz1.n(System.nanoTime() - r12)));
    L29:
        throw th;
    L13:
        r12 = -1;
        goto L283
    L9:
        return;
    L30:
        th = move-exception;
        r4.unlock();
        throw th;
    L33:
        ((StaggeredGridLayoutManager) this.o).F0();
        return;
    L35:
        c04 r0 = (c04) this.o;
        r0.p.f(r0);
        return;
    L37:
        ((ip0) this.o).c();
        return;
    L39:
        ((np3) this.o).s();
        return;
    L41:
        monitor-enter(this);
        ((PreferenceGroup) this.o).b0.clear();     // Catch: Throwable -> L45
        monitor-exit(this);     // Catch: Throwable -> L45
        return;
    L45:
        th = move-exception;
        throw th;
    L48:
        RecyclerView r1 = ((kp3) this.o).n0;
        r1.focusableViewAvailable(r1);
        return;
    L50:
        qp2 r13 = ((op2) this.o).b;
        if (r13.Z == null) goto L300;
        r13.Z = null;
        if (r13.o0 == false) goto L301;
        r13.t(r13.p0);
        return;
    L301:
        return;
    L300:
        return;
    L56:
        qp2 r14 = (qp2) this.o;
        r14.m(true);
        r14.R.requestLayout();
        r14.R.getViewTreeObserver().addOnGlobalLayoutListener(new sg(4, r14));
        return;
    L58:
        oj2 r15 = (oj2) this.o;
        oi r16 = r15.g.r;
        hg3 r17 = r15.e;
        r17.getClass();
        r16.remove(((Messenger) r17.o).getBinder());
        return;
    L60:
        ((kd2) this.o).a();
        return;
    L62:
        Object r18 = ((ad2) this.o).a;
        monitor-enter(r18);
        Object r19 = ((ad2) this.o).f;     // Catch: Throwable -> L68
        ((ad2) this.o).f = ad2.k;     // Catch: Throwable -> L68
        monitor-exit(r18);     // Catch: Throwable -> L68
        ((ad2) this.o).k(r19);
        return;
    L68:
        th = move-exception;
        throw th;
    L71:
        h62 r20 = (h62) this.o;
        if (r20.L0 == false) goto L302;
        r20.p0();
        boolean r21 = LanReceiverService.y;
        String r22 = LanReceiverService.z;
        if (r22 == null) goto L81;
        Preference r23 = ((h62) this.o).A0;
        if (r23 == null) goto L79;
        r23.x(r22);
        goto L81
    L79:
        h12.Q("status");
        throw null;
    L81:
        long r24 = SystemClock.elapsedRealtime();
        Set r25 = ((h62) this.o).G0.entrySet();
        r25.getClass();
        Iterator r26 = r25.iterator();
    L83:
        if (r26.hasNext() == false) goto L87;
        Map.Entry r27 = (Map.Entry) r26.next();
        r27.getClass();
        if ((r24 - ((c62) r27.getValue()).b) < 45000) goto L83;
        r26.remove();
        r7 = true;
        goto L83
    L87:
        if (r7 == false) goto L95;
        ((h62) this.o).n0();
        if (((h62) this.o).G0.isEmpty() == false) goto L95;
        h62 r28 = (h62) this.o;
        if (r28.O0 == true) goto L95;
        if (r28.N0 == true) goto L95;
        r28.s0(R.string.lan_search_again);
        ((h62) this.o).q0();
    L95:
        ((h62) this.o).D0.postDelayed(this, 1000);
        return;
    L302:
        return;
    L97:
        f22 r29 = (f22) this.o;
        if (r29.c == null) goto L303;
        long r30 = System.currentTimeMillis();
        long r31 = r29.B;
        if (r31 != Long.MIN_VALUE) goto L102;
        long r110 = 0;
    L103:
        mw3 r32 = r29.r.getLayoutManager();
        if (r29.A != null) goto L106;
        r29.A = new Rect();
    L106:
        View r33 = r29.c.a;
        Rect r34 = r29.A;
        RecyclerView r111 = r32.b;
        if (r111 != null) goto L109;
        r34.set(0, 0, 0, 0);
    L111:
        if (r32.d() == false) goto L121;
        int r35 = (int) (r29.j + r29.h);
        int r36 = (r35 - r29.A.left) - r29.r.getPaddingLeft();
        float r112 = r29.h;
        if (r112 >= 0.0f) goto L117;
        if (r36 >= 0) goto L117;
    L115:
        int r113 = r36;
    L123:
        if (r32.e() == false) goto L133;
        int r37 = (int) (r29.k + r29.i);
        int r38 = (r37 - r29.A.top) - r29.r.getPaddingTop();
        float r39 = r29.i;
        if (r39 >= 0.0f) goto L129;
        if (r38 >= 0) goto L129;
    L127:
        r8 = r38;
    L129:
        if (r39 <= 0.0f) goto L133;
        r38 = ((r29.c.a.getHeight() + r37) + r29.A.bottom) - (r29.r.getHeight() - r29.r.getPaddingBottom());
        if (r38 > 0) goto L127;
    L133:
        if (r113 == 0) goto L135;
        e22 r114 = r29.m;
        RecyclerView r115 = r29.r;
        int r116 = r29.c.a.getWidth();
        r29.r.getWidth();
        r113 = r114.f(r115, r116, r113, r110);
    L135:
        int r40 = r113;
        if (r8 == 0) goto L139;
        e22 r117 = r29.m;
        RecyclerView r118 = r29.r;
        int r119 = r29.c.a.getHeight();
        r29.r.getHeight();
        r8 = r117.f(r118, r119, r8, r110);
    L139:
        if (r40 != 0) goto L144;
        if (r8 != 0) goto L144;
        r29.B = Long.MIN_VALUE;
        return;
    L144:
        if (r29.B != Long.MIN_VALUE) goto L146;
        r29.B = r30;
    L146:
        r29.r.scrollBy(r40, r8);
        cx3 r41 = r29.c;
        if (r41 == null) goto L149;
        r29.q(r41);
    L149:
        r29.r.removeCallbacks(r29.s);
        RecyclerView r42 = r29.r;
        WeakHashMap r43 = j65.a;
        r42.postOnAnimation(this);
        return;
    L117:
        if (r112 <= 0.0f) goto L121;
        r36 = ((r29.c.a.getWidth() + r35) + r29.A.right) - (r29.r.getWidth() - r29.r.getPaddingRight());
        if (r36 > 0) goto L115;
    L121:
        r113 = 0;
        goto L123
    L109:
        r34.set(r111.P(r33));
        goto L111
    L102:
        r110 = r30 - r31;
        goto L103
    L303:
        return;
    L151:
        ps1 r44 = (ps1) this.o;
        zq2 r45 = r44.p;
        long r46 = SystemClock.elapsedRealtime();
        oh3 r47 = (oh3) r45.r;
        if (r47 == null) goto L155;
        long r48 = r45.e(r46);
        r45.a(r46);
        r45.n = r48;
        ((lc) r45.q).d("progress", r47, Long.valueOf(r48), Long.valueOf(r46));
    L155:
        r44.q.postDelayed(this, 15000);
        return;
    L157:
        ee1 r49 = (ee1) this.o;
        r49.x = false;
        r49.s();
        return;
    L159:
        ((ld1) this.o).y(true);
        return;
    L161:
        kc1 r50 = (kc1) this.o;
        if (r50.W == null) goto L305;
        r50.k().getClass();
        return;
    L305:
        return;
    L165:
        e61 r51 = (e61) this.o;
        ValueAnimator r52 = r51.z;
        int r53 = r51.A;
        if (r53 == 1) goto L169;
        if (r53 != 2) goto L306;
    L170:
        r51.A = 3;
        r52.setFloatValues(new float[]{((Float) r52.getAnimatedValue()).floatValue(), 0.0f});
        r52.setDuration(500);
        r52.start();
        return;
    L306:
        return;
    L169:
        r52.cancel();
        goto L170
    L172:
        ((jz0) this.o).r0();
        return;
    L174:
        cx0 r54 = (cx0) this.o;
        r54.y = null;
        r54.drawableStateChanged();
        return;
    L176:
        jw0 r55 = (jw0) this.o;
        DrawerLayout r56 = r55.m;
        int r57 = r55.k.o;
        int r58 = r55.j;
        if (r58 != 3) goto L179;
        boolean r59 = true;
    L181:
        if (r59 == false) goto L187;
        View r60 = r56.f(3);
        if (r60 == null) goto L185;
        int r61 = -r60.getWidth();
    L186:
        int r62 = r61 + r57;
    L188:
        if (r60 == null) goto L307;
        if (r59 == true) goto L191;
    L192:
        if (r59 == false) goto L194;
        return;
    L194:
        if (r60.getLeft() > r62) goto L196;
        return;
    L196:
        if (r56.i(r60) != 0) goto L310;
        hw0 r63 = (hw0) r60.getLayoutParams();
        r55.k.s(r60, r62, r60.getTop());
        r63.c = true;
        r56.invalidate();
        if (r58 != 3) goto L200;
        r3 = 5;
    L200:
        View r64 = r56.f(r3);
        if (r64 == null) goto L204;
        r56.c(r64, true);
    L204:
        if (r56.D == true) goto L311;
        long r65 = SystemClock.uptimeMillis();
        MotionEvent r66 = MotionEvent.obtain(r65, r65, 3, 0.0f, 0.0f, 0);
        int r67 = r56.getChildCount();
    L206:
        if (r6 >= r67) goto L208;
        r56.getChildAt(r6).dispatchTouchEvent(r66);
        r6 = r6 + 1;
        goto L206
    L208:
        r66.recycle();
        r56.D = true;
        return;
    L311:
        return;
    L310:
        return;
    L191:
        if (r60.getLeft() < r62) goto L196;
    L307:
        return;
    L185:
        r61 = 0;
        goto L186
    L187:
        r60 = r56.f(5);
        r62 = r56.getWidth() - r57;
        goto L188
    L179:
        r59 = false;
        goto L181
    L210:
        xl.E((s24) ((ss0) this.o).n, false, true, new k2(15, r6));
        return;
    L212:
        pp0 r68 = (pp0) this.o;
        r68.o0.onDismiss(r68.w0);
        return;
    L214:
        bk r69 = (bk) this.o;
        r69.p = false;
        BottomSheetBehavior r70 = (BottomSheetBehavior) r69.r;
        o65 r71 = r70.Z;
        if (r71 == null) goto L220;
        if (r71.g() == false) goto L220;
        r69.c(r69.o);
        return;
    L220:
        if (r70.Y != 2) goto L313;
        r70.K(r69.o);
        return;
    L313:
        return;
    L223:
        MediaService r72 = (MediaService) this.o;
        qi3 r73 = r72.p().a();
        r73.getClass();
        if (r73.h0() == true) goto L226;
        r72.C = false;
        return;
    L226:
        long r74 = SystemClock.elapsedRealtime();
        if ((r74 - r72.E) < 15000) goto L229;
        r72.E = r74;
        bo2.n(r73.a(), r73.M0());
    L229:
        r72.w(r73);
        r72.B.postDelayed(this, 1000);
        return;
    L231:
        hc2 r75 = (hc2) this.o;
        cx0 r76 = r75.p;
        qn r77 = r75.n;
        if (r75.B == true) goto L235;
        return;
    L235:
        if (r75.z == false) goto L238;
        r75.z = false;
        long r78 = AnimationUtils.currentAnimationTimeMillis();
        r77.e = r78;
        r77.g = -1;
        r77.f = r78;
        r77.h = 0.5f;
    L238:
        if (r77.g <= 0) goto L243;
        if (AnimationUtils.currentAnimationTimeMillis() <= (r77.g + ((long) r77.i))) goto L243;
    L244:
        r75.B = false;
        return;
    L243:
        if (r75.e() == false) goto L244;
        if (r75.A == false) goto L249;
        r75.A = false;
        long r79 = SystemClock.uptimeMillis();
        MotionEvent r80 = MotionEvent.obtain(r79, r79, 3, 0.0f, 0.0f, 0);
        r76.onTouchEvent(r80);
        r80.recycle();
    L249:
        if (r77.f == 0) goto L251;
        long r81 = AnimationUtils.currentAnimationTimeMillis();
        float r82 = r77.a(r81);
        long r83 = r81 - r77.f;
        r77.f = r81;
        r75.D.scrollListBy((int) ((r83 * ((r82 * 4.0f) + (((-4.0f) * r82) * r82))) * r77.d));
        WeakHashMap r84 = j65.a;
        r76.postOnAnimation(this);
        return;
    L251:
        tb4.e("Cannot compute scroll delta before calling start()");
        return;
    L253:
        ra r85 = (ra) this.o;
        r85.removeCallbacks(this);
        MotionEvent r86 = r85.z0;
        if (r86 == null) goto L318;
        int r87 = r86.getActionMasked();
        if (r87 == 10) goto L319;
        if (r87 != 1) goto L259;
        return;
    L259:
        if (r87 == 7) goto L264;
        int r88 = 9;
        if (r87 == 8) goto L265;
        if (r87 == 9) goto L264;
        r88 = 2;
    L265:
        r85.G(r86, r88, r85.A0, false);
        return;
    L264:
        r88 = 7;
        goto L265
    L319:
        return;
    L318:
        return;
    L267:
        ns3 r89 = (ns3) this.o;
    L275:
        r89.b((i5) ((ReferenceQueue) r89.p).remove());     // Catch: InterruptedException -> L270
    L270:
        Thread.currentThread().interrupt();
        goto L275
    L271:
        Process.setThreadPriority(10);
        ((Runnable) this.o).run();
    }
}
