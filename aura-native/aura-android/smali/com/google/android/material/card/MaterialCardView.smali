.class public Lcom/google/android/material/card/MaterialCardView;
.super Landroidx/cardview/widget/CardView;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/widget/Checkable;
.implements Llc4;


# static fields
.field public static final x:[I

.field public static final y:[I

.field public static final z:[I


# instance fields
.field public final t:Lqh2;

.field public final u:Z

.field public v:Z

.field public w:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const v0, 0x101009f

    .line 2
    .line 3
    .line 4
    filled-new-array {v0}, [I

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sput-object v0, Lcom/google/android/material/card/MaterialCardView;->x:[I

    .line 9
    .line 10
    const v0, 0x10100a0

    .line 11
    .line 12
    .line 13
    filled-new-array {v0}, [I

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Lcom/google/android/material/card/MaterialCardView;->y:[I

    .line 18
    .line 19
    const v0, 0x7f0404c6

    .line 20
    .line 21
    .line 22
    filled-new-array {v0}, [I

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sput-object v0, Lcom/google/android/material/card/MaterialCardView;->z:[I

    .line 27
    .line 28
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 268
    invoke-direct {p0, p1, v0}, Lcom/google/android/material/card/MaterialCardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const v0, 0x7f040348

    .line 267
    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/material/card/MaterialCardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 7

    .line 1
    const v0, 0x7f140486

    .line 2
    .line 3
    .line 4
    invoke-static {p1, p2, p3, v0}, Lsu3;->H(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-direct {p0, p1, p2, p3}, Landroidx/cardview/widget/CardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    iput-boolean p1, p0, Lcom/google/android/material/card/MaterialCardView;->v:Z

    .line 13
    .line 14
    iput-boolean p1, p0, Lcom/google/android/material/card/MaterialCardView;->w:Z

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    iput-boolean v0, p0, Lcom/google/android/material/card/MaterialCardView;->u:Z

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const v5, 0x7f140486

    .line 24
    .line 25
    .line 26
    new-array v6, p1, [I

    .line 27
    .line 28
    sget-object v3, Lht3;->z:[I

    .line 29
    .line 30
    move-object v2, p2

    .line 31
    move v4, p3

    .line 32
    invoke-static/range {v1 .. v6}, Luc5;->D(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Landroid/content/res/TypedArray;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    new-instance p3, Lqh2;

    .line 37
    .line 38
    invoke-direct {p3, p0, v2, v4}, Lqh2;-><init>(Lcom/google/android/material/card/MaterialCardView;Landroid/util/AttributeSet;I)V

    .line 39
    .line 40
    .line 41
    iput-object p3, p0, Lcom/google/android/material/card/MaterialCardView;->t:Lqh2;

    .line 42
    .line 43
    invoke-super {p0}, Landroidx/cardview/widget/CardView;->getCardBackgroundColor()Landroid/content/res/ColorStateList;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    iget-object v2, p3, Lqh2;->c:Lfi2;

    .line 48
    .line 49
    invoke-virtual {v2, v1}, Lfi2;->m(Landroid/content/res/ColorStateList;)V

    .line 50
    .line 51
    .line 52
    invoke-super {p0}, Landroidx/cardview/widget/CardView;->getContentPaddingLeft()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    invoke-super {p0}, Landroidx/cardview/widget/CardView;->getContentPaddingTop()I

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    invoke-super {p0}, Landroidx/cardview/widget/CardView;->getContentPaddingRight()I

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    invoke-super {p0}, Landroidx/cardview/widget/CardView;->getContentPaddingBottom()I

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    iget-object v5, p3, Lqh2;->b:Landroid/graphics/Rect;

    .line 69
    .line 70
    invoke-virtual {v5, v1, v3, v4, p0}, Landroid/graphics/Rect;->set(IIII)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p3}, Lqh2;->j()V

    .line 74
    .line 75
    .line 76
    iget-object p0, p3, Lqh2;->a:Lcom/google/android/material/card/MaterialCardView;

    .line 77
    .line 78
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    const/16 v3, 0xb

    .line 83
    .line 84
    invoke-static {v1, p2, v3}, Lh12;->s(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    iput-object v1, p3, Lqh2;->n:Landroid/content/res/ColorStateList;

    .line 89
    .line 90
    if-nez v1, :cond_0

    .line 91
    .line 92
    const/4 v1, -0x1

    .line 93
    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    iput-object v1, p3, Lqh2;->n:Landroid/content/res/ColorStateList;

    .line 98
    .line 99
    :cond_0
    const/16 v1, 0xc

    .line 100
    .line 101
    invoke-virtual {p2, v1, p1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    iput v1, p3, Lqh2;->h:I

    .line 106
    .line 107
    invoke-virtual {p2, p1, p1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    iput-boolean v1, p3, Lqh2;->s:Z

    .line 112
    .line 113
    invoke-virtual {p0, v1}, Landroid/view/View;->setLongClickable(Z)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    const/4 v3, 0x6

    .line 121
    invoke-static {v1, p2, v3}, Lh12;->s(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    iput-object v1, p3, Lqh2;->l:Landroid/content/res/ColorStateList;

    .line 126
    .line 127
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    const/4 v3, 0x2

    .line 132
    invoke-static {v1, p2, v3}, Lh12;->v(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-virtual {p3, v1}, Lqh2;->g(Landroid/graphics/drawable/Drawable;)V

    .line 137
    .line 138
    .line 139
    const/4 v1, 0x5

    .line 140
    invoke-virtual {p2, v1, p1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    iput v1, p3, Lqh2;->f:I

    .line 145
    .line 146
    const/4 v1, 0x4

    .line 147
    invoke-virtual {p2, v1, p1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    iput v1, p3, Lqh2;->e:I

    .line 152
    .line 153
    const/4 v1, 0x3

    .line 154
    const v3, 0x800035

    .line 155
    .line 156
    .line 157
    invoke-virtual {p2, v1, v3}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    iput v1, p3, Lqh2;->g:I

    .line 162
    .line 163
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    const/4 v3, 0x7

    .line 168
    invoke-static {v1, p2, v3}, Lh12;->s(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    iput-object v1, p3, Lqh2;->k:Landroid/content/res/ColorStateList;

    .line 173
    .line 174
    if-nez v1, :cond_1

    .line 175
    .line 176
    const v1, 0x7f040112

    .line 177
    .line 178
    .line 179
    invoke-static {p0, v1}, Lg12;->t(Landroid/view/View;I)I

    .line 180
    .line 181
    .line 182
    move-result v1

    .line 183
    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    iput-object v1, p3, Lqh2;->k:Landroid/content/res/ColorStateList;

    .line 188
    .line 189
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    invoke-static {v1, p2, v0}, Lh12;->s(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    if-nez v0, :cond_2

    .line 198
    .line 199
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    :cond_2
    iget-object p1, p3, Lqh2;->d:Lfi2;

    .line 204
    .line 205
    invoke-virtual {p1, v0}, Lfi2;->m(Landroid/content/res/ColorStateList;)V

    .line 206
    .line 207
    .line 208
    sget-object v0, Ll24;->a:[I

    .line 209
    .line 210
    iget-object v0, p3, Lqh2;->o:Landroid/graphics/drawable/RippleDrawable;

    .line 211
    .line 212
    if-eqz v0, :cond_3

    .line 213
    .line 214
    iget-object v1, p3, Lqh2;->k:Landroid/content/res/ColorStateList;

    .line 215
    .line 216
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/RippleDrawable;->setColor(Landroid/content/res/ColorStateList;)V

    .line 217
    .line 218
    .line 219
    :cond_3
    invoke-virtual {p0}, Landroidx/cardview/widget/CardView;->getCardElevation()F

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    invoke-virtual {v2, v0}, Lfi2;->l(F)V

    .line 224
    .line 225
    .line 226
    iget v0, p3, Lqh2;->h:I

    .line 227
    .line 228
    int-to-float v0, v0

    .line 229
    iget-object v1, p3, Lqh2;->n:Landroid/content/res/ColorStateList;

    .line 230
    .line 231
    invoke-virtual {p1, v0}, Lfi2;->r(F)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {p1, v1}, Lfi2;->q(Landroid/content/res/ColorStateList;)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {p3, v2}, Lqh2;->d(Landroid/graphics/drawable/Drawable;)Lph2;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    invoke-virtual {p0, v0}, Lcom/google/android/material/card/MaterialCardView;->setBackgroundInternal(Landroid/graphics/drawable/Drawable;)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {p0}, Landroid/view/View;->isClickable()Z

    .line 245
    .line 246
    .line 247
    move-result v0

    .line 248
    if-eqz v0, :cond_4

    .line 249
    .line 250
    invoke-virtual {p3}, Lqh2;->c()Landroid/graphics/drawable/LayerDrawable;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    :cond_4
    iput-object p1, p3, Lqh2;->i:Landroid/graphics/drawable/Drawable;

    .line 255
    .line 256
    invoke-virtual {p3, p1}, Lqh2;->d(Landroid/graphics/drawable/Drawable;)Lph2;

    .line 257
    .line 258
    .line 259
    move-result-object p1

    .line 260
    invoke-virtual {p0, p1}, Landroid/view/View;->setForeground(Landroid/graphics/drawable/Drawable;)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 264
    .line 265
    .line 266
    return-void
.end method

.method private getBoundsAsRectF()Landroid/graphics/RectF;
    .locals 1

    .line 1
    new-instance v0, Landroid/graphics/RectF;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/google/android/material/card/MaterialCardView;->t:Lqh2;

    .line 7
    .line 8
    iget-object p0, p0, Lqh2;->c:Lfi2;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {v0, p0}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method


# virtual methods
.method public final b()V
    .locals 7

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    if-le v0, v1, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lcom/google/android/material/card/MaterialCardView;->t:Lqh2;

    .line 8
    .line 9
    iget-object v0, p0, Lqh2;->o:Landroid/graphics/drawable/RippleDrawable;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget v1, v0, Landroid/graphics/Rect;->bottom:I

    .line 18
    .line 19
    iget-object v2, p0, Lqh2;->o:Landroid/graphics/drawable/RippleDrawable;

    .line 20
    .line 21
    iget v3, v0, Landroid/graphics/Rect;->left:I

    .line 22
    .line 23
    iget v4, v0, Landroid/graphics/Rect;->top:I

    .line 24
    .line 25
    iget v5, v0, Landroid/graphics/Rect;->right:I

    .line 26
    .line 27
    add-int/lit8 v6, v1, -0x1

    .line 28
    .line 29
    invoke-virtual {v2, v3, v4, v5, v6}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 30
    .line 31
    .line 32
    iget-object p0, p0, Lqh2;->o:Landroid/graphics/drawable/RippleDrawable;

    .line 33
    .line 34
    iget v2, v0, Landroid/graphics/Rect;->left:I

    .line 35
    .line 36
    iget v3, v0, Landroid/graphics/Rect;->top:I

    .line 37
    .line 38
    iget v0, v0, Landroid/graphics/Rect;->right:I

    .line 39
    .line 40
    invoke-virtual {p0, v2, v3, v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 41
    .line 42
    .line 43
    :cond_0
    return-void
.end method

.method public getCardBackgroundColor()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/card/MaterialCardView;->t:Lqh2;

    .line 2
    .line 3
    iget-object p0, p0, Lqh2;->c:Lfi2;

    .line 4
    .line 5
    iget-object p0, p0, Lfi2;->n:Lei2;

    .line 6
    .line 7
    iget-object p0, p0, Lei2;->c:Landroid/content/res/ColorStateList;

    .line 8
    .line 9
    return-object p0
.end method

.method public getCardForegroundColor()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/card/MaterialCardView;->t:Lqh2;

    .line 2
    .line 3
    iget-object p0, p0, Lqh2;->d:Lfi2;

    .line 4
    .line 5
    iget-object p0, p0, Lfi2;->n:Lei2;

    .line 6
    .line 7
    iget-object p0, p0, Lei2;->c:Landroid/content/res/ColorStateList;

    .line 8
    .line 9
    return-object p0
.end method

.method public getCardViewRadius()F
    .locals 0

    .line 1
    invoke-super {p0}, Landroidx/cardview/widget/CardView;->getRadius()F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public getCheckedIcon()Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/card/MaterialCardView;->t:Lqh2;

    .line 2
    .line 3
    iget-object p0, p0, Lqh2;->j:Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    return-object p0
.end method

.method public getCheckedIconGravity()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/card/MaterialCardView;->t:Lqh2;

    .line 2
    .line 3
    iget p0, p0, Lqh2;->g:I

    .line 4
    .line 5
    return p0
.end method

.method public getCheckedIconMargin()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/card/MaterialCardView;->t:Lqh2;

    .line 2
    .line 3
    iget p0, p0, Lqh2;->e:I

    .line 4
    .line 5
    return p0
.end method

.method public getCheckedIconSize()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/card/MaterialCardView;->t:Lqh2;

    .line 2
    .line 3
    iget p0, p0, Lqh2;->f:I

    .line 4
    .line 5
    return p0
.end method

.method public getCheckedIconTint()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/card/MaterialCardView;->t:Lqh2;

    .line 2
    .line 3
    iget-object p0, p0, Lqh2;->l:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    return-object p0
.end method

.method public getContentPaddingBottom()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/card/MaterialCardView;->t:Lqh2;

    .line 2
    .line 3
    iget-object p0, p0, Lqh2;->b:Landroid/graphics/Rect;

    .line 4
    .line 5
    iget p0, p0, Landroid/graphics/Rect;->bottom:I

    .line 6
    .line 7
    return p0
.end method

.method public getContentPaddingLeft()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/card/MaterialCardView;->t:Lqh2;

    .line 2
    .line 3
    iget-object p0, p0, Lqh2;->b:Landroid/graphics/Rect;

    .line 4
    .line 5
    iget p0, p0, Landroid/graphics/Rect;->left:I

    .line 6
    .line 7
    return p0
.end method

.method public getContentPaddingRight()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/card/MaterialCardView;->t:Lqh2;

    .line 2
    .line 3
    iget-object p0, p0, Lqh2;->b:Landroid/graphics/Rect;

    .line 4
    .line 5
    iget p0, p0, Landroid/graphics/Rect;->right:I

    .line 6
    .line 7
    return p0
.end method

.method public getContentPaddingTop()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/card/MaterialCardView;->t:Lqh2;

    .line 2
    .line 3
    iget-object p0, p0, Lqh2;->b:Landroid/graphics/Rect;

    .line 4
    .line 5
    iget p0, p0, Landroid/graphics/Rect;->top:I

    .line 6
    .line 7
    return p0
.end method

.method public getProgress()F
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/card/MaterialCardView;->t:Lqh2;

    .line 2
    .line 3
    iget-object p0, p0, Lqh2;->c:Lfi2;

    .line 4
    .line 5
    iget-object p0, p0, Lfi2;->n:Lei2;

    .line 6
    .line 7
    iget p0, p0, Lei2;->i:F

    .line 8
    .line 9
    return p0
.end method

.method public getRadius()F
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/card/MaterialCardView;->t:Lqh2;

    .line 2
    .line 3
    iget-object p0, p0, Lqh2;->c:Lfi2;

    .line 4
    .line 5
    invoke-virtual {p0}, Lfi2;->h()F

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public getRippleColor()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/card/MaterialCardView;->t:Lqh2;

    .line 2
    .line 3
    iget-object p0, p0, Lqh2;->k:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    return-object p0
.end method

.method public getShapeAppearanceModel()Lbc4;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/card/MaterialCardView;->t:Lqh2;

    .line 2
    .line 3
    iget-object p0, p0, Lqh2;->m:Lbc4;

    .line 4
    .line 5
    return-object p0
.end method

.method public getStrokeColor()I
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/google/android/material/card/MaterialCardView;->t:Lqh2;

    .line 2
    .line 3
    iget-object p0, p0, Lqh2;->n:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const/4 p0, -0x1

    .line 8
    return p0

    .line 9
    :cond_0
    invoke-virtual {p0}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public getStrokeColorStateList()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/card/MaterialCardView;->t:Lqh2;

    .line 2
    .line 3
    iget-object p0, p0, Lqh2;->n:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    return-object p0
.end method

.method public getStrokeWidth()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/card/MaterialCardView;->t:Lqh2;

    .line 2
    .line 3
    iget p0, p0, Lqh2;->h:I

    .line 4
    .line 5
    return p0
.end method

.method public final isChecked()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/google/android/material/card/MaterialCardView;->v:Z

    .line 2
    .line 3
    return p0
.end method

.method public final onAttachedToWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/material/card/MaterialCardView;->t:Lqh2;

    .line 5
    .line 6
    iget-object v0, v0, Lqh2;->c:Lfi2;

    .line 7
    .line 8
    invoke-static {p0, v0}, Lji2;->O(Landroid/view/View;Lfi2;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final onCreateDrawableState(I)[I
    .locals 1

    .line 1
    add-int/lit8 p1, p1, 0x3

    .line 2
    .line 3
    invoke-super {p0, p1}, Landroid/view/View;->onCreateDrawableState(I)[I

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Lcom/google/android/material/card/MaterialCardView;->t:Lqh2;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-boolean v0, v0, Lqh2;->s:Z

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    sget-object v0, Lcom/google/android/material/card/MaterialCardView;->x:[I

    .line 16
    .line 17
    invoke-static {p1, v0}, Landroid/view/View;->mergeDrawableStates([I[I)[I

    .line 18
    .line 19
    .line 20
    :cond_0
    iget-boolean v0, p0, Lcom/google/android/material/card/MaterialCardView;->v:Z

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    sget-object v0, Lcom/google/android/material/card/MaterialCardView;->y:[I

    .line 25
    .line 26
    invoke-static {p1, v0}, Landroid/view/View;->mergeDrawableStates([I[I)[I

    .line 27
    .line 28
    .line 29
    :cond_1
    iget-boolean p0, p0, Lcom/google/android/material/card/MaterialCardView;->w:Z

    .line 30
    .line 31
    if-eqz p0, :cond_2

    .line 32
    .line 33
    sget-object p0, Lcom/google/android/material/card/MaterialCardView;->z:[I

    .line 34
    .line 35
    invoke-static {p1, p0}, Landroid/view/View;->mergeDrawableStates([I[I)[I

    .line 36
    .line 37
    .line 38
    :cond_2
    return-object p1
.end method

.method public final onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 2
    .line 3
    .line 4
    const-string v0, "androidx.cardview.widget.CardView"

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setClassName(Ljava/lang/CharSequence;)V

    .line 7
    .line 8
    .line 9
    iget-boolean p0, p0, Lcom/google/android/material/card/MaterialCardView;->v:Z

    .line 10
    .line 11
    invoke-virtual {p1, p0}, Landroid/view/accessibility/AccessibilityRecord;->setChecked(Z)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 2
    .line 3
    .line 4
    const-string v0, "androidx.cardview.widget.CardView"

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/google/android/material/card/MaterialCardView;->t:Lqh2;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-boolean v0, v0, Lqh2;->s:Z

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCheckable(Z)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/view/View;->isClickable()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClickable(Z)V

    .line 28
    .line 29
    .line 30
    iget-boolean p0, p0, Lcom/google/android/material/card/MaterialCardView;->v:Z

    .line 31
    .line 32
    invoke-virtual {p1, p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setChecked(Z)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final onMeasure(II)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/cardview/widget/CardView;->onMeasure(II)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    iget-object p0, p0, Lcom/google/android/material/card/MaterialCardView;->t:Lqh2;

    .line 13
    .line 14
    invoke-virtual {p0, p1, p2}, Lqh2;->e(II)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public setBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/material/card/MaterialCardView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/card/MaterialCardView;->u:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/google/android/material/card/MaterialCardView;->t:Lqh2;

    .line 6
    .line 7
    iget-boolean v1, v0, Lqh2;->r:Z

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    const-string v1, "MaterialCardView"

    .line 12
    .line 13
    const-string v2, "Setting a custom background is not supported."

    .line 14
    .line 15
    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    iput-boolean v1, v0, Lqh2;->r:Z

    .line 20
    .line 21
    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 22
    .line 23
    .line 24
    :cond_1
    return-void
.end method

.method public setBackgroundInternal(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setCardBackgroundColor(I)V
    .locals 0

    .line 1
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p0, p0, Lcom/google/android/material/card/MaterialCardView;->t:Lqh2;

    .line 6
    .line 7
    iget-object p0, p0, Lqh2;->c:Lfi2;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lfi2;->m(Landroid/content/res/ColorStateList;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setCardBackgroundColor(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 13
    iget-object p0, p0, Lcom/google/android/material/card/MaterialCardView;->t:Lqh2;

    .line 14
    iget-object p0, p0, Lqh2;->c:Lfi2;

    .line 15
    invoke-virtual {p0, p1}, Lfi2;->m(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setCardElevation(F)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/cardview/widget/CardView;->setCardElevation(F)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/google/android/material/card/MaterialCardView;->t:Lqh2;

    .line 5
    .line 6
    iget-object p1, p0, Lqh2;->c:Lfi2;

    .line 7
    .line 8
    iget-object p0, p0, Lqh2;->a:Lcom/google/android/material/card/MaterialCardView;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/cardview/widget/CardView;->getCardElevation()F

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    invoke-virtual {p1, p0}, Lfi2;->l(F)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public setCardForegroundColor(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/card/MaterialCardView;->t:Lqh2;

    .line 2
    .line 3
    iget-object p0, p0, Lqh2;->d:Lfi2;

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    :cond_0
    invoke-virtual {p0, p1}, Lfi2;->m(Landroid/content/res/ColorStateList;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public setCheckable(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/card/MaterialCardView;->t:Lqh2;

    .line 2
    .line 3
    iput-boolean p1, p0, Lqh2;->s:Z

    .line 4
    .line 5
    return-void
.end method

.method public setChecked(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/card/MaterialCardView;->v:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/android/material/card/MaterialCardView;->toggle()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public setCheckedIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/card/MaterialCardView;->t:Lqh2;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lqh2;->g(Landroid/graphics/drawable/Drawable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setCheckedIconGravity(I)V
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/google/android/material/card/MaterialCardView;->t:Lqh2;

    .line 2
    .line 3
    iget v0, p0, Lqh2;->g:I

    .line 4
    .line 5
    if-eq v0, p1, :cond_0

    .line 6
    .line 7
    iput p1, p0, Lqh2;->g:I

    .line 8
    .line 9
    iget-object p1, p0, Lqh2;->a:Lcom/google/android/material/card/MaterialCardView;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    invoke-virtual {p0, v0, p1}, Lqh2;->e(II)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public setCheckedIconMargin(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/card/MaterialCardView;->t:Lqh2;

    .line 2
    .line 3
    iput p1, p0, Lqh2;->e:I

    .line 4
    .line 5
    return-void
.end method

.method public setCheckedIconMarginResource(I)V
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    if-eq p1, v0, :cond_0

    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iget-object p0, p0, Lcom/google/android/material/card/MaterialCardView;->t:Lqh2;

    .line 13
    .line 14
    iput p1, p0, Lqh2;->e:I

    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public setCheckedIconResource(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, Lzz1;->r(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object p0, p0, Lcom/google/android/material/card/MaterialCardView;->t:Lqh2;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lqh2;->g(Landroid/graphics/drawable/Drawable;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public setCheckedIconSize(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/card/MaterialCardView;->t:Lqh2;

    .line 2
    .line 3
    iput p1, p0, Lqh2;->f:I

    .line 4
    .line 5
    return-void
.end method

.method public setCheckedIconSizeResource(I)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iget-object p0, p0, Lcom/google/android/material/card/MaterialCardView;->t:Lqh2;

    .line 12
    .line 13
    iput p1, p0, Lqh2;->f:I

    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public setCheckedIconTint(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/card/MaterialCardView;->t:Lqh2;

    .line 2
    .line 3
    iput-object p1, p0, Lqh2;->l:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    iget-object p0, p0, Lqh2;->j:Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public setClickable(Z)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setClickable(Z)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/google/android/material/card/MaterialCardView;->t:Lqh2;

    .line 5
    .line 6
    if-eqz p0, :cond_2

    .line 7
    .line 8
    iget-object p1, p0, Lqh2;->i:Landroid/graphics/drawable/Drawable;

    .line 9
    .line 10
    iget-object v0, p0, Lqh2;->a:Lcom/google/android/material/card/MaterialCardView;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/view/View;->isClickable()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Lqh2;->c()Landroid/graphics/drawable/LayerDrawable;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object v1, p0, Lqh2;->d:Lfi2;

    .line 24
    .line 25
    :goto_0
    iput-object v1, p0, Lqh2;->i:Landroid/graphics/drawable/Drawable;

    .line 26
    .line 27
    if-eq p1, v1, :cond_2

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/view/View;->getForeground()Landroid/graphics/drawable/Drawable;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    instance-of p1, p1, Landroid/graphics/drawable/InsetDrawable;

    .line 34
    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    invoke-virtual {v0}, Landroid/view/View;->getForeground()Landroid/graphics/drawable/Drawable;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    check-cast p0, Landroid/graphics/drawable/InsetDrawable;

    .line 42
    .line 43
    invoke-virtual {p0, v1}, Landroid/graphics/drawable/DrawableWrapper;->setDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_1
    invoke-virtual {p0, v1}, Lqh2;->d(Landroid/graphics/drawable/Drawable;)Lph2;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {v0, p0}, Landroid/view/View;->setForeground(Landroid/graphics/drawable/Drawable;)V

    .line 52
    .line 53
    .line 54
    :cond_2
    return-void
.end method

.method public setDragged(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/card/MaterialCardView;->w:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-boolean p1, p0, Lcom/google/android/material/card/MaterialCardView;->w:Z

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->refreshDrawableState()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/android/material/card/MaterialCardView;->b()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public setMaxCardElevation(F)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/cardview/widget/CardView;->setMaxCardElevation(F)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/google/android/material/card/MaterialCardView;->t:Lqh2;

    .line 5
    .line 6
    invoke-virtual {p0}, Lqh2;->k()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setOnCheckedChangeListener(Loh2;)V
    .locals 0

    .line 1
    return-void
.end method

.method public setPreventCornerOverlap(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/cardview/widget/CardView;->setPreventCornerOverlap(Z)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/google/android/material/card/MaterialCardView;->t:Lqh2;

    .line 5
    .line 6
    invoke-virtual {p0}, Lqh2;->k()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lqh2;->j()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setProgress(F)V
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/google/android/material/card/MaterialCardView;->t:Lqh2;

    .line 2
    .line 3
    iget-object v0, p0, Lqh2;->c:Lfi2;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lfi2;->n(F)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lqh2;->d:Lfi2;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lfi2;->n(F)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object p0, p0, Lqh2;->q:Lfi2;

    .line 16
    .line 17
    if-eqz p0, :cond_1

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Lfi2;->n(F)V

    .line 20
    .line 21
    .line 22
    :cond_1
    return-void
.end method

.method public setRadius(F)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/cardview/widget/CardView;->setRadius(F)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/google/android/material/card/MaterialCardView;->t:Lqh2;

    .line 5
    .line 6
    iget-object v0, p0, Lqh2;->m:Lbc4;

    .line 7
    .line 8
    invoke-virtual {v0}, Lbc4;->g()Lzc1;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0, p1}, Lzc1;->b(F)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lzc1;->a()Lbc4;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p0, p1}, Lqh2;->h(Lbc4;)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lqh2;->i:Landroid/graphics/drawable/Drawable;

    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lqh2;->i()Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-nez p1, :cond_0

    .line 32
    .line 33
    iget-object p1, p0, Lqh2;->a:Lcom/google/android/material/card/MaterialCardView;

    .line 34
    .line 35
    invoke-virtual {p1}, Landroidx/cardview/widget/CardView;->getPreventCornerOverlap()Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    iget-object p1, p0, Lqh2;->c:Lfi2;

    .line 42
    .line 43
    invoke-virtual {p1}, Lfi2;->k()Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-nez p1, :cond_1

    .line 48
    .line 49
    :cond_0
    invoke-virtual {p0}, Lqh2;->j()V

    .line 50
    .line 51
    .line 52
    :cond_1
    invoke-virtual {p0}, Lqh2;->i()Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-eqz p1, :cond_2

    .line 57
    .line 58
    invoke-virtual {p0}, Lqh2;->k()V

    .line 59
    .line 60
    .line 61
    :cond_2
    return-void
.end method

.method public setRippleColor(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/google/android/material/card/MaterialCardView;->t:Lqh2;

    .line 2
    .line 3
    iput-object p1, p0, Lqh2;->k:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    sget-object v0, Ll24;->a:[I

    .line 6
    .line 7
    iget-object p0, p0, Lqh2;->o:Landroid/graphics/drawable/RippleDrawable;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Landroid/graphics/drawable/RippleDrawable;->setColor(Landroid/content/res/ColorStateList;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public setRippleColorResource(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, Lud3;->n(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object p0, p0, Lcom/google/android/material/card/MaterialCardView;->t:Lqh2;

    .line 10
    .line 11
    iput-object p1, p0, Lqh2;->k:Landroid/content/res/ColorStateList;

    .line 12
    .line 13
    sget-object v0, Ll24;->a:[I

    .line 14
    .line 15
    iget-object p0, p0, Lqh2;->o:Landroid/graphics/drawable/RippleDrawable;

    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Landroid/graphics/drawable/RippleDrawable;->setColor(Landroid/content/res/ColorStateList;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public setShapeAppearanceModel(Lbc4;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/material/card/MaterialCardView;->getBoundsAsRectF()Landroid/graphics/RectF;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1, v0}, Lbc4;->f(Landroid/graphics/RectF;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p0, v0}, Landroid/view/View;->setClipToOutline(Z)V

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Lcom/google/android/material/card/MaterialCardView;->t:Lqh2;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lqh2;->h(Lbc4;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public setStrokeColor(I)V
    .locals 0

    .line 25
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/material/card/MaterialCardView;->setStrokeColor(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setStrokeColor(Landroid/content/res/ColorStateList;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/card/MaterialCardView;->t:Lqh2;

    .line 2
    .line 3
    iget-object v1, v0, Lqh2;->n:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    if-ne v1, p1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iput-object p1, v0, Lqh2;->n:Landroid/content/res/ColorStateList;

    .line 9
    .line 10
    iget-object v1, v0, Lqh2;->d:Lfi2;

    .line 11
    .line 12
    iget v0, v0, Lqh2;->h:I

    .line 13
    .line 14
    int-to-float v0, v0

    .line 15
    invoke-virtual {v1, v0}, Lfi2;->r(F)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, p1}, Lfi2;->q(Landroid/content/res/ColorStateList;)V

    .line 19
    .line 20
    .line 21
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public setStrokeWidth(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/card/MaterialCardView;->t:Lqh2;

    .line 2
    .line 3
    iget v1, v0, Lqh2;->h:I

    .line 4
    .line 5
    if-ne p1, v1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iput p1, v0, Lqh2;->h:I

    .line 9
    .line 10
    iget-object v1, v0, Lqh2;->d:Lfi2;

    .line 11
    .line 12
    int-to-float p1, p1

    .line 13
    iget-object v0, v0, Lqh2;->n:Landroid/content/res/ColorStateList;

    .line 14
    .line 15
    invoke-virtual {v1, p1}, Lfi2;->r(F)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v0}, Lfi2;->q(Landroid/content/res/ColorStateList;)V

    .line 19
    .line 20
    .line 21
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public setUseCompatPadding(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/cardview/widget/CardView;->setUseCompatPadding(Z)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/google/android/material/card/MaterialCardView;->t:Lqh2;

    .line 5
    .line 6
    invoke-virtual {p0}, Lqh2;->k()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lqh2;->j()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final toggle()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/material/card/MaterialCardView;->t:Lqh2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v1, v0, Lqh2;->s:Z

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    iget-boolean v1, p0, Lcom/google/android/material/card/MaterialCardView;->v:Z

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    xor-int/2addr v1, v2

    .line 19
    iput-boolean v1, p0, Lcom/google/android/material/card/MaterialCardView;->v:Z

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/View;->refreshDrawableState()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/google/android/material/card/MaterialCardView;->b()V

    .line 25
    .line 26
    .line 27
    iget-boolean p0, p0, Lcom/google/android/material/card/MaterialCardView;->v:Z

    .line 28
    .line 29
    invoke-virtual {v0, p0, v2}, Lqh2;->f(ZZ)V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
.end method
