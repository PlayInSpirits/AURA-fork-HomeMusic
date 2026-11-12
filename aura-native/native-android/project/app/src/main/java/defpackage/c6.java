package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class c6 {
    public int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public c6() {
        this.b = new rp1[32];
        this.c = new float[32];
        this.d = new byte[32];
        x03 x03Var = w54.a;
        this.e = new x03();
        this.f = new x03();
    }

    public static c6 f(Context context, int i) {
        l93.j("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, ht3.y);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList colorStateListS = h12.s(context, typedArrayObtainStyledAttributes, 4);
        ColorStateList colorStateListS2 = h12.s(context, typedArrayObtainStyledAttributes, 9);
        ColorStateList colorStateListS3 = h12.s(context, typedArrayObtainStyledAttributes, 7);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        bc4 bc4VarA = bc4.a(context, typedArrayObtainStyledAttributes.getResourceId(5, 0), typedArrayObtainStyledAttributes.getResourceId(6, 0)).a();
        typedArrayObtainStyledAttributes.recycle();
        c6 c6Var = new c6();
        l93.k(rect.left);
        l93.k(rect.top);
        l93.k(rect.right);
        l93.k(rect.bottom);
        c6Var.b = rect;
        c6Var.c = colorStateListS2;
        c6Var.d = colorStateListS;
        c6Var.e = colorStateListS3;
        c6Var.a = dimensionPixelSize;
        c6Var.f = bc4VarA;
        return c6Var;
    }

    public void A(TextView textView) {
        ColorStateList colorStateList = (ColorStateList) this.c;
        fi2 fi2Var = new fi2();
        fi2 fi2Var2 = new fi2();
        bc4 bc4Var = (bc4) this.f;
        fi2Var.setShapeAppearanceModel(bc4Var);
        fi2Var2.setShapeAppearanceModel(bc4Var);
        fi2Var.m((ColorStateList) this.d);
        float f = this.a;
        ColorStateList colorStateList2 = (ColorStateList) this.e;
        fi2Var.r(f);
        fi2Var.q(colorStateList2);
        textView.setTextColor(colorStateList);
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList.withAlpha(30), fi2Var, fi2Var2);
        Rect rect = (Rect) this.b;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        WeakHashMap weakHashMap = j65.a;
        textView.setBackground(insetDrawable);
    }

    public int B(int i, int i2) {
        int i3;
        int i4;
        jo3 jo3Var = (jo3) this.b;
        ArrayList arrayList = (ArrayList) this.d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            b6 b6Var = (b6) arrayList.get(size);
            int i5 = b6Var.a;
            int i6 = b6Var.b;
            if (i5 == 8) {
                int i7 = b6Var.d;
                if (i6 < i7) {
                    i4 = i7;
                    i3 = i6;
                } else {
                    i3 = i7;
                    i4 = i6;
                }
                if (i < i3 || i > i4) {
                    if (i < i6) {
                        if (i2 == 1) {
                            b6Var.b = i6 + 1;
                            b6Var.d = i7 + 1;
                        } else if (i2 == 2) {
                            b6Var.b = i6 - 1;
                            b6Var.d = i7 - 1;
                        }
                    }
                } else if (i3 == i6) {
                    if (i2 == 1) {
                        b6Var.d = i7 + 1;
                    } else if (i2 == 2) {
                        b6Var.d = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        b6Var.b = i6 + 1;
                    } else if (i2 == 2) {
                        b6Var.b = i6 - 1;
                    }
                    i--;
                }
            } else if (i6 <= i) {
                if (i5 == 1) {
                    i -= b6Var.d;
                } else if (i5 == 2) {
                    i += b6Var.d;
                }
            } else if (i2 == 1) {
                b6Var.b = i6 + 1;
            } else if (i2 == 2) {
                b6Var.b = i6 - 1;
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            b6 b6Var2 = (b6) arrayList.get(size2);
            int i8 = b6Var2.a;
            int i9 = b6Var2.d;
            if (i8 == 8) {
                if (i9 == b6Var2.b || i9 < 0) {
                    arrayList.remove(size2);
                    b6Var2.c = null;
                    jo3Var.a(b6Var2);
                }
            } else if (i9 <= 0) {
                arrayList.remove(size2);
                b6Var2.c = null;
                jo3Var.a(b6Var2);
            }
        }
        return i;
    }

    public void C(Object obj) {
        Object obj2 = this.e;
        this.e = obj;
        if (obj2.equals(obj)) {
            return;
        }
        i41 i41Var = ((u31) this.d).o;
        ((Integer) obj2).getClass();
        Integer num = (Integer) obj;
        int iIntValue = num.intValue();
        i41Var.z1();
        i41Var.q1(1, 10, num);
        i41Var.q1(2, 10, num);
        i41Var.n.f(21, new ij0(iIntValue, 2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        if (r10 < r3.o) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(long j, be3 be3Var) {
        int i;
        ArrayDeque arrayDeque = (ArrayDeque) this.d;
        PriorityQueue priorityQueue = (PriorityQueue) this.e;
        if (j != -9223372036854775807L && (i = this.a) != 0) {
            if (i != -1 && priorityQueue.size() >= this.a) {
                fz3 fz3Var = (fz3) priorityQueue.peek();
                String str = f35.a;
            }
            ArrayDeque arrayDeque2 = (ArrayDeque) this.c;
            be3 be3Var2 = arrayDeque2.isEmpty() ? new be3() : (be3) arrayDeque2.pop();
            be3Var2.K(be3Var.a());
            System.arraycopy(be3Var.a, be3Var.b, be3Var2.a, 0, be3Var2.a());
            fz3 fz3Var2 = (fz3) this.f;
            if (fz3Var2 != null && j == fz3Var2.o) {
                fz3Var2.n.add(be3Var2);
                return;
            }
            fz3 fz3Var3 = arrayDeque.isEmpty() ? new fz3() : (fz3) arrayDeque.pop();
            ArrayList arrayList = fz3Var3.n;
            rr2.l(j != -9223372036854775807L);
            rr2.w(arrayList.isEmpty());
            fz3Var3.o = j;
            arrayList.add(be3Var2);
            priorityQueue.add(fz3Var3);
            this.f = fz3Var3;
            int i2 = this.a;
            if (i2 != -1) {
                j(i2);
                return;
            }
            return;
        }
        ((gz3) this.b).k(j, be3Var);
    }

    public void b() {
        View view = (View) this.b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((la0) this.d) != null) {
                if (((la0) this.f) == null) {
                    this.f = new la0();
                }
                la0 la0Var = (la0) this.f;
                la0Var.p = null;
                la0Var.o = false;
                la0Var.q = null;
                la0Var.n = false;
                WeakHashMap weakHashMap = j65.a;
                ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    la0Var.o = true;
                    la0Var.p = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = view.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    la0Var.n = true;
                    la0Var.q = backgroundTintMode;
                }
                if (la0Var.o || la0Var.n) {
                    fg.e(background, la0Var, view.getDrawableState());
                    return;
                }
            }
            la0 la0Var2 = (la0) this.e;
            if (la0Var2 != null) {
                fg.e(background, la0Var2, view.getDrawableState());
                return;
            }
            la0 la0Var3 = (la0) this.d;
            if (la0Var3 != null) {
                fg.e(background, la0Var3, view.getDrawableState());
            }
        }
    }

    public boolean c(int i) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            b6 b6Var = (b6) arrayList.get(i2);
            int i3 = b6Var.a;
            if (i3 != 8) {
                if (i3 == 1) {
                    int i4 = b6Var.b;
                    int i5 = b6Var.d + i4;
                    while (i4 < i5) {
                        if (i(i4, i2 + 1) == i) {
                            return true;
                        }
                        i4++;
                    }
                } else {
                    continue;
                }
            } else {
                if (i(b6Var.d, i2 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public void d() {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((si1) this.e).C((b6) arrayList.get(i));
        }
        t(arrayList);
        this.a = 0;
    }

    public void e() {
        si1 si1Var = (si1) this.e;
        d();
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            b6 b6Var = (b6) arrayList.get(i);
            int i2 = b6Var.a;
            if (i2 == 1) {
                si1Var.C(b6Var);
                si1Var.G(b6Var.b, b6Var.d);
            } else if (i2 == 2) {
                si1Var.C(b6Var);
                int i3 = b6Var.b;
                int i4 = b6Var.d;
                RecyclerView recyclerView = (RecyclerView) si1Var.o;
                recyclerView.U(i3, i4, true);
                recyclerView.x0 = true;
                recyclerView.u0.c += i4;
            } else if (i2 == 4) {
                si1Var.C(b6Var);
                si1Var.F(b6Var.b, b6Var.d, b6Var.c);
            } else if (i2 == 8) {
                si1Var.C(b6Var);
                si1Var.H(b6Var.b, b6Var.d);
            }
        }
        t(arrayList);
        this.a = 0;
    }

    public void g(b6 b6Var) {
        int i;
        jo3 jo3Var = (jo3) this.b;
        int i2 = b6Var.a;
        if (i2 == 1 || i2 == 8) {
            kf2.n("should not dispatch add or move for pre layout");
            return;
        }
        int iB = B(b6Var.b, i2);
        int i3 = b6Var.b;
        int i4 = b6Var.a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                mj0.l(b6Var, "op should be remove or update.");
                return;
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < b6Var.d; i6++) {
            int iB2 = B((i * i6) + b6Var.b, b6Var.a);
            int i7 = b6Var.a;
            if (i7 == 2 ? iB2 != iB : !(i7 == 4 && iB2 == iB + 1)) {
                b6 b6VarO = o(b6Var.c, i7, iB, i5);
                h(b6VarO, i3);
                b6VarO.c = null;
                jo3Var.a(b6VarO);
                if (b6Var.a == 4) {
                    i3 += i5;
                }
                i5 = 1;
                iB = iB2;
            } else {
                i5++;
            }
        }
        Object obj = b6Var.c;
        b6Var.c = null;
        jo3Var.a(b6Var);
        if (i5 > 0) {
            b6 b6VarO2 = o(obj, b6Var.a, iB, i5);
            h(b6VarO2, i3);
            b6VarO2.c = null;
            jo3Var.a(b6VarO2);
        }
    }

    public void h(b6 b6Var, int i) {
        si1 si1Var = (si1) this.e;
        si1Var.C(b6Var);
        int i2 = b6Var.a;
        if (i2 != 2) {
            if (i2 == 4) {
                si1Var.F(i, b6Var.d, b6Var.c);
                return;
            } else {
                kf2.n("only remove and update ops can be dispatched in first pass");
                return;
            }
        }
        int i3 = b6Var.d;
        RecyclerView recyclerView = (RecyclerView) si1Var.o;
        recyclerView.U(i, i3, true);
        recyclerView.x0 = true;
        recyclerView.u0.c += i3;
    }

    public int i(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (i2 < size) {
            b6 b6Var = (b6) arrayList.get(i2);
            int i3 = b6Var.a;
            int i4 = b6Var.b;
            if (i3 == 8) {
                if (i4 == i) {
                    i = b6Var.d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (b6Var.d <= i) {
                        i++;
                    }
                }
            } else if (i4 > i) {
                continue;
            } else if (i3 == 2) {
                int i5 = b6Var.d;
                if (i < i4 + i5) {
                    return -1;
                }
                i -= i5;
            } else if (i3 == 1) {
                i += b6Var.d;
            }
            i2++;
        }
        return i;
    }

    public void j(int i) {
        ArrayList arrayList;
        PriorityQueue priorityQueue = (PriorityQueue) this.e;
        while (priorityQueue.size() > i) {
            fz3 fz3Var = (fz3) priorityQueue.poll();
            String str = f35.a;
            int i2 = 0;
            while (true) {
                arrayList = fz3Var.n;
                if (i2 >= arrayList.size()) {
                    break;
                }
                ((gz3) this.b).k(fz3Var.o, (be3) arrayList.get(i2));
                ((ArrayDeque) this.c).push((be3) arrayList.get(i2));
                i2++;
            }
            arrayList.clear();
            fz3 fz3Var2 = (fz3) this.f;
            if (fz3Var2 != null && fz3Var2.o == fz3Var.o) {
                this.f = null;
            }
            ((ArrayDeque) this.d).push(fz3Var);
        }
    }

    public ColorStateList k() {
        la0 la0Var = (la0) this.e;
        if (la0Var != null) {
            return (ColorStateList) la0Var.p;
        }
        return null;
    }

    public PorterDuff.Mode l() {
        la0 la0Var = (la0) this.e;
        if (la0Var != null) {
            return (PorterDuff.Mode) la0Var.q;
        }
        return null;
    }

    public boolean m() {
        return ((ArrayList) this.c).size() > 0;
    }

    public void n(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListG;
        View view = (View) this.b;
        Context context = view.getContext();
        int[] iArr = st3.B;
        jv3 jv3VarF = jv3.f(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) jv3VarF.o;
        View view2 = (View) this.b;
        j65.n(view2, view2.getContext(), iArr, attributeSet, (TypedArray) jv3VarF.o, i, 0);
        try {
            if (typedArray.hasValue(0)) {
                this.a = typedArray.getResourceId(0, -1);
                fg fgVar = (fg) this.c;
                Context context2 = view.getContext();
                int i2 = this.a;
                synchronized (fgVar) {
                    colorStateListG = fgVar.a.g(context2, i2);
                }
                if (colorStateListG != null) {
                    w(colorStateListG);
                }
            }
            if (typedArray.hasValue(1)) {
                view.setBackgroundTintList(jv3VarF.b(1));
            }
            if (typedArray.hasValue(2)) {
                view.setBackgroundTintMode(aw0.c(typedArray.getInt(2, -1), null));
            }
            jv3VarF.g();
        } catch (Throwable th) {
            jv3VarF.g();
            throw th;
        }
    }

    public b6 o(Object obj, int i, int i2, int i3) {
        b6 b6Var = (b6) ((jo3) this.b).b();
        if (b6Var != null) {
            b6Var.a = i;
            b6Var.b = i2;
            b6Var.d = i3;
            b6Var.c = obj;
            return b6Var;
        }
        b6 b6Var2 = new b6();
        b6Var2.a = i;
        b6Var2.b = i2;
        b6Var2.d = i3;
        b6Var2.c = obj;
        return b6Var2;
    }

    public void p() {
        this.a = -1;
        w(null);
        b();
    }

    public void q(int i) {
        ColorStateList colorStateListG;
        this.a = i;
        fg fgVar = (fg) this.c;
        if (fgVar != null) {
            Context context = ((View) this.b).getContext();
            synchronized (fgVar) {
                colorStateListG = fgVar.a.g(context, i);
            }
        } else {
            colorStateListG = null;
        }
        w(colorStateListG);
        b();
    }

    public void r(b6 b6Var) {
        si1 si1Var = (si1) this.e;
        ((ArrayList) this.d).add(b6Var);
        int i = b6Var.a;
        if (i == 1) {
            si1Var.G(b6Var.b, b6Var.d);
            return;
        }
        if (i == 2) {
            int i2 = b6Var.b;
            int i3 = b6Var.d;
            RecyclerView recyclerView = (RecyclerView) si1Var.o;
            recyclerView.U(i2, i3, false);
            recyclerView.x0 = true;
            return;
        }
        if (i == 4) {
            si1Var.F(b6Var.b, b6Var.d, b6Var.c);
        } else if (i == 8) {
            si1Var.H(b6Var.b, b6Var.d);
        } else {
            mj0.l(b6Var, "Unknown update op type for ");
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x018c  */
    /* JADX WARN: Code duplicated, block: B:103:0x019a  */
    /* JADX WARN: Code duplicated, block: B:104:0x019e  */
    /* JADX WARN: Code duplicated, block: B:186:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x0125 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x01a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x007c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0081  */
    /* JADX WARN: Code duplicated, block: B:32:0x0086  */
    /* JADX WARN: Code duplicated, block: B:36:0x009d  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:75:0x0134  */
    /* JADX WARN: Code duplicated, block: B:76:0x0136  */
    /* JADX WARN: Code duplicated, block: B:78:0x013c  */
    /* JADX WARN: Code duplicated, block: B:81:0x0147  */
    /* JADX WARN: Code duplicated, block: B:84:0x0152  */
    /* JADX WARN: Code duplicated, block: B:87:0x015d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0163  */
    /* JADX WARN: Code duplicated, block: B:89:0x0165  */
    /* JADX WARN: Code duplicated, block: B:91:0x016b  */
    /* JADX WARN: Code duplicated, block: B:94:0x0176  */
    /* JADX WARN: Code duplicated, block: B:97:0x0181  */
    public void s() {
        boolean z;
        byte b;
        b6 b6VarO;
        int i;
        int i2;
        int i3;
        b6 b6VarO2;
        boolean z2;
        boolean z3;
        Object obj;
        b6 b6Var;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        jo3 jo3Var = (jo3) this.b;
        si1 si1Var = (si1) this.e;
        pz1 pz1Var = (pz1) this.f;
        ArrayList arrayList = (ArrayList) this.c;
        pz1Var.getClass();
        while (true) {
            int size = arrayList.size() - 1;
            boolean z4 = false;
            while (true) {
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((b6) arrayList.get(size)).a == 8) {
                    if (z4) {
                        break;
                    }
                } else {
                    z4 = true;
                }
                size--;
            }
            if (size == -1) {
                break;
            }
            int i12 = size + 1;
            c6 c6Var = (c6) pz1Var.o;
            jo3 jo3Var2 = (jo3) c6Var.b;
            b6 b6Var2 = (b6) arrayList.get(size);
            b6 b6Var3 = (b6) arrayList.get(i12);
            int i13 = b6Var3.a;
            if (i13 == 1) {
                int i14 = b6Var2.d;
                int i15 = b6Var3.b;
                int i16 = i14 < i15 ? -1 : 0;
                int i17 = b6Var2.b;
                if (i17 < i15) {
                    i16++;
                }
                if (i15 <= i17) {
                    b6Var2.b = i17 + b6Var3.d;
                }
                int i18 = b6Var3.b;
                if (i18 <= i14) {
                    b6Var2.d = i14 + b6Var3.d;
                }
                b6Var3.b = i18 + i16;
                arrayList.set(size, b6Var3);
                arrayList.set(i12, b6Var2);
            } else if (i13 == 2) {
                int i19 = b6Var2.b;
                int i20 = b6Var2.d;
                int i21 = b6Var3.b;
                if (i19 < i20) {
                    if (i21 == i19 && b6Var3.d == i20 - i19) {
                        z2 = false;
                        z3 = true;
                    } else {
                        z2 = false;
                        z3 = false;
                    }
                } else if (i21 == i20 + 1 && b6Var3.d == i19 - i20) {
                    z2 = true;
                    z3 = true;
                } else {
                    z2 = true;
                    z3 = false;
                }
                if (i20 < i21) {
                    b6Var3.b = i21 - 1;
                } else {
                    int i22 = b6Var3.d;
                    if (i20 < i21 + i22) {
                        b6Var3.d = i22 - 1;
                        b6Var2.a = 2;
                        b6Var2.d = 1;
                        if (b6Var3.d == 0) {
                            arrayList.remove(i12);
                            b6Var3.c = null;
                            jo3Var2.a(b6Var3);
                        }
                    }
                }
                int i23 = b6Var2.b;
                int i24 = b6Var3.b;
                if (i23 <= i24) {
                    b6Var3.b = i24 + 1;
                } else {
                    int i25 = i24 + b6Var3.d;
                    if (i23 < i25) {
                        obj = null;
                        b6 b6VarO3 = c6Var.o(null, 2, i23 + 1, i25 - i23);
                        b6Var3.d = b6Var2.b - b6Var3.b;
                        b6Var = b6VarO3;
                    }
                    if (z3) {
                        arrayList.set(size, b6Var3);
                        arrayList.remove(i12);
                        b6Var2.c = obj;
                        jo3Var2.a(b6Var2);
                    } else {
                        if (z2) {
                            if (b6Var != null) {
                                i10 = b6Var2.b;
                                if (i10 > b6Var.b) {
                                    b6Var2.b = i10 - b6Var.d;
                                }
                                i11 = b6Var2.d;
                                if (i11 > b6Var.b) {
                                    b6Var2.d = i11 - b6Var.d;
                                }
                            }
                            i8 = b6Var2.b;
                            if (i8 > b6Var3.b) {
                                b6Var2.b = i8 - b6Var3.d;
                            }
                            i9 = b6Var2.d;
                            if (i9 > b6Var3.b) {
                                b6Var2.d = i9 - b6Var3.d;
                            }
                        } else {
                            if (b6Var != null) {
                                i6 = b6Var2.b;
                                if (i6 >= b6Var.b) {
                                    b6Var2.b = i6 - b6Var.d;
                                }
                                i7 = b6Var2.d;
                                if (i7 >= b6Var.b) {
                                    b6Var2.d = i7 - b6Var.d;
                                }
                            }
                            i4 = b6Var2.b;
                            if (i4 >= b6Var3.b) {
                                b6Var2.b = i4 - b6Var3.d;
                            }
                            i5 = b6Var2.d;
                            if (i5 >= b6Var3.b) {
                                b6Var2.d = i5 - b6Var3.d;
                            }
                        }
                        arrayList.set(size, b6Var3);
                        if (b6Var2.b != b6Var2.d) {
                            arrayList.set(i12, b6Var2);
                        } else {
                            arrayList.remove(i12);
                        }
                        if (b6Var != null) {
                            arrayList.add(size, b6Var);
                        }
                    }
                }
                obj = null;
                b6Var = null;
                if (z3) {
                    arrayList.set(size, b6Var3);
                    arrayList.remove(i12);
                    b6Var2.c = obj;
                    jo3Var2.a(b6Var2);
                } else {
                    if (z2) {
                        if (b6Var != null) {
                            i10 = b6Var2.b;
                            if (i10 > b6Var.b) {
                                b6Var2.b = i10 - b6Var.d;
                            }
                            i11 = b6Var2.d;
                            if (i11 > b6Var.b) {
                                b6Var2.d = i11 - b6Var.d;
                            }
                        }
                        i8 = b6Var2.b;
                        if (i8 > b6Var3.b) {
                            b6Var2.b = i8 - b6Var3.d;
                        }
                        i9 = b6Var2.d;
                        if (i9 > b6Var3.b) {
                            b6Var2.d = i9 - b6Var3.d;
                        }
                    } else {
                        if (b6Var != null) {
                            i6 = b6Var2.b;
                            if (i6 >= b6Var.b) {
                                b6Var2.b = i6 - b6Var.d;
                            }
                            i7 = b6Var2.d;
                            if (i7 >= b6Var.b) {
                                b6Var2.d = i7 - b6Var.d;
                            }
                        }
                        i4 = b6Var2.b;
                        if (i4 >= b6Var3.b) {
                            b6Var2.b = i4 - b6Var3.d;
                        }
                        i5 = b6Var2.d;
                        if (i5 >= b6Var3.b) {
                            b6Var2.d = i5 - b6Var3.d;
                        }
                    }
                    arrayList.set(size, b6Var3);
                    if (b6Var2.b != b6Var2.d) {
                        arrayList.set(i12, b6Var2);
                    } else {
                        arrayList.remove(i12);
                    }
                    if (b6Var != null) {
                        arrayList.add(size, b6Var);
                    }
                }
            } else if (i13 == 4) {
                int i26 = b6Var2.d;
                int i27 = b6Var3.b;
                if (i26 < i27) {
                    b6Var3.b = i27 - 1;
                } else {
                    int i28 = b6Var3.d;
                    if (i26 < i27 + i28) {
                        b6Var3.d = i28 - 1;
                        b6VarO = c6Var.o(b6Var3.c, 4, b6Var2.b, 1);
                    }
                    i = b6Var2.b;
                    i2 = b6Var3.b;
                    if (i <= i2) {
                        b6Var3.b = i2 + 1;
                    } else {
                        i3 = i2 + b6Var3.d;
                        if (i < i3) {
                            int i29 = i3 - i;
                            b6VarO2 = c6Var.o(b6Var3.c, 4, i + 1, i29);
                            b6Var3.d -= i29;
                        }
                        arrayList.set(i12, b6Var2);
                        if (b6Var3.d > 0) {
                            arrayList.set(size, b6Var3);
                        } else {
                            arrayList.remove(size);
                            b6Var3.c = null;
                            jo3Var2.a(b6Var3);
                        }
                        if (b6VarO != null) {
                            arrayList.add(size, b6VarO);
                        }
                        if (b6VarO2 != null) {
                            arrayList.add(size, b6VarO2);
                        }
                    }
                    b6VarO2 = null;
                    arrayList.set(i12, b6Var2);
                    if (b6Var3.d > 0) {
                        arrayList.set(size, b6Var3);
                    } else {
                        arrayList.remove(size);
                        b6Var3.c = null;
                        jo3Var2.a(b6Var3);
                    }
                    if (b6VarO != null) {
                        arrayList.add(size, b6VarO);
                    }
                    if (b6VarO2 != null) {
                        arrayList.add(size, b6VarO2);
                    }
                }
                b6VarO = null;
                i = b6Var2.b;
                i2 = b6Var3.b;
                if (i <= i2) {
                    b6Var3.b = i2 + 1;
                } else {
                    i3 = i2 + b6Var3.d;
                    if (i < i3) {
                        int i210 = i3 - i;
                        b6VarO2 = c6Var.o(b6Var3.c, 4, i + 1, i210);
                        b6Var3.d -= i210;
                    }
                    arrayList.set(i12, b6Var2);
                    if (b6Var3.d > 0) {
                        arrayList.set(size, b6Var3);
                    } else {
                        arrayList.remove(size);
                        b6Var3.c = null;
                        jo3Var2.a(b6Var3);
                    }
                    if (b6VarO != null) {
                        arrayList.add(size, b6VarO);
                    }
                    if (b6VarO2 != null) {
                        arrayList.add(size, b6VarO2);
                    }
                }
                b6VarO2 = null;
                arrayList.set(i12, b6Var2);
                if (b6Var3.d > 0) {
                    arrayList.set(size, b6Var3);
                } else {
                    arrayList.remove(size);
                    b6Var3.c = null;
                    jo3Var2.a(b6Var3);
                }
                if (b6VarO != null) {
                    arrayList.add(size, b6VarO);
                }
                if (b6VarO2 != null) {
                    arrayList.add(size, b6VarO2);
                }
            }
        }
        int size2 = arrayList.size();
        for (int i30 = 0; i30 < size2; i30++) {
            b6 b6VarO4 = (b6) arrayList.get(i30);
            int i31 = b6VarO4.a;
            if (i31 == 1) {
                r(b6VarO4);
            } else if (i31 == 2) {
                int i32 = b6VarO4.b;
                int i33 = b6VarO4.d + i32;
                int i34 = i32;
                int i35 = 0;
                byte b2 = -1;
                while (i34 < i33) {
                    if (si1Var.D(i34) != null || c(i34)) {
                        if (b2 == 0) {
                            g(o(null, 2, i32, i35));
                            z = true;
                        } else {
                            z = false;
                        }
                        b = 1;
                    } else {
                        if (b2 == 1) {
                            r(o(null, 2, i32, i35));
                            z = true;
                        } else {
                            z = false;
                        }
                        b = 0;
                    }
                    if (z) {
                        i34 -= i35;
                        i33 -= i35;
                        i35 = 1;
                    } else {
                        i35++;
                    }
                    i34++;
                    b2 = b;
                }
                if (i35 != b6VarO4.d) {
                    b6VarO4.c = null;
                    jo3Var.a(b6VarO4);
                    b6VarO4 = o(null, 2, i32, i35);
                }
                if (b2 == 0) {
                    g(b6VarO4);
                } else {
                    r(b6VarO4);
                }
            } else if (i31 == 4) {
                int i36 = b6VarO4.b;
                int i37 = b6VarO4.d + i36;
                int i38 = i36;
                int i39 = 0;
                byte b3 = -1;
                while (i36 < i37) {
                    if (si1Var.D(i36) != null || c(i36)) {
                        if (b3 == 0) {
                            g(o(b6VarO4.c, 4, i38, i39));
                            i38 = i36;
                            i39 = 0;
                        }
                        b3 = 1;
                    } else {
                        if (b3 == 1) {
                            r(o(b6VarO4.c, 4, i38, i39));
                            i38 = i36;
                            i39 = 0;
                        }
                        b3 = 0;
                    }
                    i39++;
                    i36++;
                }
                if (i39 != b6VarO4.d) {
                    Object obj2 = b6VarO4.c;
                    b6VarO4.c = null;
                    jo3Var.a(b6VarO4);
                    b6VarO4 = o(obj2, 4, i38, i39);
                }
                if (b3 == 0) {
                    g(b6VarO4);
                } else {
                    r(b6VarO4);
                }
            } else if (i31 == 8) {
                r(b6VarO4);
            }
        }
        arrayList.clear();
    }

    public void t(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            b6 b6Var = (b6) arrayList.get(i);
            b6Var.c = null;
            ((jo3) this.b).a(b6Var);
        }
        arrayList.clear();
    }

    public void u(rp1 rp1Var) {
        int iM0 = ti.m0((rp1[]) this.b, rp1Var);
        if (iM0 >= 0) {
            rp1[] rp1VarArr = (rp1[]) this.b;
            int i = iM0 + 1;
            ti.Z(iM0, i, this.a, rp1VarArr, rp1VarArr);
            rp1[] rp1VarArr2 = (rp1[]) this.b;
            int i2 = this.a;
            rp1VarArr2[i2 - 1] = null;
            float[] fArr = (float[]) this.c;
            System.arraycopy(fArr, i, fArr, iM0, i2 - i);
            byte[] bArr = (byte[]) this.d;
            ti.X(iM0, i, this.a, bArr, bArr);
            this.a--;
        }
    }

    public void v(Runnable runnable) {
        yp4 yp4Var = (yp4) this.b;
        if (yp4Var.a.getLooper().getThread().isAlive()) {
            yp4Var.d(runnable);
        }
    }

    public void w(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((la0) this.d) == null) {
                this.d = new la0();
            }
            la0 la0Var = (la0) this.d;
            la0Var.p = colorStateList;
            la0Var.o = true;
        } else {
            this.d = null;
        }
        b();
    }

    public void x(int i) {
        rr2.w(i >= 0);
        this.a = i;
        j(i);
    }

    public void y(ColorStateList colorStateList) {
        if (((la0) this.e) == null) {
            this.e = new la0();
        }
        la0 la0Var = (la0) this.e;
        la0Var.p = colorStateList;
        la0Var.o = true;
        b();
    }

    public void z(PorterDuff.Mode mode) {
        if (((la0) this.e) == null) {
            this.e = new la0();
        }
        la0 la0Var = (la0) this.e;
        la0Var.q = mode;
        la0Var.n = true;
        b();
    }

    public c6(gz3 gz3Var) {
        this.b = gz3Var;
        this.c = new ArrayDeque();
        this.d = new ArrayDeque();
        this.e = new PriorityQueue();
        this.a = -1;
    }

    public c6(View view) {
        this.a = -1;
        this.b = view;
        this.c = fg.a();
    }
}
