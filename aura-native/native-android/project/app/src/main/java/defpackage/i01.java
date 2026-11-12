package defpackage;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class i01 extends hw {
    public final TextView j;
    public final c01 k;
    public boolean l = true;

    public i01(TextView textView) {
        this.j = textView;
        this.k = new c01(textView);
    }

    @Override // defpackage.hw
    public final void J(boolean z) {
        if (z) {
            TextView textView = this.j;
            textView.setTransformationMethod(R(textView.getTransformationMethod()));
        }
    }

    @Override // defpackage.hw
    public final void K(boolean z) {
        this.l = z;
        TextView textView = this.j;
        textView.setTransformationMethod(R(textView.getTransformationMethod()));
        textView.setFilters(k(textView.getFilters()));
    }

    @Override // defpackage.hw
    public final TransformationMethod R(TransformationMethod transformationMethod) {
        if (this.l) {
            return ((transformationMethod instanceof m01) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new m01(transformationMethod);
        }
        return transformationMethod instanceof m01 ? ((m01) transformationMethod).n : transformationMethod;
    }

    @Override // defpackage.hw
    public final InputFilter[] k(InputFilter[] inputFilterArr) {
        if (!this.l) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof c01) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i4 = 0;
        while (true) {
            c01 c01Var = this.k;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = c01Var;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == c01Var) {
                return inputFilterArr;
            }
            i4++;
        }
    }

    @Override // defpackage.hw
    public final boolean r() {
        return this.l;
    }
}
