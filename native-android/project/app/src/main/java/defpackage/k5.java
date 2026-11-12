package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import app.homemusic.R;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class k5 extends q42 implements if1 {
    public static final k5 A = null;
    public static final k5 B = null;
    public static final k5 C = null;
    public static final k5 o = null;
    public static final k5 p = null;
    public static final k5 q = null;
    public static final k5 r = null;
    public static final k5 s = null;
    public static final k5 t = null;
    public static final k5 u = null;
    public static final k5 v = null;
    public static final k5 w = null;
    public static final k5 x = null;
    public static final k5 y = null;
    public static final k5 z = null;
    public final /* synthetic */ int n;

    static {
        int r1 = 1;
        o = new k5(r1, 0);
        p = new k5(r1, 1);
        q = new k5(r1, 2);
        r = new k5(r1, 3);
        s = new k5(r1, 4);
        t = new k5(r1, 5);
        u = new k5(r1, 6);
        v = new k5(r1, 7);
        w = new k5(r1, 8);
        x = new k5(r1, 9);
        y = new k5(r1, 10);
        z = new k5(r1, 11);
        A = new k5(r1, 12);
        B = new k5(r1, 13);
        C = new k5(r1, 14);
    }

    public /* synthetic */ k5(int r1, int r2) {
        this.n = r2;
        super(r1);
    }

    @Override // defpackage.if1
    public final Object invoke(Object r9) {
        int r8 = this.n;
        j15 r0 = j15.a;
        switch(r8) {
            case 0: goto L61;
            case 1: goto L56;
            case 2: goto L54;
            case 3: goto L52;
            case 4: goto L48;
            case 5: goto L42;
            case 6: goto L36;
            case 7: goto L34;
            case 8: goto L27;
            case 9: goto L23;
            case 10: goto L21;
            case 11: goto L17;
            case 12: goto L13;
            case 13: goto L6;
            default: goto L4;
        };
    L4:
        jb0 r10 = (jb0) r9;
        r10.getClass();
        return r10.getClass().getSimpleName();
    L6:
        View r11 = (View) r9;
        r11.getClass();
        Object r12 = r11.getTag(R.id.nav_controller_view_tag);
        if ((r12 instanceof WeakReference) == false) goto L10;
        return (v23) ((WeakReference) r12).get();
    L10:
        if ((r12 instanceof v23) == true) goto L12;
        return null;
    L12:
        return (v23) r12;
    L13:
        View r13 = (View) r9;
        r13.getClass();
        Object r14 = r13.getParent();
        if ((r14 instanceof View) == true) goto L16;
        return null;
    L16:
        return (View) r14;
    L17:
        r23 r15 = (r23) r9;
        r15.getClass();
        if ((r15 instanceof t23) == false) goto L68;
        t23 r16 = (t23) r15;
        return r16.h(r16.y, r16, null, false);
    L68:
        return null;
    L21:
        r23 r17 = (r23) r9;
        r17.getClass();
        return r17.o;
    L23:
        Context r18 = (Context) r9;
        r18.getClass();
        if ((r18 instanceof Activity) == true) goto L26;
        return null;
    L26:
        return (Activity) r18;
    L27:
        Context r19 = (Context) r9;
        r19.getClass();
        if ((r19 instanceof ContextWrapper) == false) goto L30;
        ContextWrapper r20 = (ContextWrapper) r19;
    L31:
        if (r20 != null) goto L33;
        return null;
    L33:
        return r20.getBaseContext();
    L30:
        r20 = null;
        goto L31
    L34:
        r23 r21 = (r23) r9;
        r21.getClass();
        return Integer.valueOf(r21.u);
    L36:
        r23 r22 = (r23) r9;
        r22.getClass();
        t23 r23 = r22.o;
        if (r23 != null) goto L39;
        return null;
    L39:
        if (r23.y == r22.u) goto L41;
        return null;
    L41:
        return r23;
    L42:
        r23 r24 = (r23) r9;
        r24.getClass();
        t23 r25 = r24.o;
        if (r25 != null) goto L45;
        return null;
    L45:
        if (r25.y == r24.u) goto L47;
        return null;
    L47:
        return r25;
    L48:
        Context r26 = (Context) r9;
        r26.getClass();
        if ((r26 instanceof ContextWrapper) == true) goto L51;
        return null;
    L51:
        return ((ContextWrapper) r26).getBaseContext();
    L52:
        sv0.l((sv0) r9, x40.f, 0, 126);
        return r0;
    L54:
        sv0 r27 = (sv0) r9;
        return r0;
    L56:
        Map.Entry r28 = (Map.Entry) r9;
        r28.getClass();
        String r29 = (String) r28.getKey();
        Object r30 = r28.getValue();
        StringBuilder r31 = b11.s(r29, " : ");
        if ((r30 instanceof Object[]) == false) goto L59;
        r30 = Arrays.toString((Object[]) r30);
        r30.getClass();
    L59:
        r31.append(r30);
        return r31.toString();
    L61:
        Context r32 = (Context) r9;
        r32.getClass();
        if ((r32 instanceof ContextWrapper) == true) goto L64;
        return null;
    L64:
        return ((ContextWrapper) r32).getBaseContext();
    }
}
