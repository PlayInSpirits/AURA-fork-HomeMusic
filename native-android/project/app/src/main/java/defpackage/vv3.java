package defpackage;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vv3 implements w92 {
    public final /* synthetic */ int n;
    public final Object o;

    public /* synthetic */ vv3(int r1, Object r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // defpackage.w92
    public final void b(ba2 r10, q92 r11) {
        int r0 = this.n;
        Object r3 = null;
        Object r4 = this.o;
        switch(r0) {
            case 0: goto L91;
            case 1: goto L81;
            case 2: goto L72;
            case 3: goto L17;
            case 4: goto L12;
            case 5: goto L9;
            default: goto L5;
        };
    L9:
        ((de1) r4).b(false);
        return;
    L17:
        tp0 r5 = (tp0) r4;
        int r12 = sp0.a[r11.ordinal()];
        if (r12 != 1) goto L20;
        pp0 r13 = (pp0) r10;
        Iterable r9 = (Iterable) r5.b().e.n.getValue();
        if ((r9 instanceof Collection) == true) goto L62;
    L64:
        Iterator r14 = r9.iterator();
    L66:
        if (r14.hasNext() == false) goto L70;
        if (h12.c(((a23) r14.next()).s, r13.L) == false) goto L66;
        return;
    L70:
        r13.h0();
        return;
    L62:
        if (((Collection) r9).isEmpty() == false) goto L64;
    L20:
        if (r12 != 2) goto L22;
        pp0 r15 = (pp0) r10;
        Iterator r16 = ((Iterable) r5.b().f.n.getValue()).iterator();
    L52:
        if (r16.hasNext() == false) goto L56;
        Object r17 = r16.next();
        if (h12.c(((a23) r17).s, r15.L) == false) goto L52;
        r3 = r17;
        goto L52
    L56:
        a23 r6 = (a23) r3;
        if (r6 == null) goto L169;
        r5.b().b(r6);
        return;
    L169:
        return;
    L22:
        if (r12 != 3) goto L24;
        pp0 r18 = (pp0) r10;
        if (r18.k0().isShowing() == true) goto L166;
        List r19 = (List) r5.b().e.n.getValue();
        ListIterator r110 = r19.listIterator(r19.size());
    L40:
        if (r110.hasPrevious() == false) goto L44;
        if (h12.c(((a23) r110.previous()).s, r18.L) == false) goto L40;
        int r111 = r110.nextIndex();
    L45:
        a23 r1 = (a23) q40.y0(r19, r111);
        if (h12.c(q40.D0(r19), r1) == true) goto L48;
        Log.i("DialogFragmentNavigator", "Dialog " + r18 + " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog");
    L48:
        if (r1 == null) goto L167;
        r5.l(r111, r1, false);
        return;
    L167:
        return;
    L44:
        r111 = -1;
        goto L45
    L166:
        return;
    L24:
        if (r12 != 4) goto L171;
        pp0 r112 = (pp0) r10;
        Iterator r113 = ((Iterable) r5.b().f.n.getValue()).iterator();
    L28:
        if (r113.hasNext() == false) goto L32;
        Object r2 = r113.next();
        if (h12.c(((a23) r2).s, r112.L) == false) goto L28;
        r3 = r2;
        goto L28
    L32:
        a23 r7 = (a23) r3;
        if (r7 == null) goto L35;
        r5.b().b(r7);
    L35:
        r112.c0.f(this);
        return;
    L171:
        return;
    L72:
        new HashMap();
        ah1[] r8 = (ah1[]) r4;
        if (r8.length <= 0) goto L75;
        ah1 r20 = r8[0];
        throw null;
    L75:
        if (r8.length > 0) goto L77;
        return;
    L77:
        ah1 r21 = r8[0];
        throw null;
    L81:
        nc1 r22 = (nc1) r4;
        if (r22.r != null) goto L89;
        h70 r114 = (h70) r22.getLastNonConfigurationInstance();
        if (r114 == null) goto L87;
        r22.r = r114.a;
    L87:
        if (r22.r != null) goto L89;
        r22.r = new e75();
    L89:
        r22.n.f(this);
        return;
    L91:
        j54 r23 = (j54) r4;
        if (r11 != q92.ON_CREATE) goto L128;
        r10.h().f(this);
        Bundle r24 = r23.f().A("androidx.savedstate.Restarter");
        if (r24 == null) goto L176;
        ArrayList<String> r25 = r24.getStringArrayList("classes_to_restore");
        if (r25 == null) goto L125;
        int r115 = r25.size();
        int r116 = 0;
    L99:
        if (r116 >= r115) goto L177;
        String r26 = r25.get(r116);
        r116 = r116 + 1;
        String r27 = r26;
        Class<? extends U> r28 = Class.forName(r27, false, vv3.class.getClassLoader()).asSubclass(h54.class);     // Catch: ClassNotFoundException -> L123
        r28.getClass();     // Catch: ClassNotFoundException -> L123
        Constructor r29 = r28.getDeclaredConstructor(null);     // Catch: NoSuchMethodException -> L120
        r29.setAccessible(true);
        Object r30 = r29.newInstance(null);     // Catch: Exception -> L118
        r30.getClass();     // Catch: Exception -> L118
        h54 r31 = (h54) r30;     // Catch: Exception -> L118
        if ((r23 instanceof f75) == false) goto L117;
        e75 r32 = ((f75) r23).d();
        rm3 r33 = r23.f();
        LinkedHashMap r34 = r32.a;
        LinkedHashMap r35 = r32.a;
        Iterator r36 = q40.T0(r34.keySet()).iterator();
    L109:
        if (r36.hasNext() == false) goto L115;
        x65 r37 = (x65) r35.get(r36.next());
        if (r37 == null) goto L109;
        te5.c(r37, r33, r23.h());
        goto L109
    L115:
        if (q40.T0(r35.keySet()).isEmpty() == true) goto L99;
        r33.P();
        goto L99
    L117:
        nz2.u(r23, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ");
        return;
    L118:
        e = move-exception;
        nz2.s(xa3.g("Failed to instantiate ", r27), e);
        return;
    L120:
        e = move-exception;
        throw new IllegalStateException("Class " + r28.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
    L123:
        e = move-exception;
        nz2.s(xa3.h("Class ", r27, " wasn't found"), e);
        return;
    L177:
        return;
    L125:
        kf2.o("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        return;
    L176:
        return;
    L128:
        throw new AssertionError("Next event must be ON_CREATE");
    L5:
        if (r11 != q92.ON_CREATE) goto L7;
        r10.h().f(this);
        ((f54) r4).b();
        return;
    L7:
        nz2.u(r11, "Next event must be ON_CREATE, it was ");
        return;
    L12:
        if (r11 != q92.ON_STOP) goto L163;
        View r38 = ((kc1) r4).T;
        if (r38 == null) goto L164;
        r38.cancelPendingInputEvents();
        return;
    L164:
        return;
    }
}
