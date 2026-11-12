package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import defpackage.ax3;
import defpackage.b30;
import defpackage.b6;
import defpackage.bq0;
import defpackage.bw3;
import defpackage.bx3;
import defpackage.c22;
import defpackage.c6;
import defpackage.ce1;
import defpackage.ct3;
import defpackage.cw3;
import defpackage.cx3;
import defpackage.d65;
import defpackage.db2;
import defpackage.dw3;
import defpackage.e20;
import defpackage.e61;
import defpackage.ew4;
import defpackage.ex3;
import defpackage.f34;
import defpackage.gb;
import defpackage.hm2;
import defpackage.hw3;
import defpackage.i53;
import defpackage.iw3;
import defpackage.j53;
import defpackage.j65;
import defpackage.jo3;
import defpackage.jw3;
import defpackage.k65;
import defpackage.kf2;
import defpackage.kw3;
import defpackage.mj0;
import defpackage.mw3;
import defpackage.n50;
import defpackage.n65;
import defpackage.nw3;
import defpackage.nz2;
import defpackage.ow3;
import defpackage.pl0;
import defpackage.pw3;
import defpackage.pz1;
import defpackage.qw3;
import defpackage.qz0;
import defpackage.r50;
import defpackage.r65;
import defpackage.rm2;
import defpackage.rm3;
import defpackage.rw3;
import defpackage.si1;
import defpackage.sw3;
import defpackage.tb4;
import defpackage.tc3;
import defpackage.tw3;
import defpackage.uw3;
import defpackage.vw3;
import defpackage.wr1;
import defpackage.xa3;
import defpackage.xe2;
import defpackage.xg0;
import defpackage.xl;
import defpackage.xw3;
import defpackage.yd4;
import defpackage.yg1;
import defpackage.yw3;
import defpackage.zw3;
import defpackage.zz1;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements i53 {
    public static boolean P0;
    public static boolean Q0;
    public static final int[] R0 = {R.attr.nestedScrollingEnabled};
    public static final float S0 = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final boolean T0 = true;
    public static final boolean U0 = true;
    public static final Class[] V0;
    public static final c22 W0;
    public static final zw3 X0;
    public mw3 A;
    public boolean A0;
    public final ArrayList B;
    public ex3 B0;
    public final ArrayList C;
    public final int[] C0;
    public final ArrayList D;
    public j53 D0;
    public qw3 E;
    public final int[] E0;
    public boolean F;
    public final int[] F0;
    public boolean G;
    public final int[] G0;
    public boolean H;
    public final ArrayList H0;
    public int I;
    public final bw3 I0;
    public boolean J;
    public boolean J0;
    public boolean K;
    public int K0;
    public boolean L;
    public int L0;
    public int M;
    public final boolean M0;
    public boolean N;
    public final cw3 N0;
    public final AccessibilityManager O;
    public final bq0 O0;
    public ArrayList P;
    public boolean Q;
    public boolean R;
    public int S;
    public int T;
    public iw3 U;
    public EdgeEffect V;
    public EdgeEffect W;
    public EdgeEffect a0;
    public EdgeEffect b0;
    public jw3 c0;
    public int d0;
    public int e0;
    public VelocityTracker f0;
    public int g0;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public pw3 l0;
    public final int m0;
    public final float n;
    public final int n0;
    public final ce1 o;
    public final float o0;
    public final hm2 p;
    public final float p0;
    public vw3 q;
    public boolean q0;
    public final c6 r;
    public final bx3 r0;
    public final ew4 s;
    public yg1 s0;
    public final rm3 t;
    public final b30 t0;
    public boolean u;
    public final yw3 u0;
    public final bw3 v;
    public rw3 v0;
    public final Rect w;
    public ArrayList w0;
    public final Rect x;
    public boolean x0;
    public final RectF y;
    public boolean y0;
    public dw3 z;
    public final cw3 z0;

    static {
        Class cls = Integer.TYPE;
        V0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        W0 = new c22(2);
        X0 = new zw3();
    }

    /* JADX WARN: Failed to calculate best type for var: r16v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v10 ??, new type: java.lang.Throwable
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r16v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v10 ??, new type: java.lang.Throwable
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r16v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v3 ??, new type: java.lang.Throwable
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r16v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v3 ??, new type: java.lang.Throwable
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r16v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v4 ??, new type: java.lang.Throwable
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r16v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v4 ??, new type: java.lang.Throwable
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r16v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v5 ??, new type: java.lang.Throwable
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r16v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v5 ??, new type: java.lang.Throwable
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r16v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v6 ??, new type: java.lang.Throwable
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r16v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v6 ??, new type: java.lang.Throwable
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r16v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v7 ??, new type: java.lang.Throwable
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r16v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v7 ??, new type: java.lang.Throwable
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r16v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v8 ??, new type: java.lang.Throwable
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r16v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v8 ??, new type: java.lang.Throwable
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r16v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v9 ??, new type: java.lang.Throwable
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r16v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v9 ??, new type: java.lang.Throwable
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: TypeSearchVarInfo not found in map for var: r11v0 ??
    	at jadx.core.dex.visitors.typeinference.TypeSearchState.getVarInfo(TypeSearchState.java:34)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.lambda$resolveIndependentVariables$1(TypeSearch.java:173)
    	at java.base/java.util.stream.MatchOps$1MatchSink.accept(MatchOps.java:90)
    	at java.base/java.util.ArrayList$ArrayListSpliterator.tryAdvance(ArrayList.java:1602)
    	at java.base/java.util.stream.ReferencePipeline$7$1.accept(ReferencePipeline.java:280)
    	at java.base/java.util.ArrayList$ArrayListSpliterator.tryAdvance(ArrayList.java:1602)
    	at java.base/java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)
    	at java.base/java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)
    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)
    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
    	at java.base/java.util.stream.MatchOps$MatchOp.evaluateSequential(MatchOps.java:230)
    	at java.base/java.util.stream.MatchOps$MatchOp.evaluateSequential(MatchOps.java:196)
    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
    	at java.base/java.util.stream.ReferencePipeline.allMatch(ReferencePipeline.java:637)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.resolveIndependentVariables(TypeSearch.java:173)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:63)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:119)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r16v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r16v5, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r16v6, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        float fA;
        char c;
        int i2;
        ?? r16;
        ClassLoader classLoader;
        Constructor constructor;
        Object[] objArr;
        super(context, attributeSet, i);
        int i3 = 1;
        this.o = new ce1(i3, this);
        this.p = new hm2(this);
        this.t = new rm3(22);
        this.v = new bw3(this, 0);
        this.w = new Rect();
        this.x = new Rect();
        this.y = new RectF();
        this.B = new ArrayList();
        this.C = new ArrayList();
        this.D = new ArrayList();
        this.I = 0;
        this.Q = false;
        this.R = false;
        this.S = 0;
        this.T = 0;
        this.U = X0;
        pl0 pl0Var = new pl0();
        pl0Var.a = null;
        pl0Var.b = new ArrayList();
        pl0Var.c = 120L;
        pl0Var.d = 120L;
        pl0Var.e = 250L;
        pl0Var.f = 250L;
        pl0Var.g = true;
        pl0Var.h = new ArrayList();
        pl0Var.i = new ArrayList();
        pl0Var.j = new ArrayList();
        pl0Var.k = new ArrayList();
        pl0Var.l = new ArrayList();
        pl0Var.m = new ArrayList();
        pl0Var.n = new ArrayList();
        pl0Var.o = new ArrayList();
        pl0Var.p = new ArrayList();
        pl0Var.q = new ArrayList();
        pl0Var.r = new ArrayList();
        this.c0 = pl0Var;
        this.d0 = 0;
        this.e0 = -1;
        this.o0 = Float.MIN_VALUE;
        this.p0 = Float.MIN_VALUE;
        this.q0 = true;
        this.r0 = new bx3(this);
        this.t0 = U0 ? new b30() : null;
        yw3 yw3Var = new yw3();
        yw3Var.a = -1;
        yw3Var.b = 0;
        yw3Var.c = 0;
        yw3Var.d = 1;
        yw3Var.e = 0;
        yw3Var.f = false;
        yw3Var.g = false;
        yw3Var.h = false;
        yw3Var.i = false;
        yw3Var.j = false;
        yw3Var.k = false;
        this.u0 = yw3Var;
        this.x0 = false;
        this.y0 = false;
        cw3 cw3Var = new cw3(this);
        this.z0 = cw3Var;
        this.A0 = false;
        this.C0 = new int[2];
        this.E0 = new int[2];
        this.F0 = new int[2];
        this.G0 = new int[2];
        this.H0 = new ArrayList();
        this.I0 = new bw3(this, i3);
        this.K0 = 0;
        this.L0 = 0;
        this.N0 = new cw3(this);
        this.O0 = new bq0(getContext(), new pz1(17, this));
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.k0 = viewConfiguration.getScaledTouchSlop();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26) {
            Method method = n65.a;
            fA = r50.f(viewConfiguration);
        } else {
            fA = n65.a(viewConfiguration, context);
        }
        this.o0 = fA;
        this.p0 = i4 >= 26 ? r50.g(viewConfiguration) : n65.a(viewConfiguration, context);
        this.m0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.n0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.n = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.c0.a = cw3Var;
        si1 si1Var = new si1(20, this);
        c6 c6Var = new c6();
        c6Var.b = new jo3(30);
        c6Var.c = new ArrayList();
        c6Var.d = new ArrayList();
        c6Var.a = 0;
        c6Var.e = si1Var;
        c6Var.f = new pz1(9, c6Var);
        this.r = c6Var;
        this.s = new ew4(new rm2(12, this));
        WeakHashMap weakHashMap = j65.a;
        if ((i4 >= 26 ? d65.a(this) : 0) == 0 && i4 >= 26) {
            d65.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.O = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new ex3(this));
        int[] iArr = ct3.a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        j65.n(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.u = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                kf2.n("Trying to set fast scroller without both required drawables.".concat(C()));
                throw null;
            }
            Resources resources = getContext().getResources();
            c = 3;
            i2 = 4;
            new e61(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(app.homemusic.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(app.homemusic.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(app.homemusic.R.dimen.fastscroll_margin));
        } else {
            c = 3;
            i2 = 4;
        }
        typedArrayObtainStyledAttributes.recycle();
        this.M0 = context.getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                String str = strTrim;
                try {
                    try {
                        if (isInEditMode()) {
                            classLoader = getClass().getClassLoader();
                        } else {
                            try {
                                classLoader = context.getClassLoader();
                            } catch (ClassNotFoundException e) {
                                e = e;
                                r16 = 0;
                                nz2.j(attributeSet.getPositionDescription(), ": Unable to find LayoutManager ", str, e);
                                throw r16;
                            } catch (IllegalAccessException e2) {
                                e = e2;
                                r16 = 0;
                                nz2.j(attributeSet.getPositionDescription(), ": Cannot access non-public constructor ", str, e);
                                throw r16;
                            } catch (InstantiationException e3) {
                                e = e3;
                                r16 = 0;
                                nz2.j(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e);
                                throw r16;
                            } catch (InvocationTargetException e4) {
                                e = e4;
                                r16 = 0;
                                nz2.j(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e);
                                throw r16;
                            }
                        }
                        Class clsAsSubclass = Class.forName(str, false, classLoader).asSubclass(mw3.class);
                        try {
                            constructor = clsAsSubclass.getConstructor(V0);
                            objArr = new Object[i2];
                            objArr[0] = context;
                            objArr[i3] = attributeSet;
                            objArr[2] = Integer.valueOf(i);
                            objArr[c] = 0;
                        } catch (NoSuchMethodException e5) {
                            try {
                                constructor = clsAsSubclass.getConstructor(null);
                                objArr = null;
                            } catch (NoSuchMethodException e6) {
                                e6.initCause(e5);
                                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e6);
                            }
                        }
                        constructor.setAccessible(true);
                        setLayoutManager((mw3) constructor.newInstance(objArr));
                    } catch (ClassCastException e7) {
                        nz2.j(attributeSet.getPositionDescription(), ": Class is not a LayoutManager ", str, e7);
                        throw null;
                    }
                } catch (ClassNotFoundException e8) {
                    e = e8;
                } catch (IllegalAccessException e9) {
                    e = e9;
                } catch (InstantiationException e10) {
                    e = e10;
                } catch (InvocationTargetException e11) {
                    e = e11;
                }
            }
        }
        int[] iArr2 = R0;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        j65.n(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i, 0);
        boolean z = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z);
        setTag(app.homemusic.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    public static RecyclerView H(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewH = H(viewGroup.getChildAt(i));
            if (recyclerViewH != null) {
                return recyclerViewH;
            }
        }
        return null;
    }

    public static cx3 N(View view) {
        if (view == null) {
            return null;
        }
        return ((nw3) view.getLayoutParams()).a;
    }

    public static void O(View view, Rect rect) {
        nw3 nw3Var = (nw3) view.getLayoutParams();
        Rect rect2 = nw3Var.b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) nw3Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) nw3Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) nw3Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) nw3Var).bottomMargin);
    }

    private j53 getScrollingChildHelper() {
        if (this.D0 == null) {
            this.D0 = new j53(this);
        }
        return this.D0;
    }

    public static void l(cx3 cx3Var) {
        WeakReference weakReference = cx3Var.b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == cx3Var.a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            cx3Var.b = null;
        }
    }

    public static int o(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && xl.q(edgeEffect) != 0.0f) {
            int iRound = Math.round(xl.C(edgeEffect, ((-i) * 4.0f) / i2, 0.5f) * ((-i2) / 4.0f));
            if (iRound != i) {
                edgeEffect.finish();
            }
            return i - iRound;
        }
        if (i >= 0 || edgeEffect2 == null || xl.q(edgeEffect2) == 0.0f) {
            return i;
        }
        float f = i2;
        int iRound2 = Math.round(xl.C(edgeEffect2, (i * 4.0f) / f, 0.5f) * (f / 4.0f));
        if (iRound2 != i) {
            edgeEffect2.finish();
        }
        return i - iRound2;
    }

    public static void setDebugAssertionsEnabled(boolean z) {
        P0 = z;
    }

    public static void setVerboseLoggingEnabled(boolean z) {
        Q0 = z;
    }

    public final void A() {
        if (this.a0 != null) {
            return;
        }
        ((zw3) this.U).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.a0 = edgeEffect;
        if (this.u) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void B() {
        if (this.W != null) {
            return;
        }
        ((zw3) this.U).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.W = edgeEffect;
        if (this.u) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String C() {
        return " " + super.toString() + ", adapter:" + this.z + ", layout:" + this.A + ", context:" + getContext();
    }

    public final void D(yw3 yw3Var) {
        if (getScrollState() != 2) {
            yw3Var.getClass();
            return;
        }
        OverScroller overScroller = this.r0.p;
        overScroller.getFinalX();
        overScroller.getCurrX();
        yw3Var.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public final View E(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public final boolean F(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.D;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            qw3 qw3Var = (qw3) arrayList.get(i);
            if (qw3Var.d(motionEvent) && action != 3) {
                this.E = qw3Var;
                return true;
            }
        }
        return false;
    }

    public final void G(int[] iArr) {
        ew4 ew4Var = this.s;
        int iH = ew4Var.h();
        if (iH == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < iH; i3++) {
            cx3 cx3VarN = N(ew4Var.g(i3));
            if (!cx3VarN.q()) {
                int iD = cx3VarN.d();
                if (iD < i) {
                    i = iD;
                }
                if (iD > i2) {
                    i2 = iD;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public final cx3 I(int i) {
        cx3 cx3Var = null;
        if (this.Q) {
            return null;
        }
        ew4 ew4Var = this.s;
        int iK = ew4Var.k();
        for (int i2 = 0; i2 < iK; i2++) {
            cx3 cx3VarN = N(ew4Var.j(i2));
            if (cx3VarN != null && !cx3VarN.j() && K(cx3VarN) == i) {
                if (!((ArrayList) ew4Var.r).contains(cx3VarN.a)) {
                    return cx3VarN;
                }
                cx3Var = cx3VarN;
            }
        }
        return cx3Var;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x016e  */
    /* JADX WARN: Code duplicated, block: B:166:0x0222 A[PHI: r18 r21
  0x0222: PHI (r18v4 boolean) = 
  (r18v2 boolean)
  (r18v2 boolean)
  (r18v2 boolean)
  (r18v2 boolean)
  (r18v2 boolean)
  (r18v2 boolean)
  (r18v5 boolean)
  (r18v5 boolean)
  (r18v5 boolean)
  (r18v9 boolean)
 binds: [B:169:0x022e, B:172:0x0235, B:175:0x023c, B:178:0x0244, B:181:0x0250, B:199:0x028c, B:147:0x01ec, B:164:0x021e, B:165:0x0220, B:109:0x016e] A[DONT_GENERATE, DONT_INLINE]
  0x0222: PHI (r21v5 boolean) = 
  (r21v3 boolean)
  (r21v3 boolean)
  (r21v3 boolean)
  (r21v3 boolean)
  (r21v3 boolean)
  (r21v3 boolean)
  (r21v6 boolean)
  (r21v6 boolean)
  (r21v6 boolean)
  (r21v7 boolean)
 binds: [B:169:0x022e, B:172:0x0235, B:175:0x023c, B:178:0x0244, B:181:0x0250, B:199:0x028c, B:147:0x01ec, B:164:0x021e, B:165:0x0220, B:109:0x016e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:211:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:43:0x0087  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:97:0x0141  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean J(int i, int i2, int i3, int i4) {
        int iMax;
        int i5;
        boolean z;
        boolean z2;
        int minFlingVelocity;
        tc3 tc3Var;
        int iD;
        View viewG;
        int I;
        int i6;
        PointF pointFA;
        int i7;
        int iD2;
        int i8;
        int I2;
        PointF pointFA2;
        boolean z3;
        mw3 mw3Var = this.A;
        int i9 = 0;
        if (mw3Var == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (!this.K) {
            boolean zD = mw3Var.d();
            boolean zE = this.A.e();
            int i10 = (!zD || Math.abs(i) < i3) ? 0 : i;
            int iMax2 = (!zE || Math.abs(i2) < i3) ? 0 : i2;
            if (i10 != 0 || iMax2 != 0) {
                if (i10 == 0) {
                    iMax = 0;
                } else {
                    EdgeEffect edgeEffect = this.V;
                    if (edgeEffect == null || xl.q(edgeEffect) == 0.0f) {
                        EdgeEffect edgeEffect2 = this.a0;
                        if (edgeEffect2 == null || xl.q(edgeEffect2) == 0.0f) {
                            iMax = 0;
                        } else if (k0(this.a0, i10, getWidth())) {
                            this.a0.onAbsorb(i10);
                            i10 = 0;
                        }
                    } else {
                        int i11 = -i10;
                        if (k0(this.V, i11, getWidth())) {
                            this.V.onAbsorb(i11);
                            i10 = 0;
                        }
                    }
                    iMax = i10;
                    i10 = 0;
                }
                if (iMax2 == 0) {
                    i5 = iMax2;
                    iMax2 = 0;
                } else {
                    EdgeEffect edgeEffect3 = this.W;
                    if (edgeEffect3 == null || xl.q(edgeEffect3) == 0.0f) {
                        EdgeEffect edgeEffect4 = this.b0;
                        if (edgeEffect4 == null || xl.q(edgeEffect4) == 0.0f) {
                            i5 = iMax2;
                            iMax2 = 0;
                        } else if (k0(this.b0, iMax2, getHeight())) {
                            this.b0.onAbsorb(iMax2);
                            iMax2 = 0;
                        }
                    } else {
                        int i12 = -iMax2;
                        if (k0(this.W, i12, getHeight())) {
                            this.W.onAbsorb(i12);
                            iMax2 = 0;
                        }
                    }
                    i5 = 0;
                }
                bx3 bx3Var = this.r0;
                int i13 = 1;
                if (iMax != 0 || iMax2 != 0) {
                    int i14 = -i4;
                    iMax = Math.max(i14, Math.min(iMax, i4));
                    iMax2 = Math.max(i14, Math.min(iMax2, i4));
                    o0(1);
                    bx3Var.a(iMax, iMax2);
                }
                if (i10 != 0 || i5 != 0) {
                    float f = i10;
                    float f2 = i5;
                    if (!dispatchNestedPreFling(f, f2)) {
                        boolean z4 = zD || zE;
                        dispatchNestedFling(f, f2, z4);
                        pw3 pw3Var = this.l0;
                        if (pw3Var != null) {
                            xg0 xg0Var = (xg0) pw3Var;
                            mw3 layoutManager = xg0Var.a.getLayoutManager();
                            if (layoutManager == 0 || xg0Var.a.getAdapter() == null || ((Math.abs(i5) <= (minFlingVelocity = xg0Var.a.getMinFlingVelocity()) && Math.abs(i10) <= minFlingVelocity) || !(layoutManager instanceof xw3))) {
                                z = z4;
                                z2 = true;
                            } else {
                                View view = null;
                                switch (xg0Var.d) {
                                    case 1:
                                        if (!(layoutManager instanceof xw3)) {
                                            tc3Var = null;
                                        } else {
                                            tc3Var = new tc3(xg0Var, xg0Var.a.getContext(), i9);
                                        }
                                        break;
                                    default:
                                        if (!(layoutManager instanceof xw3)) {
                                            tc3Var = null;
                                        } else {
                                            tc3Var = new tc3(xg0Var, xg0Var.a.getContext(), i13);
                                        }
                                        break;
                                }
                                if (tc3Var == null) {
                                    z = z4;
                                    z2 = true;
                                } else {
                                    switch (xg0Var.d) {
                                        case 0:
                                            z = z4;
                                            z2 = true;
                                            if (!(layoutManager instanceof xw3) || (iD = layoutManager.D()) == 0 || (viewG = xg0Var.g(layoutManager)) == null || (I = mw3.I(viewG)) == -1 || (pointFA = ((xw3) layoutManager).a((i6 = iD - 1))) == null) {
                                                I2 = -1;
                                            } else {
                                                if (layoutManager.d()) {
                                                    i7 = 0;
                                                    iD2 = xg0Var.d(layoutManager, xg0Var.h(layoutManager), i10, 0);
                                                    if (pointFA.x < 0.0f) {
                                                        iD2 = -iD2;
                                                    }
                                                } else {
                                                    i7 = 0;
                                                    iD2 = 0;
                                                }
                                                if (layoutManager.e()) {
                                                    int iD3 = xg0Var.d(layoutManager, xg0Var.j(layoutManager), i7, i5);
                                                    i8 = pointFA.y < 0.0f ? -iD3 : iD3;
                                                } else {
                                                    i8 = 0;
                                                }
                                                if (layoutManager.e()) {
                                                    iD2 = i8;
                                                }
                                                if (iD2 != 0) {
                                                    int i15 = I + iD2;
                                                    if (i15 < 0) {
                                                        i15 = 0;
                                                    }
                                                    I2 = i15 < iD ? i15 : i6;
                                                } else {
                                                    I2 = -1;
                                                }
                                            }
                                            break;
                                        default:
                                            int iD4 = layoutManager.D();
                                            if (iD4 == 0) {
                                                z = z4;
                                                z2 = true;
                                                I2 = -1;
                                            } else {
                                                qz0 qz0VarK = layoutManager.e() ? xg0Var.k(layoutManager) : layoutManager.d() ? xg0Var.i(layoutManager) : null;
                                                if (qz0VarK != null) {
                                                    int iV = layoutManager.v();
                                                    z2 = true;
                                                    int i16 = Integer.MIN_VALUE;
                                                    int i17 = Integer.MAX_VALUE;
                                                    View view2 = null;
                                                    while (i9 < iV) {
                                                        View viewU = layoutManager.u(i9);
                                                        if (viewU == null) {
                                                            z3 = z4;
                                                        } else {
                                                            z3 = z4;
                                                            int iC = xg0.c(viewU, qz0VarK);
                                                            if (iC <= 0 && iC > i16) {
                                                                i16 = iC;
                                                                view2 = viewU;
                                                            }
                                                            if (iC >= 0 && iC < i17) {
                                                                i17 = iC;
                                                                view = viewU;
                                                            }
                                                        }
                                                        i9++;
                                                        z4 = z3;
                                                    }
                                                    z = z4;
                                                    boolean z5 = !layoutManager.d() ? i5 <= 0 : i10 <= 0;
                                                    if (z5 && view != null) {
                                                        I2 = mw3.I(view);
                                                        break;
                                                    } else if (!z5 && view2 != null) {
                                                        I2 = mw3.I(view2);
                                                        break;
                                                    } else {
                                                        if (z5) {
                                                            view = view2;
                                                        }
                                                        if (view != null) {
                                                            I2 = (((layoutManager instanceof xw3) && (pointFA2 = ((xw3) layoutManager).a(layoutManager.D() + (-1))) != null && ((pointFA2.x > 0.0f ? 1 : (pointFA2.x == 0.0f ? 0 : -1)) < 0 || (pointFA2.y > 0.0f ? 1 : (pointFA2.y == 0.0f ? 0 : -1)) < 0)) == z5 ? -1 : 1) + mw3.I(view);
                                                            if (I2 < 0 || I2 >= iD4) {
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    z = z4;
                                                    z2 = true;
                                                }
                                                I2 = -1;
                                            }
                                            break;
                                    }
                                    if (I2 != -1) {
                                        tc3Var.a = I2;
                                        layoutManager.D0(tc3Var);
                                        return z2;
                                    }
                                }
                            }
                        } else {
                            z = z4;
                            z2 = true;
                        }
                        if (!z) {
                            return false;
                        }
                        boolean z6 = z2;
                        o0(z6 ? 1 : 0);
                        int i18 = -i4;
                        bx3Var.a(Math.max(i18, Math.min(i10, i4)), Math.max(i18, Math.min(i5, i4)));
                        return z6;
                    }
                } else if (iMax != 0 || iMax2 != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int K(cx3 cx3Var) {
        if ((cx3Var.j & 524) == 0 && cx3Var.g()) {
            int i = cx3Var.c;
            ArrayList arrayList = (ArrayList) this.r.c;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                b6 b6Var = (b6) arrayList.get(i2);
                int i3 = b6Var.a;
                if (i3 != 1) {
                    if (i3 == 2) {
                        int i4 = b6Var.b;
                        if (i4 <= i) {
                            int i5 = b6Var.d;
                            if (i4 + i5 <= i) {
                                i -= i5;
                            }
                        } else {
                            continue;
                        }
                    } else if (i3 == 8) {
                        int i6 = b6Var.b;
                        if (i6 == i) {
                            i = b6Var.d;
                        } else {
                            if (i6 < i) {
                                i--;
                            }
                            if (b6Var.d <= i) {
                                i++;
                            }
                        }
                    }
                } else if (b6Var.b <= i) {
                    i += b6Var.d;
                }
            }
            return i;
        }
        return -1;
    }

    public final long L(cx3 cx3Var) {
        return this.z.o ? cx3Var.e : cx3Var.c;
    }

    public final cx3 M(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return N(view);
        }
        tb4.h("View ", view, " is not a direct child of ", this);
        return null;
    }

    public final Rect P(View view) {
        nw3 nw3Var = (nw3) view.getLayoutParams();
        boolean z = nw3Var.c;
        Rect rect = nw3Var.b;
        if (z) {
            yw3 yw3Var = this.u0;
            if (!yw3Var.g || (!nw3Var.a.m() && !nw3Var.a.h())) {
                rect.set(0, 0, 0, 0);
                ArrayList arrayList = this.C;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    Rect rect2 = this.w;
                    rect2.set(0, 0, 0, 0);
                    ((kw3) arrayList.get(i)).f(rect2, view, this, yw3Var);
                    rect.left += rect2.left;
                    rect.top += rect2.top;
                    rect.right += rect2.right;
                    rect.bottom += rect2.bottom;
                }
                nw3Var.c = false;
                return rect;
            }
        }
        return rect;
    }

    public final boolean Q() {
        return !this.H || this.Q || this.r.m();
    }

    public final boolean R() {
        return this.S > 0;
    }

    public final void S(int i) {
        if (this.A == null) {
            return;
        }
        setScrollState(2);
        this.A.s0(i);
        awakenScrollBars();
    }

    public final void T() {
        ew4 ew4Var = this.s;
        int iK = ew4Var.k();
        for (int i = 0; i < iK; i++) {
            ((nw3) ew4Var.j(i).getLayoutParams()).c = true;
        }
        ArrayList arrayList = (ArrayList) this.p.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            nw3 nw3Var = (nw3) ((cx3) arrayList.get(i2)).a.getLayoutParams();
            if (nw3Var != null) {
                nw3Var.c = true;
            }
        }
    }

    public final void U(int i, int i2, boolean z) {
        int i3 = i + i2;
        ew4 ew4Var = this.s;
        int iK = ew4Var.k();
        for (int i4 = 0; i4 < iK; i4++) {
            cx3 cx3VarN = N(ew4Var.j(i4));
            if (cx3VarN != null && !cx3VarN.q()) {
                int i5 = cx3VarN.c;
                yw3 yw3Var = this.u0;
                if (i5 >= i3) {
                    if (Q0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i4 + " holder " + cx3VarN + " now at position " + (cx3VarN.c - i2));
                    }
                    cx3VarN.n(-i2, z);
                    yw3Var.f = true;
                } else if (i5 >= i) {
                    if (Q0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i4 + " holder " + cx3VarN + " now REMOVED");
                    }
                    cx3VarN.a(8);
                    cx3VarN.n(-i2, z);
                    cx3VarN.c = i - 1;
                    yw3Var.f = true;
                }
            }
        }
        hm2 hm2Var = this.p;
        ArrayList arrayList = (ArrayList) hm2Var.f;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            cx3 cx3Var = (cx3) arrayList.get(size);
            if (cx3Var != null) {
                int i6 = cx3Var.c;
                if (i6 >= i3) {
                    if (Q0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + cx3Var + " now at position " + (cx3Var.c - i2));
                    }
                    cx3Var.n(-i2, z);
                } else if (i6 >= i) {
                    cx3Var.a(8);
                    hm2Var.g(size);
                }
            }
        }
        requestLayout();
    }

    public final void V() {
        this.S++;
    }

    public final void W(boolean z) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.S - 1;
        this.S = i2;
        if (i2 < 1) {
            if (P0 && i2 < 0) {
                kf2.o("layout or scroll counter cannot go below zero.Some calls are not matching".concat(C()));
                return;
            }
            this.S = 0;
            if (z) {
                int i3 = this.M;
                this.M = 0;
                if (i3 != 0 && (accessibilityManager = this.O) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.H0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    cx3 cx3Var = (cx3) arrayList.get(size);
                    if (cx3Var.a.getParent() == this && !cx3Var.q() && (i = cx3Var.q) != -1) {
                        cx3Var.a.setImportantForAccessibility(i);
                        cx3Var.q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void X(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.e0) {
            int i = actionIndex == 0 ? 1 : 0;
            this.e0 = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.i0 = x;
            this.g0 = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.j0 = y;
            this.h0 = y;
        }
    }

    public final void Y() {
        if (this.A0 || !this.F) {
            return;
        }
        WeakHashMap weakHashMap = j65.a;
        postOnAnimation(this.I0);
        this.A0 = true;
    }

    public final void Z() {
        boolean z;
        boolean z2 = this.Q;
        c6 c6Var = this.r;
        boolean z3 = false;
        if (z2) {
            c6Var.t((ArrayList) c6Var.c);
            c6Var.t((ArrayList) c6Var.d);
            c6Var.a = 0;
            if (this.R) {
                this.A.a0();
            }
        }
        if (this.c0 != null && this.A.E0()) {
            c6Var.s();
        } else {
            c6Var.e();
        }
        boolean z4 = this.x0 || this.y0;
        boolean z5 = this.H && this.c0 != null && ((z = this.Q) || z4 || this.A.f) && (!z || this.z.o);
        yw3 yw3Var = this.u0;
        yw3Var.j = z5;
        if (z5 && z4 && !this.Q && this.c0 != null && this.A.E0()) {
            z3 = true;
        }
        yw3Var.k = z3;
    }

    public final void a0(boolean z) {
        this.R = z | this.R;
        this.Q = true;
        ew4 ew4Var = this.s;
        int iK = ew4Var.k();
        for (int i = 0; i < iK; i++) {
            cx3 cx3VarN = N(ew4Var.j(i));
            if (cx3VarN != null && !cx3VarN.q()) {
                cx3VarN.a(6);
            }
        }
        T();
        hm2 hm2Var = this.p;
        ArrayList arrayList = (ArrayList) hm2Var.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            cx3 cx3Var = (cx3) arrayList.get(i2);
            if (cx3Var != null) {
                cx3Var.a(6);
                cx3Var.a(1024);
            }
        }
        dw3 dw3Var = ((RecyclerView) hm2Var.h).z;
        if (dw3Var == null || !dw3Var.o) {
            hm2Var.f();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        mw3 mw3Var = this.A;
        if (mw3Var != null) {
            mw3Var.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    public final void b0(cx3 cx3Var, n50 n50Var) {
        cx3Var.j &= -8193;
        boolean z = this.u0.h;
        rm3 rm3Var = this.t;
        if (z && cx3Var.m() && !cx3Var.j() && !cx3Var.q()) {
            ((xe2) rm3Var.o).f(L(cx3Var), cx3Var);
        }
        yd4 yd4Var = (yd4) rm3Var.n;
        r65 r65VarA = (r65) yd4Var.get(cx3Var);
        if (r65VarA == null) {
            r65VarA = r65.a();
            yd4Var.put(cx3Var, r65VarA);
        }
        r65VarA.b = n50Var;
        r65VarA.a |= 4;
    }

    public final void c0() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.V;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.V.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.W;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.W.isFinished();
        }
        EdgeEffect edgeEffect3 = this.a0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.a0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.b0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.b0.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof nw3) && this.A.f((nw3) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        mw3 mw3Var = this.A;
        if (mw3Var != null && mw3Var.d()) {
            return this.A.j(this.u0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        mw3 mw3Var = this.A;
        if (mw3Var != null && mw3Var.d()) {
            return this.A.k(this.u0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        mw3 mw3Var = this.A;
        if (mw3Var != null && mw3Var.d()) {
            return this.A.l(this.u0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        mw3 mw3Var = this.A;
        if (mw3Var != null && mw3Var.e()) {
            return this.A.m(this.u0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        mw3 mw3Var = this.A;
        if (mw3Var != null && mw3Var.e()) {
            return this.A.n(this.u0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        mw3 mw3Var = this.A;
        if (mw3Var != null && mw3Var.e()) {
            return this.A.o(this.u0);
        }
        return 0;
    }

    public final int d0(int i, float f) {
        float height = f / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.V;
        float f2 = 0.0f;
        if (edgeEffect == null || xl.q(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.a0;
            if (edgeEffect2 != null && xl.q(edgeEffect2) != 0.0f) {
                boolean zCanScrollHorizontally = canScrollHorizontally(1);
                EdgeEffect edgeEffect3 = this.a0;
                if (zCanScrollHorizontally) {
                    edgeEffect3.onRelease();
                } else {
                    float fC = xl.C(edgeEffect3, width, height);
                    if (xl.q(this.a0) == 0.0f) {
                        this.a0.onRelease();
                    }
                    f2 = fC;
                }
                invalidate();
            }
        } else {
            boolean zCanScrollHorizontally2 = canScrollHorizontally(-1);
            EdgeEffect edgeEffect4 = this.V;
            if (zCanScrollHorizontally2) {
                edgeEffect4.onRelease();
            } else {
                float f3 = -xl.C(edgeEffect4, -width, 1.0f - height);
                if (xl.q(this.V) == 0.0f) {
                    this.V.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getWidth());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        mw3 layoutManager = getLayoutManager();
        int iA = 0;
        if (layoutManager != null) {
            if (layoutManager.e()) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 92 || keyCode == 93) {
                    int measuredHeight = getMeasuredHeight();
                    if (keyCode == 93) {
                        l0(0, measuredHeight, false);
                        return true;
                    }
                    l0(0, -measuredHeight, false);
                    return true;
                }
                if (keyCode == 122 || keyCode == 123) {
                    boolean zN = layoutManager.N();
                    if (keyCode == 122) {
                        if (zN) {
                            iA = getAdapter().a();
                        }
                    } else if (!zN) {
                        iA = getAdapter().a();
                    }
                    m0(iA);
                    return true;
                }
            } else if (layoutManager.d()) {
                int keyCode2 = keyEvent.getKeyCode();
                if (keyCode2 == 92 || keyCode2 == 93) {
                    int measuredWidth = getMeasuredWidth();
                    if (keyCode2 == 93) {
                        l0(measuredWidth, 0, false);
                        return true;
                    }
                    l0(-measuredWidth, 0, false);
                    return true;
                }
                if (keyCode2 == 122 || keyCode2 == 123) {
                    boolean zN2 = layoutManager.N();
                    if (keyCode2 == 122) {
                        if (zN2) {
                            iA = getAdapter().a();
                        }
                    } else if (!zN2) {
                        iA = getAdapter().a();
                    }
                    m0(iA);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().d(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        ArrayList arrayList = this.C;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((kw3) arrayList.get(i)).h(canvas, this);
        }
        EdgeEffect edgeEffect = this.V;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.u ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.V;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.W;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.u) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.W;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.a0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.u ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.a0;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.b0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.u) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.b0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if ((z || this.c0 == null || arrayList.size() <= 0 || !this.c0.f()) ? z : true) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final int e0(int i, float f) {
        float width = f / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.W;
        float f2 = 0.0f;
        if (edgeEffect == null || xl.q(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.b0;
            if (edgeEffect2 != null && xl.q(edgeEffect2) != 0.0f) {
                boolean zCanScrollVertically = canScrollVertically(1);
                EdgeEffect edgeEffect3 = this.b0;
                if (zCanScrollVertically) {
                    edgeEffect3.onRelease();
                } else {
                    float fC = xl.C(edgeEffect3, height, 1.0f - width);
                    if (xl.q(this.b0) == 0.0f) {
                        this.b0.onRelease();
                    }
                    f2 = fC;
                }
                invalidate();
            }
        } else {
            boolean zCanScrollVertically2 = canScrollVertically(-1);
            EdgeEffect edgeEffect4 = this.W;
            if (zCanScrollVertically2) {
                edgeEffect4.onRelease();
            } else {
                float f3 = -xl.C(edgeEffect4, -height, width);
                if (xl.q(this.W) == 0.0f) {
                    this.W.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getHeight());
    }

    public final void f0(kw3 kw3Var) {
        mw3 mw3Var = this.A;
        if (mw3Var != null) {
            mw3Var.c("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.C;
        arrayList.remove(kw3Var);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        T();
        requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0158 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x015a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x015c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x015e  */
    /* JADX WARN: Code duplicated, block: B:114:0x0162  */
    /* JADX WARN: Code duplicated, block: B:116:0x0166 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x0169  */
    /* JADX WARN: Code duplicated, block: B:120:0x0184 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x0187 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:124:0x018a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:126:0x018d  */
    /* JADX WARN: Code duplicated, block: B:127:0x018f  */
    /* JADX WARN: Code duplicated, block: B:128:0x0191  */
    /* JADX WARN: Code duplicated, block: B:131:0x0195  */
    /* JADX WARN: Code duplicated, block: B:132:0x0197  */
    /* JADX WARN: Code duplicated, block: B:133:0x0199  */
    /* JADX WARN: Code duplicated, block: B:24:0x004c  */
    /* JADX WARN: Code duplicated, block: B:80:0x0112  */
    /* JADX WARN: Code duplicated, block: B:81:0x0114  */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0166, code lost:
    
        if (r16 > 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0184, code lost:
    
        if (r5 > 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0187, code lost:
    
        if (r16 < 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x018a, code lost:
    
        if (r5 < 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0192, code lost:
    
        if ((r5 * r6) <= 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x019a, code lost:
    
        if ((r5 * r6) >= 0) goto L136;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:118:0x0169, please report this as an issue */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View focusSearch(View view, int i) {
        View viewU;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        byte b;
        boolean z;
        this.A.getClass();
        boolean z2 = (this.z == null || this.A == null || R() || this.K) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        yw3 yw3Var = this.u0;
        hm2 hm2Var = this.p;
        if (z2 && (i == 2 || i == 1)) {
            if (this.A.e()) {
                if (focusFinder.findNextFocus(this, view, i == 2 ? 130 : 33) == null) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (!z && this.A.d()) {
                z = focusFinder.findNextFocus(this, view, (this.A.b.getLayoutDirection() == 1) ^ (i == 2) ? 66 : 17) == null;
            }
            if (z) {
                p();
                if (E(view) != null) {
                    n0();
                    this.A.U(view, i, hm2Var, yw3Var);
                    p0(false);
                }
                return null;
            }
            viewU = focusFinder.findNextFocus(this, view, i);
            if (viewU == null) {
            }
            if (viewU != null) {
                if (view != null) {
                    int width = view.getWidth();
                    int height = view.getHeight();
                    Rect rect = this.w;
                    rect.set(0, 0, width, height);
                    int width2 = viewU.getWidth();
                    int height2 = viewU.getHeight();
                    Rect rect2 = this.x;
                    rect2.set(0, 0, width2, height2);
                    offsetDescendantRectToMyCoords(view, rect);
                    offsetDescendantRectToMyCoords(viewU, rect2);
                    if (this.A.b.getLayoutDirection() == 1) {
                        i2 = -1;
                    } else {
                        i2 = 1;
                    }
                    i3 = rect.left;
                    i4 = rect2.left;
                    int i7 = i3 < i4 ? 1 : 1;
                    i5 = rect.top;
                    i6 = rect2.top;
                    b = i5 < i6 ? (byte) 1 : (byte) 1;
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 17) {
                                if (i != 33) {
                                    if (i != 66) {
                                        if (i == 130) {
                                            throw new IllegalArgumentException("Invalid direction: " + i + C());
                                        }
                                    }
                                }
                            }
                        } else if (b <= 0) {
                            if (b == 0) {
                            }
                        }
                    } else if (b >= 0) {
                        if (b == 0) {
                        }
                    }
                }
                return viewU;
            }
            return super.focusSearch(view, i);
        }
        View viewFindNextFocus = focusFinder.findNextFocus(this, view, i);
        if (viewFindNextFocus == null && z2) {
            p();
            if (E(view) != null) {
                n0();
                viewU = this.A.U(view, i, hm2Var, yw3Var);
                p0(false);
            }
            return null;
        }
        viewU = viewFindNextFocus;
        if (viewU == null && !viewU.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i);
            }
            g0(viewU, null);
            return view;
        }
        if (viewU != null && viewU != this && viewU != view && E(viewU) != null) {
            if (view != null && E(view) != null) {
                int width3 = view.getWidth();
                int height3 = view.getHeight();
                Rect rect3 = this.w;
                rect3.set(0, 0, width3, height3);
                int width4 = viewU.getWidth();
                int height4 = viewU.getHeight();
                Rect rect4 = this.x;
                rect4.set(0, 0, width4, height4);
                offsetDescendantRectToMyCoords(view, rect3);
                offsetDescendantRectToMyCoords(viewU, rect4);
                if (this.A.b.getLayoutDirection() == 1) {
                    i2 = -1;
                } else {
                    i2 = 1;
                }
                i3 = rect3.left;
                i4 = rect4.left;
                if ((i3 < i4 && rect3.right > i4) || rect3.right >= rect4.right) {
                    int i8 = rect3.right;
                    int i9 = rect4.right;
                    i7 = ((i8 > i9 || i3 >= i9) && i3 > i4) ? -1 : 0;
                }
                i5 = rect3.top;
                i6 = rect4.top;
                if ((i5 < i6 && rect3.bottom > i6) || rect3.bottom >= rect4.bottom) {
                    int i10 = rect3.bottom;
                    int i11 = rect4.bottom;
                    b = ((i10 > i11 || i5 >= i11) && i5 > i6) ? (byte) -1 : (byte) 0;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 17) {
                            if (i != 33) {
                                if (i != 66) {
                                    if (i == 130) {
                                        throw new IllegalArgumentException("Invalid direction: " + i + C());
                                    }
                                }
                            }
                        }
                    } else if (b <= 0) {
                        if (b == 0) {
                        }
                    }
                } else if (b >= 0) {
                    if (b == 0) {
                    }
                }
            }
            return viewU;
        }
        return super.focusSearch(view, i);
    }

    public final void g0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.w;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof nw3) {
            nw3 nw3Var = (nw3) layoutParams;
            if (!nw3Var.c) {
                Rect rect2 = nw3Var.b;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.A.p0(this, view, this.w, !this.H, view2 == null);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        mw3 mw3Var = this.A;
        if (mw3Var != null) {
            return mw3Var.r();
        }
        kf2.o("RecyclerView has no LayoutManager".concat(C()));
        return null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        mw3 mw3Var = this.A;
        if (mw3Var != null) {
            return mw3Var.s(getContext(), attributeSet);
        }
        kf2.o("RecyclerView has no LayoutManager".concat(C()));
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public dw3 getAdapter() {
        return this.z;
    }

    @Override // android.view.View
    public int getBaseline() {
        mw3 mw3Var = this.A;
        if (mw3Var == null) {
            return super.getBaseline();
        }
        mw3Var.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.u;
    }

    public ex3 getCompatAccessibilityDelegate() {
        return this.B0;
    }

    public iw3 getEdgeEffectFactory() {
        return this.U;
    }

    public jw3 getItemAnimator() {
        return this.c0;
    }

    public int getItemDecorationCount() {
        return this.C.size();
    }

    public mw3 getLayoutManager() {
        return this.A;
    }

    public int getMaxFlingVelocity() {
        return this.n0;
    }

    public int getMinFlingVelocity() {
        return this.m0;
    }

    public long getNanoTime() {
        if (U0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public pw3 getOnFlingListener() {
        return this.l0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.q0;
    }

    public tw3 getRecycledViewPool() {
        return this.p.c();
    }

    public int getScrollState() {
        return this.d0;
    }

    public final void h(cx3 cx3Var) {
        View view = cx3Var.a;
        boolean z = view.getParent() == this;
        this.p.l(M(view));
        boolean zL = cx3Var.l();
        ew4 ew4Var = this.s;
        if (zL) {
            ew4Var.e(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            ew4Var.d(view, -1, true);
            return;
        }
        int iIndexOfChild = ((RecyclerView) ((rm2) ew4Var.p).o).indexOfChild(view);
        if (iIndexOfChild < 0) {
            mj0.l(view, "view is not a child, cannot hide ");
        } else {
            ((e20) ew4Var.q).A(iIndexOfChild);
            ew4Var.l(view);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00fe A[DONT_INVERT, PHI: r7
  0x00fe: PHI (r7v9 boolean) = (r7v7 boolean), (r7v10 boolean) binds: [B:33:0x00e5, B:31:0x00e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x0100  */
    /* JADX WARN: Code duplicated, block: B:40:0x0108  */
    /* JADX WARN: Code duplicated, block: B:43:0x0111  */
    public final boolean h0(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        boolean z2;
        boolean z3;
        p();
        dw3 dw3Var = this.z;
        int[] iArr = this.G0;
        if (dw3Var != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            i0(i, i2, iArr);
            i4 = iArr[0];
            i5 = iArr[1];
            i6 = i - i4;
            i7 = i2 - i5;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (!this.C.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        w(i4, i5, i6, i7, this.E0, i3, iArr);
        int i8 = iArr[0];
        int i9 = i6 - i8;
        int i10 = iArr[1];
        int i11 = i7 - i10;
        boolean z4 = (i8 == 0 && i10 == 0) ? false : true;
        int i12 = this.i0;
        int[] iArr2 = this.E0;
        int i13 = iArr2[0];
        this.i0 = i12 - i13;
        int i14 = this.j0;
        int i15 = iArr2[1];
        this.j0 = i14 - i15;
        int[] iArr3 = this.F0;
        iArr3[0] = iArr3[0] + i13;
        iArr3[1] = iArr3[1] + i15;
        if (getOverScrollMode() != 2) {
            if (motionEvent == null || zz1.u(motionEvent, 8194)) {
                z = true;
                z2 = false;
            } else {
                float x = motionEvent.getX();
                float f = i9;
                float y = motionEvent.getY();
                float f2 = i11;
                if (f < 0.0f) {
                    z();
                    z = true;
                    z2 = false;
                    xl.C(this.V, (-f) / getWidth(), 1.0f - (y / getHeight()));
                } else {
                    z = true;
                    z2 = false;
                    if (f > 0.0f) {
                        A();
                        xl.C(this.a0, f / getWidth(), y / getHeight());
                    } else {
                        z3 = false;
                    }
                    if (f2 < 0.0f) {
                        B();
                        xl.C(this.W, (-f2) / getHeight(), x / getWidth());
                    } else if (f2 > 0.0f) {
                        y();
                        xl.C(this.b0, f2 / getHeight(), 1.0f - (x / getWidth()));
                    } else {
                        if (z3 || f != 0.0f || f2 != 0.0f) {
                            postInvalidateOnAnimation();
                        }
                        if (Build.VERSION.SDK_INT >= 31 && zz1.u(motionEvent, 4194304)) {
                            c0();
                        }
                    }
                    z3 = z;
                    if (z3) {
                        postInvalidateOnAnimation();
                    } else {
                        postInvalidateOnAnimation();
                    }
                    if (Build.VERSION.SDK_INT >= 31) {
                        c0();
                    }
                }
                z3 = z;
                if (f2 < 0.0f) {
                    B();
                    xl.C(this.W, (-f2) / getHeight(), x / getWidth());
                } else if (f2 > 0.0f) {
                    y();
                    xl.C(this.b0, f2 / getHeight(), 1.0f - (x / getWidth()));
                } else {
                    if (z3) {
                        postInvalidateOnAnimation();
                    } else {
                        postInvalidateOnAnimation();
                    }
                    if (Build.VERSION.SDK_INT >= 31) {
                        c0();
                    }
                }
                z3 = z;
                if (z3) {
                    postInvalidateOnAnimation();
                } else {
                    postInvalidateOnAnimation();
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    c0();
                }
            }
            n(i, i2);
        } else {
            z = true;
            z2 = false;
        }
        if (i4 != 0 || i5 != 0) {
            x(i4, i5);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z4 && i4 == 0 && i5 == 0) ? z2 : z;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(kw3 kw3Var) {
        mw3 mw3Var = this.A;
        if (mw3Var != null) {
            mw3Var.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.C;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(kw3Var);
        T();
        requestLayout();
    }

    public final void i0(int i, int i2, int[] iArr) {
        cx3 cx3Var;
        n0();
        V();
        Trace.beginSection("RV Scroll");
        yw3 yw3Var = this.u0;
        D(yw3Var);
        hm2 hm2Var = this.p;
        int iR0 = i != 0 ? this.A.r0(i, hm2Var, yw3Var) : 0;
        int iT0 = i2 != 0 ? this.A.t0(i2, hm2Var, yw3Var) : 0;
        Trace.endSection();
        ew4 ew4Var = this.s;
        int iH = ew4Var.h();
        for (int i3 = 0; i3 < iH; i3++) {
            View viewG = ew4Var.g(i3);
            cx3 cx3VarM = M(viewG);
            if (cx3VarM != null && (cx3Var = cx3VarM.i) != null) {
                View view = cx3Var.a;
                int left = viewG.getLeft();
                int top = viewG.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        W(true);
        p0(false);
        if (iArr != null) {
            iArr[0] = iR0;
            iArr[1] = iT0;
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.F;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.K;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public final void j(rw3 rw3Var) {
        if (this.w0 == null) {
            this.w0 = new ArrayList();
        }
        this.w0.add(rw3Var);
    }

    public final void j0(int i) {
        if (this.K) {
            return;
        }
        r0();
        mw3 mw3Var = this.A;
        if (mw3Var == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            mw3Var.s0(i);
            awakenScrollBars();
        }
    }

    public final void k(String str) {
        if (!R()) {
            if (this.T > 0) {
                Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(C()));
            }
        } else if (str == null) {
            kf2.o("Cannot call this method while RecyclerView is computing a layout or scrolling".concat(C()));
        } else {
            kf2.o(str);
        }
    }

    public final boolean k0(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        float fQ = xl.q(edgeEffect) * i2;
        float fAbs = Math.abs(-i) * 0.35f;
        float f = this.n * 0.015f;
        double dLog = Math.log(fAbs / f);
        double d = S0;
        return ((float) (Math.exp((d / (d - 1.0d)) * dLog) * ((double) f))) < fQ;
    }

    public final void l0(int i, int i2, boolean z) {
        mw3 mw3Var = this.A;
        if (mw3Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.K) {
            return;
        }
        if (!mw3Var.d()) {
            i = 0;
        }
        if (!this.A.e()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (z) {
            int i3 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i3 |= 2;
            }
            getScrollingChildHelper().g(i3, 1);
        }
        this.r0.c(i, i2, Integer.MIN_VALUE, null);
    }

    public final void m() {
        ew4 ew4Var = this.s;
        int iK = ew4Var.k();
        for (int i = 0; i < iK; i++) {
            cx3 cx3VarN = N(ew4Var.j(i));
            if (!cx3VarN.q()) {
                cx3VarN.d = -1;
                cx3VarN.g = -1;
            }
        }
        hm2 hm2Var = this.p;
        ArrayList arrayList = (ArrayList) hm2Var.d;
        ArrayList arrayList2 = (ArrayList) hm2Var.f;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            cx3 cx3Var = (cx3) arrayList2.get(i2);
            cx3Var.d = -1;
            cx3Var.g = -1;
        }
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            cx3 cx3Var2 = (cx3) arrayList.get(i3);
            cx3Var2.d = -1;
            cx3Var2.g = -1;
        }
        ArrayList arrayList3 = (ArrayList) hm2Var.e;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                cx3 cx3Var3 = (cx3) ((ArrayList) hm2Var.e).get(i4);
                cx3Var3.d = -1;
                cx3Var3.g = -1;
            }
        }
    }

    public final void m0(int i) {
        if (this.K) {
            return;
        }
        mw3 mw3Var = this.A;
        if (mw3Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            mw3Var.C0(this, i);
        }
    }

    public final void n(int i, int i2) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.V;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            zIsFinished = false;
        } else {
            this.V.onRelease();
            zIsFinished = this.V.isFinished();
        }
        EdgeEffect edgeEffect2 = this.a0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.a0.onRelease();
            zIsFinished |= this.a0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.W;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.W.onRelease();
            zIsFinished |= this.W.isFinished();
        }
        EdgeEffect edgeEffect4 = this.b0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.b0.onRelease();
            zIsFinished |= this.b0.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    public final void n0() {
        int i = this.I + 1;
        this.I = i;
        if (i != 1 || this.K) {
            return;
        }
        this.J = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o0(int i) {
        boolean zD = this.A.d();
        int i2 = zD;
        if (this.A.e()) {
            i2 = (zD ? 1 : 0) | 2;
        }
        getScrollingChildHelper().g(i2, i);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.S = 0;
        this.F = true;
        this.H = this.H && !isLayoutRequested();
        this.p.d();
        mw3 mw3Var = this.A;
        if (mw3Var != null) {
            mw3Var.g = true;
        }
        this.A0 = false;
        if (U0) {
            ThreadLocal threadLocal = yg1.r;
            yg1 yg1Var = (yg1) threadLocal.get();
            this.s0 = yg1Var;
            if (yg1Var == null) {
                this.s0 = new yg1();
                WeakHashMap weakHashMap = j65.a;
                Display display = getDisplay();
                if (isInEditMode() || display == null) {
                    refreshRate = 60.0f;
                } else {
                    refreshRate = display.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                }
                yg1 yg1Var2 = this.s0;
                yg1Var2.p = (long) (1.0E9f / refreshRate);
                threadLocal.set(yg1Var2);
            }
            ArrayList arrayList = this.s0.n;
            if (P0 && arrayList.contains(this)) {
                kf2.o("RecyclerView already present in worker list!");
            } else {
                arrayList.add(this);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        yg1 yg1Var;
        super.onDetachedFromWindow();
        jw3 jw3Var = this.c0;
        if (jw3Var != null) {
            jw3Var.e();
        }
        r0();
        int i = 0;
        this.F = false;
        mw3 mw3Var = this.A;
        if (mw3Var != null) {
            mw3Var.g = false;
            mw3Var.T(this);
        }
        this.H0.clear();
        removeCallbacks(this.I0);
        this.t.getClass();
        while (r65.d.b() != null) {
        }
        hm2 hm2Var = this.p;
        ArrayList arrayList = (ArrayList) hm2Var.f;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            wr1.g(((cx3) arrayList.get(i2)).a);
        }
        hm2Var.e(((RecyclerView) hm2Var.h).z, false);
        while (i < getChildCount()) {
            int i3 = i + 1;
            View childAt = getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            ArrayList arrayList2 = wr1.A(childAt).a;
            for (int iE = gb.E(arrayList2); -1 < iE; iE--) {
                ((k65) arrayList2.get(iE)).a.d();
            }
            i = i3;
        }
        if (!U0 || (yg1Var = this.s0) == null) {
            return;
        }
        boolean zRemove = yg1Var.n.remove(this);
        if (!P0 || zRemove) {
            this.s0 = null;
        } else {
            kf2.o("RecyclerView removal failed!");
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.C;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((kw3) arrayList.get(i)).g(canvas, this);
        }
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue;
        int i;
        boolean z;
        if (this.A != null && !this.K && motionEvent.getAction() == 8) {
            float f = 0.0f;
            if ((motionEvent.getSource() & 2) != 0) {
                float f2 = this.A.e() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.A.d() ? motionEvent.getAxisValue(10) : 0.0f;
                i = 0;
                z = false;
                f = f2;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                axisValue = motionEvent.getAxisValue(26);
                if (this.A.e()) {
                    float f3 = -axisValue;
                    axisValue = 0.0f;
                    f = f3;
                } else if (!this.A.d()) {
                    axisValue = 0.0f;
                }
                i = 26;
                z = this.M0;
            } else {
                axisValue = 0.0f;
                i = 0;
                z = false;
            }
            int i2 = (int) (f * this.p0);
            int i3 = (int) (axisValue * this.o0);
            if (z) {
                OverScroller overScroller = this.r0.p;
                l0((overScroller.getFinalX() - overScroller.getCurrX()) + i3, (overScroller.getFinalY() - overScroller.getCurrY()) + i2, true);
            } else {
                mw3 mw3Var = this.A;
                if (mw3Var == null) {
                    Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                } else if (!this.K) {
                    int[] iArr = this.G0;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    boolean zD = mw3Var.d();
                    boolean zE = this.A.e();
                    int i4 = zE ? (zD ? 1 : 0) | 2 : zD ? 1 : 0;
                    float y = motionEvent.getY();
                    float x = motionEvent.getX();
                    int iD0 = i3 - d0(i3, y);
                    int iE0 = i2 - e0(i2, x);
                    getScrollingChildHelper().g(i4, 1);
                    if (v(zD ? iD0 : 0, zE ? iE0 : 0, 1, this.G0, this.E0)) {
                        iD0 -= iArr[0];
                        iE0 -= iArr[1];
                    }
                    h0(zD ? iD0 : 0, zE ? iE0 : 0, motionEvent, 1);
                    yg1 yg1Var = this.s0;
                    if (yg1Var != null && (iD0 != 0 || iE0 != 0)) {
                        yg1Var.a(this, iD0, iE0);
                    }
                    q0(1);
                }
            }
            if (i != 0 && !z) {
                this.O0.a(motionEvent, i);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (!this.K) {
            this.E = null;
            if (F(motionEvent)) {
                VelocityTracker velocityTracker = this.f0;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
                q0(0);
                c0();
                setScrollState(0);
                return true;
            }
            mw3 mw3Var = this.A;
            if (mw3Var != null) {
                boolean zD = mw3Var.d();
                boolean zE = this.A.e();
                if (this.f0 == null) {
                    this.f0 = VelocityTracker.obtain();
                }
                this.f0.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.L) {
                        this.L = false;
                    }
                    this.e0 = motionEvent.getPointerId(0);
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.i0 = x;
                    this.g0 = x;
                    int y = (int) (motionEvent.getY() + 0.5f);
                    this.j0 = y;
                    this.h0 = y;
                    EdgeEffect edgeEffect = this.V;
                    if (edgeEffect == null || xl.q(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                        z = false;
                    } else {
                        xl.C(this.V, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                        z = true;
                    }
                    EdgeEffect edgeEffect2 = this.a0;
                    if (edgeEffect2 != null && xl.q(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
                        xl.C(this.a0, 0.0f, motionEvent.getY() / getHeight());
                        z = true;
                    }
                    EdgeEffect edgeEffect3 = this.W;
                    if (edgeEffect3 != null && xl.q(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
                        xl.C(this.W, 0.0f, motionEvent.getX() / getWidth());
                        z = true;
                    }
                    EdgeEffect edgeEffect4 = this.b0;
                    if (edgeEffect4 != null && xl.q(edgeEffect4) != 0.0f && !canScrollVertically(1)) {
                        xl.C(this.b0, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                        z = true;
                    }
                    if (z || this.d0 == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        q0(1);
                    }
                    int[] iArr = this.F0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    o0(0);
                } else if (actionMasked == 1) {
                    this.f0.clear();
                    q0(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.e0);
                    if (iFindPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.e0 + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    if (this.d0 != 1) {
                        int i = x2 - this.g0;
                        int i2 = y2 - this.h0;
                        if (!zD || Math.abs(i) <= this.k0) {
                            z2 = false;
                        } else {
                            this.i0 = x2;
                            z2 = true;
                        }
                        if (zE && Math.abs(i2) > this.k0) {
                            this.j0 = y2;
                            z2 = true;
                        }
                        if (z2) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    VelocityTracker velocityTracker2 = this.f0;
                    if (velocityTracker2 != null) {
                        velocityTracker2.clear();
                    }
                    q0(0);
                    c0();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.e0 = motionEvent.getPointerId(actionIndex);
                    int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.i0 = x3;
                    this.g0 = x3;
                    int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.j0 = y3;
                    this.h0 = y3;
                } else if (actionMasked == 6) {
                    X(motionEvent);
                }
                if (this.d0 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("RV OnLayout");
        s();
        Trace.endSection();
        this.H = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        mw3 mw3Var = this.A;
        if (mw3Var == null) {
            q(i, i2);
            return;
        }
        boolean zM = mw3Var.M();
        boolean z = false;
        yw3 yw3Var = this.u0;
        if (zM) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.A.b.q(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.J0 = z;
            if (z || this.z == null) {
                return;
            }
            if (yw3Var.d == 1) {
                t();
            }
            this.A.v0(i, i2);
            yw3Var.i = true;
            u();
            this.A.x0(i, i2);
            if (this.A.A0()) {
                this.A.v0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                yw3Var.i = true;
                u();
                this.A.x0(i, i2);
            }
            this.K0 = getMeasuredWidth();
            this.L0 = getMeasuredHeight();
            return;
        }
        if (this.G) {
            this.A.b.q(i, i2);
            return;
        }
        if (this.N) {
            n0();
            V();
            Z();
            W(true);
            if (yw3Var.k) {
                yw3Var.g = true;
            } else {
                this.r.e();
                yw3Var.g = false;
            }
            this.N = false;
            p0(false);
        } else if (yw3Var.k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        dw3 dw3Var = this.z;
        if (dw3Var != null) {
            yw3Var.e = dw3Var.a();
        } else {
            yw3Var.e = 0;
        }
        n0();
        this.A.b.q(i, i2);
        p0(false);
        yw3Var.g = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (R()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof vw3)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        vw3 vw3Var = (vw3) parcelable;
        this.q = vw3Var;
        super.onRestoreInstanceState(vw3Var.n);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        vw3 vw3Var = new vw3(super.onSaveInstanceState());
        vw3 vw3Var2 = this.q;
        if (vw3Var2 != null) {
            vw3Var.p = vw3Var2.p;
            return vw3Var;
        }
        mw3 mw3Var = this.A;
        if (mw3Var != null) {
            vw3Var.p = mw3Var.h0();
            return vw3Var;
        }
        vw3Var.p = null;
        return vw3Var;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.b0 = null;
        this.W = null;
        this.a0 = null;
        this.V = null;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x010f A[PHI: r1
  0x010f: PHI (r1v46 int) = (r1v30 int), (r1v50 int) binds: [B:56:0x00fa, B:61:0x010b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zF;
        boolean z;
        if (!this.K && !this.L) {
            qw3 qw3Var = this.E;
            if (qw3Var == null) {
                zF = motionEvent.getAction() == 0 ? false : F(motionEvent);
            } else {
                qw3Var.a(motionEvent);
                int action = motionEvent.getAction();
                if (action == 3 || action == 1) {
                    this.E = null;
                }
                zF = true;
            }
            if (zF) {
                VelocityTracker velocityTracker = this.f0;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
                q0(0);
                c0();
                setScrollState(0);
                return true;
            }
            mw3 mw3Var = this.A;
            if (mw3Var != null) {
                boolean zD = mw3Var.d();
                boolean zE = this.A.e();
                if (this.f0 == null) {
                    this.f0 = VelocityTracker.obtain();
                }
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                int[] iArr = this.F0;
                if (actionMasked == 0) {
                    iArr[1] = 0;
                    iArr[0] = 0;
                }
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                motionEventObtain.offsetLocation(iArr[0], iArr[1]);
                if (actionMasked != 0) {
                    if (actionMasked == 1) {
                        this.f0.addMovement(motionEventObtain);
                        VelocityTracker velocityTracker2 = this.f0;
                        int i = this.n0;
                        velocityTracker2.computeCurrentVelocity(1000, i);
                        float f = zD ? -this.f0.getXVelocity(this.e0) : 0.0f;
                        float f2 = zE ? -this.f0.getYVelocity(this.e0) : 0.0f;
                        if ((f == 0.0f && f2 == 0.0f) || !J((int) f, (int) f2, this.m0, i)) {
                            setScrollState(0);
                        }
                        VelocityTracker velocityTracker3 = this.f0;
                        if (velocityTracker3 != null) {
                            velocityTracker3.clear();
                        }
                        q0(0);
                        c0();
                    } else if (actionMasked == 2) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(this.e0);
                        if (iFindPointerIndex < 0) {
                            Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.e0 + " not found. Did any MotionEvents get skipped?");
                            return false;
                        }
                        int x = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                        int y = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                        int iMax = this.i0 - x;
                        int iMax2 = this.j0 - y;
                        if (this.d0 != 1) {
                            if (zD) {
                                int i2 = this.k0;
                                iMax = iMax > 0 ? Math.max(0, iMax - i2) : Math.min(0, iMax + i2);
                                if (iMax != 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            } else {
                                z = false;
                            }
                            if (zE) {
                                int i3 = this.k0;
                                iMax2 = iMax2 > 0 ? Math.max(0, iMax2 - i3) : Math.min(0, iMax2 + i3);
                                if (iMax2 != 0) {
                                    z = true;
                                }
                            }
                            if (z) {
                                setScrollState(1);
                            }
                        }
                        if (this.d0 == 1) {
                            int[] iArr2 = this.G0;
                            iArr2[0] = 0;
                            iArr2[1] = 0;
                            int iD0 = iMax - d0(iMax, motionEvent.getY());
                            int iE0 = iMax2 - e0(iMax2, motionEvent.getX());
                            boolean zV = v(zD ? iD0 : 0, zE ? iE0 : 0, 0, this.G0, this.E0);
                            int[] iArr3 = this.E0;
                            if (zV) {
                                iD0 -= iArr2[0];
                                iE0 -= iArr2[1];
                                iArr[0] = iArr[0] + iArr3[0];
                                iArr[1] = iArr[1] + iArr3[1];
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            int i4 = iD0;
                            int i5 = iE0;
                            this.i0 = x - iArr3[0];
                            this.j0 = y - iArr3[1];
                            if (h0(zD ? i4 : 0, zE ? i5 : 0, motionEvent, 0)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            yg1 yg1Var = this.s0;
                            if (yg1Var != null && (i4 != 0 || i5 != 0)) {
                                yg1Var.a(this, i4, i5);
                            }
                        }
                    } else if (actionMasked == 3) {
                        VelocityTracker velocityTracker4 = this.f0;
                        if (velocityTracker4 != null) {
                            velocityTracker4.clear();
                        }
                        q0(0);
                        c0();
                        setScrollState(0);
                    } else if (actionMasked == 5) {
                        this.e0 = motionEvent.getPointerId(actionIndex);
                        int x2 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.i0 = x2;
                        this.g0 = x2;
                        int y2 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.j0 = y2;
                        this.h0 = y2;
                    } else if (actionMasked == 6) {
                        X(motionEvent);
                    }
                    motionEventObtain.recycle();
                    return true;
                }
                this.e0 = motionEvent.getPointerId(0);
                int x3 = (int) (motionEvent.getX() + 0.5f);
                this.i0 = x3;
                this.g0 = x3;
                int y3 = (int) (motionEvent.getY() + 0.5f);
                this.j0 = y3;
                this.h0 = y3;
                o0(0);
                this.f0.addMovement(motionEventObtain);
                motionEventObtain.recycle();
                return true;
            }
        }
        return false;
    }

    public final void p() {
        if (!this.H || this.Q) {
            Trace.beginSection("RV FullInvalidate");
            s();
            Trace.endSection();
            return;
        }
        c6 c6Var = this.r;
        if (c6Var.m()) {
            int i = c6Var.a;
            if ((i & 4) == 0 || (i & 11) != 0) {
                if (c6Var.m()) {
                    Trace.beginSection("RV FullInvalidate");
                    s();
                    Trace.endSection();
                    return;
                }
                return;
            }
            Trace.beginSection("RV PartialInvalidate");
            n0();
            V();
            c6Var.s();
            if (!this.J) {
                ew4 ew4Var = this.s;
                int iH = ew4Var.h();
                for (int i2 = 0; i2 < iH; i2++) {
                    cx3 cx3VarN = N(ew4Var.g(i2));
                    if (cx3VarN != null && !cx3VarN.q() && cx3VarN.m()) {
                        s();
                    }
                }
                c6Var.d();
            }
            p0(true);
            W(true);
            Trace.endSection();
        }
    }

    public final void p0(boolean z) {
        if (this.I < 1) {
            if (P0) {
                kf2.o("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.".concat(C()));
                return;
            }
            this.I = 1;
        }
        if (!z && !this.K) {
            this.J = false;
        }
        if (this.I == 1) {
            if (z && this.J && !this.K && this.A != null && this.z != null) {
                s();
            }
            if (!this.K) {
                this.J = false;
            }
        }
        this.I--;
    }

    public final void q(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = j65.a;
        setMeasuredDimension(mw3.g(i, paddingRight, getMinimumWidth()), mw3.g(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final void q0(int i) {
        getScrollingChildHelper().h(i);
    }

    public final void r(View view) {
        cx3 cx3VarN = N(view);
        dw3 dw3Var = this.z;
        if (dw3Var != null && cx3VarN != null) {
            dw3Var.m(cx3VarN);
        }
        ArrayList arrayList = this.P;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((ow3) this.P.get(size)).b(view);
            }
        }
    }

    public final void r0() {
        db2 db2Var;
        setScrollState(0);
        bx3 bx3Var = this.r0;
        bx3Var.t.removeCallbacks(bx3Var);
        bx3Var.p.abortAnimation();
        mw3 mw3Var = this.A;
        if (mw3Var == null || (db2Var = mw3Var.e) == null) {
            return;
        }
        db2Var.i();
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        cx3 cx3VarN = N(view);
        if (cx3VarN != null) {
            if (cx3VarN.l()) {
                cx3VarN.j &= -257;
            } else if (!cx3VarN.q()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(cx3VarN);
                kf2.g(C(), sb);
                return;
            }
        } else if (P0) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            kf2.g(C(), sb2);
            return;
        }
        view.clearAnimation();
        r(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        db2 db2Var = this.A.e;
        if ((db2Var == null || !db2Var.e) && !R() && view2 != null) {
            g0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.A.p0(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.D;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((qw3) arrayList.get(i)).e(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.I != 0 || this.K) {
            this.J = true;
        } else {
            super.requestLayout();
        }
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0277  */
    /* JADX WARN: Code duplicated, block: B:163:0x0348  */
    /* JADX WARN: Code duplicated, block: B:182:0x0388  */
    /* JADX WARN: Code duplicated, block: B:184:0x038b  */
    /* JADX WARN: Code duplicated, block: B:190:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:192:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:195:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:198:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:201:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:204:0x03c4 A[LOOP:4: B:197:0x03b1->B:204:0x03c4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:207:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:210:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:213:0x03e2 A[LOOP:5: B:206:0x03cf->B:213:0x03e2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:215:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:243:0x03c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:0x03c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x03c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:0x03e5 A[EDGE_INSN: B:246:0x03e5->B:214:0x03e5 BREAK  A[LOOP:5: B:206:0x03cf->B:213:0x03e2], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:0x03e0 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void s() {
        boolean z;
        long j;
        cx3 cx3Var;
        int i;
        int iB;
        int i2;
        int iMin;
        cx3 cx3VarI;
        View view;
        cx3 cx3VarI2;
        View view2;
        int i3;
        View viewFindViewById;
        View view3;
        boolean z2;
        yd4 yd4Var;
        n50 n50Var;
        boolean zG;
        boolean z3;
        if (this.z == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.A == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        yw3 yw3Var = this.u0;
        boolean z4 = false;
        yw3Var.i = false;
        boolean z5 = true;
        Object[] objArr = this.J0 && !(this.K0 == getWidth() && this.L0 == getHeight());
        this.K0 = 0;
        this.L0 = 0;
        this.J0 = false;
        if (yw3Var.d == 1) {
            t();
            this.A.u0(this);
            u();
        } else {
            c6 c6Var = this.r;
            if ((((ArrayList) c6Var.d).isEmpty() || ((ArrayList) c6Var.c).isEmpty()) && !objArr == true && this.A.n == getWidth() && this.A.o == getHeight()) {
                this.A.u0(this);
            } else {
                this.A.u0(this);
                u();
            }
        }
        yw3Var.a(4);
        n0();
        V();
        yw3Var.d = 1;
        boolean z6 = yw3Var.j;
        ew4 ew4Var = this.s;
        hm2 hm2Var = this.p;
        rm3 rm3Var = this.t;
        if (z6) {
            int iH = ew4Var.h() - 1;
            while (iH >= 0) {
                cx3 cx3VarN = N(ew4Var.g(iH));
                if (cx3VarN.q()) {
                    z3 = z5;
                } else {
                    long jL = L(cx3VarN);
                    this.c0.getClass();
                    n50 n50Var2 = new n50();
                    n50Var2.b(cx3VarN);
                    xe2 xe2Var = (xe2) rm3Var.o;
                    z3 = z5;
                    yd4 yd4Var2 = (yd4) rm3Var.n;
                    cx3 cx3Var2 = (cx3) xe2Var.b(jL);
                    if (cx3Var2 == null || cx3Var2.q()) {
                        rm3Var.y(cx3VarN, n50Var2);
                    } else {
                        r65 r65Var = (r65) yd4Var2.get(cx3Var2);
                        boolean z7 = (r65Var == null || (r65Var.a & 1) == 0) ? z4 : z3;
                        r65 r65Var2 = (r65) yd4Var2.get(cx3VarN);
                        boolean z8 = (r65Var2 == null || (r65Var2.a & 1) == 0) ? z4 : z3;
                        if (z7 && cx3Var2 == cx3VarN) {
                            rm3Var.y(cx3VarN, n50Var2);
                        } else {
                            n50 n50VarK = rm3Var.K(cx3Var2, 4);
                            rm3Var.y(cx3VarN, n50Var2);
                            n50 n50VarK2 = rm3Var.K(cx3VarN, 8);
                            if (n50VarK == null) {
                                int iH2 = ew4Var.h();
                                for (int i4 = 0; i4 < iH2; i4++) {
                                    cx3 cx3VarN2 = N(ew4Var.g(i4));
                                    if (cx3VarN2 != cx3VarN && L(cx3VarN2) == jL) {
                                        dw3 dw3Var = this.z;
                                        if (dw3Var == null || !dw3Var.o) {
                                            StringBuilder sb = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                                            sb.append(cx3VarN2);
                                            sb.append(" \n View Holder 2:");
                                            sb.append(cx3VarN);
                                            nz2.m(C(), sb);
                                            return;
                                        }
                                        StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                                        sb2.append(cx3VarN2);
                                        sb2.append(" \n View Holder 2:");
                                        sb2.append(cx3VarN);
                                        nz2.m(C(), sb2);
                                        return;
                                    }
                                }
                                Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + cx3Var2 + " cannot be found but it is necessary for " + cx3VarN + C());
                            } else {
                                cx3Var2.p(false);
                                if (z7) {
                                    h(cx3Var2);
                                }
                                if (cx3Var2 != cx3VarN) {
                                    if (z8) {
                                        h(cx3VarN);
                                    }
                                    cx3Var2.h = cx3VarN;
                                    h(cx3Var2);
                                    hm2Var.l(cx3Var2);
                                    cx3VarN.p(false);
                                    cx3VarN.i = cx3Var2;
                                }
                                if (this.c0.a(cx3Var2, cx3VarN, n50VarK, n50VarK2)) {
                                    Y();
                                }
                            }
                        }
                    }
                }
                iH--;
                z5 = z3;
                z4 = false;
            }
            z = z5;
            yd4 yd4Var3 = (yd4) rm3Var.n;
            int i5 = yd4Var3.p - 1;
            while (i5 >= 0) {
                cx3 cx3Var3 = (cx3) yd4Var3.f(i5);
                r65 r65Var3 = (r65) yd4Var3.h(i5);
                int i6 = r65Var3.a;
                int i7 = i6 & 3;
                cw3 cw3Var = this.N0;
                if (i7 == 3) {
                    RecyclerView recyclerView = cw3Var.a;
                    recyclerView.A.n0(cx3Var3.a, recyclerView.p);
                } else if ((i6 & 1) != 0) {
                    n50 n50Var3 = r65Var3.b;
                    if (n50Var3 == null) {
                        RecyclerView recyclerView2 = cw3Var.a;
                        recyclerView2.A.n0(cx3Var3.a, recyclerView2.p);
                    } else {
                        cw3Var.b(cx3Var3, n50Var3, r65Var3.c);
                    }
                } else if ((i6 & 14) == 14) {
                    cw3Var.a(cx3Var3, r65Var3.b, r65Var3.c);
                } else {
                    if ((i6 & 12) == 12) {
                        n50 n50Var4 = r65Var3.b;
                        n50 n50Var5 = r65Var3.c;
                        cw3Var.getClass();
                        cx3Var3.p(false);
                        RecyclerView recyclerView3 = cw3Var.a;
                        boolean z9 = recyclerView3.Q;
                        jw3 jw3Var = recyclerView3.c0;
                        if (!z9) {
                            pl0 pl0Var = (pl0) jw3Var;
                            pl0Var.getClass();
                            int i8 = n50Var4.a;
                            int i9 = n50Var5.a;
                            if (i8 == i9) {
                                yd4Var = yd4Var3;
                                if (n50Var4.b == n50Var5.b) {
                                    pl0Var.c(cx3Var3);
                                    zG = false;
                                }
                                if (zG) {
                                    recyclerView3.Y();
                                }
                            } else {
                                yd4Var = yd4Var3;
                            }
                            zG = pl0Var.g(cx3Var3, i8, n50Var4.b, i9, n50Var5.b);
                            if (zG) {
                                recyclerView3.Y();
                            }
                        } else if (jw3Var.a(cx3Var3, cx3Var3, n50Var4, n50Var5)) {
                            recyclerView3.Y();
                        }
                        n50Var = null;
                    } else {
                        yd4Var = yd4Var3;
                        if ((i6 & 4) != 0) {
                            n50Var = null;
                            cw3Var.b(cx3Var3, r65Var3.b, null);
                        } else {
                            n50Var = null;
                            if ((i6 & 8) != 0) {
                                cw3Var.a(cx3Var3, r65Var3.b, r65Var3.c);
                            }
                        }
                    }
                    r65Var3.a = 0;
                    r65Var3.b = n50Var;
                    r65Var3.c = n50Var;
                    r65.d.a(r65Var3);
                    i5--;
                    yd4Var3 = yd4Var;
                }
                yd4Var = yd4Var3;
                n50Var = null;
                r65Var3.a = 0;
                r65Var3.b = n50Var;
                r65Var3.c = n50Var;
                r65.d.a(r65Var3);
                i5--;
                yd4Var3 = yd4Var;
            }
        } else {
            z = true;
        }
        View view4 = null;
        this.A.m0(hm2Var);
        yw3Var.b = yw3Var.e;
        this.Q = false;
        this.R = false;
        yw3Var.j = false;
        yw3Var.k = false;
        this.A.f = false;
        ArrayList arrayList = (ArrayList) hm2Var.e;
        if (arrayList != null) {
            arrayList.clear();
        }
        mw3 mw3Var = this.A;
        if (mw3Var.k) {
            mw3Var.j = 0;
            mw3Var.k = false;
            hm2Var.m();
        }
        this.A.f0(yw3Var);
        boolean z10 = z;
        W(z10);
        p0(false);
        ((yd4) rm3Var.n).clear();
        ((xe2) rm3Var.o).a();
        int[] iArr = this.C0;
        int i10 = iArr[0];
        int i11 = iArr[z10 ? 1 : 0];
        G(iArr);
        if (iArr[0] != i10 || iArr[z10 ? 1 : 0] != i11) {
            x(0, 0);
        }
        if (this.q0 && this.z != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (isFocused()) {
                j = yw3Var.m;
                if (j == -1) {
                    cx3Var = null;
                } else {
                    cx3Var = null;
                }
                if (cx3Var != null) {
                    view3 = cx3Var.a;
                    if (!((ArrayList) ew4Var.r).contains(view3)) {
                        if (ew4Var.h() > 0) {
                            i = yw3Var.l;
                            if (i == -1) {
                                i = 0;
                            }
                            iB = yw3Var.b();
                            i2 = i;
                            while (true) {
                                if (i2 < iB) {
                                    cx3VarI2 = I(i2);
                                    if (cx3VarI2 != null) {
                                        view2 = cx3VarI2.a;
                                        if (view2.hasFocusable()) {
                                            view4 = view2;
                                        } else {
                                            i2++;
                                        }
                                    }
                                }
                                for (iMin = Math.min(iB, i) - 1; iMin >= 0; iMin--) {
                                    cx3VarI = I(iMin);
                                    if (cx3VarI == null) {
                                        break;
                                        break;
                                    }
                                    view = cx3VarI.a;
                                    if (view.hasFocusable()) {
                                        view4 = view;
                                        break;
                                    }
                                }
                            }
                        }
                    } else if (ew4Var.h() > 0) {
                        i = yw3Var.l;
                        if (i == -1) {
                            i = 0;
                        }
                        iB = yw3Var.b();
                        i2 = i;
                        while (true) {
                            if (i2 < iB) {
                                cx3VarI2 = I(i2);
                                if (cx3VarI2 != null) {
                                    view2 = cx3VarI2.a;
                                    if (view2.hasFocusable()) {
                                        view4 = view2;
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                            while (iMin >= 0) {
                                cx3VarI = I(iMin);
                                if (cx3VarI == null) {
                                    break;
                                    break;
                                }
                                view = cx3VarI.a;
                                if (view.hasFocusable()) {
                                    view4 = view;
                                    break;
                                }
                            }
                        }
                    }
                } else if (ew4Var.h() > 0) {
                    i = yw3Var.l;
                    if (i == -1) {
                        i = 0;
                    }
                    iB = yw3Var.b();
                    i2 = i;
                    while (true) {
                        if (i2 < iB) {
                            cx3VarI2 = I(i2);
                            if (cx3VarI2 != null) {
                                view2 = cx3VarI2.a;
                                if (view2.hasFocusable()) {
                                    view4 = view2;
                                } else {
                                    i2++;
                                }
                            }
                        }
                        while (iMin >= 0) {
                            cx3VarI = I(iMin);
                            if (cx3VarI == null) {
                                break;
                                break;
                            }
                            view = cx3VarI.a;
                            if (view.hasFocusable()) {
                                view4 = view;
                                break;
                            }
                        }
                    }
                }
                if (view4 != null) {
                    i3 = yw3Var.n;
                    if (i3 != -1) {
                        view4 = viewFindViewById;
                    }
                    view4.requestFocus();
                }
            } else if (((ArrayList) ew4Var.r).contains(getFocusedChild())) {
                j = yw3Var.m;
                if (j == -1 && (z2 = this.z.o) && z2) {
                    int iK = ew4Var.k();
                    cx3Var = null;
                    for (int i12 = 0; i12 < iK; i12++) {
                        cx3 cx3VarN3 = N(ew4Var.j(i12));
                        if (cx3VarN3 != null && !cx3VarN3.j() && cx3VarN3.e == j) {
                            if (!((ArrayList) ew4Var.r).contains(cx3VarN3.a)) {
                                cx3Var = cx3VarN3;
                                break;
                            }
                            cx3Var = cx3VarN3;
                        }
                    }
                } else {
                    cx3Var = null;
                }
                if (cx3Var != null) {
                    view3 = cx3Var.a;
                    if (!((ArrayList) ew4Var.r).contains(view3) && view3.hasFocusable()) {
                        view4 = view3;
                    } else if (ew4Var.h() > 0) {
                        i = yw3Var.l;
                        if (i == -1) {
                            i = 0;
                        }
                        iB = yw3Var.b();
                        i2 = i;
                        while (true) {
                            if (i2 < iB) {
                                cx3VarI2 = I(i2);
                                if (cx3VarI2 != null) {
                                    view2 = cx3VarI2.a;
                                    if (view2.hasFocusable()) {
                                        view4 = view2;
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                            while (iMin >= 0) {
                                cx3VarI = I(iMin);
                                if (cx3VarI == null) {
                                    break;
                                }
                                view = cx3VarI.a;
                                if (view.hasFocusable()) {
                                    view4 = view;
                                    break;
                                }
                            }
                        }
                    }
                } else if (ew4Var.h() > 0) {
                    i = yw3Var.l;
                    if (i == -1) {
                        i = 0;
                    }
                    iB = yw3Var.b();
                    i2 = i;
                    while (true) {
                        if (i2 < iB) {
                            cx3VarI2 = I(i2);
                            if (cx3VarI2 != null) {
                                view2 = cx3VarI2.a;
                                if (view2.hasFocusable()) {
                                    view4 = view2;
                                } else {
                                    i2++;
                                }
                            }
                        }
                        while (iMin >= 0) {
                            cx3VarI = I(iMin);
                            if (cx3VarI == null) {
                                break;
                                break;
                            }
                            view = cx3VarI.a;
                            if (view.hasFocusable()) {
                                view4 = view;
                                break;
                            }
                        }
                    }
                }
                if (view4 != null) {
                    i3 = yw3Var.n;
                    if (i3 != -1 && (viewFindViewById = view4.findViewById(i3)) != null && viewFindViewById.isFocusable()) {
                        view4 = viewFindViewById;
                    }
                    view4.requestFocus();
                }
            }
        }
        yw3Var.m = -1L;
        yw3Var.l = -1;
        yw3Var.n = -1;
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        mw3 mw3Var = this.A;
        if (mw3Var == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.K) {
            return;
        }
        boolean zD = mw3Var.d();
        boolean zE = this.A.e();
        if (zD || zE) {
            if (!zD) {
                i = 0;
            }
            if (!zE) {
                i2 = 0;
            }
            h0(i, i2, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!R()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.M |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(ex3 ex3Var) {
        this.B0 = ex3Var;
        j65.o(this, ex3Var);
    }

    public void setAdapter(dw3 dw3Var) {
        setLayoutFrozen(false);
        dw3 dw3Var2 = this.z;
        ce1 ce1Var = this.o;
        if (dw3Var2 != null) {
            dw3Var2.n.unregisterObserver(ce1Var);
            this.z.j(this);
        }
        jw3 jw3Var = this.c0;
        if (jw3Var != null) {
            jw3Var.e();
        }
        mw3 mw3Var = this.A;
        hm2 hm2Var = this.p;
        if (mw3Var != null) {
            mw3Var.l0(hm2Var);
            this.A.m0(hm2Var);
        }
        ((ArrayList) hm2Var.d).clear();
        hm2Var.f();
        c6 c6Var = this.r;
        c6Var.t((ArrayList) c6Var.c);
        c6Var.t((ArrayList) c6Var.d);
        c6Var.a = 0;
        dw3 dw3Var3 = this.z;
        this.z = dw3Var;
        if (dw3Var != null) {
            dw3Var.n.registerObserver(ce1Var);
            dw3Var.f(this);
        }
        mw3 mw3Var2 = this.A;
        if (mw3Var2 != null) {
            mw3Var2.S();
        }
        dw3 dw3Var4 = this.z;
        ((ArrayList) hm2Var.d).clear();
        hm2Var.f();
        hm2Var.e(dw3Var3, true);
        tw3 tw3VarC = hm2Var.c();
        if (dw3Var3 != null) {
            tw3VarC.b--;
        }
        if (tw3VarC.b == 0) {
            SparseArray sparseArray = tw3VarC.a;
            for (int i = 0; i < sparseArray.size(); i++) {
                sw3 sw3Var = (sw3) sparseArray.valueAt(i);
                ArrayList arrayList = sw3Var.a;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    wr1.g(((cx3) obj).a);
                }
                sw3Var.a.clear();
            }
        }
        if (dw3Var4 != null) {
            tw3VarC.b++;
        }
        hm2Var.d();
        this.u0.f = true;
        a0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(hw3 hw3Var) {
        if (hw3Var == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.u) {
            this.b0 = null;
            this.W = null;
            this.a0 = null;
            this.V = null;
        }
        this.u = z;
        super.setClipToPadding(z);
        if (this.H) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(iw3 iw3Var) {
        iw3Var.getClass();
        this.U = iw3Var;
        this.b0 = null;
        this.W = null;
        this.a0 = null;
        this.V = null;
    }

    public void setHasFixedSize(boolean z) {
        this.G = z;
    }

    public void setItemAnimator(jw3 jw3Var) {
        jw3 jw3Var2 = this.c0;
        if (jw3Var2 != null) {
            jw3Var2.e();
            this.c0.a = null;
        }
        this.c0 = jw3Var;
        if (jw3Var != null) {
            jw3Var.a = this.z0;
        }
    }

    public void setItemViewCacheSize(int i) {
        hm2 hm2Var = this.p;
        hm2Var.b = i;
        hm2Var.m();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(mw3 mw3Var) {
        RecyclerView recyclerView;
        if (mw3Var == this.A) {
            return;
        }
        r0();
        mw3 mw3Var2 = this.A;
        hm2 hm2Var = this.p;
        if (mw3Var2 != null) {
            jw3 jw3Var = this.c0;
            if (jw3Var != null) {
                jw3Var.e();
            }
            this.A.l0(hm2Var);
            this.A.m0(hm2Var);
            ((ArrayList) hm2Var.d).clear();
            hm2Var.f();
            if (this.F) {
                mw3 mw3Var3 = this.A;
                mw3Var3.g = false;
                mw3Var3.T(this);
            }
            this.A.y0(null);
            this.A = null;
        } else {
            ((ArrayList) hm2Var.d).clear();
            hm2Var.f();
        }
        ew4 ew4Var = this.s;
        ((e20) ew4Var.q).z();
        ArrayList arrayList = (ArrayList) ew4Var.r;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = (RecyclerView) ((rm2) ew4Var.p).o;
            if (size < 0) {
                break;
            }
            cx3 cx3VarN = N((View) arrayList.get(size));
            if (cx3VarN != null) {
                int i = cx3VarN.p;
                if (recyclerView.R()) {
                    cx3VarN.q = i;
                    recyclerView.H0.add(cx3VarN);
                } else {
                    cx3VarN.a.setImportantForAccessibility(i);
                }
                cx3VarN.p = 0;
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.A = mw3Var;
        if (mw3Var != null) {
            if (mw3Var.b != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(mw3Var);
                String strC = mw3Var.b.C();
                sb.append(" is already attached to a RecyclerView:");
                sb.append(strC);
                throw new IllegalArgumentException(sb.toString());
            }
            mw3Var.y0(this);
            if (this.F) {
                this.A.g = true;
            }
        }
        hm2Var.m();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
        } else {
            kf2.n("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        j53 scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.d) {
            ViewGroup viewGroup = scrollingChildHelper.c;
            WeakHashMap weakHashMap = j65.a;
            viewGroup.stopNestedScroll();
        }
        scrollingChildHelper.d = z;
    }

    public void setOnFlingListener(pw3 pw3Var) {
        this.l0 = pw3Var;
    }

    @Deprecated
    public void setOnScrollListener(rw3 rw3Var) {
        this.v0 = rw3Var;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.q0 = z;
    }

    public void setRecycledViewPool(tw3 tw3Var) {
        hm2 hm2Var = this.p;
        RecyclerView recyclerView = (RecyclerView) hm2Var.h;
        hm2Var.e(recyclerView.z, false);
        tw3 tw3Var2 = (tw3) hm2Var.g;
        if (tw3Var2 != null) {
            tw3Var2.b--;
        }
        hm2Var.g = tw3Var;
        if (tw3Var != null && recyclerView.getAdapter() != null) {
            ((tw3) hm2Var.g).b++;
        }
        hm2Var.d();
    }

    @Deprecated
    public void setRecyclerListener(uw3 uw3Var) {
    }

    public void setScrollState(int i) {
        db2 db2Var;
        if (i == this.d0) {
            return;
        }
        if (Q0) {
            StringBuilder sbJ = f34.j(i, "setting scroll state to ", " from ");
            sbJ.append(this.d0);
            Log.d("RecyclerView", sbJ.toString(), new Exception());
        }
        this.d0 = i;
        if (i != 2) {
            bx3 bx3Var = this.r0;
            bx3Var.t.removeCallbacks(bx3Var);
            bx3Var.p.abortAnimation();
            mw3 mw3Var = this.A;
            if (mw3Var != null && (db2Var = mw3Var.e) != null) {
                db2Var.i();
            }
        }
        mw3 mw3Var2 = this.A;
        if (mw3Var2 != null) {
            mw3Var2.i0(i);
        }
        rw3 rw3Var = this.v0;
        if (rw3Var != null) {
            rw3Var.a(this, i);
        }
        ArrayList arrayList = this.w0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((rw3) this.w0.get(size)).a(this, i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.k0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.k0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(ax3 ax3Var) {
        this.p.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.K) {
            k("Do not suppressLayout in layout or scroll");
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.K = true;
                this.L = true;
                r0();
                return;
            }
            this.K = false;
            if (this.J && this.A != null && this.z != null) {
                requestLayout();
            }
            this.J = false;
        }
    }

    public final void t() {
        r65 r65Var;
        View viewE;
        yw3 yw3Var = this.u0;
        yw3Var.a(1);
        D(yw3Var);
        yw3Var.i = false;
        n0();
        rm3 rm3Var = this.t;
        yd4 yd4Var = (yd4) rm3Var.n;
        yd4 yd4Var2 = (yd4) rm3Var.n;
        yd4Var.clear();
        xe2 xe2Var = (xe2) rm3Var.o;
        xe2Var.a();
        V();
        Z();
        cx3 cx3VarM = null;
        View focusedChild = (this.q0 && hasFocus() && this.z != null) ? getFocusedChild() : null;
        if (focusedChild != null && (viewE = E(focusedChild)) != null) {
            cx3VarM = M(viewE);
        }
        if (cx3VarM == null) {
            yw3Var.m = -1L;
            yw3Var.l = -1;
            yw3Var.n = -1;
        } else {
            yw3Var.m = this.z.o ? cx3VarM.e : -1L;
            yw3Var.l = this.Q ? -1 : cx3VarM.j() ? cx3VarM.d : cx3VarM.b();
            View focusedChild2 = cx3VarM.a;
            int id = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id = focusedChild2.getId();
                }
            }
            yw3Var.n = id;
        }
        yw3Var.h = yw3Var.j && this.y0;
        this.y0 = false;
        this.x0 = false;
        yw3Var.g = yw3Var.k;
        yw3Var.e = this.z.a();
        G(this.C0);
        boolean z = yw3Var.j;
        ew4 ew4Var = this.s;
        if (z) {
            int iH = ew4Var.h();
            for (int i = 0; i < iH; i++) {
                cx3 cx3VarN = N(ew4Var.g(i));
                if (!cx3VarN.q() && (!cx3VarN.h() || this.z.o)) {
                    jw3 jw3Var = this.c0;
                    jw3.b(cx3VarN);
                    cx3VarN.e();
                    jw3Var.getClass();
                    n50 n50Var = new n50();
                    n50Var.b(cx3VarN);
                    r65 r65VarA = (r65) yd4Var2.get(cx3VarN);
                    if (r65VarA == null) {
                        r65VarA = r65.a();
                        yd4Var2.put(cx3VarN, r65VarA);
                    }
                    r65VarA.b = n50Var;
                    r65VarA.a |= 4;
                    if (yw3Var.h && cx3VarN.m() && !cx3VarN.j() && !cx3VarN.q() && !cx3VarN.h()) {
                        xe2Var.f(L(cx3VarN), cx3VarN);
                    }
                }
            }
        }
        if (yw3Var.k) {
            int iK = ew4Var.k();
            for (int i2 = 0; i2 < iK; i2++) {
                cx3 cx3VarN2 = N(ew4Var.j(i2));
                if (P0 && cx3VarN2.c == -1 && !cx3VarN2.j()) {
                    kf2.o("view holder cannot have position -1 unless it is removed".concat(C()));
                    return;
                }
                if (!cx3VarN2.q() && cx3VarN2.d == -1) {
                    cx3VarN2.d = cx3VarN2.c;
                }
            }
            boolean z2 = yw3Var.f;
            yw3Var.f = false;
            this.A.e0(this.p, yw3Var);
            yw3Var.f = z2;
            for (int i3 = 0; i3 < ew4Var.h(); i3++) {
                cx3 cx3VarN3 = N(ew4Var.g(i3));
                if (!cx3VarN3.q() && ((r65Var = (r65) yd4Var2.get(cx3VarN3)) == null || (r65Var.a & 4) == 0)) {
                    jw3.b(cx3VarN3);
                    boolean z3 = (cx3VarN3.j & 8192) != 0;
                    jw3 jw3Var2 = this.c0;
                    cx3VarN3.e();
                    jw3Var2.getClass();
                    n50 n50Var2 = new n50();
                    n50Var2.b(cx3VarN3);
                    if (z3) {
                        b0(cx3VarN3, n50Var2);
                    } else {
                        r65 r65VarA2 = (r65) yd4Var2.get(cx3VarN3);
                        if (r65VarA2 == null) {
                            r65VarA2 = r65.a();
                            yd4Var2.put(cx3VarN3, r65VarA2);
                        }
                        r65VarA2.a |= 2;
                        r65VarA2.b = n50Var2;
                    }
                }
            }
            m();
        } else {
            m();
        }
        W(true);
        p0(false);
        yw3Var.d = 2;
    }

    public final void u() {
        n0();
        V();
        yw3 yw3Var = this.u0;
        yw3Var.a(6);
        this.r.e();
        yw3Var.e = this.z.a();
        yw3Var.c = 0;
        if (this.q != null) {
            dw3 dw3Var = this.z;
            int iW = xa3.w(dw3Var.p);
            if (iW == 1 ? dw3Var.a() > 0 : iW != 2) {
                Parcelable parcelable = this.q.p;
                if (parcelable != null) {
                    this.A.g0(parcelable);
                }
                this.q = null;
            }
        }
        yw3Var.g = false;
        this.A.e0(this.p, yw3Var);
        yw3Var.f = false;
        yw3Var.j = yw3Var.j && this.c0 != null;
        yw3Var.d = 4;
        W(true);
        p0(false);
    }

    public final boolean v(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i2, i3, iArr, iArr2);
    }

    public final void w(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().d(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public final void x(int i, int i2) {
        this.T++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        rw3 rw3Var = this.v0;
        if (rw3Var != null) {
            rw3Var.b(this, i, i2);
        }
        ArrayList arrayList = this.w0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((rw3) this.w0.get(size)).b(this, i, i2);
            }
        }
        this.T--;
    }

    public final void y() {
        if (this.b0 != null) {
            return;
        }
        ((zw3) this.U).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.b0 = edgeEffect;
        if (this.u) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void z() {
        if (this.V != null) {
            return;
        }
        ((zw3) this.U).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.V = edgeEffect;
        if (this.u) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        mw3 mw3Var = this.A;
        if (mw3Var != null) {
            return mw3Var.t(layoutParams);
        }
        kf2.o("RecyclerView has no LayoutManager".concat(C()));
        return null;
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, app.homemusic.R.attr.recyclerViewStyle);
    }

    public RecyclerView(Context context) {
        this(context, null);
    }
}
