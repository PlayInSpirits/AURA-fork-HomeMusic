package defpackage;

import android.os.Build;
import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kn3 {
    public final List a;
    public final gp3 b;
    public int c;

    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:46:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x008b  */
    /* JADX WARN: Code duplicated, block: B:54:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x0091  */
    public kn3(List list, gp3 gp3Var) {
        MotionEvent motionEventA;
        this.a = list;
        this.b = gp3Var;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29 && (motionEventA = a()) != null) {
            motionEventA.getClassification();
        }
        MotionEvent motionEventA2 = a();
        if (motionEventA2 != null) {
            motionEventA2.getButtonState();
        }
        MotionEvent motionEventA3 = a();
        if (motionEventA3 != null) {
            motionEventA3.getMetaState();
        }
        MotionEvent motionEventA4 = a();
        int i2 = 0;
        if (motionEventA4 != null) {
            boolean z = i >= 34 && motionEventA4.getClassification() == 3;
            boolean z2 = i >= 34 && motionEventA4.getClassification() == 5;
            int actionMasked = motionEventA4.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 5:
                                if (z) {
                                    i2 = 10;
                                } else if (z2) {
                                    i2 = 7;
                                } else if (!z2) {
                                    i2 = 1;
                                } else {
                                    i2 = 8;
                                }
                                break;
                            case 6:
                                if (z) {
                                    i2 = 12;
                                } else if (z2) {
                                    i2 = 9;
                                } else if (!z2) {
                                    i2 = 2;
                                } else {
                                    i2 = 8;
                                }
                                break;
                            case 7:
                                if (z) {
                                    i2 = 11;
                                } else if (!z2) {
                                    i2 = 3;
                                } else {
                                    i2 = 8;
                                }
                                break;
                            case 8:
                                i2 = 6;
                                break;
                            case 9:
                                i2 = 4;
                                break;
                            case 10:
                                i2 = 5;
                                break;
                        }
                    } else if (z) {
                        i2 = 11;
                    } else if (!z2) {
                        i2 = 8;
                    } else {
                        i2 = 3;
                    }
                } else if (z) {
                    i2 = 12;
                } else if (!z2 || z2) {
                    i2 = 2;
                } else {
                    i2 = 9;
                }
            } else if (z) {
                i2 = 10;
            } else if (!z2 || z2) {
                i2 = 1;
            } else {
                i2 = 7;
            }
        } else {
            int size = list.size();
            while (true) {
                if (i2 < size) {
                    on3 on3Var = (on3) list.get(i2);
                    if (gi1.i(on3Var)) {
                        i2 = 2;
                    } else if (gi1.g(on3Var)) {
                        i2 = 1;
                    } else {
                        i2++;
                    }
                } else {
                    i2 = 3;
                }
            }
        }
        this.c = i2;
    }

    public final MotionEvent a() {
        gp3 gp3Var = this.b;
        if (gp3Var != null) {
            return (MotionEvent) ((rf2) gp3Var.p).o;
        }
        return null;
    }
}
