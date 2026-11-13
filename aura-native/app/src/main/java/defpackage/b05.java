/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.graphics.fonts.Font;
import android.graphics.text.PositionedGlyphs;
import android.os.StrictMode;
import android.util.SparseArray;

public abstract class b05 {
    public static int a(PositionedGlyphs positionedGlyphs) {
        return positionedGlyphs.glyphCount();
    }

    public static int b(SparseArray sparseArray) {
        return sparseArray.contentHashCode();
    }

    public static Font.Builder c(Font font) {
        return new Font.Builder(font);
    }

    public static Font d(PositionedGlyphs positionedGlyphs) {
        return positionedGlyphs.getFont(0);
    }

    public static StrictMode.VmPolicy.Builder e(StrictMode.VmPolicy.Builder builder) {
        return builder.permitUnsafeIntentLaunch();
    }

    public static boolean f(SparseArray sparseArray, SparseArray sparseArray2) {
        return sparseArray.contentEquals(sparseArray2);
    }
}

