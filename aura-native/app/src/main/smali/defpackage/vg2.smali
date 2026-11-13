.class public final Ldefpackage/vg2;
.super Ldefpackage/e9;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final c:Ldefpackage/fi2;

.field public final d:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 13

    .line 1
    const p2, 0x7f04032f

    .line 2
    .line 3
    .line 4
    invoke-static {p1, p2}, Ldefpackage/zz1;->D(Landroid/content/Context;I)Landroid/util/TypedValue;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/4 v1, 0x0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    move v0, v1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget v0, v0, Landroid/util/TypedValue;->data:I

    .line 14
    .line 15
    :goto_0
    const/4 v2, 0x0

    .line 16
    const v3, 0x7f040032

    .line 17
    .line 18
    .line 19
    const v4, 0x7f14016e

    .line 20
    .line 21
    .line 22
    invoke-static {p1, v2, v3, v4}, Ldefpackage/su3;->H(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroid/content/Context;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    new-instance v6, Ldefpackage/ud0;

    .line 30
    .line 31
    invoke-direct {v6, v5, v0}, Ldefpackage/ud0;-><init>(Landroid/content/Context;I)V

    .line 32
    .line 33
    .line 34
    move-object v5, v6

    .line 35
    :goto_1
    invoke-static {p1, p2}, Ldefpackage/zz1;->D(Landroid/content/Context;I)Landroid/util/TypedValue;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    if-nez p1, :cond_2

    .line 40
    .line 41
    move p1, v1

    .line 42
    goto :goto_2

    .line 43
    :cond_2
    iget p1, p1, Landroid/util/TypedValue;->data:I

    .line 44
    .line 45
    :goto_2
    invoke-direct {p0, v5, p1}, Ldefpackage/e9;-><init>(Landroid/content/Context;I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Ldefpackage/e9;->getContext()Landroid/content/Context;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    invoke-virtual {v6}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    new-array v11, v1, [I

    .line 57
    .line 58
    const/4 v7, 0x0

    .line 59
    const v9, 0x7f040032

    .line 60
    .line 61
    .line 62
    const v10, 0x7f14016e

    .line 63
    .line 64
    .line 65
    invoke-static {v6, v7, v9, v10}, Ldefpackage/uc5;->c(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 66
    .line 67
    .line 68
    sget-object v8, Ldefpackage/ht3;->t:[I

    .line 69
    .line 70
    invoke-static/range {v6 .. v11}, Ldefpackage/uc5;->g(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v6, v7, v8, v9, v10}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    const v5, 0x7f07051b

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    const/4 v5, 0x2

    .line 89
    invoke-virtual {p2, v5, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    const v7, 0x7f07051c

    .line 98
    .line 99
    .line 100
    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 101
    .line 102
    .line 103
    move-result v5

    .line 104
    const/4 v7, 0x3

    .line 105
    invoke-virtual {p2, v7, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 106
    .line 107
    .line 108
    move-result v5

    .line 109
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 110
    .line 111
    .line 112
    move-result-object v7

    .line 113
    const v9, 0x7f07051a

    .line 114
    .line 115
    .line 116
    invoke-virtual {v7, v9}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 117
    .line 118
    .line 119
    move-result v7

    .line 120
    const/4 v9, 0x1

    .line 121
    invoke-virtual {p2, v9, v7}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 122
    .line 123
    .line 124
    move-result v7

    .line 125
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 126
    .line 127
    .line 128
    move-result-object v10

    .line 129
    const v11, 0x7f070519

    .line 130
    .line 131
    .line 132
    invoke-virtual {v10, v11}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 133
    .line 134
    .line 135
    move-result v10

    .line 136
    invoke-virtual {p2, v1, v10}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 137
    .line 138
    .line 139
    move-result v1

    .line 140
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 144
    .line 145
    .line 146
    move-result-object p2

    .line 147
    invoke-virtual {p2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 148
    .line 149
    .line 150
    move-result-object p2

    .line 151
    invoke-virtual {p2}, Landroid/content/res/Configuration;->getLayoutDirection()I

    .line 152
    .line 153
    .line 154
    move-result p2

    .line 155
    if-ne p2, v9, :cond_3

    .line 156
    .line 157
    move v12, v7

    .line 158
    move v7, v0

    .line 159
    move v0, v12

    .line 160
    :cond_3
    new-instance p2, Landroid/graphics/Rect;

    .line 161
    .line 162
    invoke-direct {p2, v0, v5, v7, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 163
    .line 164
    .line 165
    iput-object p2, p0, Ldefpackage/vg2;->d:Landroid/graphics/Rect;

    .line 166
    .line 167
    const-class p2, Ldefpackage/vg2;

    .line 168
    .line 169
    invoke-virtual {p2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p2

    .line 173
    const v0, 0x7f04013b

    .line 174
    .line 175
    .line 176
    invoke-static {v0, v6, p2}, Ldefpackage/g12;->r(ILandroid/content/Context;Ljava/lang/String;)I

    .line 177
    .line 178
    .line 179
    move-result p2

    .line 180
    invoke-virtual {v6, v2, v8, v3, v4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    const/4 v1, 0x4

    .line 185
    invoke-virtual {v0, v1, p2}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 186
    .line 187
    .line 188
    move-result p2

    .line 189
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 190
    .line 191
    .line 192
    new-instance v0, Ldefpackage/fi2;

    .line 193
    .line 194
    invoke-direct {v0, v6, v2, v3, v4}, Ldefpackage/fi2;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v0, v6}, Ldefpackage/fi2;->j(Landroid/content/Context;)V

    .line 198
    .line 199
    .line 200
    invoke-static {p2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 201
    .line 202
    .line 203
    move-result-object p2

    .line 204
    invoke-virtual {v0, p2}, Ldefpackage/fi2;->m(Landroid/content/res/ColorStateList;)V

    .line 205
    .line 206
    .line 207
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 208
    .line 209
    const/16 v1, 0x1c

    .line 210
    .line 211
    if-lt p2, v1, :cond_4

    .line 212
    .line 213
    new-instance p2, Landroid/util/TypedValue;

    .line 214
    .line 215
    invoke-direct {p2}, Landroid/util/TypedValue;-><init>()V

    .line 216
    .line 217
    .line 218
    const v1, 0x1010571

    .line 219
    .line 220
    .line 221
    invoke-virtual {p1, v1, p2, v9}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 222
    .line 223
    .line 224
    invoke-virtual {p0}, Ldefpackage/e9;->getContext()Landroid/content/Context;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    invoke-virtual {p2, p1}, Landroid/util/TypedValue;->getDimension(Landroid/util/DisplayMetrics;)F

    .line 237
    .line 238
    .line 239
    move-result p1

    .line 240
    iget p2, p2, Landroid/util/TypedValue;->type:I

    .line 241
    .line 242
    const/4 v1, 0x5

    .line 243
    if-ne p2, v1, :cond_4

    .line 244
    .line 245
    const/4 p2, 0x0

    .line 246
    cmpl-float p2, p1, p2

    .line 247
    .line 248
    if-ltz p2, :cond_4

    .line 249
    .line 250
    iget-object p2, v0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 251
    .line 252
    iget-object p2, p2, Ldefpackage/ei2;->a:Ldefpackage/bc4;

    .line 253
    .line 254
    invoke-virtual {p2}, Ldefpackage/bc4;->g()Ldefpackage/zc1;

    .line 255
    .line 256
    .line 257
    move-result-object p2

    .line 258
    invoke-virtual {p2, p1}, Ldefpackage/zc1;->b(F)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {p2}, Ldefpackage/zc1;->a()Ldefpackage/bc4;

    .line 262
    .line 263
    .line 264
    move-result-object p1

    .line 265
    invoke-virtual {v0, p1}, Ldefpackage/fi2;->setShapeAppearanceModel(Ldefpackage/bc4;)V

    .line 266
    .line 267
    .line 268
    :cond_4
    iput-object v0, p0, Ldefpackage/vg2;->c:Ldefpackage/fi2;

    .line 269
    .line 270
    return-void
.end method


# virtual methods
.method public final a()Ldefpackage/e9;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Ldefpackage/e9;->a:Ldefpackage/a9;

    .line 3
    .line 4
    iput-boolean v0, v1, Ldefpackage/a9;->m:Z

    .line 5
    .line 6
    return-object p0
.end method

.method public final b(Landroid/graphics/drawable/Drawable;)Ldefpackage/e9;
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/e9;->a:Ldefpackage/a9;

    .line 2
    .line 3
    iput-object p1, v0, Ldefpackage/a9;->c:Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    return-object p0
.end method

.method public final c(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/e9;->a:Ldefpackage/a9;

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/a9;->f:Ljava/lang/CharSequence;

    .line 4
    .line 5
    return-void
.end method

.method public final create()Ldefpackage/f9;
    .locals 9

    .line 1
    invoke-super {p0}, Ldefpackage/e9;->create()Ldefpackage/f9;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iget-object v4, p0, Ldefpackage/vg2;->c:Ldefpackage/fi2;

    .line 14
    .line 15
    if-eqz v4, :cond_0

    .line 16
    .line 17
    sget-object v3, Ldefpackage/j65;->a:Ljava/util/WeakHashMap;

    .line 18
    .line 19
    invoke-virtual {v2}, Landroid/view/View;->getElevation()F

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    invoke-virtual {v4, v3}, Ldefpackage/fi2;->l(F)V

    .line 24
    .line 25
    .line 26
    :cond_0
    new-instance v3, Landroid/graphics/drawable/InsetDrawable;

    .line 27
    .line 28
    iget-object p0, p0, Ldefpackage/vg2;->d:Landroid/graphics/Rect;

    .line 29
    .line 30
    iget v5, p0, Landroid/graphics/Rect;->left:I

    .line 31
    .line 32
    iget v6, p0, Landroid/graphics/Rect;->top:I

    .line 33
    .line 34
    iget v7, p0, Landroid/graphics/Rect;->right:I

    .line 35
    .line 36
    iget v8, p0, Landroid/graphics/Rect;->bottom:I

    .line 37
    .line 38
    invoke-direct/range {v3 .. v8}, Landroid/graphics/drawable/InsetDrawable;-><init>(Landroid/graphics/drawable/Drawable;IIII)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v3}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 42
    .line 43
    .line 44
    new-instance v1, Ldefpackage/uz1;

    .line 45
    .line 46
    invoke-direct {v1, v0, p0}, Ldefpackage/uz1;-><init>(Landroid/app/Dialog;Landroid/graphics/Rect;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 50
    .line 51
    .line 52
    return-object v0
.end method

.method public final d(Ljava/lang/CharSequence;Ldefpackage/ip3;)Ldefpackage/e9;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Ldefpackage/e9;->d(Ljava/lang/CharSequence;Ldefpackage/ip3;)Ldefpackage/e9;

    .line 2
    .line 3
    .line 4
    return-object p0
.end method

.method public final e(ILandroid/content/DialogInterface$OnClickListener;)Ldefpackage/e9;
    .locals 0

    .line 1
    const p1, 0x7f1300d0

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2}, Ldefpackage/e9;->e(ILandroid/content/DialogInterface$OnClickListener;)Ldefpackage/e9;

    .line 5
    .line 6
    .line 7
    return-object p0
.end method

.method public final f(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Ldefpackage/e9;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Ldefpackage/e9;->f(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Ldefpackage/e9;

    .line 2
    .line 3
    .line 4
    return-object p0
.end method

.method public final i(I)V
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/e9;->a:Ldefpackage/a9;

    .line 2
    .line 3
    iget-object v0, p0, Ldefpackage/a9;->a:Landroid/view/ContextThemeWrapper;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, Ldefpackage/a9;->f:Ljava/lang/CharSequence;

    .line 10
    .line 11
    return-void
.end method

.method public final j(ILandroid/content/DialogInterface$OnClickListener;)Ldefpackage/vg2;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Ldefpackage/e9;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Ldefpackage/e9;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ldefpackage/vg2;

    .line 6
    .line 7
    return-object p0
.end method

.method public final k(ILandroid/content/DialogInterface$OnClickListener;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Ldefpackage/e9;->e(ILandroid/content/DialogInterface$OnClickListener;)Ldefpackage/e9;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final l(ILandroid/content/DialogInterface$OnClickListener;)Ldefpackage/vg2;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Ldefpackage/e9;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Ldefpackage/e9;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ldefpackage/vg2;

    .line 6
    .line 7
    return-object p0
.end method

.method public final m(Ljava/lang/String;Ldefpackage/rn1;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Ldefpackage/e9;->f(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Ldefpackage/e9;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final n([Ljava/lang/CharSequence;Ldefpackage/wf4;)V
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    invoke-super {p0, p1, v0, p2}, Ldefpackage/e9;->g([Ljava/lang/CharSequence;ILandroid/content/DialogInterface$OnClickListener;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final o(Ljava/lang/CharSequence;)Ldefpackage/vg2;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Ldefpackage/e9;->setTitle(Ljava/lang/CharSequence;)Ldefpackage/e9;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ldefpackage/vg2;

    .line 6
    .line 7
    return-object p0
.end method

.method public final p(I)V
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/e9;->a:Ldefpackage/a9;

    .line 2
    .line 3
    iget-object v0, p0, Ldefpackage/a9;->a:Landroid/view/ContextThemeWrapper;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, Ldefpackage/a9;->d:Ljava/lang/CharSequence;

    .line 10
    .line 11
    return-void
.end method

.method public final q(Landroid/view/View;)Ldefpackage/vg2;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Ldefpackage/e9;->setView(Landroid/view/View;)Ldefpackage/e9;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ldefpackage/vg2;

    .line 6
    .line 7
    return-object p0
.end method

.method public final setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Ldefpackage/e9;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Ldefpackage/e9;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Ldefpackage/e9;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ldefpackage/vg2;

    .line 6
    .line 7
    return-object p0
.end method

.method public final setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Ldefpackage/e9;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Ldefpackage/e9;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Ldefpackage/e9;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ldefpackage/vg2;

    .line 6
    .line 7
    return-object p0
.end method

.method public final setTitle(Ljava/lang/CharSequence;)Ldefpackage/e9;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Ldefpackage/e9;->setTitle(Ljava/lang/CharSequence;)Ldefpackage/e9;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ldefpackage/vg2;

    .line 6
    .line 7
    return-object p0
.end method

.method public final setView(Landroid/view/View;)Ldefpackage/e9;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Ldefpackage/e9;->setView(Landroid/view/View;)Ldefpackage/e9;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ldefpackage/vg2;

    .line 6
    .line 7
    return-object p0
.end method
