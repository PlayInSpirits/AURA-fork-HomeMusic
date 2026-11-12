package defpackage;

import android.widget.CompoundButton;
import com.eddyizm.tempus.model.HomeSector;
import com.google.android.material.chip.Chip;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g20 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g20(int r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton r3, boolean r4) {
        int r0 = this.a;
        Object r2 = this.b;
        switch(r0) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        ((fl3) r2).C0.d.k(Boolean.valueOf(r4));
        return;
    L6:
        qo1 r5 = (qo1) r2;
        ((HomeSector) r5.v.q.get(r5.c())).setVisible(r4);
        return;
    L8:
        Chip r6 = (Chip) r2;
        th2 r1 = r6.w;
        if (r1 == null) goto L18;
        y10 r7 = (y10) ((hg3) r1).o;
        if (r4 == false) goto L16;
        if (r7.b(r6) == false) goto L18;
    L17:
        r7.g();
        goto L18
    L16:
        if (r7.m(r6, r7.c) == true) goto L17;
    L18:
        CompoundButton.OnCheckedChangeListener r8 = r6.v;
        if (r8 == null) goto L22;
        r8.onCheckedChanged(r3, r4);
        return;
    }
}
