package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class r00 extends Property {
    public final /* synthetic */ int a;

    public /* synthetic */ r00(Class r1, String r2, int r3) {
        this.a = r3;
        super(r1, r2);
    }

    @Override // android.util.Property
    public final Object get(Object r2) {
        switch(this.a) {
            case 0: goto L36;
            case 1: goto L34;
            case 2: goto L32;
            case 3: goto L30;
            case 4: goto L28;
            case 5: goto L27;
            case 6: goto L25;
            case 7: goto L23;
            case 8: goto L21;
            case 9: goto L19;
            case 10: goto L16;
            case 11: goto L14;
            case 12: goto L13;
            case 13: goto L11;
            case 14: goto L9;
            case 15: goto L7;
            default: goto L4;
        };
    L4:
        WeakHashMap r1 = j65.a;
        return ((View) r2).getClipBounds();
    L14:
        WeakHashMap r3 = j65.a;
        return Float.valueOf(((View) r2).getPaddingEnd());
    L16:
        WeakHashMap r4 = j65.a;
        return Float.valueOf(((View) r2).getPaddingStart());
    L28:
        View r5 = (View) r2;
        return null;
    L30:
        View r6 = (View) r2;
        return null;
    L32:
        View r7 = (View) r2;
        return null;
    L34:
        u00 r8 = (u00) r2;
        return null;
    L36:
        u00 r9 = (u00) r2;
        return null;
    L7:
        return Float.valueOf(d85.a.D((View) r2));
    L9:
        return Float.valueOf(((SwitchCompat) r2).M);
    L11:
        return Float.valueOf(((xa2) r2).j);
    L13:
        return Float.valueOf(((va2) r2).i);
    L19:
        return Float.valueOf(((View) r2).getLayoutParams().height);
    L21:
        return Float.valueOf(((View) r2).getLayoutParams().width);
    L23:
        return Float.valueOf(((cw0) r2).b());
    L25:
        return Float.valueOf(((a30) r2).j);
    L27:
        return Float.valueOf(((a30) r2).i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.util.Property
    public final void set(Object r16, Object r17) {
        boolean r7 = false;
        switch(this.a) {
            case 0: goto L62;
            case 1: goto L58;
            case 2: goto L56;
            case 3: goto L54;
            case 4: goto L52;
            case 5: goto L39;
            case 6: goto L37;
            case 7: goto L33;
            case 8: goto L31;
            case 9: goto L29;
            case 10: goto L27;
            case 11: goto L25;
            case 12: goto L18;
            case 13: goto L10;
            case 14: goto L8;
            case 15: goto L6;
            default: goto L4;
        };
    L4:
        WeakHashMap r2 = j65.a;
        ((View) r16).setClipBounds((Rect) r17);
        return;
    L6:
        float r1 = ((Float) r17).floatValue();
        d85.a.R((View) r16, r1);
        return;
    L8:
        ((SwitchCompat) r16).setThumbPosition(((Float) r17).floatValue());
        return;
    L10:
        xa2 r0 = (xa2) r16;
        float r3 = ((Float) r17).floatValue();
        r0.j = r3;
        int r4 = (int) (r3 * 1800.0f);
        int r5 = 0;
    L11:
        if (r5 >= 4) goto L14;
        ((float[]) r0.b)[r5] = Math.max(0.0f, Math.min(1.0f, r0.f[r5].getInterpolation((r4 - xa2.m[r5]) / xa2.l[r5])));
        r5 = r5 + 1;
        goto L11
    L14:
        if (r0.i == false) goto L16;
        Arrays.fill((int[]) r0.c, g12.l(r0.g.c[r0.h], ((sx1) r0.a).w));
        r0.i = false;
    L16:
        ((sx1) r0.a).invalidateSelf();
        return;
    L18:
        va2 r6 = (va2) r16;
        float r8 = ((Float) r17).floatValue();
        r6.i = r8;
        int r9 = (int) (r8 * 333.0f);
        float[] r10 = (float[]) r6.b;
        r10[0] = 0.0f;
        float r11 = r9 / 667.0f;
        a61 r12 = r6.e;
        float r13 = r12.getInterpolation(r11);
        r10[2] = r13;
        r10[1] = r13;
        float r14 = r12.getInterpolation(r11 + 0.49925038f);
        r10[4] = r14;
        r10[3] = r14;
        r10[5] = 1.0f;
        if (r6.h == true) goto L21;
    L23:
        ((sx1) r6.a).invalidateSelf();
        return;
    L21:
        if (r14 >= 1.0f) goto L23;
        int[] r15 = (int[]) r6.c;
        r15[2] = r15[1];
        r15[1] = r15[0];
        r15[0] = g12.l(r6.f.c[r6.g], ((sx1) r6.a).w);
        r6.h = false;
        goto L23
    L25:
        View r18 = (View) r16;
        WeakHashMap r19 = j65.a;
        r18.setPaddingRelative(r18.getPaddingStart(), r18.getPaddingTop(), ((Float) r17).intValue(), r18.getPaddingBottom());
        return;
    L27:
        View r20 = (View) r16;
        int r21 = ((Float) r17).intValue();
        int r22 = r20.getPaddingTop();
        WeakHashMap r23 = j65.a;
        r20.setPaddingRelative(r21, r22, r20.getPaddingEnd(), r20.getPaddingBottom());
        return;
    L29:
        View r24 = (View) r16;
        r24.getLayoutParams().height = ((Float) r17).intValue();
        r24.requestLayout();
        return;
    L31:
        View r25 = (View) r16;
        r25.getLayoutParams().width = ((Float) r17).intValue();
        r25.requestLayout();
        return;
    L33:
        cw0 r26 = (cw0) r16;
        float r27 = ((Float) r17).floatValue();
        if (r26.u == r27) goto L72;
        r26.u = r27;
        r26.invalidateSelf();
        return;
    L72:
        return;
    L37:
        ((a30) r16).j = ((Float) r17).floatValue();
        return;
    L39:
        a30 r28 = (a30) r16;
        float r29 = ((Float) r17).floatValue();
        r28.i = r29;
        int r30 = (int) (5400.0f * r29);
        a61 r110 = r28.f;
        float[] r111 = (float[]) r28.b;
        float r31 = r29 * 1520.0f;
        r111[0] = (-20.0f) + r31;
        r111[1] = r31;
        int r32 = 0;
    L40:
        if (r32 >= 4) goto L42;
        float r112 = (r30 - a30.l[r32]) / 667.0f;
        r111[1] = (r110.getInterpolation(r112) * 250.0f) + r111[1];
        float r113 = (r30 - a30.m[r32]) / 667.0f;
        r111[0] = (r110.getInterpolation(r113) * 250.0f) + r111[0];
        r32 = r32 + 1;
        goto L40
    L42:
        float r33 = r111[0];
        float r34 = r111[1];
        float r114 = ((r34 - r33) * r28.j) + r33;
        r111[0] = r114;
        r111[0] = r114 / 360.0f;
        r111[1] = r34 / 360.0f;
        g30 r35 = r28.g;
        int r36 = 0;
    L43:
        if (r36 >= 4) goto L50;
        float r37 = (r30 - a30.n[r36]) / 333.0f;
        if (r37 < 0.0f) goto L49;
        if (r37 > 1.0f) goto L49;
        int r38 = r36 + r28.h;
        int[] r39 = r35.c;
        int r40 = r38 % r39.length;
        int r41 = (r40 + 1) % r39.length;
        int r42 = g12.l(r39[r40], ((sx1) r28.a).w);
        int r43 = g12.l(r35.c[r41], ((sx1) r28.a).w);
        float r44 = r110.getInterpolation(r37);
        int[] r45 = (int[]) r28.c;
        Integer r46 = Integer.valueOf(r42);
        Integer r47 = Integer.valueOf(r43);
        int r48 = r46.intValue();
        float r49 = ((r48 >> 24) & 255) / 255.0f;
        int r50 = r47.intValue();
        float r115 = ((r50 >> 24) & 255) / 255.0f;
        boolean r116 = r7;
        float r51 = (float) Math.pow(((r48 >> 16) & 255) / 255.0f, 2.2d);
        float r52 = (float) Math.pow(((r48 >> 8) & 255) / 255.0f, 2.2d);
        float r53 = (float) Math.pow((r48 & 255) / 255.0f, 2.2d);
        float r117 = (float) Math.pow(((r50 >> 16) & 255) / 255.0f, 2.2d);
        float r118 = (float) Math.pow(((r50 >> 8) & 255) / 255.0f, 2.2d);
        float r54 = (float) Math.pow((r50 & 255) / 255.0f, 2.2d);
        float r55 = xa3.a(r115, r49, r44, r49);
        float r56 = xa3.a(r117, r51, r44, r51);
        float r57 = xa3.a(r118, r52, r44, r52);
        float r58 = xa3.a(r54, r53, r44, r53);
        float r59 = ((float) Math.pow(r56, 0.45454545454545453d)) * 255.0f;
        float r60 = ((float) Math.pow(r57, 0.45454545454545453d)) * 255.0f;
        float r61 = ((float) Math.pow(r58, 0.45454545454545453d)) * 255.0f;
        r45[r116 ? 1 : 0] = Integer.valueOf(Math.round(r61) | (((Math.round(r59) << 16) | (Math.round(r55 * 255.0f) << 24)) | (Math.round(r60) << 8))).intValue();
    L49:
        r36 = r36 + 1;
        r7 = r7;
    L50:
        ((sx1) r28.a).invalidateSelf();
        return;
    L52:
        View r62 = (View) r16;
        PointF r63 = (PointF) r17;
        int r64 = Math.round(r63.x);
        int r65 = Math.round(r63.y);
        d85.a(r62, r64, r65, r62.getWidth() + r64, r62.getHeight() + r65);
        return;
    L54:
        View r66 = (View) r16;
        PointF r67 = (PointF) r17;
        d85.a(r66, Math.round(r67.x), Math.round(r67.y), r66.getRight(), r66.getBottom());
        return;
    L56:
        View r68 = (View) r16;
        PointF r69 = (PointF) r17;
        d85.a(r68, r68.getLeft(), r68.getTop(), Math.round(r69.x), Math.round(r69.y));
        return;
    L58:
        u00 r70 = (u00) r16;
        PointF r71 = (PointF) r17;
        r70.getClass();
        r70.c = Math.round(r71.x);
        int r72 = Math.round(r71.y);
        r70.d = r72;
        int r73 = r70.g + 1;
        r70.g = r73;
        if (r70.f != r73) goto L73;
        d85.a(r70.e, r70.a, r70.b, r70.c, r72);
        r70.f = 0;
        r70.g = 0;
        return;
    L73:
        return;
    L62:
        u00 r74 = (u00) r16;
        PointF r75 = (PointF) r17;
        r74.getClass();
        r74.a = Math.round(r75.x);
        int r76 = Math.round(r75.y);
        r74.b = r76;
        int r77 = r74.f + 1;
        r74.f = r77;
        if (r77 != r74.g) goto L74;
        d85.a(r74.e, r74.a, r76, r74.c, r74.d);
        r74.f = 0;
        r74.g = 0;
        return;
    }
}
