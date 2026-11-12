.class public final Lk20;
.super Lfi2;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/graphics/drawable/Drawable$Callback;
.implements Lwr4;


# static fields
.field public static final S0:[I

.field public static final T0:Landroid/graphics/drawable/ShapeDrawable;


# instance fields
.field public A0:I

.field public B0:I

.field public C0:I

.field public D0:I

.field public E0:Z

.field public F0:I

.field public G0:I

.field public H0:Landroid/graphics/ColorFilter;

.field public I0:Landroid/graphics/PorterDuffColorFilter;

.field public J0:Landroid/content/res/ColorStateList;

.field public K:Landroid/content/res/ColorStateList;

.field public K0:Landroid/graphics/PorterDuff$Mode;

.field public L:Landroid/content/res/ColorStateList;

.field public L0:[I

.field public M:F

.field public M0:Landroid/content/res/ColorStateList;

.field public N:F

.field public N0:Ljava/lang/ref/WeakReference;

.field public O:Landroid/content/res/ColorStateList;

.field public O0:Landroid/text/TextUtils$TruncateAt;

.field public P:F

.field public P0:Z

.field public Q:Landroid/content/res/ColorStateList;

.field public Q0:I

.field public R:Ljava/lang/CharSequence;

.field public R0:Z

.field public S:Z

.field public T:Landroid/graphics/drawable/Drawable;

.field public U:Landroid/content/res/ColorStateList;

.field public V:F

.field public W:Z

.field public X:Z

.field public Y:Landroid/graphics/drawable/Drawable;

.field public Z:Landroid/graphics/drawable/RippleDrawable;

.field public a0:Landroid/content/res/ColorStateList;

.field public b0:F

.field public c0:Landroid/text/SpannableStringBuilder;

.field public d0:Z

.field public e0:Z

.field public f0:Landroid/graphics/drawable/Drawable;

.field public g0:Landroid/content/res/ColorStateList;

.field public h0:Lzx2;

.field public i0:Lzx2;

.field public j0:F

.field public k0:F

.field public l0:F

.field public m0:F

.field public n0:F

.field public o0:F

.field public p0:F

.field public q0:F

.field public final r0:Landroid/content/Context;

.field public final s0:Landroid/graphics/Paint;

.field public final t0:Landroid/graphics/Paint$FontMetrics;

.field public final u0:Landroid/graphics/RectF;

.field public final v0:Landroid/graphics/PointF;

.field public final w0:Landroid/graphics/Path;

.field public final x0:Lxr4;

.field public y0:I

.field public z0:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const v0, 0x101009e

    .line 2
    .line 3
    .line 4
    filled-new-array {v0}, [I

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sput-object v0, Lk20;->S0:[I

    .line 9
    .line 10
    new-instance v0, Landroid/graphics/drawable/ShapeDrawable;

    .line 11
    .line 12
    new-instance v1, Landroid/graphics/drawable/shapes/OvalShape;

    .line 13
    .line 14
    invoke-direct {v1}, Landroid/graphics/drawable/shapes/OvalShape;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1}, Landroid/graphics/drawable/ShapeDrawable;-><init>(Landroid/graphics/drawable/shapes/Shape;)V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lk20;->T0:Landroid/graphics/drawable/ShapeDrawable;

    .line 21
    .line 22
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 1
    const v0, 0x7f140488

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, p2, p3, v0}, Lfi2;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 5
    .line 6
    .line 7
    const/high16 p2, -0x40800000    # -1.0f

    .line 8
    .line 9
    iput p2, p0, Lk20;->N:F

    .line 10
    .line 11
    new-instance p2, Landroid/graphics/Paint;

    .line 12
    .line 13
    const/4 p3, 0x1

    .line 14
    invoke-direct {p2, p3}, Landroid/graphics/Paint;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object p2, p0, Lk20;->s0:Landroid/graphics/Paint;

    .line 18
    .line 19
    new-instance p2, Landroid/graphics/Paint$FontMetrics;

    .line 20
    .line 21
    invoke-direct {p2}, Landroid/graphics/Paint$FontMetrics;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p2, p0, Lk20;->t0:Landroid/graphics/Paint$FontMetrics;

    .line 25
    .line 26
    new-instance p2, Landroid/graphics/RectF;

    .line 27
    .line 28
    invoke-direct {p2}, Landroid/graphics/RectF;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object p2, p0, Lk20;->u0:Landroid/graphics/RectF;

    .line 32
    .line 33
    new-instance p2, Landroid/graphics/PointF;

    .line 34
    .line 35
    invoke-direct {p2}, Landroid/graphics/PointF;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object p2, p0, Lk20;->v0:Landroid/graphics/PointF;

    .line 39
    .line 40
    new-instance p2, Landroid/graphics/Path;

    .line 41
    .line 42
    invoke-direct {p2}, Landroid/graphics/Path;-><init>()V

    .line 43
    .line 44
    .line 45
    iput-object p2, p0, Lk20;->w0:Landroid/graphics/Path;

    .line 46
    .line 47
    const/16 p2, 0xff

    .line 48
    .line 49
    iput p2, p0, Lk20;->G0:I

    .line 50
    .line 51
    sget-object p2, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 52
    .line 53
    iput-object p2, p0, Lk20;->K0:Landroid/graphics/PorterDuff$Mode;

    .line 54
    .line 55
    new-instance p2, Ljava/lang/ref/WeakReference;

    .line 56
    .line 57
    const/4 v0, 0x0

    .line 58
    invoke-direct {p2, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iput-object p2, p0, Lk20;->N0:Ljava/lang/ref/WeakReference;

    .line 62
    .line 63
    invoke-virtual {p0, p1}, Lfi2;->j(Landroid/content/Context;)V

    .line 64
    .line 65
    .line 66
    iput-object p1, p0, Lk20;->r0:Landroid/content/Context;

    .line 67
    .line 68
    new-instance p2, Lxr4;

    .line 69
    .line 70
    invoke-direct {p2, p0}, Lxr4;-><init>(Lwr4;)V

    .line 71
    .line 72
    .line 73
    iput-object p2, p0, Lk20;->x0:Lxr4;

    .line 74
    .line 75
    const-string v0, ""

    .line 76
    .line 77
    iput-object v0, p0, Lk20;->R:Ljava/lang/CharSequence;

    .line 78
    .line 79
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    .line 88
    .line 89
    iget-object p2, p2, Lxr4;->a:Landroid/text/TextPaint;

    .line 90
    .line 91
    iput p1, p2, Landroid/text/TextPaint;->density:F

    .line 92
    .line 93
    sget-object p1, Lk20;->S0:[I

    .line 94
    .line 95
    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 96
    .line 97
    .line 98
    iget-object p2, p0, Lk20;->L0:[I

    .line 99
    .line 100
    invoke-static {p2, p1}, Ljava/util/Arrays;->equals([I[I)Z

    .line 101
    .line 102
    .line 103
    move-result p2

    .line 104
    if-nez p2, :cond_0

    .line 105
    .line 106
    iput-object p1, p0, Lk20;->L0:[I

    .line 107
    .line 108
    invoke-virtual {p0}, Lk20;->a0()Z

    .line 109
    .line 110
    .line 111
    move-result p2

    .line 112
    if-eqz p2, :cond_0

    .line 113
    .line 114
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    invoke-virtual {p0, p2, p1}, Lk20;->D([I[I)Z

    .line 119
    .line 120
    .line 121
    :cond_0
    iput-boolean p3, p0, Lk20;->P0:Z

    .line 122
    .line 123
    sget-object p0, Ll24;->a:[I

    .line 124
    .line 125
    sget-object p0, Lk20;->T0:Landroid/graphics/drawable/ShapeDrawable;

    .line 126
    .line 127
    const/4 p1, -0x1

    .line 128
    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    .line 129
    .line 130
    .line 131
    return-void
.end method

.method public static A(Landroid/content/res/ColorStateList;)Z
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/content/res/ColorStateList;->isStateful()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public static B(Landroid/graphics/drawable/Drawable;)Z
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public static b0(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, v0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 5
    .line 6
    .line 7
    :cond_0
    return-void
.end method


# virtual methods
.method public final C()V
    .locals 1

    .line 1
    iget-object p0, p0, Lk20;->N0:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/google/android/material/chip/Chip;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    iget v0, p0, Lcom/google/android/material/chip/Chip;->D:I

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lcom/google/android/material/chip/Chip;->c(I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->invalidateOutline()V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public final D([I[I)Z
    .locals 8

    .line 1
    invoke-super {p0, p1}, Lfi2;->onStateChange([I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lk20;->K:Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    iget v3, p0, Lk20;->y0:I

    .line 11
    .line 12
    invoke-virtual {v1, p1, v3}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v1, v2

    .line 18
    :goto_0
    invoke-virtual {p0, v1}, Lfi2;->c(I)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    iget v3, p0, Lk20;->y0:I

    .line 23
    .line 24
    const/4 v4, 0x1

    .line 25
    if-eq v3, v1, :cond_1

    .line 26
    .line 27
    iput v1, p0, Lk20;->y0:I

    .line 28
    .line 29
    move v0, v4

    .line 30
    :cond_1
    iget-object v3, p0, Lk20;->L:Landroid/content/res/ColorStateList;

    .line 31
    .line 32
    if-eqz v3, :cond_2

    .line 33
    .line 34
    iget v5, p0, Lk20;->z0:I

    .line 35
    .line 36
    invoke-virtual {v3, p1, v5}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    goto :goto_1

    .line 41
    :cond_2
    move v3, v2

    .line 42
    :goto_1
    invoke-virtual {p0, v3}, Lfi2;->c(I)I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    iget v5, p0, Lk20;->z0:I

    .line 47
    .line 48
    if-eq v5, v3, :cond_3

    .line 49
    .line 50
    iput v3, p0, Lk20;->z0:I

    .line 51
    .line 52
    move v0, v4

    .line 53
    :cond_3
    invoke-static {v3, v1}, Lv50;->g(II)I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    iget v3, p0, Lk20;->A0:I

    .line 58
    .line 59
    if-eq v3, v1, :cond_4

    .line 60
    .line 61
    move v3, v4

    .line 62
    goto :goto_2

    .line 63
    :cond_4
    move v3, v2

    .line 64
    :goto_2
    iget-object v5, p0, Lfi2;->n:Lei2;

    .line 65
    .line 66
    iget-object v5, v5, Lei2;->c:Landroid/content/res/ColorStateList;

    .line 67
    .line 68
    if-nez v5, :cond_5

    .line 69
    .line 70
    move v5, v4

    .line 71
    goto :goto_3

    .line 72
    :cond_5
    move v5, v2

    .line 73
    :goto_3
    or-int/2addr v3, v5

    .line 74
    if-eqz v3, :cond_6

    .line 75
    .line 76
    iput v1, p0, Lk20;->A0:I

    .line 77
    .line 78
    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {p0, v0}, Lfi2;->m(Landroid/content/res/ColorStateList;)V

    .line 83
    .line 84
    .line 85
    move v0, v4

    .line 86
    :cond_6
    iget-object v1, p0, Lk20;->O:Landroid/content/res/ColorStateList;

    .line 87
    .line 88
    if-eqz v1, :cond_7

    .line 89
    .line 90
    iget v3, p0, Lk20;->B0:I

    .line 91
    .line 92
    invoke-virtual {v1, p1, v3}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    goto :goto_4

    .line 97
    :cond_7
    move v1, v2

    .line 98
    :goto_4
    iget v3, p0, Lk20;->B0:I

    .line 99
    .line 100
    if-eq v3, v1, :cond_8

    .line 101
    .line 102
    iput v1, p0, Lk20;->B0:I

    .line 103
    .line 104
    move v0, v4

    .line 105
    :cond_8
    iget-object v1, p0, Lk20;->M0:Landroid/content/res/ColorStateList;

    .line 106
    .line 107
    if-eqz v1, :cond_9

    .line 108
    .line 109
    invoke-static {p1}, Ll24;->d([I)Z

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    if-eqz v1, :cond_9

    .line 114
    .line 115
    iget-object v1, p0, Lk20;->M0:Landroid/content/res/ColorStateList;

    .line 116
    .line 117
    iget v3, p0, Lk20;->C0:I

    .line 118
    .line 119
    invoke-virtual {v1, p1, v3}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    goto :goto_5

    .line 124
    :cond_9
    move v1, v2

    .line 125
    :goto_5
    iget v3, p0, Lk20;->C0:I

    .line 126
    .line 127
    if-eq v3, v1, :cond_a

    .line 128
    .line 129
    iput v1, p0, Lk20;->C0:I

    .line 130
    .line 131
    :cond_a
    iget-object v1, p0, Lk20;->x0:Lxr4;

    .line 132
    .line 133
    iget-object v1, v1, Lxr4;->g:Lrr4;

    .line 134
    .line 135
    if-eqz v1, :cond_b

    .line 136
    .line 137
    iget-object v1, v1, Lrr4;->j:Landroid/content/res/ColorStateList;

    .line 138
    .line 139
    if-eqz v1, :cond_b

    .line 140
    .line 141
    iget v3, p0, Lk20;->D0:I

    .line 142
    .line 143
    invoke-virtual {v1, p1, v3}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    goto :goto_6

    .line 148
    :cond_b
    move v1, v2

    .line 149
    :goto_6
    iget v3, p0, Lk20;->D0:I

    .line 150
    .line 151
    if-eq v3, v1, :cond_c

    .line 152
    .line 153
    iput v1, p0, Lk20;->D0:I

    .line 154
    .line 155
    move v0, v4

    .line 156
    :cond_c
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    if-nez v1, :cond_d

    .line 161
    .line 162
    goto :goto_8

    .line 163
    :cond_d
    array-length v3, v1

    .line 164
    move v5, v2

    .line 165
    :goto_7
    if-ge v5, v3, :cond_f

    .line 166
    .line 167
    aget v6, v1, v5

    .line 168
    .line 169
    const v7, 0x10100a0

    .line 170
    .line 171
    .line 172
    if-ne v6, v7, :cond_e

    .line 173
    .line 174
    iget-boolean v1, p0, Lk20;->d0:Z

    .line 175
    .line 176
    if-eqz v1, :cond_f

    .line 177
    .line 178
    move v1, v4

    .line 179
    goto :goto_9

    .line 180
    :cond_e
    add-int/lit8 v5, v5, 0x1

    .line 181
    .line 182
    goto :goto_7

    .line 183
    :cond_f
    :goto_8
    move v1, v2

    .line 184
    :goto_9
    iget-boolean v3, p0, Lk20;->E0:Z

    .line 185
    .line 186
    if-eq v3, v1, :cond_11

    .line 187
    .line 188
    iget-object v3, p0, Lk20;->f0:Landroid/graphics/drawable/Drawable;

    .line 189
    .line 190
    if-eqz v3, :cond_11

    .line 191
    .line 192
    invoke-virtual {p0}, Lk20;->x()F

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    iput-boolean v1, p0, Lk20;->E0:Z

    .line 197
    .line 198
    invoke-virtual {p0}, Lk20;->x()F

    .line 199
    .line 200
    .line 201
    move-result v1

    .line 202
    cmpl-float v0, v0, v1

    .line 203
    .line 204
    if-eqz v0, :cond_10

    .line 205
    .line 206
    move v0, v4

    .line 207
    move v1, v0

    .line 208
    goto :goto_a

    .line 209
    :cond_10
    move v1, v2

    .line 210
    move v0, v4

    .line 211
    goto :goto_a

    .line 212
    :cond_11
    move v1, v2

    .line 213
    :goto_a
    iget-object v3, p0, Lk20;->J0:Landroid/content/res/ColorStateList;

    .line 214
    .line 215
    if-eqz v3, :cond_12

    .line 216
    .line 217
    iget v5, p0, Lk20;->F0:I

    .line 218
    .line 219
    invoke-virtual {v3, p1, v5}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 220
    .line 221
    .line 222
    move-result v3

    .line 223
    goto :goto_b

    .line 224
    :cond_12
    move v3, v2

    .line 225
    :goto_b
    iget v5, p0, Lk20;->F0:I

    .line 226
    .line 227
    if-eq v5, v3, :cond_15

    .line 228
    .line 229
    iput v3, p0, Lk20;->F0:I

    .line 230
    .line 231
    iget-object v0, p0, Lk20;->J0:Landroid/content/res/ColorStateList;

    .line 232
    .line 233
    iget-object v3, p0, Lk20;->K0:Landroid/graphics/PorterDuff$Mode;

    .line 234
    .line 235
    if-eqz v0, :cond_14

    .line 236
    .line 237
    if-nez v3, :cond_13

    .line 238
    .line 239
    goto :goto_c

    .line 240
    :cond_13
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    .line 241
    .line 242
    .line 243
    move-result-object v5

    .line 244
    invoke-virtual {v0, v5, v2}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 245
    .line 246
    .line 247
    move-result v0

    .line 248
    new-instance v5, Landroid/graphics/PorterDuffColorFilter;

    .line 249
    .line 250
    invoke-direct {v5, v0, v3}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    .line 251
    .line 252
    .line 253
    goto :goto_d

    .line 254
    :cond_14
    :goto_c
    const/4 v5, 0x0

    .line 255
    :goto_d
    iput-object v5, p0, Lk20;->I0:Landroid/graphics/PorterDuffColorFilter;

    .line 256
    .line 257
    goto :goto_e

    .line 258
    :cond_15
    move v4, v0

    .line 259
    :goto_e
    iget-object v0, p0, Lk20;->T:Landroid/graphics/drawable/Drawable;

    .line 260
    .line 261
    invoke-static {v0}, Lk20;->B(Landroid/graphics/drawable/Drawable;)Z

    .line 262
    .line 263
    .line 264
    move-result v0

    .line 265
    if-eqz v0, :cond_16

    .line 266
    .line 267
    iget-object v0, p0, Lk20;->T:Landroid/graphics/drawable/Drawable;

    .line 268
    .line 269
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 270
    .line 271
    .line 272
    move-result v0

    .line 273
    or-int/2addr v4, v0

    .line 274
    :cond_16
    iget-object v0, p0, Lk20;->f0:Landroid/graphics/drawable/Drawable;

    .line 275
    .line 276
    invoke-static {v0}, Lk20;->B(Landroid/graphics/drawable/Drawable;)Z

    .line 277
    .line 278
    .line 279
    move-result v0

    .line 280
    if-eqz v0, :cond_17

    .line 281
    .line 282
    iget-object v0, p0, Lk20;->f0:Landroid/graphics/drawable/Drawable;

    .line 283
    .line 284
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 285
    .line 286
    .line 287
    move-result v0

    .line 288
    or-int/2addr v4, v0

    .line 289
    :cond_17
    iget-object v0, p0, Lk20;->Y:Landroid/graphics/drawable/Drawable;

    .line 290
    .line 291
    invoke-static {v0}, Lk20;->B(Landroid/graphics/drawable/Drawable;)Z

    .line 292
    .line 293
    .line 294
    move-result v0

    .line 295
    if-eqz v0, :cond_18

    .line 296
    .line 297
    array-length v0, p1

    .line 298
    array-length v3, p2

    .line 299
    add-int/2addr v0, v3

    .line 300
    new-array v0, v0, [I

    .line 301
    .line 302
    array-length v3, p1

    .line 303
    invoke-static {p1, v2, v0, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 304
    .line 305
    .line 306
    array-length p1, p1

    .line 307
    array-length v3, p2

    .line 308
    invoke-static {p2, v2, v0, p1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 309
    .line 310
    .line 311
    iget-object p1, p0, Lk20;->Y:Landroid/graphics/drawable/Drawable;

    .line 312
    .line 313
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 314
    .line 315
    .line 316
    move-result p1

    .line 317
    or-int/2addr v4, p1

    .line 318
    :cond_18
    sget-object p1, Ll24;->a:[I

    .line 319
    .line 320
    iget-object p1, p0, Lk20;->Z:Landroid/graphics/drawable/RippleDrawable;

    .line 321
    .line 322
    invoke-static {p1}, Lk20;->B(Landroid/graphics/drawable/Drawable;)Z

    .line 323
    .line 324
    .line 325
    move-result p1

    .line 326
    if-eqz p1, :cond_19

    .line 327
    .line 328
    iget-object p1, p0, Lk20;->Z:Landroid/graphics/drawable/RippleDrawable;

    .line 329
    .line 330
    invoke-virtual {p1, p2}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 331
    .line 332
    .line 333
    move-result p1

    .line 334
    or-int/2addr v4, p1

    .line 335
    :cond_19
    if-eqz v4, :cond_1a

    .line 336
    .line 337
    invoke-virtual {p0}, Lfi2;->invalidateSelf()V

    .line 338
    .line 339
    .line 340
    :cond_1a
    if-eqz v1, :cond_1b

    .line 341
    .line 342
    invoke-virtual {p0}, Lk20;->C()V

    .line 343
    .line 344
    .line 345
    :cond_1b
    return v4
.end method

.method public final E(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lk20;->d0:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_1

    .line 4
    .line 5
    iput-boolean p1, p0, Lk20;->d0:Z

    .line 6
    .line 7
    invoke-virtual {p0}, Lk20;->x()F

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    iget-boolean p1, p0, Lk20;->E0:Z

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    iput-boolean p1, p0, Lk20;->E0:Z

    .line 19
    .line 20
    :cond_0
    invoke-virtual {p0}, Lk20;->x()F

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    invoke-virtual {p0}, Lfi2;->invalidateSelf()V

    .line 25
    .line 26
    .line 27
    cmpl-float p1, v0, p1

    .line 28
    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    invoke-virtual {p0}, Lk20;->C()V

    .line 32
    .line 33
    .line 34
    :cond_1
    return-void
.end method

.method public final F(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lk20;->f0:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lk20;->x()F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iput-object p1, p0, Lk20;->f0:Landroid/graphics/drawable/Drawable;

    .line 10
    .line 11
    invoke-virtual {p0}, Lk20;->x()F

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    iget-object v1, p0, Lk20;->f0:Landroid/graphics/drawable/Drawable;

    .line 16
    .line 17
    invoke-static {v1}, Lk20;->b0(Landroid/graphics/drawable/Drawable;)V

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lk20;->f0:Landroid/graphics/drawable/Drawable;

    .line 21
    .line 22
    invoke-virtual {p0, v1}, Lk20;->v(Landroid/graphics/drawable/Drawable;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lfi2;->invalidateSelf()V

    .line 26
    .line 27
    .line 28
    cmpl-float p1, v0, p1

    .line 29
    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    invoke-virtual {p0}, Lk20;->C()V

    .line 33
    .line 34
    .line 35
    :cond_0
    return-void
.end method

.method public final G(Landroid/content/res/ColorStateList;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lk20;->g0:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    if-eq v0, p1, :cond_1

    .line 4
    .line 5
    iput-object p1, p0, Lk20;->g0:Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    iget-boolean v0, p0, Lk20;->e0:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lk20;->f0:Landroid/graphics/drawable/Drawable;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-boolean v1, p0, Lk20;->d0:Z

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p0, p1}, Lk20;->onStateChange([I)Z

    .line 27
    .line 28
    .line 29
    :cond_1
    return-void
.end method

.method public final H(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lk20;->e0:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Lk20;->Y()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iput-boolean p1, p0, Lk20;->e0:Z

    .line 10
    .line 11
    invoke-virtual {p0}, Lk20;->Y()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eq v0, p1, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Lk20;->f0:Landroid/graphics/drawable/Drawable;

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lk20;->v(Landroid/graphics/drawable/Drawable;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-static {v0}, Lk20;->b0(Landroid/graphics/drawable/Drawable;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    invoke-virtual {p0}, Lfi2;->invalidateSelf()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lk20;->C()V

    .line 32
    .line 33
    .line 34
    :cond_1
    return-void
.end method

.method public final I(F)V
    .locals 1

    .line 1
    iget v0, p0, Lk20;->N:F

    .line 2
    .line 3
    cmpl-float v0, v0, p1

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput p1, p0, Lk20;->N:F

    .line 8
    .line 9
    iget-object v0, p0, Lfi2;->n:Lei2;

    .line 10
    .line 11
    iget-object v0, v0, Lei2;->a:Lbc4;

    .line 12
    .line 13
    invoke-virtual {v0}, Lbc4;->g()Lzc1;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0, p1}, Lzc1;->b(F)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lzc1;->a()Lbc4;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p0, p1}, Lfi2;->setShapeAppearanceModel(Lbc4;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public final J(Landroid/graphics/drawable/Drawable;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lk20;->T:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    move-object v0, v1

    .line 8
    :goto_0
    if-eq v0, p1, :cond_3

    .line 9
    .line 10
    invoke-virtual {p0}, Lk20;->x()F

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :cond_1
    iput-object v1, p0, Lk20;->T:Landroid/graphics/drawable/Drawable;

    .line 21
    .line 22
    invoke-virtual {p0}, Lk20;->x()F

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    invoke-static {v0}, Lk20;->b0(Landroid/graphics/drawable/Drawable;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lk20;->Z()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    iget-object v0, p0, Lk20;->T:Landroid/graphics/drawable/Drawable;

    .line 36
    .line 37
    invoke-virtual {p0, v0}, Lk20;->v(Landroid/graphics/drawable/Drawable;)V

    .line 38
    .line 39
    .line 40
    :cond_2
    invoke-virtual {p0}, Lfi2;->invalidateSelf()V

    .line 41
    .line 42
    .line 43
    cmpl-float p1, v2, p1

    .line 44
    .line 45
    if-eqz p1, :cond_3

    .line 46
    .line 47
    invoke-virtual {p0}, Lk20;->C()V

    .line 48
    .line 49
    .line 50
    :cond_3
    return-void
.end method

.method public final K(F)V
    .locals 1

    .line 1
    iget v0, p0, Lk20;->V:F

    .line 2
    .line 3
    cmpl-float v0, v0, p1

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lk20;->x()F

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iput p1, p0, Lk20;->V:F

    .line 12
    .line 13
    invoke-virtual {p0}, Lk20;->x()F

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-virtual {p0}, Lfi2;->invalidateSelf()V

    .line 18
    .line 19
    .line 20
    cmpl-float p1, v0, p1

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0}, Lk20;->C()V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public final L(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lk20;->W:Z

    .line 3
    .line 4
    iget-object v0, p0, Lk20;->U:Landroid/content/res/ColorStateList;

    .line 5
    .line 6
    if-eq v0, p1, :cond_1

    .line 7
    .line 8
    iput-object p1, p0, Lk20;->U:Landroid/content/res/ColorStateList;

    .line 9
    .line 10
    invoke-virtual {p0}, Lk20;->Z()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lk20;->T:Landroid/graphics/drawable/Drawable;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p0, p1}, Lk20;->onStateChange([I)Z

    .line 26
    .line 27
    .line 28
    :cond_1
    return-void
.end method

.method public final M(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lk20;->S:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Lk20;->Z()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iput-boolean p1, p0, Lk20;->S:Z

    .line 10
    .line 11
    invoke-virtual {p0}, Lk20;->Z()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eq v0, p1, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Lk20;->T:Landroid/graphics/drawable/Drawable;

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lk20;->v(Landroid/graphics/drawable/Drawable;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-static {v0}, Lk20;->b0(Landroid/graphics/drawable/Drawable;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    invoke-virtual {p0}, Lfi2;->invalidateSelf()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lk20;->C()V

    .line 32
    .line 33
    .line 34
    :cond_1
    return-void
.end method

.method public final N(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lk20;->O:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    if-eq v0, p1, :cond_1

    .line 4
    .line 5
    iput-object p1, p0, Lk20;->O:Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    iget-boolean v0, p0, Lk20;->R0:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lfi2;->q(Landroid/content/res/ColorStateList;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p0, p1}, Lk20;->onStateChange([I)Z

    .line 19
    .line 20
    .line 21
    :cond_1
    return-void
.end method

.method public final O(F)V
    .locals 1

    .line 1
    iget v0, p0, Lk20;->P:F

    .line 2
    .line 3
    cmpl-float v0, v0, p1

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iput p1, p0, Lk20;->P:F

    .line 8
    .line 9
    iget-object v0, p0, Lk20;->s0:Landroid/graphics/Paint;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 12
    .line 13
    .line 14
    iget-boolean v0, p0, Lk20;->R0:Z

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lfi2;->r(F)V

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-virtual {p0}, Lfi2;->invalidateSelf()V

    .line 22
    .line 23
    .line 24
    :cond_1
    return-void
.end method

.method public final P(Landroid/graphics/drawable/Drawable;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lk20;->Y:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    move-object v0, v1

    .line 8
    :goto_0
    if-eq v0, p1, :cond_3

    .line 9
    .line 10
    invoke-virtual {p0}, Lk20;->y()F

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :cond_1
    iput-object v1, p0, Lk20;->Y:Landroid/graphics/drawable/Drawable;

    .line 21
    .line 22
    sget-object p1, Ll24;->a:[I

    .line 23
    .line 24
    new-instance p1, Landroid/graphics/drawable/RippleDrawable;

    .line 25
    .line 26
    iget-object v1, p0, Lk20;->Q:Landroid/content/res/ColorStateList;

    .line 27
    .line 28
    invoke-static {v1}, Ll24;->c(Landroid/content/res/ColorStateList;)Landroid/content/res/ColorStateList;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iget-object v3, p0, Lk20;->Y:Landroid/graphics/drawable/Drawable;

    .line 33
    .line 34
    sget-object v4, Lk20;->T0:Landroid/graphics/drawable/ShapeDrawable;

    .line 35
    .line 36
    invoke-direct {p1, v1, v3, v4}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, Lk20;->Z:Landroid/graphics/drawable/RippleDrawable;

    .line 40
    .line 41
    invoke-virtual {p0}, Lk20;->y()F

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    invoke-static {v0}, Lk20;->b0(Landroid/graphics/drawable/Drawable;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Lk20;->a0()Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_2

    .line 53
    .line 54
    iget-object v0, p0, Lk20;->Y:Landroid/graphics/drawable/Drawable;

    .line 55
    .line 56
    invoke-virtual {p0, v0}, Lk20;->v(Landroid/graphics/drawable/Drawable;)V

    .line 57
    .line 58
    .line 59
    :cond_2
    invoke-virtual {p0}, Lfi2;->invalidateSelf()V

    .line 60
    .line 61
    .line 62
    cmpl-float p1, v2, p1

    .line 63
    .line 64
    if-eqz p1, :cond_3

    .line 65
    .line 66
    invoke-virtual {p0}, Lk20;->C()V

    .line 67
    .line 68
    .line 69
    :cond_3
    return-void
.end method

.method public final Q(F)V
    .locals 1

    .line 1
    iget v0, p0, Lk20;->p0:F

    .line 2
    .line 3
    cmpl-float v0, v0, p1

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput p1, p0, Lk20;->p0:F

    .line 8
    .line 9
    invoke-virtual {p0}, Lfi2;->invalidateSelf()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lk20;->a0()Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Lk20;->C()V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public final R(F)V
    .locals 1

    .line 1
    iget v0, p0, Lk20;->b0:F

    .line 2
    .line 3
    cmpl-float v0, v0, p1

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput p1, p0, Lk20;->b0:F

    .line 8
    .line 9
    invoke-virtual {p0}, Lfi2;->invalidateSelf()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lk20;->a0()Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Lk20;->C()V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public final S(F)V
    .locals 1

    .line 1
    iget v0, p0, Lk20;->o0:F

    .line 2
    .line 3
    cmpl-float v0, v0, p1

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput p1, p0, Lk20;->o0:F

    .line 8
    .line 9
    invoke-virtual {p0}, Lfi2;->invalidateSelf()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lk20;->a0()Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Lk20;->C()V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public final T(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lk20;->a0:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    if-eq v0, p1, :cond_1

    .line 4
    .line 5
    iput-object p1, p0, Lk20;->a0:Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    invoke-virtual {p0}, Lk20;->a0()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lk20;->Y:Landroid/graphics/drawable/Drawable;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p0, p1}, Lk20;->onStateChange([I)Z

    .line 23
    .line 24
    .line 25
    :cond_1
    return-void
.end method

.method public final U(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lk20;->X:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Lk20;->a0()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iput-boolean p1, p0, Lk20;->X:Z

    .line 10
    .line 11
    invoke-virtual {p0}, Lk20;->a0()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eq v0, p1, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Lk20;->Y:Landroid/graphics/drawable/Drawable;

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lk20;->v(Landroid/graphics/drawable/Drawable;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-static {v0}, Lk20;->b0(Landroid/graphics/drawable/Drawable;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    invoke-virtual {p0}, Lfi2;->invalidateSelf()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lk20;->C()V

    .line 32
    .line 33
    .line 34
    :cond_1
    return-void
.end method

.method public final V(F)V
    .locals 1

    .line 1
    iget v0, p0, Lk20;->l0:F

    .line 2
    .line 3
    cmpl-float v0, v0, p1

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lk20;->x()F

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iput p1, p0, Lk20;->l0:F

    .line 12
    .line 13
    invoke-virtual {p0}, Lk20;->x()F

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-virtual {p0}, Lfi2;->invalidateSelf()V

    .line 18
    .line 19
    .line 20
    cmpl-float p1, v0, p1

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0}, Lk20;->C()V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public final W(F)V
    .locals 1

    .line 1
    iget v0, p0, Lk20;->k0:F

    .line 2
    .line 3
    cmpl-float v0, v0, p1

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lk20;->x()F

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iput p1, p0, Lk20;->k0:F

    .line 12
    .line 13
    invoke-virtual {p0}, Lk20;->x()F

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-virtual {p0}, Lfi2;->invalidateSelf()V

    .line 18
    .line 19
    .line 20
    cmpl-float p1, v0, p1

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0}, Lk20;->C()V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public final X(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lk20;->Q:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Lk20;->Q:Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    iput-object p1, p0, Lk20;->M0:Landroid/content/res/ColorStateList;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p0, p1}, Lk20;->onStateChange([I)Z

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final Y()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lk20;->e0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lk20;->f0:Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-boolean p0, p0, Lk20;->E0:Z

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method public final Z()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lk20;->S:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lk20;->T:Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public final a()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lk20;->C()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lfi2;->invalidateSelf()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final a0()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lk20;->X:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lk20;->Y:Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public final draw(Landroid/graphics/Canvas;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 4
    .line 5
    .line 6
    move-result-object v7

    .line 7
    invoke-virtual {v7}, Landroid/graphics/Rect;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_18

    .line 12
    .line 13
    iget v6, v0, Lk20;->G0:I

    .line 14
    .line 15
    if-nez v6, :cond_0

    .line 16
    .line 17
    goto/16 :goto_a

    .line 18
    .line 19
    :cond_0
    const/16 v8, 0xff

    .line 20
    .line 21
    const/4 v9, 0x0

    .line 22
    if-ge v6, v8, :cond_1

    .line 23
    .line 24
    iget v1, v7, Landroid/graphics/Rect;->left:I

    .line 25
    .line 26
    int-to-float v2, v1

    .line 27
    iget v1, v7, Landroid/graphics/Rect;->top:I

    .line 28
    .line 29
    int-to-float v3, v1

    .line 30
    iget v1, v7, Landroid/graphics/Rect;->right:I

    .line 31
    .line 32
    int-to-float v4, v1

    .line 33
    iget v1, v7, Landroid/graphics/Rect;->bottom:I

    .line 34
    .line 35
    int-to-float v5, v1

    .line 36
    move-object/from16 v1, p1

    .line 37
    .line 38
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->saveLayerAlpha(FFFFI)I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    move v10, v2

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    move-object/from16 v1, p1

    .line 45
    .line 46
    move v10, v9

    .line 47
    :goto_0
    iget-boolean v2, v0, Lk20;->R0:Z

    .line 48
    .line 49
    move v3, v2

    .line 50
    iget-object v2, v0, Lk20;->s0:Landroid/graphics/Paint;

    .line 51
    .line 52
    iget-object v11, v0, Lk20;->u0:Landroid/graphics/RectF;

    .line 53
    .line 54
    if-nez v3, :cond_2

    .line 55
    .line 56
    iget v3, v0, Lk20;->y0:I

    .line 57
    .line 58
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 59
    .line 60
    .line 61
    sget-object v3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 62
    .line 63
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v11, v7}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Lk20;->z()F

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    invoke-virtual {v0}, Lk20;->z()F

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    invoke-virtual {v1, v11, v3, v4, v2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 78
    .line 79
    .line 80
    :cond_2
    iget-boolean v3, v0, Lk20;->R0:Z

    .line 81
    .line 82
    if-nez v3, :cond_4

    .line 83
    .line 84
    iget v3, v0, Lk20;->z0:I

    .line 85
    .line 86
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 87
    .line 88
    .line 89
    sget-object v3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 90
    .line 91
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 92
    .line 93
    .line 94
    iget-object v3, v0, Lk20;->H0:Landroid/graphics/ColorFilter;

    .line 95
    .line 96
    if-eqz v3, :cond_3

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_3
    iget-object v3, v0, Lk20;->I0:Landroid/graphics/PorterDuffColorFilter;

    .line 100
    .line 101
    :goto_1
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v11, v7}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0}, Lk20;->z()F

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    invoke-virtual {v0}, Lk20;->z()F

    .line 112
    .line 113
    .line 114
    move-result v4

    .line 115
    invoke-virtual {v1, v11, v3, v4, v2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 116
    .line 117
    .line 118
    :cond_4
    iget-boolean v3, v0, Lk20;->R0:Z

    .line 119
    .line 120
    if-eqz v3, :cond_5

    .line 121
    .line 122
    invoke-super/range {p0 .. p1}, Lfi2;->draw(Landroid/graphics/Canvas;)V

    .line 123
    .line 124
    .line 125
    :cond_5
    iget v3, v0, Lk20;->P:F

    .line 126
    .line 127
    const/4 v6, 0x0

    .line 128
    cmpl-float v3, v3, v6

    .line 129
    .line 130
    const/high16 v12, 0x40000000    # 2.0f

    .line 131
    .line 132
    if-lez v3, :cond_8

    .line 133
    .line 134
    iget-boolean v3, v0, Lk20;->R0:Z

    .line 135
    .line 136
    if-nez v3, :cond_8

    .line 137
    .line 138
    iget v3, v0, Lk20;->B0:I

    .line 139
    .line 140
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 141
    .line 142
    .line 143
    sget-object v3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 144
    .line 145
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 146
    .line 147
    .line 148
    iget-boolean v3, v0, Lk20;->R0:Z

    .line 149
    .line 150
    if-nez v3, :cond_7

    .line 151
    .line 152
    iget-object v3, v0, Lk20;->H0:Landroid/graphics/ColorFilter;

    .line 153
    .line 154
    if-eqz v3, :cond_6

    .line 155
    .line 156
    goto :goto_2

    .line 157
    :cond_6
    iget-object v3, v0, Lk20;->I0:Landroid/graphics/PorterDuffColorFilter;

    .line 158
    .line 159
    :goto_2
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 160
    .line 161
    .line 162
    :cond_7
    iget v3, v7, Landroid/graphics/Rect;->left:I

    .line 163
    .line 164
    int-to-float v3, v3

    .line 165
    iget v4, v0, Lk20;->P:F

    .line 166
    .line 167
    div-float/2addr v4, v12

    .line 168
    add-float/2addr v3, v4

    .line 169
    iget v5, v7, Landroid/graphics/Rect;->top:I

    .line 170
    .line 171
    int-to-float v5, v5

    .line 172
    add-float/2addr v5, v4

    .line 173
    iget v13, v7, Landroid/graphics/Rect;->right:I

    .line 174
    .line 175
    int-to-float v13, v13

    .line 176
    sub-float/2addr v13, v4

    .line 177
    iget v14, v7, Landroid/graphics/Rect;->bottom:I

    .line 178
    .line 179
    int-to-float v14, v14

    .line 180
    sub-float/2addr v14, v4

    .line 181
    invoke-virtual {v11, v3, v5, v13, v14}, Landroid/graphics/RectF;->set(FFFF)V

    .line 182
    .line 183
    .line 184
    iget v3, v0, Lk20;->N:F

    .line 185
    .line 186
    iget v4, v0, Lk20;->P:F

    .line 187
    .line 188
    div-float/2addr v4, v12

    .line 189
    sub-float/2addr v3, v4

    .line 190
    invoke-virtual {v1, v11, v3, v3, v2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 191
    .line 192
    .line 193
    :cond_8
    iget v3, v0, Lk20;->C0:I

    .line 194
    .line 195
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 196
    .line 197
    .line 198
    sget-object v3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 199
    .line 200
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v11, v7}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    .line 204
    .line 205
    .line 206
    iget-boolean v3, v0, Lk20;->R0:Z

    .line 207
    .line 208
    if-nez v3, :cond_9

    .line 209
    .line 210
    invoke-virtual {v0}, Lk20;->z()F

    .line 211
    .line 212
    .line 213
    move-result v3

    .line 214
    invoke-virtual {v0}, Lk20;->z()F

    .line 215
    .line 216
    .line 217
    move-result v4

    .line 218
    invoke-virtual {v1, v11, v3, v4, v2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 219
    .line 220
    .line 221
    :goto_3
    move-object v13, v0

    .line 222
    goto :goto_4

    .line 223
    :cond_9
    new-instance v3, Landroid/graphics/RectF;

    .line 224
    .line 225
    invoke-direct {v3, v7}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    .line 226
    .line 227
    .line 228
    iget-object v4, v0, Lfi2;->n:Lei2;

    .line 229
    .line 230
    iget-object v14, v4, Lei2;->a:Lbc4;

    .line 231
    .line 232
    iget v15, v4, Lei2;->i:F

    .line 233
    .line 234
    iget-object v4, v0, Lfi2;->D:Lpz1;

    .line 235
    .line 236
    iget-object v13, v0, Lfi2;->E:Lfo1;

    .line 237
    .line 238
    iget-object v5, v0, Lk20;->w0:Landroid/graphics/Path;

    .line 239
    .line 240
    move-object/from16 v16, v3

    .line 241
    .line 242
    move-object/from16 v17, v4

    .line 243
    .line 244
    move-object/from16 v18, v5

    .line 245
    .line 246
    invoke-virtual/range {v13 .. v18}, Lfo1;->d(Lbc4;FLandroid/graphics/RectF;Lpz1;Landroid/graphics/Path;)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v0}, Lfi2;->g()Landroid/graphics/RectF;

    .line 250
    .line 251
    .line 252
    move-result-object v5

    .line 253
    iget-object v3, v0, Lfi2;->n:Lei2;

    .line 254
    .line 255
    iget-object v4, v3, Lei2;->a:Lbc4;

    .line 256
    .line 257
    move-object/from16 v3, v18

    .line 258
    .line 259
    invoke-virtual/range {v0 .. v5}, Lfi2;->e(Landroid/graphics/Canvas;Landroid/graphics/Paint;Landroid/graphics/Path;Lbc4;Landroid/graphics/RectF;)V

    .line 260
    .line 261
    .line 262
    goto :goto_3

    .line 263
    :goto_4
    invoke-virtual {v13}, Lk20;->Z()Z

    .line 264
    .line 265
    .line 266
    move-result v0

    .line 267
    if-eqz v0, :cond_a

    .line 268
    .line 269
    invoke-virtual {v13, v7, v11}, Lk20;->w(Landroid/graphics/Rect;Landroid/graphics/RectF;)V

    .line 270
    .line 271
    .line 272
    iget v0, v11, Landroid/graphics/RectF;->left:F

    .line 273
    .line 274
    iget v2, v11, Landroid/graphics/RectF;->top:F

    .line 275
    .line 276
    invoke-virtual {v1, v0, v2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 277
    .line 278
    .line 279
    iget-object v3, v13, Lk20;->T:Landroid/graphics/drawable/Drawable;

    .line 280
    .line 281
    invoke-virtual {v11}, Landroid/graphics/RectF;->width()F

    .line 282
    .line 283
    .line 284
    move-result v4

    .line 285
    float-to-int v4, v4

    .line 286
    invoke-virtual {v11}, Landroid/graphics/RectF;->height()F

    .line 287
    .line 288
    .line 289
    move-result v5

    .line 290
    float-to-int v5, v5

    .line 291
    invoke-virtual {v3, v9, v9, v4, v5}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 292
    .line 293
    .line 294
    iget-object v3, v13, Lk20;->T:Landroid/graphics/drawable/Drawable;

    .line 295
    .line 296
    invoke-virtual {v3, v1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 297
    .line 298
    .line 299
    neg-float v0, v0

    .line 300
    neg-float v2, v2

    .line 301
    invoke-virtual {v1, v0, v2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 302
    .line 303
    .line 304
    :cond_a
    invoke-virtual {v13}, Lk20;->Y()Z

    .line 305
    .line 306
    .line 307
    move-result v0

    .line 308
    if-eqz v0, :cond_b

    .line 309
    .line 310
    invoke-virtual {v13, v7, v11}, Lk20;->w(Landroid/graphics/Rect;Landroid/graphics/RectF;)V

    .line 311
    .line 312
    .line 313
    iget v0, v11, Landroid/graphics/RectF;->left:F

    .line 314
    .line 315
    iget v2, v11, Landroid/graphics/RectF;->top:F

    .line 316
    .line 317
    invoke-virtual {v1, v0, v2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 318
    .line 319
    .line 320
    iget-object v3, v13, Lk20;->f0:Landroid/graphics/drawable/Drawable;

    .line 321
    .line 322
    invoke-virtual {v11}, Landroid/graphics/RectF;->width()F

    .line 323
    .line 324
    .line 325
    move-result v4

    .line 326
    float-to-int v4, v4

    .line 327
    invoke-virtual {v11}, Landroid/graphics/RectF;->height()F

    .line 328
    .line 329
    .line 330
    move-result v5

    .line 331
    float-to-int v5, v5

    .line 332
    invoke-virtual {v3, v9, v9, v4, v5}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 333
    .line 334
    .line 335
    iget-object v3, v13, Lk20;->f0:Landroid/graphics/drawable/Drawable;

    .line 336
    .line 337
    invoke-virtual {v3, v1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 338
    .line 339
    .line 340
    neg-float v0, v0

    .line 341
    neg-float v2, v2

    .line 342
    invoke-virtual {v1, v0, v2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 343
    .line 344
    .line 345
    :cond_b
    iget-boolean v0, v13, Lk20;->P0:Z

    .line 346
    .line 347
    if-eqz v0, :cond_14

    .line 348
    .line 349
    iget-object v0, v13, Lk20;->R:Ljava/lang/CharSequence;

    .line 350
    .line 351
    if-eqz v0, :cond_14

    .line 352
    .line 353
    iget-object v0, v13, Lk20;->v0:Landroid/graphics/PointF;

    .line 354
    .line 355
    invoke-virtual {v0, v6, v6}, Landroid/graphics/PointF;->set(FF)V

    .line 356
    .line 357
    .line 358
    sget-object v2, Landroid/graphics/Paint$Align;->LEFT:Landroid/graphics/Paint$Align;

    .line 359
    .line 360
    iget-object v3, v13, Lk20;->R:Ljava/lang/CharSequence;

    .line 361
    .line 362
    iget-object v4, v13, Lk20;->x0:Lxr4;

    .line 363
    .line 364
    if-eqz v3, :cond_d

    .line 365
    .line 366
    iget v3, v13, Lk20;->j0:F

    .line 367
    .line 368
    invoke-virtual {v13}, Lk20;->x()F

    .line 369
    .line 370
    .line 371
    move-result v5

    .line 372
    add-float/2addr v5, v3

    .line 373
    iget v3, v13, Lk20;->m0:F

    .line 374
    .line 375
    add-float/2addr v5, v3

    .line 376
    invoke-virtual {v13}, Landroid/graphics/drawable/Drawable;->getLayoutDirection()I

    .line 377
    .line 378
    .line 379
    move-result v3

    .line 380
    if-nez v3, :cond_c

    .line 381
    .line 382
    iget v3, v7, Landroid/graphics/Rect;->left:I

    .line 383
    .line 384
    int-to-float v3, v3

    .line 385
    add-float/2addr v3, v5

    .line 386
    iput v3, v0, Landroid/graphics/PointF;->x:F

    .line 387
    .line 388
    goto :goto_5

    .line 389
    :cond_c
    iget v2, v7, Landroid/graphics/Rect;->right:I

    .line 390
    .line 391
    int-to-float v2, v2

    .line 392
    sub-float/2addr v2, v5

    .line 393
    iput v2, v0, Landroid/graphics/PointF;->x:F

    .line 394
    .line 395
    sget-object v2, Landroid/graphics/Paint$Align;->RIGHT:Landroid/graphics/Paint$Align;

    .line 396
    .line 397
    :goto_5
    invoke-virtual {v7}, Landroid/graphics/Rect;->centerY()I

    .line 398
    .line 399
    .line 400
    move-result v3

    .line 401
    int-to-float v3, v3

    .line 402
    iget-object v5, v4, Lxr4;->a:Landroid/text/TextPaint;

    .line 403
    .line 404
    iget-object v6, v13, Lk20;->t0:Landroid/graphics/Paint$FontMetrics;

    .line 405
    .line 406
    invoke-virtual {v5, v6}, Landroid/graphics/Paint;->getFontMetrics(Landroid/graphics/Paint$FontMetrics;)F

    .line 407
    .line 408
    .line 409
    iget v5, v6, Landroid/graphics/Paint$FontMetrics;->descent:F

    .line 410
    .line 411
    iget v6, v6, Landroid/graphics/Paint$FontMetrics;->ascent:F

    .line 412
    .line 413
    add-float/2addr v5, v6

    .line 414
    div-float/2addr v5, v12

    .line 415
    sub-float/2addr v3, v5

    .line 416
    iput v3, v0, Landroid/graphics/PointF;->y:F

    .line 417
    .line 418
    :cond_d
    invoke-virtual {v11}, Landroid/graphics/RectF;->setEmpty()V

    .line 419
    .line 420
    .line 421
    iget-object v3, v13, Lk20;->R:Ljava/lang/CharSequence;

    .line 422
    .line 423
    if-eqz v3, :cond_f

    .line 424
    .line 425
    iget v3, v13, Lk20;->j0:F

    .line 426
    .line 427
    invoke-virtual {v13}, Lk20;->x()F

    .line 428
    .line 429
    .line 430
    move-result v5

    .line 431
    add-float/2addr v5, v3

    .line 432
    iget v3, v13, Lk20;->m0:F

    .line 433
    .line 434
    add-float/2addr v5, v3

    .line 435
    iget v3, v13, Lk20;->q0:F

    .line 436
    .line 437
    invoke-virtual {v13}, Lk20;->y()F

    .line 438
    .line 439
    .line 440
    move-result v6

    .line 441
    add-float/2addr v6, v3

    .line 442
    iget v3, v13, Lk20;->n0:F

    .line 443
    .line 444
    add-float/2addr v6, v3

    .line 445
    invoke-virtual {v13}, Landroid/graphics/drawable/Drawable;->getLayoutDirection()I

    .line 446
    .line 447
    .line 448
    move-result v3

    .line 449
    iget v14, v7, Landroid/graphics/Rect;->left:I

    .line 450
    .line 451
    if-nez v3, :cond_e

    .line 452
    .line 453
    int-to-float v3, v14

    .line 454
    add-float/2addr v3, v5

    .line 455
    iput v3, v11, Landroid/graphics/RectF;->left:F

    .line 456
    .line 457
    iget v3, v7, Landroid/graphics/Rect;->right:I

    .line 458
    .line 459
    int-to-float v3, v3

    .line 460
    sub-float/2addr v3, v6

    .line 461
    iput v3, v11, Landroid/graphics/RectF;->right:F

    .line 462
    .line 463
    goto :goto_6

    .line 464
    :cond_e
    int-to-float v3, v14

    .line 465
    add-float/2addr v3, v6

    .line 466
    iput v3, v11, Landroid/graphics/RectF;->left:F

    .line 467
    .line 468
    iget v3, v7, Landroid/graphics/Rect;->right:I

    .line 469
    .line 470
    int-to-float v3, v3

    .line 471
    sub-float/2addr v3, v5

    .line 472
    iput v3, v11, Landroid/graphics/RectF;->right:F

    .line 473
    .line 474
    :goto_6
    iget v3, v7, Landroid/graphics/Rect;->top:I

    .line 475
    .line 476
    int-to-float v3, v3

    .line 477
    iput v3, v11, Landroid/graphics/RectF;->top:F

    .line 478
    .line 479
    iget v3, v7, Landroid/graphics/Rect;->bottom:I

    .line 480
    .line 481
    int-to-float v3, v3

    .line 482
    iput v3, v11, Landroid/graphics/RectF;->bottom:F

    .line 483
    .line 484
    :cond_f
    iget-object v3, v4, Lxr4;->g:Lrr4;

    .line 485
    .line 486
    iget-object v6, v4, Lxr4;->a:Landroid/text/TextPaint;

    .line 487
    .line 488
    if-eqz v3, :cond_10

    .line 489
    .line 490
    invoke-virtual {v13}, Landroid/graphics/drawable/Drawable;->getState()[I

    .line 491
    .line 492
    .line 493
    move-result-object v3

    .line 494
    iput-object v3, v6, Landroid/text/TextPaint;->drawableState:[I

    .line 495
    .line 496
    iget-object v3, v4, Lxr4;->g:Lrr4;

    .line 497
    .line 498
    iget-object v5, v4, Lxr4;->b:Lh20;

    .line 499
    .line 500
    iget-object v14, v13, Lk20;->r0:Landroid/content/Context;

    .line 501
    .line 502
    invoke-virtual {v3, v14, v6, v5}, Lrr4;->e(Landroid/content/Context;Landroid/text/TextPaint;Lh12;)V

    .line 503
    .line 504
    .line 505
    :cond_10
    invoke-virtual {v6, v2}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 506
    .line 507
    .line 508
    iget-object v2, v13, Lk20;->R:Ljava/lang/CharSequence;

    .line 509
    .line 510
    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 511
    .line 512
    .line 513
    move-result-object v2

    .line 514
    invoke-virtual {v4, v2}, Lxr4;->a(Ljava/lang/String;)F

    .line 515
    .line 516
    .line 517
    move-result v2

    .line 518
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 519
    .line 520
    .line 521
    move-result v2

    .line 522
    invoke-virtual {v11}, Landroid/graphics/RectF;->width()F

    .line 523
    .line 524
    .line 525
    move-result v3

    .line 526
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 527
    .line 528
    .line 529
    move-result v3

    .line 530
    if-le v2, v3, :cond_11

    .line 531
    .line 532
    const/4 v2, 0x1

    .line 533
    move v14, v2

    .line 534
    goto :goto_7

    .line 535
    :cond_11
    move v14, v9

    .line 536
    :goto_7
    if-eqz v14, :cond_12

    .line 537
    .line 538
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 539
    .line 540
    .line 541
    move-result v2

    .line 542
    invoke-virtual {v1, v11}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/RectF;)Z

    .line 543
    .line 544
    .line 545
    move v15, v2

    .line 546
    goto :goto_8

    .line 547
    :cond_12
    move v15, v9

    .line 548
    :goto_8
    iget-object v2, v13, Lk20;->R:Ljava/lang/CharSequence;

    .line 549
    .line 550
    if-eqz v14, :cond_13

    .line 551
    .line 552
    iget-object v3, v13, Lk20;->O0:Landroid/text/TextUtils$TruncateAt;

    .line 553
    .line 554
    if-eqz v3, :cond_13

    .line 555
    .line 556
    invoke-virtual {v11}, Landroid/graphics/RectF;->width()F

    .line 557
    .line 558
    .line 559
    move-result v3

    .line 560
    iget-object v4, v13, Lk20;->O0:Landroid/text/TextUtils$TruncateAt;

    .line 561
    .line 562
    invoke-static {v2, v6, v3, v4}, Landroid/text/TextUtils;->ellipsize(Ljava/lang/CharSequence;Landroid/text/TextPaint;FLandroid/text/TextUtils$TruncateAt;)Ljava/lang/CharSequence;

    .line 563
    .line 564
    .line 565
    move-result-object v2

    .line 566
    :cond_13
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 567
    .line 568
    .line 569
    move-result v3

    .line 570
    iget v4, v0, Landroid/graphics/PointF;->x:F

    .line 571
    .line 572
    iget v5, v0, Landroid/graphics/PointF;->y:F

    .line 573
    .line 574
    move-object v1, v2

    .line 575
    const/4 v2, 0x0

    .line 576
    move-object/from16 v0, p1

    .line 577
    .line 578
    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Canvas;->drawText(Ljava/lang/CharSequence;IIFFLandroid/graphics/Paint;)V

    .line 579
    .line 580
    .line 581
    move-object v1, v0

    .line 582
    if-eqz v14, :cond_14

    .line 583
    .line 584
    invoke-virtual {v1, v15}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 585
    .line 586
    .line 587
    :cond_14
    invoke-virtual {v13}, Lk20;->a0()Z

    .line 588
    .line 589
    .line 590
    move-result v0

    .line 591
    if-eqz v0, :cond_17

    .line 592
    .line 593
    invoke-virtual {v11}, Landroid/graphics/RectF;->setEmpty()V

    .line 594
    .line 595
    .line 596
    invoke-virtual {v13}, Lk20;->a0()Z

    .line 597
    .line 598
    .line 599
    move-result v0

    .line 600
    if-eqz v0, :cond_16

    .line 601
    .line 602
    iget v0, v13, Lk20;->q0:F

    .line 603
    .line 604
    iget v2, v13, Lk20;->p0:F

    .line 605
    .line 606
    add-float/2addr v0, v2

    .line 607
    invoke-virtual {v13}, Landroid/graphics/drawable/Drawable;->getLayoutDirection()I

    .line 608
    .line 609
    .line 610
    move-result v2

    .line 611
    if-nez v2, :cond_15

    .line 612
    .line 613
    iget v2, v7, Landroid/graphics/Rect;->right:I

    .line 614
    .line 615
    int-to-float v2, v2

    .line 616
    sub-float/2addr v2, v0

    .line 617
    iput v2, v11, Landroid/graphics/RectF;->right:F

    .line 618
    .line 619
    iget v0, v13, Lk20;->b0:F

    .line 620
    .line 621
    sub-float/2addr v2, v0

    .line 622
    iput v2, v11, Landroid/graphics/RectF;->left:F

    .line 623
    .line 624
    goto :goto_9

    .line 625
    :cond_15
    iget v2, v7, Landroid/graphics/Rect;->left:I

    .line 626
    .line 627
    int-to-float v2, v2

    .line 628
    add-float/2addr v2, v0

    .line 629
    iput v2, v11, Landroid/graphics/RectF;->left:F

    .line 630
    .line 631
    iget v0, v13, Lk20;->b0:F

    .line 632
    .line 633
    add-float/2addr v2, v0

    .line 634
    iput v2, v11, Landroid/graphics/RectF;->right:F

    .line 635
    .line 636
    :goto_9
    invoke-virtual {v7}, Landroid/graphics/Rect;->exactCenterY()F

    .line 637
    .line 638
    .line 639
    move-result v0

    .line 640
    iget v2, v13, Lk20;->b0:F

    .line 641
    .line 642
    div-float v3, v2, v12

    .line 643
    .line 644
    sub-float/2addr v0, v3

    .line 645
    iput v0, v11, Landroid/graphics/RectF;->top:F

    .line 646
    .line 647
    add-float/2addr v0, v2

    .line 648
    iput v0, v11, Landroid/graphics/RectF;->bottom:F

    .line 649
    .line 650
    :cond_16
    iget v0, v11, Landroid/graphics/RectF;->left:F

    .line 651
    .line 652
    iget v2, v11, Landroid/graphics/RectF;->top:F

    .line 653
    .line 654
    invoke-virtual {v1, v0, v2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 655
    .line 656
    .line 657
    iget-object v3, v13, Lk20;->Y:Landroid/graphics/drawable/Drawable;

    .line 658
    .line 659
    invoke-virtual {v11}, Landroid/graphics/RectF;->width()F

    .line 660
    .line 661
    .line 662
    move-result v4

    .line 663
    float-to-int v4, v4

    .line 664
    invoke-virtual {v11}, Landroid/graphics/RectF;->height()F

    .line 665
    .line 666
    .line 667
    move-result v5

    .line 668
    float-to-int v5, v5

    .line 669
    invoke-virtual {v3, v9, v9, v4, v5}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 670
    .line 671
    .line 672
    sget-object v3, Ll24;->a:[I

    .line 673
    .line 674
    iget-object v3, v13, Lk20;->Z:Landroid/graphics/drawable/RippleDrawable;

    .line 675
    .line 676
    iget-object v4, v13, Lk20;->Y:Landroid/graphics/drawable/Drawable;

    .line 677
    .line 678
    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 679
    .line 680
    .line 681
    move-result-object v4

    .line 682
    invoke-virtual {v3, v4}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 683
    .line 684
    .line 685
    iget-object v3, v13, Lk20;->Z:Landroid/graphics/drawable/RippleDrawable;

    .line 686
    .line 687
    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->jumpToCurrentState()V

    .line 688
    .line 689
    .line 690
    iget-object v3, v13, Lk20;->Z:Landroid/graphics/drawable/RippleDrawable;

    .line 691
    .line 692
    invoke-virtual {v3, v1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 693
    .line 694
    .line 695
    neg-float v0, v0

    .line 696
    neg-float v2, v2

    .line 697
    invoke-virtual {v1, v0, v2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 698
    .line 699
    .line 700
    :cond_17
    iget v0, v13, Lk20;->G0:I

    .line 701
    .line 702
    if-ge v0, v8, :cond_18

    .line 703
    .line 704
    invoke-virtual {v1, v10}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 705
    .line 706
    .line 707
    :cond_18
    :goto_a
    return-void
.end method

.method public final getAlpha()I
    .locals 0

    .line 1
    iget p0, p0, Lk20;->G0:I

    .line 2
    .line 3
    return p0
.end method

.method public final getColorFilter()Landroid/graphics/ColorFilter;
    .locals 0

    .line 1
    iget-object p0, p0, Lk20;->H0:Landroid/graphics/ColorFilter;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getIntrinsicHeight()I
    .locals 0

    .line 1
    iget p0, p0, Lk20;->M:F

    .line 2
    .line 3
    float-to-int p0, p0

    .line 4
    return p0
.end method

.method public final getIntrinsicWidth()I
    .locals 3

    .line 1
    iget v0, p0, Lk20;->j0:F

    .line 2
    .line 3
    invoke-virtual {p0}, Lk20;->x()F

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    add-float/2addr v1, v0

    .line 8
    iget v0, p0, Lk20;->m0:F

    .line 9
    .line 10
    add-float/2addr v1, v0

    .line 11
    iget-object v0, p0, Lk20;->R:Ljava/lang/CharSequence;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v2, p0, Lk20;->x0:Lxr4;

    .line 18
    .line 19
    invoke-virtual {v2, v0}, Lxr4;->a(Ljava/lang/String;)F

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    add-float/2addr v0, v1

    .line 24
    iget v1, p0, Lk20;->n0:F

    .line 25
    .line 26
    add-float/2addr v0, v1

    .line 27
    invoke-virtual {p0}, Lk20;->y()F

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    add-float/2addr v1, v0

    .line 32
    iget v0, p0, Lk20;->q0:F

    .line 33
    .line 34
    add-float/2addr v1, v0

    .line 35
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    iget p0, p0, Lk20;->Q0:I

    .line 40
    .line 41
    invoke-static {v0, p0}, Ljava/lang/Math;->min(II)I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    return p0
.end method

.method public final getOpacity()I
    .locals 0

    .line 1
    const/4 p0, -0x3

    .line 2
    return p0
.end method

.method public final getOutline(Landroid/graphics/Outline;)V
    .locals 8

    .line 1
    iget-boolean v0, p0, Lk20;->R0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1}, Lfi2;->getOutline(Landroid/graphics/Outline;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Landroid/graphics/Rect;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    iget v1, p0, Lk20;->N:F

    .line 20
    .line 21
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Outline;->setRoundRect(Landroid/graphics/Rect;F)V

    .line 22
    .line 23
    .line 24
    move-object v2, p1

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    invoke-virtual {p0}, Lk20;->getIntrinsicWidth()I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    iget v0, p0, Lk20;->M:F

    .line 31
    .line 32
    float-to-int v6, v0

    .line 33
    iget v7, p0, Lk20;->N:F

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    const/4 v4, 0x0

    .line 37
    move-object v2, p1

    .line 38
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    .line 39
    .line 40
    .line 41
    :goto_0
    iget p0, p0, Lk20;->G0:I

    .line 42
    .line 43
    int-to-float p0, p0

    .line 44
    const/high16 p1, 0x437f0000    # 255.0f

    .line 45
    .line 46
    div-float/2addr p0, p1

    .line 47
    invoke-virtual {v2, p0}, Landroid/graphics/Outline;->setAlpha(F)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public final invalidateDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-interface {p1, p0}, Landroid/graphics/drawable/Drawable$Callback;->invalidateDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final isStateful()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lk20;->K:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    invoke-static {v0}, Lk20;->A(Landroid/content/res/ColorStateList;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_3

    .line 8
    .line 9
    iget-object v0, p0, Lk20;->L:Landroid/content/res/ColorStateList;

    .line 10
    .line 11
    invoke-static {v0}, Lk20;->A(Landroid/content/res/ColorStateList;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_3

    .line 16
    .line 17
    iget-object v0, p0, Lk20;->O:Landroid/content/res/ColorStateList;

    .line 18
    .line 19
    invoke-static {v0}, Lk20;->A(Landroid/content/res/ColorStateList;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_3

    .line 24
    .line 25
    iget-object v0, p0, Lk20;->x0:Lxr4;

    .line 26
    .line 27
    iget-object v0, v0, Lxr4;->g:Lrr4;

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    iget-object v0, v0, Lrr4;->j:Landroid/content/res/ColorStateList;

    .line 32
    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    iget-boolean v0, p0, Lk20;->e0:Z

    .line 43
    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    iget-object v0, p0, Lk20;->f0:Landroid/graphics/drawable/Drawable;

    .line 47
    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    iget-boolean v0, p0, Lk20;->d0:Z

    .line 51
    .line 52
    if-eqz v0, :cond_1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    iget-object v0, p0, Lk20;->T:Landroid/graphics/drawable/Drawable;

    .line 56
    .line 57
    invoke-static {v0}, Lk20;->B(Landroid/graphics/drawable/Drawable;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_3

    .line 62
    .line 63
    iget-object v0, p0, Lk20;->f0:Landroid/graphics/drawable/Drawable;

    .line 64
    .line 65
    invoke-static {v0}, Lk20;->B(Landroid/graphics/drawable/Drawable;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-nez v0, :cond_3

    .line 70
    .line 71
    iget-object p0, p0, Lk20;->J0:Landroid/content/res/ColorStateList;

    .line 72
    .line 73
    invoke-static {p0}, Lk20;->A(Landroid/content/res/ColorStateList;)Z

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    if-eqz p0, :cond_2

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_2
    const/4 p0, 0x0

    .line 81
    return p0

    .line 82
    :cond_3
    :goto_0
    const/4 p0, 0x1

    .line 83
    return p0
.end method

.method public final onLayoutDirectionChanged(I)Z
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onLayoutDirectionChanged(I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Lk20;->Z()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lk20;->T:Landroid/graphics/drawable/Drawable;

    .line 12
    .line 13
    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->setLayoutDirection(I)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    or-int/2addr v0, v1

    .line 18
    :cond_0
    invoke-virtual {p0}, Lk20;->Y()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    iget-object v1, p0, Lk20;->f0:Landroid/graphics/drawable/Drawable;

    .line 25
    .line 26
    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->setLayoutDirection(I)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    or-int/2addr v0, v1

    .line 31
    :cond_1
    invoke-virtual {p0}, Lk20;->a0()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    iget-object v1, p0, Lk20;->Y:Landroid/graphics/drawable/Drawable;

    .line 38
    .line 39
    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->setLayoutDirection(I)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    or-int/2addr v0, p1

    .line 44
    :cond_2
    if-eqz v0, :cond_3

    .line 45
    .line 46
    invoke-virtual {p0}, Lfi2;->invalidateSelf()V

    .line 47
    .line 48
    .line 49
    :cond_3
    const/4 p0, 0x1

    .line 50
    return p0
.end method

.method public final onLevelChange(I)Z
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onLevelChange(I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Lk20;->Z()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lk20;->T:Landroid/graphics/drawable/Drawable;

    .line 12
    .line 13
    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    or-int/2addr v0, v1

    .line 18
    :cond_0
    invoke-virtual {p0}, Lk20;->Y()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    iget-object v1, p0, Lk20;->f0:Landroid/graphics/drawable/Drawable;

    .line 25
    .line 26
    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    or-int/2addr v0, v1

    .line 31
    :cond_1
    invoke-virtual {p0}, Lk20;->a0()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    iget-object v1, p0, Lk20;->Y:Landroid/graphics/drawable/Drawable;

    .line 38
    .line 39
    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    or-int/2addr v0, p1

    .line 44
    :cond_2
    if-eqz v0, :cond_3

    .line 45
    .line 46
    invoke-virtual {p0}, Lfi2;->invalidateSelf()V

    .line 47
    .line 48
    .line 49
    :cond_3
    return v0
.end method

.method public final onStateChange([I)Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lk20;->R0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1}, Lfi2;->onStateChange([I)Z

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lk20;->L0:[I

    .line 9
    .line 10
    invoke-virtual {p0, p1, v0}, Lk20;->D([I[I)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0
.end method

.method public final scheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-interface {p1, p0, p2, p3, p4}, Landroid/graphics/drawable/Drawable$Callback;->scheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final setAlpha(I)V
    .locals 1

    .line 1
    iget v0, p0, Lk20;->G0:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lk20;->G0:I

    .line 6
    .line 7
    invoke-virtual {p0}, Lfi2;->invalidateSelf()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lk20;->H0:Landroid/graphics/ColorFilter;

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Lk20;->H0:Landroid/graphics/ColorFilter;

    .line 6
    .line 7
    invoke-virtual {p0}, Lfi2;->invalidateSelf()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final setTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lk20;->J0:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Lk20;->J0:Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p0, p1}, Lk20;->onStateChange([I)Z

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final setTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lk20;->K0:Landroid/graphics/PorterDuff$Mode;

    .line 2
    .line 3
    if-eq v0, p1, :cond_2

    .line 4
    .line 5
    iput-object p1, p0, Lk20;->K0:Landroid/graphics/PorterDuff$Mode;

    .line 6
    .line 7
    iget-object v0, p0, Lk20;->J0:Landroid/content/res/ColorStateList;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {v0, v1, v2}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    new-instance v1, Landroid/graphics/PorterDuffColorFilter;

    .line 24
    .line 25
    invoke-direct {v1, v0, p1}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    .line 26
    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    :goto_0
    const/4 v1, 0x0

    .line 30
    :goto_1
    iput-object v1, p0, Lk20;->I0:Landroid/graphics/PorterDuffColorFilter;

    .line 31
    .line 32
    invoke-virtual {p0}, Lfi2;->invalidateSelf()V

    .line 33
    .line 34
    .line 35
    :cond_2
    return-void
.end method

.method public final setVisible(ZZ)Z
    .locals 2

    .line 1
    invoke-super {p0, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Lk20;->Z()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lk20;->T:Landroid/graphics/drawable/Drawable;

    .line 12
    .line 13
    invoke-virtual {v1, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    or-int/2addr v0, v1

    .line 18
    :cond_0
    invoke-virtual {p0}, Lk20;->Y()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    iget-object v1, p0, Lk20;->f0:Landroid/graphics/drawable/Drawable;

    .line 25
    .line 26
    invoke-virtual {v1, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    or-int/2addr v0, v1

    .line 31
    :cond_1
    invoke-virtual {p0}, Lk20;->a0()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    iget-object v1, p0, Lk20;->Y:Landroid/graphics/drawable/Drawable;

    .line 38
    .line 39
    invoke-virtual {v1, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    or-int/2addr v0, p1

    .line 44
    :cond_2
    if-eqz v0, :cond_3

    .line 45
    .line 46
    invoke-virtual {p0}, Lfi2;->invalidateSelf()V

    .line 47
    .line 48
    .line 49
    :cond_3
    return v0
.end method

.method public final unscheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-interface {p1, p0, p2}, Landroid/graphics/drawable/Drawable$Callback;->unscheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final v(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getLayoutDirection()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setLayoutDirection(I)Z

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getLevel()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-virtual {p1, v0, v1}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lk20;->Y:Landroid/graphics/drawable/Drawable;

    .line 30
    .line 31
    if-ne p1, v0, :cond_2

    .line 32
    .line 33
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    iget-object v0, p0, Lk20;->L0:[I

    .line 40
    .line 41
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 42
    .line 43
    .line 44
    :cond_1
    iget-object p0, p0, Lk20;->a0:Landroid/content/res/ColorStateList;

    .line 45
    .line 46
    invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_2
    iget-object v0, p0, Lk20;->T:Landroid/graphics/drawable/Drawable;

    .line 51
    .line 52
    if-ne p1, v0, :cond_3

    .line 53
    .line 54
    iget-boolean v1, p0, Lk20;->W:Z

    .line 55
    .line 56
    if-eqz v1, :cond_3

    .line 57
    .line 58
    iget-object v1, p0, Lk20;->U:Landroid/content/res/ColorStateList;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    .line 61
    .line 62
    .line 63
    :cond_3
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eqz v0, :cond_4

    .line 68
    .line 69
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 74
    .line 75
    .line 76
    :cond_4
    :goto_0
    return-void
.end method

.method public final w(Landroid/graphics/Rect;Landroid/graphics/RectF;)V
    .locals 5

    .line 1
    invoke-virtual {p2}, Landroid/graphics/RectF;->setEmpty()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lk20;->Z()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0}, Lk20;->Y()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    return-void

    .line 18
    :cond_1
    :goto_0
    iget v0, p0, Lk20;->j0:F

    .line 19
    .line 20
    iget v1, p0, Lk20;->k0:F

    .line 21
    .line 22
    add-float/2addr v0, v1

    .line 23
    iget-boolean v1, p0, Lk20;->E0:Z

    .line 24
    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    iget-object v1, p0, Lk20;->f0:Landroid/graphics/drawable/Drawable;

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_2
    iget-object v1, p0, Lk20;->T:Landroid/graphics/drawable/Drawable;

    .line 31
    .line 32
    :goto_1
    iget v2, p0, Lk20;->V:F

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    cmpg-float v4, v2, v3

    .line 36
    .line 37
    if-gtz v4, :cond_3

    .line 38
    .line 39
    if-eqz v1, :cond_3

    .line 40
    .line 41
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    int-to-float v2, v1

    .line 46
    :cond_3
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getLayoutDirection()I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-nez v1, :cond_4

    .line 51
    .line 52
    iget v1, p1, Landroid/graphics/Rect;->left:I

    .line 53
    .line 54
    int-to-float v1, v1

    .line 55
    add-float/2addr v1, v0

    .line 56
    iput v1, p2, Landroid/graphics/RectF;->left:F

    .line 57
    .line 58
    add-float/2addr v1, v2

    .line 59
    iput v1, p2, Landroid/graphics/RectF;->right:F

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_4
    iget v1, p1, Landroid/graphics/Rect;->right:I

    .line 63
    .line 64
    int-to-float v1, v1

    .line 65
    sub-float/2addr v1, v0

    .line 66
    iput v1, p2, Landroid/graphics/RectF;->right:F

    .line 67
    .line 68
    sub-float/2addr v1, v2

    .line 69
    iput v1, p2, Landroid/graphics/RectF;->left:F

    .line 70
    .line 71
    :goto_2
    iget-boolean v0, p0, Lk20;->E0:Z

    .line 72
    .line 73
    if-eqz v0, :cond_5

    .line 74
    .line 75
    iget-object v0, p0, Lk20;->f0:Landroid/graphics/drawable/Drawable;

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_5
    iget-object v0, p0, Lk20;->T:Landroid/graphics/drawable/Drawable;

    .line 79
    .line 80
    :goto_3
    iget v1, p0, Lk20;->V:F

    .line 81
    .line 82
    cmpg-float v2, v1, v3

    .line 83
    .line 84
    if-gtz v2, :cond_6

    .line 85
    .line 86
    if-eqz v0, :cond_6

    .line 87
    .line 88
    iget-object p0, p0, Lk20;->r0:Landroid/content/Context;

    .line 89
    .line 90
    const/16 v1, 0x18

    .line 91
    .line 92
    invoke-static {p0, v1}, Lvr1;->l(Landroid/content/Context;I)F

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    float-to-double v1, p0

    .line 97
    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    .line 98
    .line 99
    .line 100
    move-result-wide v1

    .line 101
    double-to-float v1, v1

    .line 102
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 103
    .line 104
    .line 105
    move-result p0

    .line 106
    int-to-float p0, p0

    .line 107
    cmpg-float p0, p0, v1

    .line 108
    .line 109
    if-gtz p0, :cond_6

    .line 110
    .line 111
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 112
    .line 113
    .line 114
    move-result p0

    .line 115
    int-to-float v1, p0

    .line 116
    :cond_6
    invoke-virtual {p1}, Landroid/graphics/Rect;->exactCenterY()F

    .line 117
    .line 118
    .line 119
    move-result p0

    .line 120
    const/high16 p1, 0x40000000    # 2.0f

    .line 121
    .line 122
    div-float p1, v1, p1

    .line 123
    .line 124
    sub-float/2addr p0, p1

    .line 125
    iput p0, p2, Landroid/graphics/RectF;->top:F

    .line 126
    .line 127
    add-float/2addr p0, v1

    .line 128
    iput p0, p2, Landroid/graphics/RectF;->bottom:F

    .line 129
    .line 130
    return-void
.end method

.method public final x()F
    .locals 4

    .line 1
    invoke-virtual {p0}, Lk20;->Z()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0}, Lk20;->Y()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return v1

    .line 16
    :cond_1
    :goto_0
    iget v0, p0, Lk20;->k0:F

    .line 17
    .line 18
    iget-boolean v2, p0, Lk20;->E0:Z

    .line 19
    .line 20
    if-eqz v2, :cond_2

    .line 21
    .line 22
    iget-object v2, p0, Lk20;->f0:Landroid/graphics/drawable/Drawable;

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_2
    iget-object v2, p0, Lk20;->T:Landroid/graphics/drawable/Drawable;

    .line 26
    .line 27
    :goto_1
    iget v3, p0, Lk20;->V:F

    .line 28
    .line 29
    cmpg-float v1, v3, v1

    .line 30
    .line 31
    if-gtz v1, :cond_3

    .line 32
    .line 33
    if-eqz v2, :cond_3

    .line 34
    .line 35
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    int-to-float v3, v1

    .line 40
    :cond_3
    add-float/2addr v3, v0

    .line 41
    iget p0, p0, Lk20;->l0:F

    .line 42
    .line 43
    add-float/2addr v3, p0

    .line 44
    return v3
.end method

.method public final y()F
    .locals 2

    .line 1
    invoke-virtual {p0}, Lk20;->a0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget v0, p0, Lk20;->o0:F

    .line 8
    .line 9
    iget v1, p0, Lk20;->b0:F

    .line 10
    .line 11
    add-float/2addr v0, v1

    .line 12
    iget p0, p0, Lk20;->p0:F

    .line 13
    .line 14
    add-float/2addr v0, p0

    .line 15
    return v0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return p0
.end method

.method public final z()F
    .locals 1

    .line 1
    iget-boolean v0, p0, Lk20;->R0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lfi2;->h()F

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0

    .line 10
    :cond_0
    iget p0, p0, Lk20;->N:F

    .line 11
    .line 12
    return p0
.end method
