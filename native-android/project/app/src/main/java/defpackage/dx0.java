package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
import androidx.preference.DropDownPreference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dx0 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ dx0(int i, Object obj) {
        this.n = i;
        this.o = obj;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }

    private final void c(AdapterView adapterView) {
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        cx0 cx0Var;
        int i2 = this.n;
        Object obj = this.o;
        switch (i2) {
            case 0:
                DropDownPreference dropDownPreference = (DropDownPreference) obj;
                if (i >= 0) {
                    String string = dropDownPreference.i0[i].toString();
                    if (!string.equals(dropDownPreference.j0) && dropDownPreference.a(string)) {
                        dropDownPreference.H(string);
                        break;
                    }
                }
                break;
            case 1:
                if (i != -1 && (cx0Var = ((bc2) obj).p) != null) {
                    cx0Var.setListSelectionHidden(false);
                    break;
                }
                break;
            default:
                ((SearchView) obj).o(i);
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i = this.n;
    }
}
