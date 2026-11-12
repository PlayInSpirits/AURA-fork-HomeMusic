package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bq0 {
    public final Context a;
    public final cq0 b;
    public VelocityTracker c;
    public float d;
    public int e;
    public int f;
    public int g;
    public final int[] h;

    public bq0(Context r3, cq0 r4) {
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = new int[]{Integer.MAX_VALUE, 0};
        this.a = r3;
        this.b = r4;
    }

    public final void a(MotionEvent r28, int r29) {
        int r3 = r28.getSource();
        int r4 = r28.getDeviceId();
        int r5 = this.f;
        int[] r10 = this.h;
        if (r5 == r3) goto L5;
    L10:
        Context r6 = this.a;
        ViewConfiguration r13 = ViewConfiguration.get(r6);
        int r14 = r28.getDeviceId();
        int r15 = r28.getSource();
        int r16 = 1;
        int r11 = Build.VERSION.SDK_INT;
        int r17 = 0;
        if (r11 < 34) goto L13;
        Method r19 = n65.a;
        int r18 = a3.i(r13, r14, r29, r15);
    L31:
        r10[0] = r18;
        int r110 = r28.getDeviceId();
        int r111 = r28.getSource();
        if (r11 < 34) goto L34;
        int r7 = a3.h(r13, r110, r29, r111);
    L52:
        r10[1] = r7;
        this.f = r3;
        this.g = r4;
        this.e = r29;
        boolean r12 = true;
    L53:
        int r8 = r10[r17];
        VelocityTracker r9 = this.c;
        if (r8 != Integer.MAX_VALUE) goto L58;
        if (r9 == null) goto L141;
        r9.recycle();
        this.c = null;
        return;
    L141:
        return;
    L58:
        if (r9 != null) goto L60;
        this.c = VelocityTracker.obtain();
    L60:
        VelocityTracker r20 = this.c;
        Map r21 = n45.a;
        r20.addMovement(r28);
        float r22 = 0.0f;
        int r23 = 20;
        if (Build.VERSION.SDK_INT < 34) goto L64;
    L77:
        r20.computeCurrentVelocity(1000, Float.MAX_VALUE);
        o45 r1 = (o45) n45.a.get(r20);
        if (r1 == null) goto L116;
        float[] r24 = r1.a;
        long[] r25 = r1.b;
        int r112 = r1.d;
        if (r112 >= 2) goto L82;
    L81:
        float r26 = 0.0f;
        float r27 = 0.0f;
    L110:
        float r30 = r26 * 1000.0f;
        r1.c = r30;
        if (r30 >= (-Math.abs(r4))) goto L114;
        r1.c = -Math.abs(Float.MAX_VALUE);
    L118:
        if (Build.VERSION.SDK_INT < 34) goto L120;
        float r2 = a3.d(r20, r29);
    L132:
        cq0 r31 = this.b;
        float r32 = r31.s() * r2;
        float r33 = Math.signum(r32);
        if (r12 == false) goto L135;
    L138:
        r31.t();
    L140:
        if (Math.abs(r32) < r10[0]) goto L153;
        int r34 = r10[1];
        float r35 = Math.max(-r34, Math.min(r32, r34));
        if (r31.p(r35) == false) goto L145;
        float r36 = r35;
    L146:
        this.d = r36;
        return;
    L145:
        r36 = r27;
        goto L146
    L153:
        return;
    L135:
        if (r33 == Math.signum(this.d)) goto L140;
        if (r33 == r27) goto L140;
    L120:
        if (r29 != 0) goto L123;
        r2 = r20.getXVelocity();
        goto L132
    L123:
        if (r29 != 1) goto L125;
        r2 = r20.getYVelocity();
        goto L132
    L125:
        o45 r37 = (o45) n45.a.get(r20);
        if (r37 != null) goto L128;
    L131:
        r2 = r27;
        goto L132
    L128:
        if (r29 != 26) goto L131;
        r2 = r37.c;
        goto L132
    L114:
        if (r1.c <= Math.abs(r4)) goto L118;
        r1.c = Math.abs(r4);
        goto L118
    L82:
        int r113 = r1.e;
        int r114 = ((r113 + 20) - (r112 - 1)) % 20;
        long r115 = r25[r113];
    L83:
        long r210 = r25[r114];
        long r211 = r115 - r210;
        int r116 = r1.d;
        if (r211 <= 100) goto L86;
        r1.d = r116 - 1;
        r114 = (r114 + 1) % 20;
        goto L83
    L86:
        if (r116 < 2) goto L81;
        if (r116 != 2) goto L93;
        int r117 = (r114 + 1) % 20;
        long r118 = r25[r117];
        if (r210 == r118) goto L81;
        r26 = r24[r117] / (r118 - r210);
        r27 = 0.0f;
        goto L110
    L93:
        float r119 = 0.0f;
        int r120 = 0;
        int r121 = 0;
    L94:
        float r122 = 1.0f;
        if (r120 >= (r1.d - 1)) goto L106;
        int r38 = r120 + r114;
        long r212 = r25[r38 % 20];
        int r39 = (r38 + 1) % r23;
        if (r25[r39] != r212) goto L99;
        float r213 = r22;
        float[] r214 = r24;
    L105:
        r120 = r120 + 1;
        r22 = r213;
        r24 = r214;
        r23 = 20;
        r16 = 1;
        goto L94
    L99:
        r121 = r121 + 1;
        if (r119 >= r22) goto L102;
        r122 = -1.0f;
    L102:
        r213 = r22;
        r214 = r24;
        float r123 = r122 * ((float) Math.sqrt(Math.abs(r119) * 2.0f));
        float r40 = r214[r39] / (r25[r39] - r212);
        r119 = r119 + (Math.abs(r40) * (r40 - r123));
        if (r121 != r16) goto L105;
        r119 = r119 * 0.5f;
        goto L105
    L106:
        r27 = r22;
        if (r119 >= r27) goto L109;
        r122 = -1.0f;
    L109:
        r26 = r122 * ((float) Math.sqrt(Math.abs(r119) * 2.0f));
        goto L110
    L116:
        r27 = 0.0f;
        goto L118
    L64:
        if (r28.getSource() != 4194304) goto L77;
        Map r41 = n45.a;
        if (r41.containsKey(r20) == true) goto L68;
        r41.put(r20, new o45());
    L68:
        o45 r42 = (o45) r41.get(r20);
        long[] r43 = r42.b;
        long r124 = r28.getEventTime();
        if (r42.d != 0) goto L71;
    L73:
        int r44 = (r42.e + 1) % 20;
        r42.e = r44;
        int r125 = r42.d;
        if (r125 == 20) goto L76;
        r42.d = r125 + 1;
    L76:
        r42.a[r44] = r28.getAxisValue(26);
        r43[r42.e] = r124;
        goto L77
    L71:
        if ((r124 - r43[r42.e]) <= 40) goto L73;
        r42.d = r17;
        r42.c = 0.0f;
        goto L73
    L34:
        InputDevice r126 = InputDevice.getDevice(r110);
        if (r126 != null) goto L37;
    L51:
        r7 = Integer.MIN_VALUE;
        goto L52
    L37:
        if (r126.getMotionRange(r29, r111) == null) goto L51;
        Resources r45 = r6.getResources();
        if (r111 == 4194304) goto L41;
    L43:
        int r46 = -1;
    L44:
        Objects.requireNonNull(r13);
        if (r46 == (-1)) goto L50;
        if (r46 == 0) goto L51;
        r7 = r45.getDimensionPixelSize(r46);
        if (r7 >= 0) goto L52;
    L50:
        r7 = r13.getScaledMaximumFlingVelocity();
        goto L52
    L41:
        if (r29 != 26) goto L43;
        r46 = r45.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android");
        goto L44
    L13:
        Method r127 = n65.a;
        InputDevice r128 = InputDevice.getDevice(r14);
        if (r128 != null) goto L16;
    L30:
        r18 = Integer.MAX_VALUE;
        goto L31
    L16:
        if (r128.getMotionRange(r29, r15) == null) goto L30;
        Resources r129 = r6.getResources();
        if (r15 == 4194304) goto L20;
    L22:
        int r130 = -1;
    L23:
        Objects.requireNonNull(r13);
        if (r130 == (-1)) goto L29;
        if (r130 == 0) goto L30;
        r18 = r129.getDimensionPixelSize(r130);
        if (r18 >= 0) goto L31;
    L29:
        r18 = r13.getScaledMinimumFlingVelocity();
        goto L31
    L20:
        if (r29 != 26) goto L22;
        r130 = r129.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android");
        goto L23
    L5:
        if (this.g != r4) goto L10;
        if (this.e != r29) goto L10;
        r12 = false;
        r16 = 1;
        r17 = 0;
        goto L53
    }
}
