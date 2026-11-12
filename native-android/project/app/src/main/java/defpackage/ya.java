package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import app.homemusic.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ya extends z2 implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {
    public static final h03 a0;
    public v3 A;
    public boolean B;
    public final i03 C;
    public final i03 D;
    public final mj4 E;
    public final mj4 F;
    public int G;
    public Integer H;
    public final qi I;
    public final aw J;
    public boolean K;
    public va L;
    public i03 M;
    public final j03 N;
    public final g03 O;
    public final g03 P;
    public final String Q;
    public final String R;
    public final yc5 S;
    public final i03 T;
    public j94 U;
    public boolean V;
    public final g03 W;
    public final a0 X;
    public final ArrayList Y;
    public final sa Z;
    public final ra q;
    public int r = Integer.MIN_VALUE;
    public final sa s;
    public final AccessibilityManager t;
    public long u;
    public List v;
    public final ua w;
    public int x;
    public int y;
    public v3 z;

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        h03 h03Var = c02.a;
        h03 h03Var2 = new h03(32);
        int i = h03Var2.b;
        if (i < 0) {
            kf2.h("");
            return;
        }
        int i2 = i + 32;
        int[] iArr2 = h03Var2.a;
        if (iArr2.length < i2) {
            h03Var2.a = Arrays.copyOf(iArr2, Math.max(i2, (iArr2.length * 3) / 2));
        }
        int[] iArr3 = h03Var2.a;
        int i3 = h03Var2.b;
        if (i != i3) {
            ti.Y(i2, i, i3, iArr3, iArr3);
        }
        ti.b0(i, 0, 12, iArr, iArr3);
        h03Var2.b += 32;
        a0 = h03Var2;
    }

    public ya(ra raVar) {
        this.q = raVar;
        int i = 0;
        this.s = new sa(this, i);
        Object systemService = raVar.getContext().getSystemService("accessibility");
        systemService.getClass();
        this.t = (AccessibilityManager) systemService;
        this.u = 100L;
        new Handler(Looper.getMainLooper());
        this.w = new ua(this, i);
        this.x = Integer.MIN_VALUE;
        this.y = Integer.MIN_VALUE;
        this.C = new i03();
        this.D = new i03();
        this.E = new mj4(0);
        this.F = new mj4(0);
        this.G = -1;
        this.I = new qi(0);
        this.J = su3.a(1, 6, null);
        this.K = true;
        i03 i03Var = f02.a;
        i03Var.getClass();
        this.M = i03Var;
        this.N = new j03();
        this.O = new g03();
        this.P = new g03();
        this.Q = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.R = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.S = new yc5(10);
        this.T = new i03();
        this.U = new j94(raVar.getSemanticsOwner().a(), i03Var);
        int i2 = a02.a;
        this.W = new g03();
        raVar.addOnAttachStateChangeListener(this);
        this.X = new a0(4, this);
        this.Y = new ArrayList();
        this.Z = new sa(this, 1);
    }

    public static /* synthetic */ void E(ya yaVar, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        yaVar.D(i, i2, num, null);
    }

    public static Rect L(ya4 ya4Var, float f, float f2) {
        if (!(ya4Var instanceof nb3) && !(ya4Var instanceof ob3)) {
            return null;
        }
        wv3 wv3VarS = ya4Var.s();
        return new Rect((int) (wv3VarS.a + f), (int) (wv3VarS.b + f2), (int) (wv3VarS.c + f), (int) (wv3VarS.d + f2));
    }

    public static float[] N(ya4 ya4Var) {
        if (!(ya4Var instanceof ob3)) {
            return null;
        }
        g34 g34Var = ((ob3) ya4Var).f;
        long j = g34Var.h;
        long j2 = g34Var.g;
        long j3 = g34Var.f;
        long j4 = g34Var.e;
        return new float[]{Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))};
    }

    public static Region O(ya4 ya4Var, float f, float f2) {
        if (ya4Var instanceof mb3) {
            mb3 mb3Var = (mb3) ya4Var;
            wv3 wv3VarE = mb3Var.s().e(f, f2);
            Region region = new Region(new Rect((int) (wv3VarE.a + 0.0f), (int) (wv3VarE.b + 0.0f), (int) (wv3VarE.c + 0.0f), (int) (wv3VarE.d + 0.0f)));
            Region region2 = new Region();
            nc ncVar = mb3Var.f;
            if (ncVar instanceof nc) {
                Path path = ncVar.a;
                path.offset(f, f2);
                region2.setPath(path, region);
                return region2;
            }
            er1.l("Unable to obtain android.graphics.Path");
        }
        return null;
    }

    public static CharSequence P(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i = 99999;
                }
                CharSequence charSequenceSubSequence = charSequence.subSequence(0, i);
                charSequenceSubSequence.getClass();
                return charSequenceSubSequence;
            }
        }
        return charSequence;
    }

    public static String t(i94 i94Var) {
        he heVar;
        if (i94Var != null) {
            e94 e94Var = i94Var.d;
            w03 w03Var = e94Var.n;
            p94 p94Var = n94.a;
            if (w03Var.c(p94Var)) {
                return gc2.a((List) e94Var.d(p94Var), ",", null, 62);
            }
            p94 p94Var2 = n94.D;
            if (w03Var.c(p94Var2)) {
                Object objG = w03Var.g(p94Var2);
                if (objG == null) {
                    objG = null;
                }
                he heVar2 = (he) objG;
                if (heVar2 != null) {
                    return heVar2.o;
                }
            } else {
                Object objG2 = w03Var.g(n94.z);
                if (objG2 == null) {
                    objG2 = null;
                }
                List list = (List) objG2;
                if (list != null && (heVar = (he) q40.x0(list)) != null) {
                    return heVar.o;
                }
            }
        }
        return null;
    }

    public static final boolean x(h64 h64Var, float f) {
        v82 v82Var = h64Var.a;
        if (f >= 0.0f || ((Number) v82Var.invoke()).floatValue() <= 0.0f) {
            return f > 0.0f && ((Number) v82Var.invoke()).floatValue() < ((Number) h64Var.b.invoke()).floatValue();
        }
        return true;
    }

    public static final boolean y(h64 h64Var) {
        v82 v82Var = h64Var.a;
        if (((Number) v82Var.invoke()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) v82Var.invoke()).floatValue();
        ((Number) h64Var.b.invoke()).floatValue();
        return false;
    }

    public static final boolean z(h64 h64Var) {
        v82 v82Var = h64Var.a;
        if (((Number) v82Var.invoke()).floatValue() < ((Number) h64Var.b.invoke()).floatValue()) {
            return true;
        }
        ((Number) v82Var.invoke()).floatValue();
        return false;
    }

    public final int A(int i) {
        if (i == this.q.getSemanticsOwner().a().f) {
            return -1;
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0088 A[LOOP:1: B:15:0x004c->B:28:0x0088, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x008b A[EDGE_INSN: B:44:0x008b->B:29:0x008b BREAK  A[LOOP:1: B:15:0x004c->B:28:0x0088], SYNTHETIC] */
    public final void B(i94 i94Var, j94 j94Var) {
        int[] iArr = m02.a;
        j03 j03Var = new j03();
        List listI = i94Var.i((4 & 1) != 0 ? !i94Var.b : false, (4 & 2) == 0);
        c72 c72Var = i94Var.c;
        int size = listI.size();
        for (int i = 0; i < size; i++) {
            i94 i94Var2 = (i94) listI.get(i);
            e02 e02VarS = s();
            int i2 = i94Var2.f;
            if (e02VarS.a(i2)) {
                if (!j94Var.b.c(i2)) {
                    w(c72Var);
                    return;
                }
                j03Var.a(i2);
            }
        }
        j03 j03Var2 = j94Var.b;
        int[] iArr2 = j03Var2.b;
        long[] jArr = j03Var2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i3 != length) {
                        break;
                        break;
                    }
                    i3++;
                } else {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128 && !j03Var.c(iArr2[(i3 << 3) + i5])) {
                            w(c72Var);
                            return;
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    } else if (i3 != length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        List listI2 = i94Var.i((4 & 1) != 0 ? !i94Var.b : false, (4 & 2) == 0);
        int size2 = listI2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            i94 i94Var3 = (i94) listI2.get(i6);
            j94 j94Var2 = (j94) this.T.b(i94Var3.f);
            if (j94Var2 != null && s().a(i94Var3.f)) {
                B(i94Var3, j94Var2);
            }
        }
    }

    public final boolean C(AccessibilityEvent accessibilityEvent) {
        if (!v()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.B = true;
        }
        try {
            return ((Boolean) this.s.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.B = false;
        }
    }

    public final boolean D(int i, int i2, Integer num, List list) {
        if (i == Integer.MIN_VALUE || !v()) {
            return false;
        }
        AccessibilityEvent accessibilityEventO = o(i, i2);
        if (num != null) {
            accessibilityEventO.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventO.setContentDescription(gc2.a(list, ",", null, 62));
        }
        return C(accessibilityEventO);
    }

    public final void F(String str, int i, int i2) {
        AccessibilityEvent accessibilityEventO = o(A(i), 32);
        accessibilityEventO.setContentChangeTypes(i2);
        if (str != null) {
            accessibilityEventO.getText().add(str);
        }
        C(accessibilityEventO);
    }

    public final void G(int i) {
        va vaVar = this.L;
        if (vaVar != null) {
            i94 i94Var = vaVar.a;
            if (i != i94Var.f) {
                return;
            }
            if (SystemClock.uptimeMillis() - vaVar.f <= 1000) {
                AccessibilityEvent accessibilityEventO = o(A(i94Var.f), 131072);
                accessibilityEventO.setFromIndex(vaVar.d);
                accessibilityEventO.setToIndex(vaVar.e);
                accessibilityEventO.setAction(vaVar.b);
                accessibilityEventO.setMovementGranularity(vaVar.c);
                accessibilityEventO.getText().add(t(i94Var));
                C(accessibilityEventO);
            }
        }
        this.L = null;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0253  */
    /* JADX WARN: Code duplicated, block: B:106:0x0260 A[LOOP:4: B:101:0x024f->B:106:0x0260, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x026e  */
    /* JADX WARN: Code duplicated, block: B:114:0x0282 A[LOOP:5: B:109:0x026a->B:114:0x0282, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:121:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:126:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:131:0x02da  */
    /* JADX WARN: Code duplicated, block: B:134:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:135:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:141:0x030c  */
    /* JADX WARN: Code duplicated, block: B:143:0x032f  */
    /* JADX WARN: Code duplicated, block: B:144:0x0349  */
    /* JADX WARN: Code duplicated, block: B:146:0x035d  */
    /* JADX WARN: Code duplicated, block: B:148:0x0363  */
    /* JADX WARN: Code duplicated, block: B:156:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:222:0x0491  */
    /* JADX WARN: Code duplicated, block: B:224:0x049d  */
    /* JADX WARN: Code duplicated, block: B:227:0x04ae A[LOOP:6: B:223:0x049b->B:227:0x04ae, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:231:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:234:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:238:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:264:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:285:0x0267 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:286:0x0269 A[EDGE_INSN: B:286:0x0269->B:108:0x0269 BREAK  A[LOOP:4: B:101:0x024f->B:106:0x0260], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:287:0x0287 A[EDGE_INSN: B:287:0x0287->B:116:0x0287 BREAK  A[LOOP:5: B:109:0x026a->B:114:0x0282], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:288:0x0285 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:289:0x04a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:290:0x04b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x0136  */
    /* JADX WARN: Code duplicated, block: B:54:0x013e  */
    /* JADX WARN: Code duplicated, block: B:56:0x014b  */
    /* JADX WARN: Code duplicated, block: B:57:0x014f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0159  */
    /* JADX WARN: Code duplicated, block: B:60:0x016a  */
    /* JADX WARN: Code duplicated, block: B:62:0x0174  */
    /* JADX WARN: Code duplicated, block: B:63:0x018b  */
    /* JADX WARN: Code duplicated, block: B:65:0x0193  */
    /* JADX WARN: Code duplicated, block: B:66:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:69:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:73:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:75:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:78:0x0202  */
    /* JADX WARN: Code duplicated, block: B:80:0x0213  */
    /* JADX WARN: Code duplicated, block: B:82:0x021b  */
    /* JADX WARN: Code duplicated, block: B:84:0x0221  */
    /* JADX WARN: Code duplicated, block: B:88:0x0228  */
    /* JADX WARN: Code duplicated, block: B:91:0x0230  */
    /* JADX WARN: Code duplicated, block: B:95:0x0237  */
    /* JADX WARN: Code duplicated, block: B:98:0x0249  */
    /* JADX WARN: Code duplicated, block: B:99:0x024b  */
    public final void H(e02 e02Var) {
        Integer num;
        Integer num2;
        ArrayList arrayList;
        int[] iArr;
        long[] jArr;
        int i;
        Integer num3;
        ArrayList arrayList2;
        int[] iArr2;
        long[] jArr2;
        int i2;
        int i3;
        Integer num4;
        e94 e94Var;
        int i4;
        i94 i94Var;
        boolean z;
        boolean z2;
        w03 w03Var;
        int i5;
        int i6;
        e94 e94Var2;
        Integer num5;
        ArrayList arrayList3;
        long j;
        int i7;
        Integer num6;
        int i8;
        int i9;
        i94 i94Var2;
        p64 p64Var;
        boolean z3;
        p94 p94Var;
        int i10;
        p94 p94Var2;
        String str;
        Integer num7;
        p94 p94Var3;
        int size;
        int i11;
        p64 p64Var2;
        Object objG;
        Object objG2;
        sf1 sf1Var;
        boolean z4;
        int i12;
        Object objG3;
        he heVar;
        String str2;
        Integer num8;
        Object objG4;
        he heVar2;
        Object objG5;
        CharSequence charSequence;
        CharSequence charSequenceP;
        int length;
        int length2;
        Integer num9;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean zC;
        boolean z5;
        boolean z6;
        Integer num10;
        AccessibilityEvent accessibilityEventP;
        Object objG6;
        String str3;
        boolean zC2;
        int i18;
        e02 e02Var2 = e02Var;
        Integer num11 = 64;
        ArrayList arrayList4 = this.Y;
        ArrayList arrayList5 = new ArrayList(arrayList4);
        arrayList4.clear();
        int[] iArr3 = e02Var2.b;
        long[] jArr3 = e02Var2.a;
        int i19 = 2;
        int length3 = jArr3.length - 2;
        int i20 = 0;
        Integer num12 = 0;
        if (length3 < 0) {
            return;
        }
        int i21 = 0;
        while (true) {
            long j2 = jArr3[i21];
            int i22 = i19;
            int i23 = length3;
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i24 = 8;
                int i25 = 8 - ((~(i21 - i23)) >>> 31);
                long j3 = j2;
                int i26 = i20;
                while (i26 < i25) {
                    if ((j3 & 255) < 128) {
                        int i27 = iArr3[(i21 << 3) + i26];
                        j94 j94Var = (j94) this.T.b(i27);
                        if (j94Var == null) {
                            i = i26;
                            num3 = num11;
                            arrayList2 = arrayList5;
                            iArr2 = iArr3;
                            jArr2 = jArr3;
                            i2 = i24;
                            i3 = i25;
                            num4 = num12;
                        } else {
                            e94 e94Var3 = j94Var.a;
                            w03 w03Var2 = e94Var3.n;
                            k94 k94Var = (k94) e02Var2.b(i27);
                            i94 i94Var3 = k94Var != null ? k94Var.a : null;
                            if (i94Var3 == null) {
                                throw xa3.l("no value for specified key");
                            }
                            int i28 = i24;
                            int i29 = i94Var3.f;
                            e94 e94Var4 = i94Var3.d;
                            iArr2 = iArr3;
                            w03 w03Var3 = e94Var4.n;
                            jArr2 = jArr3;
                            Object[] objArr = w03Var3.b;
                            Object[] objArr2 = w03Var3.c;
                            long[] jArr4 = w03Var3.a;
                            i = i26;
                            int length4 = jArr4.length - 2;
                            if (length4 >= 0) {
                                int i30 = i29;
                                z = false;
                                int i31 = 0;
                                while (true) {
                                    long j4 = jArr4[i31];
                                    i3 = i25;
                                    i94 i94Var4 = i94Var3;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i32 = 8 - ((~(i31 - length4)) >>> 31);
                                        int i33 = 0;
                                        while (i33 < i32) {
                                            if ((j4 & 255) < 128) {
                                                int i34 = (i31 << 3) + i33;
                                                Object obj = objArr[i34];
                                                int i35 = length4;
                                                Object obj2 = objArr2[i34];
                                                e94Var2 = e94Var3;
                                                p94 p94Var4 = (p94) obj;
                                                j = j4;
                                                p94 p94Var5 = n94.u;
                                                if (h12.c(p94Var4, p94Var5) || h12.c(p94Var4, n94.v)) {
                                                    int size2 = arrayList5.size();
                                                    int i36 = 0;
                                                    while (true) {
                                                        if (i36 >= size2) {
                                                            p64Var = null;
                                                            break;
                                                        }
                                                        int i37 = size2;
                                                        if (((p64) arrayList5.get(i36)).n == i27) {
                                                            p64Var = (p64) arrayList5.get(i36);
                                                            break;
                                                        } else {
                                                            i36++;
                                                            size2 = i37;
                                                        }
                                                    }
                                                    if (p64Var != null) {
                                                        z3 = false;
                                                    } else {
                                                        p64Var = new p64(i27, arrayList4);
                                                        z3 = true;
                                                    }
                                                    arrayList4.add(p64Var);
                                                } else {
                                                    z3 = false;
                                                }
                                                if (z3) {
                                                    p94Var = n94.d;
                                                    if (h12.c(p94Var4, p94Var)) {
                                                        obj2.getClass();
                                                        str3 = (String) obj2;
                                                        zC2 = w03Var2.c(p94Var);
                                                        i18 = i28;
                                                        if (zC2) {
                                                            F(str3, i27, i18);
                                                        }
                                                    } else {
                                                        i10 = i28;
                                                        if (h12.c(p94Var4, n94.b)) {
                                                            E(this, A(i27), 2048, num11, i10);
                                                            E(this, A(i27), 2048, num12, i10);
                                                        } else if (h12.c(p94Var4, n94.H)) {
                                                            E(this, A(i27), 2048, 8192, 8);
                                                            E(this, A(i27), 2048, num12, 8);
                                                        } else if (h12.c(p94Var4, n94.K)) {
                                                            E(this, A(i27), 2048, 3072, 8);
                                                        } else if (h12.c(p94Var4, n94.c)) {
                                                            E(this, A(i27), 2048, num11, 8);
                                                            E(this, A(i27), 2048, num12, 8);
                                                        } else if (h12.c(p94Var4, n94.G)) {
                                                            objG6 = w03Var3.g(n94.w);
                                                            if (objG6 == null) {
                                                                objG6 = null;
                                                            }
                                                            E(this, A(i27), 2048, num11, 8);
                                                            E(this, A(i27), 2048, num12, 8);
                                                        } else if (h12.c(p94Var4, n94.a)) {
                                                            int iA = A(i27);
                                                            obj2.getClass();
                                                            D(iA, 2048, 4, (List) obj2);
                                                        } else {
                                                            p94Var2 = n94.D;
                                                            str = "";
                                                            if (h12.c(p94Var4, p94Var2)) {
                                                                if (w03Var3.c(d94.k)) {
                                                                    objG4 = w03Var2.g(p94Var2);
                                                                    if (objG4 == null) {
                                                                        objG4 = null;
                                                                    }
                                                                    heVar2 = (he) objG4;
                                                                    if (heVar2 == null) {
                                                                        heVar2 = "";
                                                                    }
                                                                    objG5 = w03Var3.g(p94Var2);
                                                                    if (objG5 == null) {
                                                                        objG5 = null;
                                                                    }
                                                                    charSequence = (he) objG5;
                                                                    if (charSequence == null) {
                                                                        charSequence = "";
                                                                    }
                                                                    charSequenceP = P(charSequence);
                                                                    length = heVar2.length();
                                                                    length2 = charSequence.length();
                                                                    num9 = num12;
                                                                    if (length > length2) {
                                                                        i13 = length2;
                                                                    } else {
                                                                        i13 = length;
                                                                    }
                                                                    num5 = num11;
                                                                    i14 = 0;
                                                                    while (true) {
                                                                        i15 = i13;
                                                                        if (i14 < i13) {
                                                                            arrayList3 = arrayList5;
                                                                            break;
                                                                        }
                                                                        arrayList3 = arrayList5;
                                                                        if (heVar2.charAt(i14) != charSequence.charAt(i14)) {
                                                                            break;
                                                                        }
                                                                        i14++;
                                                                        i13 = i15;
                                                                        arrayList5 = arrayList3;
                                                                    }
                                                                    i16 = 0;
                                                                    while (true) {
                                                                        if (i16 < i15 - i14) {
                                                                            i17 = i16;
                                                                            break;
                                                                        }
                                                                        i17 = i16;
                                                                        if (heVar2.charAt((length - 1) - i16) != charSequence.charAt((length2 - 1) - i17)) {
                                                                            break;
                                                                        } else {
                                                                            i16 = i17 + 1;
                                                                        }
                                                                    }
                                                                    int i38 = (length - i17) - i14;
                                                                    int i39 = (length2 - i17) - i14;
                                                                    p94 p94Var6 = n94.J;
                                                                    boolean zC3 = w03Var2.c(p94Var6);
                                                                    boolean zC4 = w03Var3.c(p94Var6);
                                                                    zC = w03Var2.c(n94.D);
                                                                    if (zC || zC3 || !zC4) {
                                                                        z5 = false;
                                                                    } else {
                                                                        z5 = true;
                                                                    }
                                                                    if (zC || !zC3 || zC4) {
                                                                        z6 = false;
                                                                    } else {
                                                                        z6 = true;
                                                                    }
                                                                    if (!z5 || z6) {
                                                                        i8 = i27;
                                                                        num10 = num9;
                                                                        accessibilityEventP = p(A(i27), num10, num9, Integer.valueOf(length2), charSequenceP);
                                                                    } else {
                                                                        accessibilityEventP = o(A(i27), 16);
                                                                        accessibilityEventP.setFromIndex(i14);
                                                                        accessibilityEventP.setRemovedCount(i38);
                                                                        accessibilityEventP.setAddedCount(i39);
                                                                        accessibilityEventP.setBeforeText(heVar2);
                                                                        accessibilityEventP.getText().add(charSequenceP);
                                                                        i8 = i27;
                                                                        num10 = num9;
                                                                    }
                                                                    accessibilityEventP.setClassName("android.widget.EditText");
                                                                    if (Build.VERSION.SDK_INT >= 37) {
                                                                        i94Var2 = i94Var4;
                                                                        ta.a(i94Var2, accessibilityEventP);
                                                                    } else {
                                                                        i94Var2 = i94Var4;
                                                                    }
                                                                    C(accessibilityEventP);
                                                                    if (!z5 || z6) {
                                                                        long j5 = ((ss4) e94Var4.d(n94.E)).a;
                                                                        num8 = num10;
                                                                        accessibilityEventP.setFromIndex((int) (j5 >> 32));
                                                                        accessibilityEventP.setToIndex((int) (j5 & 4294967295L));
                                                                        C(accessibilityEventP);
                                                                    } else {
                                                                        num8 = num10;
                                                                    }
                                                                } else {
                                                                    num8 = num12;
                                                                    w03Var2 = w03Var2;
                                                                    num5 = num11;
                                                                    arrayList3 = arrayList5;
                                                                    i8 = i27;
                                                                    i94Var2 = i94Var4;
                                                                    E(this, A(i8), 2048, Integer.valueOf(i22), 8);
                                                                }
                                                                i9 = i30;
                                                                i7 = i35;
                                                                num6 = num8;
                                                            } else {
                                                                num7 = num12;
                                                                w03Var2 = w03Var2;
                                                                num5 = num11;
                                                                arrayList3 = arrayList5;
                                                                i7 = i35;
                                                                i8 = i27;
                                                                i94Var2 = i94Var4;
                                                                p94Var3 = n94.E;
                                                                if (h12.c(p94Var4, p94Var3)) {
                                                                    objG3 = w03Var3.g(p94Var2);
                                                                    if (objG3 == null) {
                                                                        objG3 = null;
                                                                    }
                                                                    heVar = (he) objG3;
                                                                    if (heVar != null && (str2 = heVar.o) != null) {
                                                                        str = str2;
                                                                    }
                                                                    long j6 = ((ss4) e94Var4.d(p94Var3)).a;
                                                                    i94Var4 = i94Var2;
                                                                    num6 = num7;
                                                                    C(p(A(i8), Integer.valueOf((int) (j6 >> 32)), Integer.valueOf((int) (j6 & 4294967295L)), Integer.valueOf(str.length()), P(str)));
                                                                    i9 = i30;
                                                                    G(i9);
                                                                } else {
                                                                    i9 = i30;
                                                                    num6 = num7;
                                                                    if (!h12.c(p94Var4, p94Var5) || h12.c(p94Var4, n94.v)) {
                                                                        w(i94Var2.c);
                                                                        size = arrayList4.size();
                                                                        i11 = 0;
                                                                        while (true) {
                                                                            if (i11 >= size) {
                                                                                p64Var2 = null;
                                                                                break;
                                                                            } else {
                                                                                if (((p64) arrayList4.get(i11)).n == i8) {
                                                                                    p64Var2 = (p64) arrayList4.get(i11);
                                                                                    break;
                                                                                }
                                                                                i11++;
                                                                            }
                                                                        }
                                                                        p64Var2.getClass();
                                                                        objG = w03Var3.g(p94Var5);
                                                                        if (objG == null) {
                                                                            objG = null;
                                                                        }
                                                                        p64Var2.r = (h64) objG;
                                                                        objG2 = w03Var3.g(n94.v);
                                                                        if (objG2 == null) {
                                                                            objG2 = null;
                                                                        }
                                                                        p64Var2.s = (h64) objG2;
                                                                        if (p64Var2.o.contains(p64Var2)) {
                                                                            this.q.getSnapshotObserver().a.e(p64Var2, this.Z, new fa(1, p64Var2, this));
                                                                        }
                                                                    } else if (h12.c(p94Var4, n94.l)) {
                                                                        obj2.getClass();
                                                                        if (((Boolean) obj2).booleanValue()) {
                                                                            i12 = 8;
                                                                            C(o(A(i9), 8));
                                                                        } else {
                                                                            i12 = 8;
                                                                        }
                                                                        E(this, A(i9), 2048, num6, i12);
                                                                    } else {
                                                                        p94 p94Var7 = d94.w;
                                                                        if (h12.c(p94Var4, p94Var7)) {
                                                                            List list = (List) e94Var4.d(p94Var7);
                                                                            Object objG7 = w03Var2.g(p94Var7);
                                                                            if (objG7 == null) {
                                                                                objG7 = null;
                                                                            }
                                                                            List list2 = (List) objG7;
                                                                            if (list2 != null) {
                                                                                x03 x03Var = w54.a;
                                                                                x03 x03Var2 = new x03();
                                                                                if (list.size() > 0) {
                                                                                    list.get(0).getClass();
                                                                                    kf2.k();
                                                                                    return;
                                                                                }
                                                                                x03 x03Var3 = new x03();
                                                                                if (list2.size() > 0) {
                                                                                    list2.get(0).getClass();
                                                                                    kf2.k();
                                                                                    return;
                                                                                }
                                                                                z4 = z || !x03Var2.equals(x03Var3);
                                                                            } else {
                                                                                z4 = z || !list.isEmpty();
                                                                            }
                                                                            z = z4;
                                                                        } else if (z || !(obj2 instanceof w2)) {
                                                                            z = true;
                                                                        } else {
                                                                            w2 w2Var = (w2) obj2;
                                                                            Object objG8 = w03Var2.g(p94Var4);
                                                                            if (objG8 == null) {
                                                                                objG8 = null;
                                                                            }
                                                                            if (w2Var != objG8) {
                                                                                if (objG8 instanceof w2) {
                                                                                    String str4 = w2Var.a;
                                                                                    w2 w2Var2 = (w2) objG8;
                                                                                    sf1 sf1Var2 = w2Var2.b;
                                                                                    if (h12.c(str4, w2Var2.a) && (((sf1Var = w2Var.b) != null || sf1Var2 == null) && (sf1Var == null || sf1Var2 != null))) {
                                                                                    }
                                                                                }
                                                                                z = true;
                                                                            }
                                                                            z = false;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    num6 = num12;
                                                    w03Var2 = w03Var2;
                                                    num5 = num11;
                                                    arrayList3 = arrayList5;
                                                    i9 = i30;
                                                    i7 = i35;
                                                    i8 = i27;
                                                } else {
                                                    Object objG9 = w03Var2.g(p94Var4);
                                                    if (objG9 == null) {
                                                        objG9 = null;
                                                    }
                                                    if (h12.c(obj2, objG9)) {
                                                        num6 = num12;
                                                        w03Var2 = w03Var2;
                                                        num5 = num11;
                                                        arrayList3 = arrayList5;
                                                        i9 = i30;
                                                        i7 = i35;
                                                        i8 = i27;
                                                    } else {
                                                        p94Var = n94.d;
                                                        if (h12.c(p94Var4, p94Var)) {
                                                            obj2.getClass();
                                                            str3 = (String) obj2;
                                                            zC2 = w03Var2.c(p94Var);
                                                            i18 = i28;
                                                            if (zC2) {
                                                                F(str3, i27, i18);
                                                            }
                                                        } else {
                                                            i10 = i28;
                                                            if (h12.c(p94Var4, n94.b)) {
                                                                E(this, A(i27), 2048, num11, i10);
                                                                E(this, A(i27), 2048, num12, i10);
                                                            } else if (h12.c(p94Var4, n94.H)) {
                                                                E(this, A(i27), 2048, 8192, 8);
                                                                E(this, A(i27), 2048, num12, 8);
                                                            } else if (h12.c(p94Var4, n94.K)) {
                                                                E(this, A(i27), 2048, 3072, 8);
                                                            } else if (h12.c(p94Var4, n94.c)) {
                                                                E(this, A(i27), 2048, num11, 8);
                                                                E(this, A(i27), 2048, num12, 8);
                                                            } else if (h12.c(p94Var4, n94.G)) {
                                                                objG6 = w03Var3.g(n94.w);
                                                                if (objG6 == null) {
                                                                    objG6 = null;
                                                                }
                                                                E(this, A(i27), 2048, num11, 8);
                                                                E(this, A(i27), 2048, num12, 8);
                                                            } else if (h12.c(p94Var4, n94.a)) {
                                                                int iA2 = A(i27);
                                                                obj2.getClass();
                                                                D(iA2, 2048, 4, (List) obj2);
                                                            } else {
                                                                p94Var2 = n94.D;
                                                                str = "";
                                                                if (h12.c(p94Var4, p94Var2)) {
                                                                    if (w03Var3.c(d94.k)) {
                                                                        objG4 = w03Var2.g(p94Var2);
                                                                        if (objG4 == null) {
                                                                            objG4 = null;
                                                                        }
                                                                        heVar2 = (he) objG4;
                                                                        if (heVar2 == null) {
                                                                            heVar2 = "";
                                                                        }
                                                                        objG5 = w03Var3.g(p94Var2);
                                                                        if (objG5 == null) {
                                                                            objG5 = null;
                                                                        }
                                                                        charSequence = (he) objG5;
                                                                        if (charSequence == null) {
                                                                            charSequence = "";
                                                                        }
                                                                        charSequenceP = P(charSequence);
                                                                        length = heVar2.length();
                                                                        length2 = charSequence.length();
                                                                        num9 = num12;
                                                                        if (length > length2) {
                                                                            i13 = length2;
                                                                        } else {
                                                                            i13 = length;
                                                                        }
                                                                        num5 = num11;
                                                                        i14 = 0;
                                                                        while (true) {
                                                                            i15 = i13;
                                                                            if (i14 < i13) {
                                                                                arrayList3 = arrayList5;
                                                                                break;
                                                                            }
                                                                            arrayList3 = arrayList5;
                                                                            if (heVar2.charAt(i14) != charSequence.charAt(i14)) {
                                                                                break;
                                                                                break;
                                                                            } else {
                                                                                i14++;
                                                                                i13 = i15;
                                                                                arrayList5 = arrayList3;
                                                                            }
                                                                        }
                                                                        i16 = 0;
                                                                        while (true) {
                                                                            if (i16 < i15 - i14) {
                                                                                i17 = i16;
                                                                                break;
                                                                            }
                                                                            i17 = i16;
                                                                            if (heVar2.charAt((length - 1) - i16) != charSequence.charAt((length2 - 1) - i17)) {
                                                                                break;
                                                                                break;
                                                                            }
                                                                            i16 = i17 + 1;
                                                                        }
                                                                        int i310 = (length - i17) - i14;
                                                                        int i311 = (length2 - i17) - i14;
                                                                        p94 p94Var8 = n94.J;
                                                                        boolean zC5 = w03Var2.c(p94Var8);
                                                                        boolean zC6 = w03Var3.c(p94Var8);
                                                                        zC = w03Var2.c(n94.D);
                                                                        if (zC) {
                                                                            z5 = false;
                                                                        } else {
                                                                            z5 = false;
                                                                        }
                                                                        if (zC) {
                                                                            z6 = false;
                                                                        } else {
                                                                            z6 = false;
                                                                        }
                                                                        if (z5) {
                                                                            i8 = i27;
                                                                            num10 = num9;
                                                                            accessibilityEventP = p(A(i27), num10, num9, Integer.valueOf(length2), charSequenceP);
                                                                        } else {
                                                                            i8 = i27;
                                                                            num10 = num9;
                                                                            accessibilityEventP = p(A(i27), num10, num9, Integer.valueOf(length2), charSequenceP);
                                                                        }
                                                                        accessibilityEventP.setClassName("android.widget.EditText");
                                                                        if (Build.VERSION.SDK_INT >= 37) {
                                                                            i94Var2 = i94Var4;
                                                                            ta.a(i94Var2, accessibilityEventP);
                                                                        } else {
                                                                            i94Var2 = i94Var4;
                                                                        }
                                                                        C(accessibilityEventP);
                                                                        if (z5) {
                                                                            long j7 = ((ss4) e94Var4.d(n94.E)).a;
                                                                            num8 = num10;
                                                                            accessibilityEventP.setFromIndex((int) (j7 >> 32));
                                                                            accessibilityEventP.setToIndex((int) (j7 & 4294967295L));
                                                                            C(accessibilityEventP);
                                                                        } else {
                                                                            long j8 = ((ss4) e94Var4.d(n94.E)).a;
                                                                            num8 = num10;
                                                                            accessibilityEventP.setFromIndex((int) (j8 >> 32));
                                                                            accessibilityEventP.setToIndex((int) (j8 & 4294967295L));
                                                                            C(accessibilityEventP);
                                                                        }
                                                                    } else {
                                                                        num8 = num12;
                                                                        w03Var2 = w03Var2;
                                                                        num5 = num11;
                                                                        arrayList3 = arrayList5;
                                                                        i8 = i27;
                                                                        i94Var2 = i94Var4;
                                                                        E(this, A(i8), 2048, Integer.valueOf(i22), 8);
                                                                    }
                                                                    i9 = i30;
                                                                    i7 = i35;
                                                                    num6 = num8;
                                                                } else {
                                                                    num7 = num12;
                                                                    w03Var2 = w03Var2;
                                                                    num5 = num11;
                                                                    arrayList3 = arrayList5;
                                                                    i7 = i35;
                                                                    i8 = i27;
                                                                    i94Var2 = i94Var4;
                                                                    p94Var3 = n94.E;
                                                                    if (h12.c(p94Var4, p94Var3)) {
                                                                        objG3 = w03Var3.g(p94Var2);
                                                                        if (objG3 == null) {
                                                                            objG3 = null;
                                                                        }
                                                                        heVar = (he) objG3;
                                                                        if (heVar != null) {
                                                                            str = str2;
                                                                        }
                                                                        long j9 = ((ss4) e94Var4.d(p94Var3)).a;
                                                                        i94Var4 = i94Var2;
                                                                        num6 = num7;
                                                                        C(p(A(i8), Integer.valueOf((int) (j9 >> 32)), Integer.valueOf((int) (j9 & 4294967295L)), Integer.valueOf(str.length()), P(str)));
                                                                        i9 = i30;
                                                                        G(i9);
                                                                    } else {
                                                                        i9 = i30;
                                                                        num6 = num7;
                                                                        if (h12.c(p94Var4, p94Var5)) {
                                                                            w(i94Var2.c);
                                                                            size = arrayList4.size();
                                                                            i11 = 0;
                                                                            while (true) {
                                                                                if (i11 >= size) {
                                                                                    p64Var2 = null;
                                                                                    break;
                                                                                } else {
                                                                                    if (((p64) arrayList4.get(i11)).n == i8) {
                                                                                        p64Var2 = (p64) arrayList4.get(i11);
                                                                                        break;
                                                                                    }
                                                                                    i11++;
                                                                                }
                                                                            }
                                                                            p64Var2.getClass();
                                                                            objG = w03Var3.g(p94Var5);
                                                                            if (objG == null) {
                                                                                objG = null;
                                                                            }
                                                                            p64Var2.r = (h64) objG;
                                                                            objG2 = w03Var3.g(n94.v);
                                                                            if (objG2 == null) {
                                                                                objG2 = null;
                                                                            }
                                                                            p64Var2.s = (h64) objG2;
                                                                            if (p64Var2.o.contains(p64Var2)) {
                                                                                this.q.getSnapshotObserver().a.e(p64Var2, this.Z, new fa(1, p64Var2, this));
                                                                            }
                                                                        } else {
                                                                            w(i94Var2.c);
                                                                            size = arrayList4.size();
                                                                            i11 = 0;
                                                                            while (true) {
                                                                                if (i11 >= size) {
                                                                                    p64Var2 = null;
                                                                                    break;
                                                                                } else {
                                                                                    if (((p64) arrayList4.get(i11)).n == i8) {
                                                                                        p64Var2 = (p64) arrayList4.get(i11);
                                                                                        break;
                                                                                    }
                                                                                    i11++;
                                                                                }
                                                                            }
                                                                            p64Var2.getClass();
                                                                            objG = w03Var3.g(p94Var5);
                                                                            if (objG == null) {
                                                                                objG = null;
                                                                            }
                                                                            p64Var2.r = (h64) objG;
                                                                            objG2 = w03Var3.g(n94.v);
                                                                            if (objG2 == null) {
                                                                                objG2 = null;
                                                                            }
                                                                            p64Var2.s = (h64) objG2;
                                                                            if (p64Var2.o.contains(p64Var2)) {
                                                                                this.q.getSnapshotObserver().a.e(p64Var2, this.Z, new fa(1, p64Var2, this));
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        num6 = num12;
                                                        w03Var2 = w03Var2;
                                                        num5 = num11;
                                                        arrayList3 = arrayList5;
                                                        i9 = i30;
                                                        i7 = i35;
                                                        i8 = i27;
                                                    }
                                                }
                                                i30 = i9;
                                                i94Var4 = i94Var2;
                                                i28 = 8;
                                                i27 = i8;
                                                num12 = num6;
                                                w03Var2 = w03Var2;
                                                e94Var3 = e94Var2;
                                                j4 = j >> 8;
                                                num11 = num5;
                                                i33++;
                                                length4 = i7;
                                                arrayList5 = arrayList3;
                                            } else {
                                                e94Var2 = e94Var3;
                                                num5 = num11;
                                                arrayList3 = arrayList5;
                                                j = j4;
                                                i33 = i33;
                                                i7 = length4;
                                                num6 = num12;
                                                i8 = i27;
                                                w03Var2 = w03Var2;
                                                i9 = i30;
                                            }
                                            i94Var2 = i94Var4;
                                            i30 = i9;
                                            i94Var4 = i94Var2;
                                            i28 = 8;
                                            i27 = i8;
                                            num12 = num6;
                                            w03Var2 = w03Var2;
                                            e94Var3 = e94Var2;
                                            j4 = j >> 8;
                                            num11 = num5;
                                            i33++;
                                            length4 = i7;
                                            arrayList5 = arrayList3;
                                        }
                                        num4 = num12;
                                        e94Var = e94Var3;
                                        w03Var = w03Var2;
                                        num3 = num11;
                                        arrayList2 = arrayList5;
                                        i5 = i30;
                                        i6 = length4;
                                        i4 = i27;
                                        i94Var = i94Var4;
                                        if (i32 != i28) {
                                            break;
                                        }
                                    } else {
                                        num4 = num12;
                                        e94Var = e94Var3;
                                        w03Var = w03Var2;
                                        num3 = num11;
                                        arrayList2 = arrayList5;
                                        i5 = i30;
                                        i6 = length4;
                                        i4 = i27;
                                        i94Var = i94Var4;
                                    }
                                    int i40 = i31;
                                    if (i40 == i6) {
                                        break;
                                    }
                                    i31 = i40 + 1;
                                    i30 = i5;
                                    length4 = i6;
                                    num12 = num4;
                                    w03Var2 = w03Var;
                                    i25 = i3;
                                    e94Var3 = e94Var;
                                    arrayList5 = arrayList2;
                                    i28 = 8;
                                    i94Var3 = i94Var;
                                    i27 = i4;
                                    num11 = num3;
                                }
                            } else {
                                num4 = num12;
                                e94Var = e94Var3;
                                num3 = num11;
                                arrayList2 = arrayList5;
                                i3 = i25;
                                i4 = i27;
                                i94Var = i94Var3;
                                z = false;
                            }
                            if (!z) {
                                Iterator it = e94Var.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z2 = false;
                                        break;
                                    }
                                    if (!i94Var.k().n.c((p94) ((Map.Entry) it.next()).getKey())) {
                                        z2 = true;
                                        break;
                                    }
                                }
                                z = z2;
                            }
                            if (z) {
                                i2 = 8;
                                E(this, A(i4), 2048, num4, 8);
                            } else {
                                i2 = 8;
                            }
                        }
                    } else {
                        i = i26;
                        num3 = num11;
                        arrayList2 = arrayList5;
                        iArr2 = iArr3;
                        jArr2 = jArr3;
                        i2 = i24;
                        i3 = i25;
                        num4 = num12;
                    }
                    j3 >>= i2;
                    i26 = i + 1;
                    e02Var2 = e02Var;
                    num12 = num4;
                    iArr3 = iArr2;
                    jArr3 = jArr2;
                    i25 = i3;
                    num11 = num3;
                    arrayList5 = arrayList2;
                    i24 = i2;
                }
                num2 = num11;
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
                int i41 = i24;
                num = num12;
                if (i25 != i41) {
                    return;
                }
            } else {
                num = num12;
                num2 = num11;
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
            }
            if (i21 == i23) {
                return;
            }
            i21++;
            e02Var2 = e02Var;
            length3 = i23;
            num12 = num;
            i19 = i22;
            iArr3 = iArr;
            jArr3 = jArr;
            num11 = num2;
            arrayList5 = arrayList;
            i20 = 0;
        }
    }

    public final void I(c72 c72Var, j03 j03Var) {
        e94 e94VarV;
        if (c72Var.G() && !this.q.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(c72Var)) {
            c72 c72Var2 = null;
            if (!c72Var.Q.d(8)) {
                c72Var = c72Var.t();
                while (true) {
                    if (c72Var == null) {
                        c72Var = null;
                        break;
                    } else if (c72Var.Q.d(8)) {
                        break;
                    } else {
                        c72Var = c72Var.t();
                    }
                }
            }
            if (c72Var == null || (e94VarV = c72Var.v()) == null) {
                return;
            }
            if (!e94VarV.p) {
                for (c72 c72VarT = c72Var.t(); c72VarT != null; c72VarT = c72VarT.t()) {
                    e94 e94VarV2 = c72VarT.v();
                    if (e94VarV2 != null && e94VarV2.p) {
                        c72Var2 = c72VarT;
                        break;
                    }
                }
                if (c72Var2 != null) {
                    c72Var = c72Var2;
                }
            }
            int i = c72Var.o;
            if (j03Var.a(i)) {
                E(this, A(i), 2048, 1, 8);
            }
        }
    }

    public final void J(c72 c72Var) {
        if (c72Var.G() && !this.q.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(c72Var)) {
            int i = c72Var.o;
            h64 h64Var = (h64) this.C.b(i);
            h64 h64Var2 = (h64) this.D.b(i);
            if (h64Var == null && h64Var2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventO = o(i, 4096);
            if (h64Var != null) {
                accessibilityEventO.setScrollX((int) ((Number) h64Var.a.invoke()).floatValue());
                accessibilityEventO.setMaxScrollX((int) ((Number) h64Var.b.invoke()).floatValue());
            }
            if (h64Var2 != null) {
                accessibilityEventO.setScrollY((int) ((Number) h64Var2.a.invoke()).floatValue());
                accessibilityEventO.setMaxScrollY((int) ((Number) h64Var2.b.invoke()).floatValue());
            }
            C(accessibilityEventO);
        }
    }

    public final boolean K(i94 i94Var, int i, int i2, boolean z) {
        String strT;
        e94 e94Var = i94Var.d;
        int i3 = i94Var.f;
        p94 p94Var = d94.j;
        if (e94Var.n.c(p94Var) && xl.b(i94Var)) {
            xf1 xf1Var = (xf1) ((w2) i94Var.d.d(p94Var)).b;
            if (xf1Var != null) {
                return ((Boolean) xf1Var.a(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i != i2 || i2 != this.G) && (strT = t(i94Var)) != null) {
            if (i < 0 || i != i2 || i2 > strT.length()) {
                i = -1;
            }
            this.G = i;
            boolean z2 = strT.length() > 0;
            C(p(A(i3), z2 ? Integer.valueOf(this.G) : null, z2 ? Integer.valueOf(this.G) : null, z2 ? Integer.valueOf(strT.length()) : null, strT));
            G(i3);
            return true;
        }
        return false;
    }

    public final Rect M(float f, float f2, float f3, float f4) {
        long jFloatToRawIntBits = Float.floatToRawIntBits(f);
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f2)) & 4294967295L;
        ra raVar = this.q;
        long jP = raVar.p(jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
        long jP2 = raVar.p((((long) Float.floatToRawIntBits(f4)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
        int i = (int) (jP >> 32);
        int i2 = (int) (jP2 >> 32);
        int i3 = (int) (jP & 4294967295L);
        int i4 = (int) (jP2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.floor(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
    /* JADX WARN: Code duplicated, block: B:20:0x006f  */
    /* JADX WARN: Code duplicated, block: B:23:0x007c  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void Q() {
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        int iNumberOfTrailingZeros;
        char c2;
        j94 j94Var;
        j03 j03Var = new j03();
        j03 j03Var2 = this.N;
        int[] iArr = j03Var2.b;
        long[] jArr3 = j03Var2.a;
        int length = jArr3.length - 2;
        i03 i03Var = this.T;
        int i2 = 8;
        if (length >= 0) {
            int i3 = 0;
            j = 128;
            j2 = 255;
            while (true) {
                long j5 = jArr3[i3];
                char c3 = 7;
                j3 = -9187201950435737472L;
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j5 & 255) < 128) {
                            int i6 = iArr[(i3 << 3) + i5];
                            c2 = c3;
                            k94 k94Var = (k94) s().b(i6);
                            Object obj = null;
                            i94 i94Var = k94Var != null ? k94Var.a : null;
                            if (i94Var != null) {
                                if (!i94Var.d.n.c(n94.d)) {
                                    j03Var.a(i6);
                                    j94Var = (j94) i03Var.b(i6);
                                    if (j94Var != null) {
                                        Object objG = j94Var.a.n.g(n94.d);
                                        obj = (String) (objG != null ? objG : null);
                                    }
                                    F(obj, i6, 32);
                                }
                            } else {
                                j03Var.a(i6);
                                j94Var = (j94) i03Var.b(i6);
                                if (j94Var != null) {
                                    Object objG2 = j94Var.a.n.g(n94.d);
                                    obj = (String) (objG2 != null ? objG2 : null);
                                }
                                F(obj, i6, 32);
                            }
                        } else {
                            c2 = c3;
                        }
                        j5 >>= 8;
                        i5++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i4 != 8) {
                        break;
                    }
                } else {
                    c = 7;
                }
                if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
        }
        int[] iArr2 = j03Var.b;
        long[] jArr4 = j03Var.a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i7 = 0;
            while (true) {
                long j6 = jArr4[i7];
                if ((((~j6) << c) & j6 & j3) != j3) {
                    int i8 = 8 - ((~(i7 - length2)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j6 & j2) < j) {
                            int i10 = iArr2[(i7 << 3) + i9];
                            int iHashCode = Integer.hashCode(i10) * (-862048943);
                            int i11 = iHashCode ^ (iHashCode << 16);
                            int i12 = i11 & 127;
                            int i13 = j03Var2.c;
                            int i14 = (i11 >>> 7) & i13;
                            i = i2;
                            int i15 = 0;
                            while (true) {
                                long[] jArr5 = j03Var2.a;
                                int i16 = i14 >> 3;
                                jArr2 = jArr4;
                                int i17 = (i14 & 7) << 3;
                                j4 = j6;
                                long j7 = (jArr5[i16] >>> i17) | ((jArr5[i16 + 1] << (64 - i17)) & ((-i17) >> 63));
                                int i18 = i13;
                                long j8 = (((long) i12) * 72340172838076673L) ^ j7;
                                long j9 = (j8 - 72340172838076673L) & (~j8) & j3;
                                while (j9 != 0) {
                                    iNumberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j9) >> 3)) & i18;
                                    int i19 = i18;
                                    if (j03Var2.b[iNumberOfTrailingZeros] == i10) {
                                        break;
                                    }
                                    j9 &= j9 - 1;
                                    i18 = i19;
                                }
                                int i20 = i18;
                                if ((j7 & ((~j7) << 6) & j3) != 0) {
                                    iNumberOfTrailingZeros = -1;
                                    break;
                                }
                                i15 += 8;
                                i14 = (i14 + i15) & i20;
                                jArr4 = jArr2;
                                i13 = i20;
                                j6 = j4;
                            }
                            int i21 = iNumberOfTrailingZeros;
                            if (i21 >= 0) {
                                j03Var2.g(i21);
                            }
                        } else {
                            jArr2 = jArr4;
                            j4 = j6;
                            i = i2;
                        }
                        j6 = j4 >> i;
                        i9++;
                        i2 = i;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    if (i8 != i2) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                }
                if (i7 == length2) {
                    break;
                }
                i7++;
                jArr4 = jArr;
                i2 = 8;
            }
        }
        i03Var.c();
        e02 e02VarS = s();
        int[] iArr3 = e02VarS.b;
        Object[] objArr = e02VarS.c;
        long[] jArr6 = e02VarS.a;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i22 = 0;
            while (true) {
                long j10 = jArr6[i22];
                if ((((~j10) << c) & j10 & j3) != j3) {
                    int i23 = 8 - ((~(i22 - length3)) >>> 31);
                    for (int i24 = 0; i24 < i23; i24++) {
                        if ((j10 & j2) < j) {
                            int i25 = (i22 << 3) + i24;
                            int i26 = iArr3[i25];
                            i94 i94Var2 = ((k94) objArr[i25]).a;
                            e94 e94Var = i94Var2.d;
                            p94 p94Var = n94.d;
                            if (e94Var.n.c(p94Var) && j03Var2.a(i26)) {
                                F((String) i94Var2.d.d(p94Var), i26, 16);
                            }
                            i03Var.i(i26, new j94(i94Var2, s()));
                        }
                        j10 >>= 8;
                    }
                    if (i23 != 8) {
                        break;
                    }
                }
                if (i22 == length3) {
                    break;
                } else {
                    i22++;
                }
            }
        }
        this.U = new j94(this.q.getSemanticsOwner().a(), s());
    }

    @Override // defpackage.z2
    public final zh0 b(View view) {
        return this.w;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0091  */
    public final void j(int i, v3 v3Var, String str, Bundle bundle) {
        i94 i94Var;
        RectF[] rectFArr;
        int i2;
        ms4 ms4Var;
        float fI;
        float fH;
        RectF[] rectFArr2;
        int i3;
        AccessibilityNodeInfo accessibilityNodeInfo = v3Var.a;
        k94 k94Var = (k94) s().b(i);
        if (k94Var == null || (i94Var = k94Var.a) == null) {
            return;
        }
        c72 c72Var = i94Var.c;
        e94 e94Var = i94Var.d;
        w03 w03Var = e94Var.n;
        String strT = t(i94Var);
        if (h12.c(str, this.Q)) {
            int iD = this.O.d(i);
            if (iD != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD);
                return;
            }
            return;
        }
        if (h12.c(str, this.R)) {
            int iD2 = this.P.d(i);
            if (iD2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD2);
                return;
            }
            return;
        }
        boolean zC = w03Var.c(d94.a);
        ra raVar = this.q;
        if (!zC || bundle == null || !h12.c(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            p94 p94Var = n94.x;
            if (w03Var.c(p94Var) && bundle != null && h12.c(str, "androidx.compose.ui.semantics.testTag")) {
                Object objG = w03Var.g(p94Var);
                String str2 = (String) (objG == null ? null : objG);
                if (str2 != null) {
                    accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                    return;
                }
                return;
            }
            if (h12.c(str, "androidx.compose.ui.semantics.id")) {
                accessibilityNodeInfo.getExtras().putInt(str, i94Var.f);
                return;
            }
            if (h12.c(str, "androidx.compose.ui.semantics.shapeType")) {
                Object objG2 = w03Var.g(n94.O);
                ac4 ac4Var = (ac4) (objG2 == null ? null : objG2);
                if (ac4Var != null) {
                    Rect rect = new Rect();
                    accessibilityNodeInfo.getBoundsInScreen(rect);
                    wv3 wv3VarU = u(i94Var, rect, ac4Var);
                    float f = wv3VarU.b;
                    float f2 = wv3VarU.a;
                    ya4 ya4VarA = ac4Var.a(wv3VarU.b(), c72Var.K, raVar.getDensity());
                    if (ya4VarA instanceof nb3) {
                        accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                        accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", L(ya4VarA, f2, f));
                        return;
                    } else if (ya4VarA instanceof ob3) {
                        accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                        accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", L(ya4VarA, f2, f));
                        accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", N(ya4VarA));
                        return;
                    } else if (!(ya4VarA instanceof mb3)) {
                        er1.n();
                        return;
                    } else {
                        accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                        accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", O(ya4VarA, f2, f));
                        return;
                    }
                }
                return;
            }
            if (h12.c(str, "androidx.compose.ui.semantics.shapeRect")) {
                Object objG3 = w03Var.g(n94.O);
                ac4 ac4Var2 = (ac4) (objG3 == null ? null : objG3);
                if (ac4Var2 != null) {
                    Rect rect2 = new Rect();
                    accessibilityNodeInfo.getBoundsInScreen(rect2);
                    wv3 wv3VarU2 = u(i94Var, rect2, ac4Var2);
                    Rect rectL = L(ac4Var2.a(wv3VarU2.b(), c72Var.K, raVar.getDensity()), wv3VarU2.a, wv3VarU2.b);
                    if (rectL != null) {
                        accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", rectL);
                        return;
                    }
                    return;
                }
                return;
            }
            if (h12.c(str, "androidx.compose.ui.semantics.shapeCorners")) {
                Object objG4 = w03Var.g(n94.O);
                ac4 ac4Var3 = (ac4) (objG4 == null ? null : objG4);
                if (ac4Var3 != null) {
                    Rect rect3 = new Rect();
                    accessibilityNodeInfo.getBoundsInScreen(rect3);
                    float[] fArrN = N(ac4Var3.a(u(i94Var, rect3, ac4Var3).b(), c72Var.K, raVar.getDensity()));
                    if (fArrN != null) {
                        accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", fArrN);
                        return;
                    }
                    return;
                }
                return;
            }
            if (h12.c(str, "androidx.compose.ui.semantics.shapeRegion")) {
                Object objG5 = w03Var.g(n94.O);
                ac4 ac4Var4 = (ac4) (objG5 == null ? null : objG5);
                if (ac4Var4 != null) {
                    Rect rect4 = new Rect();
                    accessibilityNodeInfo.getBoundsInScreen(rect4);
                    wv3 wv3VarU3 = u(i94Var, rect4, ac4Var4);
                    Region regionO = O(ac4Var4.a(wv3VarU3.b(), c72Var.K, raVar.getDensity()), wv3VarU3.a, wv3VarU3.b);
                    if (regionO != null) {
                        accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", regionO);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        int i4 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
        int i5 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
        if (i5 > 0 && i4 >= 0) {
            if (i4 < (strT != null ? strT.length() : Integer.MAX_VALUE)) {
                ms4 ms4VarP = gh0.p(e94Var);
                if (ms4VarP == null) {
                    rectFArr = null;
                } else {
                    iz1 iz1Var = (iz1) c72Var.Q.d;
                    if (!iz1Var.n0.A) {
                        iz1Var = null;
                    }
                    if (iz1Var != null) {
                        long jK0 = iz1Var.K0(0L);
                        wv3 wv3VarG = i94Var.g();
                        RectF[] rectFArr3 = new RectF[i5];
                        int i6 = 0;
                        while (i6 < i5) {
                            int i7 = i4 + i6;
                            if (i7 >= ms4VarP.a.a.o.length()) {
                                i2 = i4;
                                i5 = i5;
                                ms4Var = ms4VarP;
                                rectFArr2 = rectFArr3;
                                i3 = i6;
                            } else {
                                fd fdVar = ms4VarP.b;
                                he heVar = (he) ((bq4) fdVar.c).n;
                                i2 = i4;
                                if (i7 < 0 || i7 >= heVar.o.length()) {
                                    dz1.a("offset(" + i7 + ") is out of bounds [0, " + heVar.o.length() + ")");
                                }
                                ArrayList arrayList = (ArrayList) fdVar.e;
                                od3 od3Var = (od3) arrayList.get(rr2.C(arrayList, i7));
                                ic icVar = od3Var.a;
                                int iA = od3Var.a(i7);
                                CharSequence charSequence = icVar.e;
                                if (iA < 0 || iA >= charSequence.length()) {
                                    dz1.a("offset(" + iA + ") is out of bounds [0," + charSequence.length() + ")");
                                }
                                ks4 ks4Var = icVar.d;
                                int iF = ks4Var.f(iA);
                                float fG = ks4Var.g(iF);
                                float fD = ks4Var.d(iF);
                                Layout layout = ks4Var.e;
                                ms4Var = ms4VarP;
                                boolean z = layout.getParagraphDirection(iF) == 1;
                                boolean zIsRtlCharAt = layout.isRtlCharAt(iA);
                                if (z && !zIsRtlCharAt) {
                                    fH = ks4Var.h(iA, false);
                                    fI = ks4Var.h(iA + 1, true);
                                } else if (z && zIsRtlCharAt) {
                                    float fI2 = ks4Var.i(iA, false);
                                    fH = ks4Var.i(iA + 1, true);
                                    fI = fI2;
                                } else if (zIsRtlCharAt) {
                                    float fH2 = ks4Var.h(iA, false);
                                    fH = ks4Var.h(iA + 1, true);
                                    fI = fH2;
                                } else {
                                    float fI3 = ks4Var.i(iA, false);
                                    fI = ks4Var.i(iA + 1, true);
                                    fH = fI3;
                                }
                                RectF rectF = new RectF(fH, fG, fI, fD);
                                float f3 = rectF.left;
                                float f4 = rectF.top + 0.0f;
                                float f5 = rectF.right;
                                float f6 = rectF.bottom + 0.0f;
                                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(od3Var.f)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32);
                                int i8 = (int) (jFloatToRawIntBits >> 32);
                                rectFArr2 = rectFArr3;
                                i3 = i6;
                                int i9 = (int) (jFloatToRawIntBits & 4294967295L);
                                wv3 wv3VarF = new wv3(Float.intBitsToFloat(i8) + f3, Float.intBitsToFloat(i9) + f4, Float.intBitsToFloat(i8) + f5, Float.intBitsToFloat(i9) + f6).f(jK0);
                                wv3 wv3VarC = ((((wv3VarG.a > wv3VarF.c ? 1 : (wv3VarG.a == wv3VarF.c ? 0 : -1)) < 0) & ((wv3VarF.a > wv3VarG.c ? 1 : (wv3VarF.a == wv3VarG.c ? 0 : -1)) < 0)) & ((wv3VarF.b > wv3VarG.d ? 1 : (wv3VarF.b == wv3VarG.d ? 0 : -1)) < 0)) & ((wv3VarG.b > wv3VarF.d ? 1 : (wv3VarG.b == wv3VarF.d ? 0 : -1)) < 0) ? wv3VarF.c(wv3VarG) : null;
                                if (wv3VarC != null) {
                                    long jP = raVar.p((((long) Float.floatToRawIntBits(wv3VarC.a)) << 32) | (((long) Float.floatToRawIntBits(wv3VarC.b)) & 4294967295L));
                                    long jP2 = raVar.p((((long) Float.floatToRawIntBits(wv3VarC.d)) & 4294967295L) | (((long) Float.floatToRawIntBits(wv3VarC.c)) << 32));
                                    int i10 = (int) (jP >> 32);
                                    int i11 = (int) (jP2 >> 32);
                                    int i12 = (int) (jP & 4294967295L);
                                    int i13 = (int) (jP2 & 4294967295L);
                                    rectFArr2[i3] = new RectF(Math.min(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), Math.min(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13)), Math.max(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), Math.max(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13)));
                                }
                            }
                            i6 = i3 + 1;
                            i4 = i2;
                            i5 = i5;
                            rectFArr3 = rectFArr2;
                            ms4VarP = ms4Var;
                        }
                        rectFArr = rectFArr3;
                    } else {
                        rectFArr = null;
                    }
                }
                if (rectFArr == null) {
                    return;
                }
                accessibilityNodeInfo.getExtras().putParcelableArray(str, rectFArr);
                return;
            }
        }
        Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
    }

    public final Rect k(k94 k94Var) {
        k02 k02Var = k94Var.b;
        return M(k02Var.a, k02Var.b, k02Var.c, k02Var.d);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0062  */
    /* JADX WARN: Code duplicated, block: B:27:0x0064  */
    /* JADX WARN: Code duplicated, block: B:30:0x0070 A[Catch: all -> 0x0032, TryCatch #1 {all -> 0x0032, blocks: (B:13:0x002c, B:24:0x0056, B:28:0x0068, B:30:0x0070, B:32:0x0079, B:39:0x0097, B:42:0x00a6, B:43:0x00ae, B:44:0x00b1, B:45:0x00b2, B:20:0x0040, B:23:0x0047, B:33:0x007e, B:35:0x0083, B:38:0x0094), top: B:54:0x0022, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0079 A[Catch: all -> 0x0032, TRY_LEAVE, TryCatch #1 {all -> 0x0032, blocks: (B:13:0x002c, B:24:0x0056, B:28:0x0068, B:30:0x0070, B:32:0x0079, B:39:0x0097, B:42:0x00a6, B:43:0x00ae, B:44:0x00b1, B:45:0x00b2, B:20:0x0040, B:23:0x0047, B:33:0x007e, B:35:0x0083, B:38:0x0094), top: B:54:0x0022, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0083 A[Catch: all -> 0x0092, LOOP:0: B:34:0x0081->B:35:0x0083, LOOP_END, TryCatch #0 {all -> 0x0092, blocks: (B:33:0x007e, B:35:0x0083, B:38:0x0094), top: B:52:0x007e, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cb, code lost:
    
        if (defpackage.au0.j(r7, r0) == r5) goto L47;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00cb -> B:14:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(wd0 wd0Var) {
        wa waVar;
        j03 j03Var;
        xv xvVar;
        j03 j03Var2;
        xv xvVar2;
        int i;
        int i2;
        Handler handler;
        Object objB;
        if (wd0Var instanceof wa) {
            waVar = (wa) wd0Var;
            int i3 = waVar.r;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                waVar.r = i3 - Integer.MIN_VALUE;
            } else {
                waVar = new wa(this, wd0Var);
            }
        } else {
            waVar = new wa(this, wd0Var);
        }
        Object obj = waVar.p;
        int i4 = waVar.r;
        qi qiVar = this.I;
        xe0 xe0Var = xe0.n;
        try {
            if (i4 == 0) {
                kb4.X(obj);
                j03Var = new j03();
                aw awVar = this.J;
                awVar.getClass();
                xvVar = new xv(awVar);
                waVar.n = j03Var;
                waVar.o = xvVar;
                waVar.r = 1;
                objB = xvVar.b(waVar);
                if (objB == xe0Var) {
                    xv xvVar3 = xvVar;
                    j03Var2 = j03Var;
                    obj = objB;
                    xvVar2 = xvVar3;
                    if (!((Boolean) obj).booleanValue()) {
                        qiVar.clear();
                        return j15.a;
                    }
                    xvVar2.c();
                    if (v()) {
                        Trace.beginSection("Compose:semantics:boundUpdates");
                        i = qiVar.p;
                        for (i2 = 0; i2 < i; i2++) {
                            c72 c72Var = (c72) qiVar.o[i2];
                            I(c72Var, j03Var2);
                            J(c72Var);
                        }
                        j03Var2.b();
                        Trace.endSection();
                        handler = this.q.getHandler();
                        if (!this.V) {
                            this.V = true;
                            handler.post(this.X);
                        }
                    }
                    qiVar.clear();
                    this.C.c();
                    this.D.c();
                    long j = this.u;
                    waVar.n = j03Var2;
                    waVar.o = xvVar2;
                    waVar.r = 2;
                }
                return xe0Var;
            }
            if (i4 == 1) {
                xvVar2 = waVar.o;
                j03Var2 = waVar.n;
                kb4.X(obj);
                if (!((Boolean) obj).booleanValue()) {
                    qiVar.clear();
                    return j15.a;
                }
                xvVar2.c();
                if (v()) {
                    try {
                        Trace.beginSection("Compose:semantics:boundUpdates");
                        i = qiVar.p;
                        while (i2 < i) {
                            c72 c72Var2 = (c72) qiVar.o[i2];
                            I(c72Var2, j03Var2);
                            J(c72Var2);
                        }
                        j03Var2.b();
                        Trace.endSection();
                        handler = this.q.getHandler();
                        if (!this.V && handler != null) {
                            this.V = true;
                            handler.post(this.X);
                        }
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
                qiVar.clear();
                this.C.c();
                this.D.c();
                long j2 = this.u;
                waVar.n = j03Var2;
                waVar.o = xvVar2;
                waVar.r = 2;
            } else {
                if (i4 != 2) {
                    kf2.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xvVar2 = waVar.o;
                j03Var2 = waVar.n;
                kb4.X(obj);
            }
            j03Var = j03Var2;
            xvVar = xvVar2;
            waVar.n = j03Var;
            waVar.o = xvVar;
            waVar.r = 1;
            objB = xvVar.b(waVar);
            if (objB == xe0Var) {
                xv xvVar4 = xvVar;
                j03Var2 = j03Var;
                obj = objB;
                xvVar2 = xvVar4;
                if (!((Boolean) obj).booleanValue()) {
                    qiVar.clear();
                    return j15.a;
                }
                xvVar2.c();
                if (v()) {
                    Trace.beginSection("Compose:semantics:boundUpdates");
                    i = qiVar.p;
                    while (i2 < i) {
                        c72 c72Var3 = (c72) qiVar.o[i2];
                        I(c72Var3, j03Var2);
                        J(c72Var3);
                    }
                    j03Var2.b();
                    Trace.endSection();
                    handler = this.q.getHandler();
                    if (!this.V) {
                        this.V = true;
                        handler.post(this.X);
                    }
                }
                qiVar.clear();
                this.C.c();
                this.D.c();
                long j3 = this.u;
                waVar.n = j03Var2;
                waVar.o = xvVar2;
                waVar.r = 2;
            }
            return xe0Var;
        } catch (Throwable th2) {
            qiVar.clear();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00f9  */
    public final boolean m(int i, long j, boolean z) {
        p94 p94Var;
        int i2;
        if (h12.c(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            e02 e02VarS = s();
            if (!g83.b(j, 9205357640488583168L) && (((9223372034707292159L & j) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                if (z) {
                    p94Var = n94.v;
                } else {
                    if (z) {
                        er1.n();
                        return false;
                    }
                    p94Var = n94.u;
                }
                Object[] objArr = e02VarS.c;
                long[] jArr = e02VarS.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    boolean z2 = false;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8;
                            int i5 = 8 - ((~(i3 - length)) >>> 31);
                            int i6 = 0;
                            while (i6 < i5) {
                                if ((255 & j2) < 128) {
                                    k94 k94Var = (k94) objArr[(i3 << 3) + i6];
                                    k02 k02Var = k94Var.b;
                                    float f = k02Var.a;
                                    i2 = i4;
                                    float f2 = k02Var.b;
                                    float f3 = k02Var.c;
                                    float f4 = k02Var.d;
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                                    if ((fIntBitsToFloat2 < f4) & (fIntBitsToFloat >= f) & (fIntBitsToFloat < f3) & (fIntBitsToFloat2 >= f2)) {
                                        Object objG = k94Var.a.d.n.g(p94Var);
                                        if (objG == null) {
                                            objG = null;
                                        }
                                        h64 h64Var = (h64) objG;
                                        if (h64Var != null) {
                                            v82 v82Var = h64Var.a;
                                            if (i < 0) {
                                                if (((Number) v82Var.invoke()).floatValue() > 0.0f) {
                                                    z2 = true;
                                                }
                                            } else if (((Number) v82Var.invoke()).floatValue() < ((Number) h64Var.b.invoke()).floatValue()) {
                                                z2 = true;
                                            }
                                        }
                                    }
                                } else {
                                    i2 = i4;
                                }
                                j2 >>= i2;
                                i6++;
                                i4 = i2;
                            }
                            if (i5 != i4) {
                                return z2;
                            }
                        }
                        if (i3 == length) {
                            return z2;
                        }
                        i3++;
                    }
                }
            }
        }
        return false;
    }

    public final void n() {
        Trace.beginSection("Compose:semantics:sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (v()) {
                B(this.q.getSemanticsOwner().a(), this.U);
            }
            Trace.endSection();
            Trace.beginSection("Compose:semantics:sendSemanticsPropertyChangeEvents");
            try {
                H(s());
                Trace.endSection();
                Trace.beginSection("Compose:semantics:updateSemanticsNodesCopyAndPanes");
                try {
                    Q();
                } finally {
                    Trace.endSection();
                }
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final AccessibilityEvent o(int i, int i2) {
        k94 k94Var;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        ra raVar = this.q;
        accessibilityEventObtain.setPackageName(raVar.getContext().getPackageName());
        accessibilityEventObtain.setSource(raVar, i);
        if (v() && (k94Var = (k94) s().b(i)) != null) {
            i94 i94Var = k94Var.a;
            accessibilityEventObtain.setPassword(i94Var.d.n.c(n94.J));
            Object objG = i94Var.d.n.g(n94.n);
            if (objG == null) {
                objG = null;
            }
            boolean zC = h12.c(objG, Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                a3.m(accessibilityEventObtain, zC);
            }
        }
        return accessibilityEventObtain;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.v = null;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.v = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager = this.t;
        if (accessibilityManager.isEnabled()) {
            this.v = null;
        }
        accessibilityManager.addAccessibilityStateChangeListener(this);
        accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.q.getHandler();
        handler.getClass();
        handler.removeCallbacks(this.X);
        AccessibilityManager accessibilityManager = this.t;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        accessibilityManager.removeTouchExplorationStateChangeListener(this);
    }

    public final AccessibilityEvent p(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventO = o(i, 8192);
        if (num != null) {
            accessibilityEventO.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventO.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventO.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventO.getText().add(charSequence);
        }
        return accessibilityEventO;
    }

    public final int q(i94 i94Var) {
        e94 e94Var = i94Var.d;
        if (!e94Var.n.c(n94.a)) {
            p94 p94Var = n94.E;
            if (e94Var.n.c(p94Var)) {
                return (int) (((ss4) e94Var.d(p94Var)).a & 4294967295L);
            }
        }
        return this.G;
    }

    public final int r(i94 i94Var) {
        e94 e94Var = i94Var.d;
        if (!e94Var.n.c(n94.a)) {
            p94 p94Var = n94.E;
            if (e94Var.n.c(p94Var)) {
                return (int) (((ss4) e94Var.d(p94Var)).a >> 32);
            }
        }
        return this.G;
    }

    public final e02 s() {
        if (this.K) {
            this.K = false;
            ra raVar = this.q;
            this.M = wr1.o(raVar.getSemanticsOwner(), new k2(2, (byte) 0));
            if (v()) {
                i03 i03Var = this.M;
                Resources resources = raVar.getContext().getResources();
                g03 g03Var = this.O;
                g03Var.a();
                g03 g03Var2 = this.P;
                g03Var2.a();
                k94 k94Var = (k94) i03Var.b(-1);
                i94 i94Var = k94Var != null ? k94Var.a : null;
                i94Var.getClass();
                ArrayList arrayListB = r94.b(i94Var, new x(5, i03Var), new x(6, resources), gb.O(i94Var));
                int i = 1;
                int size = arrayListB.size() - 1;
                if (1 <= size) {
                    while (true) {
                        int i2 = ((i94) arrayListB.get(i - 1)).f;
                        int i3 = ((i94) arrayListB.get(i)).f;
                        g03Var.f(i2, i3);
                        g03Var2.f(i3, i2);
                        if (i == size) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.M;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0075 A[LOOP:0: B:4:0x0016->B:36:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x0078 A[EDGE_INSN: B:47:0x0078->B:37:0x0078 BREAK  A[LOOP:0: B:4:0x0016->B:36:0x0075], SYNTHETIC] */
    public final wv3 u(i94 i94Var, Rect rect, ac4 ac4Var) {
        xa xaVar = new xa(ac4Var);
        c72 c72Var = i94Var.c;
        cx2 cx2Var = (cx2) c72Var.Q.g;
        eo0 eo0Var = null;
        if ((cx2Var.q & 8) != 0) {
            loop0: while (cx2Var != null) {
                if ((cx2Var.p & 8) == 0) {
                    if ((cx2Var.q & 8) != 0) {
                        break;
                        break;
                    }
                    cx2Var = cx2Var.s;
                } else {
                    cx2 cx2VarC = cx2Var;
                    f13 f13Var = null;
                    while (cx2VarC != null) {
                        if (cx2VarC instanceof g94) {
                            ((g94) cx2VarC).c0(xaVar);
                            if (xaVar.n) {
                                eo0Var = cx2VarC;
                                break loop0;
                            }
                        } else if ((cx2VarC.p & 8) != 0 && (cx2VarC instanceof fo0)) {
                            int i = 0;
                            for (cx2 cx2Var2 = ((fo0) cx2VarC).C; cx2Var2 != null; cx2Var2 = cx2Var2.s) {
                                if ((cx2Var2.p & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        cx2VarC = cx2Var2;
                                    } else {
                                        if (f13Var == null) {
                                            f13Var = new f13(new cx2[16]);
                                        }
                                        if (cx2VarC != null) {
                                            f13Var.b(cx2VarC);
                                            cx2VarC = null;
                                        }
                                        f13Var.b(cx2Var2);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        cx2VarC = j51.c(f13Var);
                    }
                    if ((cx2Var.q & 8) != 0) {
                        break;
                    }
                    cx2Var = cx2Var.s;
                }
            }
        }
        eo0 eo0Var2 = (g94) eo0Var;
        if (eo0Var2 == null || !((cx2) eo0Var2).n.A) {
            return wr1.d((f63) c72Var.Q.e, false);
        }
        f63 f63VarN = j51.N(eo0Var2);
        wv3 wv3VarC = wr1.n(f63VarN).C(f63VarN, false);
        Rect rectM = M(wv3VarC.a, wv3VarC.b, wv3VarC.c, wv3VarC.d);
        float f = rectM.left - rect.left;
        float f2 = rectM.top - rect.top;
        return new wv3(f, f2, rectM.width() + f, rectM.height() + f2);
    }

    public final boolean v() {
        AccessibilityManager accessibilityManager = this.t;
        if (!accessibilityManager.isEnabled()) {
            return false;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.v;
        if (enabledAccessibilityServiceList == null) {
            enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
            this.v = enabledAccessibilityServiceList;
        }
        return !enabledAccessibilityServiceList.isEmpty();
    }

    public final void w(c72 c72Var) {
        if (this.I.add(c72Var)) {
            this.J.d(j15.a);
        }
    }
}
