package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.R;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e22 {
    public static final c22 d = null;
    public static final c22 e = null;
    public final /* synthetic */ int a;
    public int b;
    public final int c;

    static {
        d = new c22(0);
        e = new c22(1);
    }

    public /* synthetic */ e22(int r3, int r4, int r5) {
        this.a = 1;
        if ((r5 & 1) == 0) goto L6;
        r3 = 0;
    L6:
        if ((r5 & 2) == 0) goto L8;
        r4 = 0;
    L8:
        this(r3, r4);
    }

    public static int b(int r3, int r4) {
        int r1 = r3 & 3158064;
        if (r1 != 0) goto L5;
        return r3;
    L5:
        int r5 = r3 & (~r1);
        if (r4 != 0) goto L10;
        int r6 = r1 >> 2;
    L9:
        return r5 | r6;
    L10:
        int r7 = r1 >> 1;
        r5 = r5 | ((-3158065) & r7);
        r6 = (r7 & 3158064) >> 2;
        goto L9
    }

    public static int c(int r3, int r4) {
        int r1 = r3 & 789516;
        if (r1 != 0) goto L5;
        return r3;
    L5:
        int r5 = r3 & (~r1);
        if (r4 != 0) goto L10;
        int r6 = r1 << 2;
    L9:
        return r5 | r6;
    L10:
        int r7 = r1 << 1;
        r5 = r5 | ((-789517) & r7);
        r6 = (r7 & 789516) << 2;
        goto L9
    }

    public static void g(RecyclerView r6, cx3 r7, float r8, float r9, boolean r10) {
        View r11 = r7.a;
        if (r10 == true) goto L5;
    L16:
        r11.setTranslationX(r8);
        r11.setTranslationY(r9);
        return;
    L5:
        if (r11.getTag(R.id.item_touch_helper_previous_elevation) != null) goto L16;
        WeakHashMap r0 = j65.a;
        Float r1 = Float.valueOf(r11.getElevation());
        int r2 = r6.getChildCount();
        float r3 = 0.0f;
        int r4 = 0;
    L7:
        if (r4 >= r2) goto L15;
        View r5 = r6.getChildAt(r4);
        if (r5 == r11) goto L14;
        WeakHashMap r12 = j65.a;
        float r13 = r5.getElevation();
        if (r13 <= r3) goto L14;
        r3 = r13;
    L14:
        r4 = r4 + 1;
        goto L7
    L15:
        r11.setElevation(r3 + 1.0f);
        r11.setTag(R.id.item_touch_helper_previous_elevation, r1);
        goto L16
    }

    public void a(RecyclerView r2, cx3 r3) {
        View r1 = r3.a;
        Object r4 = r1.getTag(R.id.item_touch_helper_previous_elevation);
        if ((r4 instanceof Float) == false) goto L5;
        float r5 = ((Float) r4).floatValue();
        WeakHashMap r0 = j65.a;
        r1.setElevation(r5);
    L5:
        r1.setTag(R.id.item_touch_helper_previous_elevation, null);
        r1.setTranslationX(0.0f);
        r1.setTranslationY(0.0f);
    }

    public abstract void d(x20 r1, bi r2, lg4 r3, uy3 r4, wa3 r5);

    public mg1 e(x20 r1) {
        return null;
    }

    public int f(RecyclerView r4, int r5, int r6, long r7) {
        if (this.b != (-1)) goto L5;
        this.b = r4.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
    L5:
        int r3 = this.b;
        int r8 = Math.abs(r6);
        int r0 = (int) Math.signum(r6);
        float r2 = 1.0f;
        int r9 = (int) (e.getInterpolation(Math.min(1.0f, (r8 * 1.0f) / r5)) * (r0 * r3));
        if (r7 > 2000) goto L9;
        r2 = r7 / 2000.0f;
    L9:
        int r10 = (int) (d.getInterpolation(r2) * r9);
        if (r10 != 0) goto L15;
        if (r6 <= 0) goto L14;
        return 1;
    L14:
        return -1;
    L15:
        return r10;
    }

    public abstract boolean h(RecyclerView r1, cx3 r2, cx3 r3);

    public abstract void i(cx3 r1);

    public String toString() {
        switch(this.a) {
            case 1: goto L6;
            default: goto L5;
        };
    L6:
        String r1 = kx3.a(getClass()).c();
        if (r1 != null) goto L10;
        return "";
    L10:
        return r1;
    L5:
        return super.toString();
    }

    public e22(int r2, int r3) {
        this.a = 1;
        this.b = r2;
        this.c = r3;
    }

    public e22(int r2) {
        this.a = 0;
        this.b = -1;
        this.c = r2;
    }
}
