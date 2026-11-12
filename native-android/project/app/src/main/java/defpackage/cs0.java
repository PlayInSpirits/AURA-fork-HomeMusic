package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.fragment.NavHostFragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cs0 implements i54 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cs0(int r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // defpackage.i54
    public final Bundle a() {
        int r0 = this.a;
        Object r11 = this.b;
        switch(r0) {
            case 0: goto L82;
            case 1: goto L81;
            case 2: goto L27;
            case 3: goto L22;
            default: goto L4;
        };
    L4:
        z40 r12 = (z40) r11;
        Iterator r1 = lg2.a0((LinkedHashMap) r12.q).entrySet().iterator();
    L6:
        if (r1.hasNext() == false) goto L8;
        Map.Entry r2 = (Map.Entry) r1.next();
        r12.i(((nl4) r2.getValue()).getValue(), (String) r2.getKey());
        goto L6
    L8:
        Iterator r3 = lg2.a0((LinkedHashMap) r12.o).entrySet().iterator();
    L10:
        if (r3.hasNext() == false) goto L12;
        Map.Entry r4 = (Map.Entry) r3.next();
        r12.i(((i54) r4.getValue()).a(), (String) r4.getKey());
        goto L10
    L12:
        LinkedHashMap r13 = (LinkedHashMap) r12.n;
        if (r13.isEmpty() == false) goto L15;
        kd3[] r14 = new kd3[0];
    L21:
        return fh0.g((kd3[]) Arrays.copyOf(r14, r14.length));
    L15:
        ArrayList r5 = new ArrayList(r13.size());
        Iterator r15 = r13.entrySet().iterator();
    L17:
        if (r15.hasNext() == false) goto L19;
        Map.Entry r6 = (Map.Entry) r15.next();
        r5.add(new kd3((String) r6.getKey(), r6.getValue()));
        goto L17
    L19:
        r14 = (kd3[]) r5.toArray(new kd3[0]);
        goto L21
    L22:
        int r16 = ((NavHostFragment) r11).n0;
        if (r16 != 0) goto L107;
        Bundle r17 = Bundle.EMPTY;
        r17.getClass();
        return r17;
    L107:
        return fh0.g(new kd3[]{new kd3("android-support-nav:fragment:graphId", Integer.valueOf(r16))});
    L27:
        v23 r18 = (v23) r11;
        LinkedHashMap r7 = r18.m;
        LinkedHashMap r8 = r18.l;
        ii r9 = r18.g;
        ArrayList<String> r10 = new ArrayList();
        Bundle r19 = new Bundle();
        Iterator r20 = lg2.a0(r18.u.a).entrySet().iterator();
    L29:
        if (r20.hasNext() == false) goto L34;
        Map.Entry r21 = (Map.Entry) r20.next();
        String r22 = (String) r21.getKey();
        Bundle r23 = ((t43) r21.getValue()).h();
        if (r23 == null) goto L29;
        r10.add(r22);
        r19.putBundle(r22, r23);
        goto L29
    L34:
        if (r10.isEmpty() == true) goto L36;
        Bundle r24 = new Bundle();
        r19.putStringArrayList("android-support-nav:controller:navigatorState:names", r10);
        r24.putBundle("android-support-nav:controller:navigatorState", r19);
    L38:
        if (r9.isEmpty() == true) goto L47;
        if (r24 != null) goto L41;
        r24 = new Bundle();
    L41:
        Parcelable[] r25 = new Parcelable[r9.p];
        Iterator<E> r26 = r9.iterator();
        int r27 = 0;
    L43:
        if (r26.hasNext() == false) goto L45;
        r25[r27] = new c23((a23) r26.next());
        r27 = r27 + 1;
        goto L43
    L45:
        r24.putParcelableArray("android-support-nav:controller:backStack", r25);
    L47:
        if (r8.isEmpty() == true) goto L56;
        if (r24 != null) goto L50;
        r24 = new Bundle();
    L50:
        int[] r28 = new int[r8.size()];
        ArrayList<String> r29 = new ArrayList();
        Iterator r30 = r8.entrySet().iterator();
        int r31 = 0;
    L52:
        if (r30.hasNext() == false) goto L54;
        Map.Entry r32 = (Map.Entry) r30.next();
        int r33 = ((Number) r32.getKey()).intValue();
        String r34 = (String) r32.getValue();
        r28[r31] = r33;
        r29.add(r34);
        r31 = r31 + 1;
        goto L52
    L54:
        r24.putIntArray("android-support-nav:controller:backStackDestIds", r28);
        r24.putStringArrayList("android-support-nav:controller:backStackIds", r29);
    L56:
        if (r7.isEmpty() == true) goto L73;
        if (r24 != null) goto L59;
        r24 = new Bundle();
    L59:
        ArrayList<String> r35 = new ArrayList();
        Iterator r36 = r7.entrySet().iterator();
    L61:
        if (r36.hasNext() == false) goto L71;
        Map.Entry r37 = (Map.Entry) r36.next();
        String r38 = (String) r37.getKey();
        ii r39 = (ii) r37.getValue();
        r35.add(r38);
        Parcelable[] r40 = new Parcelable[r39.p];
        Iterator r41 = r39.iterator();
        int r42 = 0;
    L64:
        if (r41.hasNext() == false) goto L70;
        Object r43 = r41.next();
        int r110 = r42 + 1;
        if (r42 < 0) goto L68;
        r40[r42] = (c23) r43;
        r42 = r110;
        goto L64
    L68:
        gb.c0();
        throw null;
    L70:
        r24.putParcelableArray(xa3.g("android-support-nav:controller:backStackStates:", r38), r40);
        goto L61
    L71:
        r24.putStringArrayList("android-support-nav:controller:backStackStates", r35);
    L73:
        if (r18.f == false) goto L77;
        if (r24 != null) goto L76;
        r24 = new Bundle();
    L76:
        r24.putBoolean("android-support-nav:controller:deepLinkHandled", r18.f);
    L77:
        if (r24 != null) goto L108;
        Bundle r44 = Bundle.EMPTY;
        r44.getClass();
        return r44;
    L108:
        return r24;
    L36:
        r24 = null;
        goto L38
    L82:
        Map r111 = ((y44) r11).c();
        Bundle r45 = new Bundle();
        Iterator r112 = r111.entrySet().iterator();
    L84:
        if (r112.hasNext() == false) goto L90;
        Map.Entry r46 = (Map.Entry) r112.next();
        String r47 = (String) r46.getKey();
        List r48 = (List) r46.getValue();
        if ((r48 instanceof ArrayList) == false) goto L88;
        ArrayList<? extends Parcelable> r49 = (ArrayList) r48;
    L89:
        r45.putParcelableArrayList(r47, r49);
        goto L84
    L88:
        r49 = new ArrayList(r48);
        goto L89
    L90:
        return r45;
    L81:
        return ((ld1) r11).W();
    }
}
