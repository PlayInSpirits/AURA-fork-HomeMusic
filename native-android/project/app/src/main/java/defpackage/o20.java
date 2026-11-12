package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class o20 implements ViewGroup.OnHierarchyChangeListener {
    public ViewGroup.OnHierarchyChangeListener n;
    public final /* synthetic */ ChipGroup o;

    public o20(ChipGroup r1) {
        this.o = r1;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View r5, View r6) {
        ChipGroup r0 = this.o;
        if (r5 == r0) goto L5;
    L13:
        ViewGroup.OnHierarchyChangeListener r4 = this.n;
        if (r4 == null) goto L17;
        r4.onChildViewAdded(r5, r6);
        return;
    L17:
        return;
    L5:
        if ((r6 instanceof Chip) == false) goto L13;
        if (r6.getId() != (-1)) goto L9;
        WeakHashMap r1 = j65.a;
        r6.setId(View.generateViewId());
    L9:
        y10 r2 = r0.u;
        Chip r3 = (Chip) r6;
        ((HashMap) r2.d).put(Integer.valueOf(r3.getId()), r3);
        if (r3.isChecked() == false) goto L12;
        r2.b(r3);
    L12:
        r3.setInternalOnCheckedChangeListener(new hg3(9, r2));
        goto L13
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View r5, View r6) {
        ChipGroup r0 = this.o;
        if (r5 == r0) goto L5;
    L7:
        ViewGroup.OnHierarchyChangeListener r4 = this.n;
        if (r4 == null) goto L11;
        r4.onChildViewRemoved(r5, r6);
        return;
    L11:
        return;
    L5:
        if ((r6 instanceof Chip) == false) goto L7;
        y10 r1 = r0.u;
        Chip r2 = (Chip) r6;
        r1.getClass();
        r2.setInternalOnCheckedChangeListener(null);
        ((HashMap) r1.d).remove(Integer.valueOf(r2.getId()));
        ((HashSet) r1.e).remove(Integer.valueOf(r2.getId()));
        goto L7
    }
}
