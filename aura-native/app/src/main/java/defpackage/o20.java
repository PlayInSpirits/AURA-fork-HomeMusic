package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class o20 implements ViewGroup.OnHierarchyChangeListener {
    public ViewGroup.OnHierarchyChangeListener n;
    public final /* synthetic */ ChipGroup o;

    public o20(ChipGroup chipGroup) {
        this.o = chipGroup;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        ChipGroup chipGroup = this.o;
        if (view == chipGroup && (view2 instanceof Chip)) {
            if (view2.getId() == -1) {
                WeakHashMap weakHashMap = j65.a;
                view2.setId(View.generateViewId());
            }
            y10 y10Var = chipGroup.u;
            Chip chip = (Chip) view2;
            ((HashMap) y10Var.d).put(Integer.valueOf(chip.getId()), chip);
            if (chip.isChecked()) {
                y10Var.b(chip);
            }
            chip.setInternalOnCheckedChangeListener(new hg3(9, y10Var));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.n;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        ChipGroup chipGroup = this.o;
        if (view == chipGroup && (view2 instanceof Chip)) {
            y10 y10Var = chipGroup.u;
            Chip chip = (Chip) view2;
            y10Var.getClass();
            chip.setInternalOnCheckedChangeListener(null);
            ((HashMap) y10Var.d).remove(Integer.valueOf(chip.getId()));
            ((HashSet) y10Var.e).remove(Integer.valueOf(chip.getId()));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.n;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
