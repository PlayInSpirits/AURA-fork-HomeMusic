.class public final Ldefpackage/yo;
.super Landroid/graphics/drawable/Drawable;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/wr4;


# instance fields
.field public final n:Ljava/lang/ref/WeakReference;

.field public final o:Ldefpackage/fi2;

.field public final p:Ldefpackage/xr4;

.field public final q:Landroid/graphics/Rect;

.field public final r:Ldefpackage/ap;

.field public s:F

.field public t:F

.field public final u:I

.field public v:F

.field public w:F

.field public x:F

.field public y:Ljava/lang/ref/WeakReference;

.field public z:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ldefpackage/zo;)V
    .locals 9

    .line 1
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ldefpackage/yo;->n:Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    sget-object v1, Ldefpackage/uc5;->h:[I

    .line 12
    .line 13
    const-string v2, "Theme.MaterialComponents"

    .line 14
    .line 15
    invoke-static {p1, v1, v2}, Ldefpackage/uc5;->h(Landroid/content/Context;[ILjava/lang/String;)V

    .line 16
    .line 17
    .line 18
    new-instance v1, Landroid/graphics/Rect;

    .line 19
    .line 20
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v1, p0, Ldefpackage/yo;->q:Landroid/graphics/Rect;

    .line 24
    .line 25
    new-instance v1, Ldefpackage/xr4;

    .line 26
    .line 27
    invoke-direct {v1, p0}, Ldefpackage/xr4;-><init>(Ldefpackage/wr4;)V

    .line 28
    .line 29
    .line 30
    iput-object v1, p0, Ldefpackage/yo;->p:Ldefpackage/xr4;

    .line 31
    .line 32
    sget-object v2, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    .line 33
    .line 34
    iget-object v3, v1, Ldefpackage/xr4;->a:Landroid/text/TextPaint;

    .line 35
    .line 36
    invoke-virtual {v3, v2}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 37
    .line 38
    .line 39
    new-instance v2, Ldefpackage/ap;

    .line 40
    .line 41
    invoke-direct {v2, p1, p2}, Ldefpackage/ap;-><init>(Landroid/content/Context;Ldefpackage/zo;)V

    .line 42
    .line 43
    .line 44
    iput-object v2, p0, Ldefpackage/yo;->r:Ldefpackage/ap;

    .line 45
    .line 46
    new-instance p2, Ldefpackage/fi2;

    .line 47
    .line 48
    invoke-virtual {p0}, Ldefpackage/yo;->f()Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    iget-object v2, v2, Ldefpackage/ap;->b:Ldefpackage/zo;

    .line 53
    .line 54
    if-eqz v4, :cond_0

    .line 55
    .line 56
    iget-object v4, v2, Ldefpackage/zo;->t:Ljava/lang/Integer;

    .line 57
    .line 58
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    goto :goto_0

    .line 63
    :cond_0
    iget-object v4, v2, Ldefpackage/zo;->r:Ljava/lang/Integer;

    .line 64
    .line 65
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    :goto_0
    invoke-virtual {p0}, Ldefpackage/yo;->f()Z

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    if-eqz v5, :cond_1

    .line 74
    .line 75
    iget-object v5, v2, Ldefpackage/zo;->u:Ljava/lang/Integer;

    .line 76
    .line 77
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    goto :goto_1

    .line 82
    :cond_1
    iget-object v5, v2, Ldefpackage/zo;->s:Ljava/lang/Integer;

    .line 83
    .line 84
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    :goto_1
    invoke-static {p1, v4, v5}, Ldefpackage/bc4;->a(Landroid/content/Context;II)Ldefpackage/zc1;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-virtual {p1}, Ldefpackage/zc1;->a()Ldefpackage/bc4;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-direct {p2, p1}, Ldefpackage/fi2;-><init>(Ldefpackage/bc4;)V

    .line 97
    .line 98
    .line 99
    iput-object p2, p0, Ldefpackage/yo;->o:Ldefpackage/fi2;

    .line 100
    .line 101
    invoke-virtual {p0}, Ldefpackage/yo;->h()V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    check-cast p1, Landroid/content/Context;

    .line 109
    .line 110
    if-nez p1, :cond_2

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_2
    new-instance v0, Ldefpackage/rr4;

    .line 114
    .line 115
    iget-object v4, v2, Ldefpackage/zo;->q:Ljava/lang/Integer;

    .line 116
    .line 117
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    invoke-direct {v0, p1, v4}, Ldefpackage/rr4;-><init>(Landroid/content/Context;I)V

    .line 122
    .line 123
    .line 124
    iget-object v4, v1, Ldefpackage/xr4;->g:Ldefpackage/rr4;

    .line 125
    .line 126
    if-ne v4, v0, :cond_3

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_3
    invoke-virtual {v1, v0, p1}, Ldefpackage/xr4;->c(Ldefpackage/rr4;Landroid/content/Context;)V

    .line 130
    .line 131
    .line 132
    iget-object p1, v2, Ldefpackage/zo;->p:Ljava/lang/Integer;

    .line 133
    .line 134
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    invoke-virtual {v3, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p0}, Ldefpackage/yo;->j()V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 148
    .line 149
    .line 150
    :goto_2
    iget p1, v2, Ldefpackage/zo;->y:I

    .line 151
    .line 152
    const/4 v0, -0x2

    .line 153
    const/4 v4, 0x1

    .line 154
    if-eq p1, v0, :cond_4

    .line 155
    .line 156
    int-to-double v5, p1

    .line 157
    const-wide/high16 v7, 0x3ff0000000000000L    # 1.0

    .line 158
    .line 159
    sub-double/2addr v5, v7

    .line 160
    const-wide/high16 v7, 0x4024000000000000L    # 10.0

    .line 161
    .line 162
    invoke-static {v7, v8, v5, v6}, Ljava/lang/Math;->pow(DD)D

    .line 163
    .line 164
    .line 165
    move-result-wide v5

    .line 166
    double-to-int p1, v5

    .line 167
    sub-int/2addr p1, v4

    .line 168
    iput p1, p0, Ldefpackage/yo;->u:I

    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_4
    iget p1, v2, Ldefpackage/zo;->z:I

    .line 172
    .line 173
    iput p1, p0, Ldefpackage/yo;->u:I

    .line 174
    .line 175
    :goto_3
    iput-boolean v4, v1, Ldefpackage/xr4;->e:Z

    .line 176
    .line 177
    invoke-virtual {p0}, Ldefpackage/yo;->j()V

    .line 178
    .line 179
    .line 180
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 181
    .line 182
    .line 183
    iput-boolean v4, v1, Ldefpackage/xr4;->e:Z

    .line 184
    .line 185
    invoke-virtual {p0}, Ldefpackage/yo;->h()V

    .line 186
    .line 187
    .line 188
    invoke-virtual {p0}, Ldefpackage/yo;->j()V

    .line 189
    .line 190
    .line 191
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 192
    .line 193
    .line 194
    invoke-virtual {p0}, Ldefpackage/yo;->getAlpha()I

    .line 195
    .line 196
    .line 197
    move-result p1

    .line 198
    invoke-virtual {v3, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 202
    .line 203
    .line 204
    iget-object p1, v2, Ldefpackage/zo;->o:Ljava/lang/Integer;

    .line 205
    .line 206
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 207
    .line 208
    .line 209
    move-result p1

    .line 210
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    iget-object v0, p2, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 215
    .line 216
    iget-object v0, v0, Ldefpackage/ei2;->c:Landroid/content/res/ColorStateList;

    .line 217
    .line 218
    if-eq v0, p1, :cond_5

    .line 219
    .line 220
    invoke-virtual {p2, p1}, Ldefpackage/fi2;->m(Landroid/content/res/ColorStateList;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 224
    .line 225
    .line 226
    :cond_5
    iget-object p1, v2, Ldefpackage/zo;->p:Ljava/lang/Integer;

    .line 227
    .line 228
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 229
    .line 230
    .line 231
    move-result p1

    .line 232
    invoke-virtual {v3, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 236
    .line 237
    .line 238
    iget-object p1, p0, Ldefpackage/yo;->y:Ljava/lang/ref/WeakReference;

    .line 239
    .line 240
    if-eqz p1, :cond_7

    .line 241
    .line 242
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    if-eqz p1, :cond_7

    .line 247
    .line 248
    iget-object p1, p0, Ldefpackage/yo;->y:Ljava/lang/ref/WeakReference;

    .line 249
    .line 250
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    check-cast p1, Landroid/view/View;

    .line 255
    .line 256
    iget-object p2, p0, Ldefpackage/yo;->z:Ljava/lang/ref/WeakReference;

    .line 257
    .line 258
    if-eqz p2, :cond_6

    .line 259
    .line 260
    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object p2

    .line 264
    check-cast p2, Landroid/widget/FrameLayout;

    .line 265
    .line 266
    goto :goto_4

    .line 267
    :cond_6
    const/4 p2, 0x0

    .line 268
    :goto_4
    invoke-virtual {p0, p1, p2}, Ldefpackage/yo;->i(Landroid/view/View;Landroid/widget/FrameLayout;)V

    .line 269
    .line 270
    .line 271
    :cond_7
    invoke-virtual {p0}, Ldefpackage/yo;->j()V

    .line 272
    .line 273
    .line 274
    iget-object p1, v2, Ldefpackage/zo;->G:Ljava/lang/Boolean;

    .line 275
    .line 276
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 277
    .line 278
    .line 279
    move-result p1

    .line 280
    const/4 p2, 0x0

    .line 281
    invoke-virtual {p0, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 282
    .line 283
    .line 284
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final b()Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Ldefpackage/yo;->r:Ldefpackage/ap;

    .line 2
    .line 3
    iget-object v1, v0, Ldefpackage/ap;->b:Ldefpackage/zo;

    .line 4
    .line 5
    iget-object v0, v0, Ldefpackage/ap;->b:Ldefpackage/zo;

    .line 6
    .line 7
    iget-object v2, v1, Ldefpackage/zo;->w:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v3, p0, Ldefpackage/yo;->n:Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    const/4 v4, -0x2

    .line 12
    if-eqz v2, :cond_3

    .line 13
    .line 14
    iget p0, v1, Ldefpackage/zo;->y:I

    .line 15
    .line 16
    if-ne p0, v4, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    if-eqz v2, :cond_2

    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-le v0, p0, :cond_2

    .line 26
    .line 27
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Landroid/content/Context;

    .line 32
    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    add-int/lit8 p0, p0, -0x1

    .line 37
    .line 38
    const/4 v1, 0x0

    .line 39
    invoke-virtual {v2, v1, p0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    const v1, 0x7f1302f9

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    const-string v1, "\u2026"

    .line 51
    .line 52
    filled-new-array {p0, v1}, [Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0

    .line 61
    :cond_2
    :goto_0
    return-object v2

    .line 62
    :cond_3
    invoke-virtual {p0}, Ldefpackage/yo;->g()Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eqz v1, :cond_7

    .line 67
    .line 68
    iget v1, p0, Ldefpackage/yo;->u:I

    .line 69
    .line 70
    if-eq v1, v4, :cond_6

    .line 71
    .line 72
    invoke-virtual {p0}, Ldefpackage/yo;->e()I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-gt v2, v1, :cond_4

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_4
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    check-cast p0, Landroid/content/Context;

    .line 84
    .line 85
    if-nez p0, :cond_5

    .line 86
    .line 87
    :goto_1
    const-string p0, ""

    .line 88
    .line 89
    return-object p0

    .line 90
    :cond_5
    iget-object v0, v0, Ldefpackage/zo;->A:Ljava/util/Locale;

    .line 91
    .line 92
    const v2, 0x7f130382

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    const-string v2, "+"

    .line 104
    .line 105
    filled-new-array {v1, v2}, [Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-static {v0, p0, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    return-object p0

    .line 114
    :cond_6
    :goto_2
    iget-object v0, v0, Ldefpackage/zo;->A:Ljava/util/Locale;

    .line 115
    .line 116
    invoke-static {v0}, Ljava/text/NumberFormat;->getInstance(Ljava/util/Locale;)Ljava/text/NumberFormat;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-virtual {p0}, Ldefpackage/yo;->e()I

    .line 121
    .line 122
    .line 123
    move-result p0

    .line 124
    int-to-long v1, p0

    .line 125
    invoke-virtual {v0, v1, v2}, Ljava/text/NumberFormat;->format(J)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    return-object p0

    .line 130
    :cond_7
    const/4 p0, 0x0

    .line 131
    return-object p0
.end method

.method public final c()Ljava/lang/CharSequence;
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    iget-object v0, p0, Ldefpackage/yo;->r:Ldefpackage/ap;

    .line 9
    .line 10
    iget-object v1, v0, Ldefpackage/ap;->b:Ldefpackage/zo;

    .line 11
    .line 12
    iget-object v2, v1, Ldefpackage/zo;->w:Ljava/lang/String;

    .line 13
    .line 14
    if-eqz v2, :cond_2

    .line 15
    .line 16
    iget-object p0, v1, Ldefpackage/zo;->B:Ljava/lang/CharSequence;

    .line 17
    .line 18
    if-eqz p0, :cond_1

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_1
    iget-object p0, v0, Ldefpackage/ap;->b:Ldefpackage/zo;

    .line 22
    .line 23
    iget-object p0, p0, Ldefpackage/zo;->w:Ljava/lang/String;

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_2
    invoke-virtual {p0}, Ldefpackage/yo;->g()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    iget-object v0, v0, Ldefpackage/ap;->b:Ldefpackage/zo;

    .line 31
    .line 32
    if-eqz v1, :cond_7

    .line 33
    .line 34
    iget v1, v0, Ldefpackage/zo;->D:I

    .line 35
    .line 36
    if-eqz v1, :cond_6

    .line 37
    .line 38
    iget-object v1, p0, Ldefpackage/yo;->n:Ljava/lang/ref/WeakReference;

    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, Landroid/content/Context;

    .line 45
    .line 46
    if-nez v1, :cond_3

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_3
    const/4 v2, -0x2

    .line 50
    iget v3, p0, Ldefpackage/yo;->u:I

    .line 51
    .line 52
    if-eq v3, v2, :cond_5

    .line 53
    .line 54
    invoke-virtual {p0}, Ldefpackage/yo;->e()I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-gt v2, v3, :cond_4

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_4
    iget p0, v0, Ldefpackage/zo;->E:I

    .line 62
    .line 63
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {v1, p0, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0

    .line 76
    :cond_5
    :goto_0
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    iget v0, v0, Ldefpackage/zo;->D:I

    .line 81
    .line 82
    invoke-virtual {p0}, Ldefpackage/yo;->e()I

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    invoke-virtual {p0}, Ldefpackage/yo;->e()I

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-virtual {v1, v0, v2, p0}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    return-object p0

    .line 103
    :cond_6
    :goto_1
    const/4 p0, 0x0

    .line 104
    return-object p0

    .line 105
    :cond_7
    iget-object p0, v0, Ldefpackage/zo;->C:Ljava/lang/CharSequence;

    .line 106
    .line 107
    return-object p0
.end method

.method public final d()Landroid/widget/FrameLayout;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/yo;->z:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Landroid/widget/FrameLayout;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return-object p0
.end method

.method public final draw(Landroid/graphics/Canvas;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/graphics/Rect;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_2

    .line 10
    .line 11
    invoke-virtual {p0}, Ldefpackage/yo;->getAlpha()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    goto :goto_2

    .line 24
    :cond_0
    iget-object v0, p0, Ldefpackage/yo;->o:Ldefpackage/fi2;

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Ldefpackage/fi2;->draw(Landroid/graphics/Canvas;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Ldefpackage/yo;->f()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    invoke-virtual {p0}, Ldefpackage/yo;->b()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    new-instance v1, Landroid/graphics/Rect;

    .line 42
    .line 43
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 44
    .line 45
    .line 46
    iget-object v2, p0, Ldefpackage/yo;->p:Ldefpackage/xr4;

    .line 47
    .line 48
    iget-object v3, v2, Ldefpackage/xr4;->a:Landroid/text/TextPaint;

    .line 49
    .line 50
    const/4 v4, 0x0

    .line 51
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    invoke-virtual {v3, v0, v4, v5, v1}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 56
    .line 57
    .line 58
    iget v3, p0, Ldefpackage/yo;->t:F

    .line 59
    .line 60
    invoke-virtual {v1}, Landroid/graphics/Rect;->exactCenterY()F

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    sub-float/2addr v3, v4

    .line 65
    iget p0, p0, Ldefpackage/yo;->s:F

    .line 66
    .line 67
    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    .line 68
    .line 69
    if-gtz v1, :cond_1

    .line 70
    .line 71
    float-to-int v1, v3

    .line 72
    :goto_0
    int-to-float v1, v1

    .line 73
    goto :goto_1

    .line 74
    :cond_1
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    goto :goto_0

    .line 79
    :goto_1
    iget-object v2, v2, Ldefpackage/xr4;->a:Landroid/text/TextPaint;

    .line 80
    .line 81
    invoke-virtual {p1, v0, p0, v1, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 82
    .line 83
    .line 84
    :cond_2
    :goto_2
    return-void
.end method

.method public final e()I
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/yo;->r:Ldefpackage/ap;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/ap;->b:Ldefpackage/zo;

    .line 4
    .line 5
    iget p0, p0, Ldefpackage/zo;->x:I

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    if-eq p0, v0, :cond_0

    .line 9
    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public final f()Z
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/yo;->r:Ldefpackage/ap;

    .line 2
    .line 3
    iget-object v0, v0, Ldefpackage/ap;->b:Ldefpackage/zo;

    .line 4
    .line 5
    iget-object v0, v0, Ldefpackage/zo;->w:Ljava/lang/String;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p0}, Ldefpackage/yo;->g()Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    if-eqz p0, :cond_1

    .line 15
    .line 16
    :goto_0
    const/4 p0, 0x1

    .line 17
    return p0

    .line 18
    :cond_1
    const/4 p0, 0x0

    .line 19
    return p0
.end method

.method public final g()Z
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/yo;->r:Ldefpackage/ap;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/ap;->b:Ldefpackage/zo;

    .line 4
    .line 5
    iget-object v0, p0, Ldefpackage/zo;->w:Ljava/lang/String;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget p0, p0, Ldefpackage/zo;->x:I

    .line 11
    .line 12
    const/4 v0, -0x1

    .line 13
    if-eq p0, v0, :cond_1

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method public final getAlpha()I
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/yo;->r:Ldefpackage/ap;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/ap;->b:Ldefpackage/zo;

    .line 4
    .line 5
    iget p0, p0, Ldefpackage/zo;->v:I

    .line 6
    .line 7
    return p0
.end method

.method public final getIntrinsicHeight()I
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/yo;->q:Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final getIntrinsicWidth()I
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/yo;->q:Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final getOpacity()I
    .locals 0

    .line 1
    const/4 p0, -0x3

    .line 2
    return p0
.end method

.method public final h()V
    .locals 4

    .line 1
    iget-object v0, p0, Ldefpackage/yo;->n:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/content/Context;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-virtual {p0}, Ldefpackage/yo;->f()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    iget-object v2, p0, Ldefpackage/yo;->r:Ldefpackage/ap;

    .line 17
    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    iget-object v1, v2, Ldefpackage/ap;->b:Ldefpackage/zo;

    .line 21
    .line 22
    iget-object v1, v1, Ldefpackage/zo;->t:Ljava/lang/Integer;

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    iget-object v1, v2, Ldefpackage/ap;->b:Ldefpackage/zo;

    .line 30
    .line 31
    iget-object v1, v1, Ldefpackage/zo;->r:Ljava/lang/Integer;

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    :goto_0
    invoke-virtual {p0}, Ldefpackage/yo;->f()Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_2

    .line 42
    .line 43
    iget-object v2, v2, Ldefpackage/ap;->b:Ldefpackage/zo;

    .line 44
    .line 45
    iget-object v2, v2, Ldefpackage/zo;->u:Ljava/lang/Integer;

    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    goto :goto_1

    .line 52
    :cond_2
    iget-object v2, v2, Ldefpackage/ap;->b:Ldefpackage/zo;

    .line 53
    .line 54
    iget-object v2, v2, Ldefpackage/zo;->s:Ljava/lang/Integer;

    .line 55
    .line 56
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    :goto_1
    invoke-static {v0, v1, v2}, Ldefpackage/bc4;->a(Landroid/content/Context;II)Ldefpackage/zc1;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v0}, Ldefpackage/zc1;->a()Ldefpackage/bc4;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iget-object v1, p0, Ldefpackage/yo;->o:Ldefpackage/fi2;

    .line 69
    .line 70
    invoke-virtual {v1, v0}, Ldefpackage/fi2;->setShapeAppearanceModel(Ldefpackage/bc4;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method public final i(Landroid/view/View;Landroid/widget/FrameLayout;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Ldefpackage/yo;->y:Ljava/lang/ref/WeakReference;

    .line 7
    .line 8
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 9
    .line 10
    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Ldefpackage/yo;->z:Ljava/lang/ref/WeakReference;

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Landroid/view/ViewGroup;

    .line 20
    .line 21
    const/4 p2, 0x0

    .line 22
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Ldefpackage/yo;->j()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final isStateful()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final j()V
    .locals 15

    .line 1
    iget-object v0, p0, Ldefpackage/yo;->n:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Landroid/content/Context;

    .line 8
    .line 9
    iget-object v2, p0, Ldefpackage/yo;->y:Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, Landroid/view/View;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object v2, v3

    .line 22
    :goto_0
    if-eqz v1, :cond_1e

    .line 23
    .line 24
    if-nez v2, :cond_1

    .line 25
    .line 26
    goto/16 :goto_13

    .line 27
    .line 28
    :cond_1
    new-instance v1, Landroid/graphics/Rect;

    .line 29
    .line 30
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 31
    .line 32
    .line 33
    iget-object v4, p0, Ldefpackage/yo;->q:Landroid/graphics/Rect;

    .line 34
    .line 35
    invoke-virtual {v1, v4}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 36
    .line 37
    .line 38
    new-instance v5, Landroid/graphics/Rect;

    .line 39
    .line 40
    invoke-direct {v5}, Landroid/graphics/Rect;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2, v5}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    .line 44
    .line 45
    .line 46
    iget-object v6, p0, Ldefpackage/yo;->z:Ljava/lang/ref/WeakReference;

    .line 47
    .line 48
    if-eqz v6, :cond_2

    .line 49
    .line 50
    invoke-virtual {v6}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    check-cast v3, Landroid/view/ViewGroup;

    .line 55
    .line 56
    :cond_2
    if-nez v3, :cond_3

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    invoke-virtual {v3, v2, v5}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 60
    .line 61
    .line 62
    :goto_1
    invoke-virtual {p0}, Ldefpackage/yo;->f()Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    iget-object v6, p0, Ldefpackage/yo;->r:Ldefpackage/ap;

    .line 67
    .line 68
    if-eqz v3, :cond_4

    .line 69
    .line 70
    iget v3, v6, Ldefpackage/ap;->d:F

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_4
    iget v3, v6, Ldefpackage/ap;->c:F

    .line 74
    .line 75
    :goto_2
    iput v3, p0, Ldefpackage/yo;->v:F

    .line 76
    .line 77
    const/high16 v7, -0x40800000    # -1.0f

    .line 78
    .line 79
    cmpl-float v8, v3, v7

    .line 80
    .line 81
    const/high16 v9, 0x40000000    # 2.0f

    .line 82
    .line 83
    if-eqz v8, :cond_5

    .line 84
    .line 85
    iput v3, p0, Ldefpackage/yo;->w:F

    .line 86
    .line 87
    iput v3, p0, Ldefpackage/yo;->x:F

    .line 88
    .line 89
    goto :goto_7

    .line 90
    :cond_5
    invoke-virtual {p0}, Ldefpackage/yo;->f()Z

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    if-eqz v3, :cond_6

    .line 95
    .line 96
    iget v3, v6, Ldefpackage/ap;->g:F

    .line 97
    .line 98
    :goto_3
    div-float/2addr v3, v9

    .line 99
    goto :goto_4

    .line 100
    :cond_6
    iget v3, v6, Ldefpackage/ap;->e:F

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :goto_4
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    int-to-float v3, v3

    .line 108
    iput v3, p0, Ldefpackage/yo;->w:F

    .line 109
    .line 110
    invoke-virtual {p0}, Ldefpackage/yo;->f()Z

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    if-eqz v3, :cond_7

    .line 115
    .line 116
    iget v3, v6, Ldefpackage/ap;->h:F

    .line 117
    .line 118
    :goto_5
    div-float/2addr v3, v9

    .line 119
    goto :goto_6

    .line 120
    :cond_7
    iget v3, v6, Ldefpackage/ap;->f:F

    .line 121
    .line 122
    goto :goto_5

    .line 123
    :goto_6
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    int-to-float v3, v3

    .line 128
    iput v3, p0, Ldefpackage/yo;->x:F

    .line 129
    .line 130
    :goto_7
    invoke-virtual {p0}, Ldefpackage/yo;->f()Z

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    if-eqz v3, :cond_9

    .line 135
    .line 136
    invoke-virtual {p0}, Ldefpackage/yo;->b()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    iget v8, p0, Ldefpackage/yo;->w:F

    .line 141
    .line 142
    iget-object v10, p0, Ldefpackage/yo;->p:Ldefpackage/xr4;

    .line 143
    .line 144
    invoke-virtual {v10, v3}, Ldefpackage/xr4;->a(Ljava/lang/String;)F

    .line 145
    .line 146
    .line 147
    move-result v11

    .line 148
    div-float/2addr v11, v9

    .line 149
    iget-object v12, v6, Ldefpackage/ap;->b:Ldefpackage/zo;

    .line 150
    .line 151
    iget-object v12, v12, Ldefpackage/zo;->H:Ljava/lang/Integer;

    .line 152
    .line 153
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 154
    .line 155
    .line 156
    move-result v12

    .line 157
    int-to-float v12, v12

    .line 158
    add-float/2addr v11, v12

    .line 159
    invoke-static {v8, v11}, Ljava/lang/Math;->max(FF)F

    .line 160
    .line 161
    .line 162
    move-result v8

    .line 163
    iput v8, p0, Ldefpackage/yo;->w:F

    .line 164
    .line 165
    iget v8, p0, Ldefpackage/yo;->x:F

    .line 166
    .line 167
    iget-boolean v11, v10, Ldefpackage/xr4;->e:Z

    .line 168
    .line 169
    if-nez v11, :cond_8

    .line 170
    .line 171
    goto :goto_8

    .line 172
    :cond_8
    invoke-virtual {v10, v3}, Ldefpackage/xr4;->b(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    :goto_8
    iget v3, v10, Ldefpackage/xr4;->d:F

    .line 176
    .line 177
    div-float/2addr v3, v9

    .line 178
    iget-object v9, v6, Ldefpackage/ap;->b:Ldefpackage/zo;

    .line 179
    .line 180
    iget-object v9, v9, Ldefpackage/zo;->I:Ljava/lang/Integer;

    .line 181
    .line 182
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 183
    .line 184
    .line 185
    move-result v9

    .line 186
    int-to-float v9, v9

    .line 187
    add-float/2addr v3, v9

    .line 188
    invoke-static {v8, v3}, Ljava/lang/Math;->max(FF)F

    .line 189
    .line 190
    .line 191
    move-result v3

    .line 192
    iput v3, p0, Ldefpackage/yo;->x:F

    .line 193
    .line 194
    iget v8, p0, Ldefpackage/yo;->w:F

    .line 195
    .line 196
    invoke-static {v8, v3}, Ljava/lang/Math;->max(FF)F

    .line 197
    .line 198
    .line 199
    move-result v3

    .line 200
    iput v3, p0, Ldefpackage/yo;->w:F

    .line 201
    .line 202
    :cond_9
    iget-object v3, v6, Ldefpackage/ap;->b:Ldefpackage/zo;

    .line 203
    .line 204
    iget-object v8, v6, Ldefpackage/ap;->b:Ldefpackage/zo;

    .line 205
    .line 206
    iget v9, v6, Ldefpackage/ap;->k:I

    .line 207
    .line 208
    iget-object v10, v3, Ldefpackage/zo;->K:Ljava/lang/Integer;

    .line 209
    .line 210
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 211
    .line 212
    .line 213
    move-result v10

    .line 214
    invoke-virtual {p0}, Ldefpackage/yo;->f()Z

    .line 215
    .line 216
    .line 217
    move-result v11

    .line 218
    const/4 v12, 0x0

    .line 219
    if-eqz v11, :cond_a

    .line 220
    .line 221
    iget-object v10, v3, Ldefpackage/zo;->M:Ljava/lang/Integer;

    .line 222
    .line 223
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 224
    .line 225
    .line 226
    move-result v10

    .line 227
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    check-cast v0, Landroid/content/Context;

    .line 232
    .line 233
    if-eqz v0, :cond_a

    .line 234
    .line 235
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    iget v0, v0, Landroid/content/res/Configuration;->fontScale:F

    .line 244
    .line 245
    const/high16 v11, 0x3f800000    # 1.0f

    .line 246
    .line 247
    sub-float/2addr v0, v11

    .line 248
    const v13, 0x3e99999a    # 0.3f

    .line 249
    .line 250
    .line 251
    invoke-static {v12, v11, v13, v11, v0}, Ldefpackage/yd;->b(FFFFF)F

    .line 252
    .line 253
    .line 254
    move-result v0

    .line 255
    iget-object v11, v3, Ldefpackage/zo;->P:Ljava/lang/Integer;

    .line 256
    .line 257
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 258
    .line 259
    .line 260
    move-result v11

    .line 261
    sub-int v11, v10, v11

    .line 262
    .line 263
    invoke-static {v10, v0, v11}, Ldefpackage/yd;->c(IFI)I

    .line 264
    .line 265
    .line 266
    move-result v10

    .line 267
    :cond_a
    if-nez v9, :cond_b

    .line 268
    .line 269
    iget v0, p0, Ldefpackage/yo;->x:F

    .line 270
    .line 271
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 272
    .line 273
    .line 274
    move-result v0

    .line 275
    sub-int/2addr v10, v0

    .line 276
    :cond_b
    iget-object v0, v3, Ldefpackage/zo;->O:Ljava/lang/Integer;

    .line 277
    .line 278
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 279
    .line 280
    .line 281
    move-result v0

    .line 282
    add-int/2addr v0, v10

    .line 283
    iget-object v10, v8, Ldefpackage/zo;->F:Ljava/lang/Integer;

    .line 284
    .line 285
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 286
    .line 287
    .line 288
    move-result v10

    .line 289
    const v11, 0x800053

    .line 290
    .line 291
    .line 292
    if-eq v10, v11, :cond_c

    .line 293
    .line 294
    const v13, 0x800055

    .line 295
    .line 296
    .line 297
    if-eq v10, v13, :cond_c

    .line 298
    .line 299
    iget v10, v5, Landroid/graphics/Rect;->top:I

    .line 300
    .line 301
    add-int/2addr v10, v0

    .line 302
    int-to-float v0, v10

    .line 303
    iput v0, p0, Ldefpackage/yo;->t:F

    .line 304
    .line 305
    goto :goto_9

    .line 306
    :cond_c
    iget v10, v5, Landroid/graphics/Rect;->bottom:I

    .line 307
    .line 308
    sub-int/2addr v10, v0

    .line 309
    int-to-float v0, v10

    .line 310
    iput v0, p0, Ldefpackage/yo;->t:F

    .line 311
    .line 312
    :goto_9
    invoke-virtual {p0}, Ldefpackage/yo;->f()Z

    .line 313
    .line 314
    .line 315
    move-result v0

    .line 316
    if-eqz v0, :cond_d

    .line 317
    .line 318
    iget-object v0, v3, Ldefpackage/zo;->L:Ljava/lang/Integer;

    .line 319
    .line 320
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 321
    .line 322
    .line 323
    move-result v0

    .line 324
    goto :goto_a

    .line 325
    :cond_d
    iget-object v0, v8, Ldefpackage/zo;->J:Ljava/lang/Integer;

    .line 326
    .line 327
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 328
    .line 329
    .line 330
    move-result v0

    .line 331
    :goto_a
    const/4 v10, 0x1

    .line 332
    if-ne v9, v10, :cond_f

    .line 333
    .line 334
    invoke-virtual {p0}, Ldefpackage/yo;->f()Z

    .line 335
    .line 336
    .line 337
    move-result v9

    .line 338
    if-eqz v9, :cond_e

    .line 339
    .line 340
    iget v6, v6, Ldefpackage/ap;->j:I

    .line 341
    .line 342
    goto :goto_b

    .line 343
    :cond_e
    iget v6, v6, Ldefpackage/ap;->i:I

    .line 344
    .line 345
    :goto_b
    add-int/2addr v0, v6

    .line 346
    :cond_f
    iget-object v6, v3, Ldefpackage/zo;->N:Ljava/lang/Integer;

    .line 347
    .line 348
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 349
    .line 350
    .line 351
    move-result v6

    .line 352
    add-int/2addr v6, v0

    .line 353
    iget-object v0, v8, Ldefpackage/zo;->F:Ljava/lang/Integer;

    .line 354
    .line 355
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 356
    .line 357
    .line 358
    move-result v0

    .line 359
    const v8, 0x800033

    .line 360
    .line 361
    .line 362
    if-eq v0, v8, :cond_11

    .line 363
    .line 364
    if-eq v0, v11, :cond_11

    .line 365
    .line 366
    sget-object v0, Ldefpackage/j65;->a:Ljava/util/WeakHashMap;

    .line 367
    .line 368
    invoke-virtual {v2}, Landroid/view/View;->getLayoutDirection()I

    .line 369
    .line 370
    .line 371
    move-result v0

    .line 372
    if-nez v0, :cond_10

    .line 373
    .line 374
    iget v0, v5, Landroid/graphics/Rect;->right:I

    .line 375
    .line 376
    int-to-float v0, v0

    .line 377
    iget v5, p0, Ldefpackage/yo;->w:F

    .line 378
    .line 379
    add-float/2addr v0, v5

    .line 380
    int-to-float v5, v6

    .line 381
    sub-float/2addr v0, v5

    .line 382
    goto :goto_c

    .line 383
    :cond_10
    iget v0, v5, Landroid/graphics/Rect;->left:I

    .line 384
    .line 385
    int-to-float v0, v0

    .line 386
    iget v5, p0, Ldefpackage/yo;->w:F

    .line 387
    .line 388
    sub-float/2addr v0, v5

    .line 389
    int-to-float v5, v6

    .line 390
    add-float/2addr v0, v5

    .line 391
    :goto_c
    iput v0, p0, Ldefpackage/yo;->s:F

    .line 392
    .line 393
    goto :goto_e

    .line 394
    :cond_11
    sget-object v0, Ldefpackage/j65;->a:Ljava/util/WeakHashMap;

    .line 395
    .line 396
    invoke-virtual {v2}, Landroid/view/View;->getLayoutDirection()I

    .line 397
    .line 398
    .line 399
    move-result v0

    .line 400
    if-nez v0, :cond_12

    .line 401
    .line 402
    iget v0, v5, Landroid/graphics/Rect;->left:I

    .line 403
    .line 404
    int-to-float v0, v0

    .line 405
    iget v5, p0, Ldefpackage/yo;->w:F

    .line 406
    .line 407
    sub-float/2addr v0, v5

    .line 408
    int-to-float v5, v6

    .line 409
    add-float/2addr v0, v5

    .line 410
    goto :goto_d

    .line 411
    :cond_12
    iget v0, v5, Landroid/graphics/Rect;->right:I

    .line 412
    .line 413
    int-to-float v0, v0

    .line 414
    iget v5, p0, Ldefpackage/yo;->w:F

    .line 415
    .line 416
    add-float/2addr v0, v5

    .line 417
    int-to-float v5, v6

    .line 418
    sub-float/2addr v0, v5

    .line 419
    :goto_d
    iput v0, p0, Ldefpackage/yo;->s:F

    .line 420
    .line 421
    :goto_e
    iget-object v0, v3, Ldefpackage/zo;->Q:Ljava/lang/Boolean;

    .line 422
    .line 423
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 424
    .line 425
    .line 426
    move-result v0

    .line 427
    if-eqz v0, :cond_1c

    .line 428
    .line 429
    invoke-virtual {p0}, Ldefpackage/yo;->d()Landroid/widget/FrameLayout;

    .line 430
    .line 431
    .line 432
    move-result-object v0

    .line 433
    if-nez v0, :cond_14

    .line 434
    .line 435
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 436
    .line 437
    .line 438
    move-result-object v0

    .line 439
    instance-of v0, v0, Landroid/view/View;

    .line 440
    .line 441
    if-nez v0, :cond_13

    .line 442
    .line 443
    goto/16 :goto_12

    .line 444
    .line 445
    :cond_13
    invoke-virtual {v2}, Landroid/view/View;->getY()F

    .line 446
    .line 447
    .line 448
    move-result v0

    .line 449
    invoke-virtual {v2}, Landroid/view/View;->getX()F

    .line 450
    .line 451
    .line 452
    move-result v3

    .line 453
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 454
    .line 455
    .line 456
    move-result-object v2

    .line 457
    check-cast v2, Landroid/view/View;

    .line 458
    .line 459
    move-object v14, v2

    .line 460
    move v2, v0

    .line 461
    move-object v0, v14

    .line 462
    goto :goto_f

    .line 463
    :cond_14
    invoke-virtual {p0}, Ldefpackage/yo;->d()Landroid/widget/FrameLayout;

    .line 464
    .line 465
    .line 466
    move-result-object v2

    .line 467
    if-eqz v2, :cond_16

    .line 468
    .line 469
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 470
    .line 471
    .line 472
    move-result v2

    .line 473
    const v3, 0x7f0a03e7

    .line 474
    .line 475
    .line 476
    if-ne v2, v3, :cond_16

    .line 477
    .line 478
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 479
    .line 480
    .line 481
    move-result-object v2

    .line 482
    instance-of v2, v2, Landroid/view/View;

    .line 483
    .line 484
    if-nez v2, :cond_15

    .line 485
    .line 486
    goto/16 :goto_12

    .line 487
    .line 488
    :cond_15
    invoke-virtual {v0}, Landroid/view/View;->getY()F

    .line 489
    .line 490
    .line 491
    move-result v2

    .line 492
    invoke-virtual {v0}, Landroid/view/View;->getX()F

    .line 493
    .line 494
    .line 495
    move-result v3

    .line 496
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 497
    .line 498
    .line 499
    move-result-object v0

    .line 500
    check-cast v0, Landroid/view/View;

    .line 501
    .line 502
    goto :goto_f

    .line 503
    :cond_16
    move v2, v12

    .line 504
    move v3, v2

    .line 505
    :goto_f
    iget v5, p0, Ldefpackage/yo;->t:F

    .line 506
    .line 507
    iget v6, p0, Ldefpackage/yo;->x:F

    .line 508
    .line 509
    sub-float/2addr v5, v6

    .line 510
    invoke-virtual {v0}, Landroid/view/View;->getY()F

    .line 511
    .line 512
    .line 513
    move-result v6

    .line 514
    add-float/2addr v6, v5

    .line 515
    add-float/2addr v6, v2

    .line 516
    iget v5, p0, Ldefpackage/yo;->s:F

    .line 517
    .line 518
    iget v8, p0, Ldefpackage/yo;->w:F

    .line 519
    .line 520
    sub-float/2addr v5, v8

    .line 521
    invoke-virtual {v0}, Landroid/view/View;->getX()F

    .line 522
    .line 523
    .line 524
    move-result v8

    .line 525
    add-float/2addr v8, v5

    .line 526
    add-float/2addr v8, v3

    .line 527
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 528
    .line 529
    .line 530
    move-result-object v5

    .line 531
    instance-of v5, v5, Landroid/view/View;

    .line 532
    .line 533
    if-eqz v5, :cond_17

    .line 534
    .line 535
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 536
    .line 537
    .line 538
    move-result-object v5

    .line 539
    check-cast v5, Landroid/view/View;

    .line 540
    .line 541
    iget v9, p0, Ldefpackage/yo;->t:F

    .line 542
    .line 543
    iget v10, p0, Ldefpackage/yo;->x:F

    .line 544
    .line 545
    add-float/2addr v9, v10

    .line 546
    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    .line 547
    .line 548
    .line 549
    move-result v5

    .line 550
    int-to-float v5, v5

    .line 551
    invoke-virtual {v0}, Landroid/view/View;->getY()F

    .line 552
    .line 553
    .line 554
    move-result v10

    .line 555
    sub-float/2addr v5, v10

    .line 556
    sub-float/2addr v9, v5

    .line 557
    add-float/2addr v9, v2

    .line 558
    goto :goto_10

    .line 559
    :cond_17
    move v9, v12

    .line 560
    :goto_10
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 561
    .line 562
    .line 563
    move-result-object v2

    .line 564
    instance-of v2, v2, Landroid/view/View;

    .line 565
    .line 566
    if-eqz v2, :cond_18

    .line 567
    .line 568
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 569
    .line 570
    .line 571
    move-result-object v2

    .line 572
    check-cast v2, Landroid/view/View;

    .line 573
    .line 574
    iget v5, p0, Ldefpackage/yo;->s:F

    .line 575
    .line 576
    iget v10, p0, Ldefpackage/yo;->w:F

    .line 577
    .line 578
    add-float/2addr v5, v10

    .line 579
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 580
    .line 581
    .line 582
    move-result v2

    .line 583
    int-to-float v2, v2

    .line 584
    invoke-virtual {v0}, Landroid/view/View;->getX()F

    .line 585
    .line 586
    .line 587
    move-result v0

    .line 588
    sub-float/2addr v2, v0

    .line 589
    sub-float/2addr v5, v2

    .line 590
    add-float/2addr v5, v3

    .line 591
    goto :goto_11

    .line 592
    :cond_18
    move v5, v12

    .line 593
    :goto_11
    cmpg-float v0, v6, v12

    .line 594
    .line 595
    if-gez v0, :cond_19

    .line 596
    .line 597
    iget v0, p0, Ldefpackage/yo;->t:F

    .line 598
    .line 599
    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    .line 600
    .line 601
    .line 602
    move-result v2

    .line 603
    add-float/2addr v2, v0

    .line 604
    iput v2, p0, Ldefpackage/yo;->t:F

    .line 605
    .line 606
    :cond_19
    cmpg-float v0, v8, v12

    .line 607
    .line 608
    if-gez v0, :cond_1a

    .line 609
    .line 610
    iget v0, p0, Ldefpackage/yo;->s:F

    .line 611
    .line 612
    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    .line 613
    .line 614
    .line 615
    move-result v2

    .line 616
    add-float/2addr v2, v0

    .line 617
    iput v2, p0, Ldefpackage/yo;->s:F

    .line 618
    .line 619
    :cond_1a
    cmpl-float v0, v9, v12

    .line 620
    .line 621
    if-lez v0, :cond_1b

    .line 622
    .line 623
    iget v0, p0, Ldefpackage/yo;->t:F

    .line 624
    .line 625
    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    .line 626
    .line 627
    .line 628
    move-result v2

    .line 629
    sub-float/2addr v0, v2

    .line 630
    iput v0, p0, Ldefpackage/yo;->t:F

    .line 631
    .line 632
    :cond_1b
    cmpl-float v0, v5, v12

    .line 633
    .line 634
    if-lez v0, :cond_1c

    .line 635
    .line 636
    iget v0, p0, Ldefpackage/yo;->s:F

    .line 637
    .line 638
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 639
    .line 640
    .line 641
    move-result v2

    .line 642
    sub-float/2addr v0, v2

    .line 643
    iput v0, p0, Ldefpackage/yo;->s:F

    .line 644
    .line 645
    :cond_1c
    :goto_12
    iget v0, p0, Ldefpackage/yo;->s:F

    .line 646
    .line 647
    iget v2, p0, Ldefpackage/yo;->t:F

    .line 648
    .line 649
    iget v3, p0, Ldefpackage/yo;->w:F

    .line 650
    .line 651
    iget v5, p0, Ldefpackage/yo;->x:F

    .line 652
    .line 653
    sub-float v6, v0, v3

    .line 654
    .line 655
    float-to-int v6, v6

    .line 656
    sub-float v8, v2, v5

    .line 657
    .line 658
    float-to-int v8, v8

    .line 659
    add-float/2addr v0, v3

    .line 660
    float-to-int v0, v0

    .line 661
    add-float/2addr v2, v5

    .line 662
    float-to-int v2, v2

    .line 663
    invoke-virtual {v4, v6, v8, v0, v2}, Landroid/graphics/Rect;->set(IIII)V

    .line 664
    .line 665
    .line 666
    iget v0, p0, Ldefpackage/yo;->v:F

    .line 667
    .line 668
    cmpl-float v2, v0, v7

    .line 669
    .line 670
    iget-object p0, p0, Ldefpackage/yo;->o:Ldefpackage/fi2;

    .line 671
    .line 672
    if-eqz v2, :cond_1d

    .line 673
    .line 674
    iget-object v2, p0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 675
    .line 676
    iget-object v2, v2, Ldefpackage/ei2;->a:Ldefpackage/bc4;

    .line 677
    .line 678
    invoke-virtual {v2}, Ldefpackage/bc4;->g()Ldefpackage/zc1;

    .line 679
    .line 680
    .line 681
    move-result-object v2

    .line 682
    invoke-virtual {v2, v0}, Ldefpackage/zc1;->b(F)V

    .line 683
    .line 684
    .line 685
    invoke-virtual {v2}, Ldefpackage/zc1;->a()Ldefpackage/bc4;

    .line 686
    .line 687
    .line 688
    move-result-object v0

    .line 689
    invoke-virtual {p0, v0}, Ldefpackage/fi2;->setShapeAppearanceModel(Ldefpackage/bc4;)V

    .line 690
    .line 691
    .line 692
    :cond_1d
    invoke-virtual {v1, v4}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    .line 693
    .line 694
    .line 695
    move-result v0

    .line 696
    if-nez v0, :cond_1e

    .line 697
    .line 698
    invoke-virtual {p0, v4}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 699
    .line 700
    .line 701
    :cond_1e
    :goto_13
    return-void
.end method

.method public final onStateChange([I)Z
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onStateChange([I)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final setAlpha(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/yo;->r:Ldefpackage/ap;

    .line 2
    .line 3
    iget-object v1, v0, Ldefpackage/ap;->a:Ldefpackage/zo;

    .line 4
    .line 5
    iput p1, v1, Ldefpackage/zo;->v:I

    .line 6
    .line 7
    iget-object v0, v0, Ldefpackage/ap;->b:Ldefpackage/zo;

    .line 8
    .line 9
    iput p1, v0, Ldefpackage/zo;->v:I

    .line 10
    .line 11
    iget-object p1, p0, Ldefpackage/yo;->p:Ldefpackage/xr4;

    .line 12
    .line 13
    iget-object p1, p1, Ldefpackage/xr4;->a:Landroid/text/TextPaint;

    .line 14
    .line 15
    invoke-virtual {p0}, Ldefpackage/yo;->getAlpha()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    .line 1
    return-void
.end method
