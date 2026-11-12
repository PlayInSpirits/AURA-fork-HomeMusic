package defpackage;

import com.skydoves.colorpickerview.ColorPickerView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g50 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ ColorPickerView o;
    public final /* synthetic */ int p;

    public /* synthetic */ g50(ColorPickerView colorPickerView, int i, int i2) {
        this.n = i2;
        this.o = colorPickerView;
        this.p = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        int i2 = this.p;
        ColorPickerView colorPickerView = this.o;
        switch (i) {
            case 0:
                int i3 = ColorPickerView.H;
                try {
                    colorPickerView.h(i2);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                    return;
                }
                break;
            default:
                int i4 = ColorPickerView.H;
                try {
                    colorPickerView.h(i2);
                } catch (IllegalAccessException e2) {
                    e2.printStackTrace();
                }
                break;
        }
    }
}
