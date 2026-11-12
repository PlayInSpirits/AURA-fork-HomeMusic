package defpackage;

import android.util.SparseArray;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class te4 implements Comparable {
    public static final Pattern t = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);
    public static final Pattern u = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);
    public static final Pattern v = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);
    public final String n;
    public final long o;
    public final long p;
    public final boolean q;
    public final File r;
    public final long s;

    public te4(String str, long j, long j2, long j3, File file) {
        this.n = str;
        this.o = j;
        this.p = j2;
        this.q = file != null;
        this.r = file;
        this.s = j3;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x009f A[PHI: r2
  0x009f: PHI (r2v15 java.util.regex.Matcher) = (r2v10 java.util.regex.Matcher), (r2v8 java.util.regex.Matcher) binds: [B:26:0x0095, B:22:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a2  */
    public static te4 b(File file, long j, long j2, ml3 ml3Var) {
        File file2;
        long j3;
        String strGroup;
        File fileC;
        String name = file.getName();
        if (name.endsWith(".v3.exo")) {
            file2 = file;
        } else {
            String name2 = file.getName();
            Matcher matcher = u.matcher(name2);
            if (matcher.matches()) {
                strGroup = matcher.group(1);
                strGroup.getClass();
                String str = f35.a;
                int length = strGroup.length();
                int iEnd = 0;
                int i = 0;
                for (int i2 = 0; i2 < length; i2++) {
                    if (strGroup.charAt(i2) == '%') {
                        i++;
                    }
                }
                if (i != 0) {
                    int i3 = length - (i * 2);
                    StringBuilder sb = new StringBuilder(i3);
                    Matcher matcher2 = f35.e.matcher(strGroup);
                    while (i > 0 && matcher2.find()) {
                        String strGroup2 = matcher2.group(1);
                        strGroup2.getClass();
                        char c = (char) Integer.parseInt(strGroup2, 16);
                        sb.append((CharSequence) strGroup, iEnd, matcher2.start());
                        sb.append(c);
                        iEnd = matcher2.end();
                        i--;
                    }
                    if (iEnd < length) {
                        sb.append((CharSequence) strGroup, iEnd, length);
                    }
                    if (sb.length() != i3) {
                        strGroup = null;
                    } else {
                        strGroup = sb.toString();
                    }
                }
            } else {
                matcher = t.matcher(name2);
                if (matcher.matches()) {
                    strGroup = matcher.group(1);
                    strGroup.getClass();
                } else {
                    strGroup = null;
                }
            }
            if (strGroup == null) {
                fileC = null;
            } else {
                File parentFile = file.getParentFile();
                parentFile.getClass();
                int i4 = ml3Var.m(strGroup).a;
                String strGroup3 = matcher.group(2);
                strGroup3.getClass();
                long j4 = Long.parseLong(strGroup3);
                String strGroup4 = matcher.group(3);
                strGroup4.getClass();
                fileC = c(parentFile, i4, j4, Long.parseLong(strGroup4));
                if (!file.renameTo(fileC)) {
                    fileC = null;
                }
            }
            if (fileC == null) {
                return null;
            }
            file2 = fileC;
            name = fileC.getName();
        }
        Matcher matcher3 = v.matcher(name);
        if (!matcher3.matches()) {
            return null;
        }
        String strGroup5 = matcher3.group(1);
        strGroup5.getClass();
        String str2 = (String) ((SparseArray) ml3Var.b).get(Integer.parseInt(strGroup5));
        if (str2 == null) {
            return null;
        }
        long length2 = j == -1 ? file2.length() : j;
        if (length2 == 0) {
            return null;
        }
        String strGroup6 = matcher3.group(2);
        strGroup6.getClass();
        long j5 = Long.parseLong(strGroup6);
        if (j2 == -9223372036854775807L) {
            String strGroup7 = matcher3.group(3);
            strGroup7.getClass();
            j3 = Long.parseLong(strGroup7);
        } else {
            j3 = j2;
        }
        return new te4(str2, j5, length2, j3, file2);
    }

    public static File c(File file, int i, long j, long j2) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(".");
        sb.append(j);
        sb.append(".");
        return new File(file, b11.p(sb, j2, ".v3.exo"));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(te4 te4Var) {
        String str = te4Var.n;
        String str2 = this.n;
        if (!str2.equals(str)) {
            return str2.compareTo(te4Var.n);
        }
        long j = this.o - te4Var.o;
        if (j == 0) {
            return 0;
        }
        return j < 0 ? -1 : 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.o);
        sb.append(", ");
        return b11.p(sb, this.p, "]");
    }
}
