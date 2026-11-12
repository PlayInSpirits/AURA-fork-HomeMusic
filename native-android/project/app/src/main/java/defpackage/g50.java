package defpackage;

import com.skydoves.colorpickerview.ColorPickerView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g50 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ ColorPickerView o;
    public final /* synthetic */ int p;

    public /* synthetic */ g50(ColorPickerView r1, int r2, int r3) {
        this.n = r3;
        this.o = r1;
        this.p = r2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        int r1 = this.p;
        ColorPickerView r2 = this.o;
        switch(r0) {
            case 0: goto L10;
            default: goto L4;
        };
    L4:
        int r3 = ColorPickerView.H;
        r2.h(r1);     // Catch: IllegalAccessException -> L7
        return;
    L7:
        e = move-exception;
        e.printStackTrace();
        return;
    L10:
        int r4 = ColorPickerView.H;
        r2.h(r1);     // Catch: IllegalAccessException -> L13
        return;
    L13:
        e = move-exception;
        e.printStackTrace();
    }
}
