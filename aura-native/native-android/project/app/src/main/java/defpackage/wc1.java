package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.strictmode.FragmentTagUsageViolation;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wc1 implements LayoutInflater.Factory2 {
    public final ld1 n;

    public wc1(ld1 ld1Var) {
        this.n = ld1Var;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        fe1 fe1VarF;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        ld1 ld1Var = this.n;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, ld1Var);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ot3.a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = kc1.class.isAssignableFrom(dd1.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    kc1 kc1VarC = resourceId != -1 ? ld1Var.C(resourceId) : null;
                    if (kc1VarC == null && string != null) {
                        kc1VarC = ld1Var.D(string);
                    }
                    if (kc1VarC == null && id != -1) {
                        kc1VarC = ld1Var.C(id);
                    }
                    if (kc1VarC == null) {
                        dd1 dd1VarF = ld1Var.F();
                        context.getClassLoader();
                        kc1VarC = dd1VarF.a(attributeValue);
                        kc1VarC.A = true;
                        kc1VarC.J = resourceId != 0 ? resourceId : id;
                        kc1VarC.K = id;
                        kc1VarC.L = string;
                        kc1VarC.B = true;
                        kc1VarC.F = ld1Var;
                        mc1 mc1Var = ld1Var.v;
                        kc1VarC.G = mc1Var;
                        kc1VarC.M(mc1Var.B, attributeSet, kc1VarC.o);
                        fe1VarF = ld1Var.a(kc1VarC);
                        if (ld1.I(2)) {
                            Log.v("FragmentManager", "Fragment " + kc1VarC + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (kc1VarC.B) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        kc1VarC.B = true;
                        kc1VarC.F = ld1Var;
                        mc1 mc1Var2 = ld1Var.v;
                        kc1VarC.G = mc1Var2;
                        kc1VarC.M(mc1Var2.B, attributeSet, kc1VarC.o);
                        fe1VarF = ld1Var.f(kc1VarC);
                        if (ld1.I(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + kc1VarC + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    ge1 ge1Var = he1.a;
                    he1.b(new FragmentTagUsageViolation(kc1VarC, "Attempting to use <fragment> tag to add fragment " + kc1VarC + " to container " + viewGroup));
                    he1.a(kc1VarC).getClass();
                    kc1VarC.S = viewGroup;
                    fe1VarF.k();
                    fe1VarF.j();
                    View view2 = kc1VarC.T;
                    if (view2 == null) {
                        kf2.o(xa3.h("Fragment ", attributeValue, " did not create a view."));
                        return null;
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (kc1VarC.T.getTag() == null) {
                        kc1VarC.T.setTag(string);
                    }
                    kc1VarC.T.addOnAttachStateChangeListener(new vc1(this, fe1VarF));
                    return kc1VarC.T;
                }
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
