package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import app.homemusic.R;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l85 extends dx4 {
    public static final String[] L = null;
    public int K;

    static {
        L = new String[]{"android:visibility:visibility", "android:visibility:parent"};
    }

    public l85() {
        this.K = 3;
    }

    public static void F(mx4 r3) {
        View r0 = r3.b;
        int r1 = r0.getVisibility();
        HashMap r4 = r3.a;
        r4.put("android:visibility:visibility", Integer.valueOf(r1));
        r4.put("android:visibility:parent", r0.getParent());
        int[] r2 = new int[2];
        r0.getLocationOnScreen(r2);
        r4.put("android:visibility:screenLocation", r2);
    }

    public static ez3 G(mx4 r8, mx4 r9) {
        ez3 r0 = new ez3();
        r0.a = false;
        r0.b = false;
        if (r8 == null) goto L7;
        HashMap r6 = r8.a;
        if (r6.containsKey("android:visibility:visibility") == false) goto L7;
        r0.c = ((Integer) r6.get("android:visibility:visibility")).intValue();
        r0.e = (ViewGroup) r6.get("android:visibility:parent");
    L8:
        if (r9 == null) goto L12;
        HashMap r7 = r9.a;
        if (r7.containsKey("android:visibility:visibility") == false) goto L12;
        r0.d = ((Integer) r7.get("android:visibility:visibility")).intValue();
        r0.f = (ViewGroup) r7.get("android:visibility:parent");
    L14:
        if (r8 == null) goto L36;
        if (r9 == null) goto L36;
        int r10 = r0.c;
        int r11 = r0.d;
        if (r10 == r11) goto L19;
    L21:
        if (r10 == r11) goto L29;
        if (r10 != 0) goto L25;
        r0.b = false;
        r0.a = true;
        return r0;
    L25:
        if (r11 != 0) goto L45;
        r0.b = true;
        r0.a = true;
        return r0;
    L45:
        return r0;
    L29:
        if (((ViewGroup) r0.f) != null) goto L33;
        r0.b = false;
        r0.a = true;
        return r0;
    L33:
        if (((ViewGroup) r0.e) != null) goto L45;
        r0.b = true;
        r0.a = true;
        return r0;
    L19:
        if (((ViewGroup) r0.e) != ((ViewGroup) r0.f)) goto L21;
    L36:
        if (r8 == null) goto L38;
    L41:
        if (r9 != null) goto L45;
        if (r0.c != 0) goto L45;
        r0.b = false;
        r0.a = true;
        goto L45
    L38:
        if (r0.d != 0) goto L41;
        r0.b = true;
        r0.a = true;
        return r0;
    L12:
        r0.d = -1;
        r0.f = null;
    L7:
        r0.c = -1;
        r0.e = null;
        goto L8
    }

    public abstract ObjectAnimator H(ViewGroup r1, View r2, mx4 r3, mx4 r4);

    public abstract ObjectAnimator I(ViewGroup r1, View r2, mx4 r3);

    @Override // defpackage.dx4
    public void c(mx4 r1) {
        F(r1);
    }

    @Override // defpackage.dx4
    public final Animator j(ViewGroup r24, mx4 r25, mx4 r26) {
        ez3 r4 = G(r25, r26);
        if (r4.a == true) goto L5;
    L9:
        return null;
    L5:
        if (((ViewGroup) r4.e) == null) goto L7;
    L10:
        int r7 = 1;
        if (r4.b == true) goto L13;
        int r5 = r4.d;
        if ((this.K & 2) != 2) goto L9;
        if (r25 == null) goto L9;
        View r6 = r25.b;
        if (r26 == null) goto L31;
        View r3 = r26.b;
    L32:
        View r11 = (View) r6.getTag(R.id.save_overlay_view);
        if (r11 == null) goto L35;
        int r19 = r5;
        char r17 = 1;
        int r18 = 0;
        View r8 = null;
        Animator r16 = null;
    L86:
        if (r11 == null) goto L97;
        if (r7 != 0) goto L89;
        int[] r0 = (int[]) r25.a.get("android:visibility:screenLocation");
        int r9 = r0[r18];
        int r1 = r0[r17];
        int[] r10 = new int[2];
        r24.getLocationOnScreen(r10);
        r11.offsetLeftAndRight((r9 - r10[r18]) - r11.getLeft());
        r11.offsetTopAndBottom((r1 - r10[r17]) - r11.getTop());
        r24.getOverlay().add(r11);
    L89:
        ObjectAnimator r2 = I(r24, r11, r25);
        if (r7 != 0) goto L95;
        if (r2 != null) goto L94;
        r24.getOverlay().remove(r11);
        return r2;
    L94:
        r6.setTag(R.id.save_overlay_view, r11);
        a(new j85(this, r24, r11, r6));
    L95:
        return r2;
    L97:
        if (r8 == null) goto L105;
        int r12 = r8.getVisibility();
        f85 r13 = d85.a;
        r13.W(r8, r18);
        ObjectAnimator r14 = I(r24, r8, r25);
        if (r14 == null) goto L102;
        k85 r15 = new k85(r8, r19);
        r14.addListener(r15);
        r14.addPauseListener(r15);
        a(r15);
        return r14;
    L102:
        r13.W(r8, r12);
        return r14;
    L105:
        return r16;
    L35:
        if (r3 != null) goto L37;
    L46:
        if (r3 != null) goto L47;
    L44:
        boolean r110 = true;
        r3 = null;
    L45:
        View r111 = null;
    L48:
        if (r110 == true) goto L50;
    L84:
        r19 = r5;
        r17 = 1;
        r18 = 0;
        View r21 = r111;
        r16 = null;
    L85:
        r11 = r3;
    L78:
        r7 = r18;
        r8 = r21;
        goto L86
    L50:
        if (r6.getParent() != null) goto L53;
        r19 = r5;
        r17 = 1;
        r7 = 0;
        r18 = 0;
        r8 = r111;
        r16 = null;
        r11 = r6;
        goto L86
    L53:
        if ((r6.getParent() instanceof View) == false) goto L84;
        View r112 = (View) r6.getParent();
        if (G(p(r112, true), m(r112, true)).a == true) goto L79;
        boolean r20 = lx4.a;
        Matrix r22 = new Matrix();
        r22.setTranslate(-r112.getScrollX(), -r112.getScrollY());
        f85 r113 = d85.a;
        r113.X(r6, r22);
        r113.Y(r24, r22);
        RectF r114 = new RectF(0.0f, 0.0f, r6.getWidth(), r6.getHeight());
        r22.mapRect(r114);
        int r115 = Math.round(r114.left);
        int r116 = Math.round(r114.top);
        int r117 = Math.round(r114.right);
        r16 = null;
        int r23 = Math.round(r114.bottom);
        r17 = 1;
        r18 = 0;
        ImageView r27 = new ImageView(r6.getContext());
        r27.setScaleType(ImageView.ScaleType.CENTER_CROP);
        boolean r28 = r6.isAttachedToWindow();
        if (r24 != null) goto L59;
        boolean r118 = false;
    L60:
        if (r28 == true) goto L64;
        if (r118 == true) goto L63;
        r19 = r5;
        r21 = r111;
        Bitmap r29 = null;
    L75:
        if (r29 == null) goto L77;
        r27.setImageBitmap(r29);
    L77:
        r27.measure(View.MeasureSpec.makeMeasureSpec(r117 - r115, 1073741824), View.MeasureSpec.makeMeasureSpec(r23 - r116, 1073741824));
        r27.layout(r115, r116, r117, r23);
        r11 = r27;
        goto L78
    L63:
        ViewGroup r119 = (ViewGroup) r6.getParent();
        int r120 = r119.indexOfChild(r6);
        r24.getOverlay().add(r6);
        int r30 = r120;
    L65:
        int r31 = Math.round(r114.width());
        r21 = r111;
        int r121 = Math.round(r114.height());
        if (r31 <= 0) goto L72;
        if (r121 <= 0) goto L72;
        r19 = r5;
        float r32 = Math.min(1.0f, 1048576.0f / (r31 * r121));
        int r33 = Math.round(r31 * r32);
        int r34 = Math.round(r121 * r32);
        r22.postTranslate(-r114.left, -r114.top);
        r22.postScale(r32, r32);
        if (lx4.a == false) goto L71;
        Picture r35 = new Picture();
        Canvas r36 = r35.beginRecording(r33, r34);
        r36.concat(r22);
        r6.draw(r36);
        r35.endRecording();
        r29 = vl4.b(r35);
    L73:
        if (r28 == true) goto L75;
        r24.getOverlay().remove(r6);
        r119.addView(r6, r30);
        goto L75
    L71:
        r29 = Bitmap.createBitmap(r33, r34, Bitmap.Config.ARGB_8888);
        Canvas r37 = new Canvas(r29);
        r37.concat(r22);
        r6.draw(r37);
    L72:
        r19 = r5;
        r29 = null;
        goto L73
    L64:
        r119 = null;
        r30 = 0;
        goto L65
    L59:
        r118 = r24.isAttachedToWindow();
        goto L60
    L79:
        r19 = r5;
        r17 = 1;
        r18 = 0;
        r21 = r111;
        r16 = null;
        int r38 = r112.getId();
        if (r112.getParent() != null) goto L85;
        if (r38 == (-1)) goto L85;
        r24.findViewById(r38);
        goto L85
    L47:
        r110 = false;
        goto L45
    L37:
        if (r3.getParent() == null) goto L46;
        if (r5 == 4) goto L43;
        if (r6 != r3) goto L44;
    L43:
        r111 = r3;
        r110 = false;
        r3 = null;
        goto L48
    L31:
        r3 = null;
        goto L32
    L13:
        if ((this.K & 1) != 1) goto L9;
        if (r26 == null) goto L9;
        View r39 = r26.b;
        if (r25 != null) goto L22;
        View r40 = (View) r39.getParent();
        if (G(m(r40, false), p(r40, false)).a == true) goto L9;
    L22:
        return H(r24, r39, r25, r26);
    L7:
        if (((ViewGroup) r4.f) == null) goto L9;
        goto L9
    }

    @Override // defpackage.dx4
    public final String[] o() {
        return L;
    }

    @Override // defpackage.dx4
    public final boolean q(mx4 r3, mx4 r4) {
        if (r3 != null) goto L5;
        if (r4 != null) goto L5;
        return false;
    L5:
        if (r3 == null) goto L10;
        if (r4 == null) goto L10;
        if (r4.a.containsKey("android:visibility:visibility") == r3.a.containsKey("android:visibility:visibility")) goto L10;
        return false;
    L10:
        ez3 r2 = G(r3, r4);
        if (r2.a == true) goto L13;
        return false;
    L13:
        if (r2.c != 0) goto L15;
        return true;
    L15:
        if (r2.d != 0) goto L21;
        return true;
    L21:
        return false;
    }
}
