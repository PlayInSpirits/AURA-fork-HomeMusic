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
import com.eddyizm.tempus.homemusic.WaveRetry;
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
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class g5 implements Runnable {
    public final /* synthetic */ int n;
    public final Object o;

    public /* synthetic */ g5(int i, Object obj) {
        this.n = i;
        this.o = obj;
    }

    /* JADX INFO: Infinite loop detected, blocks: 8, insns: 0 */
    /* JADX WARN: Code duplicated, block: B:121:0x025d  */
    /* JADX WARN: Code duplicated, block: B:264:0x0549  */
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
        int actionMasked;
        int i;
        View viewF;
        int width;
        int iF;
        Object obj;
        long jNanoTime;
        byte b = 0;
        boolean z = false;
        iF = 0;
        iF = 0;
        int iF2 = 0;
        switch (this.n) {
            case 0:
                Process.setThreadPriority(10);
                ((Runnable) this.o).run();
                return;
            case 1:
                ns3 ns3Var = (ns3) this.o;
                while (true) {
                    try {
                        ns3Var.b((i5) ((ReferenceQueue) ns3Var.p).remove());
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                break;
            case 2:
                ra raVar = (ra) this.o;
                raVar.removeCallbacks(this);
                MotionEvent motionEvent = raVar.z0;
                if (motionEvent == null || (actionMasked = motionEvent.getActionMasked()) == 10 || actionMasked == 1) {
                    return;
                }
                if (actionMasked != 7) {
                    i = 9;
                    if (actionMasked != 8) {
                        if (actionMasked != 9) {
                            i = 2;
                        } else {
                            i = 7;
                        }
                    }
                } else {
                    i = 7;
                }
                raVar.G(motionEvent, i, raVar.A0, false);
                return;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                hc2 hc2Var = (hc2) this.o;
                cx0 cx0Var = hc2Var.p;
                qn qnVar = hc2Var.n;
                if (hc2Var.B) {
                    if (hc2Var.z) {
                        hc2Var.z = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        qnVar.e = jCurrentAnimationTimeMillis;
                        qnVar.g = -1L;
                        qnVar.f = jCurrentAnimationTimeMillis;
                        qnVar.h = 0.5f;
                    }
                    if ((qnVar.g > 0 && AnimationUtils.currentAnimationTimeMillis() > qnVar.g + ((long) qnVar.i)) || !hc2Var.e()) {
                        hc2Var.B = false;
                        return;
                    }
                    if (hc2Var.A) {
                        hc2Var.A = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        cx0Var.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (qnVar.f == 0) {
                        tb4.e("Cannot compute scroll delta before calling start()");
                        return;
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fA = qnVar.a(jCurrentAnimationTimeMillis2);
                    long j = jCurrentAnimationTimeMillis2 - qnVar.f;
                    qnVar.f = jCurrentAnimationTimeMillis2;
                    hc2Var.D.scrollListBy((int) (j * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * qnVar.d));
                    WeakHashMap weakHashMap = j65.a;
                    cx0Var.postOnAnimation(this);
                    return;
                }
                return;
            case 4:
                MediaService mediaService = (MediaService) this.o;
                qi3 qi3VarA = mediaService.p().a();
                qi3VarA.getClass();
                if (!qi3VarA.h0()) {
                    mediaService.C = false;
                    return;
                }
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (jElapsedRealtime - mediaService.E >= 15000) {
                    mediaService.E = jElapsedRealtime;
                    bo2.n(qi3VarA.a(), qi3VarA.M0());
                }
                mediaService.w(qi3VarA);
                mediaService.B.postDelayed(this, 1000L);
                return;
            case 5:
                bk bkVar = (bk) this.o;
                bkVar.p = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) bkVar.r;
                o65 o65Var = bottomSheetBehavior.Z;
                if (o65Var != null && o65Var.g()) {
                    bkVar.c(bkVar.o);
                    return;
                } else {
                    if (bottomSheetBehavior.Y == 2) {
                        bottomSheetBehavior.K(bkVar.o);
                        return;
                    }
                    return;
                }
            case 6:
                pp0 pp0Var = (pp0) this.o;
                pp0Var.o0.onDismiss(pp0Var.w0);
                return;
            case 7:
                xl.E((s24) ((ss0) this.o).n, false, true, new k2(15, b));
                return;
            case 8:
                jw0 jw0Var = (jw0) this.o;
                DrawerLayout drawerLayout = jw0Var.m;
                int i2 = jw0Var.k.o;
                int i3 = jw0Var.j;
                boolean z2 = i3 == 3;
                if (z2) {
                    viewF = drawerLayout.f(3);
                    width = (viewF != null ? -viewF.getWidth() : 0) + i2;
                } else {
                    viewF = drawerLayout.f(5);
                    width = drawerLayout.getWidth() - i2;
                }
                if (viewF != null) {
                    if (((!z2 || viewF.getLeft() >= width) && (z2 || viewF.getLeft() <= width)) || drawerLayout.i(viewF) != 0) {
                        return;
                    }
                    hw0 hw0Var = (hw0) viewF.getLayoutParams();
                    jw0Var.k.s(viewF, width, viewF.getTop());
                    hw0Var.c = true;
                    drawerLayout.invalidate();
                    View viewF2 = drawerLayout.f(i3 == 3 ? 5 : 3);
                    if (viewF2 != null) {
                        drawerLayout.c(viewF2, true);
                    }
                    if (drawerLayout.D) {
                        return;
                    }
                    long jUptimeMillis2 = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain2 = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
                    int childCount = drawerLayout.getChildCount();
                    while (b < childCount) {
                        drawerLayout.getChildAt(b).dispatchTouchEvent(motionEventObtain2);
                        b++;
                    }
                    motionEventObtain2.recycle();
                    drawerLayout.D = true;
                    return;
                }
                return;
            case 9:
                cx0 cx0Var2 = (cx0) this.o;
                cx0Var2.y = null;
                cx0Var2.drawableStateChanged();
                return;
            case 10:
                ((jz0) this.o).r0();
                return;
            case 11:
                e61 e61Var = (e61) this.o;
                ValueAnimator valueAnimator = e61Var.z;
                int i4 = e61Var.A;
                if (i4 == 1) {
                    valueAnimator.cancel();
                } else if (i4 != 2) {
                    return;
                }
                e61Var.A = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500L);
                valueAnimator.start();
                return;
            case 12:
                kc1 kc1Var = (kc1) this.o;
                if (kc1Var.W != null) {
                    kc1Var.k().getClass();
                    return;
                }
                return;
            case 13:
                ((ld1) this.o).y(true);
                return;
            case 14:
                ee1 ee1Var = (ee1) this.o;
                ee1Var.x = false;
                ee1Var.s();
                return;
            case 15:
                ps1 ps1Var = (ps1) this.o;
                zq2 zq2Var = ps1Var.p;
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                oh3 oh3Var = (oh3) zq2Var.r;
                if (oh3Var != null) {
                    long jE = zq2Var.e(jElapsedRealtime2);
                    zq2Var.a(jElapsedRealtime2);
                    zq2Var.n = jE;
                    ((lc) zq2Var.q).d("progress", oh3Var, Long.valueOf(jE), Long.valueOf(jElapsedRealtime2));
                }
                ps1Var.q.postDelayed(this, 15000L);
                return;
            case WaveRetry.MAX_FAILURES /* 16 */:
                f22 f22Var = (f22) this.o;
                if (f22Var.c != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j2 = f22Var.B;
                    long j3 = j2 == Long.MIN_VALUE ? 0L : jCurrentTimeMillis - j2;
                    mw3 layoutManager = f22Var.r.getLayoutManager();
                    if (f22Var.A == null) {
                        f22Var.A = new Rect();
                    }
                    View view = f22Var.c.a;
                    Rect rect = f22Var.A;
                    RecyclerView recyclerView = layoutManager.b;
                    if (recyclerView == null) {
                        rect.set(0, 0, 0, 0);
                    } else {
                        rect.set(recyclerView.P(view));
                    }
                    if (layoutManager.d()) {
                        int i5 = (int) (f22Var.j + f22Var.h);
                        int paddingLeft = (i5 - f22Var.A.left) - f22Var.r.getPaddingLeft();
                        float f = f22Var.h;
                        if ((f >= 0.0f || paddingLeft >= 0) && (f <= 0.0f || (paddingLeft = ((f22Var.c.a.getWidth() + i5) + f22Var.A.right) - (f22Var.r.getWidth() - f22Var.r.getPaddingRight())) <= 0)) {
                            iF = 0;
                        } else {
                            iF = paddingLeft;
                        }
                    } else {
                        iF = 0;
                    }
                    if (layoutManager.e()) {
                        int i6 = (int) (f22Var.k + f22Var.i);
                        int paddingTop = (i6 - f22Var.A.top) - f22Var.r.getPaddingTop();
                        float f2 = f22Var.i;
                        if ((f2 < 0.0f && paddingTop < 0) || (f2 > 0.0f && (paddingTop = ((f22Var.c.a.getHeight() + i6) + f22Var.A.bottom) - (f22Var.r.getHeight() - f22Var.r.getPaddingBottom())) > 0)) {
                            iF2 = paddingTop;
                        }
                    }
                    if (iF != 0) {
                        e22 e22Var = f22Var.m;
                        RecyclerView recyclerView2 = f22Var.r;
                        int width2 = f22Var.c.a.getWidth();
                        f22Var.r.getWidth();
                        iF = e22Var.f(recyclerView2, width2, iF, j3);
                    }
                    int i7 = iF;
                    if (iF2 != 0) {
                        e22 e22Var2 = f22Var.m;
                        RecyclerView recyclerView3 = f22Var.r;
                        int height = f22Var.c.a.getHeight();
                        f22Var.r.getHeight();
                        iF2 = e22Var2.f(recyclerView3, height, iF2, j3);
                    }
                    if (i7 == 0 && iF2 == 0) {
                        f22Var.B = Long.MIN_VALUE;
                        return;
                    }
                    if (f22Var.B == Long.MIN_VALUE) {
                        f22Var.B = jCurrentTimeMillis;
                    }
                    f22Var.r.scrollBy(i7, iF2);
                    cx3 cx3Var = f22Var.c;
                    if (cx3Var != null) {
                        f22Var.q(cx3Var);
                    }
                    f22Var.r.removeCallbacks(f22Var.s);
                    RecyclerView recyclerView4 = f22Var.r;
                    WeakHashMap weakHashMap2 = j65.a;
                    recyclerView4.postOnAnimation(this);
                    return;
                }
                return;
            case 17:
                h62 h62Var = (h62) this.o;
                if (h62Var.L0) {
                    h62Var.p0();
                    boolean z3 = LanReceiverService.y;
                    String str = LanReceiverService.z;
                    if (str != null) {
                        Preference preference = ((h62) this.o).A0;
                        if (preference == null) {
                            h12.Q("status");
                            throw null;
                        }
                        preference.x(str);
                    }
                    long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                    Set setEntrySet = ((h62) this.o).G0.entrySet();
                    setEntrySet.getClass();
                    Iterator it = setEntrySet.iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        entry.getClass();
                        if (jElapsedRealtime3 - ((c62) entry.getValue()).b >= 45000) {
                            it.remove();
                            z = true;
                        }
                    }
                    if (z) {
                        ((h62) this.o).n0();
                        if (((h62) this.o).G0.isEmpty()) {
                            h62 h62Var2 = (h62) this.o;
                            if (!h62Var2.O0 && !h62Var2.N0) {
                                h62Var2.s0(R.string.lan_search_again);
                                ((h62) this.o).q0();
                            }
                        }
                    }
                    ((h62) this.o).D0.postDelayed(this, 1000L);
                    return;
                }
                return;
            case 18:
                synchronized (((ad2) this.o).a) {
                    obj = ((ad2) this.o).f;
                    ((ad2) this.o).f = ad2.k;
                    break;
                }
                ((ad2) this.o).k(obj);
                return;
            case 19:
                ((kd2) this.o).a();
                return;
            case 20:
                oj2 oj2Var = (oj2) this.o;
                oi oiVar = oj2Var.g.r;
                hg3 hg3Var = oj2Var.e;
                hg3Var.getClass();
                oiVar.remove(((Messenger) hg3Var.o).getBinder());
                return;
            case 21:
                qp2 qp2Var = (qp2) this.o;
                qp2Var.m(true);
                qp2Var.R.requestLayout();
                qp2Var.R.getViewTreeObserver().addOnGlobalLayoutListener(new sg(4, qp2Var));
                return;
            case 22:
                qp2 qp2Var2 = ((op2) this.o).b;
                if (qp2Var2.Z != null) {
                    qp2Var2.Z = null;
                    if (qp2Var2.o0) {
                        qp2Var2.t(qp2Var2.p0);
                        return;
                    }
                    return;
                }
                return;
            case 23:
                RecyclerView recyclerView5 = ((kp3) this.o).n0;
                recyclerView5.focusableViewAvailable(recyclerView5);
                return;
            case 24:
                synchronized (this) {
                    ((PreferenceGroup) this.o).b0.clear();
                    break;
                }
                return;
            case 25:
                ((np3) this.o).s();
                return;
            case 26:
                ((ip0) this.o).c();
                return;
            case 27:
                c04 c04Var = (c04) this.o;
                c04Var.p.f(c04Var);
                return;
            case 28:
                ((StaggeredGridLayoutManager) this.o).F0();
                return;
            default:
                gr4 gr4Var = (gr4) this.o;
                ReentrantLock reentrantLock = gr4Var.c;
                while (true) {
                    reentrantLock.lock();
                    try {
                        ar4 ar4VarC = gr4Var.c();
                        reentrantLock.unlock();
                        if (ar4VarC == null) {
                            return;
                        }
                        Logger logger = gr4Var.b;
                        fr4 fr4Var = ar4VarC.c;
                        fr4Var.getClass();
                        boolean zIsLoggable = logger.isLoggable(Level.FINE);
                        if (zIsLoggable) {
                            jNanoTime = System.nanoTime();
                            zz1.c(logger, ar4VarC, fr4Var, "starting");
                        } else {
                            jNanoTime = -1;
                        }
                        try {
                            gr4.a(gr4Var, ar4VarC);
                            if (zIsLoggable) {
                                zz1.c(logger, ar4VarC, fr4Var, "finished run in ".concat(zz1.n(System.nanoTime() - jNanoTime)));
                            }
                        } catch (Throwable th) {
                            try {
                                reentrantLock.lock();
                                try {
                                    ((ThreadPoolExecutor) gr4Var.a.o).execute(this);
                                    throw th;
                                } finally {
                                    reentrantLock.unlock();
                                }
                            } catch (Throwable th2) {
                                if (zIsLoggable) {
                                    zz1.c(logger, ar4VarC, fr4Var, "failed a run in ".concat(zz1.n(System.nanoTime() - jNanoTime)));
                                }
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        reentrantLock.unlock();
                        throw th3;
                    }
                }
                break;
        }
    }
}
