package defpackage;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hh2 implements Comparator {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ hh2(int i, Object obj) {
        this.n = i;
        this.o = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.n;
        Object obj3 = this.o;
        switch (i) {
            case 0:
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj3;
                int iCompareTo = Boolean.valueOf(materialButton.B).compareTo(Boolean.valueOf(materialButton2.B));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                return iCompareTo2 != 0 ? iCompareTo2 : Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton2)));
            case 1:
                int iCompare = ((Comparator) obj3).compare(obj, obj2);
                if (iCompare != 0) {
                    return iCompare;
                }
                c72 c72Var = ((i94) obj).c;
                c72 c72Var2 = ((i94) obj2).c;
                return c72Var.w() == c72Var2.w() ? h12.j(c72Var.u(), c72Var2.u()) : Float.compare(c72Var.w(), c72Var2.w());
            default:
                int iCompare2 = ((hh2) obj3).compare(obj, obj2);
                return iCompare2 != 0 ? iCompare2 : fu.l(Integer.valueOf(((i94) obj).f), Integer.valueOf(((i94) obj2).f));
        }
    }
}
