package defpackage;

import android.widget.CompoundButton;
import com.eddyizm.tempus.model.HomeSector;
import com.google.android.material.chip.Chip;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g20 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g20(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Chip chip = (Chip) obj;
                th2 th2Var = chip.w;
                if (th2Var != null) {
                    y10 y10Var = (y10) ((hg3) th2Var).o;
                    if (!z ? y10Var.m(chip, y10Var.c) : y10Var.b(chip)) {
                        y10Var.g();
                    }
                }
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.v;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                }
                break;
            case 1:
                qo1 qo1Var = (qo1) obj;
                ((HomeSector) qo1Var.v.q.get(qo1Var.c())).setVisible(z);
                break;
            default:
                ((fl3) obj).C0.d.k(Boolean.valueOf(z));
                break;
        }
    }
}
